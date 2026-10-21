/* global moment */
class GlomoLoanOfferDm extends Polymer.mixinBehaviors([
  CellsBehaviors.StepManagerBehavior,
  CellsBehaviors.i18nBehavior,
  CellsBehaviors.CellsTextFormatterBehavior,
  CellsBehaviors.CellsCheckNestedKeysBehavior,
], CellsBehaviors.AmountBehavior(CellsBehaviors.PropertyResetBehavior(Polymer.Element))) { // eslint-disable-line

  static get is() {
    return 'glomo-loan-offer-dm';
  }

  static get properties() {
    return {
      /**
       * @description Has previousPage and currentPage name,
       * initialized from __bridge_app channel
       * @type {Object}
       */
      navigationDetailFromBridge: {
        type: Object,
        value: () => ({}),
        resettable: true
      },
      /**
       * @description Global cache storage from native
       * @type {Object}
       */
      globalCacheStorage: {
        type: Object,
        value: () => ({}),
      },
      /**
       * @description Host for requests, initialized from config on page
       * @type {String}
       * */
      host: String,
      /**
       * @description Indicates if the requests are going to be
       * performing by native or web
       * @type {Boolean}
       * */
      native: {
        type: Boolean,
        value: false
      },
      /**
       * @description Indicates API Business documents version
       * @type {String}
       * */
      businessDocumentsApiVersion: String,
      /**
       * @description Initialized from global_tsec_channel channel
       * @type {Object}
       * */
      tsec: {
        type: Object,
        value: () => ({}),
        notify: true
      },
      /**
       * @description Initialized from global_deviceid_channel channel
       * @type {Object}
       * */
      deviceId: {
        type: Object,
        value: () => ({}),
        notify: true
      },
      /**
       * @description Contains a loan offer identifier
       * @type {Object}
       * */
      offerId: {
        type: String,
        resettable: true
      },
      /**
       * @description Contains a loan offer data info
       * @type {Object}
       * */
      loanOfferDetail: {
        type: Object,
        value: () => ({}),
        resettable: true
      },
      /**
       * @description Configuration of loan offer
       * @type {Object}
       * */
      loanOfferProcessor: {
        type: Object,
        value: () => ({}),
        resettable: true,
        notify: true
      },
      /**
       * @description Configuration of loan offer simulation
       * @type {Object}
       * */
      loanOfferSimulationProcessor: {
        type: Object,
        value: () => ({}),
        resettable: true
      },
      /**
       * @description Configuration of loan offer hiring
       * @type {Object}
       * */
      loanOfferHiringProcessor: {
        type: Object,
        value: () => ({}),
        resettable: true,
        notify: true
      },
      /**
       * @description Contains setp-loan-offer properties
       * @type {Object}
       * */
      stepLoanOfferObject: {
        type: Object,
        value: () => ({}),
        resettable: true
      },
      /**
       * @description Contains step-card-checklist properties
       * @type {Object}
       * */
      stepCardChecklistObject: {
        type: Object,
        value: () => ({}),
        resettable: true
      },
      /**
       * @description Object to configure if the amount is valid or not
       * @type {Object}
       */
      invalitAmountObject: {
        type: Object,
        value: () => ({}),
        resettable: true
      },
      /**
       * @description Contains event names
       * @type {Object}
       * */
      mappingComponentObjectToEventName: {
        type: Object,
        value: () => ({
          'stepLoanOfferObject': 'step-loan-offer',
          'stepCardChecklistObject': 'step-card-checklist',
          'invalitAmountObject': 'invalit-amount'
        })
      },
      /**
       * @description Customer type
       * @type {String}
       * */
      customerType: {
        type: String,
        value: 'CSP'
      },
      /**
       * @description Events names of diferent modals
       * @type {Object}
       * */
      modalEventNames: {
        type: Object,
        value: () => ({})
      },
      /**
       * @description Local currency
       * @type {String}
       * */
      localCurrency: String,
      /**
       * @description Language
       * @type {String}
       * */
      language: String,
      /**
       * @description Last amount selected
       * @type {Number}
       * */
      _lastValidAmountSelected: {
        type: Number,
        resettable: true
      },
      /**
       * @description Current selected amount
       * @type {Number}
       * */
      currentSelectedAmount: {
        type: Number,
        resettable: true
      },
      /**
       * @description Contains last simulate amount
       * @type {Number}
       * */
      lastSimulatedAmount: {
        type: Number,
        resettable: true,
        notify: true
      },
      /**
       * @description Default Amount
       * @type {Number}
       * */
      defaultAmount: Number,
      /**
       * @description Last valid term selected
       * @type {Number}
       * */
      _lastValidTermSelected: {
        type: Number,
        resettable: true
      },
      /**
       * @description Last simulation term
       * @type {Number}
       * */
      lastSimulatedTerm: {
        type: Number,
        resettable: true,
        notify: true
      },
      /**
       * @description Current Monthly Payment
       * @type {Number}
       * */
      currentMonthlyPayment: {
        type: Number,
        resettable: true,
        notify: true
      },
      /**
       * @description Current Insurance Amount
       * @type {Number}
       * */
      currentInsuranceAmount: Number,
      /**
       * @description Principal account
       * @type {Object}
       * */
      principalAccount: {
        type: Object,
        value: () => ({
          alias: '-',
          number: '-',
          availableBalance: [
            {
              amount: '-'
            }
          ]
        })
      },
      /**
       * @description Validate termn simulation
       * @type {Boolean}
       * */
      _isTermSimulation: {
        type: Boolean,
        value: false,
        resettable: true
      },
      /**
       * @description List of business documents
       * @type {Array}
       * */
      _businessDocuments: {
        type: Array,
        value: () => ({}),
        resettable: true
      },
      /**
       * @description Terms and conditions configuration
       * @type {Object}
       * */
      termsAndConditionsDocumentConfig: {
        type: Object,
        value: () => ({})
      },
      /**
       * @description Iinsurance configuration
       * @type {Object}
       * */
      insuranceDocumentConfig: {
        type: Object,
        value: () => ({})
      },
      /**
       * @description General documents configuration
       * @type {Object}
       * */
      targetDocumentConfig: {
        type: Object,
        value: () => ({}),
        resettable: true
      },
      /**
       * @description Product id of business documents
       * @type {String}
       * */
      businessDocumentsProductId: {
        type: String,
        value: 'CONSUMO'
      },
      /**
       * @description Contains component default configuration
       * @type {Object}
       * */
      defaultValuesByComponent: {
        type: Object,
        value: () => ({})
      },
      /**
       * @description Indicate Simulation Reboot Done
       * @type {Boolean}
       * */
      _simulationRebootDone: {
        type: Boolean,
        value: false,
        resettable: true
      },
      /**
       * @description Indicate Successful Simulation
       * @type {Boolean}
       * */
      atLeastOneSuccessfulSimulation: {
        type: Boolean,
        value: false,
        resettable: true
      },
      /**
       * @description Select template id of business documents
       * @type {String}
       * */
      targetBusinessDocumentTemplateId: {
        type: String,
        resettable: true
      },
      /**
       * @description Maximun number of request
       * @type {Number}
       * */
      maximumAttemptsPerRequest: {
        type: Number,
        value: 3
      },
      /**
       * @description Attempts config
       * @type {Object}
       * */
      attemptsConfig: {
        type: Object,
        value: () => ({
          max: 3,
          current: 0,
          nextAttemptFunction: null,
          noneRemainingFunction: null,
          retryFunction: null,
          resetAttempts: function() {
            this.current = 0;
            this.nextAttemptFunction = null;
          },
          get areThereMoreAttempts() {
            return this.current < this.max;
          },
          performNextAttempt: function() {
            if (this.areThereMoreAttempts) {
              if (this.nextAttemptFunction) {
                this.nextAttemptFunction();
                this.current++;
              }
            } else {
              if (this.noneRemainingFunction) {
                this.noneRemainingFunction();
              }
            }
          },
          askForRetry: function() {
            if (this.areThereMoreAttempts) {
              if (this.retryFunction) {
                this.retryFunction();
              }
            } else {
              if (this.noneRemainingFunction) {
                this.noneRemainingFunction();
              }
            }
          }
        })
      },
      /**
       * @description Which page go when operative exit
       * @type {Array}
       * */
      comingPagesToNotifyOnOperativeExit: {
        type: Array,
        value: () => []
      },
      /**
       * @description Contains images paths
       * @type {Object}
       * */
      pathsToImages: {
        type: Object,
        value: () => ({})
      },
      /**
       * @description Contains post Hiring configuration
       * @type {Object}
       * */
      postHiringConfig: {
        type: Object,
        value: () => ({
          cases: [],
          onAnyCaseFulfilled: null,
          performValidation: function(responsePayload) {
            const fulfilledCases = this.cases.filter(currentCase => currentCase.validatorFunction(responsePayload));
            if (fulfilledCases && fulfilledCases.length > 0) {
              const fulfilledCase = fulfilledCases[0];
              fulfilledCase.onCaseFulfilled(responsePayload, fulfilledCase.caseName);
            } else {
              this.onAnyCaseFulfilled();
            }
          },
          customProps: null
        })
      },
      /**
       * @description Contains custom post Hiring configuration
       * @type {Object}
       * */
      customPropsForPostHiringConfig: {
        type: Object,
        value: () => ({})
      },
      /**
       * @description Contains email object
       * @type {Object}
       * */
      _userContactEmail: {
        type: Object,
        value: () => ({})
      },
      /**
       * @description Post loans service success response
       * @type {Object}
       * */
      postLoansServiceSuccessResponse: {
        type: Object,
        value: () => ({})
      },
      /**
       * @description Ammount formatted configuration
       * @type {Object}
       * */
      formattedAmountConfig: {
        type: Object,
        value: () => ({
          decimals: true,
          separator: true,
          symbol: true
        })
      },
      /**
       * @description Percentage formatted configuration
       * @type {Object}
       * */
      formattedPercentageConfig: {
        type: Object,
        value: () => ({
          stringBetween: '',
          symbol: '%',
          fractionDigits: 2
        })
      },
      /**
       * @description Loan offer processor configuration
       * @type {Object}
       * */
      loanOfferProcessorConfig: {
        type: Object,
        value: () => ({})
      },
      /**
       * @description Loan offer simulation processor configuration
       * @type {Object}
       * */
      loanOfferSimulationProcessorConfig: {
        type: Object,
        value: () => ({})
      },
      /**
       * @description Loan offer hiring processor configuration
       * @type {Object}
       * */
      loanOfferHiringProcessorConfig: {
        type: Object,
        value: () => ({})
      },
      /**
       * @description Indicate if slider input drag status
       * @type {Boolean}
       * */
      sliderInputDragStatus: {
        type: Boolean,
        value: false,
        observer: '_sliderDragStatus'
      },
      /**
       * @description saves the last slider selected value
       * @type {Number}
       * */
      lastSliderValueIndex: {
        type: Number,
        value: 0
      },
      /**
       * @description Indicate if amount input is filled
       * @type {Boolean}
       * */
      _amountInputIsFilled: {
        type: Boolean,
        value: false
      },
      /**
       * @description Indicate if any open modal
       * @type {Boolean}
       * */
      hasAnyOpenModal: {
        type: Boolean,
        value: false,
        resettable: true
      },
      /**
       * @description Current loan Hiring caseName
       * @type {String}
       * */
      currentLoanHiringCaseName: {
        type: String,
        resettable: true,
        notify: true
      },
      /**
       * @description Contains email caché
       * @type {String}
       * */
      emailCache: {
        type: String,
      },
      /**
       * @description Assistance Availability flag
       * @type {Boolean}
       * */
      assistanceAvailability: {
        type: Boolean,
        value: false
      },
      /**
       * @description Phone number contact
       * @type {String}
       * */
      phoneNumberAdvisor: {
        type: String
      },
      /**
       * @desc Accepts base64 string or pdf url
       * @type {String}
      */
      baseSrc: {
        type: String,
        notify: true
      },
      /**
       * @description Call from Header
       * @type {String}
       * */
      callActionHeader: {
        type: Boolean,
        value: false
      },
      /** New coupon logic */
      /**
      * @description Indicates coupon redemption
      * @type {String}
      * */
      couponRedeemed: {
        type: Boolean,
        value: false,
        resettable: true
      },
      /**
       * @desc Coupon redeem data Object
       * @type {object}
       */
      couponRedeemedData: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc coupon payload data Object
       * @type {object}
       */
      couponDataReceived: {
        type: Object,
        value: () => ({})
      },
      /** END New coupon logic */
      /**
       * @description Constains urls of amortization schedule pdf
       * @type {Object}
       * */
      sampleAmortizationScheduleDocument: {
        type: Object,
        value: () => ({})
      },
      /**
       * @description Indicates if the first interaction to validate the entered amount
       * @type {Boolean}
       */
      _firstInteraction: {
        type: Boolean,
        value: false,
        resettable: true
      },
      /**
       * @description Flag to validate that the detail has been obtained.
       * @type {Boolean}
       */
      internalInteraction: {
        type: Boolean,
        value: false
      },
      /**
       * Flag to know when continue button has been pressed
       * @type {Boolean}
       */
      _continuePressed: {
        type: Boolean,
        value: false
      },
      /**
       * Enabled coupons sections
       * @type {Boolean}
       */
      isLFOcLoanEnabled: {
        type: Boolean,
        value: false
      },
      /**
       * Validate the logic of the commission revire with this flag
       * @type {Boolean}
       */
      _isComissionRevire: {
        type: Boolean,
        value: false
      },
      /**
       * Validate the native logic of the commission revire with this flag
       * @type {Boolean}
       */
      isPercentOcLoanRevire: {
        type: Boolean,
        value: false
      },
      /**
       * @description Alert box class for revire modal
       * @type {String}
       * */
      alertBoxModalClass: {
        type: String,
        value: 'style-promotion-help'
      },
      /**
       * Validate modal revire is open
       * @type {Boolean}
       */
      isModalRevireOpen: {
        type: Boolean,
        value: false
      },
      /**
       * Receive the new value of the initial amount
       * @type {String}
       */
      newInitialAmount: {
        type: String,
        value: ''
      },
      /**
       * Receive the value of the operationNumber
       * @type {Object}
       */
      dataSuccessLoan: {
        type: Object,
        value: () => ({})
      },
      /**
       * Flag to mark loan as sustainable
       * @type {Boolean}
       */
      _isSustainableLoan: {
        type: Boolean,
        value: false
      },
      /**
      * Feature flag for sustainable loan
      * @type {Boolean}
      */
      _flagSustainableLoan: {
        type: Boolean,
        value: false
      },
      /**
       * @description Default amount to perform the simulation when the slider moves
       * @type {Number}
       * @default 0
       */
      _amountDefaultSimulate: {
        type: Number,
        value: 0
      },
      /**
       * @description Flag that indicates whether the quantity to be simulated was written or not in the input
       * @type {Boolean}
       * @default false
       */
      _isValidAmountInInput: {
        type: Boolean,
        value: false
      },
      /**
         * @desc Flag that indicates if the entrypoint is by message center
         * @type {Boolean}
         */
      flagNotification: {
        type: Boolean,
        value: false
      },
      /**
         * @desc Array that stores the offers
         * @type {Array}
         */
      offers: {
        type: Array,
        value: () => []
      },
    };
  }

  static get observers() {
    return [
      '_requestOfferDetail(offerId, navigationDetailFromBridge)'
    ];
  }

  /**
   * Method that is executed to fecth the value of the flag
   * @event search-module-flag-coupons
   */
  searchCouponFlag() {
    const featureFlagsCoupons = ['L&FOcLoan', 'percentOcLoanRevire'];
    featureFlagsCoupons.forEach((featureflag) => {
      const searchFlagDetail = {
        module: 'loan',
        feature: featureflag
      };
      this._dispatch('search-module-flag-coupons', searchFlagDetail);
    });
  }

  /**
   * Receives the response of the request sent to native and turn on native flags in case the response match
   * @param {Object} response
   */
  responseFlagValue({ feature, isFlagEnable, module: myModule  }) {
    if (myModule === 'loan' && feature === 'L&FOcLoan' && !this.isLFOcLoanEnabled) {
      this.isLFOcLoanEnabled = isFlagEnable;
    }

    if (myModule === 'loan' && feature === 'percentOcLoanRevire' && !this.isPercentOcLoanRevire) {
      this.isPercentOcLoanRevire = isFlagEnable;
    }
  }

  /**
   * @desc The function validates and sets the values of different feature flags
   * @param {Object} featureFlags
   */
  getFlagCollection(featureFlags) {
    this._flagSustainableLoan = featureFlags['glomo.ocLoans.sustainable']?.value;
  }

  /**
   * Function to initialize
   */
  initialize() {
    this.attemptsConfig.max = this.maximumAttemptsPerRequest;
    this.attemptsConfig.retryFunction = this.openRetryModal.bind(this);
    this.attemptsConfig.noneRemainingFunction = this.openErrorModal.bind(this);
    this.postHiringConfig.cases = [
      {
        onCaseFulfilled: this.getCustomerContacts.bind(this),
        validatorFunction: this.isSuccessHiringCase.bind(this),
        caseName: 'SUCCESS'
      },
      {
        onCaseFulfilled: this.onPendingHiringCase.bind(this),
        validatorFunction: this.isPendingHiringCase.bind(this),
        caseName: 'PENDING'
      },
      {
        onCaseFulfilled: this.onIncompleteHiringCase.bind(this),
        validatorFunction: this.isIncompleteHiringCase.bind(this),
        caseName: 'INCOMPLETE'
      }
    ];
    this.postHiringConfig.onAnyCaseFulfilled = this.openErrorModal.bind(this);
    this.postHiringConfig.customProps = this.customPropsForPostHiringConfig;
    this._secondaryText();
  }

  /**
   * Reset steps, configurations and main properties
   */
  reset() {
    this.hideHeader();
    this.flagNotification = false;
    this._continuePressed = false;
    this.resetProperties();
    this.attemptsConfig.resetAttempts();
    this._syncComponentObject({
      objectComponentName: 'stepLoanOfferObject',
      properties: [ 'couponRedeemed' ],
      justReset: true
    });
    this.internalInteraction = false;
  }

  /**
   * Receive the offers
   * @param {Array} payload
   */
  offersReceived(payload) {
    this.offers = payload;
    this.notificationCenterData();
  }

  /**
   * Error Receive the offers
   * @event send-to-dashboard
   */
  offersReceivedError() {
    this._dispatch('send-to-dashboard');
  }

  /**
   * Get the credit card offer
   * @event send-to-dashboard
   */
  notificationCenterData(payload) {
    if (!this.offers.length && payload) {
      this._dispatch('get-offer-list');
      return;
    }
    this.offers.forEach(data => {
      const productId = this.get('product.id', data);
      if (productId === '00CB') {
        this.offerId = this.get('id', data);
      }
    });
    if (this.offerId === undefined) {
      this._dispatch('send-to-dashboard');
    }
  }

  /**
   * observe when offerId is filled
   */
  _requestOfferDetail(offerId, navigationDetailFromBridge) {
    const currentPage = this.get('value.currentPage', navigationDetailFromBridge);
    if (offerId && currentPage === 'ocLoanOfferPage' && this.flagNotification === false) {
      this.initialize();
      this._requestLoanOfferDetail();
    }
  }

  /**
   * Init coupon payload
   * @param {Object} payload
   */
  initCouponData(payload) {
    this.couponDataReceived = payload;
  }

  /**
   * Send offer annual rate
   * @param {Object} annualRate
   * @event offer-benefit-coupon
   */
  sendBenefit(annualRate) {
    this._dispatch('offer-benefit-coupon', annualRate);
  }

  /**
   * Send revire flag
   * @param {Boolean} revireFlag
   * @event offer-revire
   */
  sendRevire() {
    this._dispatch('offer-revire', {
      hasRevire: true
    });
  }

  /**
   * Manage offer payload that was send from invoking page (previous age)
   * @param {Object} offerPayload
   */
  handleOfferPayload(offerPayload) {
    let flag = Object.prototype.hasOwnProperty.call(offerPayload, 'cardId');
    if (offerPayload && Object.prototype.hasOwnProperty.call(offerPayload, 'offerId') && !flag) {
      this.offerId = offerPayload.offerId;
    }
  }

  /**
   * Request offer detail
   * @event 'get-loan-offer-detail'
   */
  _requestLoanOfferDetail() {
    this.showSpinner();
    this.attemptsConfig.nextAttemptFunction = this._requestLoanOfferDetail.bind(this);
    this._dispatch('get-loan-offer-detail', this.offerId);
  }

  /**
   * Receives response from offer detail and looks for rate revire or comission revire
   * if exist changes the minimum value to revire field and returns the response obj.
   * @param {Object} response
   * @returns {Object} response
   */
  _realignRevires(response) {
    const feesArray =  this.c(response, 'fees.itemizeFees');
    const ratesArray = this.c(response, 'rates');
    if (this.c(feesArray, 'length')) {
      const orginalcomissionIndex = feesArray.findIndex(fee => this.c(fee, 'feeType.id') === 'COMISION');
      const originalComission = this.c(feesArray[orginalcomissionIndex], 'percentage');
      const revireComissionIndex = feesArray.findIndex(fee => this.c(fee, 'feeType.id') === 'COMISION REVIRE');
      const revireComission = this.c(feesArray[revireComissionIndex], 'percentage');
      if (originalComission < revireComission) {
        this.set(`fees.itemizeFees.${revireComissionIndex}.percentage`, originalComission, response);
        this.set(`fees.itemizeFees.${orginalcomissionIndex}.percentage`, revireComission, response);
      }
    }
    if (this.c(ratesArray, 'length')) {
      const revireRateIndex = ratesArray.findIndex(rate => this.c(rate, 'rateType.id') === 'TASA_REVIRE');
      const originalRateIndex = ratesArray.findIndex(rate => this.c(rate, 'rateType.id') === 'TASA_ANUAL');
      const originalRate = this.c(ratesArray[originalRateIndex], 'unit.percentage');
      const revireRate = this.c(ratesArray[revireRateIndex], 'unit.percentage');
      if (revireRateIndex > 0 && originalRate < revireRate) {
        this.set(`rates.${revireRateIndex}.unit.percentage`, originalRate, response);
        this.set(`rates.${originalRateIndex}.unit.percentage`, revireRate, response);
      }
    }
    return response;
  }

  /**
   * From successful response, build objects to initialize UI components
   * @param {Object} response
   * @event 'set-header-title-name'
   * @public
   */
  onGetLoanOfferDetailSuccess(response) {
    response = this._realignRevires(response);
    this.attemptsConfig.resetAttempts();
    this.loanOfferDetail = response;
    this.loanOfferProcessor = this._generateProcessor(response, this.loanOfferProcessorConfig);
    const { contractingType } = response;
    const {
      product, suggestedAmountValue, suggestedTermValue, headerTitleLocale,
      loanBreakdownInstallmentValue, isPPI01, isNOM01, isNOM02,
      isMAG01, isPPI04, revireRate, annualRateValueAsTruncated, revireRateValueAsTruncated
    } = this.loanOfferProcessor;
    this._selectAccount(product);
    this._dispatch('set-header-title-name', headerTitleLocale);
    this.defaultAmount = suggestedAmountValue;
    this.set('lastSimulatedAmount', suggestedAmountValue);
    this._lastValidAmountSelected = suggestedAmountValue;
    this.set('lastSimulatedTerm', suggestedTermValue);
    this._lastValidTermSelected = suggestedTermValue;
    this.set('currentMonthlyPayment', loanBreakdownInstallmentValue);

    this.sendBenefit({
      benefit: {
        description: '',
        currentBenefit: annualRateValueAsTruncated,
        benefitType: {
          benefitType: 'PERCENTAGE',
          percentage: annualRateValueAsTruncated,
        }
      },
      term: {
        number: this._lastValidTermSelected,
        frequency: this.loanOfferProcessor.suggestedTerm.frequency
      },
      offerId: this.offerId,
    });

    this._setStepLoanOfferBasis();
    this._setStepCardChecklistBasis();
    this._handleContractingType(contractingType);

    if (revireRate && this.isLFOcLoanEnabled) {
      this._addRatePromotionToStepLoanOffer();
      this.sendRevire();
    }

    if (isPPI01 || isNOM01 || isNOM02 || isMAG01) {
      this._addInsuranceAmountToStepLoanOffer();
      this._addInsuranceToStepCardChecklist();
    }

    if (isPPI04) {
      this._addCommissionToStepLoanOffer();
    }

    this._syncComponentObject({
      objectComponentName: 'stepLoanOfferObject',
      resetBeforeSet: true,
      specificPropertiesToReset: [ 'amountData' ]
    });
    this._syncComponentObject({objectComponentName: 'stepCardChecklistObject'});
    this._firstInteraction = true;
    this.internalInteraction = true;
    this.closeSpinner();
  }

  /**
   * Handler for validate contracting type
   * if category is H, set sustainable loan configuration
   * @param {Object} contractingType
   */
  _handleContractingType(contractingType) {
    this._isSustainableLoan = this._flagSustainableLoan && contractingType?.category?.id === 'H';
    if (this._isSustainableLoan) {
      this._setSustainableLoanConfig();
    }
    this._dispatch('send-sustainable-loan', this._isSustainableLoan);
  }

  /**
   * Method to set configuration for sustainable loan on
   * stepLoanOfferObject
   */
  _setSustainableLoanConfig() {
    const { productTypeLocale, annualRateValueAsTruncated, catRate,
      catRateValue, sustainableRateValueAsTruncated
    } = this.loanOfferProcessor;
    this.set('stepLoanOfferObject.sustainableConfig', {
      active: true,
      usage: this.t('oc-loan-offer-page-sustainable-loan-usage'),
      description: this.t('oc-loan-offer-page-sustainable-loan-description'),
      products: this.t('oc-loan-offer-page-sustainable-products'),
      tabOptions: [
        { label: this.t('oc-loan-offer-page-sustainable-tab-conventional') },
        { label: this.t('oc-loan-offer-page-sustainable-tab-sustainable') }
      ],
      catalog: {
        title: this.t('oc-loan-offer-page-sustainable-catalog-title'),
        text: this.t('oc-loan-offer-page-sustainable-catalog-description'),
        smallImg: {
          src: './images/offers/loan/social-housing.svg'
        }
      },
      info: {
        heading: this.t('oc-loan-offer-page-sustainable-message-title'),
        message: this.t('oc-loan-offer-page-sustainable-message-description'),
        button: this.t('oc-loan-offer-page-sustainable-message-button-text')
      },
      comparative: {
        titleHeader: {
          title: this.t('oc-loan-offer-page-sustainable-comparative-title'),
          class: 'header-title'
        },
        dynamicClass: 'promotion-comparative',
        active: true,
        currencyCode: '%',
        firstTitle: this.t('oc-loan-offer-page-sustainable-comparative-first-title'),
        secondTitle: this.t('oc-loan-offer-page-sustainable-comparative-second-title'),
        firstAmount: annualRateValueAsTruncated,
        secondAmount: sustainableRateValueAsTruncated,
        firstSlot: this.t('oc-loan-offer-page-sustainable-comparative-first-span'),
        secondSlot: this.t('oc-loan-offer-page-sustainable-comparative-second-span')
      },
      customMessage: {
        message: `${this.t(productTypeLocale)}<br>${this.t('oc-loan-offer-page-sustainable-custom-message')}<br><br><strong>${this.t('oc-loan-offer-page-sustainable-dynamic-cat', '', { catRateValue })}</strong>${this.t('oc-loan-offer-page-custom-label')}${moment(catRate.calculationDate).format('LL')}${this.t('oc-loan-offer-page-custom-validity')}<br>${this.t('oc-loan-offer-page-custom-info')}`,
        top: true
      },
      defaultSelectedTab: 1
    });
  }

  /**
   * Method to send the current loan offer detail to the sustainable simulator
   * @event send-data-to-simulator
   */
  sendDataToSimulator() {
    const { subproduct, annualRateValueAsTruncated, suggestedTerm } = this.loanOfferProcessor;
    const minimumAmountOffer = this.c(this.stepLoanOfferObject, 'amountData.amountMin');
    const maximumAmountOffer = this.c(this.stepLoanOfferObject, 'amountData.amountMax');
    const data = {
      lastAmount: this._lastValidAmountSelected,
      offerTermValue: this._lastValidTermSelected,
      conventionalRate: annualRateValueAsTruncated,
      monthlyPayment: this.currentMonthlyPayment,
      currency: this.localCurrency,
      minimumAmountOffer,
      maximumAmountOffer,
      subproduct: subproduct.id,
      offerId: this.offerId,
      offerTermFrequency: suggestedTerm.frequency
    };
    this._dispatch('send-data-to-simulator', data);
  }
  /**
   * Set basic data in steps and validate slider properties
   * @private
   */
  _setStepLoanOfferBasis() {
    const {
      suggestedAmountValue, suggestedTermValue, catRate,
      frecuencyLocale, loanBreakdownInstallmentValueAsAmount, catRateValue,
      loanBreakdownInstallmentValue, annualRateValueAsPercentage, productTypeLocale,
      minimumAmountValue, maximumAmountValue, headerDescriptionLocale, revireRateValueAsPercentage,
      allowedTermsRange, mensualRateValueAsPercentage, productNameKey
    } = this.loanOfferProcessor;
    let keyValues = [
      {
        key: 'oc-loan-offer-page-list-interest-rate-1',
        value: mensualRateValueAsPercentage,
        showCollapsedView: true,
        classInfoValue: 'values-bold',
        showOpenView: true,
        id: 'monthly',
      },
      {
        key: 'oc-loan-offer-page-list-interest-rate-2',
        value: revireRateValueAsPercentage,
        showCollapsedView: true,
        showOpenView: true,
        id: 'annual',
        classInfoValue: 'values-bold',
        keyIcon: 'coronita:help',
        eventModal: this.modalEventNames.ANNUAL_RATE
      },
      {
        key: 'oc-loan-offer-page-cat-rate',
        value: this.t('oc-loan-offer-page-without-iva', '', {tax: catRateValue}),
        showCollapsedView: true,
        showOpenView: true,
        classInfoValue: 'values-bold',
        id: 'cat-rate',
        keyIcon: 'coronita:help',
        eventModal: this.modalEventNames.CAT
      }
    ];
    keyValues = revireRateValueAsPercentage === undefined ? [
      {
        key: 'oc-loan-offer-page-list-interest-rate-1',
        value: mensualRateValueAsPercentage,
        showCollapsedView: true,
        classInfoValue: 'values-bold',
        showOpenView: true,
        id: 'monthly',
      },
      {
        key: 'oc-loan-offer-page-list-interest-rate-2',
        value: annualRateValueAsPercentage,
        showCollapsedView: true,
        showOpenView: true,
        id: 'annual',
        classInfoValue: 'values-bold',
        keyIcon: 'coronita:help',
        eventModal: this.modalEventNames.ANNUAL_RATE
      },
      {
        key: 'oc-loan-offer-page-cat-rate',
        value: this.t('oc-loan-offer-page-without-iva', '', {tax: catRateValue}),
        showCollapsedView: true,
        showOpenView: true,
        classInfoValue: 'values-bold',
        id: 'cat-rate',
        keyIcon: 'coronita:help',
        eventModal: this.modalEventNames.CAT
      }
    ] : keyValues;
    this.stepLoanOfferObject = {
      headerContent: {
        image: this.pathsToImages.headerContent,
        headerDescription: headerDescriptionLocale
      },
      summaryTexts: {
        summaryAmount: 'oc-loan-offer-page-title-collapsed'
      },
      keyInfoPayment: [
        {
          id: 'monthly-payment',
          key: this.t('oc-loan-offer-page-collapsed-view-installment'),
          value: loanBreakdownInstallmentValueAsAmount,
        },
        {
          id: 'term',
          key: this.t('oc-loan-offer-page-collapsed-view-term'),
          value: `${suggestedTermValue} ${this.t(frecuencyLocale)}`,
        }
      ],
      principalList: [
        {
          id: 'main-list',
          title: 'oc-loan-offer-page-principal-lits-benefits',
          class: 'medium-blue',
          icon: true,
          lists: [
            'oc-loan-offer-page-list-benefit-1',
            'oc-loan-offer-page-list-benefit-2',
            'oc-loan-offer-page-list-benefit-3'
          ]
        }
      ],
      amountData: {
        amountDefault: suggestedAmountValue,
        amountMin: minimumAmountValue,
        amountMax: maximumAmountValue,
        iconCode: 'coronita:close',
        label: 'oc-loan-offer-page-input-label',
      },
      errorMaxText: 'oc-loan-offer-page-maximun-amount-text',
      errorMinText: 'oc-loan-offer-page-minimun-amount-text',
      sliderProperty: null,
      keyInfo: [
        {
          id: 'rates-cost',
          title: 'oc-loan-offer-page-rates-and-costs',
          keyValues: keyValues
        }
      ],
      customMessage: {
        message: `${this.t(productTypeLocale)}<br><strong>${this.t('oc-loan-offer-page-cat-acronym')}${catRateValue}%</strong>${this.t('oc-loan-offer-page-custom-label')}${moment(catRate.calculationDate).format('LL')}${this.t('oc-loan-offer-page-custom-validity')}<br>${this.t('oc-loan-offer-page-custom-info')}`,
        top: true
      },
      stickyPayload: {
        monthlyPayment: loanBreakdownInstallmentValue,
        paymentText: 'oc-loan-offer-page-sticky-amount-top',
        secondPaymentText: 'oc-loan-offer-page-sticky-amount-bottom'
      },
      middleSeparator: true
    };

    if (this.c(this.sampleAmortizationScheduleDocument, productNameKey)) {
      this.stepLoanOfferObject.amortizationScheduleSample = {
        divisionTop: true,
        divisionBottom: true,
        items: [ {
          id: productNameKey,
          text: this.t('oc-loan-offer-page-amortization-schedule-sample-text'),
          icon: 'coronita:pdf',
          message: {
            type: 'info',
            icon: 'coronita:info',
            text: this.t('oc-loan-offer-page-amortization-schedule-sample-info'),
            iconSize: '18',
            class: 'help'
          }
        } ]
      };
    }

    if (allowedTermsRange.length < 2) {
      this.stepLoanOfferObject.amountData.term = {
        key: 'oc-loan-offer-page-term-text',
        value: suggestedTermValue + ' ' + this.t(frecuencyLocale),
        class: 'value-bold button-space'
      };
    } else {
      this.stepLoanOfferObject.sliderProperty = {
        min: 0,
        max: allowedTermsRange.length - 1,
        snaps: Array.from(Array(allowedTermsRange.length).keys()),
        arrayValues: allowedTermsRange,
        unit: this.t(frecuencyLocale),
        step: 1
      };
      this.stepLoanOfferObject.sliderSelected = allowedTermsRange.indexOf(suggestedTermValue);
    }
    this.stepLoanOfferObject.couponData = this.couponDataReceived;
  }

  /**
   * Set insurance amount (NOM) and configurate step properties
   */
  _addInsuranceAmountToStepLoanOffer() {
    const { productValueAsAmount, isNOM01, productValue } = this.loanOfferProcessor;
    let localeNameForKey;
    let eventModalName;
    this.currentInsuranceAmount = productValue;
    if (isNOM01) {
      localeNameForKey = 'oc-loan-offer-page-costs-insurance-and-unemployment';
      eventModalName = this.modalEventNames.INSURANCE_AND_UNEMPLOYMENT;
    } else {
      localeNameForKey = 'oc-loan-offer-page-costs-insurance';
      eventModalName = this.modalEventNames.INSURANCE;
    }
    let insurance = {
      key: localeNameForKey,
      value: productValueAsAmount,
      keyIcon: 'coronita:help',
      showCollapsedView: false,
      showOpenView: true,
      eventModal: eventModalName,
      id: 'insurance',
    };
    if (this.c(this.stepLoanOfferObject, 'keyInfo') && this.c(this.stepLoanOfferObject, 'principalList') && this.c(this.stepLoanOfferObject, 'keyInfoPayment')) {
      this.findField(this.stepLoanOfferObject.keyInfo, 'rates-cost').keyValues.push(insurance);
      this.findField(this.stepLoanOfferObject.principalList, 'main-list').lists.push('oc-loan-offer-page-list-benefit-insurance');
      this.stepLoanOfferObject.keyInfoPayment.push({
        key: 'oc-loan-offer-page-costs-insurance-success',
        value: productValueAsAmount,
        id: 'insurance'
      });
      this.stepLoanOfferObject.keyInfo.push({
        info: {
          message: 'oc-loan-offer-page-message-info-insurance',
          iconSize: 24,
          line: true
        }
      });
    }
  }

  /**
   * Validate and set configuration comission and revire rate in steps
   */
  _addCommissionToStepLoanOffer() {
    const { commissionRevireValueAsPercentage, commissionRevireValue, commissionValue, revireRate, commissionValueAsPercentage } = this.loanOfferProcessor;
    this._isComissionRevire = !!commissionRevireValue && commissionRevireValue < commissionValue;
    this._dispatch('send-improved-offer-type', this._isComissionRevire);
    let commissionKeyValue = {
      key: 'oc-loan-offer-page-costs-commission',
      value: this.couponRedeemed ? commissionRevireValueAsPercentage : commissionValueAsPercentage,
      keyIcon: 'coronita:help',
      showCollapsedView: false,
      showOpenView: true,
      eventModal: this.modalEventNames.COMMISSION,
      id: 'cost1',
    };
    if (this.c(this.stepLoanOfferObject, 'keyInfo') && this.c(this.stepLoanOfferObject, 'keyInfoPayment')) {
      this.findField(this.stepLoanOfferObject.keyInfo, 'rates-cost').keyValues.push(commissionKeyValue);
      this.stepLoanOfferObject.keyInfoPayment.push(commissionKeyValue);

      this.stepLoanOfferObject.keyInfo.push({
        info: {
          message: 'oc-loan-offer-page-message-info-commission',
          iconSize: 24,
          line: true
        },
        id: 'comission'
      });
    }

    if (revireRate && this._isComissionRevire) {
      delete this.findField(this.stepLoanOfferObject.keyInfo, 'rates-cost').promotion;
      this._addImprovedCommissionAndRateToStepLoanOffer();
    } else if (this._isComissionRevire && this.isPercentOcLoanRevire) {
      this._addCommissionPromotionToStepLoanOffer();
    }
  }

  /**
   * Validate and set configuration comission and revire rate comparative table
   */
  _addImprovedCommissionAndRateToStepLoanOffer() {
    const {
      commissionValueAsPercentage, commissionRevireValueAsPercentage,
      annualRateValueAsPercentage, revireRateValueAsPercentage
    } = this.loanOfferProcessor;

    if (this.c(this.stepLoanOfferObject, 'keyInfo') && this.findField(this.c(this.stepLoanOfferObject, 'keyInfo'), 'rates-cost')) {
      let rateAndCost = this.findField(this.c(this.stepLoanOfferObject, 'keyInfo'), 'rates-cost');
      let annual = this.findField(rateAndCost.keyValues, 'annual');

      rateAndCost.promotionAlt = {
        imagePath: this.pathsToImages.promotion,
        title: this.t('oc-loan-offer-page-promotion-title'),
        description: this.t('oc-loan-offer-page-promotion-description'),
      };

      let deletedElements = rateAndCost.keyValues.splice(1, 1);
      rateAndCost.keyValues.unshift(deletedElements[0]);
      rateAndCost.title = 'oc-loan-offer-page-title-taxes';
      this.findField(rateAndCost.keyValues, 'cat-rate').showOpenView = false;
      this.findField(rateAndCost.keyValues, 'cost1').showOpenView = false;

      annual.tableComparison = [
        {
          key: this.t('oc-loan-offer-page-promotion-normal'),
          value: annualRateValueAsPercentage
        },
        {
          key: this.t('oc-loan-offer-page-promotion-improve'),
          value: revireRateValueAsPercentage,
          class: 'bold'
        }
      ];

      annual.value = revireRateValueAsPercentage;
      annual.hideValueInOpenView = true;
    }

    if (this.c(this.stepLoanOfferObject, 'keyInfo') && this.findField(this.c(this.stepLoanOfferObject, 'keyInfo'), 'comission')) {
      let comission = this.findField(this.c(this.stepLoanOfferObject, 'keyInfo'), 'comission');

      const keyValues = [];
      let commissionKeyValue = {
        id: 'commision-key',
        key: 'oc-loan-offer-page-costs-commission',
        value: commissionRevireValueAsPercentage,
        keyIcon: 'coronita:help',
        showCollapsedView: false,
        showOpenView: true,
        eventModal: this.modalEventNames.COMMISSION,
        tableComparison: [
          {
            key: this.t('oc-loan-offer-page-promotion-normal'),
            value: commissionValueAsPercentage
          },
          {
            key: this.t('oc-loan-offer-page-promotion-improve'),
            value: commissionRevireValueAsPercentage,
            class: 'bold'
          }
        ]
      };

      keyValues.push(commissionKeyValue);
      comission.keyValues = keyValues;
      comission.title = 'oc-loan-offer-page-costs-title';
      this.findField(comission.keyValues, 'commision-key').hideValueInOpenView = true;
      this.set('stepLoanOfferObject.keyInfoPayment.2.value', commissionRevireValueAsPercentage);
    }
  }

  /**
   * Add rate promotion and set configuration to step loan offer detils
   */
  _addRatePromotionToStepLoanOffer() {
    const { annualRateValueAsTruncated, revireRateValueAsTruncated } = this.loanOfferProcessor;
    this.set('stepLoanOfferObject.mainText', {
      title: this.t('oc-loan-offer-page-main-title'),
      description: this.t('oc-loan-offer-page-main-description')
    });
    this.set('stepLoanOfferObject.eventName', 'revire-help-modal-info');
    this.set('stepLoanOfferObject.showTableComparative', {
      titleHeader: {
        title: this.t('oc-loan-offer-page-tax-title-comparative'),
        class: 'header-title'
      },
      active: true,
      currencyCode: '%',
      firstTitle: this.t('oc-loan-offer-page-promotion-annual-rate-first-element-title'),
      secondTitle: this.t('oc-loan-offer-page-promotion-annual-rate-second-element-title'),
      firstAmount: annualRateValueAsTruncated,
      secondAmount: revireRateValueAsTruncated,
      firstSlot: this.t('oc-loan-offer-page-promotion-annual-rate-first-element-footer'),
      secondSlot: this.t('oc-loan-offer-page-promotion-annual-rate-second-element-footer')
    });
    this.set('stepLoanOfferObject.comparativeClass', 'promotion-comparative');
    this.set('stepLoanOfferObject.codeCouponData', {
      active: true,
      config: {
        title: this.t('oc-loan-offer-page-unique-promotion'),
        titleIcon: 'coronita:help'
      },
      items: [
        {
          isImage: true,
          altImg: this.t('oc-loan-offer-page-alt-img'),
          moreInfo: this.t('oc-loan-offer-page-banner-time-out'),
          disabled: true,
          id: 'coupon-offer',
          src: this.pathsToImages.promotion,
          titleText: this.t('oc-loan-offer-page-banner-title'),
          titleClass: 'monochrome',
          text: this.t('oc-loan-offer-page-banner-description'),
        }
      ]
    });
    const promotionApplied = {
      keyCouponInfo: [
        {
          key: this.t('oc-loan-offer-page-promotion-applied'),
          showCollapsedView: true,
          showOpenView: false,
          classInfoValue: 'status',
          id: 'coupon-indicator',
          keyCollapsedIcon: 'coronita:correct',
        }
      ],
      applyPromotion: true,
    };
    this._dispatch('send-promotion-applied', promotionApplied);
  }

  /**
   * Add rate comission promotion and set configuration to show in step loan offer detils
   */
  _addCommissionPromotionToStepLoanOffer() {
    const { commissionValueAsTruncated, commissionRevireValueAsTruncated } = this.loanOfferProcessor;
    this.set('stepLoanOfferObject.mainText', {
      title: this.t('oc-loan-offer-page-main-title'),
      description: this.t('oc-loan-offer-page-main-description')
    });
    this.set('stepLoanOfferObject.comparativeClass', 'promotion-comparative');
    this.set('stepLoanOfferObject.eventName', 'comission-revire-help-modal-info');
    this.set('stepLoanOfferObject.showTableComparative', {
      titleHeader: {
        title: this.t('oc-loan-offer-page-comission-title-comparative'),
        class: 'header-title'
      },
      active: true,
      currencyCode: '%',
      firstTitle: this.t('oc-loan-offer-page-comission-first-comparative-title'),
      secondTitle: this.t('oc-loan-offer-page-comission-second-comparative-title'),
      firstAmount: commissionValueAsTruncated,
      secondAmount: commissionRevireValueAsTruncated,
      firstSlot: this.t('oc-loan-offer-page-comission-first-comparative-footer'),
      secondSlot: this.t('oc-loan-offer-page-comission-second-comparative-footer')
    });
    this.set('stepLoanOfferObject.codeCouponData', {
      active: true,
      config: {
        title: this.t('oc-loan-offer-page-unique-promotion'),
        titleIcon: 'coronita:help'
      },
      items: [
        {
          isImage: true,
          altImg: this.t('oc-loan-offer-page-alt-img'),
          moreInfo: this.t('oc-loan-offer-page-banner-time-out'),
          disabled: true,
          id: 'coupon-offer',
          src: this.pathsToImages.promotion,
          titleText: this.t('oc-loan-offer-page-comission-banner-title'),
          titleClass: 'monochrome',
          text: this.t('oc-loan-offer-page-comission-banner-description'),
        }
      ]
    });
    const promotionApplied = {
      keyCouponInfo: [
        {
          key: this.t('oc-loan-offer-page-promotion-applied'),
          showCollapsedView: true,
          showOpenView: false,
          classInfoValue: 'status',
          id: 'coupon-indicator',
          keyCollapsedIcon: 'coronita:correct',
        }
      ],
      applyPromotion: true,
    };
    this._dispatch('send-promotion-applied', promotionApplied);
  }

  /**
   * Add and set configuration to step checklist documents
   */
  _setStepCardChecklistBasis() {
    this.stepCardChecklistObject = {
      checkboxList: [
        {
          valid: false,
          active: true,
          buttonText: 'oc-loan-offer-page-terms-checkbox-1',
        },
        {
          valid: false,
          active: true,
          buttonText: 'oc-loan-offer-page-terms-checkbox-2'
        }
      ],
      pdfData: [
        {
          icon: 'coronita:document',
          text: 'oc-loan-offer-page-terms-bureau-autorization',
          id: '01',
          type: 'credit-bureau'
        },
        {
          icon: 'coronita:pdf',
          text: 'oc-loan-offer-page-terms-and-conditions',
          id: '02',
          type: 'terms-and-conditions'
        }
      ]
    };
  }

  /**
   * Add and set configuration to step checklist insurance documents
   */
  _addInsuranceToStepCardChecklist() {
    const { productValueAsAmount } = this.loanOfferProcessor;
    this.stepCardChecklistObject.checkboxList.push({
      id: 'insurance',
      valid: false,
      active: true,
      buttonText: 'oc-loan-offer-page-terms-checkbox-3-insurance',
      preaccepted: false,
      preacceptedInfoText: `${this.t('oc-loan-offer-page-terms-checkbox-3-part-1-insurance')}${productValueAsAmount}${this.t('oc-loan-offer-page-terms-checkbox-3-part-2-insurance')}`,
      className: 'custom-message-input help-message'
    });
    this.stepCardChecklistObject.pdfData.push({
      icon: 'coronita:pdf',
      text: 'oc-loan-offer-page-terms-pdf-text-insurance',
      id: '03',
      type: 'insurance-coverage'
    });
  }

  /**
   * Generate Processor configuration of baseObject
   * @param {Object} baseObject
   * @param {Object} processorConfig
   */
  _generateProcessor(baseObject, processorConfig) {
    const processor = {};
    const {
      productConfig = null, dataHandling = null, afterDataHandling = null
    } = processorConfig;

    if (productConfig) {
      this.__handleProductConfig(baseObject, processor, productConfig);
    }

    if (dataHandling) {
      this.__handleData(baseObject, processor, dataHandling);
    }

    if (afterDataHandling) {
      this.__handleProccessedData(processor, afterDataHandling);
    }
    return processor;
  }

  /**
   * Set handle data product configuration of base object
   * @param {Object} baseObject
   * @param {Object} processor
   * @param {Object} processorConfig
   */
  __handleProductConfig(baseObject, processor, productConfig) {
    const {
      pathToProductName, handling: productHandling, productPropertyName, productNameLiterals
    } = productConfig;
    this.__extractAndProcess(baseObject, processor, productPropertyName, productHandling);

    for (const productNameLiteralKey in productNameLiterals) {
      if (Object.prototype.hasOwnProperty.call(productNameLiterals, productNameLiteralKey)) {
        const productName = productNameLiterals[productNameLiteralKey];
        const processorProductName = this.c(processor, `${productPropertyName}.${pathToProductName}`);
        if (processorProductName === productName) {
          processor.productNameKey = productNameLiteralKey;
        }
        Object.defineProperty(processor, `is${productNameLiteralKey}`, {
          get: function() {
            return processorProductName === productName;
          }
        });
      }
    }
  }

  /**
   * Set handle data
   * @param {Object} baseObject
   * @param {Object} processor
   * @param {Object} dataHandling
   */
  __handleData(baseObject, processor, dataHandling) {
    for (const basePropertyName in dataHandling) {
      if (Object.prototype.hasOwnProperty.call(dataHandling, basePropertyName)) {
        const handlingConfig = dataHandling[basePropertyName];
        if (Object.prototype.hasOwnProperty.call(handlingConfig, 'conditionalByProduct')) {
          if (handlingConfig.conditionalByProduct.includes(processor.productNameKey)) {
            this.__extractAndProcess(baseObject, processor, basePropertyName, handlingConfig);
          }
        } else {
          this.__extractAndProcess(baseObject, processor, basePropertyName, handlingConfig);
        }
      }
    }
  }

  /**
   * Set handle processed data
   * @param {Object} processor
   * @param {Object} afterDataHandling
   */
  __handleProccessedData(processor, afterDataHandling) {
    const { mapped = null } = afterDataHandling;
    if (mapped) {
      for (const mappedPropertyName in mapped) {
        if (Object.prototype.hasOwnProperty.call(mapped, mappedPropertyName)) {
          const { map, pathToMapper } = mapped[mappedPropertyName];
          processor[mappedPropertyName] = map[this.c(processor, pathToMapper)];
        }
      }
    }
  }

  /**
   * Set perform custom function
   * @param {String} firstArg
   * @param {Object}
   */
  __performCustomFunction(firstArg, { targetFunctionName, additionalArgs = [], bindContext = false }) {
    return this[targetFunctionName].apply(bindContext ? this : null, [firstArg, ...additionalArgs]);
  }

  /**
   * Extract the data
   * @param {Object} baseObject
   * @param {Object} processor
   * @param {Object} propertyName
   * @param {Object} handlingConfig
   */
  __extractAndProcess(baseObject, processor, propertyName, handlingConfig) {
    const performCustomFunction = this.__performCustomFunction.bind(this);
    processor[propertyName] = performCustomFunction(baseObject, handlingConfig.extraction);
    if (processor[propertyName] && Object.prototype.hasOwnProperty.call(handlingConfig, 'processing')) {
      const propertyBaseValue = processor[propertyName];
      for (const suffixName in handlingConfig.processing) {
        if (Object.prototype.hasOwnProperty.call(handlingConfig.processing, suffixName)) {
          const processedPropertyName = `${propertyName}${this.capitalize(suffixName)}`;
          const { customHandling = null, pathToValue = '', formats = [] } = handlingConfig.processing[suffixName];
          let propertyValue;
          if (pathToValue && !customHandling) {
            propertyValue = this.c(propertyBaseValue, pathToValue);
          }
          if (customHandling && !pathToValue) {
            propertyValue = performCustomFunction(propertyBaseValue, customHandling);
          }
          Object.defineProperty(processor, processedPropertyName, {
            get: function() {
              return propertyValue;
            }
          });
          if (formats.length > 0) {
            for (const formatConfig of formats) {
              Object.defineProperty(processor, `${processedPropertyName}As${this.capitalize(formatConfig.formatName)}`, {
                get: function() {
                  return performCustomFunction(propertyValue, formatConfig);
                }
              });
            }
          }
        }
      }
    }
  }

  /**
   * The user focus in amount input hide sticky and set configuration properties
   */
  onAmountInputFocus() {
    if (this._amountInputIsFilled && this.currentSelectedAmount === undefined) {
      const propertiesToSync = [ 'amountData' ];
      const pathsToNotifyStepLoan = [ 'amountData.amountDefault' ];
      this.stepLoanOfferObject.amountData.amountDefault = this.defaultAmount;
      this._syncComponentObject({
        objectComponentName: 'stepLoanOfferObject',
        properties: propertiesToSync,
        resetBeforeSet: true,
        pathsToNotify: pathsToNotifyStepLoan
      });
    }
  }

  /**
   * The user blur with valid amount input and configurate properties
   * @param {Number} amountValue
   */
  onAmountInputBlurWithValidAmount(amountValue) {
    if (!amountValue) {
      return this._dispatch('invalid-amount-in-offer', 1);
    }
    this.showStickyContainer();
    const min = this.c(this.stepLoanOfferObject, 'amountData.amountMin');
    const max = this.c(this.stepLoanOfferObject, 'amountData.amountMax');
    const amountInRange = amountValue >= min && amountValue <= max ? true : false;
    this._isValidAmountInInput = true;
    if (amountValue && typeof amountValue === 'number' && amountInRange) {
      this._lastValidAmountSelected = amountValue;
      this._isTermSimulation = false;
      this._requestLoanOfferSimulation();
    }
  }

  /**
   * Validate and change the value of current selected
   */
  onAmountInputBlur() {
    this._amountInputIsFilled = !!this.currentSelectedAmount;
  }

  /**
   * Select a option to validate the principal account
   * Global caché storage or Finantial Overview caché
   * @param {Object} product
   */
  _selectAccount(product) {
    if (this.globalCacheStorage && Object.prototype.hasOwnProperty.call(this.globalCacheStorage, 'data') && Object.prototype.hasOwnProperty.call(this.globalCacheStorage.data, 'contracts')) {
      this._selectMainAccountfinantial(product);
    }
    if (this.globalCacheStorage && Object.prototype.hasOwnProperty.call(this.globalCacheStorage, 'dashboard') && Object.prototype.hasOwnProperty.call(this.globalCacheStorage.dashboard, 'accounts')) {
      this._setProductSelectorAccount(product);
    }
  }

  /**
   * Search on finantial overview cache for the account in which the loan will be deposited
   * @param {Object} product
   */
  _selectMainAccountfinantial({ name: productName }) {
    let accounts = this.globalCacheStorage.data.contracts;
    const isNOMSubproduct = productName.indexOf('NOM') > -1 || productName === 'PBCCMPPI03' || productName.indexOf('MAG') > -1;

    if (accounts && accounts.length > 0) {
      let principalAccount = accounts.find(account => {
        if (account.detail.indicators) {
          if (isNOMSubproduct) {
            return account.detail.indicators.findIndex(indicator => indicator.id === 'IS_PRINCIPAL_ACCOUNT' && indicator.isActive && indicator.id === 'IS_PAYROLL_ACCOUNT' && indicator.isActive);
          } else {
            return account.detail.indicators.findIndex(indicator => indicator.id === 'IS_PRINCIPAL_ACCOUNT' && indicator.isActive);
          }
        }
      });
      if (!principalAccount) {
        principalAccount = accounts[0];
      }
      this.set('principalAccount', principalAccount);
    }

    const currentBalances = this.principalAccount.detail.specificAmounts[0].amounts[0];
    this.setMainProductAccount(currentBalances);
  }

  /**
   * Search on global cache storage for the account in which the loan will be deposited
   * @param {String} productName
   * @public
   */
  _setProductSelectorAccount({ name: productName }) {
    const cacheStorageHasAccounts = this.globalCacheStorage && Object.prototype.hasOwnProperty.call(this.globalCacheStorage, 'dashboard') && Object.prototype.hasOwnProperty.call(this.globalCacheStorage.dashboard, 'accounts');
    if (cacheStorageHasAccounts) {
      const { accounts } = this.globalCacheStorage.dashboard;
      const isNOMSubproduct = productName.indexOf('NOM') > -1 || productName === 'PBCCMPPI03' || productName.indexOf('MAG') > -1;
      let principalAccount;
      if (accounts && accounts.length > 0) {
        principalAccount = accounts.find(account => {
          if (account && this.c(account, 'status.id') === 'ACTIVE') {
            if (Object.prototype.hasOwnProperty.call(account, 'indicators')) {
              if (isNOMSubproduct) {
                return account.indicators.findIndex(indicator => indicator.id === 'IS_PRINCIPAL_ACCOUNT' && indicator.isActive && indicator.id === 'IS_PAYROLL_ACCOUNT' && indicator.isActive) > -1;
              } else {
                return account.indicators.findIndex(indicator => indicator.id === 'IS_PRINCIPAL_ACCOUNT' && indicator.isActive) > -1;
              }
            } else {
              const isPrincipalAccount = account.principalAccount.id === 'IS_PRINCIPAL_ACCOUNT' && account.principalAccount.isActive;
              let finalValidation;
              if (isNOMSubproduct) {
                let isPayrollAccount = account.payroll.id === 'IS_PAYROLL_ACCOUNT' && account.payroll.isActive;
                finalValidation = isPrincipalAccount && isPayrollAccount;
              } else {
                finalValidation = isPrincipalAccount;
              }
              return finalValidation;
            }
          }
        });
        if (!principalAccount) {
          principalAccount = accounts[0];
        }
        this.set('principalAccount', principalAccount);
      }
    }
    const currentBalance = this.c(this.principalAccount, 'availableBalance.currentBalances.0');
    this.setMainProductAccount(currentBalance);
  }

  /**
   * Set properties and build an object to show account it on 'cells-step-product-selector' component
   * @event set-principal-account
   */
  setMainProductAccount(currentBalance) {
    const productSelectorProducts = [
      {
        name: this.principalAccount.alias || this.c(this.principalAccount, 'accountFamily.name'),
        id: '2002',
        description: {
          value: this.principalAccount.number,
          masked: true
        },
        primaryAmount: {
          amount: this.c(currentBalance, 'amount') || '-',
          currency: this.localCurrency,
          label: 'oc-loan-offer-page-account-available-balance'
        }
      }
    ];
    this._dispatch('set-principal-account', productSelectorProducts);
  }

  /**
   * Open the insurance modal information
   */
  openInsuranceModal() {
    this.targetDocumentConfig = this.insuranceDocumentConfig;
    this._openBusinessDocument();
  }

  /**
   * Open the terms and consitions modal with the correct Id
   */
  openTermsAndConditionModal() {
    this.targetDocumentConfig = this.termsAndConditionsDocumentConfig;
    this._openBusinessDocument();
  }

  /**
   * Validate the documents and their length
   * find or request the document list
   */
  _openBusinessDocument() {
    const haveListOfBusinessDocuments = this._businessDocuments && this._businessDocuments.length > 0;
    if (haveListOfBusinessDocuments) {
      this._findBusinessDocumentToShow();
    } else {
      this._requestBusinessDocumentsList();
    }
  }

  /**
   * Set the params to request the business document list
   */
  _requestBusinessDocumentsList() {
    this.showSpinner();
    this.attemptsConfig.nextAttemptFunction = this._requestBusinessDocumentsList.bind(this);
    const params = {
      'product.id': this.businessDocumentsProductId,
      'subproduct.id': this.c(this.loanOfferProcessor, 'product.name')
    };
    this.$.apisBusinessDocuments.getBusinessDocuments(params);
  }

  /**
   * Method to receip response data of Business Document list
   * @param {Object} response Response business document
   */
  onGetBusinessDocumentsSuccess(payload) {
    this.closeSpinner();
    this.attemptsConfig.resetAttempts();
    this._businessDocuments = payload.detail;
    this._findBusinessDocumentToShow();
  }

  /**
   * Method to find the document id in configuration target
   * Do the request to the specific document
   */
  _findBusinessDocumentToShow() {
    const targetBusinessDocument = this._businessDocuments.find(businessDocument => this.targetDocumentConfig.possibleDocumentsTemplateId.find(id => this.t(id) === this.get('documentTemplate.id', businessDocument)));
    if (targetBusinessDocument && targetBusinessDocument.id) {
      this.targetBusinessDocumentTemplateId = targetBusinessDocument.id;
      this._requestBusinessDocument();
    }
  }

  /**
   * Calls service post document
   */
  _requestBusinessDocument() {
    this.showSpinner();
    this.attemptsConfig.nextAttemptFunction = this._requestBusinessDocument.bind(this);
    const body = {
      documentTemplate: {
        id: this.targetBusinessDocumentTemplateId,
        templateType: {
          id: 'PDF'
        }
      }
    };
    this.$.apisBusinessDocuments.postBusinessDocuments(body);
  }

  /**
   * Receip the response and change the document format
   * @param {Object} eventDocument of Response request
  */
  onPostBusinessDocumentsSuccess(eventDocument) {
    this.closeSpinner();
    this.attemptsConfig.resetAttempts();
    this._dispatch('set-pdf-modal-title', this.targetDocumentConfig.modalTitleLocale);
    this.successBasePdf(eventDocument.detail);
  }

  /**
   * @desc  get the base64 of the answer
   * @param {String} responseBase
  */
  successBasePdf(responseBase) {
    let dato = this.validateBasePdf(responseBase);
    var base64;
    if (this.native) {
      base64 = this.validateBasePdf(this.get('data.parts.0.content', responseBase));
    } else {
      let startBase64 = dato.indexOf('>') + 3;
      let endBase64 = dato.indexOf('=') + 3;
      if (endBase64 <= 2) {
        let foie = dato.substring(startBase64);
        endBase64 = foie.indexOf('-');
      }
      base64 = dato.substring(startBase64, endBase64);
    }
    this.set('baseSrc', base64);
    this._dispatch('show-document-event', {
      value: base64.replace(/(\r\n|\n|\r)/gm, ''),
      title: this.t(this.targetDocumentConfig.modalTitleLocale),
      mimeType: 'application/pdf',
      headerColor: 'FFFFFFFF',
      tintColor: 'FF072146',
      canShare: false,
      titleColor: 'FF072146',
      blackStatusBar: true,
    });
  }

  /**
   * @Desc Validate content Base64
   * @param {String} responseBase
  */
  validateBasePdf(responseBase) {
    let uri = responseBase;
    try {
      let response;
      if (uri !== window.atob(uri)) {
        response = window.atob(uri);
      }
      return response;
    } catch (e) {
      return uri;
    }
  }

  /**
   * Dispatch Event for call me back button text
   * @event set-secondary-text-button
   */
  _secondaryText() {
    const text = this.assistanceAvailability ? 'call-me-back-assistance-manager-secondary-button' : 'oc-loan-offer-page-call-me-back';
    this._dispatch('set-secondary-text-button', { secondaryButtonText: text });
  }

  /**
   * Flag in true form call action from header
   * Onclick, dispatch event for call me back page
   */
  onClickCallHeader() {
    this.callActionHeader = true;
    this.fireCallMeBackPage();
  }

  /**
   * Dispatch Event to go call me back page
   * @event fire-call-me-back
   */
  fireCallMeBackPage() {
    if (this.assistanceAvailability) {
      this._dispatch('call-personal-advisor-number', { phoneNumberAdvisor: this.phoneNumberAdvisor, callActionHeader: this.callActionHeader });
      this.callActionHeader = false;
    } else {
      const { offerId, customerType } = this;
      if (offerId) {
        this._dispatch('fire-call-me-back', { offerId, customerType, disabledInactiveBehavior: true });
      }
    }
  }

  /**
   * Validation to do the perform term simulation
   * do the request to simulation service
   * @param {Number} termValue
   */
  performTermSimulation(termValue) {
    if (!this._simulationRebootDone) {
      if (termValue !== this._lastValidTermSelected && termValue !== this.lastSimulatedTerm) {
        const isAnAllowedTerm = this.loanOfferProcessor.allowedTermsRange && this.loanOfferProcessor.allowedTermsRange.includes(termValue);
        if (isAnAllowedTerm) {
          this._lastValidTermSelected = termValue;
          this._isTermSimulation = true;
          this._requestLoanOfferSimulation();
        }
      }
    } else {
      this._simulationRebootDone = false;
    }
  }

  /**
   * Method to validate the term value and the range when slider change
   * @param {Number} allowedTermsIndex
   */
  onSliderInputCurrentValueChange(allowedTermsIndex) {
    this.lastSliderValueIndex = allowedTermsIndex;
    if (!this.sliderInputDragStatus) {
      const termValue = this.loanOfferProcessor.allowedTermsRange[allowedTermsIndex];
      if (termValue && typeof termValue === 'number') {
        this.performTermSimulation(termValue);
      }
    }
  }

  /**
   * calls the onSliderInputCurrentValueChange method when the slider stops dragging
   * @param {Number} value
   * @param {Number} oldValue
   */
  _sliderDragStatus(value, oldValue) {
    if (!value && oldValue) {
      this.onSliderInputCurrentValueChange(this.lastSliderValueIndex);
    }
  }

  /**
   * Method to disable sticky container
   * hide sticky
   */
  hideStickyContainer() {
    this._syncComponentObject({
      objectComponentName: 'stepLoanOfferObject',
      properties: { enableSticky: false }
    });
  }

  /**
   * Method to enable sticky container
   * show sticky
   */
  showStickyContainer() {
    this._syncComponentObject({
      objectComponentName: 'stepLoanOfferObject',
      properties: { enableSticky: true }
    });
  }

  /**
   * Dispatch event to request simulation and the correct configuration body
   * @event simulate-offer
   */
  _requestLoanOfferSimulation() {
    const { isPPI04, commissionRevireValue } = this.loanOfferProcessor;
    this.showSpinner();
    this.attemptsConfig.nextAttemptFunction = this._requestLoanOfferSimulation.bind(this);
    let requestBody = {};
    let rates = undefined;
    if (this.couponRedeemed) {
      rates = [{
        rateType: {
          id: 'Tasa Cupon',
        },
        calculationDate: moment().format('YYYY-MM-DD'),
        mode: {
          id: 'PERCENTAGE'
        },
        unit: {
          percentage: this.couponRedeemedData.benefitType.percentage
        }
      },
      {
        rateType: {
          id: 'Comision Producto',
        },
        calculationDate: moment().format('YYYY-MM-DD'),
        mode: {
          id: 'PERCENTAGE'
        },
        unit: {
          percentage: isPPI04 ? commissionRevireValue : 0.0
        }
      }];
    }
    if (this.loanOfferProcessor.originId === 'ALT') {
      requestBody = {
        initialAmount: {
          amount: this._isValidAmountInInput ? this._lastValidAmountSelected : this._amountDefaultSimulate,
          currency: this.localCurrency
        },
        terms: {
          number: this._lastValidTermSelected,
          frequency: this.loanOfferProcessor.suggestedTerm.frequency
        }
      };
      if (this.couponRedeemed && rates) {
        requestBody.rates = rates;
        requestBody.operationType = {
          id: '2'
        };
      }
    }
    this._isValidAmountInInput = false;
    this._dispatch('simulate-offer', {
      offerId: this.offerId,
      requestBody
    });
  }

  /**
   * Receip the response of Simulation quotations
   * @event simulate-offer
   */
  onPostQuotationsSimulateSuccess(payload) {
    this.attemptsConfig.resetAttempts();
    this.atLeastOneSuccessfulSimulation = true;
    const { isPPI01, isNOM01,
      isNOM02, isMAG01, annualRateValueAsTruncated } = this.loanOfferProcessor;
    this.loanOfferSimulationProcessor = this._generateProcessor(payload, this.loanOfferSimulationProcessorConfig);

    this._updateInstallmentAmount();
    this._updateCatRate();
    if (this._isTermSimulation) {
      this.set('lastSimulatedTerm', this._lastValidTermSelected);
      this.sendBenefit({
        benefit: {
          description: '',
          currentBenefit: annualRateValueAsTruncated,
          benefitType: {
            benefitType: 'PERCENTAGE',
            percentage: annualRateValueAsTruncated,
          }
        },
        term: {
          number: this._lastValidTermSelected,
          frequency: this.loanOfferProcessor.suggestedTerm.frequency
        },
        offerId: this.offerId,
      });

      this._updateInitialAmount();
    } else {
      this.set('lastSimulatedAmount', this._lastValidAmountSelected);
    }
    if (isPPI01 || isNOM01 || isNOM02 || isMAG01) {
      this._updateInsurance();
    }
    this._firstInteraction = true;
    if (this._continuePressed) {
      this._dispatch('contine-have-been-pressed', { currentStep: 2});
    }
    this.closeSpinner();
  }

  /**
   * Method to update the installment amount when the simulate is completed
   * Set the new  installment amount values
   */
  _updateInstallmentAmount() {
    const {loanBreakdownInstallmentValue, loanBreakdownInstallmentValueAsAmount} = this.loanOfferSimulationProcessor;
    this._firstInteraction = false;
    this.set('currentMonthlyPayment', loanBreakdownInstallmentValue);
    this.findField(this.c(this.stepLoanOfferObject, 'keyInfoPayment'), 'monthly-payment').value = loanBreakdownInstallmentValueAsAmount;
    this.stepLoanOfferObject.stickyPayload.monthlyPayment = loanBreakdownInstallmentValue;
    this._syncComponentObject({
      objectComponentName: 'stepLoanOfferObject',
      properties: ['keyInfoPayment', 'stickyPayload'],
      pathsToNotify: ['keyInfoPayment.0.value', 'stickyPayload.monthlyPayment']
    });
  }

  /**
   * Method to update the initial amount when the simulate is completed
   * Set the new configuration values in steps
   */
  _updateInitialAmount() {
    const { initialAmountValue } = this.loanOfferSimulationProcessor;
    this.set('lastSimulatedAmount', initialAmountValue);
    this.defaultAmount = initialAmountValue;
    this.stepLoanOfferObject.amountData.amountDefault = initialAmountValue;
    this.stepLoanOfferObject.amountData.amountMax = initialAmountValue;
    this.findField(this.c(this.stepLoanOfferObject, 'keyInfoPayment'), 'term').value = `${this.lastSimulatedTerm} ${this.t(this.loanOfferProcessor.frecuencyLocale)}`;
    this._syncComponentObject({
      objectComponentName: 'stepLoanOfferObject',
      properties: ['keyInfoPayment', 'amountData'],
      resetBeforeSet: true,
      specificPropertiesToReset: [ 'amountData' ],
      pathsToNotify: ['amountData.amountDefault', 'amountData.amountMax', 'keyInfoPayment.1.value']
    });
  }

  _updateCatRate() {
    const { catRateValue } = this.loanOfferSimulationProcessor;
    const { productTypeLocale, catRate } = this.loanOfferProcessor;
    this.stepLoanOfferObject.keyInfo[0].keyValues[2].value = `${catRateValue}%`;
    this.stepLoanOfferObject.customMessage.message = `${this.t(productTypeLocale)}<br><strong>${this.t('oc-loan-offer-page-cat-acronym')}${catRateValue}%</strong>${this.t('oc-loan-offer-page-custom-label')}${moment(catRate.calculationDate).format('LL')}${this.t('oc-loan-offer-page-custom-validity')}<br>${this.t('oc-loan-offer-page-custom-info')}`;
    this._syncComponentObject({
      objectComponentName: 'stepLoanOfferObject',
      properties: ['keyInfo', 'customMessage'],
      resetBeforeSet: true,
      pathsToNotify: [
        'keyInfo.0.keyValues.2.value',
        'customMessage.message'
      ]
    });
  }

  /**
   * Update Insurance values when the simulate is completed
   * Set the new configuration values in steps
   */
  _updateInsurance() {
    const { productValue, productValueAsAmount } = this.loanOfferSimulationProcessor;
    this.currentInsuranceAmount = productValue;

    this.findField(this.c(this.stepLoanOfferObject, 'keyInfoPayment'), 'insurance').value = productValueAsAmount;
    let keys = this.findField(this.c(this.stepLoanOfferObject, 'keyInfo'), 'rates-cost');
    this.findField(keys.keyValues, 'insurance').value = productValueAsAmount;
    this.findField(this.c(this.stepCardChecklistObject, 'checkboxList'), 'insurance').preacceptedInfoText = `${this.t('oc-loan-offer-page-terms-checkbox-3-part-1-insurance')}${productValueAsAmount}${this.t('oc-loan-offer-page-terms-checkbox-3-part-2-insurance')}`;
    this.set('stepCardChecklistObject.checkboxList.2.valid', false);
    this.set('stepCardChecklistObject.active', false);
    this.set('stepCardChecklistObject.collapsed', false);
    this._syncComponentObject({
      objectComponentName: 'stepLoanOfferObject',
      properties: ['keyInfoPayment', 'keyInfo'],
      pathsToNotify: ['keyInfoPayment.2.value', 'keyInfo.0.keyValues.3.value']
    });
    this._syncComponentObject({
      objectComponentName: 'stepCardChecklistObject',
      properties: ['checkboxList', 'active', 'collapsed'],
      pathsToNotify: ['checkboxList.2.preacceptedInfoText', 'checkboxList.2.valid']
    });
  }

  /**
   * Build the body structure request to create a loan
   * @event create-loan
   */
  hireLoan() {
    this.showSpinner();
    this.attemptsConfig.nextAttemptFunction = this.hireLoan.bind(this);
    let rates = undefined;
    if (this.couponRedeemed) {
      rates = [ {
        rateType: {
          id: 'TASA_CUPON',
        },
        mode: {
          id: 'PERCENTAGE'
        },
        unit: {
          percentage: this.couponRedeemedData.benefitType.percentage
        }
      } ];
    }
    const requestBody = {
      offerId: this.offerId,
      contractingDate: moment().format('YYYY-MM-DD'),
      initialAmounts: [
        {
          amount: this.lastSimulatedAmount,
          currency: this.localCurrency
        }
      ],
      terms: {
        number: this.lastSimulatedTerm,
        frequency: this.loanOfferProcessor.suggestedTerm.frequency
      },
      purposeGroup: {
        id: this.loanOfferProcessor.purposeGroupId
      },
      isContractedByCoupon: this.couponRedeemed ? true : false,
      isContractedBySustainable: this._isSustainableLoan
    };
    if (this.couponRedeemed && rates) {
      requestBody.rates = rates;
    }
    this.newInitialAmount = this.get('initialAmounts.0.amount', requestBody);
    this._dispatch('create-loan', requestBody);
  }

  /**
   * Build the body structure request to create a loan
   * @event create-loan
   */
  onPostLoansSuccess(payload) {
    this.closeSpinner();
    this.dataSuccessLoan = payload;
    this.attemptsConfig.resetAttempts();
    this.postHiringConfig.performValidation(payload);
  }

  /**
   * Notify with a event the loan hiring case
   * @event notify-loan-hiring-case
   */
  transmitLoanHiringCase(payload = {}) {
    this._dispatch('notify-loan-hiring-case', { caseName: this.currentLoanHiringCaseName, payload });
  }

  /**
   * Fill in the configuration and data necessary for the hiring successful case
   * set with another method the compelte information
   */
  onSuccessHiringCase() {
    const className = 'oc-loan-offer-success';
    const headerClassName = 'header--dark-success';
    const splittedEmailByAtSign = (this._userContactEmail.contact || this.emailCache || '').split('@');
    const emailDomain = splittedEmailByAtSign.length > 1 ? splittedEmailByAtSign[1] : '';
    const { operationNumber } = this.loanOfferHiringProcessor;
    const propertiesToAdd = {
      avatarImgPath: this.pathsToImages.successCase,
      titleLocale: 'oc-loan-offer-page-success-title',
      topInfoIconMessageLocale: 'oc-loan-offer-page-success-message-1',
      folio: operationNumber === '' ? this.dataSuccessLoan.operationNumber : operationNumber,
      topInfoExtraElements: [
        {
          value: 'oc-loan-offer-page-success-message-2',
          musk: {
            value: this._userContactEmail.contact || this.emailCache,
            chars: emailDomain.length + 4,
            simbol: '•'
          },
          class: 'spacing oc-loan-offer-other-info-message'
        }
      ],
      type: 'success'
    };
    this.setPropertiesToSuccessPageComponents(className, headerClassName, propertiesToAdd);
  }

  /**
   * Get the customer contacts data and set the loan offer hiring confirguration
   * @param {object} responsePayload
   * @param {String} caseName
   * @event request-customer-contacts
   */
  getCustomerContacts(responsePayload, caseName) {
    this.showSpinner();
    this.postLoansServiceSuccessResponse = responsePayload;
    this.set('currentLoanHiringCaseName', caseName);
    this.loanOfferHiringProcessor = this._generateProcessor(responsePayload, this.loanOfferHiringProcessorConfig);
    let customerId = this.c(this.globalCacheStorage, 'customer.customerId');
    if (this.emailCache) {
      this.onCustomerContactsError();
    } else {
      this._dispatch('request-customer-contacts', {
        'customer-id': customerId
      });
    }
  }

  /**
   * Method to compute customer email
   * @param {Array} customerContactsData Contact data received from request response
   */
  _getContactEmail(customerContactsData = []) {
    return customerContactsData.find((contact) =>
      contact.contactType && contact.isChecked && contact.contactType.id === 'EMAIL'
    );
  }

  /**
   * Receip the response of customer contact request to set email user
   * Go to the Success hiring case
   */
  onCustomerContactsSuccess(data) {
    this.closeSpinner();
    this._userContactEmail = this._getContactEmail(data);
    this.onSuccessHiringCase();
  }

  /**
   * Receip the bad response of customer contact request
   * Go to the Success hiring case
   */
  onCustomerContactsError() {
    this.closeSpinner();
    this.onSuccessHiringCase();
  }

  /**
   * Validate if is Success hiring case
   * @param {object} responsePayload
   */
  isSuccessHiringCase(responsePayload) {
    const valueToCompare = this.c(responsePayload, this.postHiringConfig.customProps.valueToValidatePath);
    return this.postHiringConfig.customProps.successCaseValues.includes(valueToCompare);
  }

  /**
   * Set the configuration to show the pending hiring case
   * @param {object} responsePayload
   * @param {String} caseName
   */
  onPendingHiringCase(responsePayload, caseName) {
    this.postLoansServiceSuccessResponse = responsePayload;
    this.set('currentLoanHiringCaseName', caseName);
    this.loanOfferHiringProcessor = this._generateProcessor(responsePayload, this.loanOfferHiringProcessorConfig);
    const className = 'oc-loan-offer-success';
    const headerClassName = 'header--core';
    const propertiesToAdd = {
      avatarImgPath: this.pathsToImages.pendingCase,
      titleLocale: 'oc-loan-offer-page-pending-title',
      topInfoIconMessageLocale: 'oc-loan-offer-page-pending-message',
      type: 'core'
    };
    this.setPropertiesToSuccessPageComponents(className, headerClassName, propertiesToAdd);
  }

  /**
   * Validate if is Pending hiring case
   * @param {object} responsePayload
   */
  isPendingHiringCase(responsePayload) {
    const valueToCompare = this.c(responsePayload, this.postHiringConfig.customProps.valueToValidatePath);
    return this.postHiringConfig.customProps.pendingCaseValues.includes(valueToCompare);
  }

  /**
   * Method to set the data information in the configuration
   * Validate and set extra information
   * @event reset-operative
   * @event init-and-open-success-pag
   */
  setPropertiesToSuccessPageComponents(className = '', headerClassName = '', {
    avatarImgPath,
    titleLocale,
    topInfoIconMessageLocale,
    folio = '',
    topInfoExtraElements = [],
    extraProperties = null,
    type = ''
  }) {
    let folioForTopInfo = [];
    let sustainableLoanExtraInfo = [];
    const {
      productTypeLocale, frecuencyLocale,
      annualRateValueAsPercentageLoanOfferDetail, annualRateValue,
      revireRate, revireRateValueAsPercentage,
    } = this.loanOfferProcessor;
    const {
      contractingDate, loanAmount, termAmount, operationNumber,
      mensualRateValueAsPercentage, annualRateValueAsPercentage,
      isContractedBySustainable
    } = this.loanOfferHiringProcessor;
    const { catRateValue } = this.loanOfferSimulationProcessor;
    if (folio) {
      folioForTopInfo = [
        {
          key: 'oc-loan-offer-page-success-folio',
          value: folio,
          class: 'light-key'
        },
        {
          value: this.t('oc-loan-offer-page-success-bbva-name-for-folio'),
          class: 'inline spacing'
        }
      ];
    }
    if (isContractedBySustainable) {
      sustainableLoanExtraInfo = [
        {
          id: 'sustainableMessage',
          class: 'spacing',
          iconMessage: {
            type: 'warning-dark',
            heading: this.t('oc-loan-offer-page-sustainable-success-message-title'),
            icon: 'coronita:info',
            iconSize: {
              width: 22,
              height: 22
            },
            message: this.t('oc-loan-offer-page-sustainable-success-message'),
            messages: [
              {
                'title': this.t('oc-loan-offer-page-sustainable-success-date-label'),
                'class': 'bold text'
              },
              {
                'title': this.t('oc-loan-offer-page-sustainable-success-dynamic-date', '', { date: contractingDate }),
                'class': 'bold text'
              }
            ]
          }
        }
      ];
    }
    const improvedRevire = this._getImprovedRevire();
    const successPagePayload = {
      date: contractingDate,
      dateClass: 'bold-date',
      title: titleLocale,
      origin: {
        avatar: {
          src: avatarImgPath
        }
      },
      amountLabel: 'oc-loan-offer-page-success-amount-label',
      amount: {
        class: 'oc-loan-offer-separator',
        amount: this.newInitialAmount,
        currency: this.localCurrency,
        localCurrency: this.localCurrency
      },
      fees: [
        {
          text: 'oc-loan-offer-page-success-monthly-payment',
          amount: null,
          currency: null
        },
        {
          amount: this.currentMonthlyPayment,
          currency: this.localCurrency
        }
      ],
      headerAmountList: [
        [
          {
            key: 'oc-loan-offer-page-list-interest-rate-1',
            value: mensualRateValueAsPercentage || this.c(this.loanOfferProcessor, 'mensualRateValueAsPercentage'),
            class: 'margin-m kill-amount-padding'
          },
          {
            value: this.couponRedeemed ? `${this.couponRedeemedData.benefitType.percentage}%` : annualRateValueAsPercentage || (revireRate ? revireRateValueAsPercentage : annualRateValueAsPercentageLoanOfferDetail),
            key: 'oc-loan-offer-page-list-interest-rate-2',
            class: 'bold margin-m kill-amount-padding'
          },
          {
            value: `${catRateValue || this._extractPercentage('CAT')}%`,
            key: 'oc-loan-offer-page-cat-rate',
            class: 'bold margin-m kill-amount-padding'
          },
        ],
      ],
      topInfo: [
        {
          value: productTypeLocale,
          class: 'bold spacing oc-loan-offer-other-info-title'
        },
        {
          key: 'oc-loan-offer-page-success-account-title',
          musk: {
            value: this.postLoansServiceSuccessResponse.relatedContracts[0].number,
            chars: 5,
            simbol: '•'
          },
          class: 'light-key spacing'
        },
        {
          key: 'oc-loan-offer-page-collapsed-view-term',
          value: `${termAmount} ${this.t(frecuencyLocale)}`,
          class: 'light-key spacing'
        },
        ...improvedRevire,
        ...folioForTopInfo,
        {
          iconMessage: {
            message: topInfoIconMessageLocale,
            type: 'info-dark',
            icon: 'coronita:info',
            class: 'spacing'
          }
        },
        ...sustainableLoanExtraInfo,
        ...topInfoExtraElements
      ],
      buttons: {
        primary: {
          text: 'oc-loan-offer-page-success-accept',
          action: 'primary-button-clicked'
        },
        secondary: {
          hidden: true
        }
      }
    };

    this._addConditionalPropsByProduct(successPagePayload);

    if (extraProperties) {
      Object.assign(successPagePayload, extraProperties);
    }
    if (revireRate || this._isComissionRevire) {
      Object.assign(successPagePayload, {
        coupon: {
          text: 'oc-loan-offer-page-promotion-applied',
          atomIcon: {
            value: 'coronita:correct',
            class: 'icon-size-18',
            iconSize: 18
          }
        }
      });
    }
    this._handleComingPageEvent({
      successExit: true,
      transmitEventName: true
    });

    this._initSuccessPage(className, type, headerClassName);
    this.transmitLoanHiringCase({ operationNumber });
    this._dispatch('reset-operative');
    this._dispatch('init-and-open-success-page', successPagePayload);
    this._dispatch('rating-loan-offer', {
      view: 'creditDisposition',
      value: true
    });
  }

  /** Gets the details of the improvement in the loan offer.
    * @returns {Array} An array with an object containing the details of the improved revire,
    * or an empty array if the conditions are not met.
    * The object has the following properties:
    * - key: A string that describes the type of promotion applied.
    * - value: A string that describes the value of the applied promotion (commission or fee).
    * - class: A CSS class for visual styles.
    */
  _getImprovedRevire() {
    const { annualRateValueAsTruncated, revireRateValueAsTruncated, revireRate, commissionValueAsTruncated, commissionRevireValueAsTruncated } = this.loanOfferProcessor;
    let improvedRevire = [];
    if (revireRate || this._isComissionRevire) {
      const key = this.t('oc-loan-offer-page-promotion-applied');
      const translations = {
        true: this.t('oc-loan-offer-page-promotion-applied-commission', '', { commission: commissionValueAsTruncated, commissionRevire: commissionRevireValueAsTruncated }),
        false: this.t('oc-loan-offer-page-promotion-applied-rate', '', { rate: annualRateValueAsTruncated, rateRevire: revireRateValueAsTruncated })
      };
      const value = translations[this._isComissionRevire];
      improvedRevire = [ { key, value, class: 'light-key spacing' } ];
    }
    return improvedRevire;
  }

  /**
   * Add conditional properties by product with the correct validations
   * PPI and NOM products
   * @event init-and-open-success-pag
   */
  _addConditionalPropsByProduct(successPagePayload) {
    const { isPPI01, isNOM01, isNOM02, isMAG01, isPPI04 } = this.loanOfferProcessor;

    if (isPPI04) {
      successPagePayload.headerAmountList[0].unshift({
        value: this.loanOfferHiringProcessor.openingCommissionValueAsAmount,
        key: 'oc-loan-offer-page-success-commission-cost',
        class: 'margin-m kill-amount-padding'
      });
    }
    if (isPPI01 || isNOM01 || isNOM02 || isMAG01) {
      const insuranceLocaleName = 'oc-loan-offer-page-costs-insurance-success';
      const insuranceCost = `${this.formatToAmount(this.currentInsuranceAmount)}` || this.loanOfferHiringProcessor.insuranceCostValueAsAmount;
      successPagePayload.headerAmountList[0].unshift({
        value: insuranceCost,
        key: insuranceLocaleName,
        class: 'margin-m kill-amount-padding'
      });
    }

  }

  /**
   * Method to initialize the success page
   * PPI and NOM products
   * @param {string} className
   * @param {string} type
   * @param {string} headerClassName
   * @event set-success-page-header-class-name
   * @event set-success-page-title-name
   * @event set-success-page-type
   * @event set-success-page-class-nam
   */
  _initSuccessPage(className, type, headerClassName) {
    if (headerClassName) {
      this._dispatch('set-success-page-header-class-name', headerClassName);
    }

    this._dispatch('set-success-page-title-name', this.loanOfferProcessor.headerTitleLocale);

    if (type) {
      this._dispatch('set-success-page-type', type);
    }

    if (className) {
      this._dispatch('set-success-page-class-name', className);
    }
  }

  /**
   * Set the configuration and information to Incomplete hiring case
   * PPI and NOM products
   * @param {object} responsePayload
   * @param {string} className
   */
  onIncompleteHiringCase(responsePayload, caseName) {
    this.postLoansServiceSuccessResponse = responsePayload;
    this.set('currentLoanHiringCaseName', caseName);
    const code = 'OC-LOAN-OFFER-INCOMPLETE-MODAL';
    const selectedConfig = {
      openMaximized: true,
      closeIcon: 'coronita:close',
      className: 'full-height-info close-button--right oc-loan-offer-incomplete',
      closeIconSize: 20,
      title: this.loanOfferProcessor.headerTitleLocale,
      heroImage: this.pathsToImages.incompleteCase,
      iconOnlyFullHeight: true,
      acceptBtLabel: 'oc-loan-offer-page-incomplete-accept',
      template: {
        type: 'paragraphs',
        values: [
          {
            title: 'oc-loan-offer-page-incomplete-info-message',
            class: 'oc-loan-offer-incomplete-title'
          },
          {
            title: 'oc-loan-offer-page-incomplete-info-subtitle',
            class: 'text-align-left oc-loan-offer-incomplete-subtitle'
          },
          {
            list: [
              'oc-loan-offer-page-incomplete-info-list-1',
              'oc-loan-offer-page-incomplete-info-list-2'
            ],
            class: 'cells-lists-with-text-left'
          },
          {
            eventName: 'atm-locator-link-clicked',
            closeOnAction: true,
            iconClass: 'simple-text oc-loan-offer-incomplete-link icon-size-30',
            link: 'oc-loan-offer-page-incomplete-info-button',
            linkIcon: 'coronita:place'
          }
        ]
      }
    };
    this.transmitLoanHiringCase(this.postLoansServiceSuccessResponse);
    this._openModal(code, selectedConfig, { time: 500 });
  }

  /**
   * Method to go to atm locator page
   * @event open-atm-locator
   */
  onAtmLocatorLinkClicked() {
    this._handleComingPageEvent({ successExit: true });
    this._dispatch('open-atm-locator');
  }

  /**
   * Validate if is a incomplete hiring case
   * @param {object} responsePayload
   */
  isIncompleteHiringCase(responsePayload) {
    const valueToCompare = this.c(responsePayload, this.postHiringConfig.customProps.valueToValidatePath);
    return this.postHiringConfig.customProps.incompleteCaseValues.includes(valueToCompare);
  }

  /**
   * Method to the user want retry the request
   * Do the request again
   */
  askForRetryWrapper() {
    this.closeSpinner();
    this.attemptsConfig.askForRetry();
  }

  /**
   * Method to exit page
   */
  successfulPageExit() {
    this.exitPage(true);
  }

  /**
   * Dispath event to exit page
   * @param {boolean} successExit
   * @event exit-operative
   */
  exitPage(successExit = false) {
    this._handleComingPageEvent({ successExit });
    this._dispatch('exit-operative');
  }

  /**
   * Method to trasmit the configuration data case
   * @param {Object}
   */
  _handleComingPageEvent({ successExit = false, transmitEventName = false }) {
    const { value: { fromPage: previousPage } } = this.navigationDetailFromBridge;
    if (previousPage && this.comingPagesToNotifyOnOperativeExit.includes(previousPage)) {
      let comingPageEventName = `${successExit ? 'successful-' : ''}exit-notification-for-${previousPage}`;

      if (transmitEventName) {
        const eventName = 'coming-page-event-name-transmitted';
        this._dispatch(eventName, comingPageEventName);
      } else {
        this._dispatch(comingPageEventName);
      }
    }
  }

  /**
   * Method to set the modal configuration bureau
   * Dispatch event to set and open modal
   */
  openCreditBureauModal() {
    let selectedConfig = {
      openMaximized: true,
      className: 'info header--white icon-message-first close-button--right',
      title: 'oc-loan-offer-page-modal-creditbure-title',
      template: {
        type: 'paragraphs',
        values: [
          {
            title: 'oc-loan-offer-page-modal-creditbure-message',
            class: 'text-align-center spacing'
          },
          {
            text: 'oc-loan-offer-page-modal-creditbure-text',
            class: 'text-align-center'
          },
        ]
      },
      acceptBtLabel: 'oc-loan-offer-page-modal-text-button'
    };
    this._openModal('CREDIT-BUREAU-MODAL', selectedConfig);
  }

  /**
   * Choose the configuration modal and set the corresponding data
   * Call _openModal method
   * @param eventModal
   */
  onHelpIconClicked(eventModal) {
    let selectedConfig = {
      className: 'full-height-error header--white help-modal paragraph__only',
      openMaximized: true,
      title: '',
      template: {
        type: 'paragraphs',
        values: []
      },
      atomIcon: {
        icon: 'coronita:help',
        class: 'icon-size-24'
      },
      acceptBtLabel: 'oc-loan-offer-page-modal-text-button'
    };
    const { INSURANCE, INSURANCE_AND_UNEMPLOYMENT, COMMISSION, ANNUAL_RATE, CAT } = this.modalEventNames;
    switch (eventModal) {
      case INSURANCE:
        selectedConfig.title = 'oc-loan-offer-page-modal-insurance-title';
        selectedConfig.message = 'oc-loan-offer-page-modal-insurance-message';
        selectedConfig.template.values.push({ text: 'oc-loan-offer-page-modal-insurance-text' });
        break;
      case INSURANCE_AND_UNEMPLOYMENT:
        selectedConfig.title = 'oc-loan-offer-page-modal-insurance-title';
        selectedConfig.message = 'oc-loan-offer-page-modal-unemployment-message';
        selectedConfig.template.values.push({ text: 'oc-loan-offer-page-modal-unemployment-text' });
        break;
      case COMMISSION:
        selectedConfig.title = 'oc-loan-offer-page-modal-commission-title';
        selectedConfig.message = 'oc-loan-offer-page-modal-commission-message';
        selectedConfig.template.values.push({ text: 'oc-loan-offer-page-modal-commission-text' });
        break;
      case ANNUAL_RATE:
        selectedConfig.title = 'oc-loan-offer-page-modal-interest-title';
        selectedConfig.message = 'oc-loan-offer-page-modal-interest-subtitle-1';
        selectedConfig.template.values.push({ text: 'oc-loan-offer-page-modal-interest-subtext-1' });
        break;
      case CAT:
        selectedConfig.title = 'Costo Anual Total';
        selectedConfig.message = 'oc-loan-offer-page-modal-interest-subtitle-2';
        selectedConfig.template.values.push({ text: 'oc-loan-offer-page-modal-interest-subtext-2' });
        break;
      default:
        break;
    }
    this._openModal(`${eventModal.toUpperCase()}-MODAL`, selectedConfig);
  }

  /**
   * Handle Native Back Button
   * Call _openModal method
   * @event set-modal-opened
   */
  handleNativeBackButton() {
    if (this.hasAnyOpenModal) {
      this._dispatch('set-modal-opened', false);
      this.validateModalRevire();
    } else if (this.internalInteraction) {
      this.openConfirmModal();
    }
  }

  /**
   * Set data and open the confirm modal
   */
  openConfirmModal() {
    const code = 'OC-LOAN-OFFER-EXIT-MODAL';
    const halfModalProperties = {
      acceptBtLabel: 'oc-loan-offer-page-exit-modal-accept-label',
      cancelBtLabel: 'oc-loan-offer-page-exit-modal-cancel-label'
    };

    const paragraphsTemplateValues = [
      {
        text: 'oc-loan-offer-page-exit-modal-text'
      }
    ];

    this._openHalfModal(code, paragraphsTemplateValues, halfModalProperties);
  }

  /**
   * Set data and open the error modal
   */
  openErrorModal() {
    const code = 'OC-LOAN-OFFER-ERROR-MODAL';
    const halfModalProperties = {
      acceptBtLabel: 'oc-loan-offer-page-error-modal-accept-label',
      noCancelOnOutsideClick: true
    };

    const paragraphsTemplateValues = [
      {
        text: 'glomo-communication-error-modal-title',
        class: 'strong'
      },
      {
        text: 'glomo-communication-blocking-error-body-text'
      }
    ];

    this._openHalfModal(code, paragraphsTemplateValues, halfModalProperties);
  }

  /**
   * Set data and open the retry modal
   */
  openRetryModal() {
    const code = 'OC-LOAN-OFFER-RETRY-MODAL';
    const halfModalProperties = {
      acceptBtLabel: 'oc-loan-offer-page-retry-modal-accept-label',
      cancelBtLabel: 'oc-loan-offer-page-retry-modal-cancel-label',
      noCancelOnOutsideClick: true
    };

    const paragraphsTemplateValues = [
      {
        text: 'glomo-communication-error-modal-title',
        class: 'strong'
      },
      {
        text: 'glomo-communication-blocking-error-body-text'
      }
    ];

    this._openHalfModal(code, paragraphsTemplateValues, halfModalProperties);
  }

  /**
   * Set data and open the retry modal
   */
  onRetryModalAccept() {
    this.attemptsConfig.performNextAttempt();
  }

  /**
   * Set data and open the half modal
   * @param {String} code
   * @param {Array} paragraphsTemplateValues
   * @param {Object} halfModalProperties
   * @param {Object} otherRootProperties
   */
  _openHalfModal(code, paragraphsTemplateValues = [], halfModalProperties = {}, otherRootProperties = {}) {
    const selectedConfig = {
      className: 'error',
      openMaximized: false,
      iconOnlyFullHeight: true,
      ...halfModalProperties,
      template: {
        type: 'paragraphs',
        values: [
          { icon: 'coronita:alert', class: 'spacing' },
          ...paragraphsTemplateValues
        ]
      }
    };
    this._openModal(code, selectedConfig, otherRootProperties);
  }

  /**
   * Set data and open the half modal
   * @param {String} code
   * @param {Object} selectedConfig
   * @param {Object} otherRootProperties
   */
  _openModal(code, selectedConfig, otherRootProperties = {}) {
    const modalSettings = {
      code,
      selectedConfig,
      ...otherRootProperties
    };
    this._dispatch('open-modal', modalSettings);
  }

  /**
   * As the params received could come from two different events, this method
   * evals the type received to turn the flag on or not.
   * @param {*} fromStep
   */
  _evalContinuePressed(fromStep) {
    if (typeof fromStep === 'number') {
      this._continuePressed = true;
    }
  }

  /**
   * Method to show header step loan detail when is collapsed
   */
  showHeader(fromStep) {
    this._evalContinuePressed(fromStep);
    this._syncComponentObject({
      objectComponentName: 'stepLoanOfferObject',
      properties: { hideHeader: false }
    });
  }

  /**
   * Method to hide header step loan detail when is collapsed
   */
  hideHeader() {
    this._continuePressed = false;
    this._syncComponentObject({
      objectComponentName: 'stepLoanOfferObject',
      properties: { hideHeader: true }
    });
  }

  /**
   * Set properties of configuration
   * @param {Object} syncConfig
   */
  _syncComponentObject(syncConfig) {
    const { objectComponentName } = syncConfig;
    if (Object.prototype.hasOwnProperty.call(this, objectComponentName) && Object.prototype.hasOwnProperty.call(this.mappingComponentObjectToEventName, objectComponentName)) {
      const componentEventName = this.mappingComponentObjectToEventName[objectComponentName];
      const { resetBeforeSet = false, justReset = false, pathsToNotify = [], properties } = syncConfig;
      const { propertiesToSet, propertiesToReset } = this.__extractPropsToSync({ ...syncConfig, properties: properties || this[objectComponentName] });
      const eventName = `set-${componentEventName}-properties`;
      if ((resetBeforeSet || justReset) && propertiesToReset) {
        this._dispatch(eventName, propertiesToReset);
      }
      if (!justReset && propertiesToSet) {
        this._dispatch(eventName, propertiesToSet);
      }
      if (pathsToNotify && pathsToNotify.length > 0) {
        pathsToNotify.forEach(pathToNotify => this._dispatch(`notify-${componentEventName}-path`, pathToNotify));
      }
    }
  }

  /**
   * Set propertiesextra properties
   * @param {Object} syncConfig
   */
  __extractPropsToSync(syncConfig) {
    const { properties } = syncConfig;
    if (Array.isArray(properties) && properties.length > 0) {
      return this.__getPropsFromArray(syncConfig);
    } else if (typeof properties === 'object' && Object.keys(properties).length > 0) {
      return this.__getPropsFromObject(syncConfig);
    } else {
      return { propertiesToSet: null, propertiesToReset: null };
    }
  }

  /**
   * Set properties of Array
   * @param {Object} syncConfig
   */
  __getPropsFromArray(syncConfig) {
    const { objectComponentName, properties, justReset = false, resetBeforeSet = false } = syncConfig;
    return properties.reduce((acc, property) => {
      const { propertiesToSet, propertiesToReset } = acc;
      if (propertiesToReset) {
        this.__setPropertyDefaultValue(property, propertiesToReset, syncConfig);
      }
      if (propertiesToSet && Object.prototype.hasOwnProperty.call(this[objectComponentName], property)) {
        propertiesToSet[property] = this[objectComponentName][property];
      }
      return acc;
    }, { propertiesToSet: justReset ? null : {}, propertiesToReset: resetBeforeSet || justReset ? {} : null });
  }

  /**
   * Set properties from Object
   * @param {Object} syncConfig
   */
  __getPropsFromObject(syncConfig) {
    const { properties, resetBeforeSet = false, justReset = false } = syncConfig;
    if (justReset) {
      return { propertiesToSet: null, propertiesToReset: properties };
    } else {
      let propertiesToReset = null;
      if (resetBeforeSet || justReset) {
        propertiesToReset = {};
        for (const propertyKey in properties) {
          if (Object.prototype.hasOwnProperty.call(properties, propertyKey)) {
            this.__setPropertyDefaultValue(propertyKey, propertiesToReset, syncConfig);
          }
        }
      }
      return { propertiesToSet: properties, propertiesToReset };
    }
  }

  /**
   * Set properties by default value
   * @param {Object} syncConfig
   */
  __setPropertyDefaultValue(property, propertiesToReset, { objectComponentName, specificPropertiesToReset }) {
    if (Object.prototype.hasOwnProperty.call(this.defaultValuesByComponent[objectComponentName], property)) {
      if (specificPropertiesToReset && specificPropertiesToReset.length > 0) {
        if (specificPropertiesToReset.includes(property)) {
          propertiesToReset[property] = this.defaultValuesByComponent[objectComponentName][property];
        }
      } else {
        propertiesToReset[property] = this.defaultValuesByComponent[objectComponentName][property];
      }
    }
  }

  /**
   * Map the Object Array
   * @param {Object} targetArray
   * @param {Object}
   */
  mapObjectArray(targetArray, { mapPath, reverse = false }) {
    const mappedArray = targetArray.map(element => this.c(element, mapPath));
    return reverse ? mappedArray.reverse() : mappedArray;
  }

  /**
   * Find the property by path
   * @param {Object} targetArray
   * @param {Object}
   */
  findPropertyByPath(targetObject, { outerPath, pathToPropertyToCompare, valueToCompare, propertyToReturn = '' }) {
    if (targetObject && outerPath && pathToPropertyToCompare && valueToCompare) {
      let foundElement = this.c(targetObject, outerPath).find(element => this.c(element, pathToPropertyToCompare) === valueToCompare);
      return foundElement && (propertyToReturn ? this.c(foundElement, propertyToReturn) : foundElement);
    }
  }

  /**
   * Set the format percentage
   * @param {Number} value
   * @param {Object} extraConfig
   */
  formatToPercentage(value, extraConfig) {
    return this._getFormattedPercentage(value, { ...this.formattedPercentageConfig, ...extraConfig });
  }

  /**
   * Truncate Number
   * @param {Number} value
   * @param {Number} fractionDigits
   */
  truncateNumber(value, fractionDigits = 2) {
    return (Math.floor(value * 100) / 100).toFixed(fractionDigits);
  }

  /**
   * Get the format Percentage
   * @param {Number} value
   * @param {Number} fractionDigits
   */
  _getFormattedPercentage(value, {
    fractionDigits = 2,
    symbol = '%',
    stringBetween = '',
    localeAfterSymbol = ''
  }) {
    const truncatedNumber = this.truncateNumber(value, fractionDigits);
    return `${truncatedNumber}${stringBetween}${symbol}${this.t(localeAfterSymbol)}`;
  }

  /**
   * Get the format Amount
   * @param {Number} amount
   */
  formatToAmount(amount) {
    const { decimals, separator, symbol } = this.formattedAmountConfig;
    return this.getFormattedAmount(amount, this.localCurrency, this.localCurrency, this.language, decimals, separator, symbol);
  }

  /**
   * Main dispatch event method
   * @param {String} eventName
   * @param {Object} detailData
   */
  _dispatch(eventName, detailData) {
    this.dispatchEvent(new CustomEvent(eventName, {
      bubbles: true,
      composed: true,
      detail: detailData
    }));
  }

  /**
   * Method to show spinner
   * @event open-control-veil
   */
  showSpinner() {
    this._dispatch('open-control-veil');
  }

  /**
   * Method to close spinner
   * @event close-control-veil
   */
  closeSpinner() {
    this._dispatch('close-control-veil');
  }

  /**
   * Set and configurate the summary button
   * @event payroll-advance-set-summary
   */
  setSummary() {
    let summary = {
      buttonLabel: 'oc-loan-offer-page-finish-button',
      disabledPrimaryButton: false,
    };
    this._dispatch('set-summary-data', summary);
  }

  /**
   * Method to request open pdf from url based on the product name key
   * @param {String} productNameKey
   * @event request-open-pdf-from-url
   */
  getAmortizationSchedulePdf(productNameKey) {
    const documentUrl = this.c(this.sampleAmortizationScheduleDocument, productNameKey);
    if (documentUrl) {
      this._dispatch('request-open-pdf-from-url', {
        value: documentUrl,
        mimeType: 'application/pdf',
        title: this.t('oc-loan-offer-amortization-schedule-title'),
        headerColor: '#004481',
        tintColor: '#fff',
        canShare: true,
        titleColor: '#fff',
        blackStatusBar: true,
      });
    }
  }

  /**
   * Find the field in array configuration to set properties
   * @param field
   * @param id
   */
  findField(field, id) {
    let foundValue = field ? field.find(item => item.id === id) : {};
    return foundValue;
  }

  /**
   * Set couponRedeemed flag that indicates redention status
   * @param payload
  */
  redeemCoupon(payload) {
    this.set('couponRedeemed', payload.redeemed);
    if (payload && payload.redeemData && payload.redeemed) {
      const { annualRateValue } = this.loanOfferProcessor;
      this.couponRedeemedData = payload.redeemData;
      this.stepLoanOfferObject.couponData.comparison = {
        currencyCode: '%',
        alignRight: true,
        firstElement: {
          title: this.t('oc-loan-offer-page-coupon-old-rate'),
          amount: annualRateValue,
          footer: this.t('oc-loan-offer-page-commission-text-after-percentage-symbol')
        },
        secondElement: {
          title: this.t('oc-loan-offer-page-coupon-new-rate'),
          amount: this.couponRedeemedData.benefitType.percentage,
          footer: this.t('oc-loan-offer-page-commission-text-after-percentage-symbol')
        }
      };
      let couponDataRedeemItem = {
        titleText: `${this.t('oc-loan-offer-page-coupon-code')} ` + this.couponRedeemedData.promotionCode,
        titleClass: 'monochrome',
        text: this.t('oc-loan-offer-page-coupon-info'),
        showTooltip: true,
        disabled: true,
        src: './images/offers/loan/promotions.svg',
      };
      this.stepLoanOfferObject.couponData.items[0] = couponDataRedeemItem;
      this.stepLoanOfferObject.couponRedeemed = payload.redeemed;
      this.stepLoanOfferObject.keyCouponInfo.push({
        key: 'oc-loan-offer-page-coupon-redeemed',
        showCollapsedView: true,
        showOpenView: false,
        classInfoValue: 'status',
        id: 'coupon-indicator',
        keyCollapsedIcon: 'coronita:correct',
        couponDataRedeemedText: `${this.t('oc-loan-offer-page-coupon-code')} ${this.couponRedeemedData.promotionCode}`,
        custom_message: `${this.t('oc-loan-offer-page-coupon-description')}${annualRateValue}%${this.t('oc-loan-offer-page-coupon-separator')}${this.formatToPercentage(this.couponRedeemedData.benefitType.percentage, {})}`,
      });
      this.stepLoanOfferObject.keyInfo[0].keyValues[1].value = this.formatToPercentage(this.couponRedeemedData.benefitType.percentage, {});

      this._syncComponentObject({
        objectComponentName: 'stepLoanOfferObject',
        properties: ['couponData', 'couponRedeemed', 'keyInfo'],
        resetBeforeSet: true,
        pathsToNotify: [
          'couponData.items.0.titleText',
          'couponData.items.0.titleClass',
          'couponData.items.0.text',
          'couponData.items.0.showTooltip',
          'couponData.items.0.disabled',
          'couponData.items.0.src',
          'couponData.comparison',
          'keyInfo.0.keyValues.1.value'
        ]
      });
      this._requestLoanOfferSimulation();
    }
  }
  /*
   *
   * @param {Number} amount
   */
  changedAmountEmpty(amount) {
    const min = this.c(this.stepLoanOfferObject, 'amountData.amountMin');
    const max = this.c(this.stepLoanOfferObject, 'amountData.amountMax');
    const { isPPI01, isNOM01, isNOM02, isMAG01 } = this.loanOfferProcessor;
    if (this._firstInteraction && (amount === undefined || amount < min || amount > max)) {
      this._syncComponentObject({
        objectComponentName: 'stepLoanOfferObject',
        properties: [ 'stickyPayload' ],
        resetBeforeSet: true,
        specificPropertiesToReset: [ 'stickyPayload' ],
        pathsToNotify: [ 'stickyPayload.monthlyPayment' ]
      });
      if (isPPI01 || isNOM01 || isNOM02 || isMAG01) {
        this._setStepCardChecklistBasis();
        this._addInsuranceToStepCardChecklist();
        this._syncComponentObject({
          objectComponentName: 'stepCardChecklistObject',
          resetBeforeSet: true,
          specificPropertiesToReset: [ 'checkboxList' ],
          pathsToNotify: ['checkboxList.0.valid', 'checkboxList.1.valid']
        });
      }
      if (amount === 0 || amount === undefined) {
        this.invalitAmountObject = {
          invalidAmount: true,
          colorButtonEnable: 'disable-button',
          sliderEnabled: 'disabled-slider',
          stickyAmountEnabled: 'sticky-amount-disabled'
        };
        this._syncComponentObject({
          objectComponentName: 'invalitAmountObject',
          properties: ['invalidAmount', 'colorButtonEnable', 'sliderEnabled', 'stickyAmountEnabled'],
          resetBeforeSet: true
        });
      }
    }
  }

  /**
   * Method to send all the data needed for the existing modals of revire
   */
  sendModalRevire() {
    this.hasAnyOpenModal = true;
    this.isModalRevireOpen = true;
    const { annualRateValueAsTruncated, revireRateValueAsTruncated, commissionValueAsTruncated, commissionRevireValueAsTruncated } = this.loanOfferProcessor;
    const properties = {
      isOpened: true,
      promotionHelp: true,
      iconSecondary: 'coronita:close',
      showSecondaryIcon: false,
      hideCloseIcon: false,
      alertBoxClass: this.alertBoxModalClass,
      alertBoxClassAcceptButton: 'white-core-blue',
      selectedConfig: {
        src: './images/offers/loan/bbva-tag-light.svg',
        iconId: 'promotion-help-icon',
        headerTitle: this.t('oc-loan-offer-page-modal-header-title'),
        acceptButton: this.t('oc-loan-offer-page-modal-text-button'),
        values: [
          {
            class: 'title-xl light-description',
            title: this._isComissionRevire ? this.t('oc-loan-offer-page-comission-title-modal') : this.t('oc-loan-offer-page-modal-title'),
            text: this._isComissionRevire ? this.t('oc-loan-offer-page-comission-description-modal') : this.t('oc-loan-offer-page-modal-description'),
            hideImagesDiv: true
          }
        ],
        testingSecondData: [
          {
            dinamicStyle: 'promotion-comparative',
            panelClass: 'no-wrap coupon',
            firstPanelTitle: this._isComissionRevire ? this.t('oc-loan-offer-page-comission-before-modal') : this.t('oc-loan-offer-page-modal-tax-before'),
            secondPanelTitle: this._isComissionRevire ? this.t('oc-loan-offer-page-comission-after-modal') : this.t('oc-loan-offer-page-modal-tax-now'),
            firstAmount: this._isComissionRevire ? commissionValueAsTruncated : annualRateValueAsTruncated,
            secondAmount: this._isComissionRevire ? commissionRevireValueAsTruncated : revireRateValueAsTruncated,
            currencyCode: '%',
            firstSlot: this._isComissionRevire ? this.t('oc-loan-offer-page-comission-footer-modal') : this.t('oc-loan-offer-page-modal-more-iva'),
            secondSlot: this._isComissionRevire ? this.t('oc-loan-offer-page-comission-second-footer-modal') : this.t('oc-loan-offer-page-modal-more-iva')
          }
        ]
      }
    };
    this._dispatch('send-properties-modal-help', properties);
  }

  /**
   * Extract Percentage Rate
   * @param {String} idRate
   * @returns {Number} response percentage Rate
   */
  _extractPercentage(idRate) {
    const rates = this.get('loanOfferDetail.rates');
    const result = rates.filter(rate => rate.rateType.id === idRate);
    const [ idCat ] = result;
    return idCat.unit.percentage;
  }

  /**
   * Validates and closes the review modal if it is open.
   * If the review modal is open, it sets the `hasAnyOpenModal` and `isModalRevireOpen` variables to `false`.
   */
  validateModalRevire() {
    if (this.isModalRevireOpen) {
      this.hasAnyOpenModal = false;
      this.isModalRevireOpen = false;
    }
  }

}

customElements.define(GlomoLoanOfferDm.is, GlomoLoanOfferDm);
