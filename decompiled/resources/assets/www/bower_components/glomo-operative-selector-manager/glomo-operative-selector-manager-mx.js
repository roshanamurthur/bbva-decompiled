/* global GlomoOperativeSelectorManagerMixin */

class GlomoOperativeSelectorManagerMx extends GlomoOperativeSelectorManagerMixin {


  static get is() {
    return 'glomo-operative-selector-manager-mx';
  }

  static get properties() {
    return {
      /**
       * Settings from app-settings
       */
      appSettingsData: {
        type: Object,
        value: () => ({})
      },
      /**
       * minor application configuration data
       * @type {Object}
       */
      appSettingsDataMinior: {
        type: Object,
        value: () => ({})
      },
      /**
       * Settings from _operationals page
       */
      appSettingsDataOperationals: {
        type: Object,
        value: () => ({})
      },
      /**
       * Minor operational data configuration
       * @type {Object}
       */
      appSettingsDataOperationalsMinior: {
        type: Object,
        value: () => ({})
      },
      /**
       * Relationship between the name of the operation and its icon
       */
      operationalsIcons: {
        type: Object,
        value: () => ({})
      },
      /**
       * Relationship between the name of the operation and the file name of the page
       */
      operationalsPage: {
        type: Object,
        value: () => ({})
      },
      /**
       * Array with account contracts
       */
      accounts: {
        type: Array,
        value: () => [],
        computed: '_getOriginalProducts(accountsContracts)'
      },
      /**
       * Array with card contracts
       */
      cards: {
        type: Array,
        value: () => [],
        computed: '_getOriginalProducts(cardsContracts)'
      },
      /**
       * Financial overview account contracts
       */
      accountsContracts: {
        type: Array,
        value: () => []
      },
      /**
       * Financial overview cards contracts
       */
      cardsContracts: {
        type: Array,
        value: () => []
      },
      /**
       * Flags to evaluate conditions for operationals
       */
      conditionsForOperational: {
        type: Object,
        value: () => ({})
      },

      _internationalTransfersAccounts: {
        type: Array,
        value: () => []
      },
      /**
       * Flag to identify if the app is in stand in mode
       * @type {Boolean}
       */
      standInMode: {
        type: Boolean,
        value: false
      },
      /**
      * Enable some operations when the app is in
      * Stand In mode
      * @type {Array}
      */
      excludeOperationsFromStandIn: {
        type: Array,
        value: () => [ 'transfer' ]
      },
      /**
       * Flag to evualuate if user is openpay
       */
      _isOpenPayUser: {
        type: Boolean,
        value: () => false,
        observer: 'sendOperationalsData'
      },
      /**
       * Flag to minior account
       * @type {Boolean}
       */
      isGlomoMiniorAccount: {
        type: Boolean,
        value: false
      },
      /**
       * Saves all feature flags
       * @type {Object}
       */
      featureFlagCollection: {
        type: Object,
        value: () => ({})
      },
      /**
       * Frequent operations flag name
       * @type {String}
       */
      frequentOperationsFlagKey: {
        type: String,
        value: 'glomo.dashboard.frequent.operations'
      },
      /**
       * Status of frequent operation flag
       * @type {Object}
       */
      frequentOperationsValidation: {
        type: Object,
        value: () => ({})
      },
      /**
       * Number of vaforite items to display
       * @type {Number}
       */
      favoriteItemsNumber: {
        type: Number,
        value: 3
      },
      /**
       * Feature flags names for available operations in stand in
       * @type {Object}
       */
      standInFeatureFlags: {
        type: Object,
        value: () => ({
          transfer: 'glomo.standin.movements.always.on'
        })
      },
      /**
      * Indicates the name of the project name.
      * @type {Boolean}
      */
      projectNameGlomo: {
        type: String,
        value: ''
      },
      /**
       * Indicates the name of the project name in standin mode.
       * @type {Boolean}
       */
      projectNameGlomoAlwaysOn: {
        type: String,
        value: ''
      },
      /**
       * Manage to show or hide Dimo and Transfer feature (their value comes from dashboard manager)
       * @type {Boolean}
       */
      dimoTransferFeature: {
        type: Boolean,
        value: false
      }
    };
  }

