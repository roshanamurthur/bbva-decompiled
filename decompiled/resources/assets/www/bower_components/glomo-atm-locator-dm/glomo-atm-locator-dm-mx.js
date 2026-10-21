/* global GlomoAtmLocatorDmMixin */
class GlomoAtmLocatorDmMx extends Polymer.mixinBehaviors([ CellsBehaviors.i18nBehavior ], GlomoAtmLocatorDmMixin) {

  static get is() {
    return 'glomo-atm-locator-dm-mx';
  }

  static get properties() {
    return {
      /**
       * Disable check reminded from LocalStorage
       */
      disableCheckReminded: {
        type: Boolean,
        value: false
      },
      /**
       * Default string locale
       */
      noResultDefaultMessage: {
        type: String,
        value: 'cells-input-place-no-result'
      },
      /**
       * Id for the error modal on get pois
       */
      errorId: {
        type: String,
        value: 'error-on-get-atm-locator'
      },
      /**
       * User logged
       */
      isLogged: {
        type: Boolean,
        value: false
      },
      /**
       * User reminded
       */
      isReminded: {
        type: Boolean,
        value: false
      },
      /**
       * Poi selected from public zone
       */
      selectedPoi: {
        type: Object,
        value: () => ({})
      },
      /**
       * Max lines for snackbar
       */
      snackbarMaxLines: {
        type: Number,
        value: 0
      },
      /**
       * Text margins for snackbar
       */
      snackbarTextMargins: {
        type: Object,
        value: () => ({})
      },
      /**
       * Disable check is active turn
       */
      disableCheckActive: {
        type: Boolean,
        value: false
      },
      /**
       * The current intent of the user
       */
      intent: {
        type: String,
        value: ''
      },
      /**
       * Specifies if the calendar is enabled or not
       */
      fCalendarEnabled: {
        type: Boolean,
        value: false
      },
      /**
       * Name of the Feature Flag to search in the Feature Flag Collection
       */
      nameFeatureFlag: {
        type: String,
        value: ''
      },
      /**
       * Name of the Feature Flag Migration to search in the Feature Flag Collection
       */
      nameFlagMigration: {
        type: String,
        value: ''
      },
      /**
       * Specifies if the calendar is enabled or not
       */
      featureFlagMigration: {
        type: Boolean,
        value: false
      },
      /**
       * Specifies the page from navigation
       */
      pageAfterLogin: {
        type: String,
        value: 'requestBranchAppointment'
      },
      /**
       * Modal code for provider not available
       */
      informationNotAvailable: {
        type: String,
        value: 'information-not-available'
      },
      /**
       * New provider name
       */
      newDigitalProvider: {
        type: String,
        value: ''
      },
      /**
       * Old provider name
       */
      oldProvider: {
        type: String,
        value: 'SYMETRY'
      },
      /**
       * Name of the page of branch appointment
       */
      brachAppointmentPage: {
        type: String,
        value: 'branch-appointment'
      },
      /**
       * Name of the page of pois detail
       */
      poisDetailPage: {
        type: String,
        value: 'pois-detail'
      },
      acfVersion: {
        type: String,
        value: '1'
      }
    };
  }

  /**
   * GET /digital-appointments/v0/digital-appointments
   *
   * init method
   * @event success-on-get-appointments-list
   * @event error-on-get-appointments-list
   * @event atm-locator-show-digital-appointnments
   * @event atm-locator-header-title
   */
  init() {
    super.init();
    if (!this._userIsLogged() && this._hasDigitalAppointment()) {
      this._getFromLocalStorage('active_turn');
    }
  }

  /**
   * If user is logged then init component as usual, if not check if user is cached/saved in local Storage
   */
  start() {
    if (this._userIsLogged()) {
      this.init();
    } else if (!this.disableCheckReminded) {
      this.checkReminded();
    } else if (this.isReminded) {
      this.enableDigitalAppointment();
    } else {
      this.disableDigitalAppointment();
    }
  }

  /**
   * Check if user has active turn to show modal or navigate
   * @param {Object} ev event
   * @event request-branch-operations-data
   * @event active-turn-modal
   */
  checkActiveTurn(ev) {
    if (this.hasAppointmentsListError) {
      const code = this.notAvailableAppointmentCode;
      this._openModal(code);
    } else if (this.activeTurn) {
      const code = this.activeTurnModalCode;
      this._openModal(code);
      this._fireEvent('active-turn-modal');
    } else if (this.featureFlagMigration) {
      this._fireEvent('request-branch-operations-data', { ...ev, ...{ page: this.brachAppointmentPage } });
    } else {
      const poi = this.get('info', ev);
      this._navigateToRequestBranchAppointment(poi);
    }
  }


