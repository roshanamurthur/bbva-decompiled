/* global moment */
/* global BGADPArmadilloAuthTokenStatus */
/* eslint new-cap: 0 */
/**
* @summary DataManager to handle operative 'transfer' in GloMo project.
* @customElement
* @polymer
* @extends {Polymer.Element}
*/

class GlomoOpxTransferDmMx extends CellsBehaviors.CellsProductFormatBehavior(Polymer.mixinBehaviors([
  CellsBehaviors.i18nBehavior,
  CellsBehaviors.StepManagerBehavior,
  CellsBehaviors.CellsGlobalApisHandleRequestError,
  CellsBehaviors.CellsCheckNestedKeysBehavior,
  CellsBehaviors.CellsTextFormatterBehavior
], Polymer.Element)) {
  static get is() {
    return 'glomo-opx-transfer-mx-dm';
  }

  static get properties() {
    return {
      /**
       * Stores detail used to set enter amount properties
       */
      enterAmountProps: {
        type: Object,
        value: () => ({})
      },
      /**
       *  Flag that indicates when the contact changes
       */
      _isContactChanged: {
        type: Boolean,
        value: false
      },
      /**
       * Checks if it is the first time using timer
       */
      _firstTimeTimer: {
        type: Boolean,
        value: false
      },

      /**
       * Stores entry point
       */
      _entryPoint: {
        type: Object,
        value: () => ({})
      },

      /**
       *  Selected product data
       */
      senderProductDetail: {
        type: Object,
        value: () => ({}),
      },

      /**
       * Origin's account
       */
      _selectedSender: {
        type: Object,
        value: () => ({}),
      },

      /**
       * Origin's account currency
       */
      _originCurrency: {
        type: String,
        value: 'glomo-transfer-origin-currency'
      },

      /**
       * Stores different values depending on _originCurrency
       */
      _originCurrencySelected: {
        type: Object,
        computed: '_setOriginCurrencySelected(_originCurrency)'
      },

      /**
       * Path to currency image
       */
      currencyImagePath: {
        type: Object,
        value: {
          USD: '../images/flags/eeuu.svg',
          MXN: '../images/flags/mexico.svg',
          EUR: '../images/flags/europa.svg'
        },
      },

      /**
       * Array of filtered accounts and cards without orgin account
       */
      _filterProductDetail: {
        type: Array,
        value: () => [],
      },

      /**
       * Destination' account
       */
      _selectedReceiver: {
        type: Object,
        value: () => ({}),
      },

      /**
       * Destination's account currency
       */
      _foreignCurrency: {
        type: String,
        value: 'glomo-transfer-foreign-currency'
      },

      /**
       * If true, it means that we are in exchangeRates section
       */
      _exchangeRatesFlag: {
        type: Boolean,
        value: false
      },

      /**
       * Stores different values depending on foreignCurrency
       */
      _destinationCurrencySelected: {
        type: Object,
        computed: '_setDestinationCurrencySelected(_foreignCurrency)'
      },

      /**
       * Type of the transfer made: 'INTERNAL_TRANSFERS', 'INTERBANK_TRANSFERS' or 'OWN_TRANSFERS'
       */
      _transferType: {
        type: String,
        value: '',
      },

      /**
       * The concept and reference of the transfer is saved
       */
      _concept: {
        type: Object,
        value: () => ({})
      },

      /**
       * Account number being searched in new contact section
       */
      _recipientInputValue: {
        type: Number,
        value: 0
      },

      /**
       * Array where saved contacts are stored, these are obtained in getSavedContacts response
       */
      savedContacts: {
        type: Array,
        value: () => [],
      },

      /**
       *  Here is stored the information of a contact that already is in savedContacts, used when validating if number is in savedContacts
       */
      _savedContactDetail: {
        type: Object,
        value: () => ({})
      },

      /**
       * Stores specific account from all accounts in _savedContactDetail
       */
      _savedContactDetailAccount: {
        type: Object,
        value: () => ({})
      },

      /**
       * Title in review section, depending on number length
       */
      _accountTitle: {
        type: String,
        value: ''
      },

      /**
       * Here is stored receivers service response when searching a acccount number
       */
      _responseReceivers: {
        type: Object,
        value: () => ({})
      },

      /**
       * Here is stored deestination's information, obtained in review section
       */
      _contactDetail: {
        type: Object,
        value: () => ({})
      },

      /**
       * Path to error.svg image
       */
      errorAlertImagePath: {
        type: String,
        value: '../images/errors/error.svg'
      },

      /**
       * Value of 1 base currency in quote currency
       */
      _relativeValue: {
        type: String,
        value: ''
      },

      /**
       * Equivalence of inputAmount in foreignCurrency
       */
      _totalAmount: {
        type: String,
        value: ''
      },

      /**
       * Typed amount selected
       */
      inputAmount: {
        type: String,
        value: ''
      },

      /**
       * If true, means timer is active
       */
      _timerActive: {
        type: Boolean,
        value: false
      },

      /**
       * Custom title above origin's currency
       */
      _customCurrencySelectTitle: {
        type: String,
        value: 'glomo-transfer-custom-currency-select-title'
      },

      /**
       * Custom title above destination's currency
       */
      _totalHeader: {
        type: String,
        value: 'glomo-transfer-total-header'
      },

      /**
       *  Array of accounts after being parsed into specific structure
       */
      globalAccountsParsed: {
        type: Array,
        value: () => [],
      },

      /**
       * Array of cards after being parsed into specific structure
       */
      globalCardsParsed: {
        type: Array,
        value: () => [],
      },

      /**
       * Array of contracts after being parsed into specific structure
       */
      globalContractsParsed: {
        type: Array,
        value: () => [],
      },

      /**
       * Array of mapped accounts and maapped cards
       */
      _customerProducts: {
        type: Array,
        value: () => [],
      },

      /**
       * Flag used to know if it is the first time in the flow
       */
      _detailEntryPoint: {
        type: Boolean,
        value: false
      },

      /**
       * Flag that dictates if local flow
       */
      _isLocal: {
        type: Boolean,
        value: false
      },

      /**
       * Opening hour used to know if out of schedule alert should be displayed
       */
      openingHour: {
        type: String,
        value: ''
      },

      /**
       * Closing hour used to know if out of schedule alert should be displayed
       */
      closingHour: {
        type: String,
        value: ''
      },

      /**
       * Closing minutes used to know if out of schedule alert should be displayed
       */
      closingMinutes: {
        type: String,
        value: ''
      },

      /**
       * Stores amount operations step
       */
      _amountOperationsStepNumber: {
        type: Number,
        value: 0
      },

      /**
       * Stores concept
       */
      _isConceptFilled: {
        type: String,
        value: ''
      },

      /**
       * Stores receiver's subProductType
       */
      _receiverSubProductType: {
        type: String,
        value: ''
      },

      /**
       * Base operative's base max steps
       */
      baseMaxSteps: {
        type: Number,
        value: 0
      },
      /**
       * Data to google assistant
       */
      dataGoogleAssistant: {
        type: Object,
        value: () => ({})
      },
      /**
       *  Flag for equity contracts
       */
      _equityFlag: {
        type: Boolean,
        value: false,
      },
      /**
       * Array of principal account after being parsed into specific structure
       */
      principalAccount: {
        type: Object,
        value: () => ({}),
      },
      /**
       * Persist the customer number phone
       * @type {String}
       */
      _myPhoneNumber: {
        type: String,
        value: ''
      },
      /**
       * Persist customerId to codicel proccess
       * @type {String}
       */
      clientId: {
        type: String,
        value: ''
      },
      /**
       * Store banxico query response
       * @type {String}
       */
      _banxicoResponse: {
        type: String,
        value: ''
      },
      /**
       * Scondary config contact just in case that customer is enrollment dimo
       * @type {Object}
       */
      _contactDimo: {
        type: Object,
        value: () => ({})
      },
      /*
       * Number used to validate if it is a CLBE account of boost message interbank transfers
       */
      numberRecipientValue: {
        type: Number,
        value: 18
      },
      /**
       * Flag for boost message interbank transfers
       */
      _messageInterbankTransfersflag: {
        type: Boolean,
        value: false,
      },
      /**
       * Object that has the list of flags
       */
      _featureFlagCollection: {
        type: Object,
        value: () => ({})
      },
      /**
       * Flag to check if customer is enrollment Dimo
       * @type {Boolean}
       */
      _isEnrollmentDimo: {
        type: Boolean,
        value: false
      },
      /**
       * Checks if must mix between transfers and dimo
       * @type {Boolean}
       */
      dimoTransferFeature: {
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
      /*
       * Numbers that are sent in the service GetBankRecords for boost message interbank transfers
       */
      _numbersGetRecords: {
        type: Number,
        value: ''
      },
      /**
       * Array of the options selected in the selectors
       * @type {Array}
       */
      optionsSelector: {
        type: Array,
        value: () => ([])
      },
      /**
      * Payload information that comes from future
      */
      jsonFutura: {
        type: Object,
        value: () => ({})
      },
      /**
      * Flag to know if it is being executed from Futura
      */
      fromFutura: {
        type: Boolean,
        value: false
      },
      /**
      * Object with financial overview information
      */
      financialOverview: {
        type: Object,
        value: {}
      },
      /**
      * Flag to know if it is being executed from reuse operation list
      */
      _fromReuseOperationList: {
        type: Boolean,
        value: false
      },
      /**
      * Selected item from reuse operation list
      */
      _reuseOperationListSelectedDetailMovement: {
        type: Object,
        value: {}
      },
      /**
      * Response operation list receiver response
      */
      _reuseOpListReceiversResponse: {
        type: Object,
        value: {}
      },
      /**
      * Formated items for reuse operations list modal selector
      */
      _modalItemsFormat: {
        type: Array,
        value: []
      },
      /**
      * Object filled if a receiver from operation list is in the saved contact list
      */
      _isReuseOperationSavedContactNumber: {
        type: Object,
        value: {}
      },
      /**
      * Steps identifiers to prefilling operative for reuse operation list and futura
      */
      _prefillingStepsSelectorIds: {
        type: Object,
        value: {}
      },
      /**
      * Transactions filtered for transfer reuse
      */
      _filteredMovements: {
        type: Array,
        value: []
      },
      /**
      * Counter of transaction fro reuse operations
      */
      _numberOfOperationsReuse: {
        type: Number,
        value: 0
      },
      /**
      * Service response with more transactions
      */
      _noMoreAvaliableTransactions: {
        type: Boolean,
        value: false
      },
      /**
      * Switch to control first open of transactions
      */
      fisrtClickDone: {
        type: Boolean,
        value: false
      },
      /*
      * Enable or disable the account button
      */
      disableMyAccounts: {
        type: Boolean,
        value: false
      },
      /*
      * Features flags
      */
      _featuresFlags: {
        type: Object,
        value: {}
      },
      /*
      * Features flags
      */
      _featuresFlagsAnalytics: {
        type: Object,
        value: {}
      },
      /*
      * Value of reuse operation list flag
      */
      _featureFlagReuseOperationList: {
        type: Boolean,
        value: false
      },
      /*
      * Value of reuse operation list analytics flag
      */
      _featureFlagReuseOperationListAnalytics: {
        type: Boolean,
        value: false
      },
      /*
      * Reuse operation list feature flag key
      */
      _reuseOperationsListFlagKey: {
        type: String,
        value: 'glomo.transfers.reuseOperationsList'
      },
      /*
      * Reuse operation list feature flag key
      */
      _reuseOperationsListAnalyticsFlagKey: {
        type: String,
        value: 'glomo.analytics.transfers.reuseOperationsList'
      },
      /*
       * Identify if come from the page from expenses group
       */
      comeFromExpensesGroup: {
        type: Boolean,
        value: false
      }
    };
  }

  static get observers() {
    return [
      '_onSenderSelected(senderProductDetail)'
    ];
  }

  /**
   * Function to reset data
   */
  /* eslint-disable max-statements */
  reset() {
    this._isContactChanged = false;
    this.canExecute = false;
    this.resetWithDefaultSettings();
    this._resetEnterAmount();
    this._detailEntryPoint = false;
    this._dispatch('change-class-backgroud', {
      fixed: false,
    });
    this._steps = {};
    this._isEnrollmentDimo = false;
    this._contactDimo = {};
    this._banxicoResponse = '';
    this._receiverSubProductType = '';
    this.enterAmountProps = {};
    this._firstTimeTimer = false;
    this._entryPoint = {};
    this.senderProductDetail = {};
    this._selectedSender = {};
    this.originCurrencySelected = {};
    this._filterProductDetail = [];
    this._selectedReceiver = {};
    this._exchangeRatesFlag = false;
    this._destinationCurrencySelected = {};
    this._transferType = '';
    this._concept = {};
    this._recipientInputValue = 0;
    this.savedContacts = [];
    this._savedContactDetail = {};
    this._savedContactDetailAccount = {};
    this._accountTitle = '';
    this._responseReceivers = {};
    this._contactDetail = {};
    this._relativeValue = '';
    this._totalAmount = '';
    this.inputAmount = '';
    this._timerActive = false;
    this.globalAccountsParsed = [];
    this.globalCardsParsed = [];
    this.globalContractsParsed = [];
    this._customerProducts = [];
    this._isLocal = false;
    this._isConceptFilled = '';
    this.principalAccount = {};
    this.jsonFutura = {};
    this.paramFutura = {};
    this.isFuturaInternal = false;
    this.fromFutura = false;
    this._fromReuseOperationList = false;
    this._reuseOperationListSelectedDetailMovement = {};
    this._reuseOpListReceiversResponse = {};
    this._modalItemsFormat = [];
    this._isReuseOperationSavedContactNumber = {};
    this._numberOfOperationsReuse = 0;
    this._filteredMovements = [];
    this._noMoreAvaliableTransactions = false;
    this.fisrtClickDone = false;
    this.comeFromExpensesGroup = false;
  }

  /**
   * @desc Reset only values that correspond to Dimo
   */
  resetInfoDimo() {
    this._isEnrollmentDimo = false;
    this._banxicoResponse = '';
    this._contactDimo = {};
    this._savedContactDetail = {};
    this._dispatch('info-dimo-props-reseted');
  }

  /**
   * Deactivate others steps when reopen other step
   *
   * @param {Number} step
   */
  manageStateSteps(step) {
    this.canExecute = false;
    this._manageStateSteps(step);
  }

  /**
   * Function that allows going to the next step on the defined pipeline.
   */
  goNextStep() {
    this._nextStep();
  }

  /**
    * Receives a step and goes to that step received,
    * uncollapsing it, and collapsing every other step.
    * If the current step hasn't been scrolled, remains unactive.
    * @param {{currentStep, collapsed, active, ...rest}} cellsStep
    */
  goToStep(step) {
    const stepToNavigate = this._steps[step.currentStep];
    if (stepToNavigate) {
      stepToNavigate.collapsed = false;
      this.toggleCollapsedView(stepToNavigate);
      this._activateSteps(stepToNavigate);
    }
  }

  /**
   * Emit event for open veil
   */
  openVeil() {
    this._dispatch('open-control-veil');
  }

  /**
   * Emit event for close veil
   */
  closeVeil() {
    this._dispatch('close-control-veil');
  }

  /**
   * Handles a step back request on the opx process.
   * This function throws a show-close-confirm event in order to show an alert exit message.
   */
  manageBackButton() {
    const detail = {
      code: 'CONFIRM-EXIT-OPERATION-TRANSFERS',
      selectedConfig: {
        className: 'error exit',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'alert-EXIT-INSURANCE-CANCELLATION-accept',
        cancelBtLabel: 'alert-EXIT-INSURANCE-CANCELLATION-cancel',
        template: {
          type: 'paragraphs',
          values: [
            {
              icon: 'coronita:alert',
              class: 'spacing'
            },
            { text: 'alert-EXIT-INSURANCE-CANCELLATION-message' }
          ]
        }
      }
    };

    this._dispatch('show-close-confirm', detail);
  }

  /**
   * Auxiliary function to fire events in a standard way
   *
   * @param {String} eventName
   * @param {Any} detail
   * @param {Boolean} bubbles
   * @param {Boolean} composed
   *
   * @private
   */
  _dispatch(eventName, detail, bubbles = true, composed = true) {
    this.dispatchEvent(new CustomEvent(eventName, {
      detail,
      bubbles,
      composed
    }));
  }

  /**
    * Gets currentStep and resets following ones
    * @param {{currentStep, collapsed, active, ...rest}} cellsStep
    */
  cleanFollowingSteps(detail) {
    if (!this.fromFutura) {
      const componentId = detail ? detail.currentStep : this.currentStep;
      const thisStep = this._steps[this.currentStep];
      if (thisStep) {
        thisStep.scrolled = false;
      }
      this.resetFollowingSteps(componentId);
      if (componentId < this._amountOperationsStepNumber) {
        this._resetEnterAmount();
      }
      this._dispatch('show-reference-concept', {
        hideConceptInput: false,
        inputConcept: ''
      });
    }
  }

  /**
   * Sets properties for enter amount step reset
   */
  _resetEnterAmount() {
    this._dispatch('reset-enter-amount-props', {
      active: false,
      showExchange: false,
      hideCurrencySelectedFlag: true,
      hideHeading: true,
      currencySelectorVisible: false,
      exchangeRatesServiceIsUsed: false,
      showInfoMessage: false,
      setAmount: undefined,
      amount: undefined,
      exchangeRateSelected: {rate: '0'},
      totalAmount: '0.00',
      showMessageBelowAmountCollapsed: false,
      showAmountFilledInfoMessage: false,
      amountInOriginCurrency: 0,
      infoText: '',
      showAlertBeforeUncollapsing: false,
    });
    this.resetTimer();
  }

  /**
   * Reset enter amount step when while showing exchange rates
   */
  _resetExchangeRatesProps() {
    const enterAmountProps = {
      setAmount: undefined,
      amount: undefined,
      exchangeRateSelected: {
        rate: '0'
      },
      totalAmount: '0.00',
      amountInOriginCurrency: 0,
    };
    this._dispatch('reset-enter-amount-props', enterAmountProps);
  }

  /**
   * Sets recipient behaviour when selecting it
   */
  _setRecipientBehaviour() {
    this._dispatch('set-recipient-behaviour', true);
  }

  /**
   * Resets showAlertBeforeUncollapsing so it doesnt show alert modal used in exchangeRates
   */
  resetProductSelectorExchangeRatesProperties() {
    this.resetProductAndRecipientExchangeRatesProperty();
    this._dispatch('set-product-selector-properties', {saved: false});
  }

  /**
   * Resets showAlertBeforeUncollapsing so it doesnt show alert modal used in exchangeRates
   */
  resetProductAndRecipientExchangeRatesProperty() {
    this._exchangeRatesFlag = false;
    this._dispatch('set-disabled-buttons', {
      showAlertBeforeUncollapsing: false,
    });
    this._dispatch('set-product-selector-properties', {
      showAlertBeforeUncollapsing: false,
    });
    this.cleanFollowingSteps({currentStep: 1});
    this._dispatch('set-recipient-selector-properties');
  }

  /**
   * Validates subProductType and account currency to disable or not buttons
   */
  _validateSelectedSenderAccountType(selectedSender) {
    if (selectedSender && this.c(selectedSender, 'productType')) {
      if (this.c(selectedSender, 'subProductType') || this.c(selectedSender, 'primaryAmount.currency') !== 'MXN' || this.c(selectedSender, 'contract')) {
        this._dispatch('transfer-type', 'OWN_TRANSFERS');
        this._setDisabledButtons(true, true);
        this._validatesSubProductTypeIsCreditCard(selectedSender);
      } else {
        this._setDisabledButtons(false, false);
      }
    }
  }

  /**
   * Dispatches event with detail that will enable or disable recipient buttons
   * @param {Boolean} newRecipient
   * @param {Boolean} myContacts
   */
  _setDisabledButtons(newRecipient, myContacts) {
    this._dispatch('set-disabled-buttons', {
      disabledNewRecipient: newRecipient,
      disableMyAccounts: this.disableMyAccounts,
      disableMyContacts: myContacts,
    });
  }

  /**
   * Validates if subProductType equals 'CREDIT_CARD'
   * @param {Object} selectedSender
   */
  _validatesSubProductTypeIsCreditCard(selectedSender) {
    if (this.c(selectedSender, 'subProductType') === 'CREDIT_CARD') {
      this._dispatch('set-properties-enter-amount', {
        infoMessageData: {
          title: this.t('glomo-transfer-generate-own-transfer-info-message'),
        }
      });
    }
  }

  /**
   * Validates if account's balance is greater than 0
   * @param {Object} selectedSender
   */
  validateSenderBalance(selectedSender) {
    if (this.c(selectedSender, 'primaryAmount.amount') > 0) {
      this.goNextStep();
    }
  }

  /**
   * Gets detail from dashboard page and validates its detail
   * @param {Object} detail
   */
  dashboardToTransfers(detail) {
    if (this.c(detail, 'eventDetail')) {
      this.initPage(this.c(detail, 'eventDetail'));
    }
  }

  /**
   * Initializes opx, receiving detail that contains where the flow comes from
   * @param {Object} detail
   */
  initPage(detail) {
    this._prefillingStepsSelectorIds = {
      account: 1,
      receiver: 2,
      amount: 3,
      concept: 4
    };
    if (this.c(detail, 'smartServicingId')) {
      this.initPageFrequentOperation(detail);
    } else {
      if (this.get('continue', detail)) {
        this._dispatch('glomo-opx-transfer-get-client-id');
        this._sendInfoDimo();
        this.dataGoogleAssistant = this.get('data.filter', detail);
        this._firstTimeTimer = true;
        this._entryPoint = detail;
        this._setCurrentStepsAndMaxSteps(this._entryPoint);
        this._dispatch('parse-accounts');
        if (this.get('continue', detail) === 'dashboard') {
          this._dispatch('active-transfer-destination', false);
        }
      }
      this._dispatch('message-boost-interbank-transfers', { className: 'refactor-transfers cells-step-container', infoSecondMessageData: null });
    }
  }

  /**
   * Init page with comeFromExpenses group configuration
   * @param {Object} detail
   */
  initPageFromExpensesGroup(detail) {
    this.initPage(detail);
    this.comeFromExpensesGroup = true;
  }

  /**
   * method that validates if the account is from a competitor, if so, the boost message interbank transfers
   */
  recordSuccess(params) {
    if (params.isCompetitor) {
      const messageBoostInterbankTransfers = {
        className: 'refactor-transfers cells-step-container messagePosition',
        infoSecondMessageData: {
          text: 'glomo-opx-transfer-text-message-boost-interbank-transfers',
          link: 'glomo-opx-transfer-link-message-boost-interbank-transfers'
        }
      };
      this._dispatch('message-boost-interbank-transfers', messageBoostInterbankTransfers);
    } else {
      this._dispatch('message-boost-interbank-transfers', { className: 'refactor-transfers cells-step-container', infoSecondMessageData: null });
    }
  }

  /**
   * Sets current steps according to entry point
   * @param {Object} entryPoint
   */
  _setCurrentStepsAndMaxSteps(entryPoint) {
    const setMaxSteps = this.c(entryPoint, 'continue') === 'account' ? this.baseMaxSteps - 1 : this.baseMaxSteps;
    this._amountOperationsStepNumber = setMaxSteps - 1;
    this._dispatch('set-max-steps', setMaxSteps);
    this._dispatch('set-product-selector-step-properties', {
      currentStep: setMaxSteps - 3,
      firstStep: !(this.c(entryPoint, 'continue') === 'account')
    });
    this._dispatch('set-recipient-selector-step-properties', {
      currentStep: setMaxSteps - 2,
      firstStep: this.c(entryPoint, 'continue') === 'account'
    });
    this._dispatch('set-currency-operations-step-properties', setMaxSteps - 1);
    this._dispatch('set-concept-step-properties', setMaxSteps);
    this._setPrefillingStepsSelectors(entryPoint);
  }

  _setPrefillingStepsSelectors(entryPoint) {
    if (this.c(entryPoint, 'continue') === 'account') {
      this._prefillingStepsSelectorIds = {
        receiver: 1,
        amount: 2,
        concept: 3
      };
    }
  }

  /**
   * Initializes opx to local, receiving detail that contains where the flow comes from
   * @param {object} payload
   */
  initPageLocal(payload) {
    if (!this._detailEntryPoint && this.c(payload, 'nameValuePairs.continue')) {
      this.clientId = this.get('nameValuePairs.clientId', payload);
      this.dimoTransferFeature = this.get('nameValuePairs.dimoTransferFeature', payload);
      this._dispatch('send-client-id-to-dimo', this.clientId);
      this._dispatch('send-dimo-transfer-feature', this.dimoTransferFeature);
      this._sendInfoDimo();
      this._myPhoneNumber = this.get('nameValuePairs.phoneNumber', payload);
      this._firstTimeTimer = true;
      this._entryPoint = this.c(payload, 'nameValuePairs');
      this._setCurrentStepsAndMaxSteps(this._entryPoint);
      this._isLocal = true;
      this._detailEntryPoint = true;
      this._dispatch('parse-local-accounts');
    }
  }

  /**
   * Validate and send title from feature flag
   * @event 'glomo-opx-transfer-set-title
   */
  _sendInfoDimo() {
    const title = this.dimoTransferFeature ? 'glomo-transfer-and-dimo-title-name' : 'glomo-transfer-title-name';
    this._dispatch('glomo-opx-transfer-set-title', title);
  }

  /**
   * Maps accounts and cards and validates their status
   */
  validateProducts() {
    const newAccounts = this._mapProducts(this.globalAccountsParsed);
    const newCards = this._mapProducts(this.globalCardsParsed);
    if (newAccounts && !newCards && newAccounts.length > 0) {
      this.set('_customerProducts', this._validateStatus(newAccounts));
      this._dispatch('set-all-products-list', this._customerProducts);
    } else if (newAccounts && newCards && newAccounts.length > 0 && newCards.length > 0) {
      this.set('_customerProducts', this._validateStatus(newAccounts.concat(newCards)));
      this._dispatch('set-all-products-list', this._customerProducts);
    }
    if (this.c(this.dataGoogleAssistant, 'key') === 'googleAssistant') {
      this._validateAccountAlias();
    }
    this._validateEntryPoint();
    this.canExecute = false;
    this.currentStep = 1;
    this.cleanFollowingSteps();
  }
  /**
  * Maps accounts, cards and equity contracts and validates their status
  */
  validateContracts() {
    const newAccounts = this._mapProducts(this.globalAccountsParsed);
    const newCards = this._mapProducts(this.globalCardsParsed);
    const newContracts = this.globalContractsParsed;
    if (newContracts && newContracts.length > 0) {
      if (newAccounts && !newCards && newAccounts.length > 0) {
        this.set('_customerProducts', this._validateStatus(newAccounts.concat(newContracts)));
      } else if (newAccounts && newCards && newAccounts.length > 0 && newCards.length > 0) {
        this.set('_customerProducts', this._validateStatus(newAccounts.concat(newCards).concat(newContracts)));
      }
      this._dispatch('set-all-products-list', this._customerProducts);
      this._equityFlag = true;
      if (this.c(this.dataGoogleAssistant, 'key') === 'googleAssistant') {
        this._validateAccountAlias();
      }
      this._validateEntryPoint();
      this.canExecute = false;
    }
  }

  /**
   * validate the account alias that comes from the google assistant to fill the first step
   */
  _validateAccountAlias() {
    const alias = this.c(this.dataGoogleAssistant, 'args.0').split('=');
    const textName = this.c(alias, '1', '').toLowerCase().replace(/\s+/g, '');
    const senderBankAccountType = this._customerProducts.find(product =>  textName.includes(this.c(product, 'name', '').toLowerCase().replace(/\s+/g, '')));
    const accountIndicator = this._customerProducts.find(product => this.c(product, 'accountIndicator') === true);
    this._dispatch('set-key-google-assistant', { key: this.c(this.dataGoogleAssistant, 'key', '')});
    if (senderBankAccountType) {
      this._entryPoint = { continue: 'googleAssistant', productId: this.c(senderBankAccountType, 'id')};
    } else if (accountIndicator && senderBankAccountType === undefined) {
      this._entryPoint = { continue: 'googleAssistant', productId: accountIndicator.id};
    } else {
      this._entryPoint = { continue: 'googleAssistant', productId: this.c(this._customerProducts, '0.id')};
    }
  }

  /**
   * validates that the contact exists and matches the one that comes from the google assistant and the amount is obtained to collapse following steps
   */
  saveContacts(contacts) {
    if (!this.fromFutura)  {
      this.set('savedContacts', contacts);
      if (contacts && this.c(this.dataGoogleAssistant, 'key') === 'googleAssistant') {
        const dataDestinatary = this.c(this.dataGoogleAssistant, 'args.1', '').split('=');
        const alias = this.c(dataDestinatary, '1', '').toLowerCase().replace(/\s+/g, '');
        const destinatary = contacts.find(contact =>  alias.includes(this.c(contact, 'alias', '').toLowerCase().replace(/\s+/g, '')));
        if (destinatary) {
          this.set('_savedContactDetail', destinatary);
          this.set('_savedContactDetailAccount', destinatary.products[0]);
          this.onAcceptReviewSectionSavedContact();
          const dataAmount = this.c(this.dataGoogleAssistant, 'args.2').split('=');
          const amount = this.c(dataAmount, '1');
          this._dispatch('send-amount', amount);
          this._dispatch('continue-google-assistant', true);
        }
      }
    }
  }

  /**
   * Maps products and returns a list of mapped products
   * @param {Array} product
   */
  _mapProducts(product) {
    if (product && product.length > 0) {
      const family = {
        CARDS: 'cards',
        ACCOUNTS: 'accounts'
      };
      const mappedList = product.map(item => {
        let newList = {
          'name': this.c(item, 'alias') || this.c(item, 'productTitle'),
          'id': this.c(item, 'accountId'),
          'number': this.c(item, 'number'),
          'imgSrc': this.c(item, 'imgSrc'),
          'productTitle': this.c(item, 'alias'),
          'currencies': [ {
            'currency': this.c(item, 'availableBalance.currentBalances.0.currency'),
            'isMajor': true
          } ],
          'description': {
            'value': this.c(item, 'number'),
            'masked': true
          },
          'disabled': false,
          'family': family[this.c(item, '_type')],
          'holds': [],
          'primaryAmount': {
            'amount': this.c(item, 'availableBalance.currentBalances.0.amount'),
            'currency': this.c(item, 'availableBalance.currentBalances.0.currency'),
            'label': this.t('glomo-transfer-parsed-products-primary-amount-label')
          },
          'productType': this.c(item, '_family'),
          'numberType': {
            'id': this.c(item, 'numberType.id'),
            'name': this.c(item, 'numberType.name')
          },
          'contractType': {
            'id': this.c(item, 'contractType.id'),
            'name': this.c(item, 'contractType.name')
          },
          'status': this.c(item, 'status'),
          'subProductType': this.c(item, 'subProductType'),
          'accountIndicator': this.c(item, 'accountIndicator')
        };
        newList.infoMessage = this.c(item, 'subProductType') === 'CREDIT_CARD' ? this.t('glomo-transfer-generate-own-transfer-credit-card-message') :
          this.c(newList, 'primaryAmount.currency') !== 'MXN' ? this.t('glomo-transfer-generate-own-transfer-foreign-currency-message') : '';

        newList.primaryAmount = this.c(this._entryPoint, 'product.id') === this.c(newList, 'id') ? this.c(this._entryPoint, 'product.primaryAmount') : newList.primaryAmount;

        return newList;
      });
      return mappedList;
    }
  }

  /**
   * Validates account entry point
   */
  _validateEntryPoint() {
    this._dispatch('set-entry-point', this.c(this._entryPoint, 'continue'));
    if (this.get('continue', this._entryPoint) === 'account' || this.get('continue', this._entryPoint) === 'googleAssistant' || this.get('continue', this._entryPoint) === 'equity') {
      this._getProductSelected(this._entryPoint);
    }
  }

  /**
   * Gets product that matches productId
   */
  _getProductSelected(detail) {
    if (detail && this.c(detail, 'productId')) {
      this._dispatch('change-class-backgroud', {
        fixed: true,
      });
      this._detailEntryPoint = this._isLocal ? true : false;
      const productSelected = this._customerProducts.find(product => this.c(product, 'id') === this.c(detail, 'productId'));
      this.set('senderProductDetail', productSelected);
      this._dispatch('set-all-products-list', [ this.senderProductDetail ]);
      this._dispatch('sender-selected-from-product-detail', this.senderProductDetail);
    }
  }

  /**
   * Receives data of selected sender account
   * @param {Object} detail
   */
  _onSenderSelected(detail = {}) {
    if (detail && this.c(detail, 'id')) {
      this.set('_selectedSender', detail);
      this._filteredMovements = [];
      if (this._featureFlagReuseOperationList) {
        this.reuseOperationListMapFinancial(detail);
        this.fisrtClickDone = false;
        this._numberOfOperationsReuse = 0;
      }
      this.set('_selectedSender', detail);
      this._originCurrency = this.c(this._selectedSender, 'primaryAmount.currency');
      this._dispatch('set-origin-currency', this._originCurrency);
      this._getProductDetail(this._selectedSender);
      this._validateSelectedSenderAccountType(this._selectedSender);
      const productsWithoutFilterCondition = this._setProductsWithoutFilterCondition();
      this.set('_filterProductDetail', this._validateStatusActive(productsWithoutFilterCondition));
      this._dispatch('selected-sender-data', this._selectedSender);
      this._dispatch('set-accounts-list', this._filterProductDetail);
      this.goNextStep();
    }
  }

  /**
   * Validates if products should be enabled
   * @param {Array} productsList
   */
  _validateStatusActive(productsList) {
    if (productsList && productsList.length > 0) {
      const filterProducts = productsList.map(product => {
        product.disabled = this.fromFutura ? this._checkProductBalance(product) : false;
        product.hasTextMessage = product.primaryAmount.amount <= 0;
        return product;
      });
      return filterProducts;
    }
  }

  /**
   * Validate if product is selectable
   * @param {Object} rawProduct
   */
  _checkProductBalance(rawProduct) {
    return this.c(rawProduct, 'primaryAmount.amount', 0) <= this.c(this.jsonFutura, 'amount', 0);
  }

  /**
   * Recalculate valid products to be selected
   * @param {Object} newAmount
   */
  recalculateFuturaProductsBalances(newAmount) {
    if (this.fromFutura) {
      this.jsonFutura.amount = this.c(newAmount, 'amount.amount');
      const productsWithoutFilterCondition = this._setProductsWithoutFilterCondition();
      this.set('_filterProductDetail', this._validateStatusActive(productsWithoutFilterCondition));
      this._dispatch('set-accounts-list', this._filterProductDetail);
    }
  }

  /**
   * Gets a list of user's products if equity flag is active
   */
  _setProductsWithoutFilterCondition() {
    if (this._equityFlag && this.principalAccount) {
      return this._setProductsWithoutEquityCondition();
    } else {
      return this._setProductsWithoutValidation();
    }
  }
  /**
   * Gets a list of user's products without selected product and validates if more products need to be filtered
   */
  _setProductsWithoutValidation() {
    const productsWithoutSenderProduct = this._customerProducts.filter(product => product.id !== this.c(this._selectedSender, 'id'));
    const productsWithoutFilterCondition = this.c(this._selectedSender, 'primaryAmount.currency') !== 'MXN' ? productsWithoutSenderProduct.filter(product => product.subProductType !== 'CREDIT_CARD') :
      this.c(this._selectedSender, 'subProductType')  === 'CREDIT_CARD' ? productsWithoutSenderProduct.filter(product => product.primaryAmount.currency === 'MXN' && product.subProductType !== 'CREDIT_CARD') : productsWithoutSenderProduct;
    return productsWithoutFilterCondition;
  }
  /**
   * Gets a list of user's products without selected product and validates if select a contract or principal account
   */
  _setProductsWithoutEquityCondition() {
    const idPrincipalAccount = Array.isArray(this.principalAccount) ? this.principalAccount.map(item => item.accountId).toString() : '';
    if (this.c(this._selectedSender, 'contract')) {
      const onlyPrincipalAccount = this._customerProducts.filter(product => product.id === idPrincipalAccount);
      return onlyPrincipalAccount;
    } else {
      const productsWithoutValidation = this._setProductsWithoutValidation();
      return productsWithoutValidation;
    }
  }

  /**
   * Receives selected product data and set properties to foreign currency operation
   * @param {Object} data
   */
  _getProductDetail(data) {
    if (this.c(data, 'primaryAmount')) {
      this._dispatch('set-properties-enter-amount', {
        maxProduct: this.c(data, 'primaryAmount.amount'),
        currencySelected: this._originCurrencySelected,
        notEnoughBalanceAfterKey: '',
      });
    }
  }

  /**
   * Gets originCurrency and returns object depending on it
   * @param {String} originCurrency
   */
  _setOriginCurrencySelected(originCurrency) {
    if (originCurrency) {
      const originCurrencyObject = {
        USD: {
          id: 'USD',
          name: this.t('glomo-transfer-origin-exchange-rates-name-USD'),
          labelImg: {
            alt: this.t('glomo-transfer-origin-exchange-rates-name-USD'),
            src: this.c(this.currencyImagePath, 'USD')
          }
        },
        MXN: {
          id: 'MXN',
          name: this.t('glomo-transfer-origin-exchange-rates-name-MXN'),
          labelImg: {
            alt: this.t('glomo-transfer-origin-exchange-rates-name-MXN'),
            src: this.c(this.currencyImagePath, 'MXN')
          }
        },
        EUR: {
          id: 'EUR',
          name: this.t('glomo-transfer-origin-exchange-rates-name-EUR'),
          labelImg: {
            alt: this.t('glomo-transfer-origin-exchange-rates-name-EUR'),
            src: this.c(this.currencyImagePath, 'EUR')
          }
        },
      };
      return (originCurrencyObject[originCurrency] || originCurrencyObject.MXN);
    }
  }

  /**
   * Receives receiver information and sets values depending on it
   * @param {Object} detail
   */
  onSenderReceiver(detail = {}) {
    if (this.c(detail, 'id')) {
      this.set('_selectedReceiver', detail);
      this._receiverSubProductType = this.c(detail, 'subProductType');
      this._foreignCurrency = this.c(this._selectedReceiver, 'primaryAmount.currency');
      this._dispatch('set-foreign-currency', this._foreignCurrency);
      this._validateExchangeRatesSection();
      this._transferType = 'OWN_TRANSFERS';
      const conceptLabel = this._isConceptFilled || 'glomo-transfer-generate-internal-optional-concept-label';
      this._setReferenceConceptValues(false, false, conceptLabel);
      this._dispatch('own-transfers-type', this._transferType);
      this._dispatch('transfer-type', this._transferType);
      this._dispatch('set-contact-detail', {});
      this._dispatch('set-selected-receiver', this._selectedReceiver);
    }
  }

  /**
   * Validates if product has enough balance
   * @param {Array} productsList
   */
  _validateStatus(productsList) {
    const filterProducts = productsList.map(product => {
      product.disabled = product.primaryAmount.amount <= 0;
      product.hasTextMessage = product.primaryAmount.amount <= 0;
      return product;
    });
    return filterProducts;
  }

  /**
   * Method that sets properties to foreign currency operationif exchangeRates is being used
   */
  _validateExchangeRatesSection() {
    this._exchangeRatesFlag =  this.c(this._selectedSender, 'primaryAmount.currency') !== this.c(this._selectedReceiver, 'primaryAmount.currency');
    this._dispatch('set-exchange-rates-flag', this._exchangeRatesFlag);
    if (this._exchangeRatesFlag) {
      this._dispatch('set-properties-enter-amount', {
        originCurrency: this.c(this._selectedSender, 'primaryAmount.currency'),
        exchangeRatesServiceIsUsed: true,
        infoText: this.t('glomo-transfer-validate-exchange-rates-section-info-text'),
        customCurrencySelectTitle: this.t('glomo-transfer-validate-exchange-rates-section-select-title'),
        showExchange: true,
        totalHeader: this.t('glomo-transfer-validate-exchange-rates-section-total-header'),
        countryFlag: this.c(this._destinationCurrencySelected, 'labelImg.src'),
        totalCurrency: this.c(this._destinationCurrencySelected, 'id'),
        customFirstCurrency: 'USD',
        customSecondCurrency: 'MXN',
        hasCountryCurrencyLabel: true,
        localCurrencyIsDifferentThanEquivalenceCurrencies: true,
        showIconButtonInExchangeRatesSection: true,
        hideOriginFlagImage: false,
        minValuesByCurrency: {
          USD: 1
        },
        hideHeading: false,
        showInfoMessage: true,
        hideCurrencySelectedFlag: false,
        infoMessageData: {
          title: this.t('glomo-transfer-validate-exchange-rates-section-info-message-data'),
        },
        currencySelectorVisible: true,
        currencySelectDisabled: true,
        showAlertBeforeUncollapsing: true,
      }
      );
      this._dispatch('set-disabled-buttons', {
        showAlertBeforeUncollapsing: true,
      });
      this._dispatch('set-product-selector-properties', {
        showAlertBeforeUncollapsing: true,
      });
      this._dispatch('set-properties-to-foreign-currency');
    }
  }

  /**
   * Method that gets information needed in exchangeRates depending on foreignCurrency
   * @param {String} foreignCurrency
   */
  _setDestinationCurrencySelected(foreignCurrency) {
    if (foreignCurrency) {
      const destinationCurrency = {
        USD: {
          id: 'USD',
          name: this.t('glomo-transfer-destination-exchange-rates-name-USD'),
          description: this.t('glomo-step-foreign-currency-import-in-usd'),
          labelImg: {
            alt: this.t('glomo-transfer-destination-exchange-rates-name-USD'),
            src: this.c(this.currencyImagePath, 'USD')
          }
        },
        MXN: {
          id: 'MXN',
          name: this.t('glomo-transfer-destination-exchange-rates-name-MXN'),
          description: this.t('glomo-step-foreign-currency-import-in-mxn'),
          labelImg: {
            alt: this.t('glomo-transfer-destination-exchange-rates-name-MXN'),
            src: this.c(this.currencyImagePath, 'MXN')
          }
        },
        EUR: {
          id: 'EUR',
          name: this.t('glomo-transfer-destination-exchange-rates-name-EUR'),
          labelImg: {
            alt: this.t('glomo-transfer-destination-exchange-rates-name-EUR'),
            src: this.c(this.currencyImagePath, 'EUR')
          }
        },
      };
      return (destinationCurrency[foreignCurrency] || destinationCurrency.USD);
    }
  }

  /**
   * Sets concept properties to false
   */
  _setReferenceConceptValues(isRequired, showReference, labelValue) {
    this._dispatch('show-reference-concept', {
      isRequired: isRequired,
      showReference: showReference,
      conceptLabel: this.t(labelValue),
      maxLength: showReference ? 40 : 20,
      referenceName: this.t('glomo-transfer-generate-interbank-transfer-response-top-info-1-key')
    });
  }

  /**
   * Sets properties for new destinatary (recipient-selector)
   */
  setPropertiesNewRecipient() {
    this._dispatch('set-properties-new-recipient-selector', {
      headerTitle: this.t('glomo-transfer-new-recipient-header-title'),
      inputDescription: this.t('glomo-transfer-search-by-option-1-input-description'),
      inputLabel: this.t('glomo-transfer-search-by-option-1-input-label'),
      infoMessage: this.t('glomo-transfer-search-by-option-1-info-message'),
      infoMessageType: 'info-dark-blue',
      reviewSectionAccountTypeOptions: false,
      hideOwnershipInReviewSection: true,
      inputProperties: {
        required: true,
        maxLength: 40,
        allowedChars: '[0-9]',
        allowedValue: '^(?:[0-9]{10}|[0-9]{15,16}|[0-9]{18}|[0-9]{20})$',
        autoValidate: true,
        inputMode: 'decimal'
      },
    }
    );
  }

  /**
   * Validates input value and sets error mesage when searching for new recipient
   * @param {String} newV
   */
  errorMessageChange(newV) {
    const errorCases = [
      {
        regex: '^[0-9]{1,9}$',
        errorMessage: this.t('glomo-transfer-phone-error-message'),
        invalidInput: true
      },
      {
        regex: '^[0-9]{11,14}$',
        errorMessage: this.t('glomo-transfer-card-error-message'),
        invalidInput: true
      },
      {
        regex: '^[0-9]{17}$',
        errorMessage: this.t('glomo-transfer-clabe-error-message'),
        invalidInput: true
      },
      {
        regex: '^[0-9]{19}$',
        errorMessage: this.t('glomo-transfer-account-bbva-error-message'),
        invalidInput: true
      }
    ];
    errorCases.forEach(errorCase => {
      const currentRegex = new RegExp(errorCase.regex);
      if (currentRegex.test(newV)) {
        this._dispatch('error-message-change-value', errorCase.errorMessage);
        this._dispatch('error-message-invalid-input', errorCase.invalidInput);
      }
    });
  }

  /**
   * Receives new destinatary account number
   * @param {Object} detail
   */
  getReceivers(detail) {
    if (this.c(detail, 'inputValue')) {
      this._recipientInputValue = this.c(detail, 'inputValue');
      this._dispatch('dispatch-receivers-service', this._recipientInputValue);
    }
  }

  /**
   * @desc Once time response decrypted set values to destination properties
   * @param {String} response BANXICO contact with pipes
   */
  parseClabeAccountBanxico(response) {
    let [recipientName, type, clabe, spei] = response.split('|');

    const contactsAvatarItems = [
      {
        recipientId: 'dimo-enrollment',
        recipientPriorityName: recipientName,
        priorityAvatarItemList: [
          { description: this._recipientInputValue },
          { description: this.t('codicel-consent-product') }
        ]
      }
    ];
    if (Object.keys(this._savedContactDetail).length !== 0) {
      contactsAvatarItems.push({
        recipientId: 'saved-contact',
        recipientPriorityName: this.get('person.firstName', this._savedContactDetail),
        priorityAvatarItemList: [
          { description: this.get('number', this._savedContactDetailAccount) },
          { description: this.get('bank.name', this._savedContactDetailAccount) }
        ]
      });
    }

    const payload = {
      showDestinaryAlreadySaved: false,
      showPriorityDestinary: true,
      contactsAvatarItemList: contactsAvatarItems,
    };
    this._isEnrollmentDimo = true;
    this._banxicoResponse = response;
    this._contactDimo = {
      recipientName,
      clabe,
      spei,
      phoneNumber: this._recipientInputValue
    };
    this.closeVeil();
    this._dispatch('set-alias-properties', payload);
  }

  /**
   * Validates if receiver's number is in savedContacts
   */
  validateReceiverNumberIsInSavedContacts(response) {
    if (this.c(response, 'bank')) {
      let exitFlag = true;
      const bankIdBBVA = '0012';
      this.set('_responseReceivers', response);
      if (this.fromFutura) {
        if (this._responseReceivers.bank.id === bankIdBBVA) {
          this.frequentOperationInternal();
        } else {
          this._responseReceivers.number = this.jsonFutura.receiverNumber;
          this.frequentOperationInterbank();
        }
      }
      if (this._fromReuseOperationList) {
        this._reuseOpListReceiversResponse = response;
        if (this._responseReceivers.bank.id === bankIdBBVA || this.c(this._isReuseOperationSavedContactNumber, 'products.0.bank.id', '') === bankIdBBVA) {
          if (this._featureFlagReuseOperationListAnalytics) {
            this._dispatch('reuse-operation-list-analytics-on-click-start', {
              reuseTransferType: 'internal',
              isModalItem: this.operationsListAnalyticsFromModalSelected,
              ...this._reuseOperationListSelectedDetailMovement
            });
          }
          this._reuseOperationInternal();
        } else {
          if (this._featureFlagReuseOperationListAnalytics) {
            this._dispatch('reuse-operation-list-analytics-on-click-start', {
              reuseTransferType: 'interbank',
              isModalItem: this.operationsListAnalyticsFromModalSelected,
              ...this._reuseOperationListSelectedDetailMovement
            });
          }
          this._responseReceivers.number = response.number;
          this._reuseOperationInterbank();
        }
      }
      this._receiverSubProductType = this.c(response, 'specificProductType.id');
      if (!this.savedContacts) {
        this._mapResponseReceivers(this._responseReceivers);
      } else {
        this.savedContacts.every(el => {
          if (this.c(el, 'products')) {
            this.c(el, 'products').forEach(product => {
              if (this.c(product, 'number') === this.c(this._responseReceivers, 'number', this._recipientInputValue)) {
                exitFlag = false;
                this.set('_savedContactDetail', el);
                this.set('_savedContactDetailAccount', product);
              }
            });
          }

          return exitFlag;
        });
        this._getRecipientInputValueReceivers(exitFlag);
      }
    }
  }


  /**
   * Validates if product is a credit card, is between hours and is not from bbva
   * @param {Object} product
   */
  _validateCreditCardSchedule(product) {
    const localhour = moment();
    const outOfHours = localhour.hour() < this.openingHour || localhour.hour() >= this.closingHour && localhour.minutes() > this.closingMinutes;
    const isSpecificProductTypeCreditCard = this.c(product, 'specificProductType.id') === 'CREDIT_CARD';
    const isBankAccountDifferentThanBbva = this.c(product, 'bank.id') !== '0012';
    return outOfHours && isSpecificProductTypeCreditCard && isBankAccountDifferentThanBbva;
  }

  /**
   * Sets properties to out of schedule alert
   **/
  _setOutOfScheduleAlert() {
    this.closeVeil();
    this._dispatch('show-close-confirm', {
      code: 'OUT-OF-SCHEDULE',
      primaryButtonClass: 'secondary',
      selectedConfig: {
        className: '',
        openMaximized: true,
        heroImage: this.errorAlertImagePath,
        title: this.t('glomo-transfer-new-recipient-header-title'),
        message: this.t('glomo-transfer-out-of-schedule-message'),
        acceptBtLabel: this.t('glomo-transfer-step-recipient-selector-change-recipient-button-label'),
        cancelBtLabel: this.t('glomo-transfer-generate-interbank-transfer-response-buttons-text'),
        template: {
          type: 'paragraphs',
          values: [
            { text: this.t('glomo-transfer-out-of-schedule-text') }
          ]
        }
      }
    });
  }

  /**
   * If true dispatches event to service, else, calls _setPropertiesReviewModal
   * @param {Boolean} exitFlag
   */
  _getRecipientInputValueReceivers(exitFlag) {
    if (exitFlag) {
      this._mapResponseReceivers(this._responseReceivers);
    } else {
      const isCreditCardAvailableForTransfer = this._validateCreditCardSchedule(this._savedContactDetailAccount);
      if (isCreditCardAvailableForTransfer) {
        this._setOutOfScheduleAlert();
      } else {
        this._setPropertiesReviewModal();
      }
    }
  }

  /**
   * Sets properties for modal that appears when destinatary is already in savedContacts
   */
  _setPropertiesReviewModal() {
    const payload = {displayNumber: null};
    const componentProps = {
      hideRecipientInfo: true,
      showDestinaryAlreadySaved: true,
      flagCanContinueSavedContact: true,
      recipientName: this.c(this._savedContactDetail, 'alias'),
      avatarItemList: [
        { description: this.c(this._savedContactDetail, 'person.firstName')},
        { description: this.c(this._savedContactDetailAccount, 'number')},
        { description: this.c(this._savedContactDetailAccount, 'bank.name')},
      ],
      showInputPrimary: false,
      showCheckboxBtn: false,
      showInputSecondary: false,
    };
    if (this.dimoTransferFeature && this._phoneFilter(this._recipientInputValue)) {
      this.openVeil();
    } else {
      this.closeVeil();
    }
    this._dispatch('set-alias-properties', componentProps);
    this._dispatch('set-review-mode', payload);
  }

  /**
   * Validates receivers response
   * @param {Object} responseReceivers
   */
  _mapResponseReceivers(responseReceivers) {
    const isCreditCardAvailableForTransfer = this._validateCreditCardSchedule(responseReceivers);
    if (isCreditCardAvailableForTransfer) {
      this._setOutOfScheduleAlert();
    } else {
      const { bank, person } = this._responseReceivers;
      this._validateOtherProperties(this._responseReceivers);
      this._selectedNumberTitle(this._recipientInputValue);
      const number = this.c(bank, 'id') === '0012' && this.c(this._responseReceivers, 'number') ? this.c(this._responseReceivers, 'number') : this._recipientInputValue;
      const slicedNumber = number.length === 20 ? number.slice(-10) : number;
      let payload = {displayNumber: slicedNumber};
      let componentProps = this._setComponentProps();
      this._setComponentPropsFirstName(componentProps, payload, person);
      this._setComponentPropsBank(componentProps, payload, bank);
      this._dispatch('set-alias-properties', componentProps);
      this._dispatch('set-review-mode', payload);
    }
    this._numbersGetRecords = this._recipientInputValue;
    this._validationParamsOnMessageInterbank();
    if (this.dimoTransferFeature && !this._phoneFilter(this._recipientInputValue)) {
      this.closeVeil();
    }
  }

  /**
   * @desc Phone filter if have these features
   * @param {Object} phone
   * @return boolean
   */
  _phoneFilter(phone) {
    const phonePrefix = (phone.startsWith(this.validatePhone.startExt)) ? this._removePrefix(phone) : phone;
    const cleanPhone = phonePrefix.replace(/[^0-9]/g, '');
    return cleanPhone.length === this.validatePhone.length && !cleanPhone.startsWith(this.validatePhone.start);
  }

  /**
   * @desc Filter only last 10 position on the phone when starts with +52
   * @param {String} phone to filter
   * @returns Phone formatted
   */
  _removePrefix(phone) {
    return phone.replace(/[^0-9]/g, '').slice(-this.validatePhone.length);
  }

  /**
   * Validates if bank has id and sets props depending on it
   * @param {Object} componentProps
   * @param {Object} payload
   * @param {Object} bank
   */
  _setComponentPropsBank(componentProps, payload, bank) {
    if (this.c(bank, 'id')) {
      this._setBankHasIdProps(componentProps, payload, bank);
    } else {
      this._setBankDoesNotHaveIdProps(componentProps, payload);
    }
  }

  /**
   * Sets componentProps body and payload body when bank does not have id
   * @param {Object} componentProps
   * @param {Object} payload
   */
  _setBankDoesNotHaveIdProps(componentProps, payload) {
    componentProps.reviewMessageType = 'info-dark';
    componentProps.reviewMessageIcon = 'coronita:info';
    componentProps.reviewSectionTitle = 'glomo-transfer-review-section-destinatary-no-identified';
    componentProps.reviewModalSelectorsOptionsTitle = null;
    componentProps.showDestinaryAlreadySaved = false;
    this.optionsSelector = [ { title: this.t('glomo-transfer-bank-entity'), id: 'bankEntity' } ];
    if (this._responseReceivers?.productType?.id === 'CARD') {
      this.optionsSelector.push({ title: this.t('cells-product-more-info-product-title'), id: 'productType' });
    }
    componentProps.reviewSectionModalSelectors = this.optionsSelector;
    payload.displayNumber = this._recipientInputValue;
  }

  /**
   * Dispatch an event depending on the item selected for selectors
   * @param {Object} item
   */
  handleItemSelected(item = {}) {
    const items = {
      'bankEntity': () => {
        this._dispatch('open-modal-selector-bank');
      },
      'productType': () => {
        this._dispatch('open-modal-selector-product-type');
      }
    };
    if (items[item.id]) {
      items[item.id]();
    }
  }

  /**
   * Sets componentProps body and payload body when bank has id
   * @param {Object} componentProps
   * @param {Object} payload
   * @param {Object} bank
   */
  _setBankHasIdProps(componentProps, payload, bank) {
    componentProps.idBank = this.c(this._responseReceivers, 'bank.id');
    componentProps.showDestinaryAlreadySaved = false;
    payload.bank = bank;
    payload.accountCurrencyType = {
      title: 'glomo-transfer-banking-entity',
      name: this.c(bank, 'name')
    };
  }

  /**
   * Sets componentProps body and payload body depending on person
   * @param {Object} componentProps
   * @param {Object} payload
   * @param {Object} person
   */
  _setComponentPropsFirstName(componentProps, payload, person) {
    if (this.c(person, 'firstName')) {
      this._setPersonHasFirstNameProps(componentProps, payload);
      this._dispatch('huella-new-account-confirmed');
    } else {
      this._setPersonDoesNotHaveFirstNameProps(componentProps);
    }
  }

  /**
   * Sets componentProps body when person does not have first name
   * @param {Object} componentProps
   */
  _setPersonDoesNotHaveFirstNameProps(componentProps) {
    componentProps.reviewMessageType = 'info-dark';
    componentProps.reviewMessageIcon = 'coronita:info';
    componentProps.reviewSectionTitle = 'glomo-transfer-review-section-destinatary-no-identified-data';
    componentProps.showInputPrimary = true;
  }

  /**
   * Sets componentProps body when person has first name
   * @param {Object} componentProps
   * @param {Object} payload
   */
  _setPersonHasFirstNameProps(componentProps, payload) {
    componentProps.reviewMessageType = 'success';
    componentProps.reviewMessageIcon = 'coronita:correct';
    componentProps.reviewSectionTitle = 'glomo-transfer-review-section-destinatary-identified';
    componentProps.reviewSectionBeneficiaryNameTitle = 'glomo-transfer-review-section-beneficiary-name-title';
    componentProps.reviewSectionBeneficiaryIdTitle = this.t('glomo-transfer-review-section-beneficiary-id-title');
    componentProps.showInputPrimary = false;
    componentProps.showDestinaryAlreadySaved = false;
    payload.name = this.c(this._responseReceivers, 'name');
    payload.personIdentityDocument = {
      documentNumber: this.t('glomo-transfer-on-get-receiver-document-number')
    };
  }

  /**
   * Sets componentProps default body
   */
  _setComponentProps() {
    return {
      inputValue: '',
      showCheckboxBtn: true,
      showInputSecondary: true,
      reviewSectionAccountNumberTitle: this._accountTitle,
      reviewSectionAccountTypeOptionsTitle: null,
      flagCanContinueSavedContact: false,
      aliasInputValueMaxLength: '10',
      checkboxButton: false,
      disableInputSecondary: true,
      hideRecipientInfo: false
    };
  }

  /**
   * Validates transfer id to define if transfer type is internal or interebank
   * @param {Object} detail
   */
  _validateOtherProperties(detail) {
    this._transferType = this.c(detail, 'bank.id') === '0012' ? 'INTERNAL_TRANSFERS' : 'INTERBANK_TRANSFERS';
    this._dispatch('transfer-type', this._transferType);
    this._dispatch('active-icon-message', { showSecondaryInfoMessage: false});
    this._validateReferenceConceptValues(this._transferType);
  }

  /**
   * Validates if transferType is internal or interbank
   */
  _validateReferenceConceptValues(transferType) {
    if (transferType === 'INTERNAL_TRANSFERS') {
      this._setReferenceConceptValues(false, false, 'glomo-transfer-generate-internal-optional-concept-label');
    } else {
      this._setReferenceConceptValues(true, true, 'glomo-transfer-generate-interbank-transfer-response-parse-data-top-info-0-key');
    }
  }

  /**
   * Receives receiver's number and sets title depending on recipientNumber length
   * @param {Number} recipientNumber
   */
  _selectedNumberTitle(recipientNumber) {
    if (recipientNumber) {
      const accountNumberTitle = {
        10: this.t('glomo-transfer-title-account-number-title-phone'),
        15: this.t('glomo-transfer-title-account-number-title-card'),
        16: this.t('glomo-transfer-title-account-number-title-card'),
        18: this.t('glomo-transfer-title-account-number-title-clabe'),
        20: this.t('glomo-transfer-title-account-number-title-account')
      };
      this._accountTitle = accountNumberTitle[recipientNumber.length];
    }
  }

  /**
   * Receives information from review section and checks if customr is enrollment to Dimo then send info to Codicel flow
   * @param {Object} detail
   */
  onClickContinueReviewSection(detail) {
    if (this.c(detail, 'displayNumber')) {
      this.set('_contactDetail', detail);
      if (!this._fromReuseOperationList) {
        this.set('_contactDetail.displayNumber', this._responseReceivers.number);
      }
      const product = this._setProductProps(detail);
      this._receiversHasSpecificProductType();
      this._bankIdIsNotTwelve(detail, product);
      this._setAccountCurrencyType(detail);
      this.set('_contactDetail.products', [ product ]);
      this.set('_contactDetail.person', {
        firstName: this.c(detail, 'name')
      });
      this._dispatch('set-selected-receiver', {});
      this._dispatch('set-contact-detail', this._contactDetail);
      this._isContactBeingSaved(this._contactDetail);
    }
  }

  /**
   * Validates if user wants to save the contact
   * @param {Object} contact
   */
  _isContactBeingSaved(contact) {
    if (this.c(contact, 'disableInputSecondary')) {
      delete contact.alias;
      this._mapReceiverData(contact);
      if (!this.fromFutura && !this._fromReuseOperationList) {
        this._dispatch('dispatch-send-email-service', this._contactDetail);
      }
    } else {
      this._checkIfAliasIsInSavedContacts();
    }
  }

  /**
   * Validates if alias and name in _contactDetail are in savedContacts
   */
  _checkAlias() {
    let aliasAndNameAreNotInSavedContacts;
    if (!this.savedContacts) {
      aliasAndNameAreNotInSavedContacts = true;
    } else {
      this.savedContacts.every(el => {
        if (this._isContactInSavedContacts(el)) {
          this.set('_savedContactDetail', el);
          this._dispatch('set-saved-contact-detail', this._savedContactDetail);
          aliasAndNameAreNotInSavedContacts = false;
          return false;
        } else {
          aliasAndNameAreNotInSavedContacts = true;
          return true;
        }
      });
    }
    return aliasAndNameAreNotInSavedContacts;
  }

  /**
   * Validates if el's alias and name match with contactDetail data
   */
  _isContactInSavedContacts(el) {
    return this.c(el, 'alias') === this.c(this._contactDetail, 'alias');
  }

  /**
   * Method that checks if alias and name are already in saved contacts
   */
  _checkIfAliasIsInSavedContacts() {
    const isNotInSavedContacts = this._checkAlias();
    if (isNotInSavedContacts) {
      this._dispatch('dispatch-save-contact-service', this._contactDetail);
    } else {
      this._setAliasInUseModal();
    }
  }

  /**
   * Sets properties to alias in use modal
   */
  _setAliasInUseModal() {
    let listOfBanks = [
      {
        title: this.t('glomo-transfer-alias-in-use-modal')
      },
      {
        title: this.c(this._contactDetail, 'alias'),
        class: 'titleBold'
      },
      {
        description: this.c(this._savedContactDetail, 'person.firstName'),
        class: 'descriptionColor'
      },
    ];
    this._setSavedContactAccountsAndBanks(listOfBanks);
    this._setAliasInUseModalProperties(listOfBanks);
  }

  /**
   * Sets properties for alias in use modal
   */
  _setAliasInUseModalProperties(listOfBanks) {
    this._dispatch('show-alias-in-use-alert', {
      code: 'alias-in-use',
      selectedConfig: {
        className: '',
        hideCloseIcon: false,
        openMaximized: true,
        title: this.t('glomo-transfer-alias-in-use-modal-title'),
        heroImage: this.errorAlertImagePath,
        message: this.t('glomo-transfer-alias-in-use-modal-message'),
        acceptBtLabel: this.t('glomo-transfer-alias-in-use-modal-accept'),
        cancelBtLabel: this.t('glomo-transfer-alias-in-use-modal-cancel'),
        showAvatar: true,
        template: {
          type: 'paragraphs',
          values: [ {
            text: this.t('glomo-alert-transfer-alias-in-use')
          } ]
        },
        avatarItemList: listOfBanks,
      }
    });
  }

  /**
   * Adds banks and accounts to listOfBanks
   * @param {Array} listOfBanks
   */
  _setSavedContactAccountsAndBanks(listOfBanks) {

    if (this.c(this._savedContactDetail, 'products')) {
      let temporaryBankDetail = {};
      for (let i = 0; i < this._savedContactDetail.products.length; i++) {
        temporaryBankDetail = {
          description: this.c(this._savedContactDetail, `products.${i}.number`),
          class: 'descriptionColor'
        };
        listOfBanks.push(temporaryBankDetail);

        temporaryBankDetail = {
          description: this.c(this._savedContactDetail, `products.${i}.bank.name`),
          class: 'descriptionColor'
        };
        listOfBanks.push(temporaryBankDetail);
      }
    }
  }

  /**
   * Method used for mapping data in recipient selector
   * @param {Object} contact
   */
  _mapReceiverData(contact) {
    if (this.c(contact, 'name')) {
      let savedContactMessage;
      let date = {
        avatar: true,
        name: this.c(contact, 'name'),
        listItems: [
          {
            description: this.c(contact, 'displayNumber')
          },
          {
            description: this.c(contact, 'bank.name')
          }
        ]
      };
      if (this.c(contact, 'alias')) {
        date.name = this.c(contact, 'alias');
        date.saving = true;
        date.listItems = Object.assign([ {} ], date.listItems, [
          {
            description: this.c(contact, 'name')
          },
          {
            description: this.c(contact, 'number')
          },
          {
            description: this.c(contact, 'bank.name')
          }
        ]);
      }
      savedContactMessage = this.c(contact, 'savedContact') ? 'glomo-transfer-recipient-selector-saved-contact' : null;
      savedContactMessage = savedContactMessage ? savedContactMessage : this.c(contact, 'savedProduct') ? 'glomo-transfer-recipient-selector-contact-updated' : null;
      this._setSavedContactMessageProps(savedContactMessage, date);
      this._setRecipientBehaviour();
      this.onContactChange();
      this._dispatch('internal-and-interbank-transfers-type', this._transferType);
      this._dispatch('close-save-alias-modal');
    }
  }

  /**
   * Update concept when contact changes
   */
  onContactChange() {
    if (this._isContactChanged && this._transferType === 'INTERNAL_TRANSFERS') {
      let updateConcept = this._isConceptFilled ? this._isConceptFilled : '';
      this.getConcept({ concept: updateConcept });
    }
    this._isContactChanged = true;
  }

  /**
   * Validates if savedContactMessage has value
   * @param {String} savedContactMessage
   * @param {Object} date
   */
  _setSavedContactMessageProps(savedContactMessage, date) {
    if (savedContactMessage) {
      this._dispatch('set-disabled-buttons', {
        registeredOperationShown: true,
        recipientSelected: date,
        filledIconMessageType: 'info-light',
        filledIconMessageIcon: 'coronita:correct',
        filledIconMessageMessage: savedContactMessage,
        filledClassIconMessage: 'filled-step-message',
        saved: false
      });
    } else {
      this._dispatch('set-disabled-buttons', {
        recipientSelected: date,
        registeredOperationShown: false,
        saved: false
      });
    }
  }

  /**
   * Sets accountCurrencyType
   * @param {Object} detail
   */
  _setAccountCurrencyType(detail) {
    this.set('_contactDetail', Object.assign({}, this._contactDetail, {
      accountCurrencyType: {
        name: this.c(detail, 'bank.name')
      }
    }));
  }

  /**
   * Validates if bank's id is different than 12
   * @param {Object} detail
   * @param {Object} product
   */
  _bankIdIsNotTwelve(detail, product) {
    if (this.c(detail, 'bank')) {
      if (this.c(detail, 'bank.id') !== '0012') {
        product.specificProductType = {
          id: this.c(this._responseReceivers, 'specificProductType.id'),
          name: this.c(this._responseReceivers, 'specificProductType.name')
        };
      }
    }
  }

  /**
   * Validates if _responseReceivers has specificProductType
   */
  _receiversHasSpecificProductType() {
    if (!this.c(this._responseReceivers, 'specificProductType')) {
      this.set('_responseReceivers.specificProductType', {
        id: this.c(this._responseReceivers, 'productType.id'),
        name: this.c(this._responseReceivers, 'productType.name')
      });
    }
  }

  /**
   * Sets attributes for product
   */
  _setProductProps(detail) {
    if (detail && this.c(detail, 'bank')) {
      return {
        number: this.c(detail, 'displayNumber'),
        numberType: {
          id: this.c(this._responseReceivers, 'numberType.id'),
          name: this.c(this._responseReceivers, 'numberType.name')
        },
        productType: {
          id: this.c(this._responseReceivers, 'productType.id'),
          name: this.c(this._responseReceivers, 'productType.name')
        },
        bank: {id: this.c(detail, 'bank.id'),
          name: this.c(detail, 'bank.name')
        },
      };
    }
  }

  /**
   * Structures the information to send
   * to the dimo flow and continue the transaction
   * @event send-client-id-from-transfers
   * @event send-number-phone-from-transfers
   * @event send-number-phone-receiver-from-transfers
   * @event send-banxico-query-response-from-transfers
   * @event send-disable-change-step
   * @event send-body-dimo-from-transfers
   * @event redirection-dimo-to-expenses-group
   */
  onClickContactDimo() {
    const bodyDimo = {
      alias: this._selectedSender.productTitle,
      description: this._selectedSender.description,
      name: this._selectedSender.name,
      primaryAmount: this._selectedSender.primaryAmount,
      productId: this._selectedSender.id,
      productType: this._selectedSender.contractType.id
    };
    this._dispatch('send-client-id-from-transfers', this.clientId);
    this._dispatch('send-number-phone-from-transfers', this._myPhoneNumber);
    this._dispatch('send-number-phone-receiver-from-transfers', this._recipientInputValue);
    this._dispatch('send-banxico-query-response-from-transfers', this._banxicoResponse);
    this._dispatch('send-disable-change-step', true);
    this._dispatch('send-body-dimo-from-transfers', bodyDimo);
    if (this.comeFromExpensesGroup) {
      this._dispatch('redirection-dimo-to-expenses-group');
    }
  }

  /**
   * Method that sets body for _mapReceiverData when coming from saved contact found modal
   */
  onAcceptReviewSectionSavedContact() {
    this._validateOtherProperties(this._savedContactDetailAccount);
    this._setContactDetailBody();
    const avatarData = this._setSavedContactAvatarDataBody();
    this._mapReceiverData(avatarData);
    this._dispatch('set-contact-detail', this._contactDetail);
  }

  /**
  * Method that sets savedContact and savedContactAccount when are comming from Contacts Agenda
  * @param {Object} contact
  * @return {void}
  */
  setRecipientStep(contact) {
    if (contact) {
      this.set('_savedContactDetail', contact.savedContact);
      this.set('_savedContactDetailAccount', contact.savedContactAccount);
      this.onAcceptReviewSectionSavedContact();
    }
  }

  /**
   * Sets _contactDetail body
   */
  _setContactDetailBody() {
    this.set('_contactDetail', {
      name: this.c(this._savedContactDetail, 'person.firstName'),
      accountCurrencyType: {
        name: this.c(this._savedContactDetailAccount, 'bank.name').trim()
      },
      displayNumber: this.c(this._savedContactDetailAccount, 'number'),
      completeNumber: this.get('completeNumber', this._savedContactDetail),
      bank: {
        id: this.c(this._savedContactDetailAccount, 'bank.id'),
        name: this.c(this._savedContactDetailAccount, 'bank.name').trim()
      },
      products: [ this._savedContactDetailAccount ]
    });
    this._numbersGetRecords = this.c(this._savedContactDetailAccount, 'number');
    this._validationParamsOnMessageInterbank();
  }

  /**
   * Method that retrieves the list of flags
   */
  setDenominationFlagGlobal(payload) {
    this._featureFlagCollection = payload;
    this._messageInterbankTransfersflag = this.get('value', this._featureFlagCollection['glomo.transfers.fxTransfersOpinator']) || false;
    this.flagsValidation();
  }

  /**
   * Method that evaluates whether the flag is set to true and whether it is a clabe account
   */
  _validationParamsOnMessageInterbank() {
    if (this._messageInterbankTransfersflag && this._numbersGetRecords.toString().length === this.numberRecipientValue) {
      const numbersGetRecords = this._numbersGetRecords.toString().slice(0, 3);
      this._dispatch('get-records', { bankRecordId: numbersGetRecords });
    } else {
      this._dispatch('message-boost-interbank-transfers', { className: 'refactor-transfers cells-step-container', infoSecondMessageData: null });
    }
    if (this.isFuturaInternal) {
      this._steps[4].setConcept(this.jsonFutura.concept);
      this._steps[4].continue();
      this._steps[4].hideConceptInput = true;
      this.isFuturaInternal = false;
    }
  }

  _selectedNumberFormat() {
    const destinataryNumber = this._savedContactDetailAccount?.number;
    if (destinataryNumber) {
      const accountNumberFormat = {
        10: this._formatProduct(destinataryNumber, 'phone', 'MXN'),
        15: this._formatProduct(destinataryNumber, 'card', 'MXN'),
        16: this._formatProduct(destinataryNumber, 'card', 'MXN'),
        18: this._formatProduct(destinataryNumber, 'clabe', 'MXN'),
        20: this._formatProduct(destinataryNumber, 'account')
      };
      return accountNumberFormat[destinataryNumber.length];
    }
  }

  /**
   * Sets avatarData body
   */
  _setSavedContactAvatarDataBody() {
    return {
      alias: this.c(this._savedContactDetail, 'alias'),
      name: this.c(this._savedContactDetail, 'person.firstName'),
      number: this._selectedNumberFormat(),
      bank: {
        id: this.c(this._savedContactDetailAccount, 'bank.id'),
        name: this.c(this._savedContactDetailAccount, 'bank.name').trim()
      },
    };
  }

  /**
   * Sets what will be shown after successfully adding a new contact
   */
  setSuccessfulPostContactResponse(contact) {
    if (this.c(contact, 'contactId')) {
      this._mapReceiverData(contact);
      this._dispatch('set-properties-succesful-bottom-modal', this.t('glomo-transfer-succesful-response-post-contact'));
    }
  }

  /**
   * Sets values that will be shown after adding a new product
   */
  updateContactProduct() {
    this._contactDetail.number = this.c(this._contactDetail, 'displayNumber');
    this._contactDetail.savedProduct = true;
    this._mapReceiverData(this._contactDetail);
    const successfulPostContactLocale = this.t('glomo-transfer-post-contacts-product-success');
    this._dispatch('set-properties-succesful-bottom-modal', `${successfulPostContactLocale} ${this.c(this._contactDetail, 'alias')}`);
  }

  /**
   * Sets values that will be shown after receiving exchange rates response
   * @param {Object} response
   */
  setSuccessfulExchangeRatesResponse(response) {
    if (this.c(response, 'preferenceRate')) {
      this._relativeValue = this.c(response, 'preferenceRate.factor').toFixed(2);
      this._dispatch('set-relative-value', this._relativeValue);
      this._mapFullForeignCurrency(response);
      this._timer();
      this._mapFilledForeignCurrencyProperties();
    }
  }

  /**
   * Sets properties to foreign currency filled section in exchangeRates
   */
  _mapFilledForeignCurrencyProperties() {
    const amountFilledInfoMessageLocale = this.t('glomo-transfer-exchange-rates-amount-filled-info-message-USD');
    this._dispatch('set-properties-enter-amount', {
      showMessageBelowAmountCollapsed: true,
      messageBelowAmountCollapsed: `${this.c(this._destinationCurrencySelected, 'description')} ${this._totalAmount}`,
      showAmountFilledInfoMessage: true,
      amountFilledInfoMessage: `${amountFilledInfoMessageLocale} ${this._relativeValue} MXN`,
    });
  }

  /**
   * Sets properties to timer component depending if it is the first time showing timer or not
   */
  _timer() {
    this._timerActive = true;
    if (this._firstTimeTimer) {
      this._firstTimeTimer = false;
      this._dispatch('reset-timer', {
        timerDescription: this.t('glomo-transfer-timer-description')
      });
      this._dispatch('set-timer', 180000);
    } else {
      this._dispatch('set-restart');
    }
  }

  /**
   * Validates _originCurrency value
   * @param {Object} detail
   */
  _mapFullForeignCurrency(detail) {
    if (detail && this.c(detail, 'sentMoney.debit.amount')) {
      const originCurrencyEqualsSender = this._originCurrency === this.c(this._selectedSender, 'primaryAmount.currency');
      this._totalAmount = originCurrencyEqualsSender ? this.c(detail, 'sentMoney.debit.amount') : this.c(detail, 'sentMoney.credit.amount');
      this._dispatch('set-total-amount', this._totalAmount);
      const body = originCurrencyEqualsSender ? this._originCurrencyEqlsSender(detail) : this._originCurrencyEqlsReceiver(detail);
      const sharedBody = {
        exchangeRatesUpdated: true,
        exchangeRateSelected: {
          rate: this._relativeValue
        }
      };
      const mergeBody = {...body, ...sharedBody};
      this._dispatch('set-properties-enter-amount', mergeBody);
    }
  }

  /**
   * Returns body when _originCurrency equals receiver currency
   */
  _originCurrencyEqlsReceiver(detail) {
    return {
      totalAmount: this.c(detail, 'sentMoney.credit.amount'),
      amountInOriginCurrency: this.c(detail, 'sentMoney.credit.amount'),
      exchangeRatesUpdated: true,
      exchangeRateSelected: {
        rate: this._relativeValue
      }
    };
  }

  /**
   * Returns body when _originCurrency equals sender currency
   */
  _originCurrencyEqlsSender(detail) {
    return {
      totalAmount: this.c(detail, 'sentMoney.debit.amount'),
      amountInOriginCurrency: this.inputAmount,
      exchangeRatesUpdated: true,
      exchangeRateSelected: {
        rate: this._relativeValue
      },
    };
  }

  /**
   * Resets enter amount while still showing exchangeRates properties
   */
  cleanForeignCurrencyProps() {
    this.inputAmount = '';
    this._totalAmount = '0.00';
    this.resetTimer();
    this._resetExchangeRatesProps();
  }

  /**
   * Resets timer
   */
  resetTimer() {
    if (this._timerActive) {
      this._firstTimeTimer = true;
      this._timerActive = false;
      this._dispatch('reset-timer', {reset: true, timeout: 0});
    }
  }

  /**
   * Swap origin' values with destination's values and set new values to properties
   */
  receiverSectionOnIconClick() {
    this._swapSenderAndReceiverValues();
    this._setEnterAmountPropsAfterIconClick();
    this._mapFilledForeignCurrencyProperties();
  }

  /**
   * Swaps sender's and receiver's values when arrow icon is clicked
   */
  _swapSenderAndReceiverValues() {
    const variableCurrency = this._originCurrency;
    this._originCurrency = this._foreignCurrency;
    this._foreignCurrency = variableCurrency;
    const variableAmount = this._totalAmount;
    if (this.inputAmount !== '') {
      this._totalAmount = this.inputAmount;
      this.inputAmount = variableAmount;
    } else {
      this._totalAmount = '0.00';
    }
    const variableTitle = this._customCurrencySelectTitle;
    this._customCurrencySelectTitle = this._totalHeader;
    this._totalHeader = variableTitle;

    const body = {
      originCurrency: this._originCurrency,
      foreignCurrency: this._foreignCurrency,
      totalAmount: this._totalAmount
    };
    this._dispatch('set-properties-dm', body);
  }

  /**
   * Sets body to be dispatched when arrow icon is clicked
   */
  _setEnterAmountPropsAfterIconClick() {
    this._dispatch('set-properties-enter-amount', {
      currencySelected: this._originCurrencySelected,
      countryFlag: this.c(this._destinationCurrencySelected, 'labelImg.src'),
      totalCurrency: this.c(this._destinationCurrencySelected, 'id'),
      currency: this._originCurrency,
      foreignCurrency: this._foreignCurrency,
      currencyCode: this._originCurrency,
      setAmount: this.inputAmount,
      amount: this.inputAmount,
      totalAmount: this._totalAmount,
      exchangeRatesUpdated: true,
      customCurrencySelectTitle: this._customCurrencySelectTitle,
      totalHeader: this._totalHeader,
    });
  }

  /**
   * Sets values when receiver service can't find number bank
   * @param {Object} detail
   */
  selectedBank(detail = {}) {
    if (detail && this.c(detail, 'id')) {
      const payload = {
        displayNumber: this._recipientInputValue,
        bank: detail,
      };
      this._responseReceivers.number = this._recipientInputValue;
      this.set('_responseReceivers.bank', detail);
      const item = this._findSelectedItem('bankEntity');
      item.name = this.get('name', detail);
      this._dispatch('set-properties-new-recipient-selector', {
        reviewSectionModalSelectors: JSON.parse(JSON.stringify(this.optionsSelector)),
        idBank: this.c(detail, 'id')
      });
      this._dispatch('set-review-mode', payload);
    }
  }

  /**
   * Modifies the values received when there is no product type
   * @param {Object} detail
   */
  selectedTypeProduct(detail = {}) {
    const idProduct = this.get('id', detail);
    if (idProduct) {
      this.set('_responseReceivers.specificProductType', detail);
      const item = this._findSelectedItem('productType');
      item.name = this.get('name', detail);
      this._dispatch('set-properties-new-recipient-selector', {
        reviewSectionModalSelectors: JSON.parse(JSON.stringify(this.optionsSelector)),
      });
    }
  }

  /**
   * Returns the item found through the ID
   * @param {String} id
   */
  _findSelectedItem(id) {
    return this.optionsSelector.find(item => item?.id === id) || {};
  }

  /**
   * Set properties to show alert modal when trying to change foreign currency values after being collapsed
   */
  setAlertProperties() {
    this._dispatch('set-change-exchange-rates-alert', {
      code: 'change-exchange-rates',
      selectedConfig: {
        className: 'error exit',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: this.t('glomo-transfer-set-alert-properties-accept'),
        cancelBtLabel: this.t('glomo-transfer-set-alert-properties-cancel'),
        template: {
          type: 'paragraphs',
          values: [
            {
              icon: 'coronita:alert',
              class: 'spacing'
            },
            { text: this.t('glomo-transfer-set-alert-properties-message') }
          ]
        }
      }
    }
    );
  }

  /**
   * Goes to exchangeRates step
   */
  goToStepExchangeRates() {
    this.goToStep(this.enterAmountProps);
    this.resetFollowingSteps(this._amountOperationsStepNumber);
    this.cleanFollowingSteps({ currentStep: 3 });
    this._setReferenceConceptValues(false, false, 'glomo-transfer-generate-internal-optional-concept-label');
  }

  /**
   * Dispatches event to show alert modal and set foreign currency operation properties after time ran out
   */
  timeRanOut() {
    this.openVeil();
    this._setTimeRanOutModalProperties();
    this.closeVeil();
    this.goToStepExchangeRates();
    this.cleanForeignCurrencyProps();
  }

  /**
   * Sets properties to modal when timer runs out
   */
  _setTimeRanOutModalProperties() {
    this._dispatch('set-change-exchange-rates-alert', {
      code: 'time-ran-out',
      selectedConfig: {
        className: 'error exit',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: this.t('glomo-transfer-time-ran-out-accepts'),
        template: {
          type: 'paragraphs',
          values: [
            {
              icon: 'coronita:alert',
              class: 'spacing'
            },
            {
              text: this.t('glomo-transfer-time-ran-out-description'),
              class: ''
            },
            {
              text: this.t('glomo-transfer-time-ran-out-message')
            }
          ]
        }
      }
    });
  }

  /**
   * Sets properties to show alert modal when changing product selector value while using exchangeRates
   */
  setProductSelectorExchangeRatesAlertProperties() {
    this._dispatch('set-change-exchange-rates-alert', {
      code: 'product-selector-exchange-rates',
      selectedConfig: {
        className: 'error exit',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: this.t('glomo-transfer-product-selector-exchange-accept'),
        cancelBtLabel: this.t('glomo-transfer-product-selector-exchange-calcel'),
        template: {
          type: 'paragraphs',
          values: [
            {
              icon: 'coronita:alert',
              class: 'spacing'
            },
            {
              text: this.t('glomo-transfer-product-selector-exchange-message')
            }
          ]
        }
      }
    });
  }

  /**
   * Sets properties to show alert modal when changing recipient selector value while using exchangeRates
   */
  setRecipientSelectorExchangeRatesAlertProperties() {
    this._dispatch('set-change-exchange-rates-alert', {
      code: 'recipient-selector-exchange-rates',
      selectedConfig: {
        className: 'error exit',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: this.t('glomo-transfer-recipient-selector-exchange-rates-accept'),
        cancelBtLabel: this.t('glomo-transfer-recipient-selector-exchange-rates-cancel'),
        template: {
          type: 'paragraphs',
          values: [
            {
              icon: 'coronita:alert',
              class: 'spacing'
            },
            {
              text: this.t('glomo-transfer-recipient-selector-exchange-rates-message')
            }
          ]
        }
      }
    });
  }

  /**
   * Validates transferType and concept to set properties to concept component
   * @param {Object} concept
   */
  getConcept(concept) {
    this._isConceptFilled = this.c(concept, 'concept');
    let conceptLabel = '';
    if (this._isConceptFilled) {
      conceptLabel = this._transferType === 'INTERBANK_TRANSFERS' ? 'glomo-transfer-generate-interbank-transfer-response-top-info-0-key' : this.get('concept', concept);
      this._dispatch('show-reference-concept', {
        conceptLabel: this.t(conceptLabel),
        hideConceptInput: !(this._transferType === 'INTERBANK_TRANSFERS' || this._transferType === 'INTERNAL_TRANSFERS'),
      });
    } else {
      const transferTypeConceptLabels = {
        'INTERNAL_TRANSFERS': this.t('glomo-transfer-generate-internal-transfer-concept')  + this._getContactName(),
        'OWN_TRANSFERS': this.t('glomo-transfer-generate-internal-own-transfer-concept')
      };
      conceptLabel = this._receiverSubProductType === 'CREDIT_CARD' ? this.t('glomo-transfer-generate-internal-transfer-credit-card-concept') : transferTypeConceptLabels[this._transferType];
      this._dispatch('show-reference-concept', {
        conceptLabel: conceptLabel.slice(0, 20),
        hideConceptInput: !(this._transferType === 'INTERBANK_TRANSFERS' || this._transferType === 'INTERNAL_TRANSFERS'),
      });
    }
    this._dispatch('set-dm-concept', {concept: conceptLabel.slice(0, 20)});
  }

  /**
   * Get the name of the contact to transfer
   * @returns Contact name
   */
  _getContactName() {
    return (this._savedContactDetail?.person?.firstName || this._responseReceivers?.person?.firstName) || '';
  }

  /**
   * Sets properties after clicking on change concept
   */
  conceptChanged() {
    const transferTypeConceptLabels = {
      'INTERBANK_TRANSFERS': 'glomo-transfer-generate-interbank-transfer-response-parse-data-top-info-0-key',
      'INTERNAL_TRANSFERS': 'glomo-transfer-generate-internal-optional-concept-label',
      'OWN_TRANSFERS': 'glomo-transfer-generate-internal-optional-concept-label'
    };
    this._dispatch('show-reference-concept', {
      conceptLabel: this.t(transferTypeConceptLabels[this._transferType]),
      hideConceptInput: false,
      inputConcept: this._isConceptFilled
    });
  }
  /**
   * Sets fixed to false in the first step
   */
  setStepOneAsNotFixed() {
    this._dispatch('change-class-background', {
      fixed: false,
    });
  }

  /**
   * Initializes the page for frequent operations.
   * @param {Object} paramFutura - The parameter for the futura.
   */
  initPageFrequentOperation(paramFutura) {
    this.openVeil();
    this.set('jsonFutura', paramFutura);
    this.set('fromFutura', true);
    this.dataGoogleAssistant = this.get('data.filter', paramFutura);
    this._firstTimeTimer = true;
    this._entryPoint = paramFutura;
    this._setCurrentStepsAndMaxSteps(this._entryPoint);
    this._dispatch('parse-accounts');
    this._dispatch('is-futura-active', true);
  }

  /**
   * Sets the destination parameters for the transfer.
   * If the transfer is from Futura, it updates the contractId, contactNumber, and receiverNumber by replacing 'MX' with an empty string.
   * If the receiverNumber is provided, it calls the getReceivers method with the receiverNumber as the inputValue.
   * Otherwise, it calls the frequentOperationOwn method.
   */
  destinationParam(param) {
    if (this.fromFutura) {
      this.set('jsonFutura.contractId', this.jsonFutura?.contractId?.replace(/MX/, ''));
      this.set('jsonFutura.contactNumber',  this.jsonFutura?.contactNumber?.replace(/MX/, ''));
      this.set('jsonFutura.receiverNumber',  this.jsonFutura?.receiverNumber?.replace(/MX/, ''));
      if (this.jsonFutura.receiverNumber) {
        this.getReceivers({ inputValue: this.jsonFutura.receiverNumber });
      } else {
        this.frequentOperationOwn();
      }
    }
    this.saveContacts(param);
  }

  /**
   * Executes a frequent operation for the current user's own accounts.
   * This method performs a series of steps to complete the operation, including selecting the origin and destination accounts,
   * setting the amount and concept, and closing the veil.
   */
  frequentOperationOwn() {
    const originAccount = this._customerProducts.find(item => item.number === this.jsonFutura.contractId);
    const destinationAccount = this._customerProducts.find(item => item.number === this.jsonFutura.contactNumber);
    this._steps[1].onProductSelected(originAccount);
    this.onSenderReceiver(destinationAccount);
    this._steps[2].onProductSelected(destinationAccount);
    this._steps[2].disableChange = true;
    this._steps[3].setAmount = this.jsonFutura.amount;
    this._steps[3].continue(true);
    this._steps[4].setConcept(this.jsonFutura.concept);
    this._steps[4].continue();
    this.closeVeil();
  }

  /**
   * Executes a previous own transfer operation from the selected account.
   * This method performs a series of steps to complete the operation, including selecting the origin and destination accounts,
   * setting the amount and concept, and closing the veil.
   */
  _reuseOperationOwn() {
    const destinationAccount = this._validateOwnTransferReuseOperionList();
    const reuseOperationAmount = this._setReuseAmount();
    this.onSenderReceiver(destinationAccount);
    this._steps[this._prefillingStepsSelectorIds.receiver].onProductSelected(destinationAccount);
    this.setOperationListTransferType('OWN_TRANSFERS');
    this._steps[this._prefillingStepsSelectorIds.amount].setAmount = reuseOperationAmount;
    this._steps[this._prefillingStepsSelectorIds.amount].continue(true);
    this._steps[this._prefillingStepsSelectorIds.concept].setConcept(this.c(this._reuseOperationListSelectedDetailMovement, 'concept'));
    this._steps[this._prefillingStepsSelectorIds.concept].continue();
    this.closeVeil();
    if (this._featureFlagReuseOperationListAnalytics) {
      this._dispatch('reuse-operation-list-analytics-page-visit', this._reuseOperationListSelectedDetailMovement);
    }
  }

  /**
   * Executes a frequent operation internally.
   * This method performs a series of steps to execute a frequent operation internally.
   * It finds the origin account based on the contract ID, selects the product, collapses and activates the necessary steps,
   * sets the receiver information, sets the amount, continues the process, and updates the necessary flags.
   */
  frequentOperationInternal() {
    const originAccount = this._customerProducts.find(item => item.number === this.jsonFutura.contractId);
    this._steps[1].onProductSelected(originAccount);
    this._steps[2].collapsed = true;
    this._steps[2].active = true;
    this._steps[2].disableChange = true;
    this.onClickContinueReviewSection({
      'displayNumber': this.jsonFutura.receiverNumber.slice(-10),
      'name': this.jsonFutura.receiverFullName,
      'personIdentityDocument': {
        'documentNumber': '$ Pesos Mexicanos'
      },
      'bank': {
        'id': '0012',
        'name': 'BBVA'
      },
      'accountCurrencyType': {
        'title': 'glomo-transfer-banking-entity',
        'name': 'BBVA'
      },
      'alias': '',
      'disableInputSecondary': true
    });

    this._steps[3].setAmount = this.jsonFutura.amount;
    this._steps[3].continue(true);
    this.isFuturaInternal = true;
    this.closeVeil();
  }

  /**
   * Executes a previous internal transfer operation from the selected account.
   * This method performs a series of steps to complete the operation, including selecting the origin and destination accounts,
   * setting the amount and concept, and closing the veil.
   * Executes a frequent operation internally.
   */
  _reuseOperationInternal() {
    const reuseOperationAmount = this._setReuseAmount();
    this._steps[this._prefillingStepsSelectorIds.receiver].collapsed = true;
    this._steps[this._prefillingStepsSelectorIds.receiver].active = true;
    let  receiverReuseName = this.c(this._reuseOperationListSelectedDetailMovement, 'detail.sender.firstName', this.c(this._isReuseOperationSavedContactNumber, 'person.firstName', ''));
    let  aliasReuse = this.c(this._isReuseOperationSavedContactNumber, 'alias', '');
    this.setOperationListTransferType('INTERNAL_TRANSFERS');
    this._steps[this._prefillingStepsSelectorIds.concept].setConcept(this.c(this._reuseOperationListSelectedDetailMovement, 'concept'));
    this._steps[this._prefillingStepsSelectorIds.concept].continue();
    this._steps[this._prefillingStepsSelectorIds.concept].hideConceptInput = false;
    const displayNumber = this.c(this._reuseOperationListSelectedDetailMovement, 'additionalInformation.additionalData', '').split(' ')[4];
    this.onClickContinueReviewSection({
      'displayNumber': displayNumber,
      'name': receiverReuseName,
      'personIdentityDocument': {
        'documentNumber': '$ Pesos Mexicanos'
      },
      'bank': {
        'id': '0012',
        'name': 'BBVA'
      },
      'accountCurrencyType': {
        'title': 'glomo-transfer-banking-entity',
        'name': 'BBVA'
      },
      'alias': aliasReuse,
      'disableInputSecondary': true
    });
    this._steps[this._prefillingStepsSelectorIds.amount].setAmount = reuseOperationAmount;
    this._steps[this._prefillingStepsSelectorIds.amount].continue(true);
    this.isFuturaInternal = true;
    this.closeVeil();
    if (this._featureFlagReuseOperationListAnalytics) {
      this._dispatch('reuse-operation-list-analytics-page-visit', this._reuseOperationListSelectedDetailMovement);
    }
  }

  /**
   * Executes a frequent operation for interbank transfers.
   * This method performs a series of steps to complete the transfer process.
   * It selects the origin account, sets the amount and concept, and provides receiver information.
   * Finally, it closes the veil.
   */
  frequentOperationInterbank() {
    const originAccount = this._customerProducts.find(item => item.number === this.jsonFutura.contractId);
    this._steps[1].onProductSelected(originAccount);
    this._steps[2].collapsed = true;
    this._steps[2].active = true;
    this._steps[2].disableChange = true;
    this._steps[3].setAmount = this.jsonFutura.amount;
    this._steps[3].continue(true);
    this._steps[4].setConcept(this.jsonFutura.concept);
    this._steps[4].continue();
    this._steps[4].hideConceptInput = false;
    this.onClickContinueReviewSection(
      {
        'displayNumber': this.jsonFutura.receiverNumber,
        'bank': {
          'id': this.jsonFutura.receiverBankId,
          'name': this.jsonFutura.receiverBankName
        },
        'accountCurrencyType': {
          'title': 'glomo-transfer-banking-entity',
          'name': this.jsonFutura.receiverBankName
        },
        'alias': '',
        'disableInputSecondary': true,
        'name': this.jsonFutura.receiverFullName
      }
    );
    this.closeVeil();
  }

  /**
   * Executes a previous interbank transfer operation from the selected account.
   * This method performs a series of steps to complete the operation, including selecting the origin and destination accounts,
   * setting the amount and concept, and closing the veil.
   */
  _reuseOperationInterbank() {
    const reuseOperationAmount = this._setReuseAmount();
    this._steps[this._prefillingStepsSelectorIds.receiver].collapsed = true;
    this._steps[this._prefillingStepsSelectorIds.receiver].active = true;
    this.setOperationListTransferType('INTERBANK_TRANSFERS');
    this._steps[this._prefillingStepsSelectorIds.amount].setAmount = reuseOperationAmount;
    this._steps[this._prefillingStepsSelectorIds.amount].continue(true);
    this._steps[this._prefillingStepsSelectorIds.concept].showReference = true;
    this._steps[this._prefillingStepsSelectorIds.concept].referenceName = this.t('glomo-transfer-concept-reference');
    this.onClickContinueReviewSection(
      {
        'displayNumber': this.c(this._reuseOperationListSelectedDetailMovement, 'detail.receiver.contract.contractNumber'),
        'bank': {
          'id': this.c(this._reuseOpListReceiversResponse, 'bank.id'),
          'name': this.c(this._reuseOpListReceiversResponse, 'bank.name')
        },
        'accountCurrencyType': {
          'title': 'glomo-transfer-banking-entity',
          'name': this.c(this._reuseOpListReceiversResponse, 'bank.name')
        },
        'alias': '',
        'disableInputSecondary': true,
        'name': this.c(this._reuseOperationListSelectedDetailMovement, 'detail.receiver.firstName')
      }
    );
    this.closeVeil();
    if (this._featureFlagReuseOperationListAnalytics) {
      this._dispatch('reuse-operation-list-analytics-page-visit', this._reuseOperationListSelectedDetailMovement);
      this._dispatch('reuse-operation-list-analytics-interbank-concept', this._reuseOperationListSelectedDetailMovement);
    }
  }

  setOperationListTransferType(type) {
    this._transferType = type;
    this._dispatch('transfer-type', this._transferType);
  }

  /**
   * Burns an item from the operative.
   * @param {Object} param - Success operative object.
   */
  burnItemFromOperative(param) {
    const transferTypes = {
      OWN_TRANSFERS: 'transfers.own',
      INTERNAL_TRANSFERS: 'transfers.internal',
      INTERBANK_TRANSFERS: 'transfers.interbank',
    };

    const dispatch = {
      'internalId': transferTypes[param.params.detail.transferType],
      'response': {
        'receiver': {
          'contract': {
            'number': param.params.detail.destination.number,
            'chargeAmount': param.params.detail.chargeAmount,
          }
        },
        'sentMoney': param.params.detail.chargeAmount
      }
    };
    this._dispatch('transfer-dm-operation-success', dispatch);
  }

  /**
   * Restore the step amount, when the user changes the origin account.
   */
  restoreStepAmount() {
    this._steps[3].active = true;
  }

  /**
   * Find the selected card and prepare information to request the transaactions
   */
  reuseOperationListMapFinancial(reuseOperationAccountSelected) {
    const selectedAccount = Object.keys(reuseOperationAccountSelected).length && this.checkFianancialOverview(reuseOperationAccountSelected.id);
    const isCardProduct = this.c(reuseOperationAccountSelected, 'productType', '') === 'CARDS';
    if (isCardProduct) {
      this._dispatch('reuse-operation-list-card-api-version', '1');
    } else {
      this._dispatch('reuse-operation-list-api-version', '2');
    }
    this._dispatch('reuse-operation-list-selected-product-id', isCardProduct ? this.c(reuseOperationAccountSelected, 'id', '') : this.c(selectedAccount, 'simpleCode'));
    this._dispatch('reuse-operation-list-selected-product-last-movement', this.c((selectedAccount.detail.specificAmounts).find(item => {
      return item.id === 'ACCOUNT_MOVEMENT_NUMBER';
    }), 'name'));
    this._dispatch('reuse-operation-list-selected-product-type', this.c(selectedAccount, 'productType').toLowerCase());
    this._dispatch('reuse-operation-list-show-icon-state', 'coronita:collapse');
    this._dispatch('reuse-operation-list-show-title-list', true);
  }

  /**
   * Request transactions when user click reuse operation list
   */
  requestTransactions() {
    if (!this.fisrtClickDone) {
      this.fisrtClickDone = true;
      this._dispatch('reuse-operation-request-transactions');
      this._dispatch('reuse-operation-set-spinner-status', true);
    }
  }

  /**
   * Request more transactions when user scroll down on the reuse operation list
   */
  transactionsNextPage() {
    this._dispatch('reuse-operation-request-more-transactions', {
      pageSize: 20
    });
    if (!this._noMoreAvaliableTransactions) {
      this._dispatch('reuse-operation-request-more-transactions-spinner-status', true);
      this._dispatch('reuse-operation-request-more-transactions-button-status', false);
    }
  }

  /**
   * Show alert when transaction service fail
   */
  operationsNotAvaliables() {
    this.reuseOperationListShowAlert = true;
    this.hideContactList = true;
  }

  /**
   * Receive transactions and format to display the reuse operation list
   */
  reuseOperationListFormatMovements(selectedProductMovements) {
    this.reuseOperationListShowAlert = false;
    this.hideContactList = false;
    this._filteredMovements = this._filteredMovements.concat(this.filterTransferMovements(selectedProductMovements).map((element) => {
      return {
        id: this.c(element, 'id'),
        reuseItem: true,
        isReuseTransferItem: true,
        operationId: this.c(element, 'id'),
        alias: this.c(element, 'concept'),
        main: this.c(element, 'concept'),
        internalCode: this.c(element, 'transactionType.internalCode.id'),
        secondary: this.c(element, 'additionalInformation.0.value', '') || this._formatDisplayListConcept(this.c(element, 'additionalInformation.additionalData', '')),
        options: [],
        className: 'blue-title-avatar no-italic',
        amount: {
          amount: this.c(element, 'localAmount.amount'),
          currency: this.c(element, 'localAmount.currency')
        }
      };
    }));
    this._modalItemsFormat = this._formatAllMovemntsForModal(this._filteredMovements);
    if (this._numberOfOperationsReuse && this._numberOfOperationsReuse !== this._filteredMovements.length && !this.reuseOperationListShowAlert) {
      this.openModalReuseOperations();
    }
    this._numberOfOperationsReuse = this._filteredMovements.length;
    this._dispatch('reuse-operation-list-max-limits', 5);
    this._dispatch('reuse-operation-list-account-movements', this._filteredMovements);
    this._dispatch('reuse-operation-set-spinner-status', false);

  }

  /**
   * Fire list when userr select view all in the reuse operation list
   */
  openModalReuseOperations() {
    this._dispatch('reuse-operation-list-all-account-movements', this._modalItemsFormat);
    this._dispatch('reuse-operation-request-more-transactions-spinner-status', false);
    this._dispatch('reuse-operation-request-more-transactions-button-status', true);
  }

  /**
   * Stop request when transactions service reach the limit of 3 months
   */
  noMoreOperatiosnAvaliables() {
    this._noMoreAvaliableTransactions = true;
    this._dispatch('reuse-operation-request-more-transactions-spinner-status', false);
    this._dispatch('reuse-operation-request-more-transactions-button-status', true);
  }

  /**
   * Format elements from transactions service for the reuse operation list modal
   */
  _formatAllMovemntsForModal(allTransactions) {
    return allTransactions.map(transaction => {
      return {
        reuseItem: true,
        isReuseTransferItem: true,
        isModalItem: true,
        id: transaction.operationId,
        name: transaction.main,
        description: {
          value: transaction.secondary,
          masked: false,
        },
        isChecked: false,
        selected: {
          internalCode: transaction.internalCode,
          operationId: transaction.operationId,
        },
        primaryAmount: {
          amount: transaction.amount.amount,
          currency: transaction.amount.currency
        }
      };
    });
  }

  /**
   * Request transaction detail for the selected transaction
   */
  formatSelectedReuseOperation(operation) {
    this.operationsListAnalyticsFromModalSelected = this.c(operation, 'isModalItem', false);
    this.openVeil();
    this._dispatch('reuse-operation-list-api-version', this.c(operation, 'selected.internalCode', '') === '996' ? '2' : '0');
    this._dispatch('reuse-operation-list-selected-movement-id', this.c(operation, 'selected.operationId'));
    this._dispatch('reuse-operation-list-execute-specific-movement-detail');
  }

  /**
   * Receive the transaction detail, and validate the type of operation (own, internal or interbank)
   */
  receiveSpecificMovement(movementDetail) {
    this._reuseOperationListSelectedDetailMovement = movementDetail;
    this._fromReuseOperationList = true;
    let receiverBankNumber = '';
    if (this.c(this._reuseOperationListSelectedDetailMovement, 'detail.authorizationNumber', false)) {
      receiverBankNumber = this.c(this._reuseOperationListSelectedDetailMovement, 'detail.receiver.contract.contractNumber', '');
    } else {
      receiverBankNumber = this.c(this._reuseOperationListSelectedDetailMovement, 'additionalInformation.additionalData', '').split(' ')[4];
    }
    this._isReuseOperationSavedContactNumber =  this.savedContacts !== null && this.savedContacts.find(contact => {
      return this.c(contact, 'products.0.number', '').includes(receiverBankNumber);
    });
    if (this.checkFianancialOverview(receiverBankNumber)) {
      if (this._featureFlagReuseOperationListAnalytics) {
        this._dispatch('reuse-operation-list-analytics-on-click-start', {
          reuseTransferType: 'own',
          isModalItem: this.operationsListAnalyticsFromModalSelected,
          ...this._reuseOperationListSelectedDetailMovement
        });
      }
      this._reuseOperationOwn();
    } else {
      this.requestReceivers();
    }
  }

  /**
   * Dispatch receiver information to request the receiver service for internal and interbank transfers
   */
  requestReceivers() {
    const accountumber = this._getDisplayNumber();
    this._dispatch('reuse-operation-list-request-receiver', accountumber);
  }

  /**
   * Find product in financial over view
   */
  checkFianancialOverview(accountNumber) {
    return accountNumber.length && this.c(this.financialOverview, 'data.contracts', []).find(
      contract => (this.c(contract, 'id', '') === accountNumber
      || this.c(contract, 'number', '') === accountNumber
      || this.c(contract, 'number', '').includes(accountNumber)
      || this.c(contract, 'agreementContract', '').includes(accountNumber)),
    );
  }

  /**
   * Receive the raw response from transactions service with all movements and filter the transafers
   * OWN, INTERBANK and INTERNAL
   */
  filterTransferMovements(allMovements) {
    return allMovements.filter(m => {
      const refundRegex = /(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]/i;
      const refunds = refundRegex.test(this.c(m, 'additionalInformation.additionalData', ''));
      return this._validateByMoventInternalId(m) && this._validateByMoventStatus(m)
      && this._validateByMoventConcept(m) && !refunds && this._validateNotCreditCardPayment(m);
    });
  }

  /**
   * Validate internal id for transfers transaction
   */
  _validateByMoventInternalId(movementData) {
    const code = 'transactionType.internalCode.id';
    return (this.c(movementData, code, '') === '996'
      || this.c(movementData, code, '') === '950');
  }

  /**
   * Validate status of transaction
   */
  _validateByMoventStatus(movementData) {
    return this.c(movementData, 'moneyFlow.id', '') !== 'INCOME'
      && this.c(movementData, 'status.id', '') !== 'PENDING';
  }

  /**
   * Validate concept of transaction
   */
  _validateByMoventConcept(movementData) {
    return this.c(movementData, 'concept', '').slice(0, 5) !== 'Dimo-'
      && this.c(movementData, 'concept', '') !== 'COMPRA FONDOS INVERSION  ';
  }

  /**
   * Validate transaction is not a credit card payments
   */
  _validateNotCreditCardPayment(movementData) {
    return this.c(movementData, 'transactionType.id', '') !== 'CREDIT_CARD_INSTALLMENT';
  }

  /**
   * Validate own transfer
   */
  _validateOwnTransferReuseOperionList() {
    return this._customerProducts.find(item =>
      item.number.includes(this.c(this._reuseOperationListSelectedDetailMovement, 'additionalInformation.additionalData', '').split(' ')[4])
    );
  }

  /**
   * Format amount of the transaction
   */
  _setReuseAmount() {
    return Math.abs(this.c(this._reuseOperationListSelectedDetailMovement, 'localAmount.amount', 0));
  }

  /**
   * Find receiver number in transaction
   */
  _getDisplayNumber() {
    return this.c(this._reuseOperationListSelectedDetailMovement, 'detail.receiver.contract.contractNumber', false)
    || this.c(this._reuseOperationListSelectedDetailMovement, 'additionalInformation.additionalData', '').split(' ')[4] || '';
  }

  /**
   * Format concept
   */
  _formatDisplayListConcept(rawConcept) {
    return rawConcept.includes('BNET') ? rawConcept.split(' ')[5] : rawConcept.slice(7);
  }

  flagsValidation() {
    if (this._featureFlagCollection) {
      this._featuresFlags = this._featureFlagCollection[this._reuseOperationsListFlagKey];
      this._featureFlagReuseOperationList = this._featuresFlags?.value;
      this._featuresFlagsAnalytics = this._featureFlagCollection[this._reuseOperationsListAnalyticsFlagKey];
      this._featureFlagReuseOperationListAnalytics = this._featuresFlagsAnalytics?.value;
    }
    if (!this._featureFlagReuseOperationList) {
      this._dispatch('reuse-operation-hide-not-avaliable', false);
    }
    this._dispatch('reuse-operation-analytics-feature-flag', this._featureFlagReuseOperationListAnalytics);
  }

}
window.customElements.define(GlomoOpxTransferDmMx.is, GlomoOpxTransferDmMx);