  /**
   * Get the parsed data from the financial overview of glomo-cached-product-dm
   * @param {Array} modules
   * @returns {Array}
   */
  _getOriginalProducts(modules) {
    const products = [];
    if (Array.isArray(modules)) {
      modules.forEach((module) => {
        products.push(...module.products);
      });
    }
    let originalProducts = products.map(product => {
      const {originalProduct, level = ''} = product;
      return {
        ...originalProduct,
        level
      };
    });
    return originalProducts;
  }

  /**
  * Launchs the event to start the transfers
  * @param {String} section
  * @param {Object} data
  * @event 'app-click-start-transfers'
  */
  _onClickStartTransfers(section, data = {}) {
    const pagePageInfoProjectName = this.standInMode ? this.get('projectNameGlomoAlwaysOn') : this.get('projectNameGlomo');
    this.dispatchEvent(new CustomEvent(`app-click-start-transfers${section}`, {
      detail: {
        pagePageInfoProjectName,
        ...data
      },
      bubbles: true,
      composed: true
    }));
  }

  /**
   * Launchs the event to start the transfers from operationals
   * @param {Object} data
   */
  onClickStartOperationalsTransfer(data) {
    this._onClickStartTransfers('-operationals-section', data);
  }

  /**
   * Launchs the event to start the transfers from favorites
   * @param {Object} data
   */
  onClickStartFavoriteSectionTransfer(data) {
    this._onClickStartTransfers('-favorite-section', data);
  }

  /**
   * Launchs the event to start the transfers from account
   * @param {Object} data
   */
  onClickStartAccountSectionTransfer(data) {
    this._onClickStartTransfers('-account-section', data);
  }

  /**
   * Launchs the event to start the transfers from cards
   * @param {Object} data
   */
  onClickStartCardSectionTransfer(data) {
    this._onClickStartTransfers('-card-section', data);
  }

  /**
   * Get merchants key from localStorage
   * @event 'get-native-local-storage'
   */
  _checkMerchantsStored() {
    const MERCHANTS_KEY = 'mercurioMPOS';
    this._dispatchEvent(`${this.constructor.is}-get-native-local-storage`, { key: MERCHANTS_KEY, secure: true });
  }

  /**
   * Retrieved merchants data from localStorage
   * @param {Object} data
   */
  retrievedStoredMercurioMposData(data) {
    const {isOpenPayUser} = data;
    this._isOpenPayUser = !!isOpenPayUser;
  }

  /**
   * Send the operations list to glomo-operations-list-group
   * @event 'operation-list'
   */
  sendOperationalsData() {
    const glomoMiniorAccount = this.isGlomoMiniorAccount;
    const dashboardOperatives = this.get('dashboard.data.dashboardOperatives', this.appSettingsDataOperationals);
    const operativesSelectOperationsFeatureFlag = this.appSettingsData;
    const dashboardOperativesMinior = this.get('dashboard.data.dashboardOperativesMinior', this.appSettingsDataOperationalsMinior);
    const operativesSelectOperationsMiniorFeatureFlag = this.appSettingsDataMinior;
    this._checkMerchantsStored();
    let operatives = Array.isArray(dashboardOperatives)
      && dashboardOperatives.map(operative => ({...operative, id: this.camelize(operative.id, 0, /[\s-_]/g, false, true)}))
        .filter(operative => typeof operativesSelectOperationsFeatureFlag[operative.id] === 'boolean' ? operativesSelectOperationsFeatureFlag[operative.id] : operative.enable);
    const operativesMinior = Array.isArray(dashboardOperativesMinior)
      && dashboardOperativesMinior.map(operative => ({...operative, id: this.camelize(operative.id, 0, /[\s-_]/g, false, true)}))
        .filter(operative => typeof operativesSelectOperationsMiniorFeatureFlag[operative.id] === 'boolean' ? operativesSelectOperationsMiniorFeatureFlag[operative.id] : operative.enable);

    if (operatives) {
      const keyBillPayments = this.featureFlagCollection['glomo.account.billPayment']?.value;
      operatives = keyBillPayments ? operatives : operatives.filter(item => item.id !== 'servicePayment');
      operatives.sort((a, b) => a.rank - b.rank);
      const operationalsList = this._parseSelectOperationals(operatives);
      if (operativesMinior) {
        operativesMinior.sort((a, b) => a.rank - b.rank);
        const operationalsListMinior = this._parseSelectOperationalsMinior(operativesMinior);
        this._dispatchEvent('operation-list', glomoMiniorAccount ? operationalsListMinior : operationalsList);
      }
    }
  }
  /**
   * Dispatch an event for navigate to a native page operative
   * @param {Object} operation
   * @event 'navigate-to-(operation)'
   */
  navigateToNativePageOperative(operation) {
    const operationId = this.c(operation, 'id', null);
    if (operationId !== null) {
      this._dispatchEvent(`navigate-to-${this.camelToKebab(operationId)}`, {});
    }
  }

