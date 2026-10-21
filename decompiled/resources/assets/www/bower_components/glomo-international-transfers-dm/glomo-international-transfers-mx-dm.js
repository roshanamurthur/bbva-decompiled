/* eslint no-shadow: "error" */
class GlomoInternationalTransfersMxDm extends Polymer.mixinBehaviors([CellsBehaviors.i18nBehavior, CellsBehaviors.CellsCheckNestedKeysBehavior], Polymer.Element) {

  static get is() {
    return 'glomo-international-transfers-mx-dm';
  }

  static get properties() {
    return {
      /**
       * @desc object with the data of the product selected by the user
       * @type {Object}
       */
      principalAccount: {
        type: Object,
        value: ''
      },
      /**
       * @desc the id of the account used
       * @type {String}
       */
      productId: {
        type: String,
        value: ''
      },
      /**
       * @desc object with the data of the destination bank selected by the user
       * @type {Object}
       */
      bankDestinationInfo: {
        type: Object,
        value: {}
      },

      /**
       * @desc the client id
       * @type {String}
       */
      clientId: {
        type: String,
        value: ''
      },

      /**
       * @desc object that formats the information of step 2
       * @type {Object}
       */
      currencyExchange: {
        type: Object,
        value: ''
      },
      /**
       * @desc the text when the spinner shows
       * @type {String}
       */
      spinnerEventshowText: {
        type: String,
        value: 'show-spinner-text-evet'
      },
      /**
       * @desc object that contains the info of the actual origin currency
       * @type {Object}
       */
      currentCountryOrigin: {
        type: Object,
        value: {
          flag: 'images/transfers/Mexico.svg',
          currency: 'MXN'
        }
      },
      /**
       * @desc object that contains the info of the actual destination currency
       * @type {Object}
       */
      currentCountryDestination: {
        type: Object,
      },
      /**
       * @desc controls the state of the flag swap
       * @type {Boolean}
       */
      invertedFlags: {
        type: Boolean,
        notify: false
      },
      /**
       * @desc collect the information provided on the create recipient page
       * @type {Object}
       */
      addresseeInfo: {
        type: Object,
        value: {}
      },
      /**
       * @desc collect the information provided on the review recipient page
       * @type {Object}
       */
      personalInformation: {
        type: Object,
        value: {}
      },
      /**
       * @desc collects information from the recipient's name
       * @type {String}
       */
      personalInformationAddresseeName: {
        type: String,
        value: '',
        observer: 'addresseeInformation'
      },
      /**
       * @desc collects information from the recipient's address
       * @type {String}
       */
      personalInformationAddresseeAdress: {
        type: String,
        value: '',
        observer: 'addresseeInformation'
      },
      /**
       * @desc collects information from the recipient's city
       * @type {String}
       */
      personalInformationAddresseeCity: {
        type: String,
        value: '',
        observer: 'addresseeInformation'
      },
      /**
       * @desc collects information from the recipient's country
       * @type {String}
       */
      personalInformationAddresseeCountry: {
        type: String,
        value: '',
        observer: 'addresseeInformation'
      },
      /**
      * @desc flag enabled when timer is active
       * @type {Boolean}
      */
      timerEnabled: {
        type: Boolean,
        value: false
      },
      /**
       * @desc object with the data of the response given by the quotation service
       * @type {Object}
       */
      responseQuotation: {
        type: Object,
        value: {}
      },
      /**
       * @desc flag to execute the sticky @type {Boolean}
       */
      canExecute: {
        type: Boolean,
        value: false
      },
      /**
       * @desc object with the information of the concept - step 3
       * @type {Object}
       */
      conceptInfo: {
        type: Object,
        value: {}
      },
      /**
       * @desc object with the scroll information on the success screen
       * @type {Object}
       */
      scrollCompleteSuccess: {
        type: Object,
        value: {}
      },
      /**
       * @desc native global cache storege glomomx @type {Object}
       **/
      globalUser: {
        type: Object
      },
      /**
      * Error code when the key doesn't exist in local storage
      * @type {Number}
      */
      localStorageErrorCode: {
        type: Number,
        value: 999
      },
      /**
       * Local storage key to save _localStorageData
       * @type {String}
       */
      _internationalTransferLocalStorageDataKey: {
        type: String,
        value: 'intenational_transfers_info'
      },
      /**
       * Local storage key to save login data
       * @type String
       */
      _loginDataKey: {
        type: String,
        value: 'loginData'
      },
      /**
       * @desc native global cache storege glomocells @type {Object}
       **/
      globalCacheStorage: {
        type: Object
      },
      /**
       * @desc the date of the transaction @type {String}
       **/
      formatDate: {
        type: String,
        value: ''
      },
      /**
       * @desc the hour of the transaction @type {String}
       **/
      formathHour: {
        type: String,
        value: ''
      },
      /**
       * @desc the user Email @type {String}
       **/
      userEmail: {
        type: String,
        value: ''
      },
      /**
       * @desc the count of errors on the flow @type {Number}
       **/
      countError: {
        type: Number,
        value: 0
      },
      /**
       * @desc the count of errors on the flow @type {Number}
       **/
      countChangeInput: {
        type: Number,
        value: 0
      },
      /**
       * @desc the actual local amount/ origin input value @type {String}
       **/
      localAmount: {
        type: String,
        value: ''
      },
      /**
       * @desc the actual receiver amount/ destination value @type {String}
       **/
      receiverAmount: {
        type: String,
        value: ''
      },
      /**
       * @desc have the actual smaller currency @type {String}
       **/
      quoteCurrency: {
        type: String,
        value: 'MXN'
      },
      /**
       * @desc have the actual smaller currency @type {Number}
       **/
      amountOriginToChange: {
        type: Number,
        value: 0
      },
      /**
       * @desc have the actual smaller currency @type {String}
       **/
      baseCurrency: {
        type: String,
        value: 'USD'
      },
      /**
       * @desc flag that indicates the zero error is launched
       * @type {Boolean}
       **/
      zeroErrorEnabled: {
        type: Boolean,
        value: false
      },
      /**
       *  Save data received from local storage
       * @type {Object}
       */
      _localStorageData: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc flag that indicates that the error in quotation message are showed
       * @type {Boolean}
       **/
      errorQuotation: {
        type: Boolean,
        value: false
      },
      /**
       * @desc if close icon is pressed
       * @type {Boolean}
       **/
      amountIsEmpty: {
        type: Boolean,
        value: false
      },
      /**
       * @desc flag that enables whether to validate the inputs for page return
       * @type {Boolean}
       **/
      validateInputModify: {
        type: Boolean,
        value: true
      },
      dataSucces: {
        type: Object,
        value: {}
      },
      /**
       * Array of accounts before being parsed into specific structure
       */
      globalAccounts: {
        type: Array,
        value: () => [],
      },
      /**
       * @desc make dinamic the class of the bank help info modal
       * @type {String}
      **/
      bankModalClassName: {
        type: String,
        value: 'paragraphs__list header--white deposit-imposition-info-icon',
      },
      /* Height to Screen
       * @type {Number}
      **/
      screenHeight: {
        type: Number,
        value: 1300
      },
      /**
       * flag that enables show opinator
       */
      _isQuotationDone: {
        type: Boolean,
        value: false
      },
      /**
       * flag that enables to diferential between abandon 1 and abandon 2
       */
      _isAbandonSummary: {
        type: Boolean,
        value: false
      },
      /**
       * Flag to enable prepare feedback event and disable exit event
       * @type String
       */
      enablePrepareFeedback: {
        type: Boolean,
        value: false
      },
      /**
       * @desc Contain the relationship to recipient question data
       * @type {Object}
       * @prop {String} id question ID
       * @prop {String} description description question
       * @prop {Object} availableAnswers available answers
       */
      _relationshipToRecipientQuestion: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Contain a list of the available answers for the
       * reason transfer question
       * @type {Array}
       */
      _relationshipToRecipientAvailableAnswers: {
        type: Array,
        value: () => ([])
      },
      /**
       * @desc Contain the relationship to recipient answer
       * @type {Object}
       */
      _relationshipToRecipientAnswer: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Contain the recipient relationship answer name
       * @type {String}
       */
      _relationshipToRecipientAnswerName: {
        type: String,
        value: '',
        observer: 'addresseeInformation'
      },
      /**
       * @desc Contain the reason transfer question data
       * @type {Object}
       * @prop {String} id question ID
       * @prop {String} description description question
       * @prop {Object} availableAnswers available answers
       */
      _reasonForTransferQuestion: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Contain a list of the available answers for the
       * reason transfer question
       * @type {Array}
       */
      _reasonForTransferAvailableAnswers: {
        type: Array,
        value: () => ([])
      },
      /**
       * @desc Contain reason transfer answer
       * @type {Object}
       */
      _reasonForTransferAnswer: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Contain recipient relationship answer data
       * @type {Object}
       * @property {String} id ID of the answer
       * @property {String} name name of the answer
       */
      _recipientRelationshipAnswer: {
        type: String,
        value: () => ({}),
      },
      /**
       * @desc Contain economic activities data
       * @type {Array}
       */
      economicActivities: {
        type: Array,
        value: () => ([])
      },
      /**
       * @desc Indicator for know if has foreign economic activity answer
       * @type {Boolean}
       */
      _hasEconomicActivitiesForeign: {
        type: Boolean,
        value: false
      },
      /**
       * Set body of step concept
       * @type {Object}
       */
      conceptSetProperties: {
        type: Object,
        value: {}
      },
      /**
       * Set value input of reference
       * @type {String}
       */
      inputReference: {
        type: String,
        value: ''
      },
      /**
      * @desc Get country value
       * @type {Object}
      */
      countryValue: {
        type: Object,
        value: {}
      },
      /**
       * @description flag to handler payment MTU
       * @type {Object}
       */
      mtuFlag: {
        type: Object,
        value: () => ({}),
      },
      /**
       * @description default time for timer
       * @type {Number}
       */
      _timerDefaulTime: {
        type: Number,
        state: true,
        value: 0
      },
    };
  }

  /**
   * @desc start the flow by instantiating product user information and initializing all components
   * @param {Boolean} data - with the data of the product
   */
  initializationData(data) {
    this.productId = data.productId;
    if (data.data !== undefined) {
      this.principalAccount = data.data;
    } else {
      this.principalAccount = data;
    }
    let accountAssociated = {
      name: ' ',
      nameDescription: this.principalAccount.alias,
      primaryAmount: {
        amount: this.principalAccount.availableBalance.currentBalances[0].amount,
        currency: this.principalAccount.availableBalance.currentBalances[0].currency,
        label: 'glomo-international-transfers-available-balance'
      },
      description: {
        value: this.principalAccount.number,
        masked: true
      }
    };
    this._dispatchEvents('set-account-associated', accountAssociated);

    const resetTimer = {
      timeout: 0
    };
    this._dispatchEvents('reset-only-timer', resetTimer);

    if ((this.userEmail.trim() === '' || this.userEmail === undefined) && this.globalCacheStorage !== undefined) {
      this._dispatchEvents('get-customer-detail', {
        customerId: this.globalCacheStorage.customer.customerId
      });
    }

    let productSelectorCollapsed = {
      shouldHideChangeButton: true,
      collapsed: true
    };
    this._dispatchEvents('collaps-product-selector', productSelectorCollapsed);

    this._dispatchEvents('set-default-data-contacts-step', true);

    this.generateForeignExchangeInfo();
    this.set('conceptSetProperties', {
      referenceClass: 'space',
      conceptClass: 'concept-in-line',
      referenceName: this.t('cells-international-transfers-condition-country-reference'),
      _reference: this.inputReference,
      inputConcept: ''
    });

    this.conceptInfo.concept = '';
    this._conditionContry(this.currentCountryDestination.currency);
    this._dispatchEvents('check-open-modal-exit-confirm');
    this._dispatchEvents('get-international-transfer-from-local-storage', {key: this._internationalTransferLocalStorageDataKey});
    this._dispatchEvents('customer-id-changed', this.get('customer.customerId', this.globalCacheStorage));
    this._dispatchEvents('dispatch-timer-description', this.t('glomo-international-transfers-aggregation-circular-timer-description'));
    this.getMoneyLaunderingQuestionnaire();

    this._getLocalStorage(this._loginDataKey, true);
  }

  /**
   * @desc Consult variable in localStorage
   * @param {String} key
   * @event get-local-storage
   */
  _getLocalStorage(key, secure = false) {
    this._dispatchEvents('get-local-storage', { key, secure });
  }

  /**
   * @desc get id for nativo
   * @param {Object} data
   */
  loginDataLocalStoreSuccess(data) {
    this.clientId = data?.grantingTicketUserId;
  }

  /**
   * Parsed data of concept step for countries
   * @param {Boolean} country - current country destination
   * @event send-required
   */
  _conditionContry(country = '') {
    let required = false;
    if (country === 'PERU') {
      Object.assign(this.conceptSetProperties, {
        referenceClass: 'space',
        maxLength: '11',
        conceptClass: 'concept-in-line',
        referenceName: this.t('cells-international-transfers-condition-country-reference'),
        inputConcept: this.conceptSetProperties.conceptLabel === this.t('cells-international-transfers-condition-country-concept') ? '' : this.conceptInfo.concept,
        conceptLabel: this.t('cells-international-transfers-condition-country-ruc-o-dni'),
        infoMessage: this.t('cells-international-transfers-condition-country-pe'),
        infoMessageIcon: 'coronita:info',
        _reference: this.inputReference
      });
      required = true;
    } else {
      this.conceptInfo.concept = this.conceptSetProperties.conceptLabel === this.t('cells-international-transfers-condition-country-ruc-o-dni') ? '' : this.conceptInfo.concept;
      Object.assign(this.conceptSetProperties, {
        inputConcept: this._isAbandonSummary && this.conceptInfo.concept === '' ? this.t('cells-international-transfers-condition-country-not-concept') : this.conceptInfo.concept,
        maxLength: '30',
        conceptLabel: this.t('cells-international-transfers-condition-country-concept'),
        infoMessage: '',
        infoMessageIcon: '',
        _reference: this.inputReference
      });
    }

    this._dispatchEvents('send-required', required);
    this._dispatchEvents('set-inital-concept', this.conceptSetProperties);
  }

