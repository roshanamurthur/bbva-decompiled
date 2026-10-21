/**
* @summary A transactions list.
* @customElement
* @polymer
* @extends {Polymer.Element}
*/
class CellsTransactionsList extends Polymer.mixinBehaviors([
  window.CellsBehaviors.i18nBehavior
], Polymer.Element) {
  static get is() {
    return 'cells-transactions-list';
  }
  static get properties() {
    return {
      /**
       * Setting to showing help icon button
       * @type {Object}
       */
      helpIconButtonConfig: {
        type: Object
      },
      /**
       * Flag showing transactions list
       */
      hideTransactionsList: {
        type: Boolean,
        value: false
      },
      /**
       * Loaded content
       */
      loaded: {
        type: Boolean,
        value: false,
        notify: true
      },

      /**
       * Product type
       */
      productType: {
        type: String
      },
      /**
       * translation of message depending on the type of product
      */
      iconMessage: {
        type: String,
        computed: '_translateTransactionsMessage(productType)'
      },
      /**
       * Key of header title list
       */
      title: String,
      /**
       * Transactions to display
       */
      productId: String,
      /**
       * Simple code
       */
      simpleCode: String,
      /**
       * Transactions to display
       */
      _transactions: {
        type: Array
      },
      /**
       * Transactions
       */
      transactions: {
        type: Array,
        observer: '_pushTransactions'
      },
      /**
      * Transactions will shown in chunks of pagination's value
      */
      pagination: {
        type: Number,
        value: 20
      },
      /**
       * Number of skeleton items
       */
      skeletonItems: {
        type: Number
      },
      /**
       * Local currency
       */
      localCurrency: {
        type: String,
        value: 'EUR'
      },
      /**
       * Disable view all button
       */
      disableViewAll: {
        type: Boolean,
        value: false
      },
      /**
       * Disable view all button
       */
      forceViewAllVisible: {
        type: Boolean,
        value: false
      },
      /**
       * Show spinner
       */
      spinner: {
        type: Boolean,
        value: false
      },
      /**
       * Type of spinner to show
       */
      spinnerType: {
        type: String,
        value: 'spinner'
      },
      /**
       * Has transactions
       */
      _hasTransactions: {
        type: Boolean,
        value: false
      },
      /**
       * Message empty transactions
       */
      _messageEmptyList: {
        type: String
      },
      /**
       * Title empty transactions
       */
      titleEmptyList: {
        type: String
      },
      /**
       * Message set by outside
       */
      messageEmptyList: {
        type: String
      },
      /**
       * Image url
       */
      imageEmptyList: {
        type: String,
        value: ''
      },
      /**
       * Not show the message empty list
       */
      disableMessageEmpty: {
        type: Boolean,
        value: false
      },
      /**
       * Format date of additional Info
       */
      formatDate: {
        type: String,
        value: 'DD/MM/YY'
      },
      /**
       * Navigation to continued page
       */
      continue: {
        type: String
      },
      /**
       * Navigation to continued page
       * default: DD MMMM
       */
      transactionGroupDateFormat: {
        type: String
      },
      /**
       * Date format to show transaction date when the year is the current year.
       */
      transactionCurrentYearDateFormat: {
        type: String
      },
      /**
       * Group transactions by month
       */
      groupByMonth: {
        type: Boolean,
        value: false
      },
      /**
       * Show button to start new operation in empty list
       */
      showNewOperationButton: {
        type: Boolean,
        value: false
      },
      /**
       * Show decimals in amount
       */
      decimalsHidden: {
        type: Boolean,
        value: false
      },
      /**
       * Show message no more transactions
       */
      noMoreTransactions: {
        type: Boolean,
        value: false
      },
      /**
       * Show message load error
       */
      loadError: {
        type: Boolean,
        value: false
      },
      /**
       * Hide retry load transactions button
       */
      hideRetryLoadTransactionsButton: {
        type: Boolean,
        value: false
      },
      /**
       * Show custom message empty list
       */
      showCustomMessageEmptyList: {
        type: Boolean,
        value: false
      },
      /**
       * Message custom message empty list
       */
      customMessageEmptyList: {
        type: String,
        value: 'cells-transactions-list-custom-message-empty-list'
      },
      /**
      * Show title with empty list
      */
      showEmptyListTitle: {
        type: Boolean,
        value: false
      },
      /**
      * Empty list title
      */
      emptyListTitle: {
        type: String,
        value: ''
      },
      /**
       * Max number of transactions to display
       */
      limit: Number,
      /**
       * Hide transaction financing status
       */
      hideFinancingStatus: Boolean,
      /**
       * Show transaction fulfillment status
       */
      showFulfillmentStatus: Boolean,
      /**
       * Type icon of cells-icon-message
      */
      typeIcon: {
        type: String,
        value: 'info'
      },
      /**
       * Icon of cells-icon-message
      */
      boxIcon: {
        type: String,
        value: 'coronita:info'
      },
      /**
       * should cells-icon-message be visible when list is empty
       */
      iconMessageEmptyList: {
        type: Boolean,
        value: false
      },
      /**
       * Display empty message when there is no elements in the list and skeleton is not active
       */
      _showEmptyResults: {
        type: Boolean,
        computed: '_computeShowEmptyResults(_hasTransactions, loaded)'
      },
      /**
       * reverse list sort order
       * @type {Boolean}
      */
      reverseOrder: {
        type: Boolean,
        value: false
      },
      /**
       * Primary amount class
       */
      primaryAmountClass: {
        type: String
      },
      /**
       * Secondary amount class
       */
      secondaryAmountClass: {
        type: String
      },
      /**
       * list class
       */
      listClassName: {
        type: String,
        value: ''
      },
      /**
       * Max lines shown in item description
       */
      descriptionMaxLines: {
        type: Number
      },
      /**
       * Product currrency
       */
      currency: {
        type: String
      },
      /**
       * Transactions billing period
       */
      billingPeriod: {
        type: String
      },
      /**
       * Disable tap action on item
       */
      disableTapActionItem: {
        type: Boolean,
        value: false
      },
      /**
       * Show message card with button
       */
      showCustomMessageWithButton: {
        type: Boolean,
        value: false,
      },
      /**
       * Implements custom timezone on cells-molecule-group-transactions-list component
       */
      useClientLocalTime: {
        type: Boolean,
        value: false
      },
      /*
       * Show view more button in footer
       */
      hasFooterButton: {
        type: Boolean,
        value: false,
      },
      /*
       * Show the first letter of the month in uppercase
       */
      capitalizeMonth: {
        type: Boolean,
        value: false
      },
      /*
       * Last transaction redeemed with points
       */
      lastTransactionRedeemed: {
        type: Object,
        value: () => ({})
      },
      /*
       * Valid Card Reward Benefits
       */
      validCardRewardBenefits: {
        type: Boolean,
        value: false
      },
      /*
       * Valid Card Finance
       */
      validCardFinance: {
        type: Boolean,
        value: false
      },
      /**
      * Hide group date flag
      * @type {Boolean}
      * @value false
      */
      hideGroupDate: {
        type: Boolean,
        value: false,
        reflectToAttribute: true
      },
      /*
       * Holds balances info
       */
      holdsBalances: {
        type: Object,
        observer: 'setHoldsTitle'
      },
      /*
      * Display personalized message
      */
      displayPersonalizedMessage: {
        type: String,
        observer: '_personalizedMessageChanged'
      },
      /*
      * Should show personalized message
      */
      showPersonalizedMessage: {
        type: Boolean,
        value: false
      },
      /*
      * Computed property for personalized message
      */
      _loadedWithoutPersonalizedMessage: {
        computed: '_checkedMessageEmpty(!loaded, showPersonalizedMessage, showCustomMessageWithButton)'
      },
      /*
      * Computed property for checked message empty
      */
      _showCheckedMessageEmpty: {
        computed: '_checkedMessageEmpty(_hasTransactions, disableMessageEmpty, loadError)'
      },
      /**
       * If true, group's header will remain visible at the top of the view when scrolling
       */
      stickyGroup: {
        type: Boolean,
        value: false,
        reflectToAttribute: true
      },
      /**
       * Error message to display
       */
      errorMessage: {
        type: String,
        value: 'cells-transactions-list-load-error'
      },
      /**
       * Button error label
       */
      buttonErrorMessage: {
        type: String,
        value: 'cells-transactions-list-load-error-retry'
      },
      /**
       * On-tapped transaction
       */
      selectedTransaction: {
        type: Object,
        value: () => ({}),
        notify: true
      },
      /*
       * Floated Button Icon
       */
      floatedButtonIcon: {
        type: String
      },
      /**
       * Floated Button Event
       */
      floatedButtonEvent: {
        type: String
      },
      /**
       * Indicates if has to show floated button
       */
      _hasToShowFloatedButton: {
        type: Boolean,
        computed: '_computeHasToShowFloatedButton(floatedButtonIcon, floatedButtonEvent)'
      },
      /**
       * Transaction list item block mode
       */
      isBlock: {
        type: Boolean,
        value: false
      },
      /*
      * Empty list button message
      */
      messageEmptyListBtn: {
        type: String
      },
      /*
      * Should show empty list button
      */
      showEmptyListBtn: {
        type: Boolean,
        value: false
      },
      /**
      * If true, active swipe actions
      */
      activeSwipe: {
        type: Boolean,
        value: false
      },
      /*
       * External header text
       */
      externalHeaderText: {
        type: String,
        value: 'cells-transactions-list-custom-message-with-button-movement-period-title'
      },
      /**
       * External modal first paragraph text
       */
      externalModalFirstParagraphText: {
        type: String,
        value: 'cells-transactions-list-modal-body-text-exit'
      },
      /**
       * External modal second paragraph text
       */
      externalModalSecondParagraphText: {
        type: String,
        value: 'cells-transactions-list-modal-body-text-exit-confirm'
      },
      /**
       * External masthead link text
       */
      externalMastheadLinkText: {
        type: String,
        value: 'cells-transactions-list-label-button-external'
      },
      /**
       * External masthead message text
       */
      externalMastheadMessageText: {
        type: String,
        value: 'cells-transactions-list-go-external'
      },
      /**
       * Label _transactionsListAriaLabel to be recognized by
       * the accessibility device helper
       */
      _transactionsListAriaLabel: {
        type: String,
        value: 'cells-transactions-list-aria-label'
      },
      /**
      * Show the number of chars for mask the amount
      */
      maskedAmountNumberChars: {
        type: Number,
        value: 5
      },
      /**
      * If true, then amount is masked
      */
      maskedAmounts: {
        type: Boolean,
        value: false
      },
      /**
      * Aria label for floated button
      */
      ariaLabelFloatedButton: {
        type: String,
        value: 'cells-transactions-list-floated-button-aria-label'
      },
      /**
      * Aria label for help icon button
      */
      ariaLabelHelpIconButton: {
        type: String,
        value: 'cells-transactions-list-help-icon-aria-label'
      },
      /**
      * Customize error event when the error button is clicked
      */
      actionErrorEvent: String,
      /**
      * Option to hide balance
      */
      hideBalance: {
        type: Boolean,
        value: false,
      },
      /**
      * Custom Class for text
      */
      customTextClass: {
        type: String
      },
      /**
      * Show button to mark as read
      */
      showMarkAsRead: {
        type: Boolean,
        value: false
      },
      /**
       * public Show message card with button
       */
      showCustomMessageWarningWithButton: {
        type: Boolean,
        value: false
      },
      /**
       * custom Message Warning
       */
      customMessageWarningWithButton: {
        type: Array,
        value: () => []
      },
      /**
       * private Show message card with button
       */
      _showCustomMessageWarningWithButton: {
        type: Boolean,
        computed: '_pushShowCustomMessageWarningComputed(showCustomMessageWarningWithButton, customMessageWarningWithButton.*)'
      },
      /**
       * External masthead heading text
       */
      externalMastheadHeadingWarningText: {
        type: String,
        value: 'cells-transactions-list-external-warning-heading'
      },
      /**
       * External masthead message text
       */
      externalMastheadMessageWarningText: {
        type: String,
        value: 'cells-transactions-list-external-warning-message'
      },
      /**
       * External masthead link text
       */
      externalMastheadLinkWarningText: {
        type: String,
        value: 'cells-transactions-list-external-warning-link'
      },
      /**
      * Flag to disabled button
      */
      disabledMarkAsRead: {
        type: String
      },
      /**
       * If true, display the header in the skeleton when it loads
       */
      showLoadedHeader: {
        type: Boolean,
        value: false
      },
      /**
       * Title to show in header skeleton
      */
      skeletonTitle: {
        type: String
      },
      /**
       * Custom class for cells-molecule-group-transactions-list
       */
      groupTransactionsClass: {
        type: String
      },
      /**
       * If true, display the title in the skeleton when it loads and its empty
       */
      showEmptyTitle: {
        type: Boolean,
        value: false
      },
      /**
       * If true, the link is not displayed in the skeleton when loaded and has data
       */
      hideLinkButon: {
        type: Boolean,
        value: false
      },
      /**
       * Custom class for listing from the parent component
       */
      customClassList: {
        type: String
      },
      /**
       * Config to pob promotion icon message
       */
      pobPromotionLabelConfig: {
        type: Object,
        value: () => ({})
      },
      /**
       * Codes that indicates that is a SPEI and international transactions
       */
      _speiCodes: {
        type: Array,
        value: () => ['950', '951', '221', '222']
      },
      /**
       * Types that indicates that is a SPEI and international transactions
       */
      _speiTransactionTypes: {
        type: Array,
        value: () => ['transfer_credit', 'transfer_debit', 'uncategorized']
      },
      /**
       * Flag that allows you to send the correct product in TDD and TDC
       */
      detailTransactionsCards: {
        type: Boolean,
        value: false
      }
    };
  }

  setHoldsTitle(holdsBalances) {
    if (holdsBalances) {
      this.title = 'cells-holds-list-title';
    }
  }

  /**
   * Force transactions list render
   */
  forceTransactionsRender() {
    Polymer.RenderStatus.afterNextRender(this, () => {
      if ((this.transactions || []).length) {
        this.set('transactions', [ ...this.transactions ]);
      }
    });
  }

  /**
   * Reset
   */
  reset() {
    this.set('transactions', null);
    this.set('_transactions', null);
    this.set('loaded', false);
    this.set('noMoreTransactions', false);
    this.set('loadError', false);
    this.set('_hasTransactions', false);
    this.set('showPersonalizedMessage', false);
    this.set('displayPersonalizedMessage', null);
    this.actionErrorEvent = null;
    this.spinner = false;
  }

  /**
  * Handles when the view is on the bottom of the page
  */
  onScrollBottom() {
    this.spinner = true;
    this.dispatchEvent(new CustomEvent('get-more-transactions', {
      bubbles: true,
      composed: true
    }));
  }
  /**
 * Show the load error message
 */
  showMessageLoadError(params = {}) {
    if (params && params.isflagError) {
      this.set('hideRetryLoadTransactionsButton', 'disabled');
    }
    this.set('loaded', true);
    this.set('loadError', true);
    this.set('transactions', null);
    this.set('_transactions', null);
    this.set('_hasTransactions', false);
  }
  /**
 * Notify view all transactions
 */
  _notifyViewAll() {
    this.dispatchEvent(new CustomEvent('view-all-transactions', {
      detail: this._buildViewAllParams(),
      bubbles: true,
      composed: true
    }));
    this.dispatchEvent(new CustomEvent('transactions-list', {
      detail: this.transactions,
      bubbles: true,
      composed: true
    }));
  }
  /**
 * Show Empty Transactions List
 */
  showEmptyTransactionsList() {
    this.transactions = [];
    this.loaded = true;
    this._hasTransactions = false;
  }

  /**
  * Checked set transactions
  * @param transactions
  */
  _pushTransactions(transactions) {
    if (Array.isArray(transactions)) {
      const transactionsLength = transactions.length;
      if (transactionsLength) {
        this.set('_hasTransactions', true);
        const editConceptTransactions = this._transactionsConcept(transactions);
        this.set('_transactions', editConceptTransactions);
      } else {
        this._setMessageEmptyList();
        this.set('_hasTransactions', false);
      }
      if (this.limit !== undefined) {
        if (transactionsLength < this.limit) {
          this.forceViewAllVisible = false;
        } else {
          this.dispatchEvent(new CustomEvent('get-more-transactions', {
            bubbles: true,
            composed: true
          }));
        }
      }

      this.loaded = true;
      this.spinner = false;
      this.loadError = false;
    }
  }

  /**
   * method that separates the received word spei from the concept
   */
  _transactionsConcept(transaction) {
    return transaction.map(item => {
      if (typeof item.concept === 'string') {
        const newConcept = item.concept.replace(/Spei recibido(.+)/, 'Spei recibido $1').trim();
        return {...item, concept: newConcept};
      }
      return {...item};
    });
  }
  /**
   * Computed if array customMessageWarningWithButton change value
   * @param showCustomMessageWarningWithButton {boolean}
   * @param customMessageWarningWithButton {array}
   * @private
   */
  _pushShowCustomMessageWarningComputed(showCustomMessageWarningWithButton, customMessageWarningWithButton) {
    return showCustomMessageWarningWithButton && !this.get('value.length', customMessageWarningWithButton);
  }

  /**
   * Notify transaction detail
   * @param {Object} transaction
   * @event transaction-detail
   */
  _dispatchTransaction(transaction) {
    const detail = this.get('detail', transaction);
    const transactionDetail =  detail ? { transaction: JSON.stringify(detail) } : transaction;
    if (transactionDetail) {
      this.dispatchEvent(new CustomEvent('transaction-detail', {
        detail: transactionDetail,
        bubbles: true,
        composed: true
      }));
    }
  }

  /**
 * Notify in tap transaction
 */
  onTransactionTap(ev) {
    const disableCanTap = !!(this.get('target.transaction.disableCanTap', ev));
    const isInactive = this.get('target.transaction.displayType', ev) === 'inactive';
    if (!this.disableTapActionItem && ev && ev.target && !disableCanTap && !isInactive) {
      let params = this._getTransactionParams(ev);
      this.set('selectedTransaction', ev.target.transaction || {});
      this._configureTransactionsParams(params, ev);
      this._extraParamsForTransaction(params);
      this._checkLastTransactionRedeemed(params);
      this.dispatchEvent(new CustomEvent('transaction-tap', {
        detail: params,
        bubbles: true,
        composed: true
      }));
      this._dispatchTransaction(ev.target.transaction);
    }
  }

  /**
   * We configure the parameters for the movement query
   */
  _configureTransactionsParams(params, ev) {
    if (this.productId) {
      params.productId = this.productId;
    }
    if (this.continue) {
      params.continue = this.continue;
    }
    if (this.productType && this.productType === 'fund') {
      params.fundId = this.get('target.transaction.contract.number', ev);
    }
    if (this.productType && this.detailTransactionsCards) {
      params.productType = this.productType;
    }
  }

  _extraParamsForTransaction(params) {
    if (this.simpleCode) {
      params.simpleCode = this.simpleCode;
    }
  }

  _getTransactionParams(ev) {
    const financingType = this.validCardFinance ? this.get('target.transaction.financingType.id', ev) : false;
    const rewardBenefitsId = this.get('target.transaction.rewardBenefits.0.id', ev) || false;
    const pobPromotionFlag = this._getPobPromotion(this.get('target.transaction.rewardBenefits', ev)) || false;
    const rewardBenefits = this.validCardRewardBenefits ? rewardBenefitsId : false;
    const internalCode = this.get('target.transaction.transactionType.internalCode', ev) || undefined;
    const isPending = (this.get('target.transaction.status.id', ev) || '').toLowerCase() === 'PENDING'.toLowerCase();
    const isSpei = this._checkSpeiTransaction(this.get('target.transaction', ev));
    const legendCodeRaw = this.get('target.transaction.comments.0.value', ev) || false;
    const legendCodeParsed = legendCodeRaw ? legendCodeRaw.substr(legendCodeRaw.length - 3, 3) : false;
    const transactionNumber = this.get('target.transaction.transactionNumber', ev) || false;
    return {
      transactionId: ev.target.transaction && ev.target.transaction.id,
      financingType,
      rewardBenefits,
      pobPromotionFlag,
      internalCode,
      isPending,
      isSpei,
      legendCodeParsed,
      transactionNumber
    };
  }

  /**
   * Get data to set pob promotion true
   * @param {Object} rewardBenefits
   * @returns
   */
  _getPobPromotion(rewardBenefits) {
    if (rewardBenefits) {
      const pob = rewardBenefits.filter((reward) => reward.id === 'SPECIAL_BENEFIT' || reward.id === 'DEFERRAL');
      return pob.length === 2;
    }
  }

  /**
   * Validate transction type is SPEI
   */
  _checkSpeiTransaction(transactionType) {
    const transactionTypeId = transactionType?.transactionType?.id?.toLowerCase() || '';
    const transactionTypeCode = transactionType?.transactionType?.internalCode?.id || '';
    const isSpeiTransactionType = this._speiTransactionTypes.includes(transactionTypeId);
    const isSpeiCode = this._speiCodes.includes(transactionTypeCode);
    return isSpeiTransactionType && isSpeiCode;
  }

  _checkLastTransactionRedeemed(params) {
    if (this.get('id', this.lastTransactionRedeemed) === this.get('transactionId', params)) {
      params.reloadTransactionDetailAfterPointsRedeem = true;
    }
    this.lastTransactionRedeemed = {};
    this.dispatchEvent(new CustomEvent('reset-last-transaction-redeemed', {
      detail: {},
      bubbles: true,
      composed: true
    }));
  }

  /**
 * Set empty Message
 */
  _setMessageEmptyList() {
    let message = 'cells-transactions-list-empty';
    if (this.messageEmptyList) {
      message = this.messageEmptyList;
    } else {
      message = message + (this.productType ? '-product-' + this.productType : '');
    }
    this.set('_messageEmptyList', message);
  }

  /**
   * Set translate message
  */
  _translateTransactionsMessage(getProductType) {
    let local = 'cells-transactions-list-empty-message-product-' + getProductType;
    return local;
  }

  /*
 * Generate array to render skeleton items
 */
  _generateSkeleton(skeletonItems) {
    return Array.from(Array(skeletonItems), function(_, items) {
      return items;
    });
  }
  /*
    * Checked transactions and disable to show view all button
    */
  _hideViewAll(transactions) {
    return !(this._showViewAllButton(transactions) && !this.hasFooterButton);
  }

  /*
    * Checked transactions and disable to show view all button in header
    */
  _hideViewAllFooter(transactions) {
    return !(this._showViewAllButton(transactions) && this.hasFooterButton);
  }

  /**
   * Notify help icon button pressed
   * @event cells-transactions-list-help-icon-clicked
   */
  _helpIconButtonClicked() {
    this.dispatchEvent(new CustomEvent('cells-transactions-list-help-icon-clicked', {
      bubbles: true,
      composed: true
    }));
  }

  _showViewAllButton(transactions) {
    const transactionsNumber = (transactions && transactions.length) || 0;
    return (this.forceViewAllVisible && this.pagination > transactionsNumber) || (!this.disableViewAll && this.pagination <= transactionsNumber);
  }

  /*
    * Checked message it's disabled
    */
  _checkedMessageEmpty(_hasTransactions, disabled, loadError) {
    return !_hasTransactions && !disabled && !loadError;
  }
  /*
    * Fire event when button in empty list is clicked
    */
  _startNewOperation() {
    this.dispatchEvent(new CustomEvent('start-new-operation', {
      bubbles: true,
      composed: true,
      detail: {continue: this.continue}
    }));
  }
  /**
    * Checked show message load error
    */
  _checkedMessageLoadError(loaded, loadError) {
    return loaded && loadError;
  }
  /**
 * Fire event when button retry is clicked
 */
  _retryLoadTransactions() {
    this.reset();
    this.dispatchEvent(new CustomEvent('retry-load-transactions', {
      bubbles: true,
      composed: true
    }));
  }

  /**
   * Fire a custom error event or a retry event when the custom event not exist
   */
  _onClickActionError() {
    if (this.actionErrorEvent) {
      this.dispatchEvent(new CustomEvent(this.actionErrorEvent, {
        bubbles: true,
        composed: true
      }));
    } else {
      this._retryLoadTransactions();
    }
  }

  /**
   * Set error message to be displayed
   */
  setErrorMessage({buttonLabel, message, actionErrorEvent}) {
    this.buttonErrorMessage = buttonLabel;
    this.errorMessage = message;
    this.actionErrorEvent = actionErrorEvent;
  }

  /**
   *  OnCLick to custom message Warning
   */
  _customMessageWarningOnClick() {
    this.dispatchEvent(new CustomEvent('custom-message-warning-on-click', {
      bubbles: true,
      composed: true,
      detail: {
        selectedProductId: this.productId
      }
    }));
  }

  /**
   * Displays a modal when user taps on go external button
   */
  _showModalGoExternal() {
    this.dispatchEvent(new CustomEvent('open-modal-go-external', {
      bubbles: true,
      composed: true,
      detail: {
        code: 'GENERAL-ERROR',
        primaryButtonClass: 'primary',
        selectedConfig: {
          className: 'error',
          openMaximized: false,
          acceptBtLabel: 'cells-transactions-list-modal-confirm',
          cancelBtLabel: 'cells-transactions-list-modal-cancel',
          closeIcon: false,
          template: {
            type: 'paragraphs',
            values: [
              {icon: 'coronita:alert'},
              {text: this.externalModalFirstParagraphText },
              {text: this.externalModalSecondParagraphText }
            ]
          }
        }
      }
    }));
  }

  _personalizedMessageChanged(newValue) {
    if (newValue && newValue !== '') {
      this.loaded = true;
      this.spinner = false;
      this.loadError = false;
      this.showPersonalizedMessage = true;
    }
  }

  /**
   * Display empty message when there is no elements in the list and skeleton is not active
   * @param {Boolean} _hasTransactions
   * @param {Boolean} loaded
   */
  _computeShowEmptyResults(_hasTransactions, loaded) {
    return !_hasTransactions && loaded;
  }

  /**
   * Determine when has to show floated button. Only when icon and event have been defined.
   * @param floatedButtonIcon
   * @param floatedButtonEvent
   * @returns {boolean}
   * @private
   */
  _computeHasToShowFloatedButton(floatedButtonIcon, floatedButtonEvent) {
    return !!floatedButtonIcon && !!floatedButtonEvent;
  }

  /**
   * Dispatch floated button event on click button
   */
  _floatedButtonClicked() {
    this.dispatchEvent(new CustomEvent(this.floatedButtonEvent, {
      bubbles: true,
      composed: true
    }));
  }

  /*
    * Fire event when more info button in empty list is clicked
    */
  _handleEmptyListBtnClick() {
    this.dispatchEvent(new CustomEvent('empty-list-btn-clicked', {
      bubbles: true,
      composed: true,
      detail: this._buildViewAllParams()
    }));
  }

  /*
    * Build a basic params structure to view all navigation event
    */
  _buildViewAllParams() {
    let params = {};
    if (this.productId) {
      params.productId = this.productId;
    }
    if (this.simpleCode) {
      params.simpleCode = this.simpleCode;
    }
    if (this.productType) {
      params.productType = this.productType;
    }
    if (this.billingPeriod) {
      params.billingPeriod = this.billingPeriod;
    }
    if (this.pobPromotionLabelConfig) {
      params.pobPromotionLabelConfig = this.pobPromotionLabelConfig;
    }
    return params;
  }

  /*
    * Set button mark as read disabled
    */
  setDisabledMarkAsRead(isDisabled) {
    this.disabledMarkAsRead = isDisabled ? 'disabled' : '';
  }

  /*
    * Send evento on click button
    * @event set-transactions-as-read
    */
  _setTransactionsAsRead() {
    if (this.disabledMarkAsRead === '') {
      this.dispatchEvent(new CustomEvent('set-transactions-as-read', {
        bubbles: true,
        composed: true,
        detail: { markAsRead: true}
      }));
    }
  }

  /**
  * Get spinner type to show and return true it is spinner
  * @param {String} spinnerType
  * @returns {Boolean}
  */
  _showSpinner(spinnerType) {
    return spinnerType === 'spinner';
  }

  /**
   * Get spinner type to show and return true it is spinner
   * @param {String} spinnerType
   * @returns {Boolean}
   */
  _showSkeleton(spinnerType) {
    return spinnerType === 'skeleton';
  }

}
window.customElements.define(CellsTransactionsList.is, CellsTransactionsList);