  /**
   * Evaluate the correct form of the request according to the provider
   * @param {*} poiWithProvider
  */
  branchOptions(poiWithProvider) {
    const provider = this.get('info.provider', poiWithProvider);
    const currentPage = this.get('page', poiWithProvider);
    if (provider === this.newDigitalProvider || !provider) {
      this.showBranchDialog(this.informationNotAvailable);
    } else if (currentPage === this.brachAppointmentPage) {
      this._navigateToRequestBranchAppointment(poiWithProvider.info);
    } else if (currentPage === this.poisDetailPage) {
      this.navigateToPoisDetail(poiWithProvider);
    } else {
      this.showBranchDialog(this.informationNotAvailable);
    }
  }


  /**
   * Opens modal to show info
   * @param {String} code
   * @event 'atm-locator-open-modal-with-settings'
   */
  showBranchDialog(code) {
    this._fireEvent('atm-locator-open-modal-with-settings', {
      code: code,
      selectedConfig: {
        openMaximized: true,
        iconOnlyFullHeight: true,
        heroImage: './images/general_error.svg',
        acceptBtLabel: 'glomo-' + code + '-accept-button',
        className: 'error',
        template: {
          type: 'paragraphs',
          values: [
            { title: 'glomo-' + code + '-title' },
            { text: 'glomo-' + code + '-message' }
          ]
        }
      }
    });
  }

  /**
   * Check status of reminded in local storage
   * @event get-from-local-storage
   */
  checkReminded() {
    this._getFromLocalStorage('reminded');
  }