  /**
   * Function that validate country value
   */
  validateCountry() {
    this._conditionContry(this.countryValue);
  }

  /**
   * Send event to set data in local storage
   */
  _setLocalStorageData() {
    let dataStorage = {
      key: this._internationalTransferLocalStorageDataKey,
      value: this._localStorageData
    };
    this._dispatchEvents('set-international-transfer-on-local-storage', dataStorage);
  }

  /**
   * @desc This functions is used for persist principal account data and send it through
   * internationalTransfersCreateRecipient page and subsequently to internationalTransfersReviewRecipient page
   * @param {Boolean} isError
  */
  persistPrincipalData(isError) {
    if (!isError) {
      this.resetToQuotation(true);
    }
    this._dispatchEvents('show-new-addressee', this.principalAccount);
  }

  /**
   * @desc Show an animation in the sticky and hide with animation too
   * @param {Object} scrollDetail
   */
  animationStiky(scrollDetail) {
    let { offsetHeight, scrollHeight, scrollTop } = scrollDetail.target;
    let realScreenHeight = (scrollHeight - offsetHeight) - 160;

    if (this.canExecute) {
      if (scrollTop >= realScreenHeight) {
        this.async(() => {
          this._dispatchEvents('open-stiky-animation', true);
        }, 300);
      }
    }
  }

  /**
   * @desc Create a object in page create and review. This Object is send when the button in the header is clicked
   */
  modalConfirmExit() {
    const alertLeaveOperativeMock = {
      code: 'INTERNATIONAL-TRANSFER-EXIT',
      selectedConfig: {
        className: 'alert error',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'cells-international-transfers-screen-button',
        cancelBtLabel: 'cells-international-transfers-primary-button-close-modal-screen',
        template: {
          type: 'paragraphs',
          values: [
            { icon: 'coronita:alert' },
            { text: `${this.t('alert-EXIT-internationalTransfers-message')}` }
          ]
        }
      }
    };
    if (this.validateInputModify) {
      if (this.addresseeInfo.bankCode.trim() === '' && this.addresseeInfo.accountNumber.trim() === '') {
        this._dispatchEvents('exit-page-international-transfers');
      } else {
        this._dispatchEvents('dispatch-modal-settings', alertLeaveOperativeMock);
      }
    } else {
      this._dispatchEvents('dispatch-modal-settings', alertLeaveOperativeMock);
    }
  }

  /**
   * Method that send data productId and reset page in modal exit
   */
  exitPageAccount() {
    if (this.enablePrepareFeedback && this._isQuotationDone) {
      if (this._isAbandonSummary) {
        this._dispatchEvents('prepare-feedback-event', { feedbackOperation: 'international_transfer_abandon_summary'});
      } else {
        this._dispatchEvents('prepare-feedback-event', { feedbackOperation: 'international_transfer_abandon_quotation'});
      }
    } else {
      this._dispatchEvents('close-page-redirec-to-back', { productId: this.productId });
    }
    this.reset();
  }

  /**
   * Method that get to customer id
   */
  getCustomerId() {
    this._dispatchEvents('customer-id-changed', this.globalCacheStorage.customer.customerId);
  }

  /**
   * Method that launch success opi
   */
  exitSuccess() {
    if (this.enablePrepareFeedback) {
      this._dispatchEvents('prepare-feedback-event', { feedbackOperation: 'international_transfer_success'});
    } else {
      this._dispatchEvents('close-page-redirec-to-back', { productId: this.productId });
    }
  }

  /**
   * @desc Create a object in international transferPage. This Object is send when the button in the header is clicked
   */
  modalConfirmExitFlow() {
    const alertLeaveOperativeMock = {
      code: 'INTERNATIONAL-TRANSFER-EXIT-FLOW',
      selectedConfig: {
        className: 'alert error',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'cells-international-transfers-screen-button',
        cancelBtLabel: 'cells-international-transfers-primary-button-close-modal-screen',
        template: {
          type: 'paragraphs',
          values: [
            { icon: 'coronita:alert' },
            { text: `${this.t('alert-EXIT-internationalTransfers-message')}` }
          ]
        }
      }
    };
    this._dispatchEvents('dispatch-modal-settings', alertLeaveOperativeMock);
  }

  /**
   * @desc Method that call channels to return to dashboard
   */
  returnDashboard() {
    this._dispatchEvents('return-page-dashboard-operation');
    this.reset();
  }

  /**
   * method that generates flags
   * @desc method that initializes the component information of step 2
   */
  generateForeignExchangeInfo() {
    const selectAmount = this.principalAccount.availableBalance.currentBalances[0].amount;
    const localCurrency = this.principalAccount.currencies[0].currency;
    this.currentCountryOrigin = {
      flag: localCurrency === 'MXN' ? 'images/transfers/Mexico.svg' : 'images/transfers/Usa.svg',
      currency: localCurrency
    };
    this.currentCountryDestination = {
      flag: 'images/transfers/Usa.svg',
      currency: 'USD'
    };
    this.currencyExchange = {
      commissionCurrencyList: [],
      additionalInfo: undefined,
      countryFlag: this.currentCountryDestination.flag,
      currency: this.currentCountryOrigin.currency,
      currencySelectDisabled: true,
      currencySelectorVisible: true,
      currencySelected: {
        labelImg: {
          src: this.currentCountryOrigin.flag
        },
        id: this.currentCountryOrigin.currency
      },
      originCurrency: '$',
      customFirstCurrency: this.currentCountryOrigin.currency,
      customSecondCurrency: this.currentCountryDestination.currency,
      customCurrencySelectTitle: `${this.t('glomo-international-transfers-foreign-currency-select-title')}`,
      currencyCountryText: this.getCorrectFlagAfterResponse(),
      localCurrencyIsDifferentThanEquivalenceCurrencies: true,
      exchangeRateSelected: {
        rate: 0,
        currency: this.currentCountryDestination.currency,
      },
      flag: false,
      infoMessageData: {
        title: '',
        text: `${this.t('glomo-international-transfers-foreign-currency-info-show-exchange')}`
      },
      infoText: '',
      exchangeRatesWithLocalOnOrigin: true,
      localCurrency: this.currentCountryOrigin.currency,
      limitedAmountAvailableMessage: 'cells-international-transfers-inital-amount-available',
      limitedAmountAvailableOfTransactionMessage: 'cells-international-transfers-limited-amounta-available',
      majorVersionThree: true,
      maxProduct: parseInt(selectAmount),
      maxLimit: parseInt(selectAmount),
      iconMessageType: 'info-dark',
      minLimint: 0.01,
      showAlertBeforeUncollapsing: true,
      conversionText: false,
      showExchange: true,
      showIconButtonInExchangeRatesSection: true,
      showInfoMessage: true,
      showSelectorInForeignCurrencyFlag: true,
      totalHeader: `${this.t('glomo-international-transfers-foreign-currency-total-header')}`,
      totalCurrency: this.currentCountryDestination.currency,
      setForeignAmount: '',
      foreignCurrencySelected: { id: this.currentCountryDestination.currency }
    };
    this._dispatchEvents('set-currency-exchange', this.currencyExchange);
  }


  /**
   * @desc Make the change of flags within the component of step 2
   */
  swapFlagsCountries() {
    const selectAmount = this.principalAccount.availableBalance.currentBalances[0].amount;
    this.invertedFlags = !this.invertedFlags;
    const variableCountry = this.currentCountryOrigin;
    this.currentCountryOrigin = this.currentCountryDestination;
    this.currentCountryDestination = variableCountry;
    if (this.currentCountryOrigin.currency === 'PEN') {
      this.currentCountryOrigin.flag = 'images/transfers/Peru.svg';
    }
    const variableAmount = this.receiverAmount;
    if (this.localAmount !== '') {
      this._validAmount(this.localAmount);
      this.receiverAmount = parseFloat(this.localAmount) === 0 ? '0.00' : this.localAmount;
    } else {
      this.receiverAmount = '0.00';
    }
    this.localAmount = variableAmount;

    this.dispatchEvent(new CustomEvent('set-currency-exchange', {
      bubbles: true,
      composed: true,
      detail: {
        amountEquivalenceInForeignCurrency: this.receiverAmount,
        countryFlag: this.currentCountryDestination.flag,
        currency: this.currentCountryOrigin.currency,
        currencySelected: {
          labelImg: {
            src: this.currentCountryOrigin.flag
          },
          id: this.currentCountryOrigin.currency
        },
        currencyCode: this.currentCountryOrigin.currency,
        currencySelectDisabled: !this.invertedFlags,
        foreignCurrency: this.currentCountryDestination.currency,
        setAmount: this.localAmount,
        exchangeRatesServiceIsUsed: this.invertedFlags,
        originCurrency: this.currentCountryOrigin.currency,
        customCurrencySelectTitle: this.invertedFlags ? `${this.t('glomo-international-transfers-foreign-currency-total-header')}` : `${this.t('glomo-international-transfers-foreign-currency-select-title')}`,
        totalHeader: this.invertedFlags ? `${this.t('glomo-international-transfers-foreign-currency-select-title')}` :  `${this.t('glomo-international-transfers-foreign-currency-total-header')}`,
        maxProduct: this.invertedFlags ? '' : selectAmount,
        showSelectorInForeignCurrencyFlag: !this.invertedFlags,
        totalAmount: this.receiverAmount,
        totalCurrency: this.currentCountryDestination.currency,
        minValue: this.invertedFlags ? undefined : null
      }
    }));
    this.dispatchEvent(new CustomEvent('set-currency-exchange', {continueEnabled: true}));
    if (this.localAmount !== '' && parseFloat(this.receiverAmount) > 0) {
      this.requestCurrencyExchange({ amount: parseFloat(this.localAmount)}, true);
    }
  }

  _validAmount(amount) {
    return this.localAmount = (amount === null || amount === '') ? 0 : amount;
  }
  /**
   * @desc method that changes the starting data (step2 component)
   * when the destination bank is different
   * @param {Object} bank - object containing information on the destination bank
   */
  generateForeignExchangeInfoDiferentBank(bank) {
    switch (bank.name) {
      case 'PERU':
        this.currentCountryDestination.currency = 'PEN';
    }
    this.currencyExchange = {
      customSecondCurrency: this.currentCountryDestination.currency,
      totalCurrency: this.currentCountryDestination.currency,
      foreignCurrency: this.currentCountryDestination.currency,
      firstCurrencyInEquivalence: this.currentCountryOrigin.currency,
      countryFlag: 'images/transfers/Peru.svg',
      currencySelected: {
        labelImg: {
          src: this.currentCountryOrigin.flag
        },
        id: this.currentCountryOrigin.currency
      },
    };
    this._dispatchEvents('set-currency-exchange', this.currencyExchange);
  }

  /**
   * @desc Add information of the principal account.
   * This function is executed in internationalTransfersCreateRecipient
   * therefore you do not have the context of the account because this DM is rebuilt
   * @param {Object} accountData - the data of the user product selected
   */
  addNewContactPageReset(accountData) {
    if (this.principalAccount === '') {
      this.principalAccount = accountData;
    }
    this.productId = accountData.accountId;
    this._dispatchEvents('reset-bank-code-input', '');
    this._dispatchEvents('reset-account-number-input', '');
    this._dispatchEvents('reset-bank-code-input-validate');
    this._dispatchEvents('reset-number-code-input-validate');
  }

  /**
   * Fires the blur after clicking enter on the keyboard
   * @param {e} event
   */
  onKeyboardPress(e) {
    if (e.keyCode === 13) {
      e.currentTarget.blur();
    } else if (this.countChangeInput === 0) {
      if (e.id === 'bankCode') {
        this._dispatchEvents('bank-code-input-blur');
      } else {
        this._dispatchEvents('account-input-blur');
      }
    }
    this.countChangeInput = 0;
  }

  /**
   * @desc Help modal to know the number of characters in banks and accounts
   */
  createModalBankInfo() {
    const bankModal = {
      code: 'DIY-MODAL-INFO',
      primaryButtonClass: 'button-secondary--white-core-blue',
      selectedConfig: {
        className: this.bankModalClassName,
        openMaximized: true,
        title: 'Ayuda',
        acceptBtLabel: 'info-UNDERSTAND-accept',
        template: {
          type: 'paragraphs',
          values: [
            {
              icon: 'coronita:help',
              iconClass: 'icon-size-24',
              class: 'info-dark text-center margin-top-none'
            },
            {
              title: `${this.t('cells-international-transfers-user-register-text')}`,
              class: 'spacing text-center'
            },
            {
              text: `${this.t('cells-international-transfers-create-modal-bank-info')}`,
              class: 'spacing'
            },
            {
              text: `${this.t('cells-international-transfers-create-modal-bank-info-aba')}`,
              class: 'spacing text-center'
            },
            {
              text: `${this.t('cells-international-transfers-create-modal-bank-info-aba-country')}`,
              class: 'spacing--xs'
            },
            {
              text: `${this.t('cells-international-transfers-create-modal-bank-info-aba-code')}`,
              class: 'spacing'
            },
            {
              text: '',
              class: 'spacing',
              divider: true
            },
            {
              text: `${this.t('cells-international-transfers-create-modal-bank-info-bic')}`,
              class: 'spacing text-center'
            },
            {
              text: `${this.t('cells-international-transfers-create-modal-bank-info-bic-country')}`,
              class: 'spacing--xs'
            },
            {
              text: `${this.t('cells-international-transfers-create-modal-bank-info-bic-code')}`,
              class: 'spacing--xs'
            },
            {
              text: `${this.t('cells-international-transfers-create-modal-bank-info-bic-example')}`,
              class: 'spacing'
            },
            {
              title: `${this.t('cells-international-transfers-account-number-account')}`,
              class: 'spacing text-center'
            },
            {
              text: `${this.t('cells-international-transfers-create-modal-bank-info-bic-recipient')}`,
              class: 'spacing--xs'
            },
            {
              text: `${this.t('cells-international-transfers-create-modal-bank-info-bic-valid')}`,
              class: 'spacing'
            },
            {
              text: `${this.t('cells-international-transfers-create-modal-bank-info-transit')}`,
              class: 'spacing text-center'
            },
            {
              text: `${this.t('cells-international-transfers-create-modal-bank-info-transit-country')}`,
              class: 'spacing--xs'
            },
            {
              text: `${this.t('cells-international-transfers-create-modal-bank-info-transit-code')}`,
              class: 'spacing'
            },
            {
              text: '',
              class: 'spacing',
              divider: true
            },
            {
              text: `${this.t('cells-international-transfers-create-modal-bank-info-iban')}`,
              class: 'spacing text-center'
            },
            {
              text: `${this.t('cells-international-transfers-create-modal-bank-info-iban-country')}`,
              class: 'spacing--xs'
            },
            {
              text: `${this.t('cells-international-transfers-create-modal-bank-info-iban-code')}`,
              class: 'spacing'
            },
            {
              text: '',
              class: 'spacing',
              divider: true
            },
            {
              text: `${this.t('cells-international-transfers-create-modal-bank-info-iban-recipient')}`,
              class: 'spacing text-center'
            },
            {
              text: `${this.t('cells-international-transfers-create-modal-bank-info-iban-valid')}`,
              class: 'spacing--xs'
            }
          ]
        }
      }
    };
    this._dispatchEvents('dispatch-modal-settings', bankModal);
  }

