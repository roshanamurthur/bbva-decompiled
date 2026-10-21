{
  /**
    `<glomo-credit-card-holder-manager>` Description.

    Example:

    ```html
    <glomo-credit-card-holder-manager></glomo-credit-card-holder-manager>
    ```

    ## Styling
    The following custom properties and mixins are available for styling:

    ### Custom Properties
    | Custom Property     | Selector | CSS Property | Value       |
    | ------------------- | -------- | ------------ | ----------- |
    | --cells-fontDefault | :host    | font-family  |  sans-serif |
    ### @apply
    | Mixins    | Selector | Value |
    | --------- | -------- | ----- |
    | --glomo-credit-card-holder-manager | :host    | {} |

    * @customElement glomo-credit-card-holder-manager
    * @polymer
    * @extends {Polymer.Element}
    * @demo demo/index.html
  */
  const amountBehavior = CellsBehaviors.AmountBehavior;
  class GlomoCreditCardHolderManager extends Polymer.mixinBehaviors([
    CellsBehaviors.CellsCheckNestedKeysBehavior,
    CellsBehaviors.CellsGlobalApisHandleRequest,
    CellsBehaviors.CellsGlobalApisHandleRequestSign,
    CellsBehaviors.CellsGlobalApisHandleRequestError,
    CellsBehaviors.i18nBehavior], amountBehavior(Polymer.Element)) {
    static get is() {
      return 'glomo-credit-card-holder-manager';
    }

    static get properties() {
      return {
        /**
         * @description Customer Id
         * @type {String}
         */
        customerId: {
          type: String,
          value: ''
        },
        /**
         * @description Customer Email
         * @type {String}
         * @default ''
         */
        customerEmail: {
          type: String,
          value: ''
        },
        /**
         * @description Host
         * @type {String}
         * @default ''
         */
        host: {
          type: String,
          value: ''
        },
        /**
         * @description Version api Cards
         * @type {String}
         */
        cardsApiVersion: {
          type: String,
          value: '1'
        },
        /**
         * @description Version api Customers
         * @type {String}
         */
        customersApiVersion: {
          type: String,
          value: '1'
        },
        /**
         * @description Version api Customer Addresses
         * @type {String}
         */
        customerAddressesApiVersion: {
          type: String,
          value: '0'
        },
        /**
         * @description Formatter Configuration
         * @type {Object}
         */
        _formatterExtraConfig: {
          type: Object,
          value: () => {
            return {
              language: 'es-mx',
              currencyCode: 'MXN',
              localCurrency: 'MXN'
            };
          }
        },
        /**
         * @description Sub product Id
         * @type {String}
         * @default ''
         */
        _subProductId: {
          type: String,
          value: ''
        },
        /**
         * @description Entry point offer
         * @type {String}
         * @default ''
         */
        _entryPoint: {
          type: String
        },
        /**
         * @description Details for offer
         * @type {Object}
         * @default {}
         */
        _offerData: {
          type: Object,
          value: () => ({})
        },
        /**
         * @description Typology selected
         * @type {String}
         * @default ''
         */
        typology: {
          type: String,
          value: ''
        },
        /**
         * @description Flag to know if the product
         * corresponds to no pre-approved
         * @type {Boolean}
         * @default false
         */
        _isNpa: {
          type: Boolean,
          value: false
        },
        /**
         * @description List for terms and conditions
         * @type {Object}
         * @default {}
         */
        checkboxList: {
          type: Object,
          value: () => ({})
        },
        /**
         * @description cardName of offer detail
         * @type {String}
         * @default ''
         */
        _cardName: {
          type: String,
          value: ''
        },
        /**
         * @description points blue of offer detail
         * @type {Object}
         * @default {}
         */
        pointsInfo: {
          type: Object,
          value: () => ({})
        },
        /**
         * @description amount selected for the customer
         * @type {Number}
         * @default 0
         */
        amountSelected: {
          type: Number,
          value: 0
        },
        /**
         * @description Fixed amount to offer detail
         * @type {Number}
         * @default 0
         */
        _amountDefaultData: {
          type: Number,
          value: 0
        },
        /**
         * @description Delivery option selected for the user
         * @type {Object}
         * @default {}
         */
        deliveryOptionSelected: {
          type: Object,
          value: () => ({})
        },
        /**
         * @description Flag to fixed/variable amount
         * @type {Boolean}
         * @default false
         */
        _showDefaultData: {
          type: Boolean,
          value: false
        },
        /**
         * @description Property for offerId
         * @type {String}
         * @default ''
         */
        _offerId: {
          type: String,
          value: ''
        },
        /**
         * @description masked/unmasked address
         * @type {Boolean}
         * @default false
         */
        _showHideAddress: {
          type: Boolean,
          value: false
        },
        /**
         * @description Global accounts from user
         * @type {Array}
         * @default []
         */
        axisAccount: {
          type: Array,
          value: () => []
        },
        /**
         * @description Object form pdf
         * @type {Object}
         * @default {}
         */
        detailDocumentPdfTemplate: {
          type: Object,
          value: () => ({})
        },
        /**
         * @description Object form pdf
         * @type {Object}
         * @default {}
         */
        detailDocument: {
          type: Object,
          value: () => ({})
        },
        /**
         * @description credit card component collapsed status
         * @type {Boolean}
         * @default false
         */
        phantomStep: {
          type: Boolean,
          value: false
        },
        /**
         * @description Label for address
         * @type {String}
         * @default ''
         */
        addressDescription: {
          type: String,
          value: ''
        },
        /**
         * @description Label for button to mask/unmask
         * @type {String}
         * @default ''
         */
        addressButtonLabel: {
          type: String,
          value: ''
        },
        /**
         * @description Object for payment method selected
         * @type {Object}
         * @default {}
         */
        checkedButtons: {
          type: Object,
          value: () => ({})
        },
        /**
         * @description Object for success information
         * @type {Object}
         * @default {}
         */
        _successfulInformation: {
          type: Object,
          value: () => ({})
        },
        /**
         * @description collection of feature flags.
         * @type {Object}
         * @default {}
         */
        featureFlagCollection: {
          type: Object,
          value: () => ({})
        },
        /**
         * @description global user
         * @type {Object}
         * @default {}
         */
        user: {
          type: Object,
          value: () => ({})
        },
        /**
         * @description state of current user financial overview, useful to determine
         * if current customer is "native digital"
         * @type {Object}
         * @default {}
         */
        financialOverviewDetails: {
          type: Object,
          value: () => ({})
        },
        /**
         * @desc update rfc feature flag
         * @type {Boolean}
         * @default false
         */
        _isUpdateRfc: {
          type: Boolean,
          value: false,
        },
        /**
         * @description update ine feature flag
         * @type {Boolean}
         * @default false
         */
        _isUpdateIne: {
          type: Boolean,
          value: false,
        },
        /**
         * @desc customer nationality flag for RFC
         * @type {Boolean}
         * @default false
         */
        _isNationalityMxRfc: {
          type: Boolean,
          value: false,
        },
        /**
         * @description  customer nationality flag for INE
         * @type {Boolean}
         * @default false
         */
        _isNationalityMxIne: {
          type: Boolean,
          value: false,
        },
        /**
         * @description flag of digital native user, this will be used to avoid
         * some unnecesary requests, computations or disable editign
         * certain documents
         * @type {Boolean}
         * @default false
         */
        _isDigitalNativeUser: {
          type: Boolean,
          value: false
        },
        /**
         * @description user has INE or has just updated it flag
         * @type {Boolean}
         * @default false
         */
        _userHasIne: {
          type: Boolean,
          value: false,
        },
        /**
         * @desc user has RFC or has just updated it flag
         * @type {Boolean}
         * @default false
         */
        _userHasRfc: {
          type: Boolean,
          value: false,
        },
        /**
         * @description Email of user masked
         * @type {String}
         * @default ''
         */
        userEmail: {
          type: String,
          value: '',
        },
        /**
        * @desc civil status
        * @type {Array}
        * @default []
        */
        _civilStatusValues: {
          type: Array,
          value: () => []
        },
        /**
         * @desc data entered by user when update
         * @type {Object}
         * @default {}
         */
        _dataUserForm: {
          type: Object,
          value: () => ({})
        },
        /**
        * @desc attempts to update RFC
        * @type {Number}
        * @default 0
        */
        _attempsUpdateRfc: {
          type: Number,
          value: 0
        },
        /**
         * @desc max attempts to update RFC
         * @type {Number}
         * @default 0
         */
        maxAttempsUpdateRfc: {
          type: Number,
          value: 0
        },
        /**
         * @desc user form collapsed status
         * @type {Boolean}
         * @default false
         */
        userFormCollapsed: {
          type: Boolean,
          value: false
        },
        /**
         * @desc flag to skip first step when steps had been loaded after update INE
         * @type {Boolean}
         * @default false
         */
        _skipWhenLoaded: {
          type: Boolean,
          value: false
        },
        /**
         * @desc alternate address flag
         * @type {Boolean}
         * @default false
         */
        alternateAddressFlag: {
          type: Boolean,
          value: false
        },
        /**
         * @description Label for button to add/change alternate
         * @type {String}
         * @default ''
         */
        alternateButtonLabel: {
          type: String,
          value: ''
        },
        /**
         * @description Label for alternate
         * @type {String}
         * @default ''
         */
        alternateDescription: {
          type: String,
          value: ''
        },
        /**
         * @desc value to possible cut off date
         * @type {String}
         */
        possibleCutDate: {
          type: String,
          value: ''
        },
        /**
         * @desc value to possible payment date
         * @type {String}
         */
        possiblePaymentDate: {
          type: String,
          value: ''
        },
        /**
         * @desc list of cut off date and payment date to show in modal items
         * @type {Array}
         */
        selectorModalItems: {
          type: Array,
          value: []
        },
        /**
         * @desc cut off date feature flag
         * @type {Boolean}
         */
        cutOffDateFlag: {
          type: Boolean,
          value: false
        },
        /**
         * @desc cut off day
         * @type {String}
         */
        possibleCutOffDay: {
          type: String,
          value: ''
        },
        /**
         * @desc by-product of the card offered
         * @type {String}
         */
        _binProduct: {
          type: String,
          value: ''
        },
        /**
         * @desc Flag the contract service was successful or failed
         * @type {String}
         */
        _errorOnGetDocument: {
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
        /**
         * @desc Credit card offer details
         * @type {Object}
         */
        creditCardOfferData: {
          type: Object,
          value: () => ({})
        }
      };
    }

    static get observers() {
      return [
        '_updateMessageBox(_isNationalityMxRfc, _isNationalityMxIne, _userHasIne, _userHasRfc)',
      ];
    }

    /**
     * Inicialize flow
     * @param {Object} payload
     */
    initPage(payload) {
      if (this.c(payload, 'offerId') && this.c(payload, 'productId') && this.c(payload, 'continue')) {
        this.showSpinner();
        this._offerId = this.c(payload, 'offerId');
        this._entryPoint = this.c(payload, 'continue');
        this._validateOffer(payload);
        this.$.dmCards.getCardOffer(this._offerId);
        this._dispatchEvents('set-navigate-continue', this._entryPoint);
        this._getCutOffDateFlag();
      }
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
     * @param {Array} payload
     */
    offersReceivedError() {
      this._dispatchEvents('send-to-dashboard');
    }

    /**
     * Get the credit card offer
     * @event send-notification-data
     * @event send-to-dashboard
     */
    notificationCenterData(payload) {
      if (!this.offers.length && payload) {
        this._dispatchEvents('get-offer-list');
        return;
      }
      this.offers.forEach(data => {
        const productname = this.get('product.id', data);
        if (productname === '0SKY') {
          const productId = this.get('product.contractId', data) || ''; // probar si regresa cadena vacia
          const offerId = this.get('id', data);
          this.set('creditCardOfferData', {
            offerId,
            productId,
            continue: 'dashboard'
          });
        }
      });
      if (Object.keys(this.creditCardOfferData).length === 0) {
        this._dispatchEvents('send-to-dashboard');
      } else {
        this._dispatchEvents('send-notification-data', this.creditCardOfferData);
      }
    }

    /**
     * Request card simulation
     * @param {Object} amountValue
     */
    requestSimulation(amountValue) {
      const requestBody = {
        details: {
          product: {
            id: '0TDC',
            subproduct: {
              id: this._offerData?.product?.subProduct?.id
            }
          },
          limitAmount: {
            amount: amountValue,
            currency: this.get('localCurrency', this._formatterExtraConfig)
          },
          offerType: this._offerData?.offerType
        }
      };
      this.showSpinner();
      this.$.dmCards.postOfferSimulation(requestBody, this._offerId);
    }

    /**
    * Handle error simulation
    */
    _handleErrorSimulation() {
      this.closeSpinner();
      this._errorHandler('generic-error');
    }

    /**
    * Handle success simulation
    */
    _handleSuccessSimulation() {
      this.closeSpinner();
    }

    /**
     * Get card offer success response
     * @param {Object} response
     */
    _loadOfferData(response) {
      if (this.c(response, 'detail')) {
        this._offerData = this._parseGetCardOfferResponse(this.c(response, 'detail'));
        this._subProductId = this.c(this._offerData, 'product.id');
        this._cardName = this._parseProductName(this.c(this._offerData, 'product.name'));
        this._binProduct = this.c(this._offerData, 'product.binProduct');
        this._showDefaultData = this.c(this._offerData, 'origin') !== 'ALT';
        const validateNpa = this._isNpa ? '_skipFirstStep' : '_setContentFirstStep';
        this[validateNpa]();
        this._setTermAndConditionsList();
        this._getUpdateAlternateAddressFlag();
        this.getCustomerAddresses();
        if (!this._isNpa) {
          this._getUpdateRfcIneFlag();
          this._isDigitalNativeUser = !this._isUpdateIne || this._computeDigitalNativeUser();
          this._validateCustomer();
        }
        this._updateIneRfc();
        this._dispatchEvents('send-analytics-offer-data', this._offerData);
        this.cutOffDateFlag = this._isNpa ? false : this.cutOffDateFlag;
        if (this.cutOffDateFlag) {
          this.$.dmCards.getAvailableCuttOffDates({
            productType: this._subProductId,
            binProduct: this._binProduct,
          });
        }
        this.closeSpinner();
      }
    }

    /**
     * Get card offer error response
     * @param {Object} error
     */
    _offerDataError(error) {
      if (this.c(error, 'detail')) {
        this._errorHandler('generic-error');
      }
    }

    /**
     * Get customer address success response
     * @param {Object} response
     */
    _loadAddressData(response) {
      if (this.c(response, 'detail')) {
        this._setAddressInformation(this.c(response, 'detail'));
        this._showHideAddress = !this._showHideAddress;
      }
    }

    /**
     * Get alternate address data form
     * @event 'set-external-address'
     * @param {Object} response
     */
    loadAlternateAddressData(response = {}) {
      if (Object.keys(response).length) {
        // eslint-disable-next-line no-shadow
        const { addressName, zipCode, state: { name } } = this.get('location', response);

        this.alternateButtonLabel = 'oc-credit-card-holder-general-offer-mailing-alternate-change-data';
        this.alternateDescription = `${addressName}, ${zipCode}, ${name}`;

        this._setAddressConfig();
        this._dispatchEvents('set-external-address', { main: '', secondary: '' });
      }
    }

    /**
     * Get customer address error response
     * @param {Object} error
     */
    _addressesDataError(error) {
      if (this.c(error, 'detail')) {
        this._errorHandler('generic-error');
      }
    }

    /**
     * Post credit card hiring success response
     * @param {Object} response
     */
    _loadCreditCardHiringSuccess(response) {
      if (this.c(response, 'detail')) {
        const parseResponse = this._parseCardsResponseSuccessful(this.c(response, 'detail'), 'success');
        this._dispatchEvents('show-successful-contracting', Object.assign(parseResponse, { page: 'review' }));
      }
    }

    /**
     * Post credit card hiring error response
     * @param {Object} error
     */
    _creditCardHiringError(error) {
      if (this.c(error, 'detail')) {
        const payloadErrorResponse = this._parseCardsResponseSuccessful(this.c(error, 'detail'), 'core');
        const errorCode = this._getErrorCode(this.c(this.c(error, 'detail'), 'messages.0.message'));
        this._errorHandler(errorCode, payloadErrorResponse);
      }
    }

    /**
     * Get error code of response
     * @param {String} error
     * @returns
     */
    _getErrorCode(error) {
      return error ? error.substring(0, 7) : 'error-unavailable';
    }

    /**
     * Get business documents success response
     * @param {Object} data
     */
    loadBusinessDocumentsData(data) {
      if (typeof data === 'object') {
        this.set('_errorOnGetDocument', false);
        this.set('_attempsUpdateRfc', 0);
        this.detailDocument = data;
        this._setDocumentList();
      } else {
        this.onDownloadReceiptError();
      }
    }

    /**
     * Reset properties
     */
    reset() {
      this._formatterExtraConfig = {
        language: 'es-mx',
        currencyCode: 'MXN',
        localCurrency: 'MXN'
      };
      this._offerData = {};
      this.typology = '';
      this.checkboxList = {};
      this._cardName = '';
      this.pointsInfo = {};
      this.amountSelected = 0;
      this._amountDefaultData = 0;
      this.deliveryOptionSelected = {};
      this._showDefaultData = false;
      this._showHideAddress = false;
      this._errorOnGetDocument = false;
      this.axisAccount = [];
      this.phantomStep = false;
      this.addressDescription = '';
      this.addressButtonLabel = '';
      this.checkedButtons = {};
      this._isDigitalNativeUser = false;
      this._isNationalityMxIne = false;
      this._isNationalityMxRfc = false;
      this._dataUserForm = {};
      this._attempsUpdateRfc = 0;
      this.userFormCollapsed = false;
      this._skipWhenLoaded = false;
      this.alternateDescription = '';
      this.selectorModalItems = [];
      this.possibleCutDate = '';
      this.possiblePaymentDate = '';
      this.possibleCutOffDay = '';
      this._cutOffDateList();
    }

    /**
     * Handles a step back request on the opx process.
     * This function throws a show-close-confirm event in order to show an alert exit message.
     */
    manageBackButton() {
      const detail = {
        code: 'CREDIT-CARD-HOLDER-EXIT',
        selectedConfig: {
          className: 'error exit',
          openMaximized: false,
          iconOnlyFullHeight: true,
          acceptBtLabel: 'alert-EXIT-CREDIT-CARD-HOLDER-accept',
          cancelBtLabel: 'alert-EXIT-CREDIT-CARD-HOLDER-cancel',
          template: {
            type: 'paragraphs',
            values: [
              {
                icon: 'coronita:alert',
                class: 'spacing'
              },
              {
                title: 'alert-EXIT-CREDIT-CARD-HOLDER-message',
                text: 'alert-EXIT-CREDIT-CARD-HOLDER-second-message'
              }
            ]
          }
        }
      };
      this._dispatchEvents('show-credit-card-holder-modal', detail);
    }

    requestBusinessDocuments() {
      const payloadRequest = {
        'product.id': 'TDC',
        'subproduct.id': this._subProductId
      };
      this.set('_errorOnGetDocument', true);
      this._dispatchEvents('request-business-documents', payloadRequest);
    }

    /**
     * Validate if Non Pre-Approved or Credit Card Holder offer
     * @param {Object} data
     */
    _validateOffer(data) {
      if (this.c(data, 'contractId') === '0SKY') {
        this._isNpa = true;
        this._amountDefaultData = this.c(data, 'amount');
        this._dispatchEvents('send-offer-data-npa', data);
      }
    }

    /**
     * Skip first step when is Non Pre-Approved offer
     */
    _skipFirstStep() {
      this._dispatchEvents('collapsed-first-step', true);
      this._dispatchEvents('set-molecule-header-title', this._cardName);
      this._dispatchEvents('change-label', '');
      this._dispatchEvents('active-next-step', true);
      this._dispatchEvents('set-fixed-step', true);
      this.offerDataCollapsedView();
    }

    /**
     * Method to show spinner
     * @event open-control-veil
     */
    showSpinner() {
      this._dispatchEvents('open-control-veil');
    }

    /**
     * Method to close spinner
     * @event close-control-veil
     */
    closeSpinner() {
      this._dispatchEvents('close-control-veil');
    }

    /**
     * Dispatch Events Offer Details
     * @param {Object} headerContent
     * @param {Object} mainText
     * @param {Object} amountData
     * @param {Object} benefitsList
     * @param {Object} taxesInfo
     */
    _dispatchDetailOfferEvents(headerContent, mainText, amountData, benefitsList, taxesInfo) {
      this._dispatchEvents('set-molecule-header-title', this._cardName);
      this._dispatchEvents('set-header-content', headerContent);
      this._dispatchEvents('set-main-text', mainText);
      this._dispatchEvents('set-amount-data', amountData);
      this._dispatchEvents('set-benefits-list', benefitsList);
      this._dispatchEvents('set-taxes-info', taxesInfo);
    }

    /**
     * Validate word
     * @param {String} word
     * @returns true/false
     */
    _validateWord(word) {
      return word === 'UNAM' || word === 'IPN' || word === 'BBVA';
    }

    /**
     * Parse word
     * @param {String} word
     * @returns word capitalize the first letter
     */
    _parseWord(word) {
      return word.charAt(0).toUpperCase() + word.slice(1).toLowerCase();
    }

    /**
     * Parse cardName in capitalize form
     * @param {String} productName
     * @returns cardName in capitalize form
     */
    _parseProductName(productName) {
      const wordsProductName = [];
      productName.split(' ').forEach(word => {
        wordsProductName.push(this._validateWord(word) ? word : this._parseWord(word));
      });
      const cardName = wordsProductName.join(' ');

      return cardName;
    }

    /**
     * Get accounts of user
     * @param {Object} payload
     */
    getGlobalAccounts(payload) {
      const accountAxis = payload[0].products;
      this.axisAccount = accountAxis.find(account => account.detail.indicators[1].isActive === true);
      this._parsedGlobalAcounts();
    }

    /**
     * Parse axis account of user
     */
    _parsedGlobalAcounts() {
      const chargueAccount = {
        amount: this.c(this.axisAccount, 'primaryAmount'),
        description: this.c(this.axisAccount, 'description'),
        currency: this.c(this.axisAccount, 'primaryAmount.currency'),
        nameAccount: this.c(this.axisAccount, 'titleName')
      };
      const paddingChargeAccount = 'padding-charge-account';
      this._dispatchEvents('set-padding-account-phantom-step', paddingChargeAccount);
      this._dispatchEvents('set-account-info-phantom-step', chargueAccount);
    }

    /**
     * Set headerContent Configuration
     * @returns
     */
    _setHeaderContentConfig() {
      return {
        image: this.c(this._offerData, 'product.image'),
        headerTitle: 'oc-credit-card-holder-general-offer-title',
        headerDescription: 'oc-credit-card-holder-general-offer-desc',
        titleClass: 'bold-type',
        class: 'small-image'
      };
    }

    /**
     * Set amountData Configuration
     * @param {Object} amountDataDetail
     * @returns
     */
    _setAmountDataConfig(amountDataDetail) {
      let amountData = {
        currencyCode: this.c(this._formatterExtraConfig, 'currencyCode'),
        localCurrency: this.c(this._formatterExtraConfig, 'localCurrency'),
        label: 'oc-credit-card-holder-general-offer-amount',
        language: this.c(this._formatterExtraConfig, 'language'),
        amount: this.c(amountDataDetail, 'suggestedAmount.amount'),
        iconSize: 'icon-size-26',
        iconCode: 'coronita:close',
        charMax: 10,
        amountDefault: this.c(amountDataDetail, 'suggestedAmount.amount'),
        amountMin: this.c(amountDataDetail, 'minimumAmount.amount'),
        amountMax: this.c(amountDataDetail, 'maximumAmount.amount'),
        messageAmountInfoClass: 'flex-message'
      };

      if (this._showDefaultData) {
        Object.defineProperty(amountData, 'defaultData', {
          value: {
            classAmount: 'unpadded-decimals-fractional',
            label: this.t('oc-credit-card-holder-general-offer-amount'),
            amount: this.c(amountDataDetail, 'suggestedAmount.amount')
          }
        });
        this.amountSelected = this.c(amountDataDetail, 'suggestedAmount.amount');
      }

      return amountData;
    }

    /**
     * Validate if tarjeta crea case
     * @param {String} productName
     * @returns
     */
    _validateProductName(productName) {
      return productName === 'Tarjeta Crea BBVA';
    }

    /**
     * Set benefitsList Config
     * @returns
     */
    _setBenefitsListConfig(rates) {
      const points = this.get('points', rates) || 0;
      const messageCancelation = {
        class: 'list-without-icons',
        lists: [ 'oc-credit-card-holder-message-cancelation' ]
      };
      const benefitsListDefault = {
        title: 'glomo-loan-offer-principal-lits-benefits',
        class: 'medium-blue',
        icon: true,
        lists: [
          'oc-credit-card-holder-general-offer-benefits-list-first',
          `<strong>${points}</strong>${this.t('oc-credit-card-holder-general-offer-benefits-list-second')}`,
          'oc-credit-card-holder-general-offer-benefits-list-third'
        ]
      };

      const benefitsListCrea = [
        'oc-credit-card-holder-card-crea-benefits-list',
        'oc-credit-card-holder-general-offer-benefits-list-first'
      ];

      if (this._validateProductName(this._cardName)) {
        Object.assign(this.c(benefitsListDefault, 'lists'), benefitsListCrea);
      }

      return [benefitsListDefault, messageCancelation];
    }

    /**
     * @desc Get yyyy-mm-dd format and extract year, month and day separately
     * @param date
     */
    _formatDateToEs(date) {
      const year = date.substr(0, 4);
      const day = date.substr(8, 2);
      const selectedMonth = parseInt(date.substr(5, 2) - 1, 10);
      const newDate = new Date(year, selectedMonth, day);
      const options = {
        year: 'numeric',
        month: 'long',
        day: 'numeric'
      };
      return newDate.toLocaleDateString(this.c(this._formatterExtraConfig, 'language'), options);
    }

    /**
     * set Taxes Information Configuration
     * @param {Object} rates
     * @param {Object} feeAnual
     * @returns
     */
    _setTaxesInfoConfig(rates) {
      const preffixLocale = 'oc-credit-card-holder-interest-rate';
      const textLink = this._validateProductName(this._cardName) ? '' :  this.t('oc-credit-card-holder-interest-rate-modal-info');
      return {
        class: 'unpadded',
        message: `${this.t('oc-credit-card-holder-general-offer-taxes-information', '', {
          cat: this.c(rates, 'cat'),
          tasa: this.c(rates, 'tasa'),
          anualFee: this.getFormattedAmount(this.c(rates, 'anualFee'), this.c(this._formatterExtraConfig, 'currencyCode'), this.c(this._formatterExtraConfig, 'localCurrency'), 'es-mx', true, '.'),
          calculationDate: this._formatDateToEs(this.c(rates, 'calculationDate')),
          product: this._validateProductName(this._cardName) ? this.t(preffixLocale + '-card-crea') : this.t(preffixLocale + '-general-offer')
        })}`,
        link: textLink,
        top: true
      };
    }

    /**
     * Show Modal Rates And Conditions
     */
    showModalRatesAndConditions() {
      this._dispatchEvents('oc-credit-card-holder-interest-rate-modal-text', `${this.t('oc-credit-card-holder-interest-rate-modal-text', '', {tasa: this.get('rates.tasa', this._offerData)})}`);
      this._dispatchEvents('show-modal-rates-and-conditions', true);
    }

    /**
     * set mainText configuration
     */
    _setMainTextConfig() {
      return {
        title: 'glomo-loan-offer-principal-list-features',
        description: 'glomo-loan-offer-desc-body'
      };
    }

    /**
     * Set offerData configuration for filled form step 1
     * @returns
     */
    _setOfferDataConfig() {
      return {
        image: {
          url: this.c(this._offerData, 'product.image'),
        },
        cardName: this._cardName,
        messageInfo: {
          text: this.t('oc-credit-card-holder-general-offer-hiring-info')
        }
      };
    }

    /**
     * Set points blue configuration for filled form step 1
     * @param {Object} pointsInfo
     * @returns
     */
    _setPointsBlueConfig(pointsInfo) {
      return [
        {
          id: 'points-blue',
          keyValues: [
            {
              key: 'oc-credit-card-holder-general-offer-points-title',
              value: `${pointsInfo}%`,
              showCollapsedView: true,
              showOpenView: false,
              id: 'points',
            }
          ]
        }
      ];
    }

    /**
     * Hide step title when step 1 is collapsed = false
     */
    hideStepTitle() {
      this._dispatchEvents('set-step-title', '');
    }

    /**
    * funtion to return the date format
    * @param {Object} date
    * @returns {String}
    */
    _dateFormat(date) {
      const months = ['enero', 'febrero', 'marzo', 'abril', 'mayo', 'junio', 'julio', 'agosto', 'septiembre', 'octubre', 'noviembre', 'diciembre'];
      const dateArray = date.split('-');
      return [`${Number(dateArray[2])} de ${months[Number(dateArray[1]) - 1]}`, dateArray[2]];
    }

    /**
    * Validate that the information in the "available cut-off dates" service is correct.
    * @param {cutOffDateList, paymentDateList}
    */
    _parseDataList(cutOffDateList, paymentDateList) {
      let value = false;
      if (cutOffDateList !== undefined && paymentDateList !== undefined && cutOffDateList.length === 4 && paymentDateList.length === 4) {
        const cutOffDateListFilter = cutOffDateList.filter(item => Object.keys(item).length > 0);
        const paymentDateListFilter = paymentDateList.filter(item => Object.keys(item).length > 0);
        value = cutOffDateListFilter.length > 0 && paymentDateListFilter.length > 0;
      }
      return value;
    }

    /**
    * Success response to show the possible cut off date and payment date in modal items
    * @param {service}
    */
    _successCutOffDateRequest(service) {
      let cutOffDateList = service.detail?.[0]?.possibleCutDate;
      let paymentDateList = service.detail?.[0]?.possiblePaymentDate;
      const validateData = this._parseDataList(cutOffDateList, paymentDateList);
      this.selectorModalItems = [];
      if (validateData) {
        this.selectorModalItems = cutOffDateList.map((cutOffDateItem, index) => {
          const dateFormatCutOffDate = this._dateFormat(cutOffDateItem.cutOffDate);
          const dateFormatPaymentDate = this._dateFormat(paymentDateList[index].paymentDate);
          const formatCutOffDate = this.t('oc-credit-card-holder-cut-off-date-text', '', {dateFormatCutOffDate: dateFormatCutOffDate[0]});
          if (index === 0) {
            this.set('possibleCutDate', dateFormatCutOffDate[0]);
            this.set('possibleCutOffDay', dateFormatCutOffDate[1]);
            this.set('possiblePaymentDate', dateFormatPaymentDate[0]);
          }
          return {
            id: index,
            name: dateFormatPaymentDate[0],
            subtext: formatCutOffDate,
            cutOffDate: dateFormatCutOffDate[0],
            cutOffDay: dateFormatCutOffDate[1]
          };
        });
        this._dispatchEvents('cut-off-date', this.cutOffDateFlag);
        this.cutOffDateData({});
      }
    }

    /**
     * Get cut off dates error response
     * @param {Object} error
     */
    _errorCutOffDateRequest(error) {
      if (this.c(error, 'detail')) {
        this._dispatchEvents('cut-off-date', false);
      }
    }

    /**
    * Configuration by selection of cut-off date
    */
    _cutOffDateList() {
      this._dispatchEvents('selector-modal-items', this.selectorModalItems);
      this._dispatchEvents('selector-modal-item-selected', this.selectorModalItems[0]);
      this._dispatchEvents('selector-modal-first-item-selected', 0);
    }

    /**
    * Change value with selected data
    * @param {Object} data
    */
    cutOffDateData(data) {
      if (Object.keys(data).length > 0) {
        this.set('possibleCutDate', data.cutOffDate);
        this.set('possiblePaymentDate', data.name);
        this.set('possibleCutOffDay', data.cutOffDay);
        this._dispatchEvents('selector-modal-item-selected', data);
      } else {
        this._dispatchEvents('domiciliation-alert-message', 'oc-credit-card-holder-cut-off-date-icon-message');
        this._dispatchEvents('payment-type-subtext', 'oc-credit-card-holder-cut-off-date-payment-type-subtext');
        this._dispatchEvents('domiciliation-title', 'oc-credit-card-holder-payment-date-domiciliation-title');
        this._dispatchEvents('step-title', 'oc-credit-card-holder-general-offer-hiring-payment-type-label2');
      }
      this._dispatchEvents('selected-option', this.possibleCutDate);
      this._dispatchEvents('possible-cut-date', this.possibleCutDate);
      this._dispatchEvents('possible-payment-date', this.possiblePaymentDate);
    }

    /**
    * Set offerData Information when step 1 is collapsed = true
    */
    offerDataCollapsedView() {
      const offerDataInfo = this._setOfferDataConfig();
      const summaryTitle = { summaryAmount: `${this.t('oc-credit-card-holder-general-offer-amount')}:` };
      const pointsBlueInfo = this._setPointsBlueConfig(this.c(this._offerData, 'rates.points'));
      this.amountSelected = this._isNpa ? this._amountDefaultData : this.amountSelected;
      this._dispatchEvents('set-offer-data', offerDataInfo);
      this._dispatchEvents('set-summary-title', summaryTitle);
      this._dispatchEvents('set-amount-selected', this.amountSelected);
      this._dispatchEvents('set-points-blue', pointsBlueInfo);
      this._dispatchEvents('set-step-title', this.t('oc-credit-card-holder-general-offer-hiring-title'));
      if (this.cutOffDateFlag) {
        this._cutOffDateList();
      }
    }

    /**
     * Set all content for step 1 when collapsed = false
     */
    _setContentFirstStep() {
      const headerContentConfig = this._setHeaderContentConfig();
      const mainTextConfig = this._showDefaultData ? '' : this._setMainTextConfig();
      const amountDataConfig = this._setAmountDataConfig(this.c(this._offerData, 'amount'));
      const benefitsListConfig = this._setBenefitsListConfig(this.get('rates', this._offerData) || {});
      const taxesInfoConfig = this._setTaxesInfoConfig(this.c(this._offerData, 'rates'));
      this._dispatchDetailOfferEvents(headerContentConfig, mainTextConfig, amountDataConfig, benefitsListConfig, taxesInfoConfig);
    }

    /**
     * Set delivery option selected an valid index
     * @param {Object} optionSelected
     */
    setDeliveryOptionSelected(optionSelected) {
      const index = this.c(optionSelected, 'index', 0);
      if (this.alternateAddressFlag) {
        optionSelected.name = index === 0 ? 'HOME' : index === 1 ? 'ALTERNATE' : 'BRANCH';
      } else {
        optionSelected.name = index === 0 ? 'HOME' : 'BRANCH';
      }
      this.set('deliveryOptionSelected', optionSelected);
    }


    /**
     * Set TermsAndConditionsList for first time
     */
    _setTermAndConditionsList() {
      this.set('checkboxList', [
        {
          id: 2,
          valid: true,
          active: true,
          buttonText: this.t('oc-credit-card-holder-general-offer-terms-conditions-option-digital-card'),
        },
        {
          id: 4,
          valid: true,
          active: true,
          buttonText: '',
          descriptionBeforeLinkText: 'oc-credit-card-holder-general-offer-terms-conditions-option-label-auth-before',
          linkText: 'oc-credit-card-holder-general-offer-terms-conditions-option-label-auth-link-text',
          descriptionAfterLinkText: 'oc-credit-card-holder-general-offer-terms-conditions-option-label-auth-after',
          eventName: 'show-credit-history-modal'
        },
        {
          id: 5,
          valid: true,
          active: true,
          buttonText: '',
          descriptionBeforeLinkText: 'oc-credit-card-holder-general-offer-terms-conditions-option-label-accept-terms-before',
          linkText: 'oc-credit-card-holder-general-offer-terms-conditions-option-label-accept-terms-link-text',
          descriptionAfterLinkText: this.t('oc-credit-card-holder-general-offer-terms-conditions-option-label-accept-terms-after', '', { cardName: this._cardName }),
          eventName: 'terms-and-conditions-document'
        }
      ]);
      this._dispatchEvents('set-checkbox-list', this.checkboxList);
    }

    /**
     * Validate paymentMethod in step 2 (Domiciliation)
     * @param {Number} paymentMethod
     * @returns
     */
    _paymentMethodSelected(paymentMethod) {
      let suffix = '';
      if (paymentMethod === 0) {
        suffix = 'minimum';
        this.paymentMethodSelected = 'MINIMUM_AMOUNT_PAYMENT';
      } else {
        suffix = 'interest';
        this.paymentMethodSelected = 'MINIMUM_AMOUNT_TO_AVOID_INTEREST_PAYMENT';
      }

      return suffix;
    }

    /**
     * Find checkbox id if exists
     * @param {Number} index
     * @returns
     */
    _findCheckboxId(index) {
      return this.checkboxList.find(checkbox => checkbox.id === index);
    }

    /**
     * Sort TyC list from least to greatest
     */
    _sortTermsAndConditionsList() {
      this.checkboxList.sort(((firtsItem, secondItem) => firtsItem.id - secondItem.id));
      this.checkboxList = [ ...this.checkboxList ];
      this._dispatchEvents('set-checkbox-list', this.checkboxList);
    }

    /**
     * Delete domiciliation checkbox if exists
     * @param {Object} checkExists
     */
    _validateDomiciliationCheckBox(checkExists) {
      if (checkExists) {
        this.checkboxList.splice(2, 1);
      }
    }

    /**
     * add / update domiciliation checkbox from user selection
     * @param {Object} checkDomiciliation
     */
    _setDomiciliationCheckInfo(checkDomiciliation) {
      const paymentMethod = this._paymentMethodSelected(this.c(this.checkedButtons, 'paymentMethodSelected'));
      const checkboxSelectedDomiciliation = {
        id: 3,
        valid: true,
        active: true,
        buttonText: `oc-credit-card-holder-general-offer-terms-conditions-option-payment-${paymentMethod}`,
        preaccepted: true,
        isNotReadOnly: true,
        className: 'help',
        iconMessage: 'coronita:info',
        preacceptedInfoText: 'oc-credit-card-holder-general-offer-terms-conditions-option-payment-info'
      };
      if (checkDomiciliation) {
        this.checkboxList.splice(2, 1, checkboxSelectedDomiciliation);
      } else {
        this.checkboxList.push(checkboxSelectedDomiciliation);
      }
    }

    /**
     * Defines if the checkbox is updated or removed from user selection
     */
    setDomiciliatonCheck() {
      const checkDomiciliation = this._findCheckboxId(3);
      if (this.c(this.checkedButtons, 'switchValue') === true) {
        this._setDomiciliationCheckInfo(checkDomiciliation);
      } else {
        this._validateDomiciliationCheckBox(checkDomiciliation);
        this.paymentMethodSelected = 'NO_DOMICILIATION_PAYMENT';
      }
      this._sortTermsAndConditionsList();
    }

    /**
     * add / update delivery checkbox from user selection
     */
    setDeliveryCheck() {
      const checkDelivery = this._findCheckboxId(1);
      this.setDeliveryOptionSelected(this.deliveryOptionSelected);
      const nameSelected = this.get('deliveryOptionSelected.name');
      const checkboxSelectedDelivery = {
        id: 1,
        valid: true,
        active: true,
        buttonText: `oc-credit-card-holder-general-offer-terms-conditions-option-delivery-${nameSelected}`
      };
      if (checkDelivery) {
        this.checkboxList.splice(0, 1, checkboxSelectedDelivery);
      } else {
        this.checkboxList.push(checkboxSelectedDelivery);
      }
      this._sortTermsAndConditionsList();
    }

    /**
     * Load request for credit card hiring
     */
    loadPayloadRequestCreditCard() {
      const payload = {
        offerId: this._offerId,
        cardAgreement: '',
        cardType: {
          id: this.c(this._offerData, 'cardType')
        },
        product: {
          id: this.c(this._offerData, 'product.id'),
          subproduct: {
            id: this._isNpa ? '0SKY' : '0TDC'
          }
        },
        physicalSupport: {
          id: 'NORMAL_PLASTIC'
        },
        currencies: [
          {
            currency: this.c(this._formatterExtraConfig, 'localCurrency'),
            isMajor: true
          }
        ],
        grantedCredits: [
          {
            amount: this.amountSelected,
            currency: this.c(this._formatterExtraConfig, 'localCurrency')
          }
        ],
        status: {
          id: 'INOPERATIVE'
        },
        deliveries: [
          {
            serviceType: {
              id: 'BOTH_OPTIONS'
            },
            destination: {
              id: this.c(this.deliveryOptionSelected, 'index') === 2 ? 'BRANCH' : 'HOME'
            }
          }
        ],
        paymentMethod: {
          id: this.paymentMethodSelected === 'NO_DOMICILIATION_PAYMENT' ? 'N' : this.paymentMethodSelected,
          frecuency: {
            id: 'MONTHLY'
          }
        },
        relatedContracts: [
          {
            contractId: null,
            numberType: {
              id: 'CCC'
            },
            product: {
              id: 'ACCOUNTS'
            },
            relationType: {
              id: 'LINKED_WITH'
            }
          }
        ],
        offerRecalculationType: {
          id: 'ROF'
        },
        participants: [
          {
            legalPersonType: {
              id: 'SRI'
            }
          }
        ],
        activations: [
          {
            id: 'ON_OFF',
            isActive: true
          }
        ],
        staticFeatures: [
          {
            id: 'EXTERNAL_SCORES'
          },
          {
            id: 'PRE_AUTHORIZED'
          }
        ],
        hiringOrigin: {
          id: 'N'
        }
      };

      if (!this._showDefaultData) {
        delete payload.hiringOrigin;
      }

      if (this.cutOffDateFlag) {
        Object.assign(payload, {cutOffDay: this.possibleCutOffDay});
      }

      this.$.dmCards.postCardsNpm(payload);
    }

    /**
     * Parse getCardOffer response
     * @param {Object} response
     * @returns
     */
    _parseGetCardOfferResponse(response) {
      return {
        id: this.c(response, 'id'),
        cardType: this.c(response, 'cardType.id'),
        product: {
          id: this.c(response, 'details.product.id'),
          name: this.c(response, 'details.product.name'),
          image: this.c(response, 'image.url'),
          binProduct: this.c(response, 'details.associatedBenefit.id'),
          subProduct: {
            id: this.c(response, 'details.product.subProduct.id')
          }
        },
        amount: {
          suggestedAmount: {
            currency: this.c(response, 'details.suggestedAmount.currency'),
            amount: this.c(response, 'details.suggestedAmount.amount')
          },
          minimumAmount: {
            currency: this.c(response, 'details.minimumAmount.currency'),
            amount: this.c(response, 'details.minimumAmount.amount')
          },
          maximumAmount: {
            currency: this.c(response, 'details.maximumAmount.currency'),
            amount: this.c(response, 'details.maximumAmount.amount')
          },
        },
        rates: {
          cat: this.c(response, 'rates.itemizeRates.0.itemizeRatesUnit.percentage'),
          tasa: this.c(response, 'rates.itemizeRates.1.itemizeRatesUnit.percentage'),
          points: this.c(response, 'rates.itemizeRates.2.itemizeRatesUnit.percentage'),
          anualFee: this.c(response, 'fees.itemizeFees.0.itemizeFeeUnit.amount'),
          calculationDate: this.c(response, 'rates.itemizeRates.0.calculationDate')
        },
        origin: this.c(response, 'origin.id'),
        appProcess: this._isNpa ? this.t('oc-credit-card-holder-general-offer-no-pre-approved-process') : this.t('oc-credit-card-holder-general-offer-pre-approved-process'),
        isNonPreApproved: this._isNpa,
        offerType: this.c(response, 'details.offerType')
      };
    }

    /**
     * Event for close modal and go to atmLocator
     */
    showBranches() {
      this._dispatchEvents('close-info-incomplete-modal');
    }

    /**
     * @desc Defines which modal open in step 3 (Delivery)
     * @param {Object} helpIconClicked
     */
    openHelpModalInfo(helpIconClicked) {
      const idRadioButton = this.c(helpIconClicked, 'id');
      if (idRadioButton === 'myHome') {
        this._showMyHomeAlert();
      }
      if (idRadioButton === 'myAlternate') {
        this._showMyAlternateAlert();
      }
      if (idRadioButton === 'branchOffice') {
        this._showBranchOfficeAlert();
      }
    }

    /**
     * Setting properties for credit history modal
     */
    setCreditHistoryModalConfig() {
      const config = {
        code: 'auth-bureau-advice',
        fullHeight: true,
        unfixed: true,
        headerTitle: 'oc-credit-card-holder-general-offer-terms-conditions-modal-header-title',
        closeIconIdRigth: 'coronita:close',
        titleText: 'oc-credit-card-holder-general-offer-terms-conditions-modal-title',
        text: 'oc-credit-card-holder-general-offer-terms-conditions-modal-desc',
        configButtons: {
          buttons: {
            primary: {
              text: 'oc-credit-card-holder-general-offer-know-btn-label',
              class: 'primary'
            }
          }
        }
      };

      this._dispatchEvents('set-credit-history-modal', config);
    }

    /**
     * @desc Show modal branchOffice to icon button
     * @event show-credit-card-holder-modal-branchOffice
     */
    _showBranchOfficeAlert() {
      const branchOfficeInfoModal = {
        code: 'branch-office-info-modal',
        selectedConfig: {
          className: 'full-height-error',
          openMaximized: false,
          iconOnlyFullHeight: true,
          acceptBtLabel: 'oc-credit-card-holder-general-offer-know-btn-label',
          atomIcon: {
            icon: 'coronita:help',
            class: 'icon-size-24'
          },
          message: 'oc-credit-card-holder-general-offer-mailing-address-branch-office',
          template: {
            type: 'paragraphs',
            values: [
              {
                text: 'oc-credit-card-holder-general-offer-mailing-address-branch-office-info-complement'
              }
            ]
          }
        }
      };
      this._dispatchEvents('show-credit-card-holder-modal', branchOfficeInfoModal);
    }

    /**
     * @desc Show modal myHome to icon button
     * @event show-credit-card-holder-modal-myHome
     */
    _showMyHomeAlert() {
      const myHomeInfoModal = {
        code: 'my-home-info-modal',
        selectedConfig: {
          className: 'full-height-error header--white',
          openMaximized: true,
          closeIcon: 'coronita:close',
          closeIconSize: 22,
          title: 'oc-credit-card-holder-general-offer-mailing-address-my-home',
          atomIcon: {
            icon: 'coronita:help',
            class: 'icon-size-24'
          },
          message: 'oc-credit-card-holder-general-offer-mailing-address-my-home',
          acceptBtLabel: 'oc-credit-card-holder-general-offer-know-btn-label',
          template: {
            type: 'paragraphs',
            values: [
              {
                text: 'oc-credit-card-holder-general-offer-my-home-info',
                class: 'text-gray-ml spacing'
              },
              {
                text: 'oc-credit-card-holder-general-offer-my-home-info-complement',
                class: 'text-gray-ml'
              }
            ]
          }
        }
      };
      this._dispatchEvents('show-credit-card-holder-modal', myHomeInfoModal);
    }

    /**
     * @desc Show modal myAlternate to icon button
     * @event show-credit-card-holder-modal-myAlternate
     */
    _showMyAlternateAlert() {
      const myAlternateInfoModal = {
        code: 'my-alternate-info-modal',
        selectedConfig: {
          className: 'full-height-error',
          openMaximized: false,
          iconOnlyFullHeight: true,
          acceptBtLabel: 'oc-credit-card-holder-general-offer-know-btn-label',
          atomIcon: {
            icon: 'coronita:help',
            class: 'icon-size-24'
          },
          message: 'oc-credit-card-holder-general-offer-mailing-address-my-alternate',
          template: {
            type: 'paragraphs',
            values: [
              {
                text: 'oc-credit-card-holder-general-offer-mailing-address-my-alternate-info-complement'
              }
            ]
          }
        }
      };
      this._dispatchEvents('show-credit-card-holder-modal', myAlternateInfoModal);
    }

    /**
     * @desc Show generic error modal
     */
    _showGenericErrorModal() {
      const genericErrorConfigModal = {
        className: 'full-height-error common-error-modal header--blue',
        hideCloseIcon: false,
        openMaximized: true,
        heroImage: Polymer.ResolveUrl.resolveUrl('./images/errors/error.svg'),
        header: 'oc-credit-card-holder-credit-card-title',
        acceptBtLabel: 'oc-credit-card-holder-exit-label',
        cancelBtLabel: '',
        template: {
          type: 'paragraphs',
          values: [
            { title: 'oc-credit-card-holder-error-generic-title', class: 'simple-title' },
            { text: 'oc-credit-card-holder-error-generic-description' }
          ]
        }
      };

      const retryErrorData = {
        errorId: 'GENERIC',
        errorType: 'operative',
        retryConfig: genericErrorConfigModal,
      };

      this._dispatchEvents('retry-error', Object.assign({ retryErrorData }));
    }

    /**
     * @desc Show unavailable error modal
     */
    _showUnavailableErrorModal() {
      const retryErrorData = {
        errorId: 'UNAVAILABLE-OPERATION',
        errorType: 'unfinishedOperations',
        retryConfig: Object.assign({ message: 'oc-credit-card-holder-error-unavailable-operation-retry-message' }),
        callConfig: Object.assign({ message: 'oc-credit-card-holder-error-unavailable-operation-finish-message' })
      };

      this._dispatchEvents('retry-error', Object.assign({ retryErrorData }));
    }

    /**
     * @desc Show info incomplete error modal
     */
    _showInfoIncomplete() {
      const infoIncompleteConfigModal = {
        className: 'full-height-error common-error-modal header--white',
        hideCloseIcon: false,
        openMaximized: true,
        header: this._cardName,
        heroImage: Polymer.ResolveUrl.resolveUrl('./images/Rejection.svg'),
        acceptBtLabel: 'oc-credit-card-holder-general-offer-know-btn-label',
        cancelBtLabel: '',
        template: {
          type: 'paragraphs',
          values: [
            {
              title: 'oc-credit-card-holder-error-info-incomplete-title',
              class: 'simple-title'
            },
            {
              text: 'oc-credit-card-holder-error-info-incomplete-description',
              class: 'spacing'
            },
            {
              text: 'oc-credit-card-holder-error-info-incomplete-complement',
              class: 'spacing--xl'
            },
            {
              linkIcon: 'coronita:place',
              iconClass: 'icon-size-24',
              link: 'oc-credit-card-holder-general-offer-mailing-address-branch-office',
              eventName: 'show-branch-offices',
              class: 'below-paragraph'
            },
          ]
        }
      };

      const retryErrorData = {
        errorId: 'INFO-INCOMPLETE-ERROR',
        errorType: 'operative',
        retryConfig: infoIncompleteConfigModal,
      };

      this._dispatchEvents('retry-error', Object.assign({ retryErrorData }));
    }

    /**
     * @desc Show bureau error modal
     */
    _showBureauErrorModal() {
      const bureauErrorConfigModal = {
        className: 'full-height-error common-error-modal header--white',
        hideCloseIcon: false,
        openMaximized: true,
        header: this._cardName,
        heroImage: Polymer.ResolveUrl.resolveUrl('./images/errors/authorization_error.svg'),
        acceptBtLabel: 'oc-credit-card-holder-general-offer-know-btn-label',
        cancelBtLabel: '',
        template: {
          type: 'paragraphs',
          values: [
            {
              title: 'oc-credit-card-holder-error-bureau-title',
              class: 'simple-title'
            },
            {
              text: 'oc-credit-card-holder-error-bureau-description'
            },
            {
              text: 'oc-credit-card-holder-error-bureau-complement',
              class: 'spacing'
            }
          ]
        }
      };

      const retryErrorData = {
        errorId: 'BUREAU-ERROR',
        errorType: 'operative',
        retryConfig: bureauErrorConfigModal,
      };

      this._dispatchEvents('retry-error', Object.assign({ retryErrorData }));
    }

    /**
     * @desc Set radioButtons information for step 3 (Delivery)
     * @event 'set-reset-icon'
     */
    _setAddressConfig() {
      const radioButtons = [{
        externalLink: false,
        config: {
          id: 'myHome',
          radio: 'oc-credit-card-holder-general-offer-mailing-address-my-home',
          icon: 'coronita:help',
          description: this.addressDescription,
          hideDescriptionButtonText: true,
          descriptionButtonBottom: true,
          descriptionButtonBottomText: this.addressButtonLabel,
          message: 'oc-credit-card-holder-general-offer-mailing-address-my-home-info',
          collapsed: {
            key: this.addressDescription
          },
          class: 'bold-radio-text',
          classIconMessage: 'help',
          classContainer: 'on-block',
          classDescription: 'italic-text'
        }
      },
      ...(this.alternateAddressFlag
        ? [
          {
            externalLink: false,
            config: {
              id: 'myAlternate',
              radio: 'oc-credit-card-holder-general-offer-mailing-address-my-alternate',
              icon: 'coronita:help',
              hideDescriptionButtonText: true,
              description: this.alternateDescription,
              descriptionButtonBottom: true,
              descriptionButtonBottomText: this.alternateButtonLabel,
              message: 'oc-credit-card-holder-general-offer-mailing-address-my-alternate-info',
              collapsed: {
                key: this.alternateDescription
              },
              class: 'bold-radio-text',
              classIconMessage: 'help',
              classContainer: 'on-block',
              classDescription: 'italic-text'
            },
          },
        ]
        : []),
      {
        externalLink: false,
        config: {
          id: 'branchOffice',
          radio: 'oc-credit-card-holder-general-offer-mailing-address-branch-office',
          icon: 'coronita:help',
          message: 'oc-credit-card-holder-general-offer-mailing-address-branch-office-info',
          collapsed: {
            key: 'oc-credit-card-holder-general-offer-mailing-address-branch-office-pick-up'
          },
          class: 'bold-radio-text',
          classIconMessage: 'help',
          classContainer: 'on-block'
        }
      }
      ];

      if (this._validateProductName(this._cardName)) {
        radioButtons.pop();
      }
      this._dispatchEvents('set-radios', radioButtons);
      this._dispatchEvents('set-reset-icon', {showIconMessageButton: true});
    }

    /**
     * @desc show modal privacy link button
     * @event 'show-credit-card-holder-modal'
    */
    showPrivacyModal() {
      const alertMessageNoticeOfPrivacy = {
        code: 'HELP_INFO',
        selectedConfig: {
          className: 'header--white-light info',
          openMaximized: true,
          title: this.t('oc-credit-card-holder-notice-of-privacy-modal-title'),
          acceptBtLabel: this.t('credit-card-upgrade-model-button-text'),
          template: {
            type: 'paragraphs',
            values: [
              { icon: 'coronita:help' },
              { text: this.t('oc-credit-card-holder-notice-of-privacy-modal-title'),
                class: 'strong'
              },
              { text: this.t('oc-credit-card-holder-notice-of-privacy-modal-text-1'),
                class: 'spacing'
              },
              { text: this.t('oc-credit-card-holder-notice-of-privacy-modal-text-2'),
                class: 'spacing'
              }
            ]
          }
        }
      };
      this._dispatchEvents('show-credit-card-holder-modal', alertMessageNoticeOfPrivacy);
    }

    /**
     * @desc Set address unmasked = true / false and change label
     * @param {Object} addressInfo
     */
    _setAddressInformation(addressInfo) {
      const myHome = addressInfo.find(info => info.addressType.id === 'HOME');
      if (this._showHideAddress) {
        this.addressDescription = `${this.c(myHome, 'location.addressName')}, ${this.c(myHome, 'location.state.name')}, ${this.c(myHome, 'location.zipCode')}, ${this.c(myHome, 'location.country.name')}`;
        this.addressButtonLabel = 'oc-credit-card-holder-general-offer-mailing-address-hide-data';
      } else {
        this.addressDescription = `•${this.c(myHome, 'location.state.id')}, ${this.c(myHome, 'location.country.name')}`;
        this.addressButtonLabel = 'oc-credit-card-holder-general-offer-mailing-address-show-data';
      }
      this._setAddressConfig();
    }

    /**
     * @desc Setting document list properties
     */
    _setDocumentList() {
      const documentList = [
        {
          id: '1',
          fileName: this._cardName,
          dividerSize: 'full'
        },
        {
          id: '2',
          fileName: this.t('oc-credit-card-holder-general-offer-document-domiciliation-title'),
          dividerSize: 'full'
        }
      ];

      this._dispatchEvents('set-document-list', documentList);
      this._dispatchEvents('show-documents-modal');
    }

    /**
     * @desc Download pdf
     * @param {Object} responseItem
     */
    downloadBusinessPdf(responseItem) {
      let index;
      if (responseItem === 'bbva-list-file-1') {
        index = 0;
        this.detailDocumentPdfTemplate.title = this.t('credit-card-holder-pdf-title', this._cardName);
      } else {
        index = 1;
        this.detailDocumentPdfTemplate.title = this.t('oc-credit-card-holder-general-offer-document-domiciliation-title');
      }
      this.detailDocumentPdfTemplate.body.documentTemplate.id = this.detailDocument[index].id;
      this.detailDocumentPdfTemplate.body.documentTemplate.templateType.id = this.detailDocument[index].documentTemplate.templateType.id;
      this.detailDocumentPdfTemplate.value = `${this.host}/business-documents/v0/business-documents`;
      this._getNativeDownloadReceipt();
    }

    /**
     * @desc Send event to request the selected PDF
     * @event native-download-receip
     */
    _getNativeDownloadReceipt() {
      this.showSpinner();
      this._dispatchEvents('native-download-receipt', this.detailDocumentPdfTemplate);
    }

    /**
     * @desc PDF request is successful, reset the retry counter
     */
    onDowloadReceiptSuccess() {
      this.set('_attempsUpdateRfc', 0);
      this.closeSpinner();
    }

    /**
     * @desc Retry handler on PDF request
     */
    handleRetryDownloadPdf() {
      if (this._errorOnGetDocument) {
        this.requestBusinessDocuments();
      } else {
        this._getNativeDownloadReceipt();
      }
    }

    /**
     * @desc Opens error modal when getting PDF response fails
     * @event show-credit-card-holder-modal
     */
    onDownloadReceiptError() {
      this._attempsUpdateRfc++;
      const exitValidate = this._attempsUpdateRfc >= this.maxAttempsUpdateRfc;
      const detail = {
        code: exitValidate ? 'CREDIT-CARD-HOLDER-RECEIPT-ERROR-EXIT' : 'CREDIT-CARD-HOLDER-RECEIPT-ERROR-RETRY',
        selectedConfig: {
          className: 'error exit',
          openMaximized: false,
          closeOnPrimaryButton: true,
          noCancelOnOutsideClick: true,
          iconOnlyFullHeight: true,
          acceptBtLabel: exitValidate ? 'oc-credit-card-holder-outdated-error-rfc-message-exit' : 'oc-credit-card-holder-outdated-error-rfc-message-retry',
          cancelBtLabel: exitValidate ? undefined : 'oc-credit-card-holder-outdated-error-rfc-message-exit',
          template: {
            type: 'paragraphs',
            values: [
              {
                icon: 'coronita:alert',
                class: 'spacing'
              },
              {
                title: 'oc-credit-card-holder-receipt-error-title',
                text: exitValidate ? 'oc-credit-card-holder-receipt-error-description-exit' : 'oc-credit-card-holder-receipt-error-description-retry',
              }
            ]
          }
        }
      };
      this.closeSpinner();
      this._dispatchEvents('show-credit-card-holder-modal', detail);
    }

    /**
     * @desc function to close rates and conditions modal
     * @event modal-rates-and-conditions-close
     */
    getPressCloseModal() {
      this._dispatchEvents('modal-rates-and-conditions-close');
    }

    /**
     * @desc Setting payment method success information
     * @param {String} paymentMethod
     * @returns
     */
    _setPaymentMethodSuccess(paymentMethod) {
      let paymentMethodLabel = 'oc-credit-card-holder-general-offer-payment-no-domiciliation-method';
      if (paymentMethod === 'MINIMUM_AMOUNT_PAYMENT') {
        paymentMethodLabel = 'oc-credit-card-holder-general-offer-payment-minimum-amount-method';
      } else if (paymentMethod === 'MINIMUM_AMOUNT_TO_AVOID_INTEREST_PAYMENT') {
        paymentMethodLabel = 'oc-credit-card-holder-general-offer-payment-interest-amount-method';
      }

      return paymentMethodLabel;
    }

    loadSuccessResponse(data) {
      this._successfulInformation = data;
      this._setSuccessfulInfoConfig();
    }

    /**
     * @desc Setting successful response properties
     */
    _setSuccessfulInfoConfig() {
      this.showSpinner();
      this._subProductId = this.c(this._successfulInformation, 'subproductId');
      this._cardName = this.c(this._successfulInformation, 'cardName');
      let parseInformation = [];
      let headerClass = '';

      const paymentDate = this.c(this._successfulInformation, 'paymentDate');
      const cutDate = this.c(this._successfulInformation, 'cutDate');
      const cycleChangeData = paymentDate && cutDate ?
        [
          {
            key: 'oc-credit-card-holder-cut-off-date-possible-payment-date-text',
            value: paymentDate,
            class: 'spacing light-key-ellipsis'
          },
          {
            key: 'oc-credit-card-holder-cut-off-date-possible-cut-date-text',
            value: cutDate,
            class: 'spacing light-key-ellipsis'
          }
        ] :
        [];

      const generalInfo = {
        id: 1,
        title: 'oc-credit-card-holder-success-contracting-title',
        titleDescription: {
          icon: 'coronita:correct',
          text: 'oc-credit-card-holder-success-contracting-description'
        },
        date: this.c(this._successfulInformation, 'operationDate'),
        amountLabel: 'oc-credit-card-holder-general-offer-amount',
        chargeAmount: {
          amount: this.c(this._successfulInformation, 'amount.amount'),
          currency: this.c(this._successfulInformation, 'amount.currency'),
          class: 'amount-huge-decimals'
        },
        destination: {
          avatar: {
            src: this.c(this._successfulInformation, 'image'),
            type: 'card'
          }
        },
        topInfo: [
          { value: '', class: 'spacing lg' },
          {
            value: this.c(this._successfulInformation, 'cardName'),
            class: 'bold'
          },
          {
            musk: {
              value: this.c(this._successfulInformation, 'number'),
              chars: 4,
              simbol: '•'
            },
            class: 'spacing light-key-ellipsis'
          },
          {
            key: 'oc-credit-card-holder-general-offer-hiring-payment-type-label',
            value: this._setPaymentMethodSuccess(this.c(this._successfulInformation, 'paymentMethod')),
            class: 'spacing light-key-ellipsis'
          },
          {
            key: 'oc-credit-card-holder-general-offer-charge-account-label',
            value: this.c(this._successfulInformation, 'accountAlias'),
            musk: {
              value: this.c(this._successfulInformation, 'accountNumber'),
              chars: 5,
              simbol: '•'
            },
            class: 'spacing light-key-ellipsis'
          },
          {
            key: this._parseWord(this.t('oc-credit-card-holder-general-offer-mailing-address-title')),
            value: this.c(this._successfulInformation, 'userAddress'),
            class: 'spacing light-key-ellipsis'
          },
          {
            key: 'oc-credit-card-holder-general-offer-operation-number-label',
            value: `${this.c(this._successfulInformation, 'operationNumber')} <br> BBVA`,
            class: 'spacing light-key-ellipsis'
          },
        ],
        operations: [
          {
            label: 'oc-credit-card-holder-success-contracting-operation-label',
            id: 'download',
            icon: 'coronita:pdf'
          }
        ],
        buttons: {
          primary: {
            text: 'oc-credit-card-holder-exit-label',
            action: 'go-to-next'
          },
          secondary: { hidden: true }
        }
      };

      if (this.c(this._successfulInformation, 'showDateInformation') === true) {
        generalInfo.topInfo.splice(3, 0, ...cycleChangeData);
      }

      const successData = {
        topInfo: [
          ...generalInfo.topInfo,
          {
            iconMessage: {
              type: 'info-dark',
              message: this.c(this._successfulInformation, 'typology') === 'HOME' ? this.t('oc-credit-card-holder-success-contracting-primary-message-home') : this.t('oc-credit-card-holder-success-contracting-primary-message-branch'),
              icon: 'coronita:info',
              class: 'top-icon-message'
            },
            class: 'spacing'
          },
          {
            iconMessageSecondary: {
              type: 'info-dark',
              icon: 'coronita:info',
              message: this.t('oc-credit-card-holder-success-contracting-secondary-message', '', { email: this.customerEmail }),
              class: 'top-icon-message'
            },
            class: 'spacing'
          }
        ]
      };

      const pendingData = {
        title: 'oc-credit-card-holder-pending-contracting-title',
        titleDescription: false,
        topInfo: [
          ...generalInfo.topInfo,
          {
            iconMessage: {
              type: 'info-dark',
              message: 'oc-credit-card-holder-pending-contracting-primary-message',
              icon: 'coronita:info'
            },
            class: 'spacing'
          }
        ],
        operations: [
          {
            label: 'oc-credit-card-holder-pending-contracting-operation-label',
            id: 'share',
            icon: 'coronita:place'
          }
        ]
      };

      if (this.c(this._successfulInformation, 'type') === 'core') {
        parseInformation = Object.assign(generalInfo, pendingData);
        headerClass = 'header--core';
      } else {
        parseInformation = Object.assign(generalInfo, successData);
        headerClass = 'header--dark-success';
      }

      this._dispatchEvents('set-navigate-continue', this.c(this._successfulInformation, 'entryPoint'));
      this._dispatchEvents('set-molecule-header-class', headerClass);
      this._dispatchEvents('set-molecule-header-title', this.c(this._successfulInformation, 'cardName'));
      this._dispatchEvents('set-type-successful-response', this.c(this._successfulInformation, 'type'));
      this._dispatchEvents('set-success-information', parseInformation);
      this._dispatchEvents('set-hidden-hiring-success', false);
      this.closeSpinner();
    }

    /**
     * @desc Parse post cards response
     * @param {Object} response
     * @param {String} type
     * @returns
     */
    _parseCardsResponseSuccessful(response, type) {
      return {
        type: type,
        amount: {
          amount: this.amountSelected,
          currency: this.c(this._formatterExtraConfig, 'localCurrency')
        },
        cardId: this.c(response, 'id'),
        openingDate: this.c(response, 'openingDate'),
        number: this.c(response, 'number', null),
        operationDate: this.c(response, 'operationDate'),
        operationNumber: this.c(response, 'operationNumber'),
        maskAddres: this._showHideAddress,
        title: this._cardName.toUpperCase(),
        image: this.c(this._offerData, 'product.image'),
        paymentMethod: this.paymentMethodSelected,
        typology: this.typology,
        userAddress: this.addressDescription,
        subproductId: this.c(response, 'product.id'),
        cardName: this._cardName.toUpperCase(),
        accountAlias: this.c(this.axisAccount, 'titleName'),
        accountNumber: this.c(this.axisAccount, 'description.value'),
        state: type === 'core' ? this.t('oc-credit-card-holder-pending-contracting-review-status') : this.t('oc-credit-card-holder-success-contracting-accepted-status'),
        entryPoint: this._entryPoint,
        paymentDate: this.possiblePaymentDate,
        cutDate: this.possibleCutDate,
        showDateInformation: this.cutOffDateFlag,
      };
    }

    /**
     * @desc Errors handler of flow
     * @param {String} error
     * @param {Object} payload
     */
    _errorHandler(error, payload) {
      switch (error) {
        case 'WIE0080':
          this._dispatchEvents('send-app-completed-error', Object.assign(payload, { errorCode: 'WIE0080' }));
          this._showBureauErrorModal();
          break;
        case 'WIE0097':
          this._dispatchEvents('show-successful-contracting', Object.assign(payload, { page: 'review', errorCode: 'WIE0097' }));
          break;
        case 'WIE0100':
          this._dispatchEvents('send-app-completed-error', Object.assign(payload, { errorCode: 'WIE0100' }));
          this._showInfoIncomplete();
          break;
        case 'generic-error':
          this._dispatchEvents('send-huella-error-page');
          this._showGenericErrorModal();
          break;
        default:
          this._showUnavailableErrorModal();
          break;
      }
    }

    /**
     * Send sign type request
     * @param {Object} sign
     */
    signTypeRequest(sign) {
      this.$.dmCustomers.signTypeRequest(sign);
      this.$.dmCards.signTypeRequest(sign);
    }
    /**
     * Send otp sign operation otp/key
     * @param {Object} sign
     */
    signRequest(sign) {
      this.$.dmCustomers.signRequest(sign);
      this.$.dmCards.signRequest(sign);
    }
    /**
     * Retrieve customer address
     */
    getCustomerAddresses() {
      this.$.dmCustomers.getCustomerAddresses({
        unmasked: this._showHideAddress
      });
    }
    /**
     * @desc valid description button clicked
     * @event get-check-state-permission'
     * @event open-edit-address-modal
     * @param {Object} deliveryOptionSelected
     */
    validateDescriptionButtonClicked() {
      if (this.c(this.deliveryOptionSelected, 'name') === 'HOME') {
        this.getCustomerAddresses();
      } else {
        this._dispatchEvents('get-check-state-permission', 'location');
        this._dispatchEvents('open-edit-address-modal');
      }
    }
    /**
     * @description recive satate of the location permision
     * @event get-current-position
     * @event get-open-prompt-for-location-service
     * @param {object} response
     */
    permissionRequestSuccess(response) {
      if (response.state === 'granted') {
        this._dispatchEvents('get-current-position');
      } else {
        this._dispatchEvents('get-open-prompt-for-location-service');
      }
    }

    /**
     * @desc message yo show if user is able to update INE and RFC
     */
    _updateMessageBox(_isNationalityMxRfc, _isNationalityMxIne, _userHasIne, _userHasRfc) {
      const messageUpdateIneRfc = !_userHasRfc && _isNationalityMxRfc && !_userHasIne && _isNationalityMxIne;
      const messageUpdateRfc = !_userHasRfc && _isNationalityMxRfc;
      const messageUpdateIne = !_userHasIne && _isNationalityMxIne;
      const message =  messageUpdateIneRfc ? 'oc-credit-card-holder-outdated-icon-message-rfc-ine' : messageUpdateRfc ? 'oc-credit-card-holder-outdated-icon-message-rfc' : messageUpdateIne ? 'oc-credit-card-holder-outdated-icon-message-ine' : '';
      this._dispatchEvents('icon-message-update-ine-rfc', { message });
    }

    /**
     * @desc get update INE and RFC flag
     */
    _getUpdateRfcIneFlag() {
      this._isUpdateIne = this.get('value', this.featureFlagCollection['glomo.ocCreditCardHolder.updateINECreditCardHolderOC']) || false;
      this._isUpdateRfc = this.get('value', this.featureFlagCollection['glomo.ocCreditCardHolder.updateRFCCreditCardHolderOC']) || false;
    }

    /**
     * @private get update alternate address flag
     */
    _getUpdateAlternateAddressFlag() {
      this.alternateAddressFlag = this.get('value', this.featureFlagCollection['glomo.orangeCards.AlternateAddressCreditCardHolder']) || false;
    }

    /**
     * take financial overview contracts in order to determine
     * if current user is native digital
     * @returns {Boolean}
     */
    _computeDigitalNativeUser() {
      const contracts = this.get('financialOverviewDetails.data.contracts') || [];
      const accounts = contracts.filter(item => this.get('productType', item) === 'ACCOUNT');
      if (accounts.length === 0) {
        return true;
      }
      if (accounts.length === 1) {
        const isDigital = this.get('detail.indicators.3.isActive', accounts[0]);
        const level = this.get('detail.level', accounts[0]);
        const isN2 = level === '02';
        const deposits = contracts.filter(item => this.get('productType', item) === 'DEPOSITS');
        const investmentFunds = contracts.filter(item => this.get('productType', item) === 'INVESTMENT_FUNDS');
        const cards = contracts.filter(item => this.get('productType', item) === 'CARDS');
        const loans = contracts.filter(item => this.get('productType', item) === 'LOANS');
        const sumProducts = deposits.length + investmentFunds.length + cards.length + loans.length;
        return isDigital && isN2 && !!(sumProducts === 0);
      } else {
        return false;
      }
    }

    /**
     * @desc validate if customer is able to update RFC and INE
     */
    _validateCustomer() {
      if (this._isUpdateIne || this._isUpdateRfc) {
        this._validateCustomerNationality();
      }
    }

    /**
     * @desc validate if customer nationality is MEX
     */
    _validateCustomerNationality() {
      const customerNationalities = this.get('user.nationalities') || [];
      const nationality = !!customerNationalities.find(customerNationality => customerNationality.id === 'MEX');
      if (nationality) {
        this._isNationalityMxRfc = this._isUpdateRfc;
        this._isNationalityMxIne = !this._isDigitalNativeUser;
      }
    }

    /**
     * @desc show step to update RFC and use INE´s process
     */
    _updateIneRfc() {
      if (!this._userHasRfc && this._isNationalityMxRfc) {
        this._readDocRfc();
      } else {
        this._hideUserFormStep(true);
      }
      if (!this._userHasIne && this._isNationalityMxIne) {
        this._readDocIne();
      }
    }

    /**
     * @desc validate if user already has INE or document  if not can update INE
     * open Edit ine route with params
     */
    _readDocIne() {
      const documents = this.get('user.identityDocuments') || [];
      this._userHasIne = !!(documents.find(docType => (['INE', 'PASSPORT', 'MILITARY'].includes(this.get('documentType.id', docType))) && docType.documentNumber));
      if (!this._userHasIne) {
        const data = {
          customerId: this.customerId,
          email: this.userEmail,
          flagIneTdc: true,
        };
        this._dispatchEvents('data-go-ine-route', Object.assign(data, { page: 'updateNationalId' }));
      }
    }

    /**
     * @desc function to know when the user comes from updating INE by accessing from profile or cch
     * @param {Object} data
     */
    setFlagsComesFromIne(data) {
      this._userHasIne = true;
      if (this.get('operative', data) === 'cch' && this._isNationalityMxIne) {
        this._skipWhenLoaded = true;
      }
    }

    /**
     * @desc function to change to step two when user has just updated INE and steps had been loaded
     */
    skipFirstStepComesFromIne() {
      this._updateIneRfc();
      if (this._skipWhenLoaded) {
        this._dispatchEvents('data-go-ine-route');
        this._dispatchEvents('set-molecule-header-title', this._cardName);
        this._dispatchEvents('collapsed-first-step', true);
        this._dispatchEvents('set-decorated-step', true);
        const stepToActive = this._userHasRfc ? 'active-next-step' : 'active-user-form-step';
        this._dispatchEvents(stepToActive, true);
        this.offerDataCollapsedView();
      }
    }

    /**
     * @desc validate if user already has RFC if not show user-form step
     * request marital status
     */
    _readDocRfc() {
      const documents = this.get('user.identityDocuments') || [];
      this._userHasRfc = !!(documents.find(docType =>  docType.documentType.id === 'RFC' && docType.documentNumber.length === 13));
      if (!this._userHasRfc) {
        this._dispatchEvents('get-marital-status');
        this._dispatchEvents('set-customer-id', this.customerId);
        const inputFieldsRfc = [
          {
            id: 'rfc',
            type: 'text',
            label: 'oc-credit-card-holder-outdated-user-form-label-rfc',
            maxLength: 12,
            required: true,
            allowedChars: '[a-zA-Z0-9]',
            allowedValue: '^[a-zA-Z0-9]{10}$',
            doFieldValidations: true,
            autoValidate: true,
            validateEnterKeyAsBlur: true,
            infoMessage: {
              type: 'info-dark-blue',
              message: 'oc-credit-card-holder-outdated-user-form-message-rfc',
              icon: 'coronita:info',
              sizes: 16,
            },
            errorMessage: {
              message: 'oc-credit-card-holder-outdated-user-form-error-message-rfc',
              icon: 'coronita:alert',
              sizes: 16
            },
          },
          {
            id: 'homoclave',
            type: 'text',
            label: 'oc-credit-card-holder-outdated-user-form-label-homoclave',
            maxLength: 12,
            required: true,
            allowedChars: '[a-zA-Z0-9]',
            allowedValue: '^[a-zA-Z0-9]{3}$',
            doFieldValidations: true,
            autoValidate: true,
            validateEnterKeyAsBlur: true,
            infoMessage: {
              type: 'info-dark-blue',
              message: 'oc-credit-card-holder-outdated-user-form-message-homoclave',
              icon: 'coronita:info',
              sizes: 16
            },
            errorMessage: {
              message: 'oc-credit-card-holder-outdated-user-form-error-message-homoclave',
              icon: 'coronita:alert',
              sizes: 16
            },
          },
          {
            id: 'maritalStatusDropdown',
            type: 'dropdown',
            label: 'oc-credit-card-holder-outdated-user-form-label-marital-status',
            readOnly: false,
            required: true,
          },
          {
            id: 'validateCheckBox',
            type: 'checkbox',
            classList: 'gap-bottom-l',
            label: 'oc-credit-card-holder-outdated-user-form-label-checkbox',
            value: false,
            required: true,
          },
          {
            id: 'contactsMessage',
            infoMessage: {
              message: 'oc-credit-card-holder-outdated-user-form-info-message',
              classList: 'icon-message margin-top-xxxxl',
            }
          },
          {
            id: 'submitButton',
            type: 'button',
            classList: 'primary gap-bottom-l',
            label: 'oc-credit-card-holder-outdated-user-form-button',
            validate: true
          }
        ];
        this._resetPropUserForm(inputFieldsRfc);
      } else {
        this._hideUserFormStep(true);
      }
    }

    /**
     * @desc hide user-form step
     * @param {Boolean} value
     */
    _hideUserFormStep(value) {
      this.userFormCollapsed = value;
      this._dispatchEvents('hide-user-form-step', value);
    }

    /**
     * @desc event for input fiels user-form step
     * @param {Array} data
     */
    _resetPropUserForm(data) {
      this._hideUserFormStep(false);
      this._dispatchEvents('reset-modal-selector');
      this._dispatchEvents('set-cells-step-user-form-items', {
        formFields: data,
        extraDescriptionText: `${this.t('oc-credit-card-holder-outdated-user-form-description-text-1')}<br>${this.t('oc-credit-card-holder-outdated-user-form-description-text-2')}`
      });
    }

    /**
     * @desc set value from marital status selected
     * @param {Object} e
     */
    // eslint-disable-next-line no-shadow
    setMaritalStatusDropdownSelection({name}) {
      const dropdownData = {
        id: 'maritalStatusDropdown',
        value: name
      };
      this._fireSetValueUserDataFormValue(dropdownData);
    }

    /**
     * @desc send value selected
     * @param {Object} data
     */
    _fireSetValueUserDataFormValue(data) {
      this._dispatchEvents('set-step-user-data-form-value', data);
    }

    /**
     * Calls the service modifyCustomer
     * @param {Object} payload
     */
    patchModifyCustomerRequest(payload) {
      if (this.get('fullRfc', payload)) {
        this.userFormCollapsed = true;
        return;
      } else {
        const {rfc, homoclave, maritalStatusDropdown} = payload;
        const fullRfc = rfc + homoclave;
        const maritalStatusSelected = this._civilStatusValues.find(value => [ maritalStatusDropdown ].includes(this.get('name', value)));
        this.set('_dataUserForm.fullRfc', fullRfc);
        this.set('_dataUserForm.idMaritalStatus', this.get('name', maritalStatusSelected));
        const data = {
          maritalStatus: {
            id: this.get('id', maritalStatusSelected)
          },
          identityDocuments: [
            {
              documentNumber: fullRfc,
              documentType: {
                id: 'RFC',
              },
            },
          ],
        };
        this._dispatchEvents('request-customer-patch', data);
      }
    }

    /**
     * modifyCustomer success, event to show successful view
     */
    onPatchModifyCustomerSuccess() {
      this._userHasRfc = true;
      const fields = [
        {
          id: 'fullRfc',
          type: 'text',
          classList: 'gap-bottom-l',
          label: 'oc-credit-card-holder-outdated-user-form-label-full-rfc',
          value: this.get('_dataUserForm.fullRfc'),
          hidden: false,
          readOnly: true
        },
        {
          id: 'maritalStatus',
          type: 'text',
          classList: 'gap-bottom-l',
          label: 'oc-credit-card-holder-outdated-user-form-label-marital-status',
          value: this.get('_dataUserForm.idMaritalStatus'),
          hidden: false,
          readOnly: true
        },
        {
          id: 'continueButton',
          type: 'button',
          classList: 'primary gap-bottom-l',
          label: 'oc-credit-card-holder-outdated-user-form-continue-button',
          validate: true
        }];
      this._dispatchEvents('patch-customer-response-success', {
        descriptionText: '',
        extraDescriptionText: '',
        descriptionInfoMessage: {
          message: 'oc-credit-card-holder-outdated-user-form-success-rfc-message',
          type: 'success-dark',
          classList: 'top-icon-message margin-top-xs gap-bottom-l',
          icon: 'coronita:correct'
        },
        formFields: fields
      });
      this._dispatchEvents('send-analytics-page-view', 'modify-customer-success');
    }

    /**
     * @desc get marital status success
     * @param {Array} data
     */
    onMaritalStatusSuccess(data) {
      const maritalArray = [];
      for (let idM = 0; idM < data.length; idM++) {
        const obj = this.get(`${idM}`, data);
        const maritalId = this.get(`${idM}.id`, data);
        const maritalValue = this._getObjectDesciption(obj);
        maritalArray.push({ value: maritalValue, id: maritalId });
      }
      this._civilStatusValues = this._getCivilStatusValues(maritalArray);
      this._dispatchEvents('set-items-selector', this._civilStatusValues);
    }

    _getCivilStatusValues(maritalArray) {
      const maritalIds = [
        { id: 'B', value: 'MARRIED_WITH_SEPARATED_PROPERTY' },
        { id: 'C', value: 'MARRIED_WITHOUT_SEPARATED_PROPERTY' },
        { id: 'D', value: 'DIVORCED' },
        { id: 'S', value: 'SINGLE' },
        { id: 'U', value: 'COHABITANT' },
        { id: 'V', value: 'WIDOWED' },
        { id: 'X', value: 'SEPARATED' },
      ];
      return maritalArray.map(item => ({
        id: maritalIds.find(marital => this.get('id', item) === this.get('id', marital)).value,
        name: this.get('value', item)
      }));
    }

    /**
     * Returns the object description for SPA language
     * @param {Object} object
     * @returns
     */
    _getObjectDesciption(object) {
      return object.descriptions.find(description => [ 'SPA' ].includes(this.get('language', description))).value;
    }

    /**
     * @desc get marital status error
     */
    onMaritalStatusError() {
      this._errorHandler('generic-error');
    }

    /**
     * @desc modifyCustomer error
     */
    onPatchModifyCustomerError() {
      this._attempsUpdateRfc++;
      if (this._attempsUpdateRfc >= this.maxAttempsUpdateRfc) {
        this._errorExit();
      } else {
        this._errorRetry();
      }
    }

    /**
     * @desc error after three attempts
     */
    _errorExit() {
      const errorExit = {
        className: 'full-height-error common-error-modal header--white',
        hideCloseIcon: false,
        openMaximized: true,
        header: this._cardName,
        heroImage: Polymer.ResolveUrl.resolveUrl('./images/errors/error.svg'),
        acceptBtLabel: 'oc-credit-card-holder-outdated-error-rfc-message-exit',
        cancelBtLabel: '',
        template: {
          type: 'paragraphs',
          values: [
            { title: 'oc-credit-card-holder-outdated-error-rfc-message-title-maximum-requests', class: 'simple-title' },
            { text: 'oc-credit-card-holder-outdated-error-rfc-message-text-maximum-requests'}
          ]
        }
      };
      const retryErrorData = {
        errorId: 'MODIFY-CUSTOMER-ERROR',
        errorType: 'operative',
        retryConfig: errorExit,
      };
      this._dispatchEvents('send-analytics-page-view', 'modify-customer-error-validate');
      this._dispatchEvents('retry-error', Object.assign({ retryErrorData }));
    }

    /**
     * @desc error before three attempts
     */
    _errorRetry() {
      const settings = {
        code: 'modify-customer-error-retry',
        selectedConfig: {
          className: 'full-height-error common-error-modal header--white',
          hideCloseIcon: false,
          openMaximized: true,
          title: this._cardName,
          heroImage: Polymer.ResolveUrl.resolveUrl('./images/errors/error.svg'),
          acceptBtLabel: 'oc-credit-card-holder-outdated-error-rfc-message-retry',
          cancelBtLabel: 'oc-credit-card-holder-outdated-error-rfc-message-exit',
          template: {
            type: 'paragraphs',
            values: [
              { title: 'oc-credit-card-holder-outdated-error-rfc-message-title', class: 'simple-title' },
              { text: 'oc-credit-card-holder-outdated-error-rfc-message-text'}
            ]
          }
        }
      };
      this._dispatchEvents('send-analytics-page-view', 'modify-customer-error-register');
      this._dispatchEvents('show-credit-card-holder-modal', settings);
    }

    /**
    * @desc Set feature flags values
    */
    _getCutOffDateFlag() {
      this.cutOffDateFlag = this.get('value', this.featureFlagCollection['glomo.ocCreditCardHolder.availableCutOffDatesCreditCardHolder']) || false;
    }

    /**
     *  Method for dispatch diferents events
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

  customElements.define(GlomoCreditCardHolderManager.is, GlomoCreditCardHolderManager);
}
