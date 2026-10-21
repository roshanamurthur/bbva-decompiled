
/* global GlomoProfileManagerMixin */
/*global moment*/

/**
 * @summary Data Manager for Glomo Profile Mexico.
 * @customElement
 * @polymer
 * @extends {Polymer.Element}
 */
/*eslint new-cap: [2, {"capIsNewExceptions": ["CellsProductFormatBehavior"]}]*/

class GlomoProfileManagerMx extends GlomoProfileManagerMixin.mixin(Polymer.mixinBehaviors([
  CellsBehaviors.CellsCheckNestedKeysBehavior
], Polymer.Element)) {
  static get is() {
    return 'glomo-profile-manager-mx';
  }

  static get properties() {
    return {
      /**
       * global cache storage
       */
      globalCacheStorage: {
        type: Object,
        value: () => ({})
      },
      /**
       * route params, usefull to storage native data with core native and
       * feature flags on cells core app
       */
      routeParams: {
        type: Object,
        value: () => ({})
      },
      /**
       * customer id
       * @notify true
       */
      customerId: {
        type: String,
        notify: true
      },
      /**
       * clear number associated to this client
       */
      clientId: {
        type: String,
        value: ''
      },
      /**
       * flag of native core on current app; this will be
       * helpful to identify if there is native cache
       */
      native: {
        type: Boolean,
        value: false
      },
      /**
       * flag of native cache is available on current app
       */
      useNativeCache: {
        type: Boolean,
        value: false
      },
      /**
       * know your client exception flag; this flag will be stored
       * on user's device in order to identify exception cases for
       * questionnaire
       */
      kycException: {
        type: Boolean,
        value: false
      },
      /**
       * get customer response profile state after this manager mapping
       * @default {}
       */
      _customer: {
        type: Object,
        value: () => ({})
      },
      /**
       * get customer contacts profile state after this manager mapping
       * @default []
       */
      _customerContactDetails: {
        type: Array,
        value: () => []
      },
      /**
       * get customer addresses main address profile state after this
       * manager mapping
       * @default {}
       */
      _customerAddress: {
        type: Object,
        value: () => ({})
      },
      /**
       * get questionnaires KYC profile state after this manager mapping
       * @default {}
       */
      _customerKycQuestionnaire: {
        type: Object,
        value: () => ({})
      },
      /**
       * flag to identify if we are doing initial requests process
       * @default false
       */
      initialRequestsMode: {
        type: Boolean,
        value: false
      },
      /**
       * limit retries allowed in every request profile page
       * @default 3
       */
      limitRetriesOnErrorResponse: {
        type: Number,
        value: 3
      },
      /**
       * Counter of customer request retries
       * @default 0
       */
      personalInfoRetriesCounter: { type: Number, value: 0 },
      /**
       * Counter of contact details request retries
       * @default 0
       */
      contactsRetriesCounter: { type: Number, value: 0 },
      /**
       * Counter of address request retries
       * @default 0
       */
      addressRetriesCounter: { type: Number, value: 0 },
      /**
       * Counter of know your client request retries
       * @default 0
       */
      kycRetriesCounter: { type: Number, value: 0 },
      /**
       * Counter of list dossiers request retries
       * @default 0
       */
      listContractingDossiersRetriesCounter: { type: Number, value: 0 },
      /**
       * Counter of recipients request retries
       * @default 0
       */
      _recipientsRetriesCounter: { type: Number, value: 0 },
      /**
       * Flags to store customer request error is currently active
       * @default false
       * @notify true (send event to ui each time is switched)
       */
      personalInfoErrorActive: { type: Boolean, value: false, notify: true },
      /**
       * Flags to store address request error is currently active
       * @default false
       * @notify true (send event to ui each time is switched)
       */
      addressErrorActive: { type: Boolean, value: false, notify: true },
      /**
       * Flags to store mobile contact request error is currently active
       * @default false
       * @notify true (send event to ui each time is switched)
       */
      customerContactsErrorActive: { type: Boolean, value: false, notify: true },
      /**
       * Flags to store know your client request error is currently active
       * @default false
       * @notify true (send event to ui each time is switched)
       */
      kycErrorActive: { type: Boolean, value: false, notify: true },
      /**
       * show/hide personal information button active
       * @default false
       * @notify true
       */
      showHidePersonalInformation: { type: Boolean, value: false, notify: true },
      /**
       * enable status label of email (just for v1 customers)
       * @default false
       */
      enableEmailValidation: { type: Boolean, value: false, notify: true },
      /**
       * customer contacts masked snapshot, usefull for switch
       * between masked and unmasked contacts to avoid request contacts
       * in the same session
       * @default []
       */
      _contactsMaskedSnapshoot: {
        type: Array,
        value: () => []
      },
      /**
       * customer contacts unmasked snapshot, usefull for switch
       * between masked and unmasked contacts to avoid request contacts
       * in the same session
       * @default []
       */
      _contactsUnmaskedSnapshoot: {
        type: Array,
        value: () => []
      },
      /**
       * customer address masked snapshot, usefull for switch
       * between masked and unmasked contacts to avoid request contacts
       * in the same session
       * @default {}
       */
      _addressMaskedSnapshoot: {
        type: Object,
        value: () => ({})
      },
      /**
       * customer address unmasked snapshot, usefull for switch
       * between masked and unmasked contacts to avoid request contacts
       * in the same session
       * @default {}
       */
      _addressUnmaskedSnapshoot: {
        type: Object,
        value: () => ({})
      },
      /**
       * kyc questionnaire snapshoot, useful for persist questionnaire data
       * to kyc validation screen; different to _customerKycQuestionnaire
       * because last one is just the profile ui state but it doesn't save
       * questionnaire per se
       * @default {}
       */
      _kycQuestionnaireSnapshoot: {
        type: Object,
        value: () => ({})
      },
      /**
       * list contracting dossiers state, useful to consult documents status
       * every time during profile session
       * @default []
       */
      _listContractingDossiers: {
        type: Array,
        value: () => []
      },
      /**
       * flag to perfomr just writted kycException flag when is just
       * written and we're not able to read it from navigation params
       */
      performKycException: {
        type: Boolean,
        value: false
      },
      /**
       * flag to perform just updated kyc cause list dossiers service
       * updates status flag asynchronously
       */
      performKycUpdate: {
        type: Boolean,
        value: false
      },
      /**
       * identification available labels where keys are each document id
       */
      availableIdLabels: {
        type: Object,
        value: () => ({
          INE: 'glomo-customer-profile-id-ine',
          CI: 'glomo-customer-profile-id-professional-license',
          MILITARY: 'glomo-customer-profile-id-military',
          TUIM: 'glomo-customer-profile-id-tuim',
          NSS: 'glomo-customer-profile-id-imss',
          FEDERAL_DL: 'glomo-customer-profile-id-drivers-license',
          PASSPORT: 'glomo-customer-profile-id-passport',
          CID: 'glomo-customer-profile-id-consular-registration',
          NATIONAL_VISA: 'glomo-customer-profile-id-mexican-visa',
          FOREIGNERS: 'glomo-customer-profile-id-migratory-form',
          ORIGIN_IDENTITY_DOCUMENT: 'glomo-customer-profile-id-migratory-form',
          RESIDENTIAL_PASS: 'glomo-customer-profile-id-resident-card',
          DIPLOMATIC: 'glomo-customer-profile-id-diplomatic-card',
          CREDENCIAL_OLDER_ADULTS: 'glomo-customer-profile-id-inapam',
          PDL: 'glomo-customer-profile-id-drivers-license',
          FMM: 'glomo-customer-profile-id-migratory-format',
          ARC: 'glomo-customer-profile-id',
          REAL_ID_CARD: 'glomo-customer-profile-id',
          DL: 'glomo-customer-profile-id',
          ISSSTE: 'glomo-customer-profile-id-issste',
          POPULAR_INSURANCE_NUMBER: 'glomo-customer-profile-id-popular-insurance',
          ISSFAM: 'glomo-customer-profile-id-issfam',
          INE_NATURALIZED: 'glomo-customer-profile-id-ine'
        })
      },
      /**
       * address available status configs
       */
      addressStatusConfig: {
        type: Object,
        value: () => ({
          I: {
            title: 'glomo-customer-profile-incomplete',
            class: 'confirm'
          },
          R: {
            title: 'glomo-customer-profile-rejected',
            class: 'rejected'
          },
          Q: {
            title: 'glomo-customer-profile-in-validation',
            class: 'invalidation'
          }
        })
      },
      /**
       * Save the new avatar
       * @default {}
       */
      updateAvatarSuccess: {
        type: Object,
        value: () => ({})
      },
      /**
       * Save the new avatar
       * @default ''
       */
      newAvatarCreated: {
        type: String,
        value: ''
      },
      /**
       * flag to perform tax residence just updated in profile cause
       * document is processed asynchronus way by backend
       * @default false
       */
      taxResidenceJustUpdated: {
        type: Boolean,
        value: false
      },
      /**
       * state of feature flags, useful to consult on/off flags during
       * profile session
       * @default {}
       */
      featureFlags: {
        type: Object,
        value: () => ({})
      },
      /**
       * state of current user financial overview, useful to determine
       * if current customer is "native digital"
       * @default {}
       */
      financialOverviewDetails: {
        type: Object,
        value: () => ({})
      },
      /**
       * indicator of pending payroll account when list documentation
       * dossiers result incomplete or blocked status
       * @default false
       */
      _pendingPayrollAccount: {
        type: Boolean,
        value: false
      },
      /**
       * initial get requests list, this will be helpful for keep the
       * same order and validate each request feature flag
       */
      customerDataRequests: {
        type: Array,
        value: () => ([
          { resource: 'CUSTOMER' },
          { resource: 'CONTACTS', featureFlag: 'editEmail' },
          { resource: 'ADDRESSES', featureFlag: 'editAddress' },
          { resource: 'QUESTIONNAIRES', featureFlag: 'editKYC' },
        ])
      },
      /**
       * flag of digital native user, this will be used to avoid
       * some unnecesary requests, computations or disable editign
       * certain documents
       * @default false
       */
      _isDigitalNativeUser: {
        type: Boolean,
        value: false
      },
      /**
       * flag to know which is the current initial request in the following
       * order: customer, contacts, addresses, questionnaires up to now
       * @default 0
       */
      _lastRequestIndex: {
        type: Number,
        value: 0
      },
      /**
       * state of the fullfilment documents cause each document status
       * may be determine top info box feedback to user
       */
      _fullfillmentDocuments: {
        type: Object,
        value: () => ({
          curp: true,
          identification: true,
          address: true,
          taxResidence: true,
          kyc: true
        })
      },
      /**
       * default main tax residence when get customer response does not
       * inform it, we assume Mexico by business rule in MX
       */
      defaultMainTaxResidence: {
        type: Object,
        value: () => ({
          country: {
            id: 'MEX',
            name: 'Mexico'
          }
        })
      },
      /**
       * indicates if customer has informed residence country
       * @default false
       */
      _customerHasResidence: {
        type: Boolean,
        value: false
      },
      /**
       * flag contact details are currently unmasked
       * @default false
       */
      _contactsUnmasked: {
        type: Boolean,
        value: false
      },
      /**
       * flag address is currently unmasked
       * @default false
       */
      _addressUnmasked: {
        type: Boolean,
        value: false
      },
      /**
       * flag to indicates if user is currently in process of
       * unmasking contact details
       * @default false
       */
      _unmaskingContacts: {
        type: Boolean,
        value: false
      },
      /**
       * flag to indicates if user is currently in process of
       * unmasking address
       * @default false
       */
      _unmaskingAddress: {
        type: Boolean,
        value: false
      },
      /**
      * Monoproduct flag
      * @type {Boolean}
      */
      isMonoproductUser: {
        type: Boolean,
        value: false
      },
      /**
       * Error code when the key doesn't exist in local storage
       * @type {Number}
       */
      localStorageErrorCode: {
        type: Array,
        value: () => [
          { code: -1 },
          { code: 1 },
          { code: 998 },
          { code: 999 }
        ]
      },
      /**
      * Monoproduct localstorage consulting
      * @type {number}
      */
      _consultingMonoproduct: {
        type: Number,
        value: 0
      },
      /**
       * labels for top info box when some document is not fullfilled
       */
      _missingDocumentsLabels: {
        type: Boolean,
        value: () => ({
          curp: {
            featureFlag: 'editCurp', label: 'CURP'
          },
          identification: {
            featureFlag: 'editINE', label: 'glomo-customer-profile-id'
          },
          address: {
            featureFlag: 'editAddress', label: 'glomo-customer-profile-address'
          },
          taxResidence: {
            featureFlag: 'editFatca', label: 'glomo-customer-profile-fiscal-residence'
          },
          kyc: {
            featureFlag: 'editKYC', label: 'glomo-customer-profile-financial-habits'
          }
        })
      },
      /**
       * Customer tax data object
       * @default {}
       */
      customerTaxData: {
        type: Object,
        value: () => ({})
      },
      /**
       * Flag to enable customer tax data section
       * @default false
       */
      _flagCustomerTaxData: {
        type: Boolean,
        value: false
      },
      /**
       * Store the accounts
       */
      _accounts: {
        type: Array,
        value: () => ([])
      },
      /**
       * Flag to set principalAccountId
       */
      _principalAccountId: {
        type: String,
        value: ''
      },
      /**
       * Flag to set to show or hide recipients section
       * @default false
       */
      flagToShowRecipientsSection: {
        type: Boolean,
        value: false
      },
      /**
       * Flag to know if we are in IOS
       * @default false
       */
      isNativeIos: {
        type: Boolean,
        value: false
      },
      /**
      * TDDE Monoproduct flag
      * @type {Boolean}
      */
      _isTDDEMonoproductClient: {
        type: Boolean,
        value: false
      },
      /**
      * TDDE Monoproduct flag in cache
      * @type {Boolean}
      */
      _isTDDEMonoproductClientCacheFlag: {
        type: Boolean,
        value: false
      },
      /**
      * TDDE Monoproduct combination of flag, cache and local storage
      * @type {Boolean}
      */
      isTDDEMonoproductflag: {
        type: Boolean,
        value: false
      },
      /**
       * Set feature flags profile section
       * @type {Object}
       */
      profileSectionFlags: {
        type: Object,
        value: {}
      },
      /**
       * Flag to request getCustomers
       * @type {Boolean}
       */
      _flagAvatar: {
        type: Boolean,
        value: false
      },
      /**
       * Flag to indicates if local storage has error
       * @type {Boolean}
       */
      _flagProfileStorageError: {
        type: Boolean,
        value: false
      },
      /**
        * show type info a show in update rfc entryPoint empty
        * @type {Boolean}
        */
      showEmptyInfoUpdateRFC: {
        type: Boolean,
        value: false
      },
      /**
      * show type info a show in update rfc entryPoint
      * @type {Boolean}
      */
      showGenericInfoUpdateRFC: {
        type: Boolean,
        value: false
      },
      /**
       * flag update rfc profile
       * @type {Object}
       */
      featureFlagsProfile: {
        type: Object,
        value: () => ({})
      },
      /**
       * Flag to know minior account
       * @type {Boolean}
       */
      isGlomoMiniorAccount: {
        type: Boolean,
        value: () => false
      },
      /**
       * Flag to indicate whether the consumption of global services is enabled
       * @type {Boolean}
       */
      _enableGlobalProfileServices: {
        type: Boolean,
        value: false
      },
      /**
       * Global customer prefix
       * @type {String}
       */
      _globalPrefix: {
        type: String,
        value: ''
      },
      /**
       * Global customer id complete
       * @type {String}
       */
      _globalCustomerId: {
        type: String,
        value: ''
      },
      /**
       * Indicates which postal address flow to start
       * @type {Boolean}
       */
      _isNewPostalAddressFlow: {
        type: Boolean,
        value: false
      },
    };
  }

  static get observers() {
    return [
      '_setFlagStatusGlobal(_customer, profileSectionFlags)',
      '_setCustomerIdGlobal(clientId)',
    ];
  }

  /**
   * Returns the main account
   * @returns {Object}
   */
  _getPrincipalAccount() {
    const mainAccount = this._accounts.filter(account => account.isPrincipalAccount === true)[0] || {};
    return {
      id: this.get('id', mainAccount) || '',
      alias: this.get('alias', mainAccount) || '',
      status: this.get('status', mainAccount) || '',
      type: this.get('type', mainAccount) || '',
      description: {
        value: this.get('number', mainAccount) || '',
        masked: true
      }
    };
  }
  /**
   * Returns all the accounts except the main account
   * @returns {Array}
   */
  _getAdditionalAccounts() {
    this._accounts.filter(account => account.isPrincipalAccount === false);
    return this._accounts.map(({alias, number}) => ({
      alias,
      description: {
        value: number,
        masked: true
      }
    }));
  }

  /**
   * Check the requirements to know if the recipient secction will be displayed
   * @returns {Boolean}
   */
  _showRecipientSection() {
    const principalAccount = this._getPrincipalAccount();
    const principalAccountType = this.get('type', principalAccount) || '';
    const principalAccountStatus = this.get('status', principalAccount) || '';
    const checkAditionalAccounts = this._accounts.some(item => item.status === 'ACTIVE' && item.type === 'SINGLE');
    const flagRecipientsActive = this.native ? this.flagToShowRecipientsSection : true;
    return !this.isGlomoMiniorAccount && ((principalAccountType === 'SINGLE' && principalAccountStatus === 'ACTIVE') || checkAditionalAccounts) && flagRecipientsActive;
  }

  /**
   * Setting the data to the propertie _accounts and parsed when is come from the channel
   * getFinancialOverviewDetails in repo glomo-mx
   * @returns {Object}
   */
  _setAccountsFromFinancialOverviewDetails() {
    const contracts = this.get('data.contracts', this.financialOverviewDetails) || [];
    if (contracts.length > 0) {
      const getAccounts = contracts.filter(account => account.productType === 'ACCOUNT');
      this._accounts = getAccounts.map(this._getAccountFromFinancialOverview.bind(this));
    }
  }

  /**
   * Returns and object with the structure to get the account from financial overview
   * @returns {Object}
   */
  _getAccountFromFinancialOverview(account) {
    const indicators = this.get('detail.indicators', account) || [];
    return {
      'id': this.get('id', account) || '',
      'alias': this.get('alias', account) || '',
      'number': this.get('number', account) || '',
      'status': this.get('status.id', account) || '',
      'type': this.get('signedAuthorization.id', account) || '',
      'isPrincipalAccount': indicators.some(item => item.id === 'IS_PRINCIPAL_ACCOUNT' && item.isActive === true)
    };
  }

  /**
   * Setting the data to the propertie _accounts and parsed when is come from the channel
   * global_cache_channels in repo glomocells
   * @returns {Object}
   */
  _setAccountsFromGlobalCacheStorage() {
    const accounts = this.get('dashboard.accounts', this.globalCacheStorage) || [];
    if (accounts.length > 0) {
      this._accounts = accounts.map(this._getAccountFromGlobalCachel.bind(this));
    }
  }
  getPrincipalAccountFromIos(account) {
    return account.indicators.some(item => item.id === 'IS_PRINCIPAL_ACCOUNT' && item.isActive === true);
  }
  getPrincipalAccountFromAndroid(account) {
    const principalAccountId = this.get('principalAccount.id', account) || '';
    const isActivePrincipalAccount =  this.get('principalAccount.isActive', account) || false;
    return  principalAccountId === 'IS_PRINCIPAL_ACCOUNT' && isActivePrincipalAccount === true;
  }
  /**
   * Returns and object with the structure to get the account from global cache storage
   * @returns {Object}
   */
  _getAccountFromGlobalCachel(account) {
    const customizedFormats = this.get('customizedFormats', account) || [ {id: ''} ];
    const type = this.isNativeIos ? this.get('signedAuthorization.id', account) || '' : customizedFormats[0].id;
    const setValuePrincipalAccount = this.isNativeIos ? this.getPrincipalAccountFromIos(account) : this.getPrincipalAccountFromAndroid(account);

    return {
      'id': this.get('accountId', account) || '',
      'alias': this.get('alias', account) || '',
      'number': this.get('number', account) || '',
      'status': this.get('status.id', account) || '',
      type,
      'isPrincipalAccount': setValuePrincipalAccount
    };
  }
  /**
   * Setting the _principalAccountId value
   * Checks if the recipient secction has participants.
   */
  _getAccountsParsed() {
    if (this._accounts.length > 0 ? this._accounts[0].id !== '' : false) {
      this._principalAccountId = this._getPrincipalAccount().id;
      if (this._showRecipientSection()) {
        if (this._principalAccountId !== '') {
          this._requestListParticipants(this._principalAccountId);
        } else {
          this._dispatch('profile-manager-has-recipients-principal-account', false);
          this._dispatch('accounts-client', {
            'accounts': {},
            'myAccount': [],
            'showRecipientSection': true
          });
        }
      }
    }
  }

  /**
   * Gets the principal account.
   * Gets de Aditional accounts.
   * Sets the value to evaluate if the recipient section will ve displayed.
   * @event 'accounts-client' when the data is setting correctly.
   * @event 'accounts-client-error' display and error message.
   */
  _fireDataAccounts() {
    const principalAccount = this._getPrincipalAccount();
    const aditionalAccounts = this._getAdditionalAccounts();
    const showRecipientSection = this._showRecipientSection();

    if (Object.keys(principalAccount).length) {
      this._dispatch('accounts-client', {
        'accounts': aditionalAccounts,
        'myAccount': principalAccount,
        'showRecipientSection': showRecipientSection
      });
    } else {
      this._dispatch('accounts-client-error', true);
    }
  }

  /**
   * init profile, validate if core is native and native cache are
   * available, otherwise, we have to interrupt all profile process
   * in order to request client id from native storage
   * validate the accounts to display the recipient section
   */
  init() {
    this.showVeil();
    if (this.native && !this.useNativeCache) {
      this.requestClientId();
    } else {
      this.bootProfile();
    }
    this._getTddeDataStorage('isMonoEnterpriseDebitCardClient');
    this._isTDDEMonoproductClientCacheFlag = this.get('nativeCache.isMonoEnterpriseDebitCardClient', this.globalCacheStorage) || false;
    this._saveTDDEMonoproductflag();
    this._displayContractsSection();
    this._getAvatar();
    if (this.isGlomoMiniorAccount) {
      this._dispatch('unsubscribe-section-glomo-minior', false);
      this._dispatch('hide-fiscal-section-glomo-minior', true);
      this.featureFlags.editINE = false;
    }
  }

  /**
   * request client id to native local storage
   */
  requestClientId() {
    this._dispatch('get-local-storage', {
      key: 'loginData',
      secure: true
    });
  }

  /**
   * handle login data from native local storage (client id)
   * @param {Object} data
   */
  handleLoginData(data) {
    this.clientId = this.clientId || this.get('grantingTicketUserId', data) || '';
  }

  /**
   * Requests listCustomer avatar
   * @event 'get-local-storage'
   */
  _getAvatar() {
    if (this._flagAvatar) {
      this._requestGenericResource('CUSTOMERS', { expand: 'indicators,avatars' });
    } else {
      this._dispatch('get-local-storage', { key: 'new_avatar_profile' });
    }
  }

  /**
   * init all profile by setting customer info, feature flags and
   * storage, http requests
   */
  bootProfile() {
    if (this.useNativeCache) {
      this.customerId = this.c(this.globalCacheStorage, 'customer.customerId', '');
      this.clientId = this.c(this.globalCacheStorage, 'customer.clientId', '');
      this._setAccountsFromGlobalCacheStorage();
      this._requestFlagStatus('profile', 'recipients');
      this._requestFlagStatus('dashboard', 'customerLoginsIndicators');
      this._getNativeShellFlags();
    } else {
      this._isDigitalNativeUser = this._computeDigitalNativeUser();
      this._setAccountsFromFinancialOverviewDetails();
      this.featureFlags = this.routeParams;
      this._dispatch('get-local-storage', { key: 'know_your_client_exception' });
    }
    if (!this.native) {
      this._getAccountsParsed();
    }
    this._dispatch('get-local-storage', { key: 'new_avatar_profile' });
    this._dispatchOnOffFlags(this.featureFlags);
    if (!this.isGlomoMiniorAccount) {
      this._requestListContractingDossiers();
    } else {
      this._startInitialCustomerDataRequests();
    }
  }

  /**
   * take financial overview contracts in order to determine
   * if current user is native digital
   * @returns {Boolean}
   */
  _computeDigitalNativeUser() {
    const contracts = this.c(this.financialOverviewDetails, 'data.contracts', []);
    const accounts = contracts.filter(item => this.c(item, 'productType') === 'ACCOUNT');
    if (accounts.length === 0) {
      return true;
    } else if (accounts.length === 1) {
      const isDigital = this.c(accounts[0], 'detail.indicators.3.isActive');
      const level = this.c(accounts[0], 'detail.level');
      const isN2 = level === '02';
      const deposits = contracts.filter(item => this.c(item, 'productType') === 'DEPOSITS');
      const investmentFunds = contracts.filter(item => this.c(item, 'productType') === 'INVESTMENT_FUNDS');
      const cards = contracts.filter(item => this.c(item, 'productType') === 'CARDS');
      const loans = contracts.filter(item => this.c(item, 'productType') === 'LOANS');
      const sumProducts = deposits.length + investmentFunds.length + cards.length + loans.length;
      return isDigital && isN2 && Boolean(sumProducts === 0);
    } else {
      return false;
    }
  }

  /**
   * get native flags when current app is native core
   */
  _getNativeShellFlags() {
    const params = this.c(this.routeParams, 'nameValuePairs') || this.routeParams;
    const { kycException, updateCustomerPersonalInfo, ...featureFlags } = params;
    this.featureFlags = featureFlags;
    this.kycException = kycException || false;
    this._isDigitalNativeUser = !updateCustomerPersonalInfo;
  }

  /**
   * Dispatch the url of the avatar profile to glomo-customer-profile
   * @param {Object} newAvatarProfile url and image on base64
   */
  sendAvatarProfile(newAvatarProfile) {
    if (!newAvatarProfile.url) {
      const avatarSrc = this.get('url', this.updateAvatarSuccess) || this.get('customer.avatars.url', this.globalCacheStorage);
      this._dispatchAvatarUrl(avatarSrc);
    } else {
      this._dispatchAvatarUrl(newAvatarProfile.image);
    }
    if (newAvatarProfile.code === 999 || newAvatarProfile.url === '') {
      this._flagProfileStorageError = true;
    }
  }

  /**
   * dispatch on/off flags to another components into the page
   * @param {Boolean} editAvatar
   */
  _dispatchOnOffFlags({ editAvatar }) {
    this._dispatch('glomo-customer-profile-set-edit-avatar-section-flag', !editAvatar);
    this._dispatch('glomo-customer-profile-set-edit-avatar-button-flag', editAvatar);
  }

  /**
   * Make list contracting dossiers http request
   * @event 'glomo-profile-manager-request-list-contracting-dossiers'
   */
  _requestListContractingDossiers() {
    this._dispatch('glomo-profile-manager-request-list-contracting-dossiers');
  }

  /**
   * Requests list participants
   * @param {Number} accountId
   * @event 'profile-manager-send-account-id'
   * @event 'profile-manager-list-participants'
   */
  _requestListParticipants(accountId) {
    this._dispatch('profile-manager-send-account-id', accountId);
    this._dispatch('profile-manager-list-participants');
  }

  /**
   * Handle the list participants request for the principal account
   * @param {Object} response
   * @event 'profile-manager-has-recipients-principal-account'
   * @event 'accounts-client-error'
   */
  handleParticipantsResponse(response) {
    const participants = this.get('participants', response) || [];
    const hasParticipants = participants.some(participant => participant.participantType.id !== 'HOLDER');
    this._dispatch('profile-manager-has-recipients-principal-account', hasParticipants);
    this._dispatch('accounts-client-error', false);
    this._fireDataAccounts();
  }

  /**
   * Retry method to handle the retry button
   * @event 'glomo-profile-manager-hide-recipients-retry-button'
   * @event 'accounts-client-error'
   */
  handleParticipantsError() {
    this._recipientsRetriesCounter++;
    if (this._recipientsRetriesCounter === 3) {
      this._dispatch('glomo-profile-manager-hide-recipients-retry-button', true);
    }
    this._dispatch('accounts-client-error', true);
  }

  /**
   * Retry method to get the data again
   * @event 'profile-manager-send-account-id'
   * @event 'profile-manager-list-participants'
   */
  retryRecipientsRequest() {
    this._dispatch('profile-manager-send-account-id', this._principalAccountId);
    this._dispatch('profile-manager-list-participants');
  }

  /**
   * handle list contracting dossiers response already mapped on glomo-customers-mx-dm
   * @param {Array} statusList
   */
  handleListContractingDossiers(statusList) {
    this.listContractingDossiersRetriesCounter = 0;
    this._listContractingDossiers = statusList;
    if (this._isDigitalNativeUser) {
      this._startInitialCustomerDataRequests();
    } else {
      this._requestListDocumentationDossiers();
    }
  }

  /**
   * handle list contracting dossiers error with limit retries validation
   * in order to block all process if server exceeds errors
   */
  handleListContractingDossiersError() {
    this.listContractingDossiersRetriesCounter = this.listContractingDossiersRetriesCounter + 1;
    if (this.listContractingDossiersRetriesCounter <= this.limitRetriesOnErrorResponse) {
      this._requestListContractingDossiers();
    } else {
      this.hideVeil();
      this.showLimitRetriesError();
    }
  }

  /**
   * make list documentation dossiers http request
   */
  _requestListDocumentationDossiers() {
    this._dispatch('glomo-profile-manager-request-list-documentation-dossiers', {
      'indicators.id': 'IS_PAYROLL_ACCOUNT',
      'indicators.isActive': true
    });
  }

  /**
   * handle list documentation dossiers response adn set pending payroll account flag
   * @param {Object} response
   */
  handleListDocumentationDossiers(response) {
    const statusType = this.c(response, 'statusType');
    this._pendingPayrollAccount = statusType === 'INCOMPLETE' || statusType === 'BLOCKED';
    this._startInitialCustomerDataRequests();
  }

  /**
   * handle list documentation dossiers error
   */
  handleListDocumentationDossiersError() {
    this._startInitialCustomerDataRequests();
  }

  /**
   * start initial customer resquests by requesting get customer
   */
  _startInitialCustomerDataRequests() {
    this.initialRequestsMode = true;
    this._requestGenericResource('CUSTOMER');
  }

  /**
   * generic nexx request by validating feature flags to skip
   * turned of as well as unnecessary requests and continue with
   * following requests. To send retries requests, follow retry buttons
   * on glomo-customer-porfile
   */
  _generateNextInitialRequest() {
    this._lastRequestIndex = this._lastRequestIndex + 1;
    if (this._lastRequestIndex < 4) {
      const currentRequest = this.customerDataRequests[this._lastRequestIndex];
      const { resource, featureFlag } = currentRequest;
      const shouldMakeCurrentRequest = this.c(this.featureFlags, featureFlag);
      if (resource === 'QUESTIONNAIRES' && shouldMakeCurrentRequest) {
        if (this._shouldMakeQuestionnairesRequest() && !this.isMonoproductUser) {
          this._requestGenericResource(resource, { 'questionnaire-id': 'KYC' });
        } else {
          this._generateNextInitialRequest();
        }
      } else if (shouldMakeCurrentRequest) {
        this._requestGenericResource(resource);
      } else {
        this._generateNextInitialRequest();
      }
    } else {
      this.initialRequestsMode = false;
      this._computeAndSetTopInfoBox();
      this._dispatch('glomo-profile-manager-set-customer', this._cloneObject(this._getState()));
      this.hideVeil();
    }
  }

  _shouldMakeQuestionnairesRequest() {
    const kyc = this._getDocumentStatus('kyc');
    const localStatus = kyc.status;
    if (this.kycException || this.performKycException) {
      this._customerKycQuestionnaire = this._getPendingKycSchema();
      Object.assign(this._fullfillmentDocuments, { kyc: false });
      return false;
    } else if (localStatus === 'O' || this.performKycUpdate) {
      this._customerKycQuestionnaire = this._getAnsweredQuestionnaireSchema();
      Object.assign(this._fullfillmentDocuments, { kyc: true });
      return false;
    } else {
      return true;
    }
  }

  /**
   * get kyc profile ui when kyc questionnaire is on exception case
   * @returns {Object}
   */
  _getPendingKycSchema() {
    return {
      title: 'glomo-customer-profile-questionnaire-pending',
      helpIcon: true,
      editButton: {
        visible: true,
        disabled: false
      },
      showBranchMessageInfo: true,
      showIncompleteWarning: true,
    };
  }

  /**
   * get kyc profile ui when kyc questionnaire is on answered case
   * @returns {Object}
   */
  _getAnsweredQuestionnaireSchema() {
    return {
      title: 'glomo-customer-profile-questionnaire-answered',
      helpIcon: true,
      editButton: {
        visible: true,
        disabled: true
      },
      showBranchMessageInfo: true,
      showIncompleteWarning: false
    };
  }

  /**
   * compute ui profile top info box depending on digital native user
   * and pending payroll account validations
   */
  _computeAndSetTopInfoBox() {
    let settings = {};
    if (this._isDigitalNativeUser) {
      settings = {
        message: 'glomo-customer-profile-info-not-full-profile-if-need-edit',
        type: 'info-dark',
        icon: 'coronita:info'
      };
    } else {
      const allDocumentsComplete = Object.values(this._fullfillmentDocuments).every(localDocument => localDocument);
      settings = this._pendingPayrollAccount
        ? this._getPendingAccountInfoMessage(allDocumentsComplete)
        : this._getCompleteAccountInfoMessage(allDocumentsComplete);
    }
    this._dispatch('glomo-profile-manager-show-info-box', true);
    this._dispatch('glomo-profile-manager-set-info-box', settings);
  }

  /**
   * get pending account info messages depending on documents fullfillment
   * @param {Boolean} allDocumentsComplete
   * @returns {Object}
   */
  _getPendingAccountInfoMessage(allDocumentsComplete) {
    return allDocumentsComplete
      ? {
        heading: 'glomo-customer-profile-info-not-full-profile-fill-expedient',
        message: 'glomo-customer-profile-info-not-full-profile-you-are-near',
        type: 'warning-dark',
        icon: 'coronita:caution'
      }
      : {
        heading: 'glomo-customer-profile-info-not-full-profile-fill-expedient',
        message: 'glomo-customer-profile-info-not-full-profile-we-detect',
        type: 'warning-dark',
        icon: 'coronita:caution',
        messages: this._getPendingDocumentsLabel()
      };
  }

  /**
   * list incomplete documents labels to show in top info message
   * @returns {Array}
   */
  _getPendingDocumentsLabel() {
    const messages = [];
    for (const key in this._fullfillmentDocuments) {
      if (this._missingDocumentsLabels[key].featureFlag && !this._fullfillmentDocuments[key]) {
        messages.push({
          title: this._missingDocumentsLabels[key].label
        });
      }
    }
    return messages;
  }

  /**
   * get complete account info messages settings
   * @param {Boolean} allDocumentsComplete
   * @returns {Object}
   */
  _getCompleteAccountInfoMessage(allDocumentsComplete) {
    return allDocumentsComplete
      ? {
        heading: 'glomo-customer-profile-info-not-full-profile-full-expedient',
        message: 'glomo-customer-profile-info-not-full-profile-if-need-edit',
        type: 'info-dark',
        icon: 'coronita:info'
      }
      : {
        heading: 'glomo-customer-profile-info-not-full-profile-fill-expedient',
        message: 'glomo-customer-profile-info-not-full-profile-if-you-fill',
        type: 'info-dark',
        icon: 'coronita:info'
      };
  }

  /**
   * dispatch events for customer data http requests
   * @param {String} resource
   * @param {Object} detail
   * @event glomo-profile-manager-request-{string}
   */
  _requestGenericResource(resource, detail) {
    resource = resource.toLowerCase();
    this._sendCustomerId(resource);
    const localEvent = `glomo-profile-manager-request-${resource}`;
    this._dispatch(localEvent, detail);
  }

  /**
   * @description dispatch event with global or local customerId
   * @param {String} resource
   * @event glomo-profile-manager-set-global-customer-id
   * @event glomo-profile-manager-set-global-customer-id-unmasked
   * @event glomo-profile-manager-set-local-customer-id
   */
  _sendCustomerId(resource) {
    if (this._enableGlobalProfileServices) {
      const resourceEventMap = {
        'addresses': 'glomo-profile-manager-set-global-customer-id',
        'contacts': 'glomo-profile-manager-set-global-customer-id',
        'addressUnmasked': 'glomo-profile-manager-set-global-customer-id-unmasked',
        'contactsUnmasked': 'glomo-profile-manager-set-global-customer-id-unmasked'
      };
      const localEvent = resourceEventMap[resource] || 'glomo-profile-manager-set-local-customer-id';
      this._dispatch(localEvent, resourceEventMap[resource] ? this._globalCustomerId : this.customerId);
    }
  }

  /**
   * handle get customer response by mapping personal information, identity documents,
   * tax residence and validate initial mode in order to follow initial request otherwise
   * set customer information on profile ui
   * @param {Object} response
   */
  handleGetCustomer(response) {
    const { identityDocuments, taxResidences, ...personalInformation } = response;
    this._customer = {};
    this._mapPersonalInformation(personalInformation);
    this._mapAdditionalDocuments(identityDocuments);
    this._mapTaxResidence(taxResidences, identityDocuments);
    this._requestFlagStatus('profile', 'editTaxData');
    this._customerHasResidence = Boolean(this.c(personalInformation, 'residence.id', false));
    this.showHidePersonalInformation = true;
    if (this.initialRequestsMode) {
      this._generateNextInitialRequest();
    } else {
      this.personalInfoRetriesCounter = 0;
      this.personalInfoErrorActive = false;
      this._computeAndSetTopInfoBox();
      this._dispatch('glomo-profile-manager-set-customer', this._cloneObject(this._getState()));
      this.hideVeil();
    }
  }

  /**
   * get current customer state when contacts, address, and kyc data is already set
   * but we need to complement with get customer response. Useful for get all initial state or
   * get customer retry response
   * @returns {Object}
   */
  _getState() {
    return this._cloneObject({
      ...this._customer,
      ...(this.featureFlags.editEmail && {
        info: this._contactsUnmasked ? this._contactsUnmaskedSnapshoot : this._contactsMaskedSnapshoot
      }),
      ...(this.featureFlags.editAddress && {
        address: this._addressUnmasked ? this._addressUnmaskedSnapshoot : this._addressMaskedSnapshoot
      }),
      ...(this.featureFlags.editKYC && {
        kyc: this._customerKycQuestionnaire
      })
    });
  }

  /**
   * index personal information into _customer prop state so is client number
   * @param {Object} personalInformation
   */
  _mapPersonalInformation(personalInformation) {
    this._customer = {
      ...personalInformation,
      identityDocuments: [ {
        id: 'client-number',
        key: 'glomo-customer-profile-client-number',
        value: this.clientId
      } ]
    };
  }

  /**
   * map additional documents into _customer state: curp and identifications by
   * checking if on/off flags are turned on/off
   * @param {Array} identityDocuments
   */
  _mapAdditionalDocuments(identityDocuments) {
    const additionalDocuments = [];
    if (this.featureFlags.editCurp) {
      this._mapCurp(identityDocuments, additionalDocuments);
    } else {
      Object.assign(this._fullfillmentDocuments, { curp: true });
    }
    if (this.featureFlags.editINE) {
      this._mapIdentifications(identityDocuments, additionalDocuments);
    } else {
      Object.assign(this._fullfillmentDocuments, { identification: true });
    }
    this._customer.additionalDocuments = additionalDocuments;
  }

  /**
   * map curp into additional documents by crossing status information as well
   * as fullfillment data by setting ui profile schema
   * @param {Array} identityDocuments
   * @param {Array} additionalDocuments
   */
  _mapCurp(identityDocuments, additionalDocuments) {
    const curpItem = identityDocuments.find(idDocument => this.c(idDocument, 'documentType.id') === 'CURP');
    const documentNumber = this.c(curpItem, 'documentNumber', '');
    if (curpItem && documentNumber) {
      const statusId = this.c(curpItem, 'status.id');
      const accepted = statusId === 'ACCEPTED';
      Object.assign(this._fullfillmentDocuments, { curp: accepted });
      additionalDocuments.push({
        type: 'curp',
        subType: accepted ? 'curp' : 'pending-curp',
        key: 'CURP',
        title: 'CURP',
        value: documentNumber,
        helpIcon: true,
        ...this._setCurpStatus(accepted)
      });
    } else if (!this._isDigitalNativeUser) {
      Object.assign(this._fullfillmentDocuments, { curp: false });
      additionalDocuments.push({
        type: 'curp',
        subType: 'pending-curp',
        title: 'CURP',
        showIncompleteWarning: true
      });
    }
  }

  /**
   * set curp status props
   * @param {Boolean} accepted
   * @returns {Object}
   */
  _setCurpStatus(accepted) {
    let editParams = {};
    if (!accepted) {
      editParams = {
        editButton: !this.isGlomoMiniorAccount,
        status: {
          title: 'glomo-customer-profile-confirm',
          class: 'confirm'
        },
        forceEditDisabled: this._isDigitalNativeUser,
        showIncompleteWarning: true
      };
    }
    return editParams;
  }

  /**
   * map identifications into additional documents by crossing status information as well
   * as fullfillment data, id labels by setting ui profile schema
   * @param {Array} identityDocuments
   * @param {Array} additionalDocuments
   */
  _mapIdentifications(identityDocuments, additionalDocuments) {
    let indexedIds = 0;
    const identifications = identityDocuments.filter(idDocument => {
      const documentTypeId = this.c(idDocument, 'documentType.id');
      return documentTypeId !== 'RFC' && documentTypeId !== 'CURP';
    });
    if (identifications.length > 1) {
      const mappedIds = identifications.map((identification, index) => {
        const value = this.c(identification, 'documentNumber');
        const subType = this.c(identification, 'documentType.id', '');
        const title = this.c(this.availableIdLabels, subType);
        if (index > 0 && subType && value && title) {
          const statusId =  this.c(identification, 'status.id', '');
          const showIncompleteWarning = statusId !== 'PARTIALLY_ACCEPTED' || !statusId;
          return {
            type: 'identification',
            subType,
            title,
            value,
            helpIcon: subType === 'INE',
            expirationDate: this._formatExpirationDate(this.c(identification, 'expirationDate', '')),
            editButton: !this.isGlomoMiniorAccount,
            status: this._setIdentificationStatus(statusId),
            forceEditDisabled: statusId === 'IN_PROCESS' ? true : this._isDigitalNativeUser,
            showIncompleteWarning
          };
        } else {
          return null;
        }
      });
      mappedIds.forEach(id => {
        if (id) {
          additionalDocuments.push(id);
          indexedIds++;
        }
      });
      if (indexedIds === 0 && !this._isDigitalNativeUser) {
        Object.assign(this._fullfillmentDocuments, { identification: false });
        additionalDocuments.push({
          type: 'identification',
          title: 'glomo-customer-profile-id',
          showIncompleteWarning: true
        });
      }
    } else if (!this._isDigitalNativeUser) {
      Object.assign(this._fullfillmentDocuments, { identification: false });
      additionalDocuments.push({
        type: 'identification',
        title: 'glomo-customer-profile-id',
        showIncompleteWarning: true
      });
    }
  }

  /**
   * change INE expiration date format
   * @param {String} expirationDate
   * @returns {String}
   */
  _formatExpirationDate(expirationDate) {
    return expirationDate ? moment(expirationDate).format('DD/MM/YYYY') : '';
  }

  /**
   * set identifications status props so is fullfillment status
   * @param {String} id
   * @returns {Object}
   */
  _setIdentificationStatus(id) {
    let title = '';
    let labelClass = '';
    switch (id) {
      case 'PARTIALLY_ACCEPTED':
        Object.assign(this._fullfillmentDocuments, { identification: true });
        break;
      case 'REJECTED':
        title = 'glomo-customer-profile-rejected';
        labelClass = 'rejected';
        Object.assign(this._fullfillmentDocuments, { identification: false });
        break;
      case 'EXPIRED del API':
        title = 'glomo-customer-profile-defeated';
        labelClass = 'rejected';
        Object.assign(this._fullfillmentDocuments, { identification: false });
        break;
      case 'IN_PROCESS':
        title = 'glomo-customer-profile-in-validation';
        labelClass = 'non-validated';
        Object.assign(this._fullfillmentDocuments, { identification: true });
        break;
      case 'INCOMPLETE':
        title = 'glomo-customer-profile-incomplete';
        labelClass = 'confirm';
        Object.assign(this._fullfillmentDocuments, { identification: false });
        break;
      default:
        Object.assign(this._fullfillmentDocuments, { identification: false });
        break;
    }
    return {
      id,
      ...(title ? { title } : {}),
      ...(labelClass ? { class: labelClass } : {}),
    };
  }

  /**
   * map tax residences schema to show on profile ui by setting it
   * on _customer state as well as tax residence fullfillment state
   * @param {Array} taxResidences
   * @param {Array} identityDocuments
   */
  _mapTaxResidence(taxResidences, identityDocuments) {
    if (!this.isGlomoMiniorAccount && this.get('featureFlags.editFatca') && taxResidences) {
      const hasInformedTaxResidences = Boolean(taxResidences.length);
      const rfc = this._filterRfc(identityDocuments);
      const mainTaxResidence = hasInformedTaxResidences ? taxResidences[0] : this.defaultMainTaxResidence;
      const nonPresentialTaxResidences = taxResidences.filter((item, index) => item && index > 0);
      const hasAdditionalTaxResidences = Boolean(nonPresentialTaxResidences.length);
      this._customer.taxResidence = {
        ...(hasInformedTaxResidences && { title: hasAdditionalTaxResidences ?
          'glomo-customer-profile-mx-on-mexico-another-countries' :
          'glomo-customer-profile-mx-just-in-mexico' }),
        mainResidence: this._mapMainTaxResidence(rfc, mainTaxResidence),
        additionalResidences: this._mapNonPresentialTaxResidences(nonPresentialTaxResidences),
        userHasRfc: Boolean(rfc),
        hasInformedTaxResidences,
        ...this._setTaxResidenceStatus(hasInformedTaxResidences)
      };
    } else {
      Object.assign(this._fullfillmentDocuments, { taxResidence: true });
    }
  }

  /**
   * filter rfc number from identity documents
   * @param {Array} identityDocuments
   * @returns {String}
   */
  _filterRfc(identityDocuments) {
    const rfc = identityDocuments.find(item => this.c(item, 'documentType.id') === 'RFC');
    return this.c(rfc, 'documentNumber', '');
  }

  /**
   * map main tax residence (pos 0 assumed as main tax residence based
   * on raml definition)
   * @param {String} rfc
   * @param {Object} mainTaxResidence
   * @returns {Object}
   */
  _mapMainTaxResidence(rfc, mainTaxResidence) {
    return {
      ...this._createTaxResidenceItem(mainTaxResidence),
      identifierFiscalNumber: rfc ? rfc : this.c(mainTaxResidence, 'taxPayer.identityDocument.documentNumber', '')
    };
  }

  /**
   * map non presential/secondary tax residencees (pos 1+ assumed as
   * additional tax residences based on raml definition)
   * @param {Array} residences
   * @returns {Array}
   */
  _mapNonPresentialTaxResidences(residences) {
    return residences.length > 0 ? residences.map(item => {
      return {
        ...this._createTaxResidenceItem(item),
        identifierFiscalNumber: this.c(item, 'taxPayer.identityDocument.documentNumber', '')
      };
    }) : [];
  }

  /**
   * map one tax residence item by id, name
   * @param {Object} taxResidence
   * @returns {Object}
   */
  _createTaxResidenceItem(taxResidence) {
    return {
      id: this.c(taxResidence, 'country.id', ''),
      name: this._formatProperName(this.c(taxResidence, 'country.name', ''))
    };
  }

  /**
   * format proper name usefull for parse country/person names, ex:
   * estados unidos de america -> Estados Unidos de America
   * @param {String} name
   * @returns {String}
   */
  _formatProperName(localName) {
    const fixedName = localName.replace(/#/g, 'Ñ').toLowerCase();
    const listWords = fixedName.split(' ');
    const capitalizedWords = listWords.map(word => {
      return word === 'de'
        ? word
        : word.substr(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    });
    return capitalizedWords.join(' ');
  }

  /**
   * set tax residence status props
   * @param {Boolean} hasInformedTaxResidences
   * @returns {Object}
   */
  _setTaxResidenceStatus(hasInformedTaxResidences) {
    const taxResidence = this._getDocumentStatus('taxResidence');
    const localStatus = taxResidence.status;
    const isPendingStatus = localStatus === 'C' || localStatus === 'R';
    const isCompleteStatus = localStatus === 'E' || localStatus === 'Q';
    const isOnHoldStatus = this.taxResidenceJustUpdated || !localStatus;
    const result = { helpIcon: true };
    if (localStatus === 'A' && !hasInformedTaxResidences) {
      Object.assign(result, {
        showIncompleteWarning: true
      });
    } else {
      Object.assign(result, {
        editButton: !isOnHoldStatus,
        showHide: true,
        showIncompleteWarning: isPendingStatus,
        ...(isPendingStatus && {status: {
          id: localStatus,
          title: localStatus === 'C' ? 'glomo-customer-profile-confirm' : 'glomo-customer-profile-rejected',
          class: localStatus === 'C' ? 'confirm' : 'rejected'
        }})
      });
    }
    Object.assign(this._fullfillmentDocuments, { taxResidence: (isOnHoldStatus || isCompleteStatus) });
    return result;
  }

  /**
   * handle get customer error by reset _customer, fullfillment state and
   * considering initial mode in order to continue next initial requests or
   * just hide veil. If limit retries are exceed, set limit settings for info message
   */
  handleGetCustomerError() {
    this.personalInfoRetriesCounter = this.personalInfoRetriesCounter + 1;
    Object.assign(this._fullfillmentDocuments, { curp: true });
    Object.assign(this._fullfillmentDocuments, { identification: true });
    Object.assign(this._fullfillmentDocuments, { taxResidence: true });
    if (this.initialRequestsMode) {
      this._customer = {
        ...(this.routeParams.editFatca ? { taxResidence: {} } : {})
      };
      this.showHidePersonalInformation = false;
      this._dispatch('glomo-profile-manager-change-customer-retry-message', 'glomo-customer-profile-retry-error-message');
      this._dispatch('glomo-profile-manager-hide-customer-retry-button', false);
      this.personalInfoErrorActive = true;
      this._generateNextInitialRequest();
    } else {
      this.hideVeil();
    }
    if (this.personalInfoRetriesCounter > this.limitRetriesOnErrorResponse) {
      this._dispatch('glomo-profile-manager-change-customer-retry-message', 'glomo-customer-profile-limit-retries-error-message');
      this._dispatch('glomo-profile-manager-hide-customer-retry-button', true);
    }
  }

  /**
   * handle get customer contacts response and set _customerContactDetails state
   * also considering initial request mode in ordet to follow next request or
   * set retry error on profile
   * @param {Array} response
   */
  handleGetCustomerContacts(response) {
    const thereAreContacts = Boolean(this.c(response, 'length', 0));
    this._customerContactDetails = response;
    if (thereAreContacts) {
      this._setMobileStatus();
      this._setEmailStatus();
      this._setContactsProps();
    }
    if (this.initialRequestsMode) {
      this._generateNextInitialRequest();
    } else {
      this.contactsRetriesCounter = 0;
      this.customerContactsErrorActive = false;
      this._computeAndSetTopInfoBox();
      this._dispatch('glomo-profile-manager-set-contacts', this._cloneObject(this._customerContactDetails));
      this.hideVeil();
    }
  }

  /**
   * set mobile item settings if this item is present
   */
  _setMobileStatus() {
    const mobile = this._customerContactDetails.find(item => item.isMobile);
    if (mobile) {
      mobile.showHide = true;
    }
  }

  /**
   * set email status settings based on isValidated flag (just v1 customers)
   */
  _setEmailStatus() {
    const email = this._customerContactDetails.find(item => typeof item.isMobile === 'boolean' && !item.isMobile);
    if (email) {
      const emailHasStatus = typeof email.isValidated === 'boolean';
      const emailHasValue = Boolean(email.value);
      this.enableEmailValidation = emailHasStatus;
      email.showHide = emailHasValue;
      email.editButton = this.isGlomoMiniorAccount ? false : emailHasStatus && emailHasValue;
    }
  }

  /**
   * set contacts state and unmasked state
   */
  _setContactsProps() {
    this._contactsUnmasked = this.c(this._customerContactDetails, '0.unmasked', false);
    if (this._contactsUnmasked) {
      this._unmaskingContacts = false;
      this._contactsUnmaskedSnapshoot = this._cloneObject(this._customerContactDetails);
    } else {
      this._contactsMaskedSnapshoot = this._cloneObject(this._customerContactDetails);
    }
  }

  /**
   * validate if contacts were unmasked before in order to avoid new
   * http request in the same profile session otherwise, make the request
   */
  unmaskCustomerContacts() {
    this._unmaskingContacts = true;
    if (this._contactsUnmaskedSnapshoot.length) {
      this._dispatch('glomo-profile-manager-set-contacts', this._cloneObject(this._contactsUnmaskedSnapshoot));
    } else {
      this._sendCustomerId('contactsUnmasked');
      this._dispatch('glomo-profile-manager-request-contacts-unmasked', { unmasked: true });
    }
  }

  /**
   * send cached masked contacts to ui
   */
  maskCustomerContacts() {
    this._dispatch('glomo-profile-manager-set-contacts', this._cloneObject(this._contactsMaskedSnapshoot));
  }

  /**
  * handle get contacts error considering initial mode in order to
  * continue next initial request otherwise just hide veil and validate
  * limit retries to set ad hoc message
  */
  handleGetCustomerContactsError() {
    this.contactsRetriesCounter = this.contactsRetriesCounter + 1;
    if (this.initialRequestsMode) {
      this._customerContactDetails = [{ isMobile: true, showHide: false }, {}];
      this._contactsMaskedSnapshoot = [{ isMobile: true, showHide: false }, {}];
      this._dispatch('glomo-profile-manager-change-contacts-retry-message', 'glomo-customer-profile-retry-error-message');
      this._dispatch('glomo-profile-manager-hide-contacts-retry-button', false);
      this.customerContactsErrorActive = true;
      this._generateNextInitialRequest();
    } else {
      this.hideVeil();
    }
    if (this.contactsRetriesCounter > this.limitRetriesOnErrorResponse) {
      this._dispatch('glomo-profile-manager-change-contacts-retry-message', 'glomo-customer-profile-limit-retries-error-message');
      this._dispatch('glomo-profile-manager-hide-contacts-retry-button', true);
    }
  }

  /**
   * handle unmask contacts error, this method validates retries instead
   * of initial request cause retry is just possible with initial success of contacts
   */
  handleGetCustomerContactsUnmaskedError() {
    this.contactsRetriesCounter = this.contactsRetriesCounter + 1;
    if (this.contactsRetriesCounter <= 1) {
      this._customerContactDetails = [{ isMobile: true, showHide: false }, {}];
      this._contactsMaskedSnapshoot = [{ isMobile: true, showHide: false }, {}];
      this._dispatch('glomo-profile-manager-set-contacts', this._cloneObject(this._customerContactDetails));
      this._dispatch('glomo-profile-manager-change-contacts-retry-message', 'glomo-customer-profile-retry-error-message');
      this._dispatch('glomo-profile-manager-hide-contacts-retry-button', false);
      this.customerContactsErrorActive = true;
    } else if (this.contactsRetriesCounter > this.limitRetriesOnErrorResponse) {
      this._dispatch('glomo-profile-manager-change-contacts-retry-message', 'glomo-customer-profile-limit-retries-error-message');
      this._dispatch('glomo-profile-manager-hide-contacts-retry-button', true);
    }
    this.hideVeil();
  }

  /**
   * retry contacts request validating if masked/unmasked process is running
   */
  retryContactsRequest() {
    this.showVeil();
    if (this._unmaskingContacts) {
      this._dispatch('glomo-profile-manager-request-contacts-unmasked', { unmasked: true });
    } else {
      this._requestGenericResource('contacts');
    }
  }

  /**
   * handle get customer address response, set status and validate initial mode
   * in order to follow next request or set unasmekd/retry schema
   * @param {Object} response
   */
  handleGetCustomerAddresses(response) {
    const thereIsAddress = this.c(response, 'addressId', '');
    if (thereIsAddress) {
      this._addressStatusResponse(response);
      this._setAddressProps();
    } else {
      this._customerAddress = {};
      Object.assign(this._fullfillmentDocuments, { address: false });
    }

    if (this.initialRequestsMode) {
      this._generateNextInitialRequest();
    } else {
      this.addressRetriesCounter = 0;
      this.addressErrorActive = false;
      if (this._addressUnmasked) {
        const title = this.c(this._customerAddress, 'title', '');
        this._dispatch('glomo-profile-manager-change-address-mask', { title, unmasked: true });
      } else {
        this._computeAndSetTopInfoBox();
        this._dispatch('glomo-profile-manager-set-address', this._cloneObject(this._customerAddress));
      }
      this.hideVeil();
    }
  }

  /**
   * Complement for handleGetCustomerAddresses that validates if there is a TDDE monoproduct
   * @param {Object} response
   */
  _addressStatusResponse(response) {
    if (this.isTDDEMonoproductflag) {
      this._customerAddress = false;
    } else {
      this._customerAddress = this._setAddressStatus(response);
    }
  }

  /**
   * set address status settings and fullfillment state
   * @param {Object} response
   * @returns {Object}
   */
  _setAddressStatus(response) {
    const address = this._getDocumentStatus('address');
    const addressStatus = address.status;
    const showIncompleteWarning = addressStatus === 'I' || addressStatus === 'R';
    const monoproduct = {
      ...response,
      helpIcon: true,
      showHide: !this.isGlomoMiniorAccount,
      editButton: this.isGlomoMiniorAccount,
    };

    if (showIncompleteWarning || addressStatus === 'Q') {
      Object.assign(monoproduct, {
        status: {
          id: addressStatus,
          ...this.addressStatusConfig[addressStatus]
        }
      });
    }
    Object.assign(this._fullfillmentDocuments, { address: !showIncompleteWarning });
    const initConfig = {
      editButton: !this.isGlomoMiniorAccount,
      showIncompleteWarning
    };
    const result = {...monoproduct, ...initConfig};
    return this.isMonoproductUser ? monoproduct : result;
  }

  /**
   * set address state and unmasking state
   */
  _setAddressProps() {
    this._addressUnmasked = this.c(this._customerAddress, 'unmasked', false);
    if (this._addressUnmasked) {
      this._unmaskingAddress = false;
      this._addressUnmaskedSnapshoot = this._cloneObject(this._customerAddress);
    } else {
      this._addressMaskedSnapshoot = this._cloneObject(this._customerAddress);
    }
  }

  /**
   * unmask customer address by checking if address was unmasked before
   * to avoid request again in the same profile session
   * @event glomo-profile-manager-change-address-mask
   * @event glomo-profile-manager-request-address-unmasked
   */
  unmaskCustomerAddress() {
    this._unmaskingAddress = true;
    if (this._addressUnmaskedSnapshoot.addressId) {
      const title = this.c(this._addressUnmaskedSnapshoot, 'title', '');
      this._dispatch('glomo-profile-manager-change-address-mask', { title, unmasked: true });
    } else {
      this._sendCustomerId('addressUnmasked');
      this._dispatch('glomo-profile-manager-request-address-unmasked', { unmasked: true });
    }
  }

  /**
   * mask customer address using inital snapshoot information
   */
  maskCustomerAddress() {
    const title = this.c(this._addressMaskedSnapshoot, 'title', '');
    this._dispatch('glomo-profile-manager-change-address-mask', { title, unmasked: false });
  }

  /**
   * handle get customer address error by checking initial mode in order
   * to continue next initial request or just hide veil/limit retries
   */
  handleGetAddressesError() {
    this.addressRetriesCounter = this.addressRetriesCounter + 1;
    Object.assign(this._fullfillmentDocuments, { address: true });
    if (this.initialRequestsMode) {
      this._dispatch('glomo-profile-manager-change-address-retry-message', 'glomo-customer-profile-retry-error-message');
      this._dispatch('glomo-profile-manager-hide-address-retry-button', false);
      this.addressErrorActive = true;
      this._generateNextInitialRequest();
    } else {
      this.hideVeil();
    }
    if (this.addressRetriesCounter > this.limitRetriesOnErrorResponse) {
      this._dispatch('glomo-profile-manager-change-address-retry-message', 'glomo-customer-profile-limit-retries-error-message');
      this._dispatch('glomo-profile-manager-hide-address-retry-button', true);
    }
  }

  /**
   * handle get addresses erro when user fail unmasking address
   */
  handleGetAddressesUnmaskedError() {
    this.addressRetriesCounter = this.addressRetriesCounter + 1;
    if (this.addressRetriesCounter <= 1) {
      this._customerAddress = { showHide: false };
      this._addressMaskedSnapshoot = { showHide: false };
      this._dispatch('glomo-profile-manager-set-address', this._cloneObject(this._customerAddress));
      this._dispatch('glomo-profile-manager-change-address-retry-message', 'glomo-customer-profile-retry-error-message');
      this._dispatch('glomo-profile-manager-hide-address-retry-button', false);
      this.addressErrorActive = true;
    } else if (this.addressRetriesCounter > this.limitRetriesOnErrorResponse) {
      this._dispatch('glomo-profile-manager-change-address-retry-message', 'glomo-customer-profile-limit-retries-error-message');
      this._dispatch('glomo-profile-manager-hide-address-retry-button', true);
    }
    this.hideVeil();
  }

  /**
   * retry address request depending on mask/unmask process
   */
  retryAddressesRequest() {
    this.showVeil();
    if (this._unmaskingAddress) {
      this._dispatch('glomo-profile-manager-request-address-unmasked', { unmasked: true });
    } else {
      this._requestGenericResource('addresses');
    }
  }

  /**
   * handle kyc questionnaire and set fullfiillment, status state as well as
   * checking initial mode to continue next request otherwise send schema to ui
   * If _validateEmptyQuestinaries is false go to case add Kyc with status A
   * @param {Object} response
   */
  handleKycQuestionnaire(response) {
    this._customerKycQuestionnaire = this._setKycStatus();
    this._kycQuestionnaireSnapshoot = response;
    if (!this.isGlomoMiniorAccount && this._validateEmptyQuestinaries(response)) {
      Object.assign(this._fullfillmentDocuments, { kyc: false });
      if (this.initialRequestsMode) {
        this._generateNextInitialRequest();
      } else {
        this.kycRetriesCounter = 0;
        this.kycErrorActive = false;
        this._computeAndSetTopInfoBox();
        this._dispatch('glomo-profile-manager-set-kyc', this._cloneObject(this._customerKycQuestionnaire));
        this.hideVeil();
      }
    } else {
      this._getDocumentStatus('kyc').status = 'A';
      this._setAddKycProps();
    }
  }

  /**
   * Validate if getQuestionaries is empty in a one data
   * @param {Object} dataQuestionaries
   * @returns {Boolean}
   */
  _validateEmptyQuestinaries(dataQuestionaries) {
    let statusDefault = false;
    let politicActivity = this.get('politicActivity.isPublicOfficer', dataQuestionaries) !== undefined;
    let representations = this.c(dataQuestionaries, 'representations.0') !== undefined;
    let bank = this.c(dataQuestionaries, 'bank.relationType') !== undefined;
    let credit = this.c(dataQuestionaries, 'credit.paysInAdvance') !== undefined;
    let purpose = this.c(dataQuestionaries, 'account.purpose.description') !== undefined;
    let sourceFounds = this.c(dataQuestionaries, 'account.sourceFunds.description') !== undefined;
    let operations = this.c(dataQuestionaries, 'account.operations.0') !== undefined;
    if (politicActivity && representations && bank && credit && purpose && sourceFounds && operations) {
      statusDefault = true;
    }
    return statusDefault;
  }

  /**
   * set kyc status settings
   * @returns {Object}
   */
  _setKycStatus() {
    const kyc = this._getDocumentStatus('kyc');
    const kycStatus = kyc.status;
    const isRejectedStatus = kycStatus === 'R';
    return {
      title: 'glomo-customer-profile-questionnaire-answered',
      helpIcon: true,
      status: {
        title: isRejectedStatus
          ? 'glomo-customer-profile-rejected'
          : 'glomo-customer-profile-confirm',
        class: isRejectedStatus ? 'rejected' : 'confirm'
      },
      editButton: {
        visible: true,
        disabled: false
      },
      showBranchMessageInfo: false,
      showIncompleteWarning: true
    };
  }

  /**
   * handle kyc questionnaire request error validating if status of
   * this document is A cause business rule otherwise setting error props
   */
  handleKycQuestionnaireError() {
    const kyc = this._getDocumentStatus('kyc');
    const kycStatus = kyc.status;
    if (kycStatus === 'A') {
      this._setAddKycProps();
    } else {
      this._setErrorKycProps();
    }
  }

  /**
   * set kyc profile ui settings validating initial mode to continue
   * ot just hide veil
   */
  _setAddKycProps() {
    if (this.isTDDEMonoproductflag) {
      this._customerKycQuestionnaire = false;
    } else {
      this._customerKycQuestionnaire = {
        helpIcon: true,
        showBranchMessageInfo: false,
        showIncompleteWarning: true
      };
    }
    Object.assign(this._fullfillmentDocuments, { kyc: false });
    if (this.initialRequestsMode) {
      this._generateNextInitialRequest();
    } else {
      this.kycErrorActive = false;
      this.kycRetriesCounter = 0;
      if (!this.isGlomoMiniorAccount && !this.isMonoproductUser) {
        this._dispatch('glomo-profile-manager-set-kyc', this._cloneObject(this._customerKycQuestionnaire));
      }
      this.hideVeil();
    }
  }

  /**
   * set kyc error response ui settings depending initial mode to
   * set erro schema otherwise hide veil/limit retries
   */
  _setErrorKycProps() {
    this.kycRetriesCounter = this.kycRetriesCounter + 1;
    Object.assign(this._fullfillmentDocuments, { kyc: true });
    if (this.initialRequestsMode) {
      this._customerKycQuestionnaire = { title: '' };
      this._dispatch('glomo-profile-manager-change-kyc-retry-message', 'glomo-customer-profile-retry-error-message');
      this._dispatch('glomo-profile-manager-hide-kyc-retry-button', false);
      this.kycErrorActive = true;
      this._generateNextInitialRequest();
    } else {
      this.hideVeil();
    }
    if (this.kycRetriesCounter > this.limitRetriesOnErrorResponse) {
      this._dispatch('glomo-profile-manager-change-kyc-retry-message', 'glomo-customer-profile-limit-retries-error-message');
      this._dispatch('glomo-profile-manager-hide-kyc-retry-button', true);
    }
  }

  /**
   * retry kyc questionnaire request
   */
  retryKycQuestionnaireRequest() {
    this.showVeil();
    this._requestGenericResource('questionnaires', { 'questionnaire-id': 'KYC' });
  }

  /**
   * handle dismiss blocking error
   */
  handleDossiersErrorDismiss() {
    this.reset({ active: false });
  }

  /**
   * show limit retries error
   */
  showLimitRetriesError() {
    this._showFullModal(['profile-blockig-error', 'full-height-error close-button--right header--white-navy-blue',
      'profile-cells-title', './images/errors/error.svg',
      'profile-limit-retries-error-title', 'profile-limit-retries-button',
      [ { text: 'profile-limit-retries-error-message' } ]
    ]);
  }

  /**
   * show curp info modal depending on subType: 'pending-curp' | 'curp'
   * cause info is different by business rule
   * @param {String} subType
   */
  showCurpModal(subType) {
    if (subType === 'pending-curp') {
      this._showHalfModal(this._getGenericInfoModal('pending-curp', 'profile-curp-info-modal', 'coronita:help'));
    } else {
      this._showFullModal(['confirmated-curp', 'full-height-error close-button--right',
        'CURP', './images/info-CMB.svg', 'CURP', 'info-UNDERSTAND-accept',
        [ { text: 'profile-curp-modal-message' } ]
      ]);
    }
  }

  /**
   * show customer's incomplete data error in order to send it to a branch
   */
  showIncompleteDataError() {
    this._showFullModal(['customer-incomplete-data', 'full-height-error close-button--right header--white-navy-blue',
      'profile-incomplete-data-modal-title', './images/errors/error.svg',
      'profile-incomplete-data-modal-message', 'profile-tax-residence-understood-btn',
      [
        { text: 'profile-incomplete-data-modal-text-1' },
        { text: 'profile-incomplete-data-modal-text-2' }
      ]
    ]);
  }

  /**
   * show ine info modal
   */
  showIneModal() {
    this._showHalfModal(this._getGenericInfoModal('ine-info', 'profile-ine-info-modal', 'coronita:help'));
  }

  /**
   * show birth date info modal
   */
  showBirthDateInfomodal() {
    this._showHalfModal(this._getGenericInfoModal('birth-date-info', 'profile-birth-date-info-modal', 'coronita:help'));
  }

  /**
   * Create tax residence info modal and dispatch event to glomo-alert-manager
   */
  showMobileInfoModal() {
    this._showHalfModal(this._getGenericInfoModal('mobile-info', 'profile-mobile-info-modal', 'coronita:help'));
  }

  /**
   * Display the main modal for recipients
   */
  showRecipientModal() {
    this._showFullModal(['mobile-info', 'full-height-error link-aligned', 'profile-recipient-info-title', './images/beneficiaries/security.svg', 'profile-recipient-info-title', 'info-UNDERSTAND-accept',
      [
        {
          text: 'profile-recipient-info-first-message',
          class: 'text-align-left'
        },
        {
          list: [
            'bbva-multistep-profile-recipients-info-first-list-message',
            'bbva-multistep-profile-recipients-info-second-list-message'
          ],
          class: 'list'
        },
        {
          link: 'profile-recipient-info-link-message',
          hideIconLink: true,
          eventName: 'credit-card-payment-other-empty-cards',
          action: () => {
            this.showPrivacityRecipientModal();
          }
        }
      ]
    ]);
  }

  /**
   * Display the privacity modal
   */
  showPrivacityRecipientModal() {
    this._showFullModal(['mobile-info', 'full-height-info info header--white', 'profile-recipient-info-title-privacity', '', '', 'info-UNDERSTAND-accept',
      [
        {
          icon: 'coronita:info',
          iconClass: 'dark-core-blue'
        },
        {
          text: 'profile-recipient-info-privacity-first-text',
          class: 'spacing'
        },
        {
          text: 'profile-recipient-info-privacity-second-text',
          class: ''
        }
      ]
    ]);
  }

  /**
   * Create address info modal and dispatch event to glomo-alert-manager
   */
  showAddressInfoModal() {
    this._showHalfModal(this._getGenericInfoModal('address-info', 'profile-address-info-modal', 'coronita:help'));
  }

  /**
   * Create tax residence info modal and dispatch event to glomo-alert-manager
   */
  showTaxResidenceInfoModal() {
    this._showHalfModal(this._getGenericInfoModal('tax-residence-info', 'profile-tax-residence-info-modal', 'coronita:help'));
  }

  /**
   * Create kyc info modal and dispatch event to glomo-alert-manager
   */
  showKycInfoModal() {
    this._showHalfModal(this._getGenericInfoModal('kyc-info', 'profile-kyc-info-modal', 'coronita:help'));
  }

  /**
   * Create tax data info modal and dispatch event to glomo-alert-manager
   */
  showTaxDataInfoModal() {
    this._showHalfModal(this._getGenericInfoModal('tax-data-info', 'profile-tax-data-info-modal', 'coronita:help'));
  }

  /**
   * Create contracts info modal and dispatch event to glomo-alert-manager
   */
  showContractsInfoModal() {
    this._showFullModal(['contracts-info', 'full-height-error close-button--right',
      'profile-contracts-info-title', './images/info-CMB.svg', 'profile-contracts-info-title', 'info-UNDERSTAND-accept',
      [
        {
          text: 'profile-contracts-message-first',
        },
        {
          text: 'profile-contracts-message-second',
        },
      ]
    ]);
  }

  /**
   * show generic modal info half screen
   * @param {Array} modalInfo
   */
  _showHalfModal(modalInfo) {
    const modal = this._createHalfScreenModal.apply(this, modalInfo);
    this._dispatch('glomo-profile-manager-open-half-modal', modal);
  }

  /**
   * show generic modal info full screen
   * @param {Array} modalInfo
   */
  _showFullModal(modalInfo) {
    const modal = this._createFullScreenModal.apply(this, modalInfo);
    this._dispatch('glomo-profile-manager-open-full-modal', modal);
  }

  /**
   * create object to send data address and dispatch event to edit address
   */
  sendDataAddress() {
    const addrress = this._getDocumentStatus('address');
    const addrressStatus = addrress.status;
    let postalAddressEventName = this._isNewPostalAddressFlow ? 'glomo-profile-postal-address-management' : 'glomo-profile-manager-edit-customer-address';
    this._dispatch(postalAddressEventName, {
      customerId: this.customerId,
      email: this._getCustomerEmail(),
      addressId: this.c(this._addressUnmaskedSnapshoot, 'addressId'),
      ...(this._enableGlobalProfileServices ? { requireEncryptedAddressId: true } : {}),
      ...(addrressStatus === 'I' ? { zipCode: this.c(this._addressUnmaskedSnapshoot, 'zipCode', '') } : {})
    });
  }

  /**
   * open edit curp route with params
   */
  sendDataCurp() {
    const firstName = this.c(this._customer, 'firstName', '');
    const lastName = this.c(this._customer, 'lastName', '');
    const secondLastName = this.c(this._customer, 'secondLastName', '');
    const birthData = this.c(this._customer, 'birthData', {});
    const gender = this.c(this._customer, 'gender', {});
    if (firstName && lastName) {
      this._dispatch('glomo-profile-manager-edit-customer-curp', {
        customerId: this.customerId,
        firstName: firstName,
        lastName: lastName,
        secondLastName: secondLastName,
        curp: this._filterCurp(),
        email: this._getCustomerEmail(),
        birthData: birthData,
        gender: gender,
      });
    } else {
      this.showIncompleteDataError();
    }
  }

  /**
   * open edit ine route with params
   * @param {String} subType
   * @event 'glomo-profile-manager-routes-go-ine'
   * @event 'glomo-profile-manager-routes-go-national-id-validation'
   */
  sendDataIne(subType) {
    const localStatus = this._filterMainIdStatus();
    const firstName = this.c(this._customer, 'firstName', '');
    const lastName = this.c(this._customer, 'lastName', '');
    const nationalIdValidationFlag = this.get('value', this.featureFlagsProfile['glomo.profile.nationalIdAndVideoselfie']);
    if (firstName && lastName) {
      this._dispatch(`glomo-profile-manager-routes-go-${nationalIdValidationFlag ? 'national-id-validation' : 'ine'}`, {
        statusIncomplete: localStatus.id === 'INCOMPLETE',
        documentStatus: localStatus.id,
        customerId: this.customerId,
        otherId: subType !== 'INE',
        email: this._getCustomerEmail(),
        videoSelfieMode: false,
        segmentProfile: 'profile'
      });
    } else {
      this.showIncompleteDataError();
    }
  }

  /**
   * open add email route with params
   */
  addEmail() {
    this._dispatch('glomo-profile-manager-routes-go-email', {
      customerID: this.customerId
    });
  }

  /**
   * open edit email route with params
   */
  editEmail() {
    const email = this._contactsUnmaskedSnapshoot.find(item => !item.isMobile);
    this._dispatch('glomo-profile-manager-routes-go-email', {
      customerID: this.customerId,
      idEmail: this.c(email, 'id', ''),
      currentEmail: this.c(email, 'value', ''),
      statusEmail: this.c(email, 'isValidated', false),
      ...(this._enableGlobalProfileServices ? { requireEncryptedContactId: true } : {})
    });
  }

  /**
   * filter user curp
   * @param {Array} additionalDocuments
   * @returns {String}
   */
  _filterCurp() {
    const additionalDocuments = this.c(this._customer, 'additionalDocuments', []);
    const _curp = additionalDocuments.find(addtionalDocument => addtionalDocument.type === 'curp');
    return this.c(_curp, 'value', '');
  }

  /**
   * filter main id status (generally INE)
   * @param {Array} additionalDocuments
   * @returns {String}
   */
  _filterMainIdStatus() {
    const additionalDocuments = this.c(this._customer, 'additionalDocuments', []);
    const _ids = additionalDocuments.filter(addtionalDocument => addtionalDocument.type === 'identification');
    return this.c(_ids, '0.status', {});
  }

  /**
   * return customer email
   * @param {Array} contacts customer contacts
   * @returns {String}
   */
  _getCustomerEmail() {
    const email = this._customerContactDetails.find(item => !item.isMobile);
    return this.c(email, 'value', '');
  }

  /**
   * proxy add fatca link handler
   * @event 'glomo-profile-manager-routes-go-fatca-survey'
   */
  addTaxResidence() {
    const fatcaSurveyFlag = this.get('value', this.featureFlagsProfile['glomo.profile.fatcaValidationSurvey']);
    const payload = this._buildTaxResidencePayload(false);
    this._dispatch(`glomo-profile-manager-routes-go-fatca${fatcaSurveyFlag ? '-survey' : ''}`, payload);
  }

  /**
   * proxy edit fatca edit button handler
   * @event 'glomo-profile-manager-routes-go-fatca-survey'
   */
  editTaxResidence() {
    const fatcaSurveyFlag = this.get('value', this.featureFlagsProfile['glomo.profile.fatcaValidationSurvey']);
    const payload = this._buildTaxResidencePayload(true);
    this._dispatch(`glomo-profile-manager-routes-go-fatca${fatcaSurveyFlag ? '-survey' : ''}`, payload);
  }

  /**
   * build fatca initial payload for add/edit
   * @param {Boolean} thereAreAdditionalResidences
   * @returns {Object}
   */
  _buildTaxResidencePayload(thereAreAdditionalResidences) {
    const additionalResidences = this.c(this._customer, 'taxResidence.additionalResidences', []);
    const mainResidence = this.c(this._customer, 'taxResidence.mainResidence', {});
    const taxResidencesValidFormat = thereAreAdditionalResidences
      ? (this._validateTaxResidencesModel([ mainResidence ], false) && this._validateTaxResidencesModel([ ...additionalResidences ], true))
      : true;
    if (this.clientId && taxResidencesValidFormat) {
      const userHasRfc = this.c(this._customer, 'taxResidence.userHasRfc');
      return {
        expedientStatus: this.c(this._getDocumentStatus('taxResidence'), 'status'),
        customerData: {
          firstName: this.c(this._customer, 'firstName'),
          countryOfBirth: this.c(this._customer, 'birthData.country', {}),
          nationalities: this.c(this._customer, 'nationalities', []),
          countryOfDomicile: this.c(this._customer, 'residence', {}),
          rfc: userHasRfc ? this.c(mainResidence, 'identifierFiscalNumber') : '',
          email: this._getCustomerEmail(),
          clientId: this.clientId,
          customerId: this.customerId
        },
        taxResidenceInformation: {
          mainResidence,
          nonPresentialResidences: additionalResidences,
          userHasRfc: this.c(this._customer, 'taxResidence.userHasRfc')
        },
        segmentProfile: 'profile'
      };
    } else {
      this.showIncompleteDataError();
    }
  }

  /**
   * validte if each tax residence has all complete data
   * @param {Array} lisTaxResidences
   * @param {Boolean} considerNIF
   * @returns {Boolean}
   */
  _validateTaxResidencesModel(lisTaxResidences, considerNIF) {
    return lisTaxResidences.every(residence => Boolean(
      residence.id && residence.name && (considerNIF ? residence.identifierFiscalNumber : true)
    ));
  }

  /**
   * Open kyc route with params
   * Checks the `glomo.profile.kycValidationRefactor` flag and builds the KYC route with an optional '-validation' suffix
   * based on its value, redirecting the user to the appropriate KYC page.
   * @event 'glomo-profile-manager-routes-go-kyc'
   * @event 'glomo-profile-manager-routes-go-kyc-validation'
   */
  addKnowYourclient() {
    let kycValidationMXFlag = this.get('value', this.featureFlagsProfile['glomo.profile.kycValidationRefactor']);
    const payload = this._buildKycPayload(true);
    this._dispatch(`glomo-profile-manager-routes-go-kyc${kycValidationMXFlag ? '-validation' : ''}`, payload);
  }

  /**
   * Displays an error modal if there's a KYC exception, or redirects to the KYC route with an optional '-validation' suffix
   * based on the `glomo.profile.kycValidationRefactor` flag.
   * @event 'glomo-profile-manager-routes-go-kyc'
   * @event 'glomo-profile-manager-routes-go-kyc-validation'
   */
  editKnowYourClient() {
    let kycValidationMXFlag = this.get('value', this.featureFlagsProfile['glomo.profile.kycValidationRefactor']);
    if (this.kycException || this.performKycException) {
      this._showFullModal(['high-risk-kyc', 'full-height-error close-button--right',
        'profile-kyc-title', './images/errors/error.svg',
        'profile-kyc-high-risk-modal-title', 'info-UNDERSTAND-accept',
        [
          {
            text: 'profile-kyc-high-risk-modal-message',
          },
        ]
      ]);
    } else {
      const payload = this._buildKycPayload(true);
      this._dispatch(`glomo-profile-manager-routes-go-kyc${kycValidationMXFlag ? '-validation' : ''}`, payload);
    }
  }

  /**
   * build kyc initial payload
   * @returns {Object}
   */
  _buildKycPayload() {
    return {
      expedientStatus: this.c(this._getDocumentStatus('kyc'), 'status'),
      customerData: {
        email: this._getCustomerEmail(),
        clientId: this.clientId,
        customerId: this.customerId,
        firstName: this.c(this._customer, 'firstName')
      },
      questionnaire: this._kycQuestionnaireSnapshoot
    };
  }

  /**
   * show veil
   */
  showVeil() {
    this._dispatch('profile-manager-open-veil');
  }

  /**
   * hide veil
   */
  hideVeil() {
    this._dispatch('profile-manager-close-veil');
  }

  /**
   * reset this component properties to initial state
   * @param {Object} pageActive - The current page state
   * @param {boolean} pageActive.value - A flag indicating whether the page is active. If `false`, the reset occurs.
   * @param {String} pageActive.continue - The action to take after the reset. If equal to 'dashboard', the 'glomo-profile-manager-cancel-otp' event is dispatched.
   * @event glomo-profile-manager-cancel-otp
   * @event glomo-profile-manager-change-contacts-retry-message
   * @event glomo-profile-manager-hide-contacts-retry-button
   * @event glomo-profile-manager-change-customer-retry-message
   * @event glomo-profile-manager-hide-customer-retry-button
   * @event glomo-profile-manager-change-address-retry-message
   * @event glomo-profile-manager-hide-address-retry-button
   * @event glomo-profile-manager-change-kyc-retry-message
   * @event glomo-profile-manager-hide-kyc-retry-button
   * @event glomo-profile-manager-set-customer
   * @event glomo-profile-manager-show-info-box
   * @event glomo-profile-manager-set-info-box
   * @event glomo-customer-profile-retry-error-message
   */
  reset(pageActive) {
    if (pageActive && !pageActive.value) {
      this.newAvatarCreated = '';
      this.updateAvatarSuccess = '';
      this.maskCustomerContacts();
      this.maskCustomerAddress();
      this.customerTaxData = {};
      this._fullfillmentDocuments = {
        curp: true,
        identification: true,
        address: true,
        taxResidence: true,
        kyc: true
      };
      this.showEmptyInfoUpdateRFC = false;
      this.showGenericInfoUpdateRFC = false;
      this._setValueOnManyProps([
        '_isDigitalNativeUser', 'initialRequestsMode', 'kycException',
        'performKycException', 'performKycUpdate', '_customerHasResidence',
        'showHidePersonalInformation', 'enableEmailValidation',
        '_contactsUnmasked', '_addressUnmasked', '_unmaskingContacts', '_unmaskingAddress',
        'personalInfoErrorActive', 'customerContactsErrorActive', 'addressErrorActive', 'kycErrorActive',
      ], false);
      this._setValueOnManyProps([
        'listContractingDossiersRetriesCounter', '_lastRequestIndex',
        'personalInfoRetriesCounter', 'contactsRetriesCounter',
        'addressRetriesCounter', 'kycRetriesCounter',
        'listContractingDossiersRetriesCounter'
      ], 0);
      this._setValueOnManyProps([
        '_customer', '_customerAddress', '_customerKycQuestionnaire', '_kycQuestionnaireSnapshoot',
        '_addressUnmaskedSnapshoot', '_addressMaskedSnapshoot'
      ], {});
      this._setValueOnManyProps([
        '_listContractingDossiers', '_customerContactDetails',
        '_contactsUnmaskedSnapshoot', '_contactsUnmaskedSnapshoot'
      ], []);
      if (pageActive.continue === 'dashboard') {
        this._dispatch('glomo-profile-manager-cancel-otp');
      }
      this._dispatch('glomo-profile-manager-change-contacts-retry-message', 'glomo-customer-profile-retry-error-message');
      this._dispatch('glomo-profile-manager-hide-contacts-retry-button', false);
      this._dispatch('glomo-profile-manager-change-customer-retry-message', 'glomo-customer-profile-retry-error-message');
      this._dispatch('glomo-profile-manager-hide-customer-retry-button', false);
      this._dispatch('glomo-profile-manager-change-address-retry-message', 'glomo-customer-profile-retry-error-message');
      this._dispatch('glomo-profile-manager-hide-address-retry-button', false);
      this._dispatch('glomo-profile-manager-change-kyc-retry-message', 'glomo-customer-profile-retry-error-message');
      this._dispatch('glomo-profile-manager-hide-kyc-retry-button', false);
      this._dispatch('glomo-profile-manager-show-info-box', false);
      this._dispatch('glomo-profile-manager-set-info-box', {});
      this.hideVeil();
    }
  }

  /**
   * set a singular value in multiple props
   * @param {Array} propsList props to be modified
   * @param {String} value value to be settled
   */
  _setValueOnManyProps(propsList, value) {
    propsList.forEach(prop => this[prop] = value);
  }

  /**
   * Create half modal structure for glomo-alert-manager
   * @param {String} code modal code
   * @param {String} className modal's class
   * @param {String} buttonLabel confirm button label
   * @param {Array} contents modal's content
   * @returns {Object}
   */
  _createHalfScreenModal(code, className, buttonLabel, contents) {
    const modal = {
      code: code,
      selectedConfig: {
        className: className,
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: buttonLabel,
        template: {
          type: 'paragraphs',
          values: contents,
        }
      }
    };
    return modal;
  }

  /**
   * Create full modal structure for glomo-alert-manager
   * @param {String} code modal code
   * @param {String} className class of alert-manager
   * @param {String} title
   * @param {String} heroImage url of icon
   * @param {String} message modal message
   * @param {String} buttonLabel button label
   * @param {Array} contents list of contents in modal
   * @returns {Object}
   */
  _createFullScreenModal(code, className, title, heroImage, message, buttonLabel, contents) {
    const modal = {
      code: code,
      selectedConfig: {
        className: className,
        openMaximized: true,
        title: title,
        heroImage: heroImage,
        message: message,
        acceptBtLabel: buttonLabel,
        buttonsNotFixed: false,
        template: {
          type: 'paragraphs',
          values: contents,
        }
      }
    };
    return modal;
  }

  /**
   * create generic info modal
   * @param {String} type
   * @param {String} label
   * @returns {Object}
   */
  _getGenericInfoModal(type, label, icon) {
    return [type, 'alert info', 'info-UNDERSTAND-accept', [
      { icon: icon, iconClass: 'dark-core-blue' },
      { text: label, class: 'spacing--xs' }
    ]];
  }

  /**
   * Validate if avatar was changed
   * @param {String} url
   * @event 'glomo-customer-profile-set-avatar-image-url'
   */
  _dispatchAvatarUrl(url) {
    const showAvatar = this.newAvatarCreated ? `data:image/jpeg;base64,${this.newAvatarCreated}` : url;
    this._dispatch('glomo-customer-profile-set-avatar-image-url', showAvatar);
  }

  /**
   * Handle get customers response and send avatar from service if newAvatarCreated is empty
   * @param {Object} response
   */
  handleGetCustomers(response) {
    const avatar = this._findAvatar(response);
    this._dispatchAvatarUrl(avatar);
  }

  /**
   * Handle get customer error
   * @event 'get-local-storage'
   */
  handleCustomerError() {
    this._dispatch('get-local-storage', { key: 'new_avatar_profile' });
  }

  /**
   * filter service response and return avatar url
   * @param {*} resp
   * @returns {String}
   */
  _findAvatar(resp) {
    const [ result ] = resp.filter(item => item.avatars);
    if (Object.hasOwn(result, 'avatars')) {
      const { avatars: { url } } = result;
      return url;
    }
  }

  /**
   * filter status of list contracting dossiers documents by key,
   * available keys: address | taxResidence | kyc
   * @param {String} key
   * @returns {Object}
   */
  _getDocumentStatus(key) {
    const documentStatus = this._listContractingDossiers.find(dossierDocument => dossierDocument.key === key);
    return documentStatus || {};
  }

  /**
   * create a copy of certain object in order to avoid the use of
   * references in different scopes
   * @param {Object} obj
   * @returns {Object}
   */
  _cloneObject(obj) {
    return JSON.parse(JSON.stringify(obj));
  }

  /**
  * Send masked customer tax data
  * @event 'glomo-profile-manager-set-customer-fiscal-data'
  * @event 'feature-profile-customer-update-rfc'
  */
  mapMaskedTaxData() {
    let mapFiscalData = {};
    if (this._flagCustomerTaxData) {
      const { completeName } = this._customer;
      const rfc = this._getRfcCustomer();
      mapFiscalData = {
        fullName: completeName,
        rfc: rfc,
        showShowDataLink: true,
        helpIcon: 'coronita:help',
        editDataButtonDisabled: true,
        showHide: false,
        fiscalData: [
          {value: 'glomo-customer-profile-fiscal-data-fiscal-regime', key: '••••••••'},
          {value: 'glomo-customer-profile-fiscal-data-cfdi-use', key: '••••••••'},
          {value: 'glomo-customer-profile-fiscal-data-fiscal-address', key: '••••••••'}
        ],
        showEmptyFiscalInfo: false,
        showGenericFicalInfo: false,
        showEntryPointFiscalInfo: false
      };
    }
    this._dispatch('glomo-profile-manager-set-customer-fiscal-data', mapFiscalData);
    this._dispatch('feature-profile-customer-update-rfc', false);
  }

  /**
   * Fire event to request customer tax data and unmasked it
   */
  requestCustomerTaxData() {
    if (Object.keys(this.customerTaxData).length !== 0) {
      this._mapUnmaskedCustomerFiscalData();
    } else {
      this.showVeil();
      const params = {
        'customer-id': this.customerId
      };
      this._dispatch('glomo-profile-request-tax-data', params);
    }
  }

  /**
   * Send unmasked customer tax data
   * @param {Object} response
   */
  handleGetCustomerTaxData(response) {
    this.customerTaxData = response;
    this._mapUnmaskedCustomerFiscalData();
    this.hideVeil();
  }

  /**
  * @description get value feature flag for update rfc
  * @event feature-profile-customer-update-rfc
  */
  _sendFeatureFlagUpdateRfc() {
    if (this.featureFlagsProfile) {
      let value = this.get('value', this.featureFlagsProfile['glomo.profile.updateRfc']) || false;

      if (value) {
        this._dispatch('feature-profile-customer-update-rfc', value);
      }
    }
  }

  /**
  * Map un masked customer tax data
  */
  _mapUnmaskedCustomerFiscalData() {
    const unmaskedCustomerTaxData = {
      fullName: this._getCustomerTaxName(),
      rfc: this._getRfcCustomer(),
      showShowDataLink: true,
      helpIcon: 'coronita:help',
      editDataButtonDisabled: false,
      showHide: true,
      fiscalData: [
        {value: 'glomo-customer-profile-fiscal-data-fiscal-regime', key: this._getFiscalRegime()},
        {value: 'glomo-customer-profile-fiscal-data-cfdi-use', key: this._getTaxUses()},
        {value: 'glomo-customer-profile-fiscal-data-fiscal-address', key: this._getCustomerTaxAddress()}
      ],
      showEmptyFiscalInfo: this.showEmptyInfoUpdateRFC,
      showGenericFicalInfo: this.showGenericInfoUpdateRFC,
      showEntryPointFiscalInfo: !this.showEmptyInfoUpdateRFC && !this.showGenericInfoUpdateRFC
    };
    this._dispatch('glomo-profile-manager-set-customer-fiscal-data', unmaskedCustomerTaxData);
    this._sendFeatureFlagUpdateRfc();
  }

  /**
   * @description get document rfc of customer
   * @returns {String} document rfc
   */
  _getRfcCustomer() {
    const identityDocument = this.get('identityDocument', this.customerTaxData);

    if (identityDocument?.documentType?.id === 'RFC') {
      const documentNumber = this.get('documentNumber', identityDocument) || '';
      this.showGenericInfoUpdateRFC = this._isGenericRfc(documentNumber);

      return documentNumber;
    }
    return '';
  }

  /**
  * @description validate if is generic rfc
  * @param {String} documentRfc
  * @returns {Boolean} is generic Rfc
  */
  _isGenericRfc(documentRfc) {
    const expreGenericRfc = /^X[AE]XX\d{9}$/;
    return expreGenericRfc.test(documentRfc);
  }

  /**
   * Get customer tax name
   * @returns {String}
   */
  _getCustomerTaxName() {
    const { customer } = this.customerTaxData;
    const { firstName, lastName, secondLastName}  = customer;

    if (firstName === '' || lastName === '' || secondLastName === '') {
      this.showEmptyInfoUpdateRFC = true;
    }

    return `${firstName} ${lastName} ${secondLastName}`;
  }

  /**
   * Get customer tax address
   * @returns {String}
   */
  _getCustomerTaxAddress() {
    const { addressComponents } = this.customerTaxData.address.location || [];
    const street = this._getAddressTaxDataComponentName(addressComponents, 'STREET');
    const extNum = this._getAddressTaxDataComponentName(addressComponents, 'EXTERIOR_NUMBER');
    const intNum = this._getAddressTaxDataComponentName(addressComponents, 'INTERIOR_NUMBER');
    const colony = this._getAddressTaxDataComponentName(addressComponents, 'COLONY');
    const municipality = this._getAddressTaxDataComponentName(addressComponents, 'MUNICIPALITY');
    const estate = this._getAddressTaxDataComponentName(addressComponents, 'ESTATE');
    const zipCode = this._getAddressTaxDataComponentName(addressComponents, 'ZIP_CODE');

    if (street === '' || extNum === '' || colony === '' || municipality === '' || estate === '' || zipCode === '') {
      this.showEmptyInfoUpdateRFC = true;
    }

    return `${street} N.${extNum} ${intNum}, ${colony}, ${zipCode}, ${municipality}, ${estate}`;
  }

  /**
   * Get tax address component name
   * @param {Array} locationComponent
   * @param {String} componentType
   * @returns {String}
   */
  _getAddressTaxDataComponentName(locationComponent, componentType) {
    const findComp = itm => itm && itm.componentTypes && itm.componentTypes[0] === componentType;
    return locationComponent.find(findComp).name || '';
  }

  /**
   * Get customer fiscal regime
   * @returns {String}
   */
  _getFiscalRegime() {
    if (this.c(this.customerTaxData, 'taxRegimes.0.description', '') === '') {
      this.showEmptyInfoUpdateRFC = true;
    }
    return this.c(this.customerTaxData, 'taxRegimes.0.description', '');
  }

  /**
   * Get customer tax use
   * @returns {String}
   */
  _getTaxUses() {
    if (this.c(this.customerTaxData, 'taxRegimes.0.uses.0.description', '') === '') {
      this.showEmptyInfoUpdateRFC = true;
    }
    return this.c(this.customerTaxData, 'taxRegimes.0.uses.0.description', '');
  }

  /**
   * Send customer tax data object
   */
  sendEditCustomerTaxData() {
    const taxData = {
      customerId: this.customerId,
      customerTaxData: this.customerTaxData
    };
    this._dispatch('glomo-profile-edit-tax-data-event', taxData);
  }

  /**
   *  Throws event to request open web flag
   * @param {Object} module
   * @param {Object} feature
   */
  _requestFlagStatus(flagModule, feature) {
    this._dispatch('request-change-open-web-flag', {
      module: flagModule,
      feature
    });
  }

  /**
   * Set open web flag status and mask customer tax data
   * or the feature recipients will be enable
   * @param {Object} payload
   */
  setFlagStatus(payload) {
    const { feature, isFlagEnable } = payload;
    const payLoadModule = payload.module;
    if (payLoadModule === 'profile' && feature === 'editTaxData') {
      this._flagCustomerTaxData = isFlagEnable;
      this.mapMaskedTaxData();
    } if (payLoadModule === 'profile' && feature === 'recipients') {
      this.flagToShowRecipientsSection = isFlagEnable;
      this._getAccountsParsed();
    } if (payLoadModule === 'dashboard' && feature === 'customerLoginsIndicators') {
      this._flagAvatar = isFlagEnable;
      this._getCustomersRequest();
    }
  }


  /**
   * Dispatch an event for getCustmers request
   */
  _getCustomersRequest() {
    if (this._flagAvatar && this._flagProfileStorageError) {
      this._requestGenericResource('CUSTOMERS');
      this._flagProfileStorageError = false;
    }
  }

  /**
   * Set feature flags global
   * @param {Object} _customer
   * @param {Object} profileSectionFlags
   */
  _setFlagStatusGlobal(_customer, profileSectionFlags) {
    if (_customer.completeName && profileSectionFlags.editTaxData) {
      this._flagCustomerTaxData = profileSectionFlags.editTaxData;
      this.mapMaskedTaxData();
    }
  }

  /**
  * get key monoproduct storage
  * @event 'get-local-storage'
  */
  _getStorageMonoproduct() {
    this._dispatch('get-local-storage', {
      key: 'monoproduct',
      secure: false
    });
  }

  /**
  * Set key monoproduct from storage
  * @param {Object} resp
  */
  setStorageMonoproduct(resp) {
    this.isMonoproductUser = JSON.parse(this.get('monoproduct', resp));
  }

  /**
  * receives response from storage and assigns value to isMonoproductUser property
  * @param {Object} flagStorage
  */
  setMonoproductStorage(flagStorage) {
    const hasError = typeof flagStorage !== 'boolean' ? this.localStorageErrorCode.filter(err => err.code === flagStorage.code) : [];
    if (hasError.length > 0 && hasError[0].code === 999) {
      this._dispatch('monoproduct-dashboard-flag');
    } else if (typeof flagStorage === 'boolean') {
      this.isMonoproductUser = flagStorage;
    }
  }

  /**
  * receives error response from storage
  * @param {Object} error
  * @event 'monoproduct-dashboard-flag'
  */
  hasMonoproductStorageError(error) {
    if (this.get('code', error) === 999) {
      this._dispatch('monoproduct-dashboard-flag');
    }

    if (this.get('code', error) === -1 && this._consultingMonoproduct < 2) {
      this._consultingMonoproduct += 1;
      this._getStorageMonoproduct();
    }
  }

  /**
  * Get TDDE monoproduct key from storage
  * @param {String} key
  */
  _getTddeDataStorage(key) {
    this._dispatch('get-local-storage', {key});
  }

  /**
  * asign TDDE monoproduct value from storage
  * @param {Object} data
  */
  isTDDEMonoproduct(data) {
    this._isTDDEMonoproductClient = data.value;
    this._getStorageMonoproduct();
  }

  /**
  * asign TDDE monoproduct flag value from local storage or cache in one propertie
  */
  _saveTDDEMonoproductflag() {
    if (this._isTDDEMonoproductClient || this._isTDDEMonoproductClientCacheFlag) {
      this.isTDDEMonoproductflag = true;
    } else {
      this.isTDDEMonoproductflag = false;
    }
  }

  /**
   * Active contracts sections
   */
  _displayContractsSection() {
    this.showContractsSection = !this.isTDDEMonoproductflag;
    this._dispatch('profile-manager-show-contracts-section', this.showContractsSection);
  }

  /**
   * @desc The Method is valid if the Feature Flags are found
   * @param {Object} fetureFlags - It is a parameter that represents an object
   * containing feature flags. These flags are used to enable or disable certain
   * features in the code.
   * @event 'feature-profile-customer-contracts'
  */
  validateActiveFeatures(featureFlags = {}) {
    this.featureFlagsProfile = featureFlags;

    let flagValue = this.get('value', featureFlags['glomo.profile.customerContracts']);
    if (!this.isGlomoMiniorAccount && flagValue) {
      this._dispatch('feature-profile-customer-contracts', flagValue);
    }
    this._handleFeatureFlagsCollection(featureFlags);
  }

  /**
   * @description Find Feature Flag Global Profile Services
   * @param {Object} featureFlags
   */
  _handleFeatureFlagsCollection(featureFlags) {
    const featureFlagValue = featureFlags['glomo.profile.globalServices']?.value ?? false;
    this._enableGlobalProfileServices = featureFlagValue;
    this._isNewPostalAddressFlow = featureFlags['glomo.profile.postalAddressManagement']?.value ?? false;
    this._sendProfileServicesVersion(featureFlagValue);
  }

  /**
   * @description Dispatch event with version of local profile services
   * @param {Boolean} featureFlagValue
   * @event glomo-profile-manager-local-address-api-version
   * @event glomo-profile-manager-local-contacts-api-version
   */
  _sendProfileServicesVersion(featureFlagValue) {
    if (!featureFlagValue) {
      this._dispatch('glomo-profile-manager-local-address-api-version', '1');
      this._dispatch('glomo-profile-manager-local-contacts-api-version', '1');
    }
  }

  /**
   * @description Find globalPrefix in public app settings, then set the value
   * @param {Object} customerLogin
   */
  getGlobalCustomerPrefix({ customerLogin = {} }) {
    this._globalPrefix = this.get('globalPrefix', customerLogin) || '';
  }

  /**
   * @description Build Customer Id Global
   * @param {String} clientId
   */
  _setCustomerIdGlobal(clientId) {
    if (clientId.length && this._globalPrefix.length) {
      this._globalCustomerId = this._globalPrefix + clientId;
    }
  }

  /**
   * @description This Method validates flag of glomo.profile.recipients
   * @param {Object} paramsEvt
   * @event glomo-profile-manager-routes-go-profile-recipients
   * @event glomo-profile-manager-routes-go-recipients-init
   */
  validateRecipientsProfileFlag(paramsEvt) {
    const newRecipientsProfile = this.get('value', this.featureFlagsProfile['glomo.profile.recipients']);
    const params = {
      page: newRecipientsProfile ? 'profileRecipients' : 'recipientsInit',
      params: paramsEvt.params,
    };
    this._dispatch(`glomo-profile-manager-routes-go-${newRecipientsProfile ? 'profile-recipients' : 'recipients-init'}`, params);
  }
}

customElements.define(GlomoProfileManagerMx.is, GlomoProfileManagerMx);
