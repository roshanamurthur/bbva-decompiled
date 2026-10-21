
{
  // eslint-disable-next-line no-shadow
  const { mixinBehaviors, Element } = Polymer;
  const { i18nBehavior, AmountBehavior, CellsCheckNestedKeysBehavior} = CellsBehaviors;
  /**
    `<glomo-credit-card-limit-increase>` Description.

    Example:
    ```html
    <glomo-credit-card-limit-increase></glomo-credit-card-limit-increase>
    ```

    ## Styling
    The following custom properties and mixins are available for styling:

    ### Custom Properties
    | Custom Property     | Selector | CSS Property | Value       |
    | ------------------- | -------- | ------------ | ----------- |
    | --cells-fontDefault | :host    | font-family  |  sans-serif |
    ### @apply
    | Mixins                             | Selector | Value |
    | ---------------------------------- | -------- | ----- |
    | --glomo-credit-card-limit-increase | :host    |  {}   |

    * @customElement
    * @polymer
    * @extends {Polymer.Element}
    * @demo demo/index.html
  */

  // eslint-disable-next-line
  class GlomoCreditCardLimitIncrease extends mixinBehaviors([ i18nBehavior, CellsCheckNestedKeysBehavior ], AmountBehavior(Element)) {
    static get is() {
      return 'glomo-credit-card-limit-increase';
    }
    static get properties() {
      return {
        /**
          * contain financial data for header section
        */
        product: {
          type: Object,
          value: () => ({}),
        },
        amounts: {
          type: Object,
          value: () => ({}),
          notify: true
        },
        contact: {
          type: Boolean,
          value: () => ({}),
        },
        /**
          * Heading title "Characteristics" section
        */
        headingTitle: {
          type: String,
          value: 'cells-heading-title'
        },
        /**
          * Heading subtitle "Characteristics" section
        */
        headingSubtitle: {
          type: String,
          computed: '_computedHeadingSubtitle(product.secondaryAmount, currencyCode, grantedCredit)'
        },
        /**
          * Heading "Keep in mind" section
        */
        headingTextKeepInMind: {
          type: String,
          value: 'cells-heading-keep-in-mind'
        },
        /**
          * Cells amount input label
        */
        amountInputLabel: {
          type: String,
          value: 'cells-amount-input-label'
        },
        /**
          * Info message for amount range
        */
        amountInfoMessage: {
          type: String,
          computed: '_getAmountInfoMessage(amounts.minAmount, amounts.maxAmount, currencyCode)'
        },
        /**
          * Error message when the amount is out of range
        */
        amountErrorMessage: {
          type: String,
          computed: '_getAmountErrorMessage(amounts.minAmount, amounts.maxAmount, currencyCode)'
        },
        /**
          * Text for hint list
        */
        hintList: {
          type: Array,
          value: ['hint-list-text-1', 'hint-list-text-2', 'hint-list-text-3']
        },
        /**
          * Cells icon message text
        */
        cellsIconMessageText: {
          type: String,
          computed: '_getCellsIconMessage(contact.isChecked, contact.value)'
        },
        _cellsIconMessageType: {
          type: String,
          computed: '_getCellsIconMessageType(contact.isChecked)'
        },
        _cellsIcon: {
          type: String,
          computed: '_getCellsIcon(_cellsIconMessageType)'
        },
        /**
          * Local currency get from CONFIG.LOCAL_CURRENCY
        */
        localCurrency: {
          type: String
        },
        /**
          * Language get from CONFIG.LANGUAGE
        */
        language: {
          type: String
        },
        /**
          * Code of currency
        */
        currencyCode: {
          type: String,
          value: 'S/'
        },
        _amount: {
          type: Number,
          notify: true
        },
        _initialAmount: {
          type: Number,
          computed: '_getComputedAmount(amounts.suggestedAmount, amounts.minAmount)',
          notify: true
        },
        _isAmountValid: {
          type: Boolean,
          computed: '_validateAmount(_amount, amounts.minAmount, amounts.maxAmount)',
          notify: true
        },
        /**
        * Button click event
        */
        confirmAction: {
          type: String,
          value: ''
        },
        _confirmButton: {
          type: Object,
          computed: '_getButtonConfig(_isConfirmButtonDisabled, amounts)',
          notify: true
        },
        _isConfirmButtonDisabled: {
          type: Object,
          computed: '_getConfirmButtonState(_isAmountValid, contact.isChecked)',
          notify: true
        },
        /**
        * Card limit increase origin message
        */
        cardIconMessage: {
          type: String,
          computed: '_getCardIconMessage(product.name)'
        },
        _cardImageSizes: {
          type: Object,
          value: function() {
            return {
              'width': 72,
              'height': 48,
            };
          }
        },
        _contentWrapperClass: {
          type: String,
          computed: '_getContentWrapperClass(_isLoading)'
        },
        _isLoading: {
          type: Boolean,
          value: true,
          computed: '_getComputedIsLoading(amounts.maxAmount, amounts.minAmount, amounts.suggestedAmount)'
        },
        skeletonClass: {
          type: String,
          value: 'skeleton-wrapper'
        },
        textButton: {
          type: String,
          value: 'cells-confirm-button'
        },
        headingTerms: {
          type: String,
          value: 'cells-credit-line-increase-title-list'
        },
        imgSrc: {
          type: String,
          value: './images/cards/cardFrontDefault.png'
        },
        buttonDisable: {
          type: String
        },
        showCardCover: {
          type: Boolean,
          value: false
        },
        textList: {
          type: String
        },
        showStLink: {
          type: Boolean,
          value: false
        },
        showLabelAmounts: {
          type: Boolean,
          value: false
        },
        legendTextCard: {
          type: String
        },
        legendTextCardBoldText: {
          type: String
        },
        subtitleAmountDescription: {
          type: String
        },
        linkText: {
          type: String
        },
        optionalHeadingSubtitle: {
          type: String
        },
        textValidity: {
          type: String
        },
        /*
        * set true to select min amount value for current amount instead card secondary amount value
        */
        alternativeCurrentAmount: {
          type: Boolean,
          value: false
        },
        /**
         * Flag to control if all amounts have to be sent in button event
         */
        sendAllAmountsArray: {
          type: Boolean,
          value: false
        },
        /**
         * @description indicate if is decrement or not - DLC
         * @type {Boolean}
         */
        isDecrease: {
          type: Boolean,
          value: false
        },
        /**
         * @description Object styles for decrement or increment flow
         * @type {Object}
         */
        objectStyles: {
          type: Object,
        },
        /**
         * @description set text description for decrement
         * @type {String}
         */
        checkDescription: {
          type: String,
          value: 'cells-confirm-button-decrease'
        },
        /**
         * @description text for the decrement button
         * @type {String}
         */
        textButtonDecrease: {
          type: String,
          value: 'cells-confirm-button-decrease'
        },
        /**
         * @description indicate if show or not button for decrement line flow
         * @type {Boolean}
         */
        _isConfirmButtonDecrease: {
          type: Boolean,
          value: false
        },
        /**
         * @description Configuration for decrement line flow
         * @type {Object}
         */
        _confirmButtonDecrease: {
          type: Object,
          computed: '_getButtonConfigDecrease(_isConfirmButtonDecrease)',
        },
        /**
         * @description string that contains class of subtitle text p
         * @type {String}
         */
        subtitleText: {
          type: String,
          computed: '_getClassSubtitleText(isDecrease)'
        },
        /**
         * @description string that contains class of terms link
         * @type {String}
         */
        termsLink: {
          type: String,
          computed: '_getClassTermsLink(isDecrease)'
        },
        /**
         * @description Configuration detail for decrement put
         * @type {Object}
         */
        actionDetail: {
          type: Object
        },
        /**
         * @description Configuration for number of characters
         * @type {Number}
         */
        charsValue: {
          type: Number,
          value: 4
        },
        /**
         * @description Number card to local text in cells-icon-message
         * @type {Number}
         */
        numberCard: {
          type: String
        },
        /**
         * @description Character settings
         * @type {Number}
         */
        maskChar: {
          type: String
        },
        /**
         * @description Is alternative Offer
         * @type {Boolean}
         */
        altOffer: {
          type: Boolean,
          value: false
        },
        /**
         * @description Granted Credit amount
         * @type {Number}
         */
        grantedCredit: {
          type: Number,
        },
        /**
         * @description flexibleLine flow flag
         * @type {Boolean}
         */
        isFlexibleLine: {
          type: Boolean,
          value: false
        },
        /**
         * @description optional heading subtitle for description
         * @type {String}
         */
        headingSubtitleDescription: {
          type: String,
          value: ''
        },
        /**
         * @description info message with link
         * @type {Object}
         */
        messageWithLink: {
          type: Object,
          value: () => ({})
        },
        /**
         * @description flag to hidden the message under amount
         * @type {Boolean}
         */
        hiddenIconMessageAmount: {
          type: Boolean,
          value: false
        },
        /**
         * @description property to assign a new class to the content
         * @type {String}
         */
        classContent: {
          type: String,
          value: ''
        },
        /**
         * @description flag to be able to display the maximum amount
         * @type {Boolean}
         */
        showMaxAmount: {
          type: Boolean,
          value: false
        }
      };
    }

    /**
     * Use for one-time configuration of your component after local DOM is
     * initialized.
     */
    reset() {
      this._isConfirmButtonDecrease = false;
      this._isLoading = true;
      this.product = undefined;
      this.amounts = undefined;
      this.contact = undefined;
      this.altOffer = false;
      this.grantedCredit = undefined;
      this.skeletonClass = 'skeleton-wrapper';
    }

    /**
    * Set otpClosed to set config button
    * @param {Boolean} _isLoading is the page loading
    * @return {String} class value
    */
    _getContentWrapperClass(_isLoading) {
      return _isLoading ? 'content-wrapper__hidden' :
        ((this.isDecrease) ? 'content-wrapper padding-decrement' : `content-wrapper ${this.classContent}`);
    }

    /**
    * Check required properties to disable skeleton
    */
    _getComputedIsLoading(maximumAmount, minimumAmount, suggestedAmount) {
      return !(maximumAmount && minimumAmount && suggestedAmount !== undefined);
    }

    /**
    * Set amount in order of suggested amouhnt coming or minimun amount of the range
    * @param {Number} suggestedAmount recommended amount from service
    * @param {Number} minAmount minimun range amount from service
    * @return {Number} return amount property value
    */
    _getComputedAmount(suggestedAmount, minAmount) {
      this._amount = suggestedAmount || minAmount;
      return this._amount;
    }

    /**
    * Get text for cells-icon-message
    * @param {Boolean} _isEmailValid mail has been checked and is preferential
    * @param {String} email user email
    * @return {String} key for locals traduction
    */
    _getCellsIconMessage(_isEmailValid, email) {
      if (this.showLabelAmounts) {
        return this.isDecrease ? this.t('cells-icon-message-info-mx-decrease') :
          this.t('cells-icon-message-info-mx');
      } else {
        return _isEmailValid ? this.t('cells-icon-message-info', '', {
          email
        }) :
          this.t('cells-icon-message-error-increment');
      }
    }

    /**
    * Get type for cells-icon-message
    * @param {Boolean} _isEmailValid mail has been checked and is preferential
    * @return {String} cells-icon-message type: info or error
    */
    _getCellsIconMessageType(_isEmailValid) {
      return _isEmailValid ? 'info' : 'error';
    }

    /**
    * Get icon for cells-icon-message
    * @param {Boolean} _cellsIconMessageType ells-icon-message type
    * @return {String} cells-icon-message icon: info or alert
    */
    _getCellsIcon(_cellsIconMessageType) {
      return _cellsIconMessageType === 'info' ?
        'coronita:info' :
        'coronita:alert';
    }

    /**
    * Action button configuration
    * @param {String} action Button click event
    * @param {String} _isConfirmButtonDisabled button disabled state
    * @param {String} detail data to send in put request
    * @return {Object} button configuration object
    */
    _getButtonConfig(_isConfirmButtonDisabled, amounts) {
      this.buttonDisable = this.showLabelAmounts ? false : _isConfirmButtonDisabled;
      return {
        'buttons': {
          'primary': {
            'text': this.textButton,
            'action': this.confirmAction,
            'disabled': this.buttonDisable,
            'detail': this.sendAllAmountsArray ?
              { amounts: this._getAmountsArray(amounts), limitId: this.get('product.limitId')} :
              { amount: this._amount, currency: this.localCurrency, limitId: this.get('product.limitId')},
          }
        }
      };
    }

    /**
     * Create an array of amounts (minAmount, suggestedAmount and maxAmount in that order)
     */
    _getAmountsArray(amounts) {
      return this.altOffer ? [
        { amount: (amounts || {}).grantedCredit, currency: this.localCurrency },
        { amount: (amounts || {}).diffAmount, currency: this.localCurrency },
        { amount: (amounts || {}).suggestedAmount, currency: this.localCurrency },
      ] : [
        {amount: (this.amounts || {}).minAmount, currency: this.localCurrency},
        {amount: (this.amounts || {}).suggestedAmount, currency: this.localCurrency},
        {amount: (this.amounts || {}).maxAmount, currency: this.localCurrency}
      ];
    }

    /**
    * Confirm button state according to entered amount and contact is preferential
    * @param {Boolean} _isEmailValid mail has been checked and is preferential
    * @param {Boolean} _isAmountValid amount is in range
    * @return {Boolean} Button disabled status
    */
    _getConfirmButtonState(_isAmountValid, _isEmailValid) {
      return this.showLabelAmounts ? false : !(_isAmountValid && _isEmailValid);
    }

    /**
    * Checks if entered amount is in range
    * @param {Boolean} _amount entered quantity
    * @param {Boolean} minAmount miniumumn value of the range
    * @param {Boolean} maxAmount maximun value of the range
    * @return {Boolean} true if entered amount is in range
    */
    _validateAmount(_amount, minAmount, maxAmount) {
      if (this.isFlexibleLine) {
        this.updateConfigButton = true;
        const isValidAmount = _amount >= minAmount && _amount <= maxAmount;
        if (isValidAmount) {
          if (this.altOffer && this.grantedCredit) {
            this.set('amounts.diffAmount', _amount - this.grantedCredit);
          }
          this.set('amounts.suggestedAmount', _amount);
        }
        return isValidAmount;
      } else {
        return _amount >= minAmount && _amount <= maxAmount;
      }
    }

    /**
    * Get card icon message text from locals
    * @param {String} cardName card name value
    * @return {String} transalated and interpolated increase message
    **/
    _getCardIconMessage(cardName) {
      return this.t('cells-icon-message-increase', '', {
        cardName
      });
    }

    /**
    * Get card icon message text from locals
    * @param {Number} minAmount min amount available
    * @param {Number} maxAmount max amount available
    * @param {String} currencyCode currency code
    * @return {String} amount info transalation
    **/
    _getAmountInfoMessage(minAmount, maxAmount, currencyCode) {
      return this.t('cells-amount-input-info', '', {
        currencyCode,
        minAmount: this._getFormattedExec(minAmount, currencyCode),
        maxAmount: this._getFormattedExec(maxAmount, currencyCode)
      });
    }

    /**
    * Get amount error message based on min and max available amounts
    * @param {Number} minAmount min amount available
    * @param {Number} maxAmount max amount available
    * @param {String} currencyCode currency code
    * @return {String} amount error transalation
    **/
    _getAmountErrorMessage(minAmount, maxAmount, currencyCode) {
      return this.t('cells-amount-input-error', '', {
        currencyCode,
        minAmount: this._getFormattedExec(minAmount, currencyCode),
        maxAmount: this._getFormattedExec(maxAmount, currencyCode)
      });
    }

    _computedHeadingSubtitle(currentAmount, currencyCode, grantedCredit) {
      let currentValue = this.alternativeCurrentAmount && this.amounts && this.amounts.minAmount ? this.amounts.minAmount : currentAmount;
      if (this.isFlexibleLine) {
        currentValue = this._flexibleCurrentValueConfig(currentAmount, grantedCredit);
      }
      return this.t('cells-heading-subtitle', '', {
        currentAmount: this._getFormattedExec(currentValue, currencyCode)});
    }

    /**
     * returns the value of the grantedCredit when it is in the flow of the flexibleLine
     * @param {Number} currentAmount current available
     * @param {Number} grantedCredit  granted credit available
     * @return {Number} amount
     */
    _flexibleCurrentValueConfig(currentAmount, grantedCreditParam) {
      const grantedCreditvalue = this.c(this.amounts, 'grantedCredit', grantedCreditParam);
      Object.assign(this.amounts, {
        grantedCredit: grantedCreditvalue
      });
      const minAmountValue = this.amounts && this.amounts.minAmount;
      return this.alternativeCurrentAmount && this.amounts && grantedCreditvalue ? grantedCreditvalue : minAmountValue ? this.amounts.minAmount : currentAmount;
    }

    _getFormattedExec(amount, currency) {
      return this.getFormattedAmount(amount, currency, this.localCurrency, 'es-PE', '.', ',', 'S/', '');
    }
    /**
     * @description fire an event for open pdf with terms and conditions of ILC and DLC
     */
    _callLinkPressed() {
      this.dispatchEvent(new CustomEvent('increment-view-terms-conditions', {
        bubbles: true,
        composed: true,
        detail: { titleId: this.product.titleId },
      }));
    }

    /**
    * handle input change event and set _amount with etered value
    **/
    _handleIpuntChange(e) {
      this._amount = e.detail;
    }

    setContentHintList(hintList) {
      this.hintList = [hintList, this.textList];
    }
    /**
     * @description Received state of checkbox - DLC
     * @param {Object} state of checkbox
     */
    changeStatusButton(evt) {
      let checked = evt && evt.detail && evt.detail.checked !== undefined ?
        evt.detail.checked : false;
      this._isConfirmButtonDecrease = checked;
    }
    /**
     * @description computed method that get style for subtitle text p
     * @param {Boolean} isDecrease
     * @return {String} class name of element if is decrease or not
     */
    _getClassSubtitleText(isDecrease) {
      return isDecrease ? 'subtitle-text-decrease' : 'subtitle-text';
    }
    /**
     * @description computed method that get style for terms link
     * @param {Boolean} isDecrease
     * @return {String} class name of element if is decrease or not
     */
    _getClassTermsLink(isDecrease) {
      return isDecrease ? 'increment-terms-link transparent terms-decrement' :
        'increment-terms-link transparent';
    }
    /**
     * @description Get src image for product cover or default image
     * @param {Object} product
     * @return {String} src image
     */
    _setImageProduct(product) {
      return product?.image || this.imgSrc;
    }
    /**
     * @description Get configuration for decrease button - DLC
     * @param {Boolean} enableButton
     * @return {Object} config object for decrease flow
     */
    _getButtonConfigDecrease(enableButton) {
      return {
        'buttons': {
          'primary': {
            'text': this.textButtonDecrease,
            'action': this.confirmAction,
            'disabled': !enableButton,
            'detail': this.actionDetail,
          }
        }
      };
    }
  }
  customElements.define(GlomoCreditCardLimitIncrease.is, GlomoCreditCardLimitIncrease);
}