  _configAccountLevelUpModal() {
    const modalSettings = {
      id: 'modal',
      code: 'INTERNATIONAL-TRANSFER-ACCOUNT-LEVEL-UP',
      selectedConfig: {
        className: 'full-height-info full-hero-image',
        openMaximized: true,
        title: 'glomo-INTERNATIONAL-TRANSFER-ACCOUNT-LEVEL-UP-modal-header',
        atomIcon: {
          icon: 'coronita:help',
          class: 'icon-size-24'
        },
        acceptBtLabel: 'glomo-INTERNATIONAL-TRANSFER-ACCOUNT-LEVEL-UP-modal-accept',
        template: {
          type: 'paragraphs',
          values: [{
            text: 'glomo-INTERNATIONAL-TRANSFER-ACCOUNT-LEVEL-UP-modal-title',
            class: 'strong'
          },
          {
            text: 'glomo-INTERNATIONAL-TRANSFER-ACCOUNT-LEVEL-UP-modal-text'
          },
          {
            icon: 'coronita:info',
            iconClass: 'icon-size-24',
            message: 'glomo-INTERNATIONAL-TRANSFER-ACCOUNT-LEVEL-UP-modal-message',
            type: 'info',
            class: 'min-bottom-space'
          }]
        }
      }
    };

    return modalSettings;
  }

  /**
   * Handles event for navigation
   * @param {Object} operation
   * @event 'navigate-to-operationals'
   * @event 'international-tranfers-account-level-up'
   */
  operationalsNavigateTo(operation) {
    if (!this.standInMode || (this.standInMode && this._isAvailableInStandIn(operation.id))) {
      const pageToNavigate = this.operationalsPage[operation.id];
      const detail = { page: pageToNavigate };
      if (operation && operation.id === 'internationalTransfers') {
        switch (this._internationalTransfersAccounts.length) {
          case 0:
            this._dispatchEvent('open-modal', this._configAccountLevelUpModal());
            this._dispatchEvent('international-tranfers-account-level-up');
            break;
          case 1:
            this._dispatchEvent('navigate-to-operationals', detail);
            break;
          default:
            this._dispatchEvent('more-than-one-level-four-account', this._parsedAccounts());
            break;
        }
      } else {
        this._dispatchEvent('navigate-to-operationals', detail);
      }
    } else {
      this._openStandInModal(this.get('id', operation));
    }
  }