  /**
   * @desc Receives the content of the input to validate its value.
   * @param {*} detail
   */
  newAddresseeBankCode(detail) {
    const bankCode = {
      value: detail || '',
      id: 'bankCode'
    };
    this.countChangeInput++;
    this.newAddressee(bankCode);
  }

  /**
   * @desc Receives the content of the input to validate its value.
   * @param {*} detail
   */
  newAddresseeAccountNumber(detail) {
    const AccountNumber = {
      value: detail || '',
      id: 'accountNumber'
    };
    this.countChangeInput++;
    this.newAddressee(AccountNumber);
  }

  /**
   * @desc Receives the values of each object to trigger the event that enables or disables the button.
   * @param {*} inputInfo
   */
  newAddressee(inputInfo) {
    let addresseeInfo;
    switch (inputInfo.id) {
      case 'bankCode':
        addresseeInfo = {
          bankCode: inputInfo.value
        };
        break;
      case 'accountNumber':
        addresseeInfo = {
          accountNumber: inputInfo.value
        };
        break;
    }
    Object.assign(this.addresseeInfo, addresseeInfo);
    if ((this.addresseeInfo.bankCode !== undefined && this.addresseeInfo.bankCode.length >= 8 && this.addresseeInfo.bankCode.length < 12) && (this.addresseeInfo.accountNumber !== undefined && this.addresseeInfo.accountNumber.length >= 5 && this.addresseeInfo.accountNumber.length < 36)) {
      this._dispatchEvents('enable-button-add-new-recipient', {
        buttons: {
          primary: {
            class: 'primary',
            text: 'Buscar',
            disabled: false
          }
        }
      });
    } else {
      this._dispatchEvents('enable-button-add-new-recipient', {
        buttons: {
          primary: {
            class: 'primary',
            text: 'Buscar',
            disabled: true
          }
        }
      });
    }
  }

  /**
   * @desc Disable the button when opening the page
   */
  disabledButton() {
    let addresseeInfo = {
      bankCode: '',
      accountNumber: ''
    };
    Object.assign(this.addresseeInfo, addresseeInfo);
    this._dispatchEvents('enable-button-add-new-recipient', {
      buttons: {
        primary: {
          class: 'primary',
          text: 'Buscar',
          disabled: true
        }
      }
    });
  }

  /**
   * @desc Get BGADP Data BanksGet
   */
  getAddresseeRequest() {
    this._dispatchEvents('request-banks', this.addresseeInfo.bankCode);
    this._dispatchEvents('show-spinner');
  }

  /**
   * @desc Get BGADP Data BanksGet Success
   * @param {*} response
   */
  requestBanksSuccess(response) {
    this.countryValue = this.get('location.country.name', response);
    let data = {
      bankResponse: response,
      addresseeInfo: this.addresseeInfo,
      principalAccount: this.principalAccount
    };
    this.getMoneyLaunderingQuestionnaireLatestAnswers();
    this._dispatchEvents('send-country-value', this.countryValue);
    this._dispatchEvents('send-response-success-high-user', data);
  }

  /**
   * @desc Get BGADP Data BanksGet Error / BGADP Transfer DestinationError
   * @param {Object} data - determines the type of error to display, contain the error code
   */
  requestBanksError(data) {
    let isBankCodeError = !/GPE2764/gi.test(this.get('messages.0.message', data)) && !/GPE2763/gi.test(this.get('messages.0.message', data));
    this._spinnerControl(false);
    const errorRequstDataBankApi = {
      code: isBankCodeError ? 'REQUEST-ERROR-INTERNATIONAL-TRANSFER' : 'REQUEST-ERROR-INTERNATIONAL-TRANSFER-ACCOUNT',
      selectedConfig: {
        className: 'custom error image-spacing image--sd',
        heroImage: './images/errors/error.svg',
        title: isBankCodeError ? 'glomo-international-transfers-foreign-header-title-recipient' : 'glomo-international-transfers-generic-error-title',
        openMaximized: true,
        onAcceptEvent: '',
        onCancelEvent: '',
        iconOnlyFullHeight: undefined,
        acceptBtLabel: 'glomo-button-section-modal-international-transfer-cancel',
        cancelBtLabel: 'alert-exit-glomo-edit-credit-card-limits-manager-accept',
        template: {
          type: 'paragraphs',
          values: [
            {
              title: isBankCodeError ? 'glomo-international-transfers-code-bank-error' : 'glomo-international-transfers-invalid-recipient-account-error'
            },
            {
              text: isBankCodeError ? 'glomo-international-transfers-create-recipient-error' : 'glomo-international-transfers-create-recipient-error'
            }
          ]
        }
      }
    };
    this._dispatchEvents('reset-account-number-input', '');
    this._dispatchEvents('error-request-banks-international', errorRequstDataBankApi);
    let codeError = isBankCodeError ? 'error-code-bank' : '';
    this._dispatchEvents(codeError);
  }

  /**
   * @desc DestinationError in code back MXN
   * @param {Object} data - determines the type of error to display, contain the error code
   */
  _requestBanksErrorMXN() {
    const errorRequstDataBankMX = {
      code: 'REQUEST-ERROR-INTERNATIONAL-TRANSFER-MXN',
      selectedConfig: {
        className: 'custom error image-spacing image--sd',
        heroImage: './images/errors/error.svg',
        title: 'glomo-international-transfers-foreign-header-title-recipient',
        openMaximized: true,
        onAcceptEvent: '',
        onCancelEvent: '',
        iconOnlyFullHeight: undefined,
        cancelBtLabel: 'cells-international-transfers-screen-button',
        template: {
          type: 'paragraphs',
          values: [
            { title: 'glomo-international-transfers-code-bank-error' },
            { text: 'glomo-international-transfers-create-recipient-error' }
          ]
        }
      }
    };
    this._dispatchEvents('error-request-banks-international-back-mxn', errorRequstDataBankMX);
  }

  /**
     * @desc Method that set userEmailData
     */
  setCustomerData(payload) {
    this.userEmail = payload[1].contact;
    this.principalAccount.userEmail = payload[1].contact;
  }

  /**
   * @desc Method that generates the body to the registration api to send email
   */
  requestRecoverRegistry() {
    const customerId = this.globalCacheStorage ? this.globalCacheStorage.customer.customerId : this.globalUser.customerId;
    let name;
    let fecha = this.formatDate.replace(/ /g, '-');
    let hora = this._getHour();
    if (this.globalCacheStorage) {
      name = this.globalCacheStorage.customer.firstName.concat(' ', this.globalCacheStorage.customer.lastName, ' ', this.globalCacheStorage.customer.secondLastName);
    } else {
      name = this.globalUser.firstName.concat(' ', this.globalUser.lastName, ' ', this.globalUser.secondLastName);
    }
    name = this.reduceLimitSpace(name, 60);
    const beneficiario = this.reduceLimitSpace(this.personalInformation.addresseeName, 65);
    const banco = this.reduceLimitSpace(this.bankDestinationInfo.name, 60);
    fecha = this.reduceLimitSpace(fecha, 10);
    hora = this.reduceLimitSpace(hora, 15);
    let recoverRegistry = {
      eventCode: '0000002250',
      customExternalReference: customerId,
      destinationType: {
        id: 'REGISTERED',
        name: 'REGISTERED'
      },
      destinationMail: this.userEmail.trim() === '' ? this.principalAccount.userEmail : this.userEmail,
      templateCode: 'KZ002250',
      messageBody: `${name}${beneficiario}${banco}${fecha}${hora}#$FOLIOR$##$CUSTOMER$#`
    };
    this._dispatchEvents('send-response-recover-registry', recoverRegistry);
  }

  /**
   * method that calculates the Hour
   */
  _getHour() {
    const date = new Date();
    return `${date.getHours()}:${date.getMinutes()}:${date.getSeconds()}`;
  }

  /**
   * method that calculates the length of each field to send
   * @param {String} str value of a string
   * @param {Number} limit limit of caracters to show
   */
  reduceLimitSpace(str, limit) {
    if (str.length > limit) {
      return str.slice(0, limit);
    }
    return str + ' '.repeat(limit - str.length);
  }

  /**
   * @desc This function recive information from highUserSuccess function. This is for
   * the next page needs informations for 2 components in the same time
   * @param {Object} data
   */
  showUserRegister(data) {
    this.bankDestinationInfo = data.bankResponse;
    this.principalAccount = data.principalAccount;
    this.addresseeInfo = data.addresseeInfo;
    this.productId = data.principalAccount.accountId;
    const country = this.bankDestinationInfo.location.country.name;
    if (country === 'RUSIA' || country === 'BIELORRUSIA') {
      this._modalConflictRussia();
    }
    const sendResponse = [
      {
        value: `${this.t('cells-international-transfers-user-register')}`,
        class: 'value-bold'
      },
      {
        key: `${this.t('glomo-international-transfers-label-identificator-bank')}`,
        value: this.bankDestinationInfo.id,
        class: 'block margin'
      },
      {
        key: `${this.t('cells-international-transfers-user-register-identifier')}`,
        value: this.bankDestinationInfo.BICCode ? 'SWIFT' : 'ABA',
        class: 'block margin'
      },
      {
        key: `${this.t('cells-international-transfers-user-register-bank')}`,
        value: this.bankDestinationInfo.name,
        class: 'block margin'
      },
      {
        key: `${this.t('cells-international-transfers-user-register-address')}`,
        value: this.bankDestinationInfo.location.city.name,
        class: 'block margin'
      },
      {
        key: `${this.t('cells-international-transfers-user-register-city')}`,
        value: this.bankDestinationInfo.location.fullAddress,
        class: 'block margin'
      },
      {
        key: `${this.t('cells-international-transfers-user-register-country')}`,
        value: this.bankDestinationInfo.location.country.name,
        class: 'block margin'
      }
    ];
    this._dispatchEvents('set-bank-information-success', sendResponse);
    let formatAccountNumber = [
      {
        value: `${this.t('cells-international-transfers-user-register')}`,
        class: 'value-bold'
      },
      {
        key: `${this.t('cells-international-transfers-account-number-account')}`,
        value: this.addresseeInfo.accountNumber,
        class: 'block margin'
      }
    ];
    this._dispatchEvents('send-correct-account-number', formatAccountNumber);
    this._dispatchEvents('reset-addressee-name-input', '');
    this._dispatchEvents('reset-addressee-address-input', '');
    this._dispatchEvents('reset-addressee-city-input', '');
    this._dispatchEvents('reset-addressee-country-input', '');
    this._dispatchEvents('dispatch-relationship-to-recipient-answer-name', false);
  }

  /**
   * @desc modal that shows alert in case of entering a swift bank of russia
   */
  _modalConflictRussia() {
    const alertCautionMock = {
      code: 'INTERNATIONAL-TRANSFER-CAUTION-BANK',
      selectedConfig: {
        className: 'custom error image--sd',
        heroImage: './images/transfers/Caution.svg',
        title: 'alert-title-internationalTransfers-message-bank-caution',
        openMaximized: true,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'cells-international-transfers-primary-button-close-modal-screen',
        cancelBtLabel: 'glomo-button-section-modal-international-transfer-cancel',
        onCancelEvent: () => this._dispatchEvents('redirect-to-page-international-transfers'),
        template: {
          type: 'paragraphs',
          values: [
            { text: `${this.t('alert-EXIT-internationalTransfers-message-bank-caution')}` }
          ]
        }
      }
    };
    this._dispatchEvents('open-modal-bank-caution', alertCautionMock);
  }

  /**
   * @desc Finish the process of entering the destination account information and redirect
   * to the internationalTransfers page
   */
  finishContactRegister() {
    let interbankAccountWithLegal = {
      contactCollapsed: {
        avatar: true,
        name: this.personalInformation.addresseeName,
        number: this.addresseeInfo.accountNumber,
        listItems: [
          {
            description: this.addresseeInfo.bankCode
          },
          {
            description: this.addresseeInfo.accountNumber
          },
          {
            description: this.bankDestinationInfo.name
          },
        ],
        registeredOperationHidden: false
      },
      bankDestinationInfo: this.bankDestinationInfo
    };
    this._dispatchEvents('contact-destination-collapsed', interbankAccountWithLegal);
  }

