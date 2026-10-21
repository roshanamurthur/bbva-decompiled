/* eslint new-cap: [2, {'capIsNewExceptions': ['GlomoOpxPeerToPeerDmMixin']}]*/
/* eslint-disable-next-line new-cap */
/**
 * `GlomoOpxPeerToPeerDmMixin`
 * @extends {Polymer.Element}
 */
/* global GlomoOpxPeerToPeerDmMixin */
class GlomoOpxPeerToPeerMxDm extends GlomoOpxPeerToPeerDmMixin.mixin(Polymer.mixinBehaviors([
  CellsBehaviors.StepManagerBehavior,
  CellsBehaviors.i18nBehavior,
  CellsBehaviors.CellsCheckNestedKeysBehavior,
  CellsBehaviors.CellsTextFormatterBehavior,
  CellsBehaviors.P2mPaymentsCommonMixin
], Polymer.Element)) {

  static get is() {
    return 'glomo-opx-peer-to-peer-mx-dm';
  }

  static get properties() {
    return {
      /**
       * Flag that define if run in device or web, this value get from config
       * @type {Boolean}
       */
      isNative: {
        type: Boolean,
        value: false
      },
      /**
       * Flag that validate redirection in local android native
       * @type {Boolean}
       */
      isNativeIOS: {
        type: Boolean,
        value: false
      },
      /**
       * Define that repository is Mexico local
       * @type {Boolean}
       */
      isLocalProject: {
        type: Boolean,
        value: false
      },
      /**
       * Flag to validate if page is init with a custom event
       * @type {Boolean}
       */
      _isInitialized: {
        type: Boolean,
        value: false
      },
      /**
       * Customer-id personal info to make request customer service
       * @type {String}
       */
      customerId: {
        type: String,
        value: ''
      },
      /**
       * Client-id (customer-id in banxico services)
       * @type {String}
       */
      clientId: {
        type: String,
        value: ''
      },
      /**
       * Allow get client information
       * @type {Object}
       */
      globalCacheStorage: {
        type: Object,
        value: () => ({})
      },
      /**
       * Receive phone number to validate CoDi Cel user enrollment
       * @type {String}
       */
      myPhoneNumber: {
        type: String,
        value: ''
      },
      /**
       * Email where is send notification transfer
       * @type {String}
       */
      userEmail: {
        type: String,
        value: ''
      },
      /**
       * Account detail from channel
       * @type {Object}
       */
      accountRaw: {
        type: Object,
        value: null
      },
      /**
       * Account parsed
       * @type {Object}
       */
      account: {
        type: Object,
        value: null
      },
      /**
       * Banxico Response object
       * @type {Object}
       */
      banxicoResponse: {
        type: Object,
        value: () => ({})
      },
      /**
       * Product id from account selected
       * @type {String}
       */
      productId: {
        type: String,
        value: ''
      },
      /**
       * Phone Mexico code.
       * @type {String}
       */
      phoneCode: {
        type: String,
        value: '52'
      },
      /**
       * Code that represent BBVA in SPEI
       * @type {String}
       */
      bbvaCode: {
        type: String,
        value: '40012'
      },
      /**
       * Determine that alias type is will cipher data to query CLABE
       * @type {String}
       */
      aliasType: {
        type: String,
        value: '0'
      },
      /**
       * Set contact name from agenda
       * @type {String}
       */
      contactNameFromAgenda: {
        type: String,
        value: ''
      },
      /**
       * Key to show or hide onboarding
       * @type {String}
       */
      codicelPeerToPeerSendStorageKey: {
        type: String,
        value: 'codicel_peer_to_peer'
      },
      /**
       * Key to set and get data from local storage for last 5 send
       * @type {String}
       */
      lastSendLocalStorage: {
        type: String,
        value: 'last_five_send_codicel'
      },
      /**
       * The header of favorites contacts in a large list
       * @type {String}
       */
      favoritesHeaderTitle: {
        type: String,
        value: 'ÚLTIMOS ENVÍOS'
      },
      /**
       * Structure error response Contact Plugin
       * @type {Object}
       */
      errorResponseContactsPlugin: {
        type: Object,
        value: () => ({
          code: 5,
          message: 'Permission Denied'
        })
      },
      /**
       * Amount to transfer {amount: X, currency: MXN}
       * @type {Object}
       */
      amount: {
        type: Object,
        value: null
      },
      /**
       * Reference for transfer
       * Concept for transfer
       * { concept: x, reference: y }
       * @type {Object}
       */
      concept: {
        type: Object,
        value: null
      },
      /**
       * Set transfer type
       * @type {Boolean}
       */
      isBBVA: {
        type: Boolean,
        value: false
      },
      /**
       * Link for external tracking link
       * @type {String}
       */
      externalLink: {
        type: String,
        value: ''
      },
      /**
       * Tracking URL from BANXICO for interbank transfers
       * @type {String}
       */
      primaryExternalLink: {
        type: String,
        value: ''
      },
      /**
       * Public key to encrypt RSA
       * @type {String}
       */
      publicKey: {
        type: String,
        value: ''
      },
      /**
       * Key generated to make BANXICO request
       * @type {String}
       */
      randomKey: {
        type: String,
        value: ''
      },
      /**
       * Vector generated to make BANXICO request
       * @type {String}
       */
      vector: {
        type: String,
        value: ''
      },
      /**
       * Data ciphered with AES128 and length 24 characters
       * @type {String}
       */
      resultEncryptedAES: {
        type: String,
        value: ''
      },
      /**
       * Images url's
       * @type {Object}
       */
      images: {
        type: Object,
        value: () => ({})
      },
      /**
       * Define error code that return BANXICO just in case destination is not link
       * @type {String}
       */
      aliasNotFoundCode: {
        type: String,
        value: 'clabeNotFound'
      },
      /**
       * Define error code that return TRANSFER just in case client exccedded operation limit
       * @type {String}
       */
      errorLimitCode: {
        type: String,
        value: 'CNE0234'
      },
      /**
       * Phone number of BBVA line
       * @type {Object}
       */
      bbvaPhone: {
        type: Object,
        value: () => ({})
      },
      /**
      * Phone number of BBVA line with code NLE0023
      * @type {Object}
      */
      saPhoneNumber: {
        type: Object,
        value: () => ({})
      },
      /**
       * First successful exit
       * @type {Boolean}
       */
      isFirstExit: {
        type: Boolean,
        value: false
      },
      /**
       * Agree Consent Open Web Flag
       * @type {Boolean}
       */
      agreeConsentOpenWebFlag: {
        type: Boolean,
        value: false
      },
      /**
       * @description feature flags
       * @type {Array}
       */
      featureFlags: {
        type: Array,
        value: () => ([])
      },
      /**
       * User is Vinculated (agree and remove consent)
       * @type {Boolean}
       */
      isVinculated: {
        type: Boolean,
        value: false
      },
      /**
       * Rules for validate number phone
       * @type {Object}
       */
      validatePhone: {
        type: Object,
        value: () => ({
          length: 10,
          start: '0',
          code: 13,
          startExt: '+52'
        })
      },
      /**
       * Get all data to init proccess link consent operative
       * @type {Object}
       */
      consentManagerData: {
        type: Object,
        value: () => ({})
      },
      /**
       * Persist feature flag to dimo and tranfers
       * @type {Boolean}
       */
      dimoTransferFeature: {
        type: Boolean,
        value: false
      },
      /**
       * Define Dimo as prefix in transfer concept
       * @type {String}
       */
      prefixConcept: {
        type: String,
        value: 'Dimo-'
      },
      /**
       * Check if comes from expenses group
       * @type {Boolean}
       */
      comeFromExpensesGroup: {
        type: Boolean,
        value: false
      },
      /**
      * @description flag to indicate mtu status
      * @type boolean
      */
      _mtuFlag: {
        type: Boolean,
        value: false
      },
      /**
       * Active flag to show modal with config for transfers
       * @type {Boolean}
       */
      flagTransfersFlow: {
        type: Boolean,
        value: false
      },
      /**
       * custom invite message
       * @type {String}
       */
      customInviteMessage: {
        type: String,
        value: ''
      },
      /**
       * Flag to validate if  the user from receivers is from BBVA
       * @type {Boolean}
       */
      findUserInBanxico: {
        type: Boolean,
        value: false
      },
      /**
       * Flag to control if invite dimo from transfers is active
       */
      activeDimoInviteToTransferFlag: {
        type: Boolean,
        value: false
      }
    };
  }

  static get observers() {
    return [
      'initializeSteps(stepsRegistered)',
      '_setParseAccount(account, accountRaw, _isInitialized)'
    ];
  }

  /* ================================================
                  INIT - RESET
  ================================================ */
  /**
   * @desc Initialize states and properties to start operative
   * @param {Boolean} initialize
   */
  init(initialize) {
    if (this._mtuFlag) {
      this._mtuFlag = false;
      return;
    }
    this._dispatchCustomEvent('codicel-custom-event-init', initialize);
    this.set('_isInitialized', Boolean(initialize));
    this.restart();
    this._getLocalStorage(this.codicelPeerToPeerSendStorageKey);
    this._getLocalStorage(this.lastSendLocalStorage);
    if (this.isNative && !this.isLocalProject) { // global
      this.getClientIdFromStorage();
    }
  }

  /**
   * @desc Set number phone just in case run in web
   * @param {Object} Data from after login
   */
  setPhoneInWeb(data) {
    if (!this.isNative) {
      this.myPhoneNumber = this.c(data, 'userId', '');
    }
  }

  /**
   * @desc First exit should redirect to agree consent page, otherwise, go back to previous page
   * @event navigate-to-agree-consent
   * @event transfer-review-go-back
   * @event transfer-review-go-expenses
   */
  validateExitReview() {
    this._setConsentDataProps();
    if (this.isFirstExit && this.agreeConsentOpenWebFlag && !this.isVinculated) {
      this._dispatchCustomEvent('navigate-to-agree-consent', {
        isVinculated: false,
        continue: ''
      });
    } else {
      this._dispatchCustomEvent(this.comeFromExpensesGroup ? 'transfer-review-go-expenses' : 'transfer-review-go-back', true);
    }
    this.comeFromExpensesGroup = false;
    if (!this.isNativeIOS) {
      this._dispatchCustomEvent('go-back-to-native');
    }
  }

  /**
   * @desc Request isFirstExit to native local storage
   * @event get-first-exit-local-storage
   */
  requestFirstExit() {
    this._getLocalStorage('isFirstExit');
    this._getLocalStorage('codicel_entrypoint');
  }

  /**
   * @desc Manage feature flag collection for first redirect in send
   * @param {Object} featureFlags
   */
  featureFlagCollection(featureFlags) {
    this.agreeConsentOpenWebFlag = this.c(featureFlags, 'dimoConsent', false);
    this.activeDimoInviteToTransferFlag = this.get('value', featureFlags['glomo.accounts.transfersInviteDimo']) || false;
  }

  /**
   * @desc handle isVinculated from local storage for first redirect
   * @param {Object} data
   */
  handleCodicelEntrypoint(data) {
    this.isVinculated = (data === 'Alta' ? true : false);
  }

  /**
   * @desc handle isFirstExitSuccess from native local storage
   * @param {Object} data
   */
  isFirstExitSuccess(data) {
    if (!data.value) {
      this.isFirstExit = false;
    }
  }

  /**
   * @desc Set properties for validate at the end Dimo flow
   */
  _setConsentDataProps() {
    if (this.isLocalProject) {
      this.set('agreeConsentOpenWebFlag', this.consentManagerData.isFeatureEnabled);
      this.set('isVinculated', this.consentManagerData.isVinculated);
    }
  }

  /**
   * handle isFirstExitError from native local storage
   * @param {Object} data
   * @event set-first-exit-local-storage
   */
  isFirstExitError(data) {
    this.isFirstExit = true;
    this._saveDataLocalStorage('isFirstExit', { value: false });
  }

  /**
   * @desc Clean properties when user leave operative
   * @event reset-scroll
   */
  reset() {
    if (this._mtuFlag) {
      this._mtuFlag = false;
      return;
    }
    this._dispatchCustomEvent('reset-scroll');
    this.concept = null;
    this.amount = null;
    this.receiver = null;
    this.phone = '';
    this.stepsRegistered = false;
    this.set('_isInitialize', false);
    this.banxicoResponse = {};
    this.account = undefined;
    this._mtuFlag = false;
    this.comeFromExpensesGroup = false;
    this.flagTransfersFlow = false;
    this.customInviteMessage = '';
    this.findUserInBanxico = false;
    this.activeDimoInviteToTransferFlag = false;
  }

  /**
   * Set the value of comeFromExpensesGroup to true to redirect to expenses group
   */
  changeRedirectionToExpenses() {
    this.comeFromExpensesGroup = true;
  }

  /**
   * @desc Manages change button pressed on contact selector
   * @event changed-contact-reset-step-amount
   * @event changed-contact-reset-step
   * @event changed-contact-open-step
   * @event changed-contact-active-false
   * @event reset-invalid-input
   */
  changeReceiverAcceptPressed() {
    this._dispatchCustomEvent('changed-contact-reset-step-amount', null);
    this._dispatchCustomEvent('changed-contact-reset-step');
    this._dispatchCustomEvent('changed-contact-open-step', false);
    this._dispatchCustomEvent('changed-contact-active-false', false);
    this._dispatchCustomEvent('reset-invalid-input', false);
    this.amount = null;
    this.concept = null;
    this.receiver = null;
    this.phone = '';
  }

  /* ================================================
                    ONBOARDING
  ================================================ */
  /**
   * @desc Get data from local storage
   * @param {String} Key instance local storage
   * @event get-local-storage-codicel
   */
  _getLocalStorage(key) {
    this._dispatchCustomEvent('get-local-storage-codicel', {
      key: key
    });
  }

  /**
   * @desc Response to storage data load
   * @param {Object} storageResponse
   */
  getCodicelLocalStorage(storageResponse) {
    this._verifyOnboarding(storageResponse);
  }

  /**
   * @desc Method that verify if onboarding has been visited
   * @param {Object} storageData
   */
  _verifyOnboarding(storageData) {
    if (!storageData.onboardingVisited) {
      this._showOnboarding();
    }
  }

  /**
   * @des Method that sets the onboarding visited property at local storage in true
   */
  setOnboardingVisitedOnLocalStorage() {
    this._saveDataLocalStorage(this.codicelPeerToPeerSendStorageKey, { onboardingVisited: true });
  }

  /**
   * @desc Method that dispatch codicel-open-modal-onboarding event to display onboarding
   * @event codicel-open-modal-onboarding
   */
  _showOnboarding() {
    this._dispatchCustomEvent('codicel-open-modal-onboarding');
  }


  /* ================================================
                  PRODUCT SELECTOR (1)
  ================================================ */

  /**
   * @desc Select account from channel (global or local)
   * @param {Object} account
   * @param {Object} accountRaw
   * @param {Boolean} isInitialized
   * @event set-default-product-id
   */
  _setParseAccount(account, accountRaw, isInitialized) {
    if (isInitialized && account) {
      this.getAccountInfo(account);
      this._dispatchCustomEvent('set-default-product-id', this.accountId);
      this._setEnoughFunds([ this.account ]);
    } else if (isInitialized && accountRaw) {
      let accountParsed = this.parseGlobalAccount(accountRaw);
      this.getAccountInfo(accountParsed);
      this._dispatchCustomEvent('set-default-product-id', this.accountId);
      this._setEnoughFunds([ this.account ]);
    }
  }

  /**
   * @desc Set productId of account param
   * @param {Object} account received
   */
  getAccountInfo(account) {
    if (account.productId) {
      Object.assign(account, { id: this.c(account, 'productId', '')});
    } else if (account.accountId) {
      Object.assign(account, { id: this.c(account, 'accountId', '')});
    }
    this.set('account', account);
    this.accountId = this.get('account.productId');
  }

  /**
   * @desc Generate body equals to local account
   * @param {Object} accountRaw global account
   * @returns {Object} local account
   */
  parseGlobalAccount(accountRaw) {
    const flagHorizonV2 = this.get('value', this.featureFlags['glomo.account.horizonV2']);
    return {
      alias: this.c(accountRaw, 'alias'),
      description: {
        masked: true,
        value: this.c(accountRaw, 'number')
      },
      name: this.c(accountRaw, 'alias'),
      primaryAmount: {
        amount: parseInt(accountRaw.availableBalance.currentBalances[0].amount),
        currency: !flagHorizonV2 ? accountRaw.availableBalance.currentBalances[0].currency : accountRaw.currencies[0].currency,
        label: 'codicel-peer-to-peer-send-product-available-balance'
      },
      productId: !flagHorizonV2 ? this.c(accountRaw, 'accountId') : this.productId,
      productType: this.c(accountRaw, 'productType', 'account')
    };
  }

  /**
   * @desc Dispatch event to get clientId from native local storage with secure option
   * @event get-local-storage-codicel
   */
  getClientIdFromStorage() {
    this._dispatchCustomEvent('get-local-storage-codicel', {
      key: 'loginData',
      secure: true
    });
  }

  /**
   * @desc Set clientId with local storage response
   * @param {Object} data response grantingTicket
   */
  handleGlobalLoginData(data) {
    this.clientId = this.c(data, 'grantingTicketUserId', this.clientId);
  }

  /**
   * @desc Validate if each account have funds
   * @param {Array} accounts validate
   * @event set-accounts-with-message
   */
  _setEnoughFunds(accounts) {
    if (accounts && accounts.length) {
      accounts.forEach(account => {
        let hasNotFunds = this.c(account, 'primaryAmount.amount') <= 0;
        Object.assign(account, {
          hasTextMessage: hasNotFunds,
          disabled: hasNotFunds
        });
      });
      setTimeout(() => {
        this._dispatchCustomEvent('set-accounts-with-message', accounts);
      }, 10);
    }
  }

  /**
   * @desc Method to parse source selected account data from product selector
   * @param {Object} Source selected from product selector
   * @event source-selected-amount
   * @event source-selected-currency
   */
  _getSourceSelectedInfo(sourceSelected) {
    const sourceSelectedAmount = this.c(sourceSelected, 'primaryAmount.amount');
    const sourceSelectedCurrency = this.c(sourceSelected, 'primaryAmount.currency');
    this._dispatchCustomEvent('source-selected-amount', sourceSelectedAmount);
    this._dispatchCustomEvent('source-selected-currency', sourceSelectedCurrency);
    if (sourceSelected && !sourceSelected.hasTextMessage) {
      this._nextStep();
    }
  }

  /* ================================================
                  ENTER PHONE (2)
  ================================================ */
  /**
   * Set last contacts send from local storage
   * @param {String}
   * @event set-last-contacts-send
   */
  setLastContactsSend(contacts) {
    const formattedValue = (typeof contacts === 'string') ? JSON.parse(contacts) : contacts;
    this.recentList = formattedValue || [];
    if (this.recentList.length && !this.largeContactList) {
      this._dispatchCustomEvent('set-last-contacts-send', this.recentList);
    }
  }

  /**
   * @desc Update recent list of the last 5 send
   */
  _updateLastSendContacts() {
    if (this.contactNameFromAgenda) {
      this.recentList = this.recentList.filter(contact => contact.secondary.replace(/\s/g, '') !== this.selectedContact.secondary.replace(/\s/g, ''));
      this.recentList.unshift({main: this.contactNameFromAgenda, secondary: this.selectedContact.secondary.replace(/\s/g, '')});
      this.recentList.splice(5);
      this.recentList.forEach(contact => contact.secondary.replace(/\s/g, ''));
      this._saveDataLocalStorage(this.lastSendLocalStorage, this.recentList);
    }
  }

  /**
   * @desc Phone filter if have these features
   * @param {Object} phone
   * @return boolean
   */
  _phoneFilter(phone = {}) {
    const numberPhone = (phone || {}).value;
    const phonePrefix = (numberPhone.startsWith(this.validatePhone.startExt)) ? this._removePrefix(numberPhone) : numberPhone;
    const cleanPhone = this._cleanPhone(phonePrefix);
    return cleanPhone.length === this.validatePhone.length && !cleanPhone.startsWith(this.validatePhone.start);
  }

  /**
   * @desc Filter only last 10 position on the phone when starts with +52
   * @param {String} phone to filter
   * @returns Phone formatted
   */
  _removePrefix(phone) {
    return this._cleanPhone(phone).slice(-this.validatePhone.length);
  }

  /**
   * @desc Get last 10 digits
   * @param {String} phone to get last digits
   * @return {String} with 10 last digits
   */
  _getMobileNumber(number = '') {
    return number.slice(-this.validatePhone.length);
  }

  /**
   * @desc Clean duplicate numbers
   * @param {Array} contacts
   * @return {Array} Number cleaned
   */
  _cleanDuplicatedNumbers(contacts = []) {
    return contacts.map(contact => {
      let contactCleaned = contact;
      let phoneNumbers = this._getUnique(contact.phoneNumbers || [], 'value');
      contactCleaned.phoneNumbers = phoneNumbers;
      return contactCleaned;
    });
  }

  /**
   * @desc Parse mobile contacts from plugin
   * @param {Array} contactsPlugin
   */
  parseMobileContacts(contactsPlugin) {
    this._closeControlVeil();
    this.contactList = this._parseContactBook(contactsPlugin);
    this._openControlVeil();
    this.sendContactsToModal(this.contactList);
  }

  /**
   * @desc Create list Items contacts or group items contact and send modal
   * @param {Array} contacts for modal
   * @event set-parsed-contact-group
   */
  sendContactsToModal(contacts) {
    this._closeControlVeil();
    if (this.isSearchMode) {
      const contact = this.c(contacts, 'contacts.0', {});
      const phone = this._getMobileNumber(contact.value);
      this.phone = phone;
      this._initProcessCipher();
    } else {
      this.contactBookList = this._parseContactModal(contacts);
      if (this.largeContactList) {
        this.generateSelectionList('');
      } else {
        this._dispatchCustomEvent('set-parsed-contact-group', this._groupContactBookList(this.contactBookList));
      }
    }
  }

  /**
   * @desc Generate only list of contacts when find a contact or show all contacts
   * @param {String} search to find in list
   * @event set-selection-list
   */
  generateSelectionList(search) {
    if (this.largeContactList && this.contactBookList) {
      let isSearch = !!search;
      let selectionList = [];
      let favoritesList = this.recentList;
      let contactList = this._sortListByKey(this.contactBookList, 'main');

      if (isSearch) {
        search = search.toLocaleLowerCase();
        favoritesList = favoritesList.filter(item => (item.main || '').toLocaleLowerCase().includes(search) || (item.nickName || '').toLocaleLowerCase().includes(search));
        contactList = contactList.filter(item => (item.main || '').toLocaleLowerCase().includes(search) || (item.nickName || '').toLocaleLowerCase().includes(search));
      }
      if (favoritesList.length > 0) {
        favoritesList.map((item) => this._removeHeader(item));
        favoritesList[0].header = this.favoritesHeaderTitle;
      }
      if (contactList.length > 0) {
        contactList[0].header = contactList[0].main[0] || contactList[0].nickName[0] || '';
        contactList.map((item, index) => {
          if (index > 0) {
            return ((contactList[index - 1]).main[0] !== item.main[0]) || ((contactList[index - 1]).nickName[0] !== item.nickName[0]) ? this._addHeader(item) : this._removeHeader(item);
          }
        });
      }
      selectionList = [...favoritesList, ...contactList];
      selectionList.map(contact => contact.secondary = this._applyPhoneMask(contact.secondary));
      this._dispatchCustomEvent('set-selection-list', selectionList);
    }
  }

  /**
   * @desc Create a structure contacts to visualize in modal
   * @param {Object} contacts
   * @returns {Array} parsed to modal
   */
  _parseContactModal(contacts) {
    return (contacts || []).map(({value}, index) => {
      const secondary = this._getMobileNumber(value);
      let contact = (this.contactList && this.contactList.length && this.contactList[index]) ? this.contactList[index] : {};
      return {
        main: this._titleCase(contact.name),
        secondary,
        nickName: contact.nickName,
        isActive: false
      };
    });
  }

  /**
   * @desc Set phone contact selected and init process connection to BANXICO
   * @param {Object} contact Selected from modal
   */
  selectedContactFromModal(contact) {
    const phone = this._cleanPhone(contact.secondary);
    if (phone && phone === this.myPhoneNumber) {
      this._getConfigErrorModal({code: 'codicel-error-same-phone', infoBody: 'codicel-peer-to-peer-error-modal-same-phone', eventName: 'error-same-phone', btnAccept: 'info-UNDERSTAND-accept', title: 'codicel-peer-to-peer-send-title-error-modal-same-phone', titleClass: 'strong'});
    } else {
      this.phone = phone;
      this.contactNameFromAgenda = contact.main;
      this._setContactStep(phone);
      this._initProcessCipher();
    }
  }

  /**
   * Checks if change phone is not same contact of customer
   * @param {Object} phone From input {phone: phone}
   */
  _getContactBookCode(phone) {
    if (phone.phone === this.myPhoneNumber) {
      this._getConfigErrorModal({code: 'codicel-error-same-phone', infoBody: 'codicel-peer-to-peer-error-modal-same-phone', eventName: 'error-same-phone', btnAccept: 'info-UNDERSTAND-accept', title: 'codicel-peer-to-peer-send-title-error-modal-same-phone', titleClass: 'strong'});
    } else {
      this.phone = phone.phone;
      this.isSearchMode = true;
      this.contactNameFromAgenda = undefined;
      this._contactBookSearch([ { contactType: { id: 'MOBILE' }, value: `${this.phoneCode}${phone.phone}` } ]);
    }
  }

  /**
   * @desc Set phone contact
   * @param {Object} Contact send to enter phone
   * @event set-phone-contact
   */
  _setAdditionalInfoPhone({ main: phoneLabel, secondary: phone, secondaryList: additionalInfo }) {
    this._dispatchCustomEvent('set-phone-contact', { phoneLabel, phone, additionalInfo });
  }

  /**
   * @desc Create config to send invitation sender
   * @event send-contact-invitation
   */
  acceptInviteContact() {
    const invitationDetail = {
      value: this.customInviteMessage && this.customInviteMessage !== ''
        ? this.t(this.customInviteMessage)
        : this.t('codicel-peer-to-peer-invite-message')
    };
    this._dispatchCustomEvent('send-contact-invitation', invitationDetail);
  }

  /**
   * @desc Cancel invitation sender Analytics event
   * @event cancel-contact-invitation
   */
  cancelInviteContact() {
    this._dispatchCustomEvent('cancel-contact-invitation', {});
  }

  /**
   * @desc Handler error response (permissions denied) from contacts plugin
   * @param {Object} errorResponse plugin response
   * @event close-contact-modal
   * @event open-modal-permissions-denied
   */
  handlerPermissionDeniedContactsPlugin(errorResponse) {
    this._closeControlVeil();
    this._dispatchCustomEvent('close-contact-modal', true);
    if (errorResponse.code === this.errorResponseContactsPlugin.code) {
      this._dispatchCustomEvent('open-modal-permissions-denied', this._generateErrorModal());
    }
  }

  /**
   * @desc Show warning modal when user attempts to change receiver phone number or contact
   */
  openWarningModalChangeReceiver() {
    this._getConfigErrorModal({code: 'CODICEL-WARNING-CHANGE-RECEIVER', infoBody: 'codicel-peer-to-peer-error-modal-change-receiver', eventName: 'warning-change-receiver', btnAccept: 'codicel-peer-to-peer-send-change-receiver', btnCancel: 'codicel-peer-to-peer-send-dont-change-receiver'});
  }

  /* ================================================
                    CIPHER
  ================================================ */

  /**
   * Init cipher process to send service
   * @event generate-random-key
   */
  _initProcessCipher() {
    this._openControlVeil();
    this._dispatchCustomEvent('generate-random-key');
  }

  /**
   * @desc Receive value from input
   * @param {Object} e Event
   */
  saveInputValue(e) {
    this.phone = e.inputValue;
  }

  /**
   * @desc Parse response from receivers and checks if make a banxico request
   * @param {Object} response From receivers
   */
  validateResponse(response) {
    this.findUserInBanxico = this.c(response, 'bank.name') === 'BBVA';
    if (this.dimoTransferFeature && this.c(response, 'bank') && this._phoneFilter({ value: this.phone})) {
      this._initProcessCipher();
    }
  }


  /**
   * Set properties key and vector with response of cryptoJS
   * @param {Object} key and vector generated
   * @event cipher-phone-with-aes
   */
  responseKeyGenerated({key, vector}) {
    this.randomKey = key;
    this.vector = vector;
    this._dispatchCustomEvent('cipher-phone-with-aes', {data: this.aliasType + '|' + this.phone, key: this.randomKey, vector: this.vector});
  }

  /**
   * Set properties resultAES with response of cryptoJS
   * @param {String} result data encrypted with AES
   * @event request-encrypt-data-with-rsa
   */
  responseDataCipheredAes(result) {
    this.resultEncryptedAES = result;
    this._dispatchCustomEvent('request-encrypt-data-with-rsa', this._bodyEncryptData(this.randomKey + this.vector));
  }

  /**
   * Extract Dimo public key
   * @param {Object} payload with global app settings
   */
  handlePublicKey(payload) {
    this.publicKey = this.c(payload, 'dimo.publicKey', '');
  }

  /**
   * Generate data body
   * @param {String} data to encrypt with RSA
   * @param {String} padding required to encrypt if have other padding
   * @param {String} mode required to encrypt if have other mode
   * @returns {Object} to send cipher
   */
  _bodyEncryptData(data, padding = 'PKCS1Padding', mode = 'none') {
    return {data, publicKey: this.publicKey, padding, mode};
  }

  /**
   * Result of data encrypted using RSA from cipher plugin
   * @param {String} result data encrypted
   * @event request-registered-clabe-search
   */
  responseDataEncryptedRSA(result) {
    this.resultEncryptedRSA = result;
    this._dispatchCustomEvent('request-registered-clabe-search', this._getRequestBodyRegisteredClabeSearch());
  }

  /**
   * Object that represent request body to query phone-account BANXICO
   * @returns {Object} that need service BANXICO
   */
  _getRequestBodyRegisteredClabeSearch() {
    return {
      customerId: this.clientId,
      receiver: {
        additionalInformation: this.resultEncryptedAES
      },
      keyLongitude: this.resultEncryptedRSA.length,
      key: this.resultEncryptedRSA
    };
  }

  /**
   * Get response from BANXICO service and parse data
   * @param {Object} response service
   * @event close-contact-modal
   * @event decrypt-banxico-response-aes
   */
  handleClabeSearchSuccess(response) {
    this._dispatchCustomEvent('close-contact-modal', true);
    this._dispatchCustomEvent('decrypt-banxico-response-aes', {data: response.receiverBankingInformation, key: this.randomKey, vector: this.vector});
  }

  /**
   * Get error response from BANXICO service
   * @param {Object} response service
   * @event retry-error
   */
  handleClabeSearchError(errorResponse) {
    let code = this.c(errorResponse, 'messages.0.code', '');
    if (!this.findUserInBanxico) {
      if (code === this.aliasNotFoundCode) {
        if (this.flagTransfersFlow) {
          this._activeTransferPreModalInvite();
        } else {
          this._getInviteCoDiCelConfig();
        }
        this._cleanKey();
      } else {
        this._dispatchCustomEvent('retry-error', this._getErrorConfigBanxico());
      }
    }
    this._closeControlVeil();
  }

  /**
   * Dispatch the modal to invite to Dimo for transfers if the feature is enabled
   */
  _activeTransferPreModalInvite() {
    if (this.activeDimoInviteToTransferFlag) {
      this._getInviteCoDiCelPreModal();
      return;
    }
  }

  /**
   * @dec Clean keys after decrypt process
   */
  _cleanKey() {
    this.randomKey = '';
    this.vector = '';
    this.resultEncryptedRSA = '';
  }

  /**
   * @desc Execute retry Banxico Query service
   * @event request-registered-clabe-search
   */
  retryRequestBanxicoQuery() {
    this._openControlVeil();
    this._dispatchCustomEvent('request-registered-clabe-search', this._getRequestBodyRegisteredClabeSearch());
  }

  /**
   * @desc Once time response decrypted set values to destination properties
   * @param {String} response BANXICO contact with pipes
   */
  parseCuentaClabeBanxico(response) {
    setTimeout(() => {
      let [accountName, type, clabe, spei] = response.split('|');
      this.set('banxicoResponse', { name: accountName, type, clabe, spei });
      this.isBBVA = spei === this.bbvaCode;
      this.selectedContact = {
        main: this.contactNameFromAgenda || accountName,
        secondary: this.phone,
        secondaryList: (this.contactNameFromAgenda) ? [ { title: accountName } ] : []
      };
      this._setAdditionalInfoPhone(this.selectedContact);
      this.receiver = {
        alias: accountName,
        contract: {
          number: clabe,
          productType: {
            id: 'ACCOUNT',
            name: 'Account type'
          },
          contractType: {
            id: 'ACCOUNT',
            name: 'Account type'
          },
          numberType: {
            id: 'CLABE',
            name: 'Standardized Banking Cipher'
          },
        },
        holder: { holderName: accountName }
      };
      this.showReference();
      this._setReceiverContact();
      this._cleanKey();
      this._closeControlVeil();
    }, 250);
  }

  /* ================================================
                    CONCEPT (4)
  ================================================ */

  /**
   * @desc Define if show or hide concept component
   * @event concept-required
   * @event set-format-date
   * @event show-reference
   * @event reference-required-label
   */
  showReference() {
    let newFormat = new Date().toISOString().substr(2, 8).replace(/-/g, '');
    this._dispatchCustomEvent('concept-required', !this.isBBVA);
    this._dispatchCustomEvent('set-format-date', `${newFormat.substr(4, 2)}${newFormat.substr(2, 2)}${newFormat.substr(0, 2) }0`);
    this._dispatchCustomEvent('show-reference', !this.isBBVA);
    if (this.isBBVA) {
      this._dispatchCustomEvent('concept-required-label', 'cells-step-concept-optional-label');
      this._dispatchCustomEvent('max-length-concept', 15);
      this._dispatchCustomEvent('info-message-concept', 'codicel-peer-to-peer-send-concept-info-message');
    } else {
      this._dispatchCustomEvent('concept-required-label', 'codicel-peer-to-peer-send-step-concept-label');
      this._dispatchCustomEvent('reference-required-label', this.t('codicel-peer-to-peer-send-reference-label'));
      this._dispatchCustomEvent('max-length-concept', 40);
      this._dispatchCustomEvent('info-message-concept', 'codicel-peer-to-peer-send-inter-concept-info-message');
    }
  }

  /* ================================================
                    SIMULATION
  ================================================ */
  /**
   * Realize simulation to verify if the transfer generate commission
   * @param {Boolean} canExecute if steps are filled
   * @event summary-data
   */
  makeSimulation(canExecute) {
    if (canExecute && this.amount && this.sourceSelected) {
      this._dispatchCustomEvent('summary-data', this._getSummaryBody());
    }
  }

  /**
   * Return structure for send summary
   * @returns {Object} body object
   */
  _getSummaryBody() {
    const operation = {
      totalFees: {
        text: this.t('Comisión:'),
        amount: 0.00,
        currency: 'MXN'
      },
      fees: [ {
        feeType: {
          id: 'TOTAL_FEE',
          name: 'Total fee'
        },
        feeAmount: {
          amount: 0.00,
          currency: 'MXN'
        }
      } ],
      status: {
        id: 'SETTLED',
        name: 'Settled'
      },
      amount: {
        amount: this.c(this.amount, 'amount'),
        currency: this.c(this.amount, 'currency')
      }
    };
    return operation;
  }

  /* ================================================
                    TRANSFER REQUEST
  ================================================ */
  /**
   * @desc Determine that service should consume before make transfer
   */
  requestServiceToTransfer() {
    this._openControlVeil();
    this._dispatchCustomEvent(this._getServiceToConsume(this.isBBVA), this._generateParams(this.isBBVA));
  }

  /**
   * Valid that event dispatch
   * @param {Boolean} isBBVA for internal or interbank
   * @event request-get-receiver
   * @event request-get-catalogs-banks
   * @returns {String} Event to dispatch
   */
  _getServiceToConsume(isBBVA) {
    return isBBVA ? 'request-get-receiver' : 'request-get-catalogs-banks';
  }

  /**
   * Create request body to query magic or catalogs
   * @param {Boolean} isBBVA for create body
   * @returns {Object} params to service API
   */
  _generateParams(isBBVA) {
    return (isBBVA) ? { number: this.receiver.contract.number } : 'BANKS';
  }

  /**
   * Set receiver with response from query magic service
   * @param {Object} response Body review
   */
  handleReceiverSuccess(response) {
    Object.assign(this.receiver, {
      contract: {
        alias: 'Cuenta BBVA',
        number: response.number,
        productType: response.productType,
        numberType: response.numberType,
        contractType: response.productType,
        bank: response.bank
      }
    });
    this._generateRequestTransfer();
  }

  /**
   * @desc Handler for catalogs service response
   * @param {Object} data service response
   */
  handleCatalogsResponse(data) {
    const [ bank ] = data.filter((object) => object.id === this.banxicoResponse.spei.slice(1));
    Object.assign(this.receiver.contract, {
      alias: 'CLABE ' + bank.name,
      bank: bank
    });
    this._generateRequestTransfer();
  }

  /**
   * @desc Handler for catalogs service error response and modal dispatch
   * @param {Object} data service response
   * @event retry-error
   */
  handleCatalogsError(payload) {
    this._closeControlVeil();
    this._dispatchCustomEvent('retry-error', this._getRetryMediaModal({errorCode: 'CATALOGS-NOT-AVAILABLE'}));
  }

  /**
   * @desc Handler for receivers service error response and modal dispatch
   * @param {Object} data service response
   * @event retry-error
   */
  handleReceiverError(error) {
    this._closeControlVeil();
    this._dispatchCustomEvent('retry-error', this._getRetryMediaModal({errorCode: 'RECEIVERS-NOT-AVAILABLE'}));
  }

  /**
   * @desc Create config modal for retry request service
   * @param {Object} config Config for generate
   * @returns {Object} config
   */
  _getRetryMediaModal(config) {
    let { errorCode, message = 'codicel-peer-to-peer-modal-body-not-available-operation', btnAccept = 'codicel-peer-to-peer-modal-btn-retry', btnCancel = 'codicel-peer-to-peer-button-label-cancel' } = config;
    let body = {
      className: 'error',
      hideCloseIcon: false,
      openMaximized: false,
      acceptBtLabel: btnAccept,
      cancelBtLabel: btnCancel,
      template: {
        type: 'paragraphs',
        values: [
          { icon: 'coronita:alert', iconClass: 'icon-size-36' },
          { title: 'codicel-peer-to-peer-modal-title-not-available-operation' },
          { text: message }
        ]
      }
    };
    let callConfig = this._getCallConfig('full-height-error common-error-modal');

    let retryErrorData = {
      errorId: errorCode,
      errorType: 'operative',
      retryConfig: body,
      callConfig
    };

    return Object.assign({retryErrorData});
  }

  /**
   * @desc Create config call modal for retry request service
   * @param {String} className
   * @returns {Object} config
   */
  _getCallConfig(className) {
    return {
      className,
      hideCloseIcon: false,
      openMaximized: true,
      header: 'codicel-peer-to-peer-error-title',
      heroImage: this.images.error,
      acceptBtLabel: 'codicel-peer-to-peer-modal-btn-call-bbva-line',
      cancelBtLabel: 'codicel-peer-to-peer-button-label-cancel',
      template: {
        type: 'paragraphs',
        values: [
          { title: 'codicel-peer-to-peer-modal-title-not-available-operation' },
          { text: 'codicel-peer-to-peer-modal-body-not-available-operation-extended' }
        ]
      }
    };
  }

  /**
   * Generate request body and checks if is internal or interbank transfer and dispatch event (is-internal-transfer or is-interbank-transfer)
   * @event set-customer-id
   * @event request-customer-email
   */
  _generateRequestTransfer() {
    if (this.isLocalProject) {
      if (this.customerId === '') {
        this.customerId = this.c(this.globalCacheStorage, 'customer.customerId');
      }
      this._dispatchCustomEvent('set-customer-id', this.customerId);
      this._dispatchCustomEvent('request-customer-email', { customerId: this.customerId });
    }
    this._dispatchCustomEvent(this._getTransferTypeEvent(this.isBBVA), this._generateTransferBody(this.isBBVA));
  }

  /**
   * Return event name if es internal or interbank transfer
   * @param {Boolean} isBBVA internal transfer
   * @returns {String} event name to fire
   */
  _getTransferTypeEvent(isBBVA) {
    return isBBVA ? 'is-internal-transfer' : 'is-interbank-transfer';
  }

  /**
   * Create request body to transfer service
   * @param {Boolean} isBBVA is internal transfer
   * @returns {Object}
   */
  _generateTransferBody(isBBVA) {
    const source = {
      contract: {
        number: this.c(this.sourceSelected, 'description.value'),
        numberType: {
          id: 'CCC',
          name: 'Customer Account Code'
        },
        contractType: {
          id: 'ACCOUNT',
          name: 'ACCOUNTS'
        }
      },
      primaryAmount: { currency: 'MXN' }
    };
    const destination = {
      alias: this.receiver.alias,
      name: (this.receiver.alias).slice(0, 20),
      number: this.receiver.contract.number,
      productType: this.receiver.contract.productType,
      numberType: this.receiver.contract.numberType,
      contractType: this.receiver.contract.contractType,
      bank: this.receiver.contract.bank
    };
    const money = this.amount.amount;
    const sendCurrency = this.amount.currency;
    this.concept.concept = (this.concept.concept === '') ? 'Sin concepto' : this.concept.concept;
    const concept = isBBVA ? {
      concept: this.prefixConcept + this.c(this.concept, 'concept'),
    } : {
      concept: this.c(this.concept, 'concept'),
      reference: this.c(this.concept, 'reference')
    };
    const body = { source, destination, money, sendCurrency, concept };
    const flagDimoTracking = this.get('value', this.featureFlags['glomo.account.dimoTracking']) || false;
    if (!isBBVA && flagDimoTracking) {
      body.operationType = {
        id: '99'
      };
      body.reason = 'ordinary-interbank-transfer';
    }
    return body;
  }

  /* ================================================
                    TRANSFER RESPONSE
  ================================================ */
  /**
   * @desc Manage success on post internal transfer
   * @param {Object} Transfer response
   * @event update-product-detail
   * @event financial-overview-refresh
   * @event send-content-receipt
   * @event redirection-review-to-expenses-group
   * @event transfer-successful
   * @event close-sign-modal
   */
  handleTransferSuccess(payload) {
    const result = this._getGeneralResult(payload);
    this.mobileTransferP2PResult = result;
    this._dispatchCustomEvent('update-product-detail', { productType: this.t('glomo-transfer-reset-accounts'), productNumber: this.c(this.sourceSelected, 'description.value') });
    this._dispatchCustomEvent('financial-overview-refresh');
    this._closeControlVeil();
    this._updateLastSendContacts();
    this._dispatchCustomEvent('send-content-receipt', this._getReceipt(result));
    if (this.comeFromExpensesGroup) {
      this._dispatchCustomEvent('redirection-review-to-expenses-group');
    }
    this._dispatchCustomEvent('transfer-successful', { page: 'codicel-transfer-review', data: result });
    this._dispatchCustomEvent('close-sign-modal');
    this._dispatchCustomEvent('reset-invalid-input', false);
    this.restart();
    this.banxicoResponse = {};
    this.comeFromExpensesGroup = false;
  }

  /**
   * @desc Set user email property from response service
   * @param {Object} response customers service
   */
  getCustomerDetailSuccess(response) {
    this.userEmail = this.c(response, 'contactDetails.1.contact');
  }

  /**
   * @desc Set with undefined email property
   * @param {Object} service response
   */
  getCustomerDetailError(response) {
    this.userEmail = undefined;
  }

  /**
   * @desc Generate correspond body to show codicelReview page
   * @param {Object} payload
   * @returns {Object} with options
   */
  _getGeneralResult(payload) {
    const body = {
      id: this.c(payload, 'id'),
      date: this.c(payload, 'date'),
      dateClass: 'bold italic',
      title: 'codicel-peer-to-peer-send-review-header-title',
      amountLabel: 'codicel-peer-to-peer-send-review-header-subtitle',
      origin: {
        product: {
          id: this.c(payload, 'origin.product.id'),
          name: this.sourceSelected.alias
        },
        number: this.c(payload, 'origin.number'),
        avatar: this.images.accountDollar
      },
      destination: {
        product: {
          id: this.c(payload, 'destination.product.id'),
          name: this.receiver.alias
        },
        number: this.c(this.receiver, 'contract.number'),
        avatar: this.isBBVA ? this.images.phone : this.images.mobile,
        moreInfo: this._formatDestinationPhoneNumber(this.c(this.selectedContact, 'secondary'))
      },
      isOriginCardType: true,
      isDestinationCardType: true,
      transferType: 'mobile',
      fees: [
        {
          text: 'cells-summary-view-management-codicel-commission-fees',
          amount: 0,
          currency: 'MXN'
        }
      ],
      chargeAmount: {
        amount: this.c(payload, 'chargeAmount.amount'),
        currency: this.c(payload, 'chargeAmount.currency'),
        class: 'amount-huge-decimals'
      },
      topInfo: this._getTopInfo(this.isBBVA, payload),
      bottomMessage: {
        type: 'info',
        text: (this.userEmail) ? 'codicel-peer-to-peer-send-notification-with-email' : 'codicel-peer-to-peer-send-notification-without-email',
        icon: 'coronita:info',
        link: ''
      },
      operations: [
        {
          label: 'codicel-peer-to-peer-send-operation-share',
          id: 'share',
          icon: 'coronita:share'
        }
      ],
      buttons: {
        primary: {
          text: 'codicel-peer-to-peer-button-label-cancel',
          action: 'go-to-next'
        },
        secondary: {
          hidden: true
        }
      }
    };
    if (this.userEmail) {
      Object.assign(body.bottomMessage, {
        maskedMessage: {
          class: 'normal bold',
          text: this.userEmail.toLowerCase(),
          visibleChars: 12,
          maskChars: '&bull;'
        }
      });
    }
    if (!this.isBBVA) {
      this._dispatchCustomEvent('set-primary-link', this.get('references.1.value', payload));
      Object.assign(body, {
        message: {
          type: 'info',
          text: 'codicel-peer-to-peer-send-review-banxico-cep',
          icon: 'coronita:info',
          link: 'glomo-receipt-banxico-path',
        }
      });
    }
    return body;
  }

  _formatDestinationPhoneNumber(phone) {
    const lada = phone.substring(0, 2);
    const firstPart = phone.substring(2, 6);
    const secondPart = phone.substring(6, 10);

    return `${lada} ${firstPart} ${secondPart}`;
  }

  /**
   * @desc Generate field topInfo for result property
   * @param {Boolean} isBbva Flag if is internal transfer
   * @param {Object} payload From extract data
   * @returns Object
   */
  _getTopInfo(isBbva, payload) {
    const topInfo = [
      {
        value: ''
      },
      {
        key: 'cells-transaction-detail-concept',
        value: this.c(this.concept, 'concept'),
        class: 'spacing md light-key'
      },
      {
        key: 'codicel-peer-to-peer-send-review-operation-type',
        value: (isBbva) ? 'glomo-receipt-transfer-third-parties' : 'codicel-peer-to-peer-send-transfers-other-banks',
        class: 'spacing md light-key'
      },
      {
        key: (isBbva) ? 'codicel-peer-to-peer-send-review-operation-folio' : 'codicel-peer-to-peer-send-review-banxico-tracking-key',
        value: (isBbva) ? this.c(payload, 'operationNumber') : this.c(payload, 'references.0.value'),
        class: 'spacing md light-key'
      }
    ];
    if (!isBbva) {
      topInfo.shift();
      topInfo.unshift({ value: '' }, {
        key: 'cells-transaction-detail-transfer-reference',
        value: this.c(this.concept, 'reference'),
        class: 'spacing md light-key',
      });
    }
    return topInfo;
  }

  /**
   * @desc With response transfer its generate receipt content for share, validating if internal bank or interbank transfer
   * @param {Object} result Response transfer service
   * @returns {Object}  Body receipt
   */
  _getReceipt(result) {
    return this.isBBVA ? this._getInternalContentReceipt(result) : this._getInterbankContentReceipt(result);
  }

  /**
   * @desc Create content of a receipt for internal transfer
   * @param {Object} result Response transfer service
   * @returns {Object} Content receipt
   */
  _getInternalContentReceipt(result) {
    return {
      id: this.c(result, 'id'),
      operationType: 'Transferencia a terceros',
      operationFolio: this.c(result, 'topInfo.3.value'),
      ...this._getBaseContentReceipt(result)
    };
  }

  /**
   * @desc Create content of a receipt for interbank transfer
   * @param {Object} result Response transfer service
   * @returns {Object} Content receipt
   */
  _getInterbankContentReceipt(result) {
    return {
      numberReference: this.c(result, 'topInfo.1.value'),
      trackingCode: this.c(result, 'topInfo.4.value'),
      operationType: 'Transferencia a otros bancos',
      ...this._getBaseContentReceipt(result)
    };
  }
  /**
   * @desc Generate basic receipt for internal and interbank transfer
   * @param {Object} data from service
   * @returns Object
   */
  _getBaseContentReceipt(data) {
    return {
      date: this.c(data, 'date'),
      concept: (this.isBBVA) ? this.c(data, 'topInfo.1.value') : this.c(data, 'topInfo.2.value'),
      localAmount: this.c(data, 'chargeAmount'),
      fees: [
        {
          text: 'cells-successful-response-fees',
          amount: 0,
          currency: 'MXN',
        }
      ],
      origin: {
        product: this.c(data, 'origin.product'),
        number: this.c(data, 'origin.number'),
        bank: 'BBVA'
      },
      destination: {
        product: this.c(data, 'destination.product'),
        number: this.c(data, 'destination.number'),
        description: this.c(this.receiver, 'contract.bank.name')
      },
      templateSelected: this.isBBVA ? 'codicelInternalTransfer' : 'codicelExternalTransfer'
    };
  }

  /**
   * @desc Manage error on post service transfer
   * @param {Object} responseError from transfers
   * @event retry-error
   * @event transfer-error-code-analytics
   */
  handleTransferError(responseError) {
    if (this.c(responseError, 'error-code')) {
      let errorMessage = this.c(responseError, 'error-message');
      let errorCode = this.c(responseError, 'error-code');
      const errorModal = this._getErrorAlertConfig(errorCode, errorMessage);
      const valueException = !!errorCode;
      this._closeControlVeil();
      if (errorCode === 'KNE6666') {
        this._mtuFlag = true;
        this._dispatchCustomEvent('mtu-exception-handler-navigation', valueException);
      } else if (errorModal.alert && errorModal.event) {
        this._getServiceErrorModal({code: errorModal.alert, infoBody: errorModal.message, eventName: errorModal.event, btnAccept: errorModal.acceptBtLabel, btnCancel: errorModal.cancelBtLabel, isMaximized: true, title: errorModal.title, extraValues: errorModal.extraData});
      } else if (errorCode === this.errorLimitCode) {
        this._getConfigErrorModal({code: 'CODICEL-TRANSFER-ERROR', infoBody: errorMessage, eventName: errorModal.event, btnAccept: 'info-UNDERSTAND-accept'});
      } else {
        this._dispatchCustomEvent('retry-error', errorModal);
      }
      this._dispatchCustomEvent('transfer-error-code-analytics', errorCode);
    }
  }

  /**
   * @desc Gets error alert config
   * @param {String} errorCode for generate config
   * @param {String} errorMessage in other errors
   * @returns {Object}
   */
  _getErrorAlertConfig(errorCode, errorMessage) {
    const errorConfig = {
      CNE0234: {
        acceptBtLabel: this.t('codicel-peer-to-peer-send-transfers-error-amount-reduce'),
        cancelBtLabel: this.t('codicel-peer-to-peer-button-label-cancel'),
        srcImage: this.images.error,
        event: 'transfer-error'
      },
      CNE0235: {
        alert: 'CODICEL-TRANSFER-ERROR',
        title: this.t('codicel-peer-to-peer-send-title-transfers-error-daily-limits'),
        acceptBtLabel: this.t('codicel-peer-to-peer-send-transfers-error-amount-reduce'),
        cancelBtLabel: this.t('codicel-peer-to-peer-button-label-cancel'),
        srcImage: this.images.error,
        message: this.t('codicel-peer-to-peer-send-body-transfers-error-daily-limits'),
        event: 'transfer-error'
      },
      CNE0236: {
        alert: 'CODICEL-TRANSFER-ERROR',
        title: this.t('codicel-peer-to-peer-send-title-transfers-error-limits'),
        acceptBtLabel: this.t('codicel-peer-to-peer-send-transfers-error-amount-reduce'),
        cancelBtLabel: this.t('codicel-peer-to-peer-button-label-cancel'),
        srcImage: this.images.error,
        message: this.t('codicel-peer-to-peer-send-transfers-error-exceeded-amount-per-month'),
        event: 'transfer-error'
      },
      BGE0047: {
        alert: 'CODICEL-TRANSFER-ERROR',
        title: this.t('glomo-transfer-error-alert-title'),
        acceptBtLabel: this.t('glomo-transfer-own-transfer-foreign-currency-accept'),
        cancelBtLabel: this.t('glomo-transfer-own-transfer-foreign-currency-cancel'),
        srcImage: this.images.error,
        message: this.t('glomo-transfer-amount-exceeded-alert-error'),
        event: 'transfer-error'
      },
      MPE3502: {
        alert: 'CODICEL-TRANSFER-ERROR-CALL-BBVA',
        title: this.t('glomo-transfer-error-alert-title'),
        acceptBtLabel: this.t('glomo-help-header-title'),
        cancelBtLabel: '',
        srcImage: this.images.error,
        message: this.t('glomo-transfer-inactive-account-alert-error-message'),
        event: 'transfer-error'
      },
      FEE0479: {
        alert: 'CODICEL-TRANSFER-ERROR-UNDERSTAND',
        title: this.t('glomo-transfer-error-alert-title2'),
        acceptBtLabel: this.t('glomo-transfer-alert-error-accept-label'),
        cancelBtLabel: '',
        srcImage: this.images.error,
        message: this.t('glomo-transfer-alert-error-message-3'),
        event: 'transfer-error'
      },
      BNE0901: {
        alert: 'CODICEL-TRANSFER-ERROR-UNDERSTAND',
        title: this.t('glomo-transfer-incorrect-data-title'),
        acceptBtLabel: this.t('glomo-transfer-alert-error-accept-label'),
        cancelBtLabel: '',
        srcImage: this.images.error,
        message: this.t('glomo-transfer-alert-error-message-5'),
        event: 'transfer-error'
      },
      BGE1390: {
        alert: 'CODICEL-TRANSFER-ERROR-UNDERSTAND',
        title: this.t('glomo-transfer-error-alert-title'),
        acceptBtLabel: this.t('glomo-transfer-alert-error-accept-label'),
        cancelBtLabel: '',
        srcImage: this.images.error,
        message: this.t('glomo-transfer-alert-error-message-4'),
        event: 'transfer-error'
      },
      BGE0060: {
        alert: 'CODICEL-TRANSFER-ERROR-UNDERSTAND',
        title: this.t('glomo-transfer-error-alert-title'),
        acceptBtLabel: this.t('glomo-transfer-alert-error-accept-label'),
        cancelBtLabel: '',
        srcImage: this.images.error,
        message: this.t('glomo-transfer-verify-account-error-alert-message'),
        event: 'transfer-error'
      },
      FEE9801: {
        retryErrorData: {
          errorId: 'INTERBANK-NOT-AVAILABLE',
          errorType: 'operative',
          retryConfig: {
            className: 'error',
            hideCloseIcon: false,
            openMaximized: false,
            acceptBtLabel: 'codicel-peer-to-peer-button-label-undestand',
            cancelBtLabel: '',
            template: {
              type: 'paragraphs',
              values: [
                { icon: 'coronita:alert', iconClass: 'icon-size-36' },
                { text: 'codicel-peer-to-peer-send-transfers-error-interbank-try-later' }
              ]
            }
          },
          callConfig: {
            className: 'error',
            hideCloseIcon: false,
            openMaximized: false,
            acceptBtLabel: 'codicel-peer-to-peer-button-label-cancel',
            cancelBtLabel: '',
            template: {
              type: 'paragraphs',
              values: [
                { icon: 'coronita:alert', iconClass: 'icon-size-36' },
                { text: 'codicel-peer-to-peer-send-transfers-error-interbank-try-later' }
              ]
            }
          }
        }
      },
      NLE0023: {
        alert: 'CODICEL-TRANSFER-ERROR-CALL-BBVA-FRAUDULENT',
        title: 'codicel-peer-to-peer-send-not-possible-complete-transfer',
        acceptBtLabel: 'codicel-peer-to-peer-modal-btn-call-bbva-line',
        cancelBtLabel: 'codicel-peer-to-peer-button-label-cancel',
        srcImage: this.images.error,
        message: 'codicel-peer-to-peer-btn-call-bbva-line-with-executive',
        event: 'transfer-error',
        extraData: [
          { text: 'codicel-peer-to-peer-label-code', class: 'spacing--xs grey' },
          { text: 'PF-' + errorCode, class: 'spacing--xs' },
          { text: ' ', class: 'spacing' },
          {
            text: this.t('codicel-peer-to-peer-title-call-schedule-first') + this._applyPhoneMask(this.saPhoneNumber.phoneNumber) + this.t('codicel-peer-to-peer-title-call-schedule-second'),
            class: 'spacing--xs'
          }
        ]
      }
    };
    const genericErrorConfig = this._getRetryMediaModal({errorCode: 'COMMON-ERRORS', message: errorMessage, btnAccept: 'glomo-transfer-alert-error-accept-label', btnCancel: ''});
    return errorConfig[errorCode] ? errorConfig[errorCode] : genericErrorConfig;
  }

  /**
   * @desc Creates config to show in modal
   * @param {Object} config properties that create error modal
   * @event eventName
   */
  _getServiceErrorModal(config) {
    let { code, infoBody, eventName, btnAccept, btnCancel = '', isMaximized = false, title = '', extraValues = [] } = config;
    const body = {
      code: code,
      selectedConfig: {
        className: 'full-height-error common-error-modal',
        openMaximized: isMaximized,
        iconOnlyFullHeight: true,
        heroImage: this.images.error,
        title: 'codicel-peer-to-peer-send-header-title',
        acceptBtLabel: btnAccept,
        cancelBtLabel: btnCancel,
        template: {
          type: 'paragraphs',
          values: [
            { title },
            { text: infoBody, class: 'spacing' },
            ...extraValues
          ]
        }
      }
    };
    this._dispatchCustomEvent(eventName, body);
  }

  /**
   * @desc Handles transfer error when amount to send surpasses account limits
   * @event amount-change-error-limits
   */
  handleAmountTransferError() {
    this._dispatchCustomEvent('amount-change-error-limits', false);
  }

  /**
   * @desc Handles transfer error when call BBVA line option is selected
   * @event call-bbva-line
   */
  handleErrorCallBBVA() {
    this._dispatchCustomEvent('call-bbva-line', this.bbvaPhone);
  }
  /**
   * @desc Handles transfer error when call BBVA line option is selected with code NLE0023
   * @event call-bbva-line
   */
  handleErrorCallBBVATransfer() {
    this._dispatchCustomEvent('call-bbva-line',  this.saPhoneNumber);
  }

  /**
   * @desc changes the label of the concept component on resume
   * @event concept-required-label
   */
  changeLabelConcept() {
    this._dispatchCustomEvent('concept-required-label', 'codicel-peer-to-peer-send-step-concept-label');
  }
  /**
   * @desc changes the label of the concept component when change concept
   * @event concept-required-label
   */
  changeLabelConceptOptional() {
    if (this.isBBVA) {
      this._dispatchCustomEvent('concept-required-label', 'cells-step-concept-optional-label');
    }
  }

  /* ================================================
                    SHARE RECEIPT
  ================================================ */
  /**
   * Send data to action launcher plugin to share receipt image
   * @param {Object} file to send
   * @event codicel-share-receipt
   */
  shareReceipt(file) {
    this._dispatchCustomEvent('codicel-share-receipt', {
      value: file.receipt,
      mimetype: 'image/jpeg'
    });
  }

  /**
  * Show exit modal when user tap link external
  * @event dashboard-native-logout-confirm
  **/
  manageLinkExternalLogout() {
    this._dispatchCustomEvent('dashboard-native-logout-confirm', {
      code: 'LOGOUT',
      primaryButtonClass: 'secondary',
      selectedConfig: {
        className: 'error',
        openMaximized: true,
        heroImage: this.images.error,
        title: 'alert-LOGOUT-accept',
        acceptBtLabel: 'alert-LOGOUT-EXTERNAL-LINK-accept',
        cancelBtLabel: 'alert-LOGOUT-EXTERNAL-LINK-cancel',
        template: {
          type: 'paragraphs',
          values: [
            { text: 'alert-LOGOUT-EXTERNAL-LINK-message' }
          ]
        }
      }
    });
  }

  /**
   * @desc Send external link from channel to logout and navigate
   * @event logout-and-go-to-banxico
   */
  logoutAndNavigateBanxicoCEP() {
    this._dispatchCustomEvent('logout-and-go-to-banxico', {
      scheme: this.t(this.primaryExternalLink),
      packageId: null,
    });
  }

  /* ================================================
                    EXIT
  ================================================ */
  /**
   * @desc Validate if user filled any step or not
   */
  requestExitCodicel() {
    if (!this.receiver) {
      this.exit();
    } else {
      setTimeout(()=>{
        this._getConfigErrorModal({code: 'LEAVE-PAGE-CODICEL', infoBody: 'codicel-peer-to-peer-request-exit-modal', eventName: 'send-config-leave-codicel', btnAccept: 'codicel-peer-to-peer-button-label-cancel', btnCancel: 'codicel-peer-to-peer-button-label-continue'});
      }, 300);
    }
  }

  /**
   * @desc Restart steps and dispatch event to leave CoDi Cel
   * @event exit-codicel-page
   */
  exit() {
    this.restart();
    this._dispatchCustomEvent('exit-codicel-page');
    this._dispatchCustomEvent('reset-invalid-input', false);
    this.banxicoResponse = {};
    this.trackingURL = '';
    this.comeFromExpensesGroup = false;
  }

  /* ================================================
                    MODALS CONFIG
  ================================================ */
  /**
   * @desc Create configuration to open modal and invite user to CoDi
   * @event invite-enroll-codicel
   */
  _getInviteCoDiCelConfig() {
    const configEnrollmentCodi = {
      code: 'CODICEL-INVITE-CONTACT-MODAL',
      textWithIcon: 'text-with-no-icon',
      selectedConfig: {
        closeOnPrimaryButton: false,
        className: 'header--white',
        iconOnlyFullHeight: true,
        openMaximized: true,
        title: 'codicel-peer-to-peer-invite-contact-title',
        acceptBtLabel: 'codicel-peer-to-peer-invite-contact-accept-btn',
        cancelBtLabel: 'codicel-peer-to-peer-invite-contact-cancel-btn',
        template: {
          type: 'paragraphs',
          values: [
            {
              icon: 'coronita:info',
              iconClass: 'icon-size-24',
              message: 'codicel-peer-to-peer-invite-contact-notice',
              type: 'info-dark'
            },
            { text: 'codicel-peer-to-peer-invite-contact-subtitle-phone', class: 'grey ul-li--text-left' },
            { text: this._applyPhoneMask(this.phone), class: 'ul-li--text-left spacing' }
          ]
        }
      }
    };
    if (this.contactNameFromAgenda) {
      configEnrollmentCodi.selectedConfig.template.values.push(
        { text: 'codicel-peer-to-peer-invite-contact-subtitle-name', class: 'grey ul-li--text-left' },
        { text: this.contactNameFromAgenda, class: 'ul-li--text-left' }
      );
    }
    this._dispatchCustomEvent('invite-enroll-codicel', configEnrollmentCodi);
  }

  /**
   * @desc Creates config to show in modal
   * @param {Object} config Generate modal with custom config
   * @event eventName from config property
   */
  _getConfigErrorModal(config) {
    const {code, infoBody, eventName, btnAccept, btnCancel = '', isMaximized = false, title = '', titleClass = ''} = config;
    const body = {
      code: code,
      selectedConfig: {
        className: 'error',
        openMaximized: isMaximized,
        iconOnlyFullHeight: true,
        acceptBtLabel: btnAccept,
        cancelBtLabel: btnCancel,
        template: {
          type: 'paragraphs',
          values: [
            { icon: 'coronita:alert', text: title, class: titleClass },
            { text: infoBody }
          ]
        }
      }
    };
    this._dispatchCustomEvent(eventName, body);
  }

  /**
   * @desc Generate config to build error modal
   * @return {Object} setting to modal
   */
  _generateErrorModal() {
    return {
      code: 'CODICEL-PERMISSION-DENIED-CONTACTS-PLUGIN',
      selectedConfig: {
        className: 'full-height-info image--md',
        hideCloseIcon: false,
        openMaximized: true,
        title: 'codicel-peer-to-peer-modal-settings-title',
        heroImage: this.images.contactsAgenda,
        acceptBtLabel: 'codicel-peer-to-peer-modal-settings-accept-button',
        onAcceptDetail: {
          setting: 'application'
        },
        cancelBtLabel: 'codicel-peer-to-peer-button-label-cancel',
        template: {
          type: 'paragraphs',
          values: [
            {
              text: 'codicel-peer-to-peer-modal-settings-text'
            }
          ]
        }
      }
    };
  }

  /**
   * @desc Build error case when BANXICO is not available
   * @returns {Object} Config modal
   */
  _getErrorConfigBanxico() {
    let config = {
      className: 'header--white full-height-error common-error-modal',
      hideCloseIcon: false,
      openMaximized: true,
      header: 'codicel-peer-to-peer-send-header-title',
      heroImage: this.images.error,
      acceptBtLabel: 'codicel-peer-to-peer-modal-btn-retry',
      cancelBtLabel: 'codicel-peer-to-peer-modal-btn-close',
      template: {
        type: 'paragraphs',
        values: [
          { title: 'codicel-peer-to-peer-modal-title-not-available' },
          { text: 'codicel-peer-to-peer-modal-body-not-available-internet' }
        ]
      }
    };
    let callConfig = Object.assign({}, config);
    callConfig.acceptBtLabel = 'codicel-peer-to-peer-modal-btn-call-bbva-line';

    let retryErrorData = {
      errorId: 'BANXICO-NOT-AVAILABLE',
      errorType: 'operative',
      retryConfig: config,
      callConfig
    };

    return Object.assign({retryErrorData});
  }

  /**
   * @desc Create configuration to open modal and invite user to CoDi from transfer flow
   * @event invite-enroll-codicel
   */
  getInviteCoDiCelConfigTransfer() {
    const configInviteContact = {
      code: 'CODICEL-INVITE-CONTACT-TRANSFER-MODAL',
      textWithIcon: 'text-with-no-icon',
      selectedConfig: {
        closeOnPrimaryButton: false,
        className: 'header--white',
        iconOnlyFullHeight: true,
        openMaximized: true,
        title: 'codicel-peer-to-peer-invite-contact-title-transfer',
        acceptBtLabel: 'codicel-peer-to-peer-invite-contact-accept-btn',
        template: {
          type: 'paragraphs',
          values: [
            {
              icon: 'coronita:info',
              iconClass: 'icon-size-24',
              message: 'codicel-peer-to-peer-invite-contact-notice-invite-dimo',
              type: 'info-dark'
            },
            { text: 'codicel-peer-to-peer-invite-contact-subtitle-phone', class: 'grey ul-li--text-left' },
            { text: this._parsePhone(this.phone), class: 'ul-li--text-left spacing' }
          ]
        }
      }
    };
    if (this.contactNameFromAgenda) {
      configInviteContact.selectedConfig.template.values.push(
        { text: 'codicel-peer-to-peer-invite-contact-subtitle-name', class: 'grey ul-li--text-left' },
        { text: this.contactNameFromAgenda, class: 'ul-li--text-left' }
      );
    }
    this._dispatchCustomEvent('invite-enroll-codicel', configInviteContact);
  }

  /**
   * @desc Create configuration to open modal and invite user to CoDi
   * @event invite-enroll-codicel
   */
  _getInviteCoDiCelPreModal() {
    const configEnrollmentCodi = {
      code: 'CODICEL-NOT-FUND-MODAL',
      textWithIcon: 'text-with-no-icon',
      selectedConfig: {
        closeOnPrimaryButton: false,
        className: 'header--white',
        iconOnlyFullHeight: true,
        noCancelOnOutsideClick: true,
        acceptBtLabel: 'codicel-peer-to-peer-invite-contact-title-transfer',
        cancelBtLabel: 'codicel-peer-to-peer-invite-contact-cancel-btn-other-moment',
        template: {
          type: 'paragraphs',
          values: [
            { icon: 'coronita:help', class: 'icon-size-32 info'},
            { title: 'codicel-peer-to-peer-invite-contact-subtitle-phone-not-found', class: 'text-center' },
            { text: 'codicel-peer-to-peer-invite-contact-message-invite-phone', class: 'text-center' },
          ]
        }
      }
    };
    this._dispatchCustomEvent('invite-enroll-codicel', configEnrollmentCodi);
    this._dispatchCustomEvent('get-all-contacts-cel');
    this._dispatchCustomEvent('close-modal-new-recipient');
  }

  /* ================================================
                    UTILS
  ================================================ */
  /**
   * Save data in local storage
   * @param {String} key instance to save in local storage
   * @param {Object} data Info to save
   * @event set-local-storage-codicel
   */
  _saveDataLocalStorage(key, data) {
    let dataLocalStorage = {
      key: key,
      value: data
    };
    this._dispatchCustomEvent('set-local-storage-codicel', dataLocalStorage);
  }

  /**
   * @desc Remove duplicated objects in array by comparison key
   * @returns {Array}
   */
  _getUnique(arr, comp) {
    const unique = arr
      .map(e => e[comp].replace(/\s/g, ''))
      .map((e, i, final) => final.indexOf(e) === i && i)
      .filter((e) => arr[e])
      .map(e => arr[e]);

    return unique;
  }

  /**
   * Parse contact list from mobile contacts for MX
   */
  _parseContactBook(contacts, code = '') {
    let contactsCleaned = this._cleanDuplicatedNumbers(contacts);
    return Array.prototype.concat.apply([], contactsCleaned.map(({ phoneNumbers = [], name: contactName = {} }) => {
      return phoneNumbers.filter(phone => this._phoneFilter(phone)).map(phone =>
        ({
          value: `${code}${this._getMobileNumber(this._cleanPhone((phone || {}).value))}`,
          name: `${contactName.displayName || ''}`,
          contactType: { id: 'MOBILE' },
          nickName: `${contactName.nickName || ''}`
        }));
    }));
  }

  /**
   * @desc filter mobile contact from plugin
   * @param {Array} contactsPlugin
   * @return {String} contactName or empty
   * @event set-contact-fund
   * @event hidden-contact-fund
   */
  filterMobileContact(contactsPlugin) {
    this.contactList = this._parseContactBook(contactsPlugin);
    const contactFund = this.contactList.filter(contact => contact.value === this.phone);
    const contactName = contactFund.length === 1 ? contactFund[0]?.name : '';
    this.contactNameFromAgenda = contactName;
  }

  /**
   * @desc Parse phone with specific format
   * @param {String} phone
   * @return {String} phone cleaned format XX XX XX XX XX
   */
  _parsePhone(phone) {
    return phone.split('').reduce((acc, item) => acc.replace('X', item), 'XX XX XX XX XX');
  }
}

customElements.define(GlomoOpxPeerToPeerMxDm.is, GlomoOpxPeerToPeerMxDm);
