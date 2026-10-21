{
  const {
    html,
  } = Polymer;
  /**
    `<glomo-step-foreign-currency-operation>` is the first step of the foreign currency exchange operative. It shows a radio list selector for the operation type (buy/sell), a selector for the currency type and an input field for the amount of the operation.

    Example:

    ```html
    <glomo-step-foreign-currency-operation></glomo-step-foreign-currency-operation>
    ```
    ## Styling
    The following custom properties and mixins are available for styling:

    ### Custom Properties
    | Custom Property     | Selector | CSS Property | Value       |
    | ------------------- | -------- | ------------ | ----------- |
    | --cells-fontDefault | :host    | font-family  |  sans-serif |
    ### @apply
    | Mixins                                          | Selector                     | Value |
    | ----------------------------------------------- | ---------------------------- | ----- |
    | --glomo-step-foreign-currency-operation         | :host                        | {}    |
    | --cells-icon-message-margin-top-xs-margin-top   | :host margin-top-none        | {}    |

    * @customElement
    * @polymer
    * @extends {Polymer.Element}
    * @demo demo/index.html
  */
  /*eslint "new-cap": [2, {"capIsNewExceptions": ["AmountBehavior"] }]*/
  class GlomoStepForeignCurrencyOperation extends Polymer.mixinBehaviors([
    CellsBehaviors.StepBehavior,
    CellsBehaviors.i18nBehavior,
  ], CellsBehaviors.AmountBehavior(Polymer.Element)) {
    static get is() {
      return 'glomo-step-foreign-currency-operation';
    }
    static get properties() {
      return {
        /**
         * title for the step
         */
        stepTitle: {
          type: String,
          value: 'glomo-step-foreign-currency-operation-header'
        },
        /** Currency of the exchange type. */
        exchangeTypeCurrencyCode: String,
        /**
         * Enables the exchange rate update with each update of the amount to be exchanged
        */
        onInputChange: {
          type: Boolean,
          value: false
        },
        /**
         * Show info text box
        */
        showInfoMessage: {
          type: Boolean,
          computed: '_computeMessageData(infoMessageData)'
        },

        showMessageDataSaving: {
          type: Boolean,
          computed: '_computeShowMessageDataSaving(infoMessageData)'
        },
        showMessageDataTitle: {
          type: Boolean,
          computed: '_computeShowMessageDataTitle(infoMessageData)'
        },
        /**
         * Local currency
         */
        localCurrency: {
          type: String
        },
        /**
         * Set the quantity of fractional.
         */
        quantityFractional: {
          type: Number,
          value: 2
        },
        /**
         * Disable the change link
         */
        disableChange: {
          type: Boolean,
          value: false
        },
        /**
         * Index of the selected operation used for cells-radio-group component
         */
        operationSelectedIndex: {
          type: Number,
          value: 0
        },
        /**
         * Operation list in use for cells-radio-group component
         */
        operationList: {
          type: Array,
          value: [{
            id: 'sell',
            translation: 'glomo-step-foreign-currency-operation-sell',
            disabled: false,
            checked: true
          }, {
            id: 'buy',
            translation: 'glomo-step-foreign-currency-operation-buy',
            disabled: false,
            checked: false
          }]
        },
        /**
         * Operation type
         */
        operationType: {
          type: String,
          observer: '_operationTypeChanged'
        },
        /**
         * Operation Amount
         */
        operationAmount: {
          type: String,
          value: ''
        },
        /**
         * Currency selected from cells-modal-selector
         */
        currencySelected: {
          type: Object
        },
        /**
         * Selected currency flag
         */
        _selectedCurrencyFlag: {
          type: String,
          computed: '_computeSelectedCurrencyFlag(currencySelected)'
        },
        _selectedForeignCurrencyFlag: {
          type: String,
          computed: '_computeSelectedForeignCurrencyFlag(foreignCurrencySelected,countryFlag)'
        },
        /**
         * Country flag
         */
        countryFlag: {
          type: String
        },
        /**
         * Exchange rates get from DM
         */
        exchangeRates: {
          type: Array
        },
        /**
         * Exchange rate selected
         */
        exchangeRateSelected: {
          type: Object
        },
        /**
         * Total header
         */
        totalHeader: {
          type: String,
          value: 'glomo-step-foreign-currency-operation-subheader-total-to-pay'
        },
        /**
         * Total operation amount
         */
        totalAmount: {
          type: Number,
          value: 0
        },
        /**
         * Continue button label
         */
        continueLabel: {
          type: String,
          value: 'glomo-step-foreign-currency-continue'
        },
        /**
         * Continue button enabled
         * Default is false
         */
        continueEnabled: {
          type: Boolean,
          value: false
        },
        /**
         * Change label
         */
        changeLabel: {
          type: String,
          value: 'cells-step-change-button-label'
        },
        /**
         * Filled operation text. Buy | Sell
         */
        filledOperationText: {
          type: String,
          value: 'glomo-step-foreign-currency-operation-filled-operation',
          computed: '_computedFilledOperationText(currencySelected, operationType)'
        },
        /**
         * Filled amount to obtain
         */
        filledOperationAmount: {
          type: Number
        },
        /**
         * Filled amount to obtain text
         */
        filledOperationAmountText: {
          type: String,
          value: 'glomo-step-foreign-currency-operation-filled-amount-text'
        },
        /**
         * Filled amount obtain currency
         */
        filledOperationAmountCurrency: {
          type: String
        },
        /**
         * Filled amount total
         */
        filledTotalAmount: {
          type: Number
        },
        /**
         * Filled amount total text
         */
        filledTotalAmountText: {
          type: String,
          value: 'glomo-step-foreign-currency-operation-filled-change-result'
        },
        /**
         * Filled amount total currency
         */
        filledTotalAmountCurrency: {
          type: String
        },
        /**
         * Displayed current step
         */
        displayedCurrentStep: {
          type: Number,
          value: null
        },
        /**
         * Displayed max steps
         */
        displayedMaxSteps: {
          type: Number,
          value: null
        },
        /**
         * Icon size
         */
        iconSize: {
          type: Number,
          value: 16
        },
        /**
         * Amount info message
         */
        amountInfoMessage: {
          type: String
        },
        /**
         * Is currency select disabled?
         */
        currencySelectDisabled: {
          type: Boolean,
          value: false
        },
        /**
         * Currency select title
         */
        currencySelectTitle: {
          type: String,
          computed: '_setCurrencySelectTitle(currencySelectDisabled, customCurrencySelectTitle)'
        },
        /**
         * Is currency selector visible?
         */
        currencySelectorVisible: {
          type: Boolean,
          value: false,
          computed: '_computeCurrencySelectorVisible(currencySelected, hideCurrencySelectedFlag)'
        },
        /**
         * Country Currency
         */
        currencyCountryText: {
          type: String,
          computed: '_computeCurrencyCountryText(totalCurrency)'
        },
        /**
         * Data to show in cells-icon-message
         */
        infoMessageData: {
          type: Object
        },
        /**
         * Show exchange foreign currency result
         */
        showExchange: {
          type: Boolean,
          value: false
        },
        /**
         * Show info message under amount input
         */
        infoMessage: {
          type: String
        },
        /**
         * Show error message under amount input
         */
        errorMessage: {
          type: String
        },

        /**
         * Force input error
         * @type {Object}
         * @example {
            icon: 'coronita:alert',
            message: 'generic-error',
            invalid: true
          }
         */
        invalidWithoutLimits: {
          type: Object,
          value: () => ({})
        },
        /** The base currency */
        baseCurrency: {
          type: String
        },

        /** Currency code for selected item */
        totalCurrency: {
          type: String
        },

        /** Information text */
        infoText: {
          type: String,
          value: ''
        },
        /** Additional info text */
        additionalInfo: {
          type: String,
          value: ''
        },
        /**
         * Icon type for help button
         * example: 'coronita:help'
         */
        helpIcon: {
          type: String,
          value: ''
        },
        /**
         * Help button Aria label for icon
         */
        helpButtonAriaLabel: {
          type: String,
          value: 'glomo-foreign-currency-help-button-aria-label'
        },
        /** flag attribute for currency country label  */
        hasCountryCurrencyLabel: {
          type: Boolean,
          value: false
        },
        _showInfoText: {
          type: Boolean,
          computed: '_computeShowInfotext(infoText)'
        },
        conversionText: String,
        conversionTextFilled: String,
        infoSecondMessageData: {
          type: Object
        },
        /**
         * Custom alt text of total operation image
         */
        altTextImageTotal: String,
        /**
         * Currency selector aria label
         */
        currencySelectorAriaLabel: {
          type: String,
          value: 'glomo-step-foreign-currency-operation-currency-selector-aria-label'
        },
        /**
         * Currency selector aria label with current currency selected
         */
        currencySelectedAriaLabel: {
          type: String,
          computed: '_computeSelectedAriaLabel(currencySelected)',
          value: 'glomo-step-foreign-currency-operation-currency-selector-aria-label'
        },
        /**
         * Message to show on the screen reader only component
         */
        messageKey: {
          type: String,
          value: 'glomo-screen-reader-only-two-currency'
        },
        /**
         * Default currency exchange amount
         */
        defaulCurrencyAmount: {
          type: String,
          value: '1'
        },
        /**
         * Computed currency exchange amount
         */
        screenReaderCurrencyAmount: {
          type: String,
          computed: '_computeScreenReaderCurrencyAmount(defaulCurrencyAmount)'
        },
        /**
         * Show screen reader text only whe it is true
         */
        showScreenReader: {
          type: Boolean,
          value: false
        },
        /**
         * Default currency types to show in screen reader component
         */
        dataSavingReaderOnly: {
          type: Array,
          computed: '_computeScreenReaderCurrencyTypes(infoMessageData, baseCurrency)',
          value: () => []
        },
        /**
         * Default currency types to show in info message screen reader component
         */
        dataInfoCurrencyReaderOnly: {
          type: Array,
          computed: '_computeScreenReaderInfoCurrencyTypes(infoMessageData, baseCurrency)',
          value: () => []
        },
        /**
         * Default screen reader first key value
         */
        screenReaderFirstKey: {
          type: String,
          value: 'amount1'
        },
        /**
         * Default screen reader second key value
         */
        screenReaderSecondKey: {
          type: String,
          value: 'amount2'
        },
        /**
         * Default screen reader type value
         */
        screenReaderType: {
          type: String,
          value: 'currency'
        },
        /**
         * To show the commission information
         */
        commissionCurrencyList: {
          type: Array,
          value: () => []
        },
        /**
         * Limit max number of characters
         */
        maxCharacters: { type: String },
        /**
         * Flag if true, hides radio group
         */
        hideCellsRadioGroup: {
          type: Boolean,
          value: false
        },
        /**
         * Language property
         */
        language: {
          type: String,
          value: 'es'
        },
        /**
         * Origin account balance
         */
        maxProduct: {
          type: String,
          value: ''
        },
        /**
         * Equivalence of amount property in cells-enter-limited-amount
         */
        amount: {
          type: Number,
        },
        /**
         * Amount config to be shown when filled
         */
        _filledAmount: {
          type: Object,
          computed: '_computeFilledAmount(amount, localCurrency)'
        },
        /**
         * Flag that if true, shows message underneath amount in filled section
         */
        showMessageBelowAmountCollapsed: {
          type: Boolean,
          value: false
        },
        /**
         * Message shown when showMessageBelowAmountCollapsed property is true
         */
        messageBelowAmountCollapsed: {
          type: String,
          value: ''
        },
        /**
         * Flag that if true, shows currency in message below amount in filled section
         */
        showCurrencyMessageBelowAmountCollapsed: {
          type: Boolean,
          value: false
        },
        /**
         * Message shown below amount, usually used to show currency
         */
        messageCurrencyBelowAmountCollapsed: {
          type: String,
          value: ''
        },
        /**
         * Flag that if true, shows a message underneath amount
         */
        showAmountFilledInfoMessage: {
          type: Boolean,
          value: false
        },
        /**
         * Message to be shown when showAmountFilledInfoMessage property is true
         */
        amountFilledInfoMessage: {
          type: String,
          value: ''
        },
        /**
         * Equivalence of set-amount property in cells-enter-limited-amount
         */
        setAmount: {
          type: Number,
          notify: true
        },
        /**
         * Property used to change class depending if it is active or inactive
         */
        stepState: {
          type: String,
          computed: '_setStepState(active)'
        },
        /**
         * Used when local currency is different than currencies used in converter
         */
        localCurrencyIsDifferentThanEquivalenceCurrencies: {
          type: Boolean,
          value: false
        },
        /**
         * Base currency in equivalence, used when it needs to be in specific order
         */
        firstCurrencyInEquivalence: {
          type: String,
          computed: '_setFirstCurrencyInEquivalence(localCurrencyIsDifferentThanEquivalenceCurrencies, currencySelected)'
        },
        /**
        * Value of firstCurrencyInEquivalence when it needs to be customized
        */
        customFirstCurrency: {
          type: String,
        },
        /**
         * Quote currency in equivalence, used when it needs to be in specific order
         */
        quoteCurrency: {
          type: String,
          computed: '_setSecondCurrencyInEquivalence(localCurrencyIsDifferentThanEquivalenceCurrencies, currencySelected)'
        },
        /**
         * Property used to hide heading above input
         */
        hideHeading: {
          type: Boolean,
          value: false
        },
        /**
         * Flag used to know when equivalence has been updated
         */
        exchangeRatesUpdated: {
          type: Boolean,
          value: false,
        },
        /**
         * Amount that will be substracted to maxProduct, its value will depend on service response
         */
        amountInOriginCurrency: {
          type: Number,
        },
        /**
         * Meessage shown when amountInOriginCurrency is greater than maxProduct.
         */
        notEnoughBalanceAfterKey: {
          type: String,
          value: ' '
        },
        /**
         * Flag used to hide selector in origin's flag image
         */
        disableFlagSelector: {
          type: Boolean,
          value: false
        },
        /**
         * Flag used to know when to show exchangeRates error messaages
         */
        exchangeRatesServiceIsUsed: {
          type: Boolean,
          value: false
        },
        /**
         * Used when amount needs to be greater than specific value, only used when exchangeRatesServiceIsUsed is false
         */
        minValue: {
          type: Number
        },
        /**
         * Used to hide message when using minValue, if there is maxProduct, minValue message should not be shown
         */
        hideMinValueMessage: {
          type: Boolean,
          value: false
        },
        /**
         * Message shown when minValue error is displayed
         */
        minValueErrorMessage: {
          type: String,
          value: 'glomo-step-foreign-currency-operation-min-value-error-message'
        },
        /**
         * Flag used to hidee minValue error message when maxProduct error message is shown
         */
        hideAmountInMinOrMaxErrorMessage: {
          type: Boolean,
          value: false
        },
        /**
         * Origin's account currency, used when localCurrency is different than origin account currency
         */
        originCurrency: {
          type: String,
        },
        /**
         * Peroperty to control min value by currency, all currencies should have their own minValue's
         */
        minValuesByCurrency: {
          type: Object,
          value: () => ({})
        },
        /**
         * Used to show desired icon
         */
        iconCode: {
          type: String,
          value: 'coronita:close'
        },
        /**
         * Used to show infoMessage at the top
         */
        showAlterInputInfo: {
          type: Boolean,
          computed: '_setShowAlterInputInfo(infoMessage)'
        },
        /**
         * Text shown inside input
         */
        label: {
          type: String,
          value: 'glomo-step-foreign-currency-operation-amount'
        },
        /**
         * Used when we need to specify quote currency in equivalence
         */
        customSecondCurrency: {
          type: String
        },
        /**
         * Text in currencySelectTitle when needed to be custom
         */
        customCurrencySelectTitle: {
          type: String,
          value: ''
        },
        /**
         * Flag that if true, shows arrows button
         */
        showIconButtonInExchangeRatesSection: {
          type: Boolean,
          value: false
        },
        /**
         * Flag that if true, show equivalenceValue ( 1 EUR = 1.2 USD)
         */
        showEquivalenceValue: {
          type: Boolean,
          value: false
        },
        /**
         * Flag that if true, shows selector next to foreign currency image
         */
        showSelectorInForeignCurrencyFlag: {
          type: Boolean,
          value: false
        },
        /**
         * Boolean property to know if alert should be shown before uncollapsing step
         */
        showAlertBeforeUncollapsing: {
          type: Boolean,
          value: false
        },
        /**
          * Flag to active focus out channel when we want automatically acurance on origin input
          */
        exchangeRatesWithLocalOnOrigin: {
          type: Boolean,
          value: false
        },
        /**
          * For change the label down the cells-enter-limited-amount input initial state
          */
        limitedAmountAvailableMessage: {
          type: String,
          value: 'cells-enter-limited-amount-available'
        },
        /**
          * For change the label down the cells-enter-limited-amount input
          */
        limitedAmountAvailableOfTransactionMessage: {
          type: String,
          value: 'cells-enter-limited-amount-available-of-transaction'
        },
        /**
         * Flag used to hide flag image in origin's section
         */
        hideCurrencySelectedFlag: {
          type: Boolean,
          value: false
        },
        /**
         * Type of icon in cells-icon-message
         */
        iconMessageType: {
          type: String,
          value: 'info'
        },
        /**
         * The icon in show message section in cells-icon-message
         */
        iconMessage: {
          type: String,
          value: 'coronita:info'
        },
        /**
         * Class section additional info
         */
        additionalInfoClass: {
          type: String,
          value: 'additional-info'
        },
        /**
         * Enable decimal keyboard in ios
         * @type {Boolean}
         */
        decimalInputModeIos: {
          type: Boolean,
          value: false
        },
        /*
         * Hide exchange rate counter message
         */
        hideExchangeRateMessage: {
          type: Boolean,
          value: false
        },
        /**
         * Flag to show amount section
         */
        showAmountSection: {
          type: Boolean,
          value: false
        },
        /**
         * flag to show exhange rates section
         */
        showExchangeSection: {
          type: Boolean,
          value: false
        },
        /**
         * flag to show exchange section
         */
        flagExchangeSection: {
          type: Boolean,
          value: false
        },
        /**
         * Currency selected from cells-modal-selector on second input
         */
        foreignCurrencySelected: {
          type: Object
        },
        /**
         * amount property in cells-enter-limited-amount second input
         */
        foreignAmount: {
          type: Number
        },
        /**
         * set-amount property in cells-enter-limited-amount second input
         */
        setForeignAmount: {
          type: Number,
          notify: true
        },
        foreignCurrencySelectDisabled: {
          type: Boolean,
          value: false
        },
        /**
         * overdraft balance value
         */
        secondaryAmount: {
          type: Object,
          value: () => ({})
        },
        /**
         * Hide foreign amount
         */
        hideForeignAmount: {
          type: Boolean,
          value: false
        },
        /**
         * Show foreign currency equivalence text
         */
        showForeignCurrencyEquivalenceText: {
          type: Boolean,
          value: false
        },
        /**
         * Foreign currency equivalence text
         */
        foreignCurrencyEquivalenceText: {
          type: String,
          value: ''
        },
        /**
         * Hide initial amount
         */
        hideInitialAmount: {
          type: Boolean,
          value: false
        },
        /**
         * Flag that allows onBlur event in amount inputs
         */
        isAmountBlurEnabled: {
          type: Boolean,
          value: false
        },
        /**
         * Flag that shows foreignAmount in collapsed step
         */
        showForeignAmountCollapsedStep: {
          type: Boolean,
          value: false
        },
        /**
         * Amount config to be shown when filled
         */
        _filledForeignAmount: {
          type: Object,
          computed: '_computeForeignFilledAmount(foreignAmount, totalCurrency)'
        },
        /**
         * Amount can be zero (required for showing an inline error)
         */
        zeroAmountAllowed: {
          type: Boolean,
          value: false
        },
      };
    }

    static get observers() {
      return [
        '_operationChanged(operationList, operationSelectedIndex)',
        '_updateInputValue(amount)',
        '_continueEnabledValidationExchangeRates(exchangeRatesUpdated)'
      ];
    }

    connectedCallback() {
      super.connectedCallback();
      this.addEventListener('change-pressed', this.onChangePressed);
      this.addEventListener('keyup', this.keyUp);
      this.addEventListener('open-document-modal-selector', this.onClickIcon);
    }

    disconnectedCallback() {
      super.disconnectedCallback();
      this.removeEventListener('change-pressed', this.onChangePressed);
      this.removeEventListener('keyup', this.keyUp);
      this.removeEventListener('open-document-modal-selector', this.onClickIcon);
    }

    /**
     * It generates necessary structure to be used to show amount when filled
     *
     * @method _computeFilledAmount
     * @param  {Number} amount
     * @param  {String} localCurrency
     * @return {Object}
     */
    _computeFilledAmount(amount, localCurrency) {
      if (this.currencySelected) {
        return {
          amount: amount,
          currencyCode: this.currencySelected.id,
          currency: localCurrency,
          class: 'amount-huge-decimals'
        };
      }
    }

    /**
     * It generates necessary structure to be used to show amount when filled
     *
     * @method _computeFilledAmount
     * @param  {Number} amount
     * @param  {String} localCurrency
     * @return {Object}
     */
    _computeForeignFilledAmount(amount, currency) {
      if (this.foreignCurrencySelected) {
        return {
          amount: amount,
          currencyCode: this.foreignCurrencySelected.id,
          currency: currency,
          class: 'amount-huge-decimals'
        };
      }
    }

    /**
     * Sets step state
     * @param {Boolean} active
     * @returns
     */
    _setStepState(active) {
      return active ? 'step-active' : 'step-inactive';
    }

    /**
     * Sets value for first currency in equivalence
     * @param {Boolean} localCurrencyIsDifferentThanEquivalenceCurrencies
     * @param {Object} currencySelected
     * @returns
     */
    _setFirstCurrencyInEquivalence(localCurrencyIsDifferentThanEquivalenceCurrencies, currencySelected) {
      if (currencySelected) {
        return localCurrencyIsDifferentThanEquivalenceCurrencies ? this.customFirstCurrency : currencySelected.id;
      }
    }

    /**
     * Sets value for second currency in equivalence
     * @param {Boolean} localCurrencyIsDifferentThanEquivalenceCurrencies
     * @param {Object} currencySelected
     * @returns
     */
    _setSecondCurrencyInEquivalence(localCurrencyIsDifferentThanEquivalenceCurrencies, currencySelected) {
      if (currencySelected) {
        return localCurrencyIsDifferentThanEquivalenceCurrencies ? this.customSecondCurrency : this.localCurrency;
      }
    }


    /**
     * Validates if continueEnable should be true or false depending on amountInOriginCurrency value
     * @param {Boolean} exchangeRatesUpdated
     */
    _continueEnabledValidationExchangeRates(exchangeRatesUpdated) {
      if (exchangeRatesUpdated) {
        if (this.amountInOriginCurrency > 0 && this.amountInOriginCurrency <= this.maxProduct) {
          this.continueEnabled = true;
        } else {
          this.continueEnabled = false;
        }
      }
      this.exchangeRatesUpdated = false;
    }

    /**
     * Receives amount and validates if continueEnabled should be true or false
     * Should never enable continueEnabled if amount is 0 or equals
     * @param {Number} amount
     */
    _updateInputValue(amount) {
      this.setAmount = amount;
      if (this.hideCellsRadioGroup) {
        if (!this.showExchange) {
          if (amount > 0 && amount <= this.maxProduct) {
            this.continueEnabled = true;
          } else {
            this.continueEnabled = false;
          }
        } else {
          this.continueEnabled = false;
        }
      }
    }

    /**
     * Method to send 'this' to outside without clicking on change button and accessing onChangePressed
     */
    getThisDetailForTimeOut() {
      this.dispatchEvent(new CustomEvent('detail-this-timeout', {
        composed: true,
        bubbles: true,
        detail: this
      }));
    }

    /**
     * On change pressed step
     */
    onChangePressed(e) {
      e.stopPropagation();
      if (!this.showAlertBeforeUncollapsing) {
        this.collapsed = false;
        /**
         * Fired when change pressed step
         * @event change-step-state
         */
        this.dispatchEvent(new CustomEvent('change-step-state', {
          composed: true,
          bubbles: true,
          detail: this
        }));

        /**
         * Fired when change pressed step
         * @event foreign-currency-operation-confirm
         */
        this.dispatchEvent(new CustomEvent('foreign-currency-operation-confirm', {
          bubbles: true,
          composed: true,
          detail: false
        }));
      } else {
        /**
        * Fired when change pressed step
        * @event change-step-state-receiver
        */
        this.dispatchEvent(new CustomEvent('change-step-state-receiver', {
          composed: true,
          bubbles: true,
          detail: this
        }));
      }
    }

    /**
     * On click continue button
     */
    _onContinue() {
      this.collapsed = true;
      if (this.hideCellsRadioGroup) {
        this.operationAmount = this.amount;
      }
      /**
       * Fired when continue button is pressed
       * @event step-set-value
       */
      this.dispatchEvent(new CustomEvent('step-set-value', {
        bubbles: true,
        composed: true,
        detail: {
          type: this.operationType,
          amount: {
            currency: this.currencySelected.id,
            amount: this.operationAmount
          }
        }
      }));
      /**
       * Fired when continue button is pressed
       * @event step-continue
       */
      this.dispatchEvent(new CustomEvent('step-continue', {
        bubbles: true,
        composed: true,
        detail: this
      }));
    }

    /**
     * Returns exchange rate
     * @param currency
     * @param operationType
     */
    _getExchangeRate(currency, operationType) {
      if (!this.exchangeRates || !currency) {
        return null;
      }

      if (this.get('exchangeRates', this.exchangeRates[0]).length > 1) {
        operationType = operationType === 'sell' ? 'PURCHASE' : 'SALE';
      } else {
        operationType = operationType === 'buy' ? 'PURCHASE' : 'SALE';
      }      const selectedRate = this.exchangeRates.find(r => {
        return r.targetCurrency === currency;
      }).exchangeRates.find(e => {
        return e.operationType.id === operationType;
      });

      return {
        currency: currency,
        rate: parseFloat(selectedRate.value || 0).toFixed(this.quantityFractional)
      };
    }

    /**
     * Set exchange rates from DM
     * @param exchangeRates
     */
    setExchangeRates(exchangeRates) {
      this.set('exchangeRates', exchangeRates);
      this.set('showExchange', true);

      const exchangeRateSelected = this.currencySelected && this._getExchangeRate(this.currencySelected.id, this.operationType);

      if (exchangeRateSelected) {
        this.set('exchangeRateSelected', exchangeRateSelected);
      }
    }

    /**
     * Set currencySelected from cells-modal-selector component
     * @param currencySelected
     */
    setCurrencySelected(currencySelected) {
      if (currencySelected && (currencySelected.id || currencySelected.item.id)) {
        const currencyData = this.get('item', currencySelected) || currencySelected;
        this.set('currencySelected', currencyData);
        this.set('exchangeRateSelected', this._getExchangeRate(this.currencySelected.id, this.operationType));
      }
    }

    /**
     * Set foreign currency input
     * @param foreignCurrencySelected
     */
    setForeignCurrencySelected(foreignCurrencySelected) {
      if (foreignCurrencySelected && foreignCurrencySelected.id || foreignCurrencySelected.item.id) {
        const foreignCurrencyData = this.get('item', foreignCurrencySelected) || foreignCurrencySelected;
        this.set('foreignCurrencySelected', foreignCurrencyData);
      }
    }

    /**
     * Fires glomo-foreign-currency-pressed-flag event
     */
    onClickIcon() {
      if (!this.currencySelectDisabled || !this.foreignCurrencySelectDisabled) {
        /**
         * Fired when continue button is pressed
         * @event glomo-foreign-currency-pressed-flag
         */
        this.dispatchEvent(new CustomEvent('glomo-foreign-currency-pressed-flag', {
          bubbles: true,
          composed: true,
          detail: this
        }));
      }
    }

    /**
     * Observer function for operationSelectedIndex and operationList property
     * @param operationList
     * @param operationSelectedIndex
     */
    _operationChanged(operationList, operationSelectedIndex) {
      if (!this.hideCellsRadioGroup) {
        if (typeof operationSelectedIndex === 'number') {
          const operationType = operationList[operationSelectedIndex].id;
          this.set('operationType', operationType);
          this.set('totalHeader', 'glomo-step-foreign-currency-operation-subheader-total-to-' + (operationType === 'sell' ? 'obtain' : 'pay'));
        }
      }
    }

    /*
     * Event emited when operationType changes
     */
    _operationTypeChanged(operationType) {
      if (operationType && this.currencySelected && this.currencySelected.id) {
        /**
         * Dispatches an event to open an alert glomo-alert-manager
         */
        this.dispatchEvent(new CustomEvent('glomo-foreign-currency-edit-operation', {
          bubbles: true,
          composed: true,
          detail: {
            operationType: operationType
          }
        }));
      }
    }

    /*
     * Method called with calculated values after 'operation-changed' event
     */
    setUpdatedAmount(e) {
      if (this.exchangeRateSelected && this.exchangeRateSelected.currency && this.currencySelected) {
        if (!e) {
          this.set('totalAmount', this.operationAmount * this.exchangeRateSelected.rate);
        } else {
          this.set('totalAmount', e.amount);
          this.set('totalCurrency', e.currency);
        }
        this.continueEnabled = true;
      }
    }

    /**
     * Amount input changed handler
     * Should never enable when input is 0 or equals
     */
    onAmountInputChanged(e) {
      if (!this.hideCellsRadioGroup && this.onInputChange) {
        if (e.detail === 0 || e.detail === undefined) {
          this.$.amountInput.invalid = false;
          this.reset();
        } else if (e.detail < 1 && e.detail !== 0) {
          this.$.amountInput.invalid = true;
          this.continueEnabled = false;
          this.totalAmount = 0;
        } else {
          this.$.amountInput.invalid = false;
          this.set('operationAmount', e.detail);
          this.setUpdatedAmount();
        }
      }
      this.dispatchEvent(new CustomEvent('glomo-foreign-currency-input-change', {
        bubbles: true,
        composed: true,
        detail: this.get('detail', e)
      }));
    }

    /**
     * Amount input blur handler
     */
    _onAmountInputBlur(e) {
      if (!this.hideCellsRadioGroup || this.isAmountBlurEnabled) {
        if (this.zeroAmountAllowed && e.target.amount === 0) {
          this.$.amountInput.invalid = false;
          this.operationAmount = e.target?.amount;
          this.dispatchEvent(new CustomEvent('foreign-currency-request-exchange-data', {
            bubbles: true,
            composed: true,
            detail: {
              amount: this.operationAmount,
              currency: this.currencySelected?.id,
              operationType: this.operationType
            }
          }));
        } else if (e.target.amount === 0 || e.target.amount === undefined) {
          this.$.amountInput.invalid = false;
          this.reset();
        } else if (e.target.amount < 1 && e.target.amount !== 0) {
          this.$.amountInput.invalid = true;
          if (!this.showMessageDataTitle) {
            this.set('infoMessageData', undefined);
          }
          this.continueEnabled = false;
          this.errorMessage = `glomo-step-foreign-currency-operation-error-message-${this.currencySelected.id}`;
          this.operationAmount = e.target?.amount;
          this.invalidAmountExchange(true);
        } else {
          this.$.amountInput.invalid = false;
          this.operationAmount = e.target?.amount;
          this.invalidAmountExchange(false);

          this._invertedFlagValue(false);
          /**
           * Fired when change pressed step
           * @event foreign-currency-request-exchange-data
          */
          this.dispatchEvent(new CustomEvent('foreign-currency-request-exchange-data', {
            bubbles: true,
            composed: true,
            detail: {
              amount: this.operationAmount,
              currency: this.currencySelected.id,
              operationType: this.operationType
            }
          }));
        }
      }
    }

    /**
     * @description Exchange amount input handler
     * @param {*} e
     */
    _onAmountInputExchangeBlur(e) {
      if (e.target.amount) {
        this._invertedFlagValue(true);
        this.dispatchEvent(new CustomEvent('foreign-currency-request-exchange-data-second-input', {
          bubbles: true,
          composed: true,
          detail: {
            amount: e.target.amount,
            currency: this.foreignCurrencySelected.id
          }
        }));
      }
    }

    _invertedFlagValue(value) {
      this.dispatchEvent(new CustomEvent(`glomo-foreign-currency-inverted-flag-${value}`, {
        bubbles: true,
        composed: true,
        detail: value
      }));
    }

    /**
     * Init step
     */
    init() {
      this.initialize();
      this.reset();
    }

    /**
     * Reset step
     */
    reset(inProperties) {
      const properties = inProperties ? inProperties : {
        operationSelectedIndex: this.operationSelectedIndex,
        operationAmount: '',
        totalAmount: 0,
        continueEnabled: false,
        collapsed: false,
        active: true,
        infoMessageData: undefined
      };
      this.setProperties(properties);

      this.operationList.forEach(el => {
        el.disabled = false;
      });

      this.amountInfoMessage = '';
      this.$.amountInput.setAmount = '';
      this.$.amountInput.invalid = false;
      this.invalidAmountExchange(false);
      /**
       * Fired when finish reset
       * @event foreign-currency-reseted
       */
      this.dispatchEvent(new CustomEvent('foreign-currency-reseted', {
        bubbles: true,
        composed: true
      }));
    }


    /**
     * Fired when want to reset invalid exchange amount in opx
     * @event foreign-currency-request-exchange-data-invalid-amount
     */
    invalidAmountExchange(detail) {
      this.dispatchEvent(new CustomEvent('foreign-currency-request-exchange-data-invalid-amount', {
        bubbles: true,
        composed: true,
        detail: detail
      }));
    }

    /**
     * Computed currency select title
     */
    _setCurrencySelectTitle(currencySelectDisabled, customCurrencySelectTitle) {
      if (customCurrencySelectTitle) {
        return customCurrencySelectTitle;
      } else {
        return currencySelectDisabled ? 'glomo-step-foreign-currency-operation-subheader-choose-amount' : 'glomo-step-foreign-currency-operation-subheader-choose-currency-and-amount';
      }
    }

    /**
     * Computed currency selector visibility
     */
    _computeCurrencySelectorVisible(currencySelected, hideCurrencySelectedFlag) {
      if (hideCurrencySelectedFlag) {
        return !hideCurrencySelectedFlag;
      } else {
        return !!currencySelected;
      }
    }

    /**
     * Computed message box visibility
     */
    _computeMessageData(infoMessageData) {
      return infoMessageData !== undefined && infoMessageData !== null;
    }

    /**
     * Computed message box visibility with saving
     */
    _computeShowMessageDataSaving(infoMessageData) {
      return infoMessageData && infoMessageData.saving !== undefined;
    }

    /**
     * Computed message box visibility with title
     */
    _computeShowMessageDataTitle(infoMessageData) {
      return infoMessageData && infoMessageData.title !== undefined;
    }

    /**
     * Compute selected currency flag
     */
    _computeSelectedCurrencyFlag(currencySelected) {
      return currencySelected && currencySelected.labelImg && currencySelected.labelImg.src ? currencySelected.labelImg.src : '';
    }

    /**
     * Compute selected currency flag
     */
    _computeSelectedForeignCurrencyFlag(foreignCurrencySelected, countryFlag) {
      const imgSrc = this.get('labelImg.src', foreignCurrencySelected) || (countryFlag || '');
      return imgSrc;
    }

    /**
     * Compute Filled Operation Text
     */
    _computedFilledOperationText(currencySelected = {}) {
      return this.t('glomo-step-foreign-currency-operation-filled-operation-' + this.operationType, '__I will buy__', { currency: this._getCurrencyAsSymbol(this.localCurrency, currencySelected.id) });
    }

    /**
     * Compute Currency Country Text
     */
    _computeCurrencyCountryText(totalCurrency) {
      if (this.hasCountryCurrencyLabel) {
        return 'glomo-step-foreign-currency-operation-country-' + totalCurrency;
      }
    }

    /**
     * Is valid input
     */
    isValid() {
      return this.continueEnabled;
    }

    /**
     * Check if user press Enter key
     */
    keyUp(e) {
      if (e.key === 'Enter') {
        this.$.amountInput.blur();
      }
    }

    _handleOperationInputClick(e) {
      this.dispatchEvent(new CustomEvent('foreign-currency-operation-input-clicked'));
    }

    /**
     * Reports if the input should be in error
     * @param {Boolean} isValid
     */
    setInvalidAmountInput(isValid) {
      this.$.amountInput.invalid = isValid;
      const invalid = !!this.get('invalid', this.invalidWithoutLimits);
      if (invalid) {
        this.$.amountInput.errorMessageForInvalid = isValid;
        this.$.amountInput.showAlterInputInfo = !isValid;
      }
    }

    /**
     * Set input error for operative limits
     * @param {Object} data
     */
    setOperativeLimitsError(data) {
      this.$.amountInput.invalidWithoutLimits = data.invalidWithoutLimits;
      this.$.amountInput.errorMessageForInvalid = data.errorMessageForInvalid;
      this.$.amountInput.invalid = data.invalid;
      this.$.amountInput.hideAvailableBalance = data.hideAvailableBalance;
      this.$.amountInput.showAlterInputInfo = !data.invalid;
    }

    _computeShowInfotext(infoText) {
      return !!infoText;
    }

    _getSavingsCurrencyCode(infoMessageData) {
      return infoMessageData.savingCurrency || this.localCurrency;
    }

    _clickInfoMessageLink() {
      this.dispatchEvent(new CustomEvent('glomo-foreign-currency-link-clicked', {
        bubbles: true,
        composed: true
      }));
    }

    /**
     * Sets message to be shown at the top
     * @param {String} infoMessage
     * @returns
     */
    _setShowAlterInputInfo(infoMessage) {
      return !!infoMessage;
    }

    _computeSelectedAriaLabel(currencySelected) {
      return this.t(this.currencySelectorAriaLabel, '__Selected currency aria label__', {currency: this.t(currencySelected.name)});
    }

    _computeScreenReaderCurrencyAmount(defaulCurrencyAmount) {
      return this.t(defaulCurrencyAmount, defaulCurrencyAmount);
    }

    _computeScreenReaderCurrencyTypes(infoMessageData, baseCurrency) {
      if (infoMessageData && baseCurrency) {
        let rate = this.get('exchangeRate', infoMessageData);
        return this._getScreenReaderdata(rate, baseCurrency);
      }
    }

    _computeScreenReaderInfoCurrencyTypes(infoMessageData, baseCurrency) {
      if (infoMessageData && baseCurrency) {
        let rate = this.get('marketRate', infoMessageData);
        return this._getScreenReaderdata(rate, baseCurrency);
      }
    }

    _getScreenReaderdata(rate, baseCurrency) {
      return [{
        key: this.screenReaderFirstKey,
        type: this.screenReaderType,
        value: {
          amount: this.screenReaderCurrencyAmount,
          currency: baseCurrency
        }
      },
      {
        key: this.screenReaderSecondKey,
        type: this.screenReaderType,
        value: {
          amount: rate,
          currency: this.localCurrency
        }
      }];
    }

    /**
     * valid if it continues depending on the parameter and the property continueEnabled
     * @param {Boolean} e
     */
    continue(e) {
      if (e && this.continueEnabled) {
        this.active = true;
        this._onContinue();
      }
    }

    /**
     * Event fired when the help button is clicked to show exchange regulations info modal
     * @param {Event} e click
     * @event foreign-currency-show-regulations-info-modal
     */
    _onClickHelpButton(e) {
      e.stopPropagation();
      this.dispatchEvent(new CustomEvent('glomo-step-foreign-currency-click-icon', {
        bubbles: true,
        composed: true
      }));
    }
  }

  customElements.define(GlomoStepForeignCurrencyOperation.is, GlomoStepForeignCurrencyOperation);
}