  /**
   * @desc show the information of the (create /review recipient ) and go to step 2
   * @param {Object} data object with the bank destination info
   */
  receiptDataNewUser(data) {
    this.bankDestinationInfo = data.bankDestinationInfo;
    setTimeout(() => {
      if (this.bankDestinationInfo.location.country.id === 'P' && this.bankDestinationInfo.location.country.name.toUpperCase() === 'PERU') {
        this.generateForeignExchangeInfoDiferentBank(this.bankDestinationInfo.location.country);
      }
      this._dispatchEvents('set-new-contact-collapsed-data', data.contactCollapsed);
      this._dispatchEvents('set-currency-exchange', {
        infoText: `${this.t('glomo-international-transfers-foreign-currency-text')}`
      });
    }, 300);
  }

  /**
   * @desc Method to obtain the country abbreviation
   * @param {String} country - data of the country
   */
  getCountryAbbreviation(country) {
    switch (country) {
      case 'MXN':
        return 'MX';
      case 'USD':
        return 'US';
      case 'JPY':
        return 'JP';
      case 'CAD':
        return 'CA';
      case 'CHF':
        return 'CH';
      case 'CNH':
        return 'CN';
      case 'EUR':
        return 'Euro';
      case 'GBP':
        return 'UK';
      case 'PEN':
        return 'PE';
      case 'SEK':
        return 'SE';
    }
  }

  /**
   * Response to storage data load
   * get-local-storage-success or get-local-storage-error
   * @param {Object} storageResponse
   */
  getInternationalTransfersLocalStorage(storageResponse) {
    if (storageResponse.code === this.localStorageErrorCode || !storageResponse.newInFlow) {
      this._localStorageData =  { newInFlow: true };
      this._setLocalStorageData();
      this._onboardingTransfer();
    } else {
      this._localStorageData = storageResponse;
    }
  }


  /**
   * @desc Function to assemble the request for the quote
   * @param {*} amountData - variable with the amount to be transacted
   */
  requestCurrencyExchange(amountData, selectChange) {
    this.amountOriginToChange = amountData.amount || amountData;
    this.amountIsEmpty = false;
    setTimeout(()=>{
      if (!this.amountIsEmpty || selectChange) {
        if (this.amountOriginToChange < this.principalAccount.availableBalance.currentBalances[0].amount || this.invertedFlags) {
          this._spinnerControl(true);
          const bodyCurrency = {
            sender: {
              id: this.clientId,
              contract: {
                id: this.clientId,
                number: this.principalAccount.number,
                numberType: {
                  id: 'CCC'
                }
              }
            },
            receiver: {
              contract: {
                bank: {
                  code: this.bankDestinationInfo.id
                },
                id: this.clientId,
                number: this.addresseeInfo.accountNumber,
                numberType: {
                  id: this.bankDestinationInfo.BICCode ? 'SWIFT' : 'IBAN'
                }
              }
            },
            channel: {
              id: 'MG'
            },
            branch: {
              id: '0835'
            },
            operation: {
              isInternationalOperation: 'N',
              tenor: 'T',
              function: '122',
              exchangeRate: {
                baseCurrency: this.principalAccount?.availableBalance?.currentBalances[0]?.currency || this.principalAccount?.currencies[0]?.currency,
                targetCurrency: this.invertedFlags ? this.currentCountryOrigin.currency : this.currentCountryDestination.currency,
                operationType: {
                  id: 'PURCHASE'
                },
                settlementType: {
                  id: 'SETTLEMENT_ACCOUNT'
                },
              }
            },
            sentMoney: {
              credit: {
                amount: this.amountOriginToChange,
                currency: this.currentCountryOrigin.currency
              }
            }
          };
          this._dispatchEvents('request-currency-quote', bodyCurrency);
        }
      }
    }, 100);
  }

  /**
   * @desc Function to manage a flag to call the service
   */
  inputCloseIsPressed() {
    this.amountIsEmpty = true;
  }

  /**
   * @desc function that is listening the values of variables inside the recipient review page,
   * to trigger the event that enables or disables the button.
   */
  addresseeInformation() {
    this.countChangeInput++;
    let personalInformation = {
      ...this.personalInformation,
      addresseeName: this.personalInformationAddresseeName,
      addresseeAdress: this.personalInformationAddresseeAdress,
      addresseeCity: this.personalInformationAddresseeCity,
      addresseeCountry: this.personalInformationAddresseeCountry,
      relationshipToRecipient: this._relationshipToRecipientAnswer
    };
    this._removedSpace(personalInformation);
    Object.assign(this.personalInformation, personalInformation);
    if (this._validateAddressInput()) {
      this._dispatchEvents('valid-personal-info-button-continue', {
        buttons: {
          primary: {
            class: 'primary',
            text: `${this.t('international-transfers-summary-button-label')}`,
            disabled: false
          }
        }
      });
    } else {
      this._dispatchEvents('valid-personal-info-button-continue', {
        buttons: {
          primary: {
            class: 'primary',
            text: `${this.t('international-transfers-summary-button-label')}`,
            disabled: true
          }
        }
      });
    }
  }

  /**
   * @desc validates the data of the target user and returns a flag that enables the continue button
   */
  _validateAddressInput() {
    return (this._validInput(this.personalInformation.addresseeName)  && this.personalInformation.addresseeName.length <= 65)
    && (this._validInput(this.personalInformation.addresseeAdress))
    && (this._validInput(this.personalInformation.addresseeCity))
    && (this._validInput(this.personalInformation.addresseeCountry))
    && (this._validInput(this._relationshipToRecipientAnswerName));
  }

  /**
   * @desc vvalidate common values for input data
   */
  _validInput(payload) {
    return payload !== undefined && payload.trim() !== '' && payload.length >= 3;
  }

  /**
   * @desc remove space in input for data, reset input
   */
  _removedSpace(data) {
    if (data.addresseeName.charAt(0) === ' ') {
      this._dispatchEvents('reset-data-addresseeName-input');
    } else if (data.addresseeAdress.charAt(0) === ' ') {
      this._dispatchEvents('reset-data-addresseeAdress-input');
    } else if (data.addresseeCity.charAt(0) === ' ') {
      this._dispatchEvents('reset-data-addresseeCity-input');
    } else if (data.addresseeCountry.charAt(0) === ' ') {
      this._dispatchEvents('reset-data-addresseeCountry-input');
    }
  }

  /**
   * @desc control spinner and defined the text
   * @param {Boolean} control
   */
  _spinnerControl(control) {
    this.spinnerEventshowText = control ? 'show-spinner-text-evet' : 'hide-spinner-text-evet';
    this._dispatchEvents(this.spinnerEventshowText);
  }

  /**
   * @desc Returns the quote, paints the data and enables the button to continue to step 3
   * @param {Object} response - the data of the service APIS EXCHANGE RATES
   */
  quotationRequestSuccess(response) {
    this.responseQuotation = response;
    const selectAmount = this.principalAccount.availableBalance.currentBalances[0].amount;
    this.localAmount = this.invertedFlags ? response.sentMoney.debit.amount : response.sentMoney.credit.amount;
    this.receiverAmount = !this.invertedFlags ? response.sentMoney.debit.amount : response.sentMoney.credit.amount;
    this.quoteCurrency = response.preferenceRate.amount.currency === this.currentCountryOrigin.currency ? this.currentCountryDestination.currency : this.currentCountryOrigin.currency;
    this.baseCurrency = response.preferenceRate.amount.currency;
    this.errorQuotation = selectAmount - this.receiverAmount < 0;
    this.quotationId =  response?.operation?.id;
    this.factor = response?.preferenceRate?.factor;
    this.creationDate = response?.creationDate;

    let responseQuotationInfo = {
      amount: this.localAmount,
      originCurrency: '$',
      amountInOriginCurrency: this.invertedFlags ? this.receiverAmount : this.localAmount,
      totalAmount: this.receiverAmount,
      totalCurrency: this.invertedFlags ? response.sentMoney.credit.currency : response.sentMoney.debit.currency,
      exchangeRateSelected: {
        rate: response.preferenceRate.amount.amount,
        currency: response.preferenceRate.amount.currency
      },
      localCurrency: this.currentCountryOrigin.currency,
      localCurrencyIsDifferentThanEquivalenceCurrencies: true,
      customFirstCurrency: this.baseCurrency,
      customSecondCurrency: this.quoteCurrency,
      currencySelected: {
        labelImg: {
          src: this.currentCountryOrigin.flag
        },
        id: this.currentCountryOrigin.currency
      },
      exchangeRatesUpdated: true,
      hideAmountInMinOrMaxErrorMessage: true,
      minValueErrorMessage: `${this.t('glomo-international-transfers-error-amount')}`,
      continueEnabled: true,
      baseCurrency: this.baseCurrency,
      quoteCurrency: this.quoteCurrency,
      commissionCurrencyList: [
        {
          key: 'glomo-international-transfers-foreign-currency-step-commission-charge',
          amount: response.fees.totalFees.amount,
          currencyCode: response.fees.totalFees.currency === 'MXN' ? '$' : response.fees.totalFees.currency,
          className: 'wrapper-header'
        },
        {
          key: 'glomo-international-transfers-foreign-currency-step-commission-iva',
          amount: response.taxes.itemizeTaxes[0].itemizeTaxUnit.amount,
          currencyCode: response.taxes.itemizeTaxes[0].itemizeTaxUnit.currency === 'MXN' ? '$' : response.taxes.itemizeTaxes[0].itemizeTaxUnit.currency,
          className: 'wrapper-header'
        }
      ],
      infoMessageData: {
        title: undefined
      },
      additionalInfoClass: 'wrapper-header',
      conversionText: response.sentMoney.credit.currency,
      changeText: response.preferenceRate.amount.currency,
      additionalInfo: 'glomo-international-transfers-foreign-currency-info-commision-origin-account',
      setForeignAmount: this.receiverAmount,
      foreignCurrencySelected: { id: this.baseCurrency }
    };
    if (this.errorQuotation) {
      responseQuotationInfo.maxProduct = this._quotationResponseMaxProduct(response.preferenceRate.amount.amount);
      delete responseQuotationInfo.minValue;
    } else {
      responseQuotationInfo.maxProduct = this._quotationResponseMaxProduct(response.preferenceRate.amount.amount);
      responseQuotationInfo.minValue = null;
    }
    this._dispatchEvents('enable-button-currency', true);
    this._dispatchEvents('send-quotation-information', responseQuotationInfo);
    if (response.sentMoney.credit.amount <= selectAmount) {
      this.enableTimer(response);
      this.setAmountCollapsed(response);
      this.conceptReference(response);
    }
    this._isQuotationDone = true;
  }

  /**
   * @desc Validation quotation maxProduct value
   */
  _quotationResponseMaxProduct(calculatedBalance) {
    if (this.errorQuotation) {
      return !this.invertedFlags ? this.principalAccount.availableBalance.currentBalances[0].amount : (this.principalAccount.availableBalance.currentBalances[0].amount / calculatedBalance);
    }
    return this.invertedFlags ? (this.principalAccount.availableBalance.currentBalances[0].amount / calculatedBalance) : this.principalAccount.availableBalance.currentBalances[0].amount;
  }

  /**
   * @desc Shows modal half when the quote service fails and gives the option to exit the flow
   */
  quotationRequestError() {
    const errorModal = {
      code: 'QUOTATION-ERROR',
      selectedConfig: {
        className: 'error',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'cells-international-transfers-screen-button',
        template: {
          type: 'paragraphs',
          values: [
            {
              icon: 'coronita:alert'
            },
            {
              title: 'glomo-international-transfers-currency-error-title',
              class: 'simple-title'
            },
            {
              text: 'glomo-international-transfers-currency-error-text'
            }
          ]
        }
      }
    };
    this._dispatchEvents('show_modal_error', errorModal);
    this._dispatchEvents('error-exchange-rate-not-available');
  }

  /**
   * @desc Shows modal half when the NPMBGADPTransfersV0 service fails and gives the option to exit the flow
   */
  limitOperationError() {
    const errorModal = {
      code: 'QUOTATION-ERROR',
      selectedConfig: {
        className: 'error',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'cells-international-transfers-screen-button',
        template: {
          type: 'paragraphs',
          values: [
            {
              icon: 'coronita:alert'
            },
            {
              title: 'glomo-international-transfers-limit-operation-error-title',
              class: 'simple-title'
            },
            {
              text: 'glomo-international-transfers-limit-operation-error-text'
            }
          ]
        }
      }
    };
    this._dispatchEvents('show_modal_error', errorModal);
    this._dispatchEvents('error-out-time');
  }

  /**
   * Funcion para llenar la información del collapsed 2
   * Meter logica en caso de que se le de swap
   * @param {*} response
   */
  setAmountCollapsed(response) {
    let currencyMap = {
      EUR: '€',
      USD: 'US$',
      CAD: 'C$',
      CHF: 'Fr.',
      CNH: 'Yu¥',
      GBP: '£',
      JPY: '¥',
      MXN: 'Mx$',
      PEN: 'S/',
      SEK: 'kr'
    };

    if (response) {
      let changeInput = `1 ${this.baseCurrency} = ${response.preferenceRate.amount.amount} ${this.quoteCurrency}`;
      let amountCollapsed = {
        currencyDestiny: this.invertedFlags ? this.currentCountryOrigin.currency : this.currentCountryDestination.currency,
        currencyOrigin: this.invertedFlags ? this.currentCountryDestination.currency : this.currentCountryOrigin.currency,
        showMessageBelowAmountCollapsed: true,
        messageBelowAmountCollapsed: `${this.t(`${this.getCorrectFlagAfterResponse()}`)}<br>${currencyMap[this.currentCountryDestination.currency]}${this.receiverAmount}`,
        amountOrigin: this.invertedFlags ? this.receiverAmount : this.get('sentMoney.credit.amount', response) || '',
        amountDestiny: this.invertedFlags ? this.localAmount : this.receiverAmount,
        showCurrencyMessageBelowAmountCollapsed: true,
        showAmountFilledInfoMessage: true,
        conversionText: false,
        continueEnabled: true,
        localCurrency: this.principalAccount.currencies[0].currency,
        disableChange: false,
        amountFilledInfoMessage: `${this.t('glomo-international-transfers-message-transfer-currency')}<br>${changeInput}`
      };
      this._dispatchEvents('set-amount-collapsed', amountCollapsed);
    }
  }