  /**
  * Returns an object with different operatives value configurations
  * for the Stand-In modal.
  * @returns {Object}
  */
  _valueSettings() {
    return {
      'transfers': [
        { title: 'glomo-stand-in-operative-modal-title-transfer', class: 'spacing--xs simple-title' },
        { text: 'glomo-dashboard-stand-in-operative-transfer-text1', class: 'grey' },
        { headerTitle: 'glomo-stand-in-modal-transfer-title' }
      ],
      'transfer': [
        { title: 'glomo-stand-in-operative-modal-title-transfer', class: 'spacing--xs simple-title' },
        { text: 'glomo-dashboard-stand-in-operative-transfer-text1', class: 'grey' },
        { headerTitle: 'glomo-stand-in-modal-transfer-title' }
      ],
      'opportunities': [
        { title: 'glomo-operative-selector-manager-opportunities-stand-in-modal-tile', class: 'spacing--xs simple-title' },
        { text: 'glomo-operative-selector-manager-opportunities-stand-in-modal-text', class: 'grey' },
        { headerTitle: 'glomo-operative-selector-manager-opportunities-stand-in-modal-header-title' }
      ],
      'servicePayment': [
        { title: 'glomo-operative-selector-manager-service-payment-stand-in-modal-tile', class: 'spacing--xs simple-title' },
        { text: 'glomo-operative-selector-manager-service-payment-stand-in-modal-text', class: 'grey' },
        { headerTitle: 'glomo-operative-selector-manager-service-payment-stand-in-modal-header-tile' }
      ],
      'mobileTransfer': [
        { title: 'glomo-operative-selector-manager-mobile-transfer-stand-in-modal-tile', class: 'spacing--xs simple-title'},
        { text: 'glomo-operative-selector-manager-mobile-transfer-stand-in-modal-text', class: 'grey' },
        { headerTitle: 'glomo-operative-selector-manager-mobile-transfer-stand-in-modal-header-tile' }
      ],
      'mobileTopUp': [
        { title: 'glomo-operative-selector-manager-mobile-to-up-stand-in-modal-tile', class: 'spacing--xs simple-title'},
        { text: 'glomo-operative-selector-manager-mobile-to-up-stand-in-modal-text', class: 'grey' },
        { headerTitle: 'glomo-operative-selector-manager-mobile-to-up-stand-in-modal-header-tile' }
      ],
      'accountStatus': [
        { title: 'glomo-operative-selector-manager-account-status-stand-in-modal-tile', class: 'spacing--xs simple-title'},
        { text: 'glomo-operative-selector-manager-account-status-stand-in-modal-text', class: 'grey' },
        { headerTitle: 'glomo-operative-selector-manager-account-status-stand-in-modal-header-tile' }
      ],
      'aStatus': [
        { title: 'glomo-operative-selector-manager-account-status-stand-in-modal-tile', class: 'spacing--xs simple-title'},
        { text: 'glomo-operative-selector-manager-account-status-stand-in-modal-text', class: 'grey' },
        { headerTitle: 'glomo-operative-selector-manager-account-status-stand-in-modal-header-tile' }
      ],
      'qrPayment': [
        { title: 'glomo-operative-selector-manager-qr-payment-stand-in-modal-tile', class: 'spacing--xs simple-title'},
        { text: 'glomo-operative-selector-manager-qr-payment-stand-in-modal-text', class: 'grey' },
        { headerTitle: 'glomo-operative-selector-manager-qr-payment-stand-in-modal-header-tile' }
      ],
      'billPayment': [
        { title: 'glomo-stand-in-operative-modal-title-bill-payment', class: 'spacing--xs simple-title' },
        { text: 'glomo-dashboard-stand-in-operative-bill-payment-text1', class: 'grey' },
        {headerTitle: 'glomo-stand-in-operative-bill-payment-title' }
      ],
      'cardLessWithdrawal': [
        { title: 'glomo-stand-in-operative-modal-title-card', class: 'spacing--xs simple-title' },
        { text: 'glomo-dashboard-stand-in-operative-cardless-withdraw-text1', class: 'grey' },
        {headerTitle: 'glomo-stand-in-operative-card-less-with-draw-title' }
      ],
      'internationalTransfers': [
        { title: 'glomo-operative-selector-manager-international-transfers-stand-in-modal-tile', class: 'spacing--xs simple-title'},
        { text: 'glomo-operative-selector-manager-international-transfers-stand-in-modal-text', class: 'grey' },
        { headerTitle: 'glomo-operative-selector-manager-international-transfers-stand-in-modal-header-tile' }
      ],
      'international_transfers': [
        { title: 'glomo-operative-selector-manager-international-transfers-stand-in-modal-tile', class: 'spacing--xs simple-title'},
        { text: 'glomo-operative-selector-manager-international-transfers-stand-in-modal-text', class: 'grey' },
        { headerTitle: 'glomo-operative-selector-manager-international-transfers-stand-in-modal-header-tile' }
      ],
      'codi': [
        { title: 'glomo-operative-selector-manager-qr-payment-stand-in-modal-tile', class: 'spacing--xs simple-title'},
        { text: 'glomo-operative-selector-manager-qr-payment-stand-in-modal-text', class: 'grey' },
        { headerTitle: 'glomo-operative-selector-manager-qr-payment-stand-in-modal-header-tile' }
      ],
      'statemens': [
        { title: 'glomo-operative-selector-manager-account-status-stand-in-modal-tile', class: 'spacing--xs simple-title'},
        { text: 'glomo-operative-selector-manager-account-status-stand-in-modal-text', class: 'grey' },
        { headerTitle: 'glomo-operative-selector-manager-account-status-stand-in-modal-header-tile' }
      ],
      'editAlias': [
        { title: 'cells-operation-list-indicator-edit-alias-in-modal-tile', class: 'spacing--xs simple-title'},
        { text: 'cells-operation-list-indicator-edit-alias-in-modal-text', class: 'grey' },
        { headerTitle: 'cells-operation-list-indicator-edit-alias-in-modal-header-tile' }
      ],
      'editLimits': [
        { title: 'cells-operation-list-indicator-edit-limits-in-modal-tile', class: 'spacing--xs simple-title'},
        { text: 'cells-operation-list-indicator-edit-limits-in-modal-text', class: 'grey' },
        { headerTitle: 'cells-operation-list-indicator-edit-limits-in-modal-header-tile' }
      ],
      'blockCard': [
        { title: 'cells-operation-list-indicator-block-card-in-modal-tile', class: 'spacing--xs simple-title'},
        { text: 'cells-operation-list-indicator-block-card-in-modal-text', class: 'grey' },
        { headerTitle: 'cells-operation-list-indicator-block-card-in-modal-header-tile' }
      ],
      'nipNumber': [
        { title: 'cells-operation-list-indicator-nip-number-in-modal-tile', class: 'spacing--xs simple-title'},
        { text: 'cells-operation-list-indicator-nip-number-in-modal-text', class: 'grey' },
        { headerTitle: 'cells-operation-list-indicator-nip-number-in-modal-header-tile' }
      ],
      'buyAire': [
        { title: 'cells-operation-list-buy-aire-in-modal-tile', class: 'spacing--xs simple-title'},
        { text: 'cells-operation-list-buy-aire-in-modal-text', class: 'grey' },
        { headerTitle: 'cells-operation-list-buy-aire-in-modal-header-tile' }
      ],
      'creditCardDebtPayment': [
        { title: 'glomo-stand-in-operative-modal-title-credit-card-payment', class: 'spacing--xs simple-title'},
        { text: 'glomo-dashboard-stand-in-operative-credit-card-payment-text1', class: 'grey' },
        {headerTitle: 'glomo-stand-in-operative-credit-card-payment-title' }
      ],
      'creditCardPayment': [
        { title: 'glomo-stand-in-operative-modal-title-credit-card-payment', class: 'spacing--xs simple-title'},
        { text: 'glomo-dashboard-stand-in-operative-credit-card-payment-text1', class: 'grey' },
        {headerTitle: 'glomo-stand-in-operative-credit-card-payment-title' }
      ],
      'paycard': [
        { title: 'glomo-stand-in-operative-modal-title-credit-card-payment', class: 'spacing--xs simple-title'},
        { text: 'glomo-dashboard-stand-in-operative-credit-card-payment-text1', class: 'grey' },
        { headerTitle: 'glomo-stand-in-operative-credit-card-payment-title' }
      ],
      'receivePayroll': [
        { title: 'glomo-operative-selector-manager-receive-payroll-stand-in-modal-tile', class: 'spacing--xs simple-title'},
        { text: 'glomo-operative-selector-manager-receive-payroll-stand-in-modal-text', class: 'grey' },
        { headerTitle: 'glomo-operative-selector-manager-receive-payroll-stand-in-modal-header-tile' }
      ],
      'codicelSend': [
        { title: 'glomo-operative-selector-manager-send-money-with-dimo-stand-in-modal-tile', class: 'spacing--xs simple-title'},
        { text: 'glomo-operative-selector-manager-send-money-with-dimo-stand-in-modal-text', class: 'grey' },
        { headerTitle: 'glomo-operative-selector-manager-send-money-with-dimo-stand-in-modal-header-tile' }
      ],
      'codicelConsent': [
        { title: 'glomo-operative-selector-manager-onboarding-dimo-stand-in-modal-tile', class: 'spacing--xs simple-title'},
        { text: 'glomo-operative-selector-manager-onboarding-dimo-stand-in-modal-text', class: 'grey' },
        { headerTitle: 'glomo-operative-selector-manager-onboarding-dimo-stand-in-modal-header-tile' }
      ],
      'cardLocation': [
        { title: 'glomo-card-detail-manager-stand-in-card-location-title', class: 'spacing--xs simple-title'},
        { text: 'glomo-card-detail-manager-stand-in-card-location-text', class: 'grey' },
        { headerTitle: 'glomo-card-detail-manager-stand-in-card-location-header-tile' }
      ],
      'cardActivation': [
        { title: 'glomo-card-detail-manager-stand-in-card-activation-title', class: 'spacing--xs simple-title'},
        { text: 'glomo-card-detail-manager-stand-in-card-activation-text', class: 'grey' },
        { headerTitle: 'glomo-card-detail-manager-stand-in-card-activation-header-tile' }
      ]
    };
  }

