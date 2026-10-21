class GlomoShortcutManager extends Polymer.Element {
  static get is() {
    return 'glomo-shortcut-manager';
  }

  static get properties() {
    return {
      /**
       * Indicates if user is in private (logged) or public zone
       * @type {Object}
       */
      isLogged: {
        type: Boolean
      },
      /**
       * continue param
       * @type {String}
       */
      continue: {
        type: String,
        value: 'dashboard',
        notify: true
      },
      /**
       * Shortcut configuration from appSettings
       * @type {Array}
       */
      shortcutConfiguration: {
        type: Array
      },
      /**
       * App version code
       * @type {String}
       */
      appVersion: {
        type: String
      },
      /**
       * App platform - iOS or Android
       * @type {String}
       */
      platform: {
        type: String
      },
      /**
       * Selected shortcut configurations (min and max versions, params, etc.)
       * @type {Object}
       */
      selectedShortcut: {
        type: Object
      },
      /**
       * Flags for fetched products
       * @type {Object}
       */
      fetchedProducts: {
        type: Object
      },
      /**
       * @type {String}
       * @description biometric code
       */
      biometricCode: {
        type: String,
        value: ''
      },
      /**
       * @type {Object}
       * @description collection of feature flags
       */
      flagCollection: {
        type: Object,
        value: () => ({})
      },
      /**
       * @type {Array}
       * @description biometric code array
       */
      biometricCodeArray: {
        type: Array,
        value: () => ['000', '004']
      },
      /**
       * @type {String}
       * @description Key to get the value of the feature flag
       */
      keyFeatureFlagFacialEnrollment: {
        type: String,
        value: 'glomo.inApps.facialEnrollment'
      },
      /**
       * @type {String}
       * @description Key for the feature flag that enables or disables the facial recognition update.
       */
      keyFeatureFlagFacialUpdate: {
        type: String,
        value: 'glomo.inApps.facialUpdate'
      },
      /**
       * @type {Boolean}
       * @description Flag to interrupt the navigation to await the biometric code
       */
      interruptToAwaitStorage: {
        type: Boolean,
        value: false
      },
      /**
       * @type {Object}
       * @description Custom navigation data to be dispatched
       */
      _customNavigationData: {
        type: Object,
        value: () => ({})
      },
      /**
       * @type {String}
       * @description Key to get the biometric code from the storage
       */
      biometricStorageKey: {
        type: String,
        value: 'accessBiometricStorage'
      },
      /**
       * @type {String}
       * @description Page to skip biometric request
       */
      pageToSkipBiometricRequest: {
        type: String,
        value: ''
      }
    };
  }

  connectedCallback() {
    super.connectedCallback();
    this.$.localStorage.addEventListener(`local-storage-get-${this.biometricStorageKey}-success`, e => this._handleBiometricFromStorage(e));
  }

  /****************************************************************************************************/
  /****************************************** COMMON METHODS ******************************************/
  /****************************************************************************************************/

  /**
   * Get app version code
   */
  setAppVersion(appVersion) {
    this.appVersion = appVersion.versionCode;
  }

  /**
   * Returns the shortcut configuration filtered by app version
   * @returns {Array}
   */
  _getShortcutFilteredByAppVersion() {
    return this.shortcutConfiguration && this.shortcutConfiguration.filter((config) => {
      const maxVersion = config.maxVersion && config.maxVersion[this.platform];
      const minVersion = config.minVersion && config.minVersion[this.platform];

      return this._compareVersions(minVersion, maxVersion);
    });
  }

  _compareVersions(minVersion, maxVersion) {
    return typeof(this.appVersion) === 'number' ?
      this.appVersion >= minVersion && this.appVersion <= maxVersion :
      this._compareStringVersions(minVersion) >= 0 //appVersion is greater or equal to minVersion
      && this._compareStringVersions(maxVersion) <= 0; //maxVersion is greater or equal to appVersion
  }

  /**
   * Compares string versions using String.localeCompare and returns number
   * @param {String} version
   * @returns {Number}
   * 0: versions are equal
   * 1: appVersion is greater than version
   * -1: version is greater than appVersion
   */
  _compareStringVersions(version) {
    return this.appVersion.localeCompare(version, undefined, { numeric: true, sensitivity: 'base' });
  }

  /**
   * Set shortcut configuration from app settings
   */
  setShortcutConfiguration({shortcutConfiguration}) {
    this.set('shortcutConfiguration', shortcutConfiguration);
  }

  /**
   * Manage custom navigation from selected shortcut params
   */
  manageSelectedShortcut(shortcut = {}) {
    // Get Config from appSettings
    const selectedConfig = ((this._getShortcutFilteredByAppVersion() || []).find(config => config.key === shortcut.action) || {}).value;
    const selectedShortcut = {...selectedConfig, ...shortcut};

    this._dispatchEvent('send-selected-shortcut', selectedShortcut);

    if (!selectedConfig) { // If config is not in appSettings, go to dashboard
      return this.dispatchNavigation({page: 'dashboard'});
    }

    this.set('selectedShortcut', selectedShortcut);

    if (selectedShortcut.notificationAsParam) {
      // Add original shortcut info as params
      selectedShortcut.params = shortcut;
    }

    // Extract extra to solve navigations waiting for the parameter
    if (selectedShortcut.localArgs?.extra) {
      selectedShortcut.localArgs = {
        ...this._decodeExtraParameter(selectedShortcut.localArgs.extra),
        ...selectedShortcut.localArgs,
      };
    }

    // Send event to product-checker-dm if product is needed
    if (selectedShortcut.product) {
      // Old version of deepLinks - Technical Debt - Should be changed to new format
      this._manageOldFormatShortcut();
    } else if (selectedShortcut.products) {
      // New version of deepLinks
      this._manageNewFormatShortcut();
    } else {
      // Go to destination page with config params
      this._sendCustomNavigation(selectedShortcut.destination, selectedShortcut.params, selectedShortcut.localArgs, selectedShortcut.action);
    }
  }

  _decodeExtraParameter(extra) {
    try {
      return JSON.parse(window.atob(extra));
    } catch {
      return {};
    }
  }

  _sendCustomNavigation(page, params, localArgs = {}, action) {
    this.addPageNavStack();
    this._customNavigationData = {
      page,
      ...(params && {filter: params}),
      ...localArgs,
      ...{action}
    };
    this.interruptToAwaitStorage = page === this.pageToSkipBiometricRequest ? false : this.interruptToAwaitStorage;
    if (this.interruptToAwaitStorage) {
      this.requestBiometricFromStorage();
    } else {
      this.dispatchNavigation(this._customNavigationData);
    }
  }

  /**
   * Method to update navigation stack
   * @public
   */
  addPageNavStack() { // Set initial page
    const dashboardNavigation = {
      page: this.isLogged ? 'dashboard' : '/',
      params: {},
      replace: false
    };
    this._setNavigationStack(dashboardNavigation);
  }

  _setNavigationStack(...newNavigationItems) {
    //Clean nav Stack
    /* eslint-disable no-undef */
    let navStack = cells.Router.navigationStack.navStack;
    navStack.splice(1, navStack.length);
    return navStack.push(...newNavigationItems);
  }

  /**
   * Request biometric code from local storage
   */
  requestBiometricFromStorage() {
    this.$.localStorage.get({
      key: this.biometricStorageKey,
      secure: true
    });
  }

  /**
   * Handler when success response from local storage
   * @param {Object} event
   */
  _handleBiometricFromStorage(event = {}) {
    this.biometricCode = event.detail?.statusBiometric;
    this.dispatchNavigation(this._customNavigationData);
  }

  /**
   * Dispatch custom navigation with optional params
   */
  dispatchNavigation(detail) {
    if (this._validateBiometricBlocked()) {
      return;
    }
    this._dispatchEvent('navigate-from-deep-link', {
      ...detail,
      ...this.selectedShortcut?.localArgs
    });
  }

  _dispatchEvent(event, detail) {
    this.dispatchEvent(
      new CustomEvent(event, {
        detail,
        bubbles: true,
        composed: true
      })
    );
  }

  /****************************************************************************************************/
  /****************************************** NEW DEEP LINKS ******************************************/
  /****************************************************************************************************/

  _manageNewFormatShortcut() {
    // Notify product checker dm
    this._dispatchEvent('glomo-shortcut-manager-send-original-product', true);

    this._getProducts(this.selectedShortcut.products);
    this._initFetchedProducts();
  }

  _getProducts(products) {
    products.forEach((product) => this._dispatchEvent(`get-${product}`));
  }

  _initFetchedProducts() {
    this.set('fetchedProducts',
      this.selectedShortcut.products.reduce((acc, curr) => (acc[curr] = false, acc), {}));
  }

  /**
   * Receive information from product checker dm and update fetchedProducts
   * or navigate if all products have been fetched
   */
  setFetchedProduct({product, error}) {
    if (error) {
      if (!this._validateBiometricBlocked()) {
        this._dispatchEvent('glomo-shortcut-manager-get-product-error');
      }
      return;
    }
    this.set(`fetchedProducts.${product}`, true);
    this._checkAllProductsFetched();
  }

  _checkAllProductsFetched() {
    const allProductFetched = Object.values(this.fetchedProducts).every(fetched => fetched);
    if (allProductFetched) {
      // Go to destination page with config params
      this._sendCustomNavigation(this.selectedShortcut.destination, this.selectedShortcut.params, this.selectedShortcut.localArgs, this.selectedShortcut.action);
    }
  }

  /****************************************************************************************************/
  /****************************************** OLD DEEP LINKS ******************************************/
  /****************************************************************************************************/

  _manageOldFormatShortcut() {
    const {destination, altDestination, product, params} = this.selectedShortcut;

    // Notify product checker dm
    this._dispatchEvent('glomo-shortcut-manager-send-original-product', false);

    this.addPageNavStack();
    this._dispatchEvent(`get-${product}`, {
      destination,
      ...altDestination ? {altDestination} : {},
      params
    });
  }

  /****************************************************************************************************/
  /*************************************** VALIDATION BIOMETRICS **************************************/
  /****************************************************************************************************/

  /**
   * @description set Status for listBiometrics
   */
  setBiometricsCode(code) {
    this.biometricCode = code;
  }

  /**
   * This method is used to get the collection of feature flags.
   * @param {Object} featureFlagCollection - The collection of feature flags. Each key is the name of a feature flag and its value is an object containing the value of the flag.
   */
  getFeatureFlags(featureFlagCollection) {
    this.flagCollection = featureFlagCollection ?? {};
  }

  /**
   * Validates if the status returned by the listBiometrics is 000 or 004
   * to block and inhibit the use of the Dashboard
   * @event 'dashboard-facial-recognition'
   * @returns {boolean} - Returns false if the biometric code is '000' or '004', otherwise returns true.
   */
  _validateBiometricBlocked() {
    const facialEnrollmentFlag = this.flagCollection[this.keyFeatureFlagFacialEnrollment]?.value ?? true;
    const facialUpdateFlag = this.flagCollection[this.keyFeatureFlagFacialUpdate]?.value ?? true;
    const isEnrollment = !facialEnrollmentFlag && this.biometricCode === '000';
    const isUpdate = !facialUpdateFlag && this.biometricCode === '004';
    if (isEnrollment || isUpdate) {
      return false;
    }
    const isBlocked = this.biometricCodeArray.includes(this.biometricCode);
    if (isBlocked) {
      this._dispatchEvent('dashboard-facial-recognition');
    }
    return isBlocked;
  }

  /**
   * Reset biometric code and custom navigation data
   */
  reset() {
    this._customNavigationData = {};
    this.biometricCode = '';
  }
}

customElements.define(GlomoShortcutManager.is, GlomoShortcutManager);