  /**
   * @desc Function to put the reference step 3 (PENNDING)
  */
  conceptReference(response) {
    this.inputReference = response.references.map(reference => reference.value).toString();
    this._dispatchEvents('send-reference-transfer', this.inputReference);
  }

  /**
   * @desc Enable the timer of step 2
   */
  enableTimer(response) {
    if (!this.timerEnabled) {
      this.timerEnabled = true;
    } else {
      const resetTimer = {
        timeout: 0,
        reset: true,
      };
      this._dispatchEvents('reset-only-timer', resetTimer);
    }
    this._timerDefaulTime = response.preferenceRate.validity.value * 1000 || '';
    this._dispatchEvents('set-default-data-timer', this._timerDefaulTime);
    this._dispatchEvents('reset-view-header-timmer');
  }

  /**
   * @desc Function to reset personal information form
  */
  resetPersonalInformation() {
    this._relationshipToRecipientAnswer = {};
    this._relationshipToRecipientAnswerName = '';
    this.personalInformationAddresseeName = '';
    this.personalInformationAddresseeAdress = '';
    this.personalInformationAddresseeCity = '';
    this.personalInformationAddresseeCountry = '';
    this.personalInformation = {};
  }

  /**
   * @desc Reset steps and components when exits the flow
   * @param {Boolean} exit - to determine if we need to exit or not
   */
  reset() {
    const resetTimer = {
      timeout: 0,
      reset: true,
      visibilityTimer: false
    };
    const step = {
      currentStep: 2,
      productId: this.productId
    };
    this.invertedFlags = false;
    this.principalAccount = '';
    this.countError = 0;
    this.localAmount = '';
    this.receiverAmount = '0.0';
    this._isQuotationDone = false;
    this._isAbandonSummary = false;
    if (this.timerEnabled) {
      this._dispatchEvents('reset-info-transfer-and-timer', resetTimer);
      this.timerEnabled = false;
    }
    this._dispatchEvents('international-transfer-reset-step', step);
    this._dispatchEvents('reset-foreing-currency', {
      active: false,
      disableFlag: false,
      showInfoMessage: false,
      foreignCurrencyNumberInputValue: null,
      amountEquivalenceInForeignCurrency: '0.00',
      commissionCurrencyList: [],
      additionalInfo: undefined
    });
    this._dispatchEvents('international-transfer-reset-step-collapse-active', {
      active: false,
      collapsed: false
    });
    this._relationshipToRecipientAnswerName = '';
    this._dispatchEvents('reset-recipient-information');
  }

  /**
   * @description make payment when the user confirm mtu and reset timer
   */
  mtuMakePayment() {
    if (this.mtuFlag.makePayment) {
      this.contracTransferRequest();
      this.mtuFlag = {};
    } else {
      this.mtuFlag = {};
    }
  }

  /**
   * @desc method to cancel the mtu exception and reset timer
   * @param {Object} mtuFlag - contains flags to cancel the exception
   */
  cancelMtuException(mtuFlag) {
    this._resetTimer();
    this.mtuFlag = mtuFlag;
  }

  /**
   * @desc reset the timer
   * @event reset-info-transfer-and-timer
   */
  _resetTimer() {
    let resetTimer = {
      timeout: 0,
      reset: true,
      visibilityTimer: false
    };
    this._dispatchEvents('reset-info-transfer-and-timer', resetTimer);
    resetTimer = {
      timeout: this._timerDefaulTime,
      reset: true,
      visibilityTimer: true
    };
    this._dispatchEvents('reset-info-transfer-and-timer', resetTimer);
  }

  /**
   * @desc Reset steps and components when have an error
   */
  resetToQuotation(flag) {
    let isError = typeof flag === 'string' ? true : false;
    const step = {
      currentStep: isError ? 2 : 1
    };
    const resetTimer = {
      timeout: 0,
      reset: true,
      visibilityTimer: false
    };
    this.invertedFlags = false;
    this._dispatchEvents('reset-info-transfer-and-timer', resetTimer);
    this.timerEnabled = false;
    this._dispatchEvents('international-transfer-reset-step-collapse-active', {
      active: false,
      collapsed: false
    });
    this._dispatchEvents('international-transfer-reset-step-without', step);
    this._dispatchEvents('new-reset-foreing-currency-step', false);
    this._dispatchEvents('set-currency-exchange', { active: false });
    this.generateForeignExchangeInfo();
  }

  /**
   * @desc When they enter the wrong bank code and want to exit
   */
  exitBankCodeError() {
    this._dispatchEvents('exit-bank-error-step-one');
  }

  /**
   * @desc We collect and send the information in step 3
   * @param {Object} payload
   *  @property {String} reference
   *  @property {String} concept
   */
  conceptInfoFunction(payload) {
    let conceptReplace = {
      reference: payload.reference.replace('/', '-'),
      concept: payload.concept
    };

    this.inputReference = conceptReplace.reference;
    this.conceptInfo = conceptReplace;
    this.sendInfoSummary();
    this._dispatchEvents('analytics-step-confirmation');
    this._isAbandonSummary = true;
  }

  /**
   * @desc Send the quote information to the sticky
   */
  sendInfoSummary() {
    let amountStickyValue = {
      description: 'cells-international-transfers-stiky-title',
      amount: {
        amount: this.localAmount,
        currency: this.currentCountryOrigin.currency
      },
      fees: [
        {
          feeType: {
            id: 'MANAGEMENT_FEE',
            name: 'Management Fee'
          },
          feeAmount: {
            amount: this.responseQuotation.fees.totalFees.amount,
            currency: 'MXN'
          }
        }
      ],
      taxes: [
        {
          taxType: 'cells-international-transfers-iva',
          amount: {
            amount: this.responseQuotation.taxes.itemizeTaxes[0].itemizeTaxUnit.amount,
            currency: '$'
          }
        }
      ]
    };
    this._dispatchEvents('set-sticky-information', amountStickyValue);
  }

  /**
   * @desc generic error modal BGADP Transfers V0 service or direction error
   */
  errorRequest(errorMessage) {
    let isDirectionError = /GPE5953/gi.test(errorMessage) || /GPE5951/gi.test(errorMessage);
    if (/BGE1320/gi.test(errorMessage)) {
      return this.errorFinalAmount('CNE0234');
    }
    const errorBody = {
      code: isDirectionError ? 'REQUEST-ERROR-INTERNATIONAL-TRANSFER-DIRECTION' : 'REQUEST-ERROR-INTERNATIONAL-TRANSFER-LIQUIDATIONS',
      selectedConfig: {
        className: 'custom error image-spacing image--sd',
        heroImage: './images/errors/error.svg',
        title: isDirectionError ? 'glomo-international-transfers-foreign-currency-header-title' : 'glomo-international-transfers-generic-error-title',
        openMaximized: true,
        onAcceptEvent: '',
        onCancelEvent: '',
        iconOnlyFullHeight: undefined,
        acceptBtLabel: 'glomo-standard-error-handler-retry-error',
        cancelBtLabel: 'glomo-standard-error-handler-retry-later-exit',
        template: {
          type: 'paragraphs',
          values: [
            {
              title: isDirectionError ? 'glomo-international-transfers-direction-error-title' : 'glomo-international-transfers-generic-operation-error-title'
            },
            {
              text: isDirectionError ? 'glomo-international-transfers-direction-error-text' : 'glomo-international-transfers-generic-operation-error-text',
              class: 'spacing text-center'
            },
            {
              text: isDirectionError ? '' : 'glomo-international-transfers-generic-operation-error-sub-text'
            }
          ]
        }
      }
    };
    this._dispatchEvents('show_modal_error', errorBody);
    let directionError = isDirectionError ? '' : 'error-operation-unavailable-retry';
    this._dispatchEvents(directionError);
  }

  /**
   * @desc generic error modal without restart BGADP Transfers V0 service
   */
  errorRequestWithoutRestart() {
    const errorBody = {
      code: 'REQUEST-ERROR-INTERNATIONAL-TRANSFER-LIQUIDATIONS-WITHOUT',
      selectedConfig: {
        className: 'custom error image-spacing image--sd',
        heroImage: './images/errors/error.svg',
        title: 'glomo-international-transfers-generic-error-title',
        openMaximized: true,
        onAcceptEvent: '',
        onCancelEvent: '',
        iconOnlyFullHeight: undefined,
        acceptBtLabel: 'glomo-standard-error-handler-retry-later-exit',
        template: {
          type: 'paragraphs',
          values: [
            {
              title: 'glomo-international-transfers-generic-operation-error-title'
            },
            {
              text: 'glomo-international-transfers-generic-operation-error-exit-text',
              class: 'spacing text-center'
            }
          ]
        }
      }
    };
    this._dispatchEvents('show_modal_error', errorBody);
    this._dispatchEvents('error-operation-unavailable-exit');
  }

  /**
   * @desc Modal error insufficient balance BGADP Transfers V0 service
   */
  errorFinalAmount(errorCode) {
    let isAmount = /CNE0234/gi.test(errorCode);
    let title = isAmount ?  'glomo-international-transfers-amount-error-title' : 'glomo-international-transfers-currency-error-title';
    let acceptLabel = isAmount ? 'cells-step-enter-amount-credit-card-change-recipient-button-label'
      : 'glomo-international-transfers-currency-error-title-button-label';
    let text = isAmount ? `${this.t('glomo-international-transfers-amount-error-text-one')} $${this.principalAccount.availableBalance.currentBalances[0].amount}${this.t('glomo-international-transfers-amount-error-text-two')}`
      : 'glomo-international-transfers-currency-error-text-error';
    let subText = isAmount ? `${this.t('glomo-international-transfers-amount-error-subtext-one')}${this.responseQuotation.fees.totalFees.amount}${this.t('glomo-international-transfers-amount-error-subtext-two')}${this.responseQuotation.taxes.itemizeTaxes[0].itemizeTaxUnit.amount}`
      : 'glomo-international-transfers-currency-error-subtext';

    const errorBody = {
      code: 'REQUEST-ERROR-INTERNATIONAL-TRANSFER-AMOUNT',
      selectedConfig: {
        className: 'custom error image-spacing image--sd',
        heroImage: './images/errors/error.svg',
        title: 'glomo-international-transfers-generic-error-title',
        openMaximized: true,
        onAcceptEvent: '',
        onCancelEvent: '',
        iconOnlyFullHeight: undefined,
        acceptBtLabel: acceptLabel,
        cancelBtLabel: 'glomo-standard-error-handler-retry-later-exit',
        template: {
          type: 'paragraphs',
          values: [
            {
              title: title,
              class: 'spacing text-center'
            },
            {
              text: text,
              class: isAmount ? 'spacing text-center' : ''
            },
            {
              text: subText,
              class: 'spacing text-center'
            }
          ]
        }
      }
    };
    this._dispatchEvents('show_modal_error', errorBody);
    let eventError = isAmount ? 'error-insuficient-balance' : '';
    this._dispatchEvents(eventError);
  }

  /**
   * @desc Modal error receiver account invalid case 6
   */
  errorAccountReceiver() {
    const errorBody = {
      code: 'REQUEST-ERROR-INTERNATIONAL-TRANSFER-ACCOUNT',
      selectedConfig: {
        className: 'custom error image-spacing image--sd',
        heroImage: './images/errors/error.svg',
        title: 'glomo-international-transfers-foreign-currency-header-title',
        openMaximized: true,
        onAcceptEvent: '',
        onCancelEvent: '',
        iconOnlyFullHeight: undefined,
        acceptBtLabel: 'glomo-button-section-modal-international-transfer-cancel',
        cancelBtLabel: 'glomo-standard-error-handler-retry-later-exit',
        template: {
          type: 'paragraphs',
          values: [
            {
              title: 'glomo-international-transfers-invalid-recipient',
              class: 'spacing text-center'
            },
            {
              text: 'glomo-international-transfers-create-receiver-error',
              class: 'spacing text-center'
            },
          ]
        }
      }
    };

    this._dispatchEvents('reset-account-number-input', '');
    this._dispatchEvents('error-request-banks-international', errorBody);
    this._dispatchEvents('error-destiny-invalid');
  }

  /**
   * @desc Generate the time-expired modal
   */
  timeExpired() {
    const errorModal = {
      code: 'TIMEOUT-ERROR-INTERNATIONAL',
      selectedConfig: {
        className: 'error',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'info-UNDERSTAND-accept',
        template: {
          type: 'paragraphs',
          values: [
            {
              icon: 'coronita:alert'
            },
            {
              title: 'glomo-international-transfers-time-expired-title',
              class: 'simple-title'
            },
            {
              text: 'glomo-international-transfers-time-expired-text'
            }
          ]
        }
      }
    };
    this._dispatchEvents('show_modal_error', errorModal);

    const resetTimer = {
      timeout: 0,
      reset: true,
      visibilityTimer: false
    };
    this._dispatchEvents('reset-foreign-exchange-and-timer', resetTimer);
  }

  /**
   * @desc When step 2 collapses, this method returns informative
   * text depending on the selected currency
   */
  getCorrectFlagAfterResponse() {
    let currency = this.currentCountryDestination.currency;
    switch (currency) {
      case 'USD':
        return 'glomo-international-transfers-foreign-currency-usa';
      case 'JPY':
        return 'glomo-international-transfers-foreign-currency-jpy';
      case 'CAD':
        return 'glomo-international-transfers-foreign-currency-cad';
      case 'CHF':
        return 'glomo-international-transfers-foreign-currency-chd';
      case 'CNH':
        return 'glomo-international-transfers-foreign-currency-cnh';
      case 'EUR':
        return 'glomo-international-transfers-foreign-currency-eur';
      case 'GBP':
        return 'glomo-international-transfers-foreign-currency-bgp';
      case 'PEN':
        return 'glomo-international-transfers-foreign-currency-pen';
      case 'SEK':
        return 'glomo-international-transfers-foreign-currency-sek';
      default:
        return 'glomo-international-transfers-foreign-currency-mx';
    }
  }