  /**
   * Returns content for generic modal for stand in
   * @returns {Array}
   */
  _valueSettingsGenericModalStandIn() {
    return [
      {
        title: 'glomo-stand-in-modal-title'
      },
      {
        text: 'glomo-stand-in-modal-text',
        class: 'spacing title-grey margin-bottom-s',
      },
      {
        headerTitle: 'glomo-stand-in-modal-title'
      }
    ];
  }

  /**
  * Creates Stand-In modal for dashboard operatives
  * @param {Array} values
  * @return {Object}
  */
  _standinModalStructure(values) {
    const { headerTitle } = values.pop();
    return {
      code: 'UNAVAILABLE-OPERATIVE-STANDIN-MODAL',
      selectedConfig: {
        className: 'full-height-error',
        openMaximized: true,
        title: headerTitle,
        heroImage: 'images/fundsHiring/Info.svg',
        acceptBtLabel: 'glomo-stand-in-button-label',
        template: {
          type: 'paragraphs',
          values
        }
      }
    };
  }

  /**
  * Open Stand-In modals for operatives
  * @param {Object} operative
  * @event 'open-modal'
  */
  _openStandInModal(operative) {
    if (operative) {
      const values = this.get(operative, this._valueSettings()) || this._valueSettingsGenericModalStandIn();
      const modal = this._standinModalStructure(values);
      this._dispatchEvent('open-modal', modal);
    }
  }

