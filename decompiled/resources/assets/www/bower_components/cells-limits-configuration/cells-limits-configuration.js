/*eslint new-cap: 0*/
/* eslint no-shadow: "error" */
class CellsLimitsConfiguration extends Polymer.mixinBehaviors([
  CellsBehaviors.i18nBehavior,
  CellsBehaviors.CellsTextFormatterBehavior
], CellsBehaviors.AmountBehavior(Polymer.Element)) {
  static get is() {
    return 'cells-limits-configuration';
  }

  /*esLint new-cap: 0*/
  /*global minAmountError*/
  static get properties() {
    return {
      /**
       * amount used today
       */
      disposedAmount: {
        type: Number
      },
      /**
       * amount used today
       */
      availableAmount: {
        type: Number
      },
      /**
       * max amount set
       */
      maxLimit: {
        type: Number
      },
      /**
       * max disposed amount set
       */
      maxDisposed: {
        type: Number
      },
      showMaxDisposedInsteadMaxLimit: {
        type: Boolean,
        value: false
      },
      /**
       * max limit set by bank by operative / operative range maximum limit.
       */
      operativeRangeMaximumLimit: {
        type: String
      },
      /**
       * operative range maximum
       */
      operativeRangeMinimumLimit: {
        type: String
      },
      /**
       * currency code
       */
      currencyCode: {
        type: String
      },
      /**
       * local currency
       */
      localCurrency: {
        type: String
      },
      /**
       * language
       */
      language: {
        type: String
      },
      /**
       * List of cells-lists configurations, the "list" property will be parsed
       * and transformed to a cells-key-values template with the provided configuration
       */
      infoMeterLists: {
        type: Array,
        value: () => []
      },
      _infoMeterLists: {
        type: Array,
        computed: '_computeInfoMeterList(infoMeterLists)'
      },
      /**
       * Wether to show the type heading with an help icon
       */
      showTypeHeading: {
        type: Boolean,
        value: false,
        reflectToAttribute: true
      },
      /**
       * The name of the limit
       */
      limitName: {
        type: String,
        observer: '_limitNameObserver'
      },
      /**
       * main message displayed
       */
      mainMessage: {
        type: String,
        computed: '_computeLimitMainMessage(limitName)'
      },
      /**
       * main message text
       * @type {String}
       */
      mainMessageText: {
        type: String,
        value: 'cells-limits-configuration-main-message'
      },
      /**
       * info message displayed in the middle of the component
       */
      infoMessage: {
        type: String,
        computed: '_generateLimitsConfigurationInfoMessage(operativeRangeMaximumLimit)'
      },
      /**
       * primary button text
       */
      infoButtonText: {
        type: String,
        value: 'cells-limits-configuration-call-bank'
      },
      /**
       * label for the input password
       * @type {String}
       * @default 'cells-limits-configuration-label'
       */
      labelPassword: {
        type: String,
        value: 'cells-limits-configuration-label-password'
      },
      /**
       * propiedad para teclado numerico
       */
      keyBoardNumeric: {
        type: String,
        value: 'tel'
      },
      /**
       * phone number to call action
       */
      phoneNumber: String,
      /**
       * phone country prefix code
       */
      countryPrefixCode: String,
      /**
       * phone region prefix code
       */
      regionPrefixCode: String,
      /**
       * phone number shown inside info message
       */
      infoPhoneNumber: String,
      /**
       * Icon of info modal
       */
      iconInfo: {
        type: String,
        value: 'coronita:info'
      },
      /**
       * Icon size for info modal
       */
      iconInfoSize: {
        type: Number,
        value: 14
      },
      /**
       * new amount a.k.a. Max limit
       */
      newMaxLimit: {
        type: Number,
        notify: true
      },
      /**
       * Shows ig newMaxLimit is valid to enable confirm button
       */
      validNewMaxLimit: {
        type: Boolean,
        computed: '_isValidNewMaxLimit(newMaxLimit, invalidInputValue, selectedLimitValue, disabled, _password)'
      },
      /**
       * new amount entered is invalid
       */
      invalidInputValue: {
        type: Boolean,
        value: false
      },
      /**
       * @property {String}
       * text for description for default
       */
      inputPlaceholder: {
        type: String,
        value: 'cells-limits-configuration-input-placeholder'
      },
      /**
       * small text under the input, info
       */
      inputInfoMessage: {
        type: String,
        value: 'cells-limits-configuration-input-info-message'
      },
      /**
       * value percentage
       */
      valueMeter: {
        type: Number,
        computed: '_getValueMeter(disposedAmount, availableAmount)'
      },
      /**
       * value percentage
       */
      showValueMaxMeter: {
        type: Number,
        computed: '_getValueMaxMeter(availableAmount)'
      },
      /**
       * current  daily amount message under the meter
       */
      currentMeterMessage: {
        type: String,
        value: 'cells-limits-configuration-meter-current-amount-message'
      },
      /**
       * accept text for button
       */
      acceptButtonText: {
        type: String,
        value: 'cells-limits-configuration-confirm-button'
      },
      /**
       * cancel text for button
       */
      cancelButtonText: {
        type: String,
        value: 'cells-limits-configuration-cancel-button'
      },
      /**
       * @property {String}
       * text for label for default
       */
      textLabel: {
        type: String,
        value: 'cells-limits-configuration-input-placeholder'
      },
      /**
       * @property {String}
       * text for range the amount
       */
      rangeMessage: {
        type: String,
        value: 'cells-enter-limited-amount-range'
      },
      /**
       * @property {Boolean}
       * propierty for range
       */
      range: {
        type: Boolean,
        value: false,
        reflectToAttribute: true
      },
      /*
       * Available amount message
       */
      availableAmountMessage: {
        type: String,
        value: 'cells-limits-configuration-available-amount-message'
      },
      /**
      * Show available amount
      */
      showAvailableAmount: {
        type: Boolean,
        value: false
      },
      /**
       * Limit selected
       */
      selectedLimitValue: {
        type: String,
        value: null
      },
      /**
       * Hide info message
       */
      hideInfoMessage: {
        type: Boolean,
        value: false
      },

      /**
       * Hide info message
       * @type {Boolean}
       */
      forceHideInfoMessage: {
        type: Boolean,
        value: false
      },

      /**
       * Top title
       * @type {String}
       */
      topTitle: {
        type: String,
        value: ''
      },

      /**
       * type heading translation
       * @type {String}
       */
      typeHeadingTranslation: {
        type: String,
        value: ''
      },

      /**
       * @property {Object}
       * Object the inputs
       */
      textLabelInputObj: {
        type: Object,
        value: () => ({
          DAILY: 'cells-limits-configuration-description-daily',
          PER_EXECUTION: 'cells-limits-configuration-description-operation',
          MONTHLY: 'cells-limits-configuration-description-mounth',
          USER_TRANSACTION_AMOUNT: 'cells-limits-configuration-main-message-user-transaction-amount-label'
        })
      },
      /**
       * @property {Object}
       * Object for text label
       */
      typeOperationObj: {
        type: Object,
        value: () => ({
          DAILY: 'cells-limits-configuration-label-daily',
          PER_EXECUTION: 'cells-limits-configuration-label-operation',
          MONTHLY: 'cells-limits-configuration-label-mounth',
          USER_TRANSACTION_AMOUNT: 'cells-limits-configuration-main-message-user-transaction-amount-placeholder'
        })
      },
      /**
       * @property {Object}
       * Object for text for icon message
       */
      textDescriptionObj: {
        type: Object,
        value: () => ({
          DAILY: 'cells-limits-configuration-main-message-daily',
          PER_EXECUTION: 'cells-limits-configuration-main-message-operation',
          MONTHLY: 'cells-limits-configuration-main-message-mounth',
          USER_TRANSACTION_AMOUNT: 'cells-limits-configuration-main-message-user-transaction-amount'
        })
      },
      /**
       * @property {Object}
       * Object for text for icon message
       */
      textRangeObj: {
        type: Object,
        value: () => ({
          DAILY: 'cells-limits-configuration-range-daily',
          PER_EXECUTION: 'cells-limits-configuration-range-operation',
          MONTHLY: 'cells-limits-configuration-range-mounth'
        })
      },
      /**
       * @property {String}
       * Message for Max Limit
       */
      availableBalanceDefaultMessage: {
        type: String,
        value: 'cells-limits-configuration-rage-error-max-amount'
      },
      /**
       * @property {String}
       * Message for Min Limit
       */
      amountErrorMinLimitMessage: {
        type: String,
        value: 'cells-limits-configuration-rage-error-min-amount'
      },
      /**
       * Message to show on max limit error
       * @type {String}
       */
      amountErrorMaxLimitMessage: {
        type: String,
        value: 'cells-enter-limited-amount-error-max-limit'
      },
      /**
       * @property {Boolean}
       * Hidden text min and span
       */
      hiddenMinLimit: {
        type: Boolean,
        value: false
      },
      /**
       * @property {Boolean}
       * This property is used to display text(locales) depending on the limits that are selected
       */
      showTextInfo: {
        type: Boolean,
        value: false
      },
      /*
       * Has dinamic main message
       */
      hasDinamicMainMessage: {
        type: Boolean,
        value: false
      },
      /**
      * Has select input for operation limit
      * @type {Boolean}
      */
      hasLimitSelector: {
        type: Boolean,
        value: false
      },
      /**
      * Has select input for operation limit MTU
      * @type {Boolean}
      */
      enablePasswordTransactionAmount: {
        type: Boolean,
        value: false
      },
      /**
       * Show max limit message
       */
      showMaxLimitMessage: {
        type: Boolean,
        value: false
      },
      /**
       * max limit available amount
       */
      maxLimitAvailableAmount: {
        type: Number
      },
      /**
       * Checks if max limit message should be showed
       */
      _showMaxLimitMessage: {
        type: Boolean,
        computed: '_checkMaxLimitMessage(showMaxLimitMessage, maxLimit, maxLimitAvailableAmount)'
      },
      /**
       * Max limit warning message
       */
      maxLimitWarningMessage: {
        type: String,
        value: 'cells-limits-configuration-max-limit-warning-message'
      },
      /**
       * Hide meter
       */
      hideMeter: {
        type: Boolean,
        value: false
      },
      /**
       * Hide border top
       * @type {Boolean}
       */
      hideBorderTop: {
        type: Boolean,
        value: false
      },

      /**
       * Hide type heading icon
       * @type Boolean
       */
      hideTypeHeadingIcon: {
        type: Boolean,
        value: false
      },

      /**
       * Change order cells meter
       */
      changeOrderCellsMeter: {
        type: Boolean,
        value: false
      },
      /**
       * @property
       * This property is for text the input info(margin)
       */
      classTextAlign: {
        type: String,
        value: 'class-text-align'
      },

      /**
       * Disposed limit class
       * @type {String}
       */
      disposedLimitClass: {
        type: String,
        value: ''
      },

      /**
       * Change alignment style
       */
      customStyle: {
        type: String,
        value: 'meter-info'
      },
      /**
       * Min amount default
       */
      minAmount: {
        type: Number,
        value: 1
      },
      /**
       * Min amount format
       */
      minAmountError: {
        type: String,
        value: ''
      },
      /**
       * Reset input
       */
      resetInput: {
        type: Boolean,
        value: false,
        notify: true
      },
      /**
       * Wether the edtion should be disabled
       */
      disabled: {
        type: Boolean,
        value: false
      },
      /**
       * Minimum limit for the new limit amount
       */
      minLimit: Number,
      /**
       * Check if the maximum limit should be returned
       */
      maxLimitValue: {
        type: Number,
        computed: '_getMaxLimitValue(limitName,maxLimit)'
      },
      /**
       * All amount that are not multiple of this number are considered invalid
       */
      multiple: Number,
      /**
       * Translation key for the info message on range input
       */
      multipleAmountRangeMessageKey: {
        type: String,
        value: 'cells-enter-limited-amount-multiple-range'
      },

      /**
       * Message for show the range amount
       * @type {String}
       */
      amountRangeMessage: {
        type: String,
        value: 'cells-enter-limited-amount-range'
      },

      /**
       * Translation key for the message after the not enough balance message
       */
      notEnoughBalanceAfterKey: {
        type: String,
        computed: '_getNotEnoughBalanceAfterKey(limitName)'
      },

      /**
       * Controls wether the min limit message should be hidden for the limited amount input
       */
      hiddenMinLimitEnterLimitedAmountMessage: {
        type: Boolean,
        value: false
      },
      /**
       * to edit info message displayed from external property
       */
      infoMessageText: {
        type: String,
        value: 'cells-limits-configuration-info-message'
      },

      /**
       * Info below amount
       * @type {String}
       */
      infoBelowAmount: {
        type: String,
        value: ''
      },

      /**
       * Config info message type info/error
       */
      infoMessageType: {
        type: String,
        value: 'info'
      },
      /**
       * config info message icon
       */
      infoMessageIcon: {
        type: String,
        value: 'coronita:info'
      },
      /**
       * name of limit POS_DAILY
       */
      dailyLimit: {
        type: String,
        value: 'POS_DAILY'
      },
      /**
       * name of limit ATM_DAILY
       */
      atmLimit: {
        type: String,
        value: 'ATM_DAILY'
      },
      /**
       * value to calculate maximum limit error when maximum limit is not displayed
       */
      hideMaxLimit: {
        type: Number,
        value: null
      },
      /**
       * property that calculates what limit the property is sent
       * to when the maximum limit is not displayed
       */
      hideMaxValue: {
        type: Number,
        computed: '_hideValue(limitName,hideMaxLimit)'
      },
      /**
       * Display availableBalanceErrorMessage literal when
       * imput is greater than operativeRangeMaximumLimit
       */
      simpleMaxProductErrorMessage: {
        type: Boolean,
        value: false
      },
      /**
       * Hides dispoed amount decimals
       */
      hideDisposedDecimals: {
        type: Boolean,
        value: false
      },
      /**
       * Hide available balance in limited amount
       */
      hideAvailableBalance: {
        type: Boolean,
        value: false
      },
      /**
       * Alternative input info message (instead of range)
       */
      altInputMessage: {
        type: String,
        value: ''
      },
      _computedAltInputMessage: {
        type: String,
        computed: '_computeAltInputMessage(altInputMessage, operativeRangeMaximumLimit)'
      },
      /**
       * Flag to identify if is DebitCard
       * @type {Boolean}
       */
      isDebitCard: {
        type: Boolean,
        value: false
      },
      /**
       * Property to hide the max limit
       */
      hiddenMaxLimit: {
        type: Boolean,
        value: false
      },
      /**
       * True if the limit value error message contains amounts
       * @type {Boolean}
       */
      complexAmountErrorMaxLimitMessage: {
        type: Boolean,
        value: false
      },
      /**
       * Boolean to show or not final dot after the maximum limit
       * @type {Boolean}
       */
      hideFinalDotMaxLimit: {
        type: Boolean,
        value: false
      },
      /**
       * If true, decimal part of the amount will be hidden if is zero
       * @type {Boolean}
       */
      zeroDecimalsHidden: {
        type: Boolean,
        value: false
      },
      /**
       *  Control if the icon must be show or not
       * @type {Boolean}
       */
      showIconInRangeMessageSection: {
        type: Boolean,
        value: false
      },
      /**
       *  Translation key for the info message on range input
       * @type {String}
       */
      multipleAmountRangeErrorMessageKey: {
        type: String,
        value: 'cells-enter-limited-amount-multiple-range-error'
      },
      /**
       *  Maximum characters allowed
       * @type {String}
       */
      maxCharacter: String,
      /**
       * Show or hide the icon
       * @type {Boolean}
       */
      showIconInRangeMessage: {
        type: Boolean,
        value: false
      },
      /**
       * Show or hide other amount
       * @type {Boolean}
       */
      hasOtherAmount: {
        type: Boolean,
        value: false
      },
      /**
       * Show or hide other amount zero decimals
       * @type {Boolean}
       */
      otherAmountZeroDecimalsHidden: {
        type: Boolean,
        value: false
      },
      /**
       * Other amount value
       * @type {Number}
       */
      otherAmount: Number,
      /**
       * Other amount language value
       * @type {String}
       */
      otherAmountLanguage: String,
      /**
       *  Other amount currency code value
       * @type {String}
       */
      otherAmountCurrencyCode: String,
      /**
       *  Other amount local currency value
       * @type {String}
       */
      otherAmountLocalCurrency: String,
      /**
       * Show or hide disposed other amount
       * @type {Boolean}
       */
      hasDisposedOtherAmount: {
        type: Boolean,
        value: false
      },
      /**
       * Show or hide disposed other amount decimals
       * @type {Boolean}
       */
      disposedOtherAmountHideDecimals: {
        type: Boolean,
        value: false
      },
      /**
       *  Disposed other amount value
       * @type {Number}
       */
      disposedOtherAmount: Number,
      /**
       *  Disposed other amount currency code value
       * @type {String}
       */
      disposedOtherAmountCurrencyCode: String,
      /**
       *  Disposed other amount local currency value
       * @type {String}
       */
      disposedOtherAmountLocalCurrency: String,
      /**
       *  Disposed other amount language value
       * @type {String}
       */
      disposedOtherAmountLanguage: String,
      /**
       * Show or hide available other amount
       * @type {Boolean}
       */
      hasAvailableOtherAmount: {
        type: Boolean,
        value: false
      },
      /**
       *  Available other amount language value
       * @type {Number}
       */
      availableOtherAmount: Number,
      /**
       *  Available other amount currency code value
       * @type {String}
       */
      availableOtherAmountCurrencyCode: String,
      /**
       * Show or hide available other amount decimals
       * @type {Boolean}
       */
      availableOtherAmountHideDecimals: {
        type: Boolean,
        value: false
      },
      /**
       *  Available other amount local currency value
       * @type {String}
       */
      availableOtherAmountLocalCurrency: String,
      /**
       *  Available other amount language value
       * @type {String}
       */
      availableOtherAmountLanguage: String,

      /**
       * Custom identifier for biocatch
       * @type {String}
       */
      customId: {
        type: String,
        value: ''
      },
      /**
       * Boolean to show or not button text
       * @type {Boolean}
       */
      hideInfoButtonText: {
        type: Boolean,
        value: false
      },
      /**
       * text in cells-icon-message
       * @type {String}
       */
      limitsType: {
        type: String,
        value: 'reminder'
      },
      /**
       * Boolean to show or not password transaction amount
       * @type {Boolean}
       * @default false
       */
      hasInputPassword: {
        type: Boolean,
        value: false
      },
      /**
       * @property {String}
       * Password for transaction amount
       * @default ''
       */
      _password: {
        type: String,
        value: ''
      },
      /**
       * Flag to identify the flow of user transaction amount
       * @property {Boolean}
       * @default false
       */
      isUserTransactionAmount: {
        type: Boolean,
        value: false
      }
    };
  }

  /**
   * reset properties
   */
  reset() {
    this.topTitle = '';
    this.currencyCode = undefined;
    this.disposedAmount = undefined;
    this.availableAmount = undefined;
    this.hideTypeHeadingIcon = false;
    this.typeHeadingTranslation = '';
    this.mainMessageText = 'cells-limits-configuration-main-message';
    this.limitName = '';
    this.atmLimit = 'ATM_DAILY';
    this.dailyLimit = 'POS_DAILY';
    this.showMaxDisposedInsteadMaxLimit = false;
    this.minLimit = undefined;
    this.maxLimit = undefined;
    this.multiple = undefined;
    this.range = false;
    this.localCurrency = undefined;
    this.showIconInRangeMessageSection = false;
    this.multipleAmountRangeMessageKey = 'cells-enter-limited-amount-multiple-range';
    this.amountRangeMessage = 'cells-enter-limited-amount-range';
    this.amountErrorMaxLimitMessage = 'cells-enter-limited-amount-error-max-limit';
    this.amountErrorMinLimitMessage = 'cells-limits-configuration-rage-error-min-amount';
    this.multipleAmountRangeErrorMessageKey = 'cells-enter-limited-amount-multiple-range-error';
    this.infoMessageText = 'cells-limits-configuration-info-message';
    this.hiddenMinLimitEnterLimitedAmountMessage = false;
    this.hasDisposedOtherAmount = false;
    this.secondMainZeroDecimalsHidden = false;
    this._password = '';
    this.isUserTransactionAmount = false;
    this.clearInput();
  }

  connectedCallback() {
    super.connectedCallback();
    this.addEventListener('keyup', this._keyUp);
  }

  disconnectedCallback() {
    super.disconnectedCallback();
    this.removeEventListener('keyup', this._keyUp);
  }

  _keyUp(e) {
    if (e.key === 'Enter' && this.validNewMaxLimit) {
      const ltdAmmount = this.shadowRoot.querySelector('#ltdAmmount');
      ltdAmmount?.blur();
    }
  }

  /**
   * function that maps the meter data list
   */
  _computeInfoMeterList(infoMeterLists) {
    return [].concat(infoMeterLists).map((cellsList) => {
      const list = [].concat(this.get('list', cellsList));
      return {
        list: list.map(this._getKeyValuesTemplate.bind(this)),
        class: this.get('class', cellsList)
      };
    });
  }

  _hideBorderTop(hideBorderTop, showTextInfo) {
    return hideBorderTop || !showTextInfo;
  }

  /**
   * Computes alternative input message with amount
   */
  _computeAltInputMessage(message, amount) {
    if (message && amount) {
      return this.t(message, '_Puedes establecer como monto máximo hasta ${amount}', {
        amount: this.getFormattedAmount(amount, this.localCurrency, this.localCurrency, this.language, false, true, true)
      });
    }
  }

  _getKeyValuesTemplate(config) {
    return `
      <cells-key-values
        key='${config.key}'
        class='${config.class}'
        local-currency='${config.value[0].currencyCode}'
        value='${JSON.stringify(config.value)}'
        language='${this.language}'
      ></cells-key-values>
    `;
  }
  _selectMainAmount(maxDisposed, maxLimit) {
    return this.showMaxDisposedInsteadMaxLimit && maxDisposed >= 0 ? maxDisposed : maxLimit;
  }

  /**
   * Hide info message section
   * @param forceHideInfoMessage
   * @param hideInfoMessage
   * @returns {Boolean}
   * @private
   */
  _hideInfoMessageSection(forceHideInfoMessage, hideInfoMessage) {
    return forceHideInfoMessage || hideInfoMessage;
  }

  /**
   * To dispatch type heading help we emit a "cells-limits-configuration-type-heading-help"
   * custom event
   */
  _dispatchTypeHeadingHelp() {
    this._dispatchCustomEvent('cells-limits-configuration-type-heading-help');
  }

  /**
   * To dispatch type heading help we emit a "cells-limits-configuration-type-heading-help-lost-password"
   * custom event
   */
  _dispatchTypeHeadingHelpLostPassword() {
    this._dispatchCustomEvent('cells-limits-configuration-type-heading-help-lost-password');
  }

  /**
   * To dispatch link Forgot my password we emit a "cells-limits-configuration-link-to-lost-password"
   * custom event
   */
  _dispatchLinkLostPassword() {
    this._dispatchCustomEvent('cells-limits-configuration-link-lost-password');
  }

  /**
   * Get type heading translation
   * @param typeHeadingTranslation
   * @param limitName
   * @returns {String}
   * @private
   */
  _getTypeHeadingTranslation(typeHeadingTranslation, limitName) {
    const limitType = limitName ? `-${String(limitName).toLowerCase()}` : '';
    const typeHeadingKey = typeHeadingTranslation ? typeHeadingTranslation : this.isDebitCard ? `cells-limits-configuration-debit-type-heading${limitType}` : `cells-limits-configuration-type-heading${limitType}`;
    return this.t(typeHeadingKey, '__RETIRADA DE EFECTIVO EN CAJERO__');
  }

  /**
   * Get info below amount
   * @param infoBelowAmount
   * @param inputPlaceholder
   * @returns {String}
   * @private
   */
  _getInfoBelowAmount(infoBelowAmount, inputPlaceholder) {
    if (this.limitName && this.showTextInfo && !infoBelowAmount) {
      return inputPlaceholder;
    }

    return this.t(infoBelowAmount || inputPlaceholder, '__Info below amount__');
  }

  /**
   * return max value depending on the limit
   */
  _getMaxLimitValue(limitName, maxLimit) {
    if (limitName === this.dailyLimit || limitName === this.atmLimit && this.isDebitCard) {
      return maxLimit;
    }
  }

  /**
   * return limit type
   */
  _getLimitType(limitName) {
    return limitName === this.dailyLimit && this.limitsType !== 'reminder';
  }

  /**
   * return value depending on the limit
   */
  _hideValue(limitName, hideMaxLimit) {
    this.hiddenMaxLimit = limitName === this.atmLimit || this._getLimitType(limitName);
    if (limitName === this.atmLimit || this._getLimitType(limitName)) {
      return hideMaxLimit;
    }
  }

  /**
   * return literal depending on the limit
   */
  _getNotEnoughBalanceAfterKey(limitName) {
    if (limitName === this.dailyLimit) {
      return this.t('cells-enter-limited-amount-multiple-range-and');
    } else {
      return '';
    }
  }
  /**
   * new max limit is valid if is not empty and
   * input is valid
   */
  _isValidNewMaxLimit(newMaxLimit, invalidInputValue, selectedLimitValue, disabled, password) {
    if (this.hasInputPassword) {
      return this.hasLimitSelector ? !!selectedLimitValue : !!newMaxLimit && !invalidInputValue && !disabled && password !== '';
    } else {
      return this.hasLimitSelector ? !!selectedLimitValue : !!newMaxLimit && !invalidInputValue && !disabled;
    }
  }

  _isPhoneNumber() {
    return !!this.phoneNumber;
  }

  /**
   * function that computes the perecentage of the current limit
   * @param {Number} availableAmount the value that will be converted to a porcentage
   */
  _getValueMeter(disposedAmount, availableAmount) {
    return this.showMaxDisposedInsteadMaxLimit ? disposedAmount :
      this.changeOrderCellsMeter ? disposedAmount * 100 / this.maxLimit : availableAmount * 100 / this.maxLimit;
  }

  /**
   * function that computes the max value of the current limit
   */
  _getValueMaxMeter(availableAmount) {
    return this.showMaxDisposedInsteadMaxLimit ? availableAmount : 100;
  }
  /**
   * launches an event when the transparent info button is clicked
   */
  _callLinkPressed() {
    this._dispatchCustomEvent('cells-limits-configuration-call-link-pressed');
  }
  /**
   * Updates main message to match selected limit description
   * @example "Transferencias a terceros"
   * @param {String} limitName
   */
  _computeLimitMainMessage(limitName = '') {
    return this.showTextInfo ? this.t(this.textDescriptionObj[limitName], '_Limit') :
      this.hasDinamicMainMessage ? `cells-limits-configuration-main-message-${limitName.toLowerCase()}` :
        this.t(
          this.isDebitCard ? 'cells-limits-debit-configuration-main-message' : this.mainMessageText,
          '_You can modify your operatioanl limits any number of times in the current day',
          { limitName: this.capitalizeReservedWords(limitName) }
        );
  }
  /**
   * Function to paint texts according to the showTextInfo
   * @param {String} limitName
   */
  _limitNameObserver(limitName) {
    this.inputPlaceholder = this.showTextInfo ? this.t(this.textLabelInputObj[limitName], '_Current limit') : this.inputPlaceholder;
    this.textLabel = this.showTextInfo ? this.t(this.typeOperationObj[limitName], '_Limit') : this.textLabel;
    this.rangeMessage = this.showTextInfo ? this.t(this.textRangeObj[limitName], '_Preset limit') : this.rangeMessage;
  }

  /**
   * accept handler
   */
  _onAcceptClick(event) {
    const data = {
      amount: this.newMaxLimit,
      currency: this.currencyCode,
      ...(this.get('isUserTransactionAmount') && { isUserTransactionAmount: this.get('isUserTransactionAmount') }),
      ...(this.get('hasInputPassword') && { password: this.get('_password') })
    };
    this._dispatchCustomEvent('cells-limits-configuration-accept', [ data ]);
  }

  /**
   * cancel handler
   */
  _onCancelClick(event) {
    this._dispatchCustomEvent('cells-limits-configuration-cancel');
  }
  /**
   * set new max limit from input
   */
  setNewMaxLimit(event) {
    this.newMaxLimit = event && event.detail && event.detail.amount;
  }

  /**
   * aux method for events
   */
  _dispatchCustomEvent(eventName, detail, bubbles = true, composed = true) {
    this.dispatchEvent(new CustomEvent(eventName, { detail, bubbles, composed }));
  }

  /**
   * Clears the amount input
   */
  clearInput() {
    this.selectedLimitValue = null;
    this.resetInput = true;
    this._password = '';
    this.limitName = '';
    this.operativeRangeMaximumLimit = 0;
  }

  /**
   * set limit data
   */
  _generateLimitsConfigurationInfoMessage(limit) {
    if (this.showMaxDisposedInsteadMaxLimit) {
      this.hideInfoMessage = false;
      if (this.limitName === this.dailyLimit) {
        this.hideInfoMessage = true;
        return `cells-limits-configuration-${this.limitsType}`;
      } else {
        return this.isDebitCard ? 'cells-limits-configuration-debit-ATM-dialy-message' : 'cells-limits-configuration-ATM-dialy-message';
      }
    } else {
      let limitData = {
        limit: this._formatAsAmount(limit),
        phone: '(' + this.regionPrefixCode + ') ' + this.infoPhoneNumber
      };
      return this.showTextInfo ? this.t('cells-limits-configuration-info-messages', '_To return to the pre-established operating limits, you must go to a BBVA ATM.') :
        this.t('cells-limits-configuration-info-message', '_Si quieres establecer un monto superior a <b>${limit}</b>, comunícate con nosotros al <b>${phone}</b>.', limitData);
    }
  }

  /**
   * Returns a string with the currency symbol and formated as needed by that currency code
   * @param {*} value amount
   */
  _formatAsAmount(value, currency = this.currencyCode) {
    this.minAmountError = this.getFormattedAmount(this.minAmount, this.currencyCode, this.localCurrency, this.language, true, true, true);
    this.amountErrorMinLimitMessage = this.showTextInfo ? this.t('cells-limits-configuration-rage-error-min-amount', `_The amount must be greater than or equal to ${this.minAmountError}`, { minAmountError: this.minAmountError }) :
      this.t('cells-enter-limited-amount-error-min-limit', '_The amount you want to transfer does not reach the minimum amount allowed for this operation');
    if (this.language) {
      let intValue = this._getIntegerPart(value, this.language);
      let currencySymbol = this._getCurrencyAsSymbol(currency, currency);
      let valueFormatted = intValue;
      return this._isRightAligned(currency) ? valueFormatted + ' ' + currencySymbol : currencySymbol + ' ' + valueFormatted;
    } else {
      return value;
    }
  }
  /**
   * Dispatch an event to open modal selector
   */
  _selectModalEvent(ev) {
    ev.preventDefault();
    this.dispatchEvent(new CustomEvent('cells-limits-configuration-limit-selector-modal-open', {
      bubbles: true,
      composed: true
    }));
  }
  /**
   * Checks if max limit message should be showed
   */
  _checkMaxLimitMessage(showMaxLimitMessage, maxLimit, maxLimitAvailableAmount) {
    return showMaxLimitMessage && maxLimit >= maxLimitAvailableAmount;
  }

}

customElements.define(CellsLimitsConfiguration.is, CellsLimitsConfiguration);