  /**
   * Method that creates the flags modal,
   * when clicking on the selected flag
   * @param {Object} context
   */
  createFlagsModal(context) {
    const flagsData = [
      {
        id: 'CAD',
        labelImg: {
          src: 'images/transfers/Canada.svg',
          alt: 'Canadá:'
        },
        name: `${this.t('glomo-step-foreign-currency-operation-country-CAD')}`
      },
      {
        id: 'CHF',
        labelImg: {
          src: 'images/transfers/Switzerland.svg',
          alt: 'Suiza:'
        },
        name: `${this.t('glomo-step-foreign-currency-operation-country-CHF')}`
      },
      {
        id: 'CNH',
        labelImg: {
          src: 'images/transfers/China.svg',
          alt: 'China:'
        },
        name: `${this.t('glomo-step-foreign-currency-operation-country-CNH')}`
      },
      {
        id: 'EUR',
        labelImg: {
          src: 'images/transfers/Europa.svg',
          alt: 'Euro: '
        },
        name: `${this.t('glomo-step-foreign-currency-operation-country-EUR')}`
      },
      {
        id: 'GBP',
        labelImg: {
          src: 'images/transfers/Uk.svg',
          alt: 'Libra: '
        },
        name: `${this.t('glomo-step-foreign-currency-operation-country-GBP')}`
      },
      {
        id: 'USD',
        labelImg: {
          src: 'images/transfers/Usa.svg',
          alt: 'Estados unidos:'
        },
        name: `${this.t('glomo-step-foreign-currency-operation-country-USA')}`
      },
      {
        id: 'PEN',
        labelImg: {
          src: 'images/transfers/Peru.svg',
          alt: 'Perú:'
        },
        name: `${this.t('glomo-step-foreign-currency-operation-country-PEN')}`
      },
      {
        id: 'SEK',
        labelImg: {
          src: 'images/transfers/Sweden.svg',
          alt: 'Suecia:'
        },
        name: `${this.t('glomo-step-foreign-currency-operation-country-SEK')}`
      },
      {
        id: 'JPY',
        labelImg: {
          src: 'images/transfers/Japon.svg',
          alt: 'Japón: '
        },
        name: `${this.t('glomo-step-foreign-currency-operation-country-JPY')}`
      }
    ];

    this._dispatchEvents('all-flags-to-selected', flagsData);
    this._dispatchEvents('open-modal-selector-flag', context);

  }

  /**
   * @desc Method that is executed every time the amount input changes,
   * if it is empty it formats the entire component of step 2
   * @param {String} inputData - the value in the input of the step 2 component currency
   */
  inputCurrencyChanged(inputData) {
    if (this.principalAccount !== '' && !this.invertedFlags) {
      const selectAmount = this.principalAccount.availableBalance.currentBalances[0].amount;
      this.localAmount = inputData;
      if (inputData === undefined || inputData === null || inputData === '' || this.zeroErrorEnabled) {
        this.zeroErrorEnabled = false;
        this.responseQuotation = {};
        this.receiverAmount = '';
        this.dispatchEvent(new CustomEvent('set-currency-exchange', {
          bubbles: true,
          composed: true,
          detail: {
            totalAmount: '0',
            continueEnabled: false,
            currency: this.currentCountryOrigin.currency,
            foreignCurrencyNumberInputValue: ' ',
            exchangeRatesUpdated: false,
            maxProduct: parseInt(selectAmount),
            maxLimit: parseInt(selectAmount),
            minValue: null,
            exchangeRateSelected: {
              rate: 0,
              currency: this.currentCountryDestination.currency
            }
          }
        }));
      } else if (parseFloat(inputData) === 0) {
        this.zeroErrorEnabled = true;
        this.receiverAmount = '';
        this.dispatchEvent(new CustomEvent('set-currency-exchange', {
          bubbles: true,
          composed: true,
          detail: {
            continueEnabled: false,
            amountIsZero: true,
            totalAmount: '0',
            showErrorInputMessage: true,
            maxProduct: '',
            minValueErrorMessage: `${this.t('glomo-international-transfers-zero-error')}`,
            hideAmountInMinOrMaxErrorMessage: true,
            minValue: selectAmount
          }
        }));
      } else if (inputData >= parseFloat(selectAmount)) {
        this.zeroErrorEnabled = true;
        this.receiverAmount = '';
        this.dispatchEvent(new CustomEvent('set-currency-exchange', {
          bubbles: true,
          composed: true,
          detail: {
            totalAmount: '0',
            continueEnabled: false,
            currency: this.currentCountryOrigin.currency,
            foreignCurrencyNumberInputValue: ' ',
            exchangeRatesUpdated: false,
            maxProduct: parseInt(selectAmount),
            maxLimit: parseInt(selectAmount),
            minValue: null,
            exchangeRateSelected: {
              rate: 0,
              currency: this.currentCountryDestination.currency
            }
          }
        }));
      }
    }
    if (this.invertedFlags) {
      this.errorQuotation = false;
      this.dispatchEvent(new CustomEvent('set-currency-exchange', {
        bubbles: true,
        composed: true,
        detail: {
          amountInOriginCurrency: undefined,
          minValue: null,
          maxProduct: '',
          minValueErrorMessage: undefined
        }
      }));
    }
  }


  /**
    * @desc evaluate if the origin and destination account is in dollars
    * @param {String} currencyDestination - currency to evaluate
  */
  sameInternationalCurrency(currencyDestination) {
    if (this.principalAccount.availableBalance.currentBalances[0].currency === 'USD' && currencyDestination === 'USD') {
      return ' ';
    }
    return '';
  }

  /**
   * @desc Conclude the flag change by executing the channel
   * to modify the select flag in step2
   * @param {*} data
   */
  changeFlagCurrency(data) {
    let flagChanged;
    if (data.labelImg) {
      this._dispatchEvents('send-flag-changed', { localCurrencyIsDifferentThanEquivalenceCurrencies: false});
      if (this.invertedFlags) {
        this.currentCountryOrigin.flag = data.labelImg.src;
        this.currentCountryOrigin.currency = data.id;
        flagChanged = {
          currencySelected: {
            labelImg: {
              src: this.currentCountryOrigin.flag
            },
            id: this.currentCountryOrigin.currency
          },
          originCurrency: this.currentCountryOrigin.currency,
          currency: this.currentCountryOrigin.currency,
          foreignCurrency: this.currentCountryDestination.currency,
          customSecondCurrency: this.currentCountryOrigin.currency,
          localCurrencyIsDifferentThanEquivalenceCurrencies: true,
          currencyCode: this.currentCountryOrigin.currency,
          quoteCurrency: this.currentCountryDestination.currency,
          firstCurrencyInEquivalence: this.currentCountryOrigin.currency
        };
      } else {
        this.currentCountryDestination.flag = data.labelImg.src;
        this.currentCountryDestination.currency = data.id;
        flagChanged = {
          originCurrency: '$',
          countryFlag: this.currentCountryDestination.flag,
          currency: this.currentCountryOrigin.currency,
          foreignCurrency: this.currentCountryDestination.currency,
          currencyCode: this.currentCountryOrigin.currency,
          customSecondCurrency: this.currentCountryDestination.currency,
          localCurrencyIsDifferentThanEquivalenceCurrencies: true,
          amountEquivalenceInForeignCurrency: this.receiverAmount,
          quoteCurrency: this.currentCountryOrigin.currency,
          firstCurrencyInEquivalence: this.currentCountryDestination.currency,
          totalCurrency: this.currentCountryDestination.currency
        };
      }
      this._dispatchEvents('send-flag-changed', flagChanged);
      if (this.timerEnabled) {
        this.requestCurrencyExchange(this.amountOriginToChange, true);
      }
    }
  }
  /**
   * @desc Pre-recruitment request in the success window
   */
  contracTransferRequest() {
    const amountTransfer = this.responseQuotation.sentMoney.credit.amount;
    const balanceSum = this.principalAccount.availableBalance.currentBalances[0].amount - (this.responseQuotation.fees.totalFees.amount + this.responseQuotation.taxes.itemizeTaxes[0].itemizeTaxUnit.amount + amountTransfer);
    if (balanceSum < 0) {
      return this.errorFinalAmount('CNE0234');
    }
    let requestContractTransfer = {
      concept: this.conceptInfo?.concept,
      quotation: {
        id: this.quotationId
      },
      operativeType: '122_FX_PRICING_BACKEND',
      sender: {
        holder: {
          customDetails: {
            personType: 'NATURAL_KNOWN',
          }
        },
        contract: {
          id: this.clientId,
          number: this.principalAccount.number,
          numberType: {
            id: 'CCC'
          },
          contractType: {
            id: 'ACCOUNT',
            subType: {
              id: 'COMMON'
            }
          }
        },
        bank: {
          id: this.bankDestinationInfo.id,
          branch: {
            id: '0835'
          }
        }
      },
      receiver: {
        contract: {
          bank: this.bankDestinationInfo.BICCode ?  {
            id: this.bankDestinationInfo.id,
            BICCode: 'SWIFT'
          } : {
            id: this.bankDestinationInfo.id,
            americanBankersAssociationCode: {
              id: 'ABA'
            }
          },
          number: this.addresseeInfo.accountNumber,
          numberType: {
            id: 'IBAN'
          },
          contractType: {
            id: 'ACCOUNT',
            name: 'ACCOUNT',
            subType: {
              id: 'COMMON'
            }
          }
        },
        holder: {
          fullName: this.personalInformation.addresseeName,
          address: {
            location: {
              addressComponents: [
                {
                  name: this.personalInformation.addresseeAdress,
                  code: 'na',
                  componentTypes: [
                    'STREET_NAME'
                  ]
                },
                {
                  name: this.personalInformation.addresseeCountry,
                  code: 'na',
                  componentTypes: [
                    'CITY'
                  ]
                },
                {
                  name: this.personalInformation.addresseeCity,
                  code: 'na',
                  componentTypes: [
                    'COUNTRY'
                  ]
                },
                {
                  name: 'STATE',
                  code: 'na',
                  componentTypes: [
                    'STATE'
                  ]
                },
                {
                  name: 'ZIPCODE',
                  code: 'na',
                  componentTypes: [
                    'ZIPCODE'
                  ]
                },
                {
                  name: 'EXTERNAL_NUMBER',
                  code: 'na',
                  componentTypes: [
                    'EXTERNAL_NUMBER'
                  ]
                }
              ],
            },
          }
        }
      },
      sentMoney: [
        {
          amount: this.invertedFlags ? 0 : this.responseQuotation.sentMoney.credit.amount,
          currency: this.responseQuotation.sentMoney.credit.currency,
          isMajor: true
        },
        {
          amount: this.invertedFlags ? this.responseQuotation.sentMoney.debit.amount : 0,
          currency: this.responseQuotation.sentMoney.debit.currency,
          isMajor: true
        }
      ],
      hasFees: true,
      accountingDate: this.creationDate,
      exchangeRate: {
        baseCurrency: this.principalAccount?.availableBalance?.currentBalances[0]?.currency || this.principalAccount?.currencies[0]?.currency || this.baseCurrency,
        targetCurrency: this.invertedFlags ? this.currentCountryOrigin.currency : this.currentCountryDestination.currency,
        values: {
          factor: {
            value: this.factor
          }
        }
      },
      references: [
        {
          id: 'INTERNAL_REFERENCE',
          name: 'INTERNAL_REFERENCE',
          value: this.conceptInfo.reference
        }
      ],
      thirdPartyCollaboratorId: 'thirdParty'
    };
    this._dispatchEvents('request-contract-transfer', requestContractTransfer);
  }