  /**
   * Evaluates operative availability in stand in mode
   * @param {String}
   * @returns {Boolean}
   */
  _isAvailableInStandIn(operativeId) {
    let isFlagEnable = true;
    const enableInStandIn = this.excludeOperationsFromStandIn.includes(operativeId);
    if (this.standInFeatureFlags[operativeId]) {
      isFlagEnable = this.get('value', this.featureFlagCollection[this.standInFeatureFlags[operativeId]]);
    }

    return enableInStandIn && isFlagEnable;
  }

  /**
   * @desc parse accounts to send to modal info to start operative
   *
   */
  _parsedAccounts() {
    if (this.accountsContracts) {
      return this.accountsContracts[0].products.filter(account => account.level === '04').map(account => ({
        alias: this.c(account, 'name'),
        name: this.c(account, 'name'),
        productId: this.c(account, 'id'),
        number: this.c(account, 'description.value'),
        masked: this.c(account, 'description.masked'),
        availableBalance: {
          currentBalances: [ {
            amount: this.c(account, 'primaryAmount.amount'),
            currency: this.c(account, 'primaryAmount.currency')
          } ]
        },
        primaryAmount: {
          amount: this.c(account, 'primaryAmount.amount'),
          currency: this.c(account, 'primaryAmount.currency'),
          label: 'glomo-international-transfers-available-balance'
        },
        description: {
          value: this.c(account, 'description.value'),
          masked: this.c(account, 'description.masked'),
        },
        level: this.c(account, 'level'),
        status: this.c(account, 'status'),
        numberType: {
          id: this.c(account, 'numberType.id'),
          name: 'Customer Account Code'
        },
        contractType: {
          id: 'ACCOUNT',
          name: 'ACCOUNTS'
        },
        currencies: [ {
          currency: this.c(account, 'primaryAmount.currency')
        } ],
        type: 'ACCOUNTS',
        family: 'accounts'
      }));
    }
  }

  /**
   * Parses select operationals screen data
   * @param {Array} operatives
   * @returns {Array}
   */
  _parseSelectOperationals(operatives) {
    const favoriteOperations = this._getFavoriteOperations(operatives);
    const accountOperations = this._getAccountsOperations(operatives);
    const cardOperations = this._getCardsOperations(operatives);
    const merchantOperations = this._getMerchantsOperations(operatives);
    const favoriteOperationList = this._parseOperationalsView(favoriteOperations, 'favorite');
    const accountOperationList = this._parseOperationalsView(accountOperations, 'account');
    const cardOperationList = this._parseOperationalsView(cardOperations, 'card');
    const merchantOperationList = this._parseOperationalsView(merchantOperations, 'merchant');
    return [
      ...(favoriteOperationList.length ? [ {
        title: 'glomo-operative-selector-manager-favorite-operation-title',
        style: 'primary',
        operations: favoriteOperationList
      } ] : []),
      ...(accountOperationList.length ? [ {
        title: 'glomo-operative-selector-manager-account-operation-title',
        style: 'primary',
        operations: accountOperationList
      } ] : []),
      ...(cardOperationList.length ? [ {
        title: 'glomo-operative-selector-manager-card-operation-title',
        style: 'primary',
        operations: cardOperationList
      } ] : []),
      ...(merchantOperationList.length ? [ {
        title: 'glomo-operative-selector-manager-merchant-operation-title',
        style: 'primary',
        operations: merchantOperationList
      } ] : [])];
  }