  /**
   * Show all digital appointment buttons
   * @param {String} reminded
   * @event show-digital-appointnments
   */
  enableDigitalAppointment(reminded) {
    const isReminded = typeof reminded === 'string' && JSON.parse(reminded.replace(/'|"/g, ''));
    const showDigitalAppointment = typeof isReminded === 'boolean' && isReminded || this.isReminded;
    this._fireEvent('show-digital-appointnments', showDigitalAppointment);
    this.init();
  }

  /**
   * Hide all digital appointment buttons
   * @event show-digital-appointnments
   */
  disableDigitalAppointment() {
    this._fireEvent('show-digital-appointnments', false);
    this.init();
  }

  /**
   * Fire events to reset components and navigate to previous page
   * @event atm-locator-reset
   * @event atm-locator-navigate-to-previous-page
   */
  exitAtmLocator() {
    this._fireEvent('atm-locator-reset', true);
    this._fireEvent('atm-locator-navigate-to-previous-page', true);
  }

  /**
   * Sets the active turn
   * @param {string} payload - containing the information about the active turn in JSON format.
   */
  setActiveTurn(payload) {
    this.activeTurn = Number(JSON.parse(payload));
  }

  /**
   * Show snackbar for message of at least one option must be active
   */
  showInfoLastItemChecked() {
    this._showInfo('glomo-atm-locator-last-item-checked');
  }

  /**
   * Show snackbar when without results
   * @event glomo-atm-locator-without-results
   */
  showInfoWithoutResults() {
    this._showInfo('glomo-atm-locator-without-results');
  }

  /**
   * Shows a snackBar view
   * @param {String} message
   * @event show-message-snackbar
   */
  _showInfo(message) {
    const { top: topText = 24, bottom = 24, right = 16, left = 16 } = this.snackbarTextMargins;
    this._fireEvent('show-message-snackbar', {
      'id': 1,
      'message': this.t(message),
      'toastType': 'TOAST_BLUE',
      'length': 'LENGTH_LONG',
      'duration': 3000,
      'backgroundColor': '#1464A5',
      'textAlignment': 1,
      'textColor': '#FFFFFF',
      'textSize': 15.0,
      'maxLines': this.snackbarMaxLines,
      'position': 'bottom',
      'textMargins': {
        'top': topText,
        'bottom': bottom,
        'right': right,
        'left': left
      }
    });
  }

  /**
   * Set and fire location permissions modal
   * @event atm-locator-open-modal-with-settings
   */
  showSettingsDialog() {
    const code = 'LOCATION-PERMISSION';
    this._fireEvent('atm-locator-open-modal-with-settings', {
      code: code,
      selectedConfig: {
        className: 'info',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: `alert-${code}-accept`,
        cancelBtLabel: `alert-${code}-cancel`,
        template: {
          type: 'paragraphs',
          values: [
            { icon: 'coronita:info', iconClass: 'icon-size-24 light-blue', class: 'error' },
            { title: `alert-${code}-title` },
            { text: `alert-${code}-text` }
          ]
        }
      }
    });
  }

  /**
   * Navigates to the POI's detail page with the given parameters.
   * @param {Object} params - The parameters to be passed to the POI's detail page.
   * @event request-branch-operations-data
   */
  navigateToPoisDetail(params) {
    if (this.get('type', params) === 'branch' && !this.get('info.provider', params) && this.featureFlagMigration) {
      params = { ...params, ...{ page: this.poisDetailPage } };
      this._fireEvent('request-branch-operations-data', params);
    } else {
      this._navigateTo({ page: 'pois-detail', params });
    }
  }

  /**
   * Navigates to the success page for requesting a branch appointment and fires a corresponding event.
   */
  navigateToRequestBranchAppointmentSuccess() {
    this._navigateTo({ page: 'request-branch-appointment-success', isLogged: true });
  }

  /**
   * Open native settings
   * @event open-native-settings
   */
  openNativeSettings() {
    this._fireEvent('open-native-settings', { setting: 'application_settings' });
  }

  /**
   * Show half modal for error on get pois
   * @event send-${this.errorId}
   */
  showErrorOnGetPois() {
    this._fireEvent(`send-${this.errorId}`, {
      retryErrorData: {
        errorId: this.errorId,
        errorType: 'otherNotClasifiedErrors'
      }
    });
  }

  /**
   * Dispatch event to set property and string locale
   * @event show-message-no-result
   * @event set-locale-no-result-modal
   */
  showNoResultMessage() {
    this._fireEvent('show-message-no-result', {
      showMessage: true
    });
    this._fireEvent('set-locale-no-result-modal', 'cells-input-place-input-no-result');
  }

  /**
   * Send noResultDefaultMessage property
   * @event set-locale-no-result-modal
   */
  hideNoResultMessage() {
    this._fireEvent('set-locale-no-result-modal', this.noResultDefaultMessage);
  }

  /**
   * Fires event to get public GT
   * @event get-gt-public
   */
  getGtPublic() {
    this._fireEvent('get-gt-public', this.consumerIdAnonymous);
  }


  getDigitalAppointmentSuccess(ev) {
    const digitalAppointmentMaximumLimit = ev.find(item => item.digitalAppointmentMaximumLimit)?.digitalAppointmentMaximumLimit || null;
    const id = ev.find(item => item.id)?.id || null;
    const transformedData = {
      detail: [
        {
          digitalAppointments: ev.map(({digitalAppointmentMaximumLimit: limit, ...rest}) => rest),
          digitalAppointmentMaximumLimit: digitalAppointmentMaximumLimit
        }
      ]
    };
    this._setLocalStorage('list_active_turn', JSON.stringify({id, version: this.acfVersion}));
    this._hasActiveTurn(transformedData);
  }


  /**
   * Stores active digital appointment
   * @event 'branch-appointment-list'
   * @param {Object} ev event
   */
  _hasActiveTurn(ev) {
    let activeDigitalAppointments = [];
    if (this._isBranchListInitialized) {
      this._fireEvent('close-control-veil');
    }
    this.activeTurn = false;
    this.turns = [];
    if (this.get('detail', ev)) {
      this.hasAppointmentsListError = false;
      this.set('turns', this.get('detail', ev));
      activeDigitalAppointments = this._getActiveDigitalAppointments();
      this.activeTurn = this.get('length', this.disableCheckActive ? this.turns : activeDigitalAppointments);
    }
    this._setLocalStorage('active_turn', JSON.stringify(this.activeTurn));
    if (this.activeTurn) {
      const digitalAppointment = activeDigitalAppointments.shift();
      if (digitalAppointment) {
        this.set('digitalAppointment', digitalAppointment);
      }
    }
    if (this.get('length', this.turns)) {
      this._fireEvent('branch-appointment-list', {
        requestBranchAppointmentList: this.turns
      });
    }
    if (!this.activeTurn && !this.get('length', this.turns)) {
      this._fireEvent('get-appointment-digital-appointments');
    }
    this._handleAppointmentIntent();
  }

  /**
   * Handle appointment intent
   * @private
   */
  _handleAppointmentIntent() {
    const branchAppointmentFunctions = {
      'request-branch-appointment': this._requestBranchAppointment,
      'request-branch-appointment-success': this.navigateToRequestBranchAppointmentSuccess
    };

    const appointmentFunction = this.get(this.intent, branchAppointmentFunctions);
    if (appointmentFunction) {
      this.intent = '';
      const boundAppointmentFunction = appointmentFunction.bind(this);
      boundAppointmentFunction();
    }
  }

  /**
   * Opens modal to show info
   * @param {String} code
   * @event 'atm-locator-open-modal-with-settings'
   */
  _openModal(code) {
    let activeTurnModal = (code === this.activeTurnModalCode);
    let notAvailableAppointmentsModal = (code === this.notAvailableAppointmentCode);
    this._fireEvent('atm-locator-open-modal-with-settings', {
      code: code,
      selectedConfig: {
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'glomo-' + code + '-accept-button',
        cancelBtLabel: activeTurnModal ? 'glomo-' + code + '-cancel-button' : '',
        className: notAvailableAppointmentsModal ? 'error' : 'info',
        template: {
          type: 'paragraphs',
          values: [
            { icon: notAvailableAppointmentsModal ? 'coronita:alert' : 'coronita:info' },
            { type: notAvailableAppointmentsModal ? 'alert' : 'info' },
            { title: 'glomo-' + code + '-title' },
            { text: 'glomo-' + code + '-message' }
          ]
        }
      }
    });
  }

  /**
   * Request branch appointment
   * @private
   */
  _requestBranchAppointment() {
    if (this.selectedPoi && Object.keys(this.selectedPoi).length) {
      const poi = {
        info: { ...this.selectedPoi }
      };
      this.set('selectedPoi', {});
      this.checkActiveTurn(poi);
    }
  }

  /**
   * Get active digital appointments
   * @returns {Array}
   */
  _getActiveDigitalAppointments() {
    return this.turns.reduce((acc, turn) => {
      const digitalAppointments = this.get('digitalAppointments', turn);
      const isActive = digitalAppointments && digitalAppointments.find(item => item.isActive);
      if (isActive) {
        acc.push(isActive);
      }
      return acc;
    }, []);
  }

  /**
   * Return if digital appointments must be actives
   */
  _hasDigitalAppointment() {
    return this._userIsLogged() || this.isReminded;
  }

  /**
   * Navigates to the given page with the given parameters and logs if the user is logged in.
   * @param {Object} options - The options object.
   * @param {string} options.page - The name of the page to navigate to.
   * @param {Object} options.params - The parameters to be passed to the page.
   * @param {boolean} options.isLogged - True if the user is logged in, false otherwise.
   */
  _navigateTo({ page: currentPage, params, isLogged }) {
    this._fireEvent(`atm-locator-navigate-to-page${isLogged ? '-is-logged' : ''}`, { page: currentPage, ...params && { params } });
  }

  /**
   * Navigate to requestBranchAppointment
   * @event 'navigation-to-request-branch-appointment'
   * @param {Object} selectedPoi
   */
  _navigateToRequestBranchAppointment(selectedPoi) {
    const params = {
      fCalendarEnabled: this.fCalendarEnabled,
      pageAfterLogin: this.pageAfterLogin,
      selectedPoi
    };
    this._fireEvent('navigation-to-request-branch-appointment', params);
    this._navigateTo({ page: 'request-branch-appointment', params, isLogged: true });
  }

  /**
   * Returns true when user is logged
   */
  _userIsLogged() {
    return super._userIsLogged() || this.isLogged;
  }

  /**
   * @description Send the poi selected data
   * @event return-branch-selected-data
   */
  returnBranchData(data) {
    const parseFlag = !!this.get('info.related', data);
    let parsedData = {};
    if (parseFlag) {
      parsedData = {
        id: this.get('info.related.0.id', data),
        description: this.get('main', data),
        secondary: String(this.get('info.address.addressName', data) + ', ' + this.get('info.address.geographicGroups.0.name', data) + ', ' + this.get('info.address.zipCode', data) + ', ' + this.get('info.address.city', data) + ', ' + this.get('info.address.state.name', data) + ', ' + this.get('info.address.country.name', data))
      };
    } else {
      parsedData = data;
    }
    this._fireEvent('return-branch-selected-data', parsedData);
  }

  /**
   * Dispatches event to set item in localStorage
   */
  _setLocalStorage(key, value) {
    this._fireEvent('set-in-local-storage', { key, value });
  }

  /**
   * Dispatches event to require a value from localStorage
   */
  _getFromLocalStorage(key) {
    this._fireEvent('get-from-local-storage', { key });
  }

  /**
   * @description Dispatch events with the feature flag selected
   * @param {object} featureFlags
   * @event value-feature-flag-
   * @event feature-flag-list-branches-service-version
   */
  featureFlagCollection(featureFlags) {
    const featureFlagValue = featureFlags[this.nameFeatureFlag] ? featureFlags[this.nameFeatureFlag].value : false;
    this.featureFlagMigration = featureFlags[this.nameFlagMigration] ? featureFlags[this.nameFlagMigration].value : false;
    const eventName = this.nameFeatureFlag.replaceAll('.', '-');
    this._fireEvent(`value-feature-flag-${eventName}`, featureFlagValue);
    this._fireEvent('feature-flag-list-branches-service-version', Number(!featureFlagValue));
  }

  /**
   * @description Dispatch event with version of listBranches
   * @param {boolean} openWebFlagValue
   * @event open-web-list-branches-service-version
   */
  handleListBranchesVersion(openWebFlagValue) {
    this._fireEvent('open-web-list-branches-service-version', Number(!openWebFlagValue));
  }

}

window.customElements.define(GlomoAtmLocatorDmMx.is, GlomoAtmLocatorDmMx);