  /**
    * @desc  when the BGADP Transfers V0 service call was successful
    * @param {Object} payload - the object with the service response data
    */
  successTransfer(payload) {
    this.dataSucces = {};
    const chargeAmount = this.invertedFlags ? this.getCountryAbbreviation(payload.sentMoney[1].currency)  : this.getCountryAbbreviation(payload.sentMoney[0].currency);
    const localEconomicActivity = this.economicActivities.find((i) => this.get('region.id', i) === 'LOCAL');
    const userEmail = this.userEmail.replaceAll('*', '');
    let dataReview = {
      additionalInfo: [ {
        message: {
          type: 'info-dark-blue',
          text: `${this.t('cells-successful-response-message-international-transfer')}<br><br>${this.t('cells-successful-response-message-international-transfer-two')}`,
          icon: 'coronita:info',
        }
      } ],
      additionalInfoClass: 'additional-info-padd-top-0',
      amountLabel: 'glomo-international-transfers-success-subtitle',
      buttons: {
        primary: {
          action: 'navigate-to-dashboard',
          class: 'buttons button',
          text: 'glomo-international-transfers-success-exit'
        },
        secondary: {
          hidden: true
        }
      },
      chargeAmount: {
        amount: this.invertedFlags ? payload.sentMoney[1].amount : payload.sentMoney[0].amount,
        currency: chargeAmount === 'MX' ? '$' : `${chargeAmount}$`,
        class: 'amount-huge-decimals'
      },
      classTypeOperation: 'blue-avatar-background half-right-angle-avatar',
      date: this.get('operationDate', payload),
      destination: {
        description: this.get('receiver.contract.bank.id', payload),
        moreInfo: this.get('name', this.bankDestinationInfo),
        number: this.get('receiver.contract.number', payload),
        product: {
          id: 'ACCOUNTS',
          name: this.get('addresseeName', this.personalInformation)
        }
      },
      fees: [
        {
          amount: this.get('fees.itemizeFees.0.amount.amount', payload),
          currency: this.get('fees.itemizeFees.0.amount.currency', payload) === 'MXN' ? '$' : `${this.getCountryAbbreviation(this.get('fees.itemizeFees[0].amount.currency', payload))}$`,
          text: 'glomo-international-transfers-success-commission'
        },
        {
          amount: this.get('taxes.itemizeTaxes.0.amount.amount', payload),
          currency: this.get('taxes.itemizeTaxes.0.amount.currency', payload) === 'MXN' ? '$' : `${this.getCountryAbbreviation(this.get('taxes.itemizeTaxes[0].amount.currency', payload))}$`,
          text: 'glomo-international-transfers-success-iva'
        },
      ],
      headerAdditionalListInfo: [
        {
          language: 'es-MX',
          localCurrency: 'MXN',
          key: 'glomo-international-transfers-success-import-charge',
          keyValuesClass: 'margin-m key-size-ml value-size-ml',
          value: {
            amount: this.get('chargeAmount.amount', payload),
            currencyCode: this.get('chargeAmount.currency', payload),
          }
        },
        {
          language: 'es-MX',
          localCurrency: 'MXN',
          key: 'glomo-international-transfers-success-import-destiny',
          keyValuesClass: 'margin-m key-size-ml value-size-ml',
          value: {
            amount: this.get('sentMoney.1.amount', payload),
            currencyCode: this.get('sentMoney.1.currency', payload),
          },
        },
        {
          keyValuesClass: 'margin key-size-ml value-size-ml',
          key: 'glomo-international-transfers-success-change-type',
          value: `1 ${this.baseCurrency} = ${payload.exchangeRate.values.factor.value} ${this.quoteCurrency}`,
        }
      ],
      headerAdditionalListInfoClass: 'amount-normal m-top-32',
      headerSectionConfig: 'core',
      isOriginCardType: true,
      maskedMessage: {
        class: 'bold normal',
        maskChars: '•',
        text: userEmail,
        visibleChars: userEmail.length
      },
      message: {
        icon: 'coronita:info',
        text: 'Recibirás el comprobante de esta transferencia en el correo:',
        type: 'info-dark-blue',
      },
      operations: [
        {
          label: 'glomo-international-transfers-success-page-operation-view-status',
          id: 'viewStatus',
          icon: 'coronita:visualize'
        },
        {
          label: 'glomo-international-transfers-success-share',
          id: 'share',
          icon: 'coronita:share',
          height: this.screenHeight
        }
      ],
      origin: {
        avatar: './images/cards/credit_card_dollar.svg',
        number: payload.sender.contract.number,
        product: {
          id: 'ACCOUNTS',
          name: `${this.t('glomo-international-transfers-success-account')}`
        }
      },
      title: 'glomo-international-transfers-processing-operation-title',
      topInfo: [
        {
          key: 'glomo-international-transfers-success-reference',
          value: this.get('references.0.value', payload),
          class: 'spacing light-key'
        },
        {
          key: 'glomo-international-transfers-relationship-to-recipient',
          value: this.get('relationshipToRecipient.name', this.personalInformation),
          class: 'spacing light-key'
        },
        {
          key: 'glomo-international-transfers-reason-for-transfer',
          value: this.get('name', this._reasonForTransferAnswer),
          class: 'spacing light-key'
        },
        {
          key: this.countryValue === 'PERU' ? 'cells-international-transfers-condition-country-ruc-o-dni' : 'glomo-international-transfers-concept',
          value: this.get('concept', payload) || 'cells-international-transfers-condition-country-not-concept',
          class: 'spacing light-key'
        },
        {
          key: 'glomo-international-transfers-success-type-operation',
          value: 'Transferencia internacional',
          class: 'spacing light-key'
        },
        {
          key: 'glomo-international-transfers-local-economic-activity',
          value: this.get('name', localEconomicActivity),
          class: 'spacing light-key'
        },
        ...this._addForeignEconomicActivtyTopInfo(),
        {
          key: 'glomo-international-transfers-success-folio-number',
          value: payload.operationNumber,
          class: 'spacing light-key'
        },
      ]
    };
    this.dataSucces = Object.assign(this.dataSucces, dataReview);
    this.reset();
    this._dispatchEvents('hide-spinner');
    this._dispatchEvents('review-transfer-data', dataReview);
  }

  /**
   * @desc Method to set the user answer , when have Foreign Economic Activity.
   */
  _addForeignEconomicActivtyTopInfo() {
    const item = [];
    if (this._hasEconomicActivitiesForeign) {
      const foreignEconomicActivity = this.economicActivities.find((i) => this.get('region.id', i) === 'FOREIGN');
      item.push({
        key: 'glomo-international-transfers-foreign-economic-activity',
        value: this.get('name', foreignEconomicActivity),
        class: 'spacing light-key'
      });
    }

    return item;
  }

  /**
   *
   */
  operativeSelected(operative) {
    if (operative && this.c(operative, 'id')) {
      this._shareTransferVoucher();
      this._dispatchEvents('set-change-exchange-rates-alert');
    }
  }

  /**
   * Method for screen page in glomo send info template and height pages
  **/
  screenClicked() {
    let htmlTemplate = document.getElementById('cells-template-internationalTransfersSuccess');
    let receipt = htmlTemplate.querySelector('#successful-international-transfers');
    let header = htmlTemplate.querySelector('#international-transfers-receipt');
    let operations = receipt.shadowRoot.querySelector('cells-operations-list');
    let operationbtn = receipt.shadowRoot.querySelector('.actions');

    operations.style.display = 'none';
    operationbtn.style.display = 'none';
    htmlTemplate.style.minHeight = `${receipt.offsetHeight + header.offsetHeight + 100}px`;

    setTimeout(() => {
      this._dispatchEvents('operation-clicked-share', {
        height: parseInt(htmlTemplate.offsetHeight),
        share: true,
        download: false,
      });
    }, 500);

    setTimeout(() => {
      operations.style.display = 'block';
      operationbtn.style.display = 'block';
      htmlTemplate.style.minHeight = 'block';
    }, 3250);
  }

  /**
   *
   */
  _shareTransferVoucher() {
    const genericTransferDetailMx = {
      date: this.c(this.dataSucces, 'date', ''),
      folioNumber: this.c(this.dataSucces, ['topInfo', [ 3 ], 'value', '']),
      operationType: this.c(this.dataSucces, 'title', ''),
      originAccount: this.c(this.dataSucces, 'origin.number', ''),
      beneficiary: {
        name: this.c(this.dataSucces, 'destination.product.name', ''),
        bank: this.c(this.dataSucces, 'destination.description', ''),
        number: this.c(this.dataSucces, 'destination.number', ''),
      },
      chargeAmount: this.c(this.dataSucces, ['headerAmountList', [ 0 ], 'value', '']),
      localAmount: {
        amount: this.c(this.dataSucces, 'amount.amount', ''),
        currency: this.c(this.dataSucces, 'amount.currency', '')
      },
      fees: [
        {
          text: this.c(this.dataSucces, ['fees', [ 0 ], 'text', '']),
          amount: this.c(this.dataSucces, ['taxes.amount' [ 0 ], 'amount', '']),
          currency: this.c(this.dataSucces, ['taxes.amount', [ 0 ], 'currency', ''])
        }
      ],
      concept: this.c(this.dataSucces, ['topInfo', [ 1 ], 'value', '']),
      description: this.c(this.dataSucces, 'destination.description', ''),
      templateSelected: 'genericTransferDetail'
    };
    this._dispatchEvents('share-receipt-capture-internal-trasfers', genericTransferDetailMx);
  }

  /**
   * @desc Method that creates the modal that is executed only once when the feature is opened
   */
  _onboardingTransfer() {
    const configOnboardingTransfer = {
      code: 'INTERNATIONAL-TRANSFER-ONBOARDING',
      primaryButtonClass: 'primary',
      selectedConfig: {
        className: 'full-height-info spacing image--sd',
        openMaximized: true,
        title: 'glomo-international-transfers-foreign-currency-header-title',
        heroImage: './images/transfers/transfer.svg',
        acceptBtLabel: 'info-UNDERSTAND-accept',
        template: {
          type: 'paragraphs',
          values: [
            {
              title: 'cells-international-transfers-onboarding-title',
              class: 'simple-title'
            },
            {
              text: `<ul><li><p>${this.t('cells-international-transfers-onboarding-bulletOne')}</p></li></ul>`,
              class: 'ul-li--text-left'
            },
            {
              text: `<ul><li><p>${this.t('cells-international-transfers-onboarding-bulletTwo')}</p></li></ul>`,
              class: 'ul-li--text-left'
            },
            {
              text: `<ul><li><p>${this.t('cells-international-transfers-onboarding-bulletThree')}</p></li></ul>`,
              class: 'ul-li--text-left'
            }
          ]
        }
      }
    };
    this._dispatchEvents('open-modal-internationl-transfers', configOnboardingTransfer);
  }

  /**
  * @desc When it is stiky send an error, to manage every case
  * @param {Object} response - the object with the error response
  */
  validCodeError(response) {
    const resetTimer = {
      timeout: 0,
      reset: true,
      visibilityTimer: false
    };
    if (this.timerEnabled) {
      this._dispatchEvents('reset-only-timer', resetTimer);
      this.timerEnabled = false;
    }
    const errorMap = {
      KNE6666: () => this._displayMtuError(),
      NLE0023: () => this._modalFraudulentOperations(),
      GPE2764: () => this.requestBanksError(response),
      GPE2763: () => this.requestBanksError(response),
      GPE1731: () => this.limitOperationError(),
      GPE1732: () => this.limitOperationError(),
      CNE0235: () => this.limitOperationError(),
      CNE0234: () => this.errorFinalAmount(response.messages[0].message),
      GPE1533: () => this.errorFinalAmount(response.messages[0].message),
      CNE0227: () => this.errorAccountReceiver(),
      GPE0280: () => this._requestBanksErrorMXN(),
    };
    const matchedError = Object.keys(errorMap).find(pattern => new RegExp(pattern, 'gi').test(response.messages[0].message));
    if (matchedError) {
      errorMap[matchedError]();
    } else {
      this.countError++;
      if (this.countError >= 3) {
        this.errorRequestWithoutRestart();
      } else {
        this.errorRequest(response.messages[0].message);
      }
    }
  }
  /**
   * @desc Method that display the mtu error flow
   * @event hide-spinner
   * @event mtu-exception-handler-navigation
   */
  _displayMtuError() {
    this.mtuFlag = {
      makePayment: true,
      cancelPayment: false
    };
    this._dispatchEvents('hide-spinner');
    this._dispatchEvents('mtu-exception-handler-navigation', true);
  }

  /**
  * @desc Modal error BGADP Transfers V0 service detect fraudulent operation
  */
  _modalFraudulentOperations() {
    const configFraudulentOperation = {
      code: 'FRAUDULENT-OPERATIONS-INTERNATIONAL-TRANSFER',
      primaryButtonClass: 'button-secondary--white-core-blue',
      selectedConfig: {
        className: 'full-height-info header--white image--sd',
        heroImage: './images/transfers/Caution.svg',
        openMaximized: true,
        title: 'cells-international-transfers-modal-fraudulent-title-top',
        acceptBtLabel: 'cells-international-transfers-screen-button',
        template: {
          type: 'paragraphs',
          values: [
            { title: 'cells-international-transfers-modal-fraudulent-title', class: 'simple-title spacing' },
            { text: 'cells-international-transfers-modal-fraudulent-subtitle', class: 'simple-text spacing' },
            {
              title: 'PF-NLE0023',
              class: 'ul-li--text-left'
            },
            {
              type: 'info-dark-blue',
              icon: 'coronita:info',
              message: 'cells-international-transfers-modal-fraudulent-text',
              class: 'info-consumer spacing'
            }
          ]
        }
      }
    };
    this._dispatchEvents('open-modal-fraudulent-operation', configFraudulentOperation);
  }

  /**
   * @desc Method that sends information in case the user has changed destination in the first step
   */
  modalChangeOfDestiny() {
    const configModal = {
      code: 'INTERNATIONAL-TRANSFERS-NEW-DESTINITY',
      selectedConfig: {
        className: 'error',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'international-transfers-summary-button-label',
        cancelBtLabel: 'Cancelar',
        onAcceptEvent: '',
        template: {
          type: 'paragraphs',
          values: [
            { icon: 'coronita:alert' },
            { text: 'cells-international-transfers-change-of-destiny' }
          ]
        }
      }
    };
    this._dispatchEvents('show-modal-change-of-destiny', configModal);
  }

  /**
   * @desc Method that sends information in case the user has changed destination in the first step
   */
  modalChangeOfQuotation() {
    const configModal = {
      code: 'INTERNATIONAL-TRANSFERS-NEW-QUOTATION',
      selectedConfig: {
        className: 'error',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'international-transfers-summary-button-label',
        cancelBtLabel: 'Cancelar',
        onAcceptEvent: '',
        template: {
          type: 'paragraphs',
          values: [
            { icon: 'coronita:alert' },
            { text: 'glomo-international-transfers-change-quotation' }
          ]
        }
      }
    };
    this._dispatchEvents('show-modal-change-of-destiny', configModal);
  }

  /**
   * @desc Method that changes the value of the flag with the change-step-state event to see the modal
   */
  recipientSelectorChangedValue() {
    this._dispatchEvents('change-of-flag-value-in-recipient-inter-transfer', {showAlertBeforeUncollapsing: true});
  }

  /**
   * @desc method that sets the flag to false to reset the step cells-step-recipient-selector by modal
   */
  recipientSelectorResetModal() {
    this._dispatchEvents('set-reset-buttons-recipient-inter-transfer', { showAlertBeforeUncollapsing: false });
    this._dispatchEvents('uncollapse-recipient-selector-inter-transfer');
  }

  /**
   * @desc Method that reset second step in  changed quotation modal and timmer
   */
  changeQuotation() {
    const step = {
      currentStep: 3
    };
    const resetTimer = {
      timeout: 0,
      reset: true,
      visibilityTimer: false
    };
    if (this.timerEnabled) {
      this._dispatchEvents('reset-info-transfer-and-timer', resetTimer);
      this.timerEnabled = false;
    }
    this._dispatchEvents('international-transfer-reset-step-without', step);
    this._dispatchEvents('desabled-step-foreing-currency', {
      disableFlag: false,
      collapsed: false,
      continueEnabled: false,
      commissionCurrencyList: []
    });
  }