  /**
   * Parses the select operationals minior.
   * @param {Array} operativesMinior
   * @returns {Array}
   */
  _parseSelectOperationalsMinior(operativesMinior) {
    const favoriteOperationsMinior = this._getFavoriteOperationsMinior(operativesMinior);
    const accountOperationsMinior = this._getAccountsOperationsMinior(operativesMinior);
    const cardOperationsMinior = this._getCardsOperationsMinior(operativesMinior);
    const favoriteOperationListMinior = this._parseOperationalsView(favoriteOperationsMinior, 'favorite');
    const accountOperationListMinior = this._parseOperationalsView(accountOperationsMinior, 'account');
    const cardOperationListMinior = this._parseOperationalsView(cardOperationsMinior, 'card');
    return [
      ...(favoriteOperationListMinior.length ? [ {
        title: 'glomo-operative-selector-manager-favorite-operation-title',
        style: 'primary',
        operations: favoriteOperationListMinior
      } ] : []),
      ...(accountOperationListMinior.length ? [ {
        title: 'glomo-operative-selector-manager-account-operation-title',
        style: 'primary',
        operations: accountOperationListMinior
      } ] : []),
      ...(cardOperationListMinior.length ? [ {
        title: 'glomo-operative-selector-manager-card-operation-title',
        style: 'primary',
        operations: cardOperationListMinior
      } ] : [])];
  }

  /**
   * Parse the view of operations
   * @param {Array} operations
   * @param {String} section
   * @returns {Object}
   */
  _parseOperationalsView(operations, section) {
    return operations.map(operationName => {
      return ({
        label: `dashboard-operative-${this.camelToKebab(this._isDimoTransfer(operationName) ? operationName + 'Dimo' : operationName)}`,
        id: operationName,
        eventDetail: {},
        eventName: this.standInMode ? 'operational-in-stand-in-mode' : `navigation-${section}-section-to-${this.camelToKebab(operationName)}`,
        icon: this.operationalsIcons[operationName],
        type: 'operation'
      });
    });
  }

  /**
   * Validate feature flag for dimo&ransger and operation name is equals to transfer
   * @param {String} operation name
   * @returns Boolean
   */
  _isDimoTransfer(operation) {
    return this.dimoTransferFeature && operation.toLowerCase() === 'transfer';
  }

  /**
   * Get operations for favorites section
   * @param {Array} operatives
   * @returns {Array}
   */
  _getFavoriteOperations(dashboardOperatives) {
    return dashboardOperatives.filter((operative) => operative.isFavorite).map((operative) => operative.id).slice(0, this.favoriteItemsNumber);
  }

  /**
   * Returns an array of the IDs of the favorite operatives from the given dashboard operatives.
   * Only the first three favorite operatives are included in the result.
   * @param {Array} dashboardOperativesMinior
   * @returns {Array}
   */
  _getFavoriteOperationsMinior(dashboardOperativesMinior) {
    return dashboardOperativesMinior.filter((operative) => operative.isFavorite).map((operative) => operative.id).slice(0, 3);
  }

  /**
   * Get operations for account section
   * @param {Array} operatives
   * @returns {Array}
   */
  _getAccountsOperations(operatives) {
    const productType = 'accounts';
    const accountsOperations = [];
    const conditions = this.conditionsForOperational[productType];
    if (this._validateConditions(conditions)) {
      const operations = operatives.filter((operative) => operative.isAccountOperative
      && this._validateConditionsForOperational(operative.id, productType)).map((operative) => operative.id);
      accountsOperations.push(...operations);
    }
    return accountsOperations;
  }