  /**
   * @desc Method that reset second step in  changed  destinity modal and timmer
   */
  resetStepForeignCurrency() {
    const step = {
      currentStep: 2,
      productId: this.productId
    };
    this._dispatchEvents('international-transfer-reset-step', step);
    const resetTimer = {
      timeout: 0,
      reset: true,
      visibilityTimer: false
    };
    if (this.timerEnabled) {
      this._dispatchEvents('reset-info-transfer-and-timer', resetTimer);
      this.timerEnabled = false;
    }
    this._dispatchEvents('new-reset-foreing-currency-step', false);
    this._dispatchEvents('desabled-step-foreing-currency', {
      active: false,
      disableFlag: false,
      commissionCurrencyList: [],
      additionalInfo: undefined
    });
    this._dispatchEvents('reset-economic-activity-step');
    this.generateForeignExchangeInfo();
    this._dispatchEvents('reset-and-desabled-step-concep-input', '');
    this._dispatchEvents('international-transfer-reset-step-collapse-active', {
      active: false,
      collapsed: false
    });
    this._dispatchEvents('international-transfers-reset-step-for-transfer', '');
  }

  /**
   * @desc Modify offset top for scroll
   * @type {Object}
   */
  scrollZoneModify(payload) {
    if (this.isNativeIos && payload.offsetTop > 100) {
      Object.defineProperty(payload, 'offsetTop', {
        value: payload.offsetTop - 200,
        configurable: true
      });
    }
    this._dispatchEvents('cells-scroll-zone-modify', payload);
  }

  /**
   * @desc Detail receive the size information from the success page
  */
  sendClickedScreen(detail) {
    let eventName;
    let params;
    if (detail.id === 'share') {
      eventName = 'operation-clicked-' + detail.id;
      params = {
        height: this.scrollCompleteSuccess.target.scrollHeight,
        share: true
      };
    }
    this._dispatchEvents(eventName, params);
  }

  /**
   * @desc parse globalAccounts info to start operative
   * If there is more than one account in level 4 dispatchs more-than-one-account-to-select event to select only one
   */
  validateData() {
    let allAccounts = this.globalAccounts.reduce((accounts, i) => {
      accounts.push(...i.products);
      return accounts;
    }, []);
    let parsedAccounts = allAccounts.filter(account => account.level === '04').map(account => ({
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
    if (parsedAccounts.length <= 1) {
      this.initializationData(parsedAccounts[0]);
    } else {
      this._dispatchEvents('more-than-one-account-to-select', parsedAccounts);
    }
  }

  /**
   * @desc Request questionnaire
   * @private
   */
  getMoneyLaunderingQuestionnaire() {
    const params = {
      'questionnaire-type-id': 'OPIS'
    };

    this._dispatchEvents('dispatch-request-questionnaire-params', params);
  }

  /**
   * @desc Handle successful request get questionnaire money laundering response
   * @param {Object} data
   * @public
   */
  handleGetMoneyLaunderingQuestionnaireSuccessfulResponse(data) {
    const questions = this.get('questions', data) || [];
    this._relationshipToRecipientQuestion = questions.find((question) => this.get('id', question) === '1');
    this._reasonForTransferQuestion = questions.find((question) => this.get('id', question) === '2');
    this._relationshipToRecipientAvailableAnswers = this._parseAvailableAnswers(this.get('availableAnswers', this._relationshipToRecipientQuestion) ||  []);
    this._reasonForTransferAvailableAnswers = this._parseAvailableAnswers(this.get('availableAnswers', this._reasonForTransferQuestion) ||  []);

    this._dispatchEvents('dispatch-first-question-available-answers', this._relationshipToRecipientAvailableAnswers);
    this._dispatchEvents('dispatch-second-question-available-answers', this._reasonForTransferAvailableAnswers);
    this._dispatchEvents('hide-spinner');
  }

  handleGetMoneyLaunderingQuestionnaireErrorResponse() {
    this._showRetryErrorModal('money-laundering-questionnaire-not-loaded', 'informationNotLoaded');
  }

  /**
   * @desc Parse the available answers
   * @param {Array} answers
   * @return {Array}
   * @public
   */
  _parseAvailableAnswers(answers) {
    const answersParsed = answers.map((answer) => {
      return {
        id: this.get('id', answer),
        name: this.get('description', answer) || ''
      };
    });

    return answersParsed;
  }

  /**
   * @param {Array} _relationshipToRecipientAvailableAnswers
   * @desc Set the _relationshipToRecipientAvailableAnswers property
   */
  setRelationshipToRecipientAvailableAnswers(availableAnswers) {
    this._relationshipToRecipientAvailableAnswers = Array.isArray(availableAnswers) ? availableAnswers : [];
  }

  /**
   * @param {Array} _reasonForTransferAvailableAnswers
   * @desc Set the _relationshipToRecipientAvailableAnswers property
   */
  setReasonForTransferAvailableAnswers(availableAnswers) {
    this._reasonForTransferAvailableAnswers = Array.isArray(availableAnswers) ? availableAnswers : [];
  }

  /**
   * Fires and displays the selected option of the relationship with the recipient
   * @param {e} event
   */
  setRelationshipToRecipientAnswer(data) {
    const answer = this._relationshipToRecipientAvailableAnswers.find((answers) => this.get('id', answers) === this.get('item.id', data));
    this._relationshipToRecipientAnswer = {
      id: this.get('id', answer),
      name: this.get('name', answer)
    };
    this._relationshipToRecipientAnswerName = this.get('name', this._relationshipToRecipientAnswer) || '';
    this._dispatchEvents('dispatch-relationship-to-recipient-answer-name', (this._relationshipToRecipientAnswerName || false));
  }

  /**
   * @desc Set economic activities data
   * @param {Object} data
   * @property {String} currentEconomicActivity
   * @property {Boolean} hasEconomicActivitiesForeign
   * @property {String} economicActivityForeign Optional
   * @pulbic
   */
  setEconomicActivitiesData(data) {
    const economicActivities = [];
    this._hasEconomicActivitiesForeign = this.get('hasEconomicActivitiesForeign', data);
    const economicActivityLocal = {
      name: this.get('currentEconomicActivity', data),
      region: {
        id: 'LOCAL'
      }
    };
    economicActivities.push(economicActivityLocal);

    if (this._hasEconomicActivitiesForeign && this.get('economicActivityForeign', data)) {
      const economicActivitiesForeign = {
        name: this.get('economicActivityForeign', data),
        region: {
          id: 'FOREIGN'
        }
      };
      economicActivities.push(economicActivitiesForeign);
    }

    this.economicActivities = economicActivities;
  }

  /**
   *
   * @param {Object} data
   * @prop {String} id id of the reason transfer answer
   * @prop {String} name  name of the reason transfer answer
   */
  setReasonForTransferAnswer(data = {}) {
    const answer = this._reasonForTransferAvailableAnswers.find((answers) => this.get('id', answers) === this.get('item.id', data));
    this._reasonForTransferAnswer = {
      id: this.get('id', answer) || '',
      name: this.get('name', answer) || ''
    };
    this._dispatchEvents('dispatch-reason-transfer', this._reasonForTransferAnswer);
  }

  /**
   * @desc Get latest questionnaire answers
   * @private
   */
  getMoneyLaunderingQuestionnaireLatestAnswers() {
    this._dispatchEvents('show-spinner');
    const bodyContent = {
      operationType: {
        id: 'SENT'
      },
      sender: {
        contract: {
          id: this.productId
          || this.get('productId', this.principalAccount)
          || this.get('accountId', this.principalAccount)
        }
      },
      receiver: {
        contract: {
          number: this.get('accountNumber', this.addresseeInfo)
        }
      },
      isLastCreated: true
    };

    this._dispatchEvents('get-money-laundering-questionnaire-latest-answers', bodyContent);
  }

  /**
   * @desc Handle successful request get latest questionnaire answers response
   * @param {Object} response
   * @public
   */
  handleGetLatestQuestionnaireAnswersSuccessfulResponse(response) {
    const answers = this.get('0', response);
    if (answers) {
      const economicActivities = this.get('economicActivities', answers) || [];

      const localEconomicActivity = economicActivities.find((economicActivity) => this.get('region.id', economicActivity) === 'LOCAL');
      const foreignEconomicActivity = economicActivities.find((economicActivity) => this.get('region.id', economicActivity) === 'FOREIGN');
      const economicActivityFormatted = this._formatText(this.get('name', localEconomicActivity) || '');
      this._dispatchEvents('dispatch-local-economic-activity-description', economicActivityFormatted);

      if (foreignEconomicActivity) {
        const foreignEconomicActivityFormatted = this._formatText(this.get('name', foreignEconomicActivity) || '');
        const foreignEconomicActivityProperties = {
          checkboxBtnChecked: true,
          secondTextAreaValue: foreignEconomicActivityFormatted
        };

        this._dispatchEvents('dispatch-foreign-economic-activity-properties', foreignEconomicActivityProperties);
      }
    }
    this._dispatchEvents('hide-spinner');
    this._dispatchEvents('navigate-to-review-recipient');
  }

  /**
   * @desc Format the text when the service responds that the questionnaire has already been answered previously.
   * @param {String} text
   */
  _formatText(text) {
    const textToLowerCase = text.toLowerCase();
    const newText = textToLowerCase.charAt(0).toUpperCase() + textToLowerCase.substring(1, textToLowerCase.length);
    const textFormatted = newText.replace(/(?:(\.\s{1,}))[a-z]/, (w) => w.toUpperCase()).replace(/\s{2,}/, ' ');
    return textFormatted;
  }

  /**
   * @desc Handle error request get latest questionnaire answers response
   * @param {Object} response
   * @public
   */
  handleGetLatestQuestionnaireAnswersErrorResponse() {
    this._showRetryErrorModal('money-laundering-latest-questionnaire-answers-information-not-loaded', 'informationNotLoaded');
  }

  /**
   * @desc Make request for save the questionnaire
   * @public
   */
  saveMoneyLaunderingQuestionnaireAnswers() {
    this._dispatchEvents('show-spinner');
    const answers = {
      operationType: {
        id: 'SENT',
      },
      sender: {
        contract: {
          id: this.productId
            || this.get('accountId', this.principalAccount)
            || this.get('productId', this.principalAccount)
        },
      },
      questionnaireTypeAnswered: {
        id: 'OPIS',
        questions: [
          {
            id: this.get('id', this._relationshipToRecipientQuestion),
            description: this.get('description', this._relationshipToRecipientQuestion),
            selectAnswer: {
              id: this.get('relationshipToRecipient.id', this.personalInformation),
              description: this.get('relationshipToRecipient.name', this.personalInformation),
            },
          },
          {
            id: this.get('id', this._reasonForTransferQuestion),
            description: this.get('description', this._reasonForTransferQuestion),
            selectAnswer: {
              id: this.get('id', this._reasonForTransferAnswer),
              description: this.get('name', this._reasonForTransferAnswer),
            },
          },
        ],
      },
      economicActivities: this.economicActivities,
      receiver: {
        contract: {
          number: this.get('accountNumber', this.addresseeInfo),
        },
      },
    };

    this._dispatchEvents('dispatch-money-laundering-answers', answers);
  }

  /**
   * @desc Handle save money laundering succesful response
   * @public
   */
  handleSaveMoneyLaunderingQuestionnaireAnswersSuccessfulResponse() {
    this.contracTransferRequest();
  }

  /**
   * @desc Handle save money laundering error response
   * @public
   */
  handleSaveMoneyLaunderingQuestionnaireAnswersErrorResponse() {
    this._showRetryErrorModal('money-laundering-questionnaire-unfinished-operation', 'unfinishedOperations');
  }

  /**
   * @desc Method to create a object and show modal when identified global errors.
   * @param {String} errorId
   * @param {String} errorType
   */
  _showRetryErrorModal(errorId, errorType) {
    const errorTypeToKebabCase = errorType.replace(/[A-Z]/g, w => `-${w}`.toLowerCase());
    const errorConfig = {
      retryErrorData: {
        errorId,
        errorType,
        disabledOpenDialerAction: true,
        retryConfig: {
          acceptBtLabel: 'alert-generic-error-retry',
          cancelBtLabel: `glomo-international-transfers-${errorTypeToKebabCase}-cancel-btn`,
          title: `glomo-international-transfers-title-${errorTypeToKebabCase}-error`,
          header: 'glomo-international-transfers-header-page',
          fullModal: true,
          className: 'full-height-error',
          srcImage: './images/errors/error.svg',
          message: `glomo-international-transfers-${errorTypeToKebabCase}-description`,
        },
        callConfig: {
          acceptBtLabel: `glomo-international-transfers-${errorTypeToKebabCase}-cancel-btn`,
          cancelBtLabel: '',
          title: `glomo-international-transfers-title-${errorTypeToKebabCase}-error`,
          header: 'glomo-international-transfers-header-page',
          fullModal: true,
          className: 'full-height-error',
          srcImage: './images/errors/error.svg',
          message: `glomo-international-transfers-${errorTypeToKebabCase}-description`
        }
      }
    };
    this._dispatchEvents('show-global-retry-error', errorConfig);
  }

  /**
   * @desc Handle operation registries post error response.
   * @public
   */
  handleOperationRegistriesPostError() {
    this._showRetryErrorModal('operation-registries-post', 'unfinishedOperations');
  }

  /**
   * Return to previous page
   */
  goBack() {
    this._dispatchEvents('hide-spinner');
    this._dispatchEvents('go-back');
  }

  /**
   * @desc Receive all disapatch events
   * @param {String} eventName
   * @param {Object} detail
   */
  _dispatchEvents(eventName, detail = {}) {
    this.dispatchEvent(new CustomEvent(eventName, {
      bubbles: true,
      composed: true,
      detail: detail
    }));
  }
}

customElements.define(GlomoInternationalTransfersMxDm.is, GlomoInternationalTransfersMxDm);