  /**
   * Retrieves the accounts operations minior based on the provided operatives.
   * @param {Array} operatives
   * @returns {Array}
   */
  _getAccountsOperationsMinior(operatives) {
    const productType = 'accounts';
    const accountsOperationsMinior = [];
    const conditions = this.conditionsForOperational[productType];
    if (this._validateConditions(conditions)) {
      const operationsMinior = operatives.filter((operative) => operative.isAccountOperative
      && this._validateConditionsForOperational(operative.id, productType)).map((operative) => operative.id);
      accountsOperationsMinior.push(...operationsMinior);
    }
    return accountsOperationsMinior;
  }

  /**
   * Get operations for card section
   * @param {Array} operatives
   * @returns {Array}
   */
  _getCardsOperations(operatives) {
    const productType = 'cards';
    const cardsOperation = [];
    const conditions = this.conditionsForOperational[productType];
    if (this._validateConditions(conditions)) {
      const operations = operatives.filter((operative) => operative.isCreditCardOperative
        && this._validateConditionsForOperational(operative.id, productType)).map((operative) => operative.id);
      cardsOperation.push(...operations);
    }
    return cardsOperation;
  }

  /**
   * Retrieves the operations minior for cards based on the given operatives.
   * @param {Array} operatives
   * @returns {Array}
   */
  _getCardsOperationsMinior(operatives) {
    const productType = 'cards';
    const cardsOperationMinior = [];
    const conditions = this.conditionsForOperational[productType];
    if (this._validateConditions(conditions)) {
      const operationsMinior = operatives.filter((operative) => operative.isCreditCardOperative
        && this._validateConditionsForOperational(operative.id, productType)).map((operative) => operative.id);
      cardsOperationMinior.push(...operationsMinior);
    }
    return cardsOperationMinior;
  }

  _getMerchantsOperations(operatives) {
    return operatives.filter((operative) => operative.isMerchantOperative && this._isOpenPayUser).map((operative) => operative.id);
  }

  /**
   * Validate conditions for operationals
   * @param {String} operative operative id
   * @param {String} productType
   * @returns {Boolean}
   */
  _validateConditionsForOperational(operative, productType) {
    const conditions = this.get(`${operative}`, this.conditionsForOperational)
      || this.get(`${productType}.${operative}`, this.conditionsForOperational);
    return this._validateConditions(conditions);
  }

  /**
   * Validate conditions
   * @param {Object} conditions
   * @returns {Boolean}
   */
  _validateConditions(conditions) {
    return conditions === undefined || [
      ...this.get('hasAccounts', conditions) ? [ this._hasAccounts() ] : [],
      ...this.get('hasCards', conditions) ? [ this._hasCards() ] : [],
      ...this.get('hasOperableCards', conditions) ? [ this._hasOperableCards() ] : [],
      ...this.get('hasCreditCards', conditions) ? [ this._hasCreditCards() ] : [],
      ...this.get('hasInternationalTransfers', conditions) ? [ this._hasInternationalTransfers() ] : [],
    ].every(item => item);
  }

  /**
   * Validate that the customer has accounts
   * @returns {Boolean}
   */
  _hasAccounts() {
    return this.accounts.length > 0;
  }

  /**
   * Validate that the customer has cards
   * @returns {Boolean}
   */
  _hasCards() {
    return this.cards.length > 0;
  }

  /**
   * Validate that the customer has operable cards
   * @returns {Boolean}
   */
  _hasOperableCards() {
    const operableCards = this.cards.filter(contract => contract.status.id !== 'INOPERATIVE');
    return operableCards.length > 0;
  }

  /**
   * Validate that the customer has credit cards
   * @returns {Boolean}
   */
  _hasCreditCards() {
    const creditCards =  this.cards.filter(contract => contract.status.id !== 'INOPERATIVE'
      && contract.cardType.id === 'CREDIT_CARD');
    return creditCards.length > 0;
  }

  /**
   * Validate that the customer has international transfers
   * @returns {Boolean}
   */
  _hasInternationalTransfers() {
    this._internationalTransfersAccounts = this.accounts.filter((element = {}) => element.level === '04');
    return this._internationalTransfersAccounts;
  }

  /**
   * Validate if the frequent inteligent operations are avaliable
   * @param {Object}
   */
  frequentOperations(flags) {
    if (flags) {
      this.frequentOperationsValidation = flags[this.frequentOperationsFlagKey];
      if (this.frequentOperationsValidation?.value) {
        this.favoriteItemsNumber = 4;
      }
    }
  }
}

customElements.define(GlomoOperativeSelectorManagerMx.is, GlomoOperativeSelectorManagerMx);
