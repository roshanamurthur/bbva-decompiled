'use strict';

class CellsTransactionDetail extends Polymer.mixinBehaviors([
  CellsBehaviors.i18nBehavior,
  CellsBehaviors.CellsTextFormatterBehavior,
  CellsBehaviors.CellsCheckNestedKeysBehavior
], Polymer.Element) {
  static get is() {
    return 'cells-transaction-detail';
  }

  static get properties() {
    return {
      /**
       * Main Transaction
       * @type {Object}
       */
      mainTransaction: {
        type: Object,
        observer: '_getAmount',
      },
      /**
       * Transaction
       * @type {Object}
       */
      transaction: {
        type: Object,
        observer: '_setLoaded',
        notify: true
      },
      /**
       * Local currency
       * @type {String}
       */
      localCurrency: String,
      /**
       * Loaded data
       * @type {Boolean}
       */
      loaded: {
        type: Boolean,
        value: false,
        notify: true,
        reflectToAttribute: true
      },
      /**
       * Show load error
       * @type {Boolean}
       */
      loadError: {
        type: Boolean,
        value: false
      },
      /**
       * class to display custom amount
       * @type {String}
       */
      amountClass: {
        type: String,
        value: 'amount-huge-decimals'
      },
      /**
       * Number of skeleton items
       * @type {Number}
       */
      skeletonItems: {
        type: Number,
        value: 4
      },
      /**
       * Images of types
       * @type {Object}
       */
      images: Object,
      /**
       * Show status
       * @type {Boolean}
       */
      showStatus: {
        type: Boolean,
        value: false
      },
      /**
       * Show status after title, if false status is shown after amount by default
       * @type {Boolean}
       */
      showStatusAfterTitle: {
        type: Boolean,
        value: false
      },
      /**
       * Show operations
       * @type {Boolean}
       */
      showOperations: {
        type: Boolean,
        value: false
      },
      /**
       * Show notification
       * @type {Boolean}
       */
      showNotification: {
        type: Boolean,
        value: false
      },
      showNotificationbelow: {
        type: Boolean,
        value: false
      },
      /**
       * Hide transaction section
       * @type {Boolean}
       */
      hideDetail: {
        type: Boolean,
        value: false
      },
      /**
       * Show loading spinner
       * @type {Boolean}
       */
      showSpinner: {
        type: Boolean,
        value: false
      },
      /**
       * If activated with showStatus, status icon and text will be shown only in case mainTransaction
       * status id is pending
       * @type {Boolean}
       */
      showPendingStatusOnly: {
        type: Boolean,
        value: false
      },
      /**
       * Show status regarding showStatus,showPendingStatusOnly and mainTransaction
       * @type {Boolean}
       */
      _showStatus: {
        type: Boolean,
        computed: '_computedShowStatus(showStatus, mainTransaction)'
      },
      /**
       * Computed variable to show status button regarding mainTransaction icon
       * @type {Boolean}
       */
      _showStatusIcon: {
        type: Boolean,
        computed: '_computedShowStatusIcon(mainTransaction)'
      },
      /**
       * Variable that contains how pending status is represented
       * @type {String}
       */
      pendingStatus: {
        type: String,
        value: 'Pending'
      },
      /**
       * If true, shows always the same image for pending status transactions no matter what type is it
       * @type {Boolean}
       */
      showAlwaysSamePendingImage: {
        type: Boolean,
        value: false
      },
      /**
       * Flag for "Desconozco este movimento" button toggle, if debit card transaction payload is settled or not
       * @type {Boolean}
       */
      claimsExisting: {
        type: Boolean
      },
      /**
       * Flag for "Diferir a meses" button toggle
       * @type {Boolean}
       */
      deferToMonths: {
        type: Boolean
      },

      /**
       * Flag for "Pago con puntos" button toggle
       * @type {Boolean}
       */
      payWithPoints: {
        type: Boolean
      },
      /**
       * Flag if transaction has a claim that is received
       */
      isClaimReceived: {
        type: Boolean,
        value: false
      },
      /**
       * Flag to show button to begin claim process
       */
      isClaimAvailable: {
        type: Boolean,
        value: false
      },
      /**
       * layout property for cells-operations-list
       */
      operationsListLayout: {
        type: String
      },
      /**
       * class property for cells-operations-list-indicators
       */
      operationsListIndicatorsClass: {
        type: String,
        value: ''
      },
      /**
       * Set to true to enable share transaction
       */
      shareTransaction: {
        type: Boolean,
        value: false
      },
      /**
      * Set to true to enable info box
      */
      infoBox: {
        type: Boolean,
        value: false
      },
      /**
       * Transaction category data needed to show category in transaction detail view
       */
      transactionCategoryData: {
        type: Object,
        value: () => ({})
      },
      /**
       * Category icon color. Needed to show icon color depending on category color
       */
      categoryIconColor: {
        type: String,
        value: '',
        observer: '_categoryIconColorObserver'
      },
      /**
       * Flag to show recategorize button to begin recategorization process
       */
      recategorizeTransaction: {
        type: Boolean,
        value: false
      },
      /**
       * Computed variable to show date or not if isActive value exists
       * @type {Boolean}
       */
      activeOperationDate: {
        type: Boolean,
        computed: '_computedShowDate(mainTransaction.isActive)'
      },
      /**
       * CardId from params
       */
      productId: String,

      /**
       * Local language
       * @type {String}
       */
      language: String,

      /**
       * Key related to each item
       */
      itemKey: String,
      /*
       * Checks for changes in operational finance transaction execution
       */
      changesTransactionExecution: {
        type: Boolean,
        value: false
      },
      /**
        * 'For me' string from service frequent operation
        */
      forMeFrequentOperation: {
        type: Array,
        value: ['PARA MÍ', 'PARA MI']
      },
      /*
       * Name holder's label
       */
      nameHolderLabel: {
        type: Array,
        value: ['Nombre del beneficiario', 'cells-transaction-detail-transfer-receiver-name']
      },
      /**
       * Transaction amount
       */
      mainTransactionAmount: {
        type: Number,
        computed: '_computeMainTransactionAmount(mainTransaction, productType)'
      },
      /**
       * Transaction amount
       */
      mainTransactionPoints: {
        type: Number,
        computed: '_computeMainTransactionPoints(mainTransaction)'
      },
      /**
       * Transaction amount
       */
      mainTransactionPointsLabel: {
        type: String,
        computed: '_computeMainTransactionPointsLabel(mainTransaction)'
      },
      /**
       * Check if exists transaction amount
       */
      notExistAmount: {
        type: Boolean,
        value: false,
        reflectToAttribute: true
      },
      /**
       * Hide secction claim and share whit class bottons-options
       */
      showClaimsExisting: {
        type: Boolean,
        value: false
      },
      /**
       * Get the formatted url
       */
      linkFormated: {
        type: String,
        computed: '_changeFormat(transaction)'
      },
      /**
       * Defer to months icon
       */
      deferToMonthsOperative: {
        type: Object,
        value: () => ({
          icon: 'coronita:previousapointment',
          iconSize: 'icon-size-26'
        })
      },
      /**
       * Pay with points icon
       */
      payWithPointsOperative: {
        type: Object,
        value: () => ({
          icon: 'coronita:favoritestar',
          iconSize: 'icon-size-26'
        })
      },
      /**
       * Transfer refund icon
       */
      transferRefundOperative: {
        type: Object,
        value: () => ({
          icon: 'coronita:balance',
          iconSize: 'icon-size-26'
        })
      },
      /**
       * Flag for "transfer refund operative" button toggle
       * @type {Boolean}
       */
      transfersRefund: {
        type: Boolean,
        value: false
      },
      /**
       * If true, transaction-info section should be hidden
       */
      hideDetailInfo: {
        type: Boolean,
        value: false
      },
      /**
       * If true, transaction-info section should be hidden
       */
      _hideTransactionInfo: {
        type: Boolean,
        computed: '_computeHideTransactionInfo(hideDetailInfo, showNotification, showNotificationbelow, transaction)'
      },
      /**
       * Property for bind class between components
       */
      measurePaddingPage: {
        type: String,
        value: ''
      },
      /**
       * Number of columns in grid mode for cells-operations-list-indicators
       */
      gridColumns: {
        type: Number
      },
      /**
       * property for config banner
       */
      config: {
        type: Object,
        value: () => ({})
      },
      /**
       * Hide or show banner
       */
      showBanner: {
        type: Boolean,
        value: false
      }
    };
  }

  /**
   * Function that returns the format of a url
   */
  _changeFormat() {

    if (this.c(this.transaction, 'data.data.2')) {
      let trackingKey;
      let indexURL;
      let indexReference;
      let valueUrl = '';
      this.transaction.data.data[2].map(function(current, index) {
        if (current.key === 'cells-transaction-detail-transfer-url-status') {
          indexURL = index;
          valueUrl = current.value || '';
        }
        if (current.key === 'cells-transaction-detail-transfer-tracking-reference') {
          trackingKey = index;
        }
        if (current.key === 'cells-transaction-detail-transfer-reference') {
          indexReference = index;
        }
      });

      if (trackingKey !== undefined && this.c(this.transaction, 'moneyFlow.id') === 'INCOME') {
        let correctTrackingKey = this.c(this.transaction, 'detail.references.1.value');
        this.transaction.data.data[2][trackingKey].value = correctTrackingKey;
      }
      if (indexReference !== undefined && this.c(this.transaction, 'moneyFlow.id') === 'INCOME') {
        let correctReference = this.c(this.transaction, 'detail.customExternalReference.value');
        this.transaction.data.data[2][indexReference].value = correctReference;
      }

      if (valueUrl) {
        this.transaction.data.data[2][indexURL].value = {
          linkValue: {
            event: 'send-url',
            label: valueUrl
          }
        };
      }
      return valueUrl.slice(0, 31);
    }
  }

  /**
   * Function that get event and set data for the channel
   */
  getInformationForTheChannel(ev) {
    if (ev && ev.currentTarget && ev.currentTarget.dataset) {
      const eventName = ev.currentTarget.dataset.event;
      const value = ev.currentTarget.dataset.value;
      this.dispatchEvent(new CustomEvent(eventName, {
        bubbles: true,
        composed: true,
        detail: {
          scheme: value,
          packageId: null
        }
      }));
    }
  }

  /**
   * Function that get amount mainTransaction and set data for the channel
   * @param {Object} mainTransaction
   */
  _getAmount(value) {
    this.dispatchEvent(new CustomEvent('get-amount-value', {
      detail: value,
      bubbles: true,
      composed: true
    }));
  }

  /**
   * Function to trigger reset from bridge_page channel
   * @param {*} params
   */
  init(params) {
    if (params && !params.value) {
      this.reset();
    }
  }

  /**
    * @desc reset property values
    * @event back-to-list event when handle native back button
    */
  reset() {
    if (!this.changesTransactionExecution) {
      this.resetAfterOperative();
      this.deferToMonths = false;
      this.payWithPoints = false;
      this.dispatchEvent(new CustomEvent('back-to-list', {
        bubbles: true,
        composed: true
      }));
    }
  }

  /**
   * Function that reset properties after operative
   */
  resetAfterOperative() {
    this.loaded = false;
    this.transaction = null;
    this.set('mainTransaction', null);
    this.claimsExisting = null;
    this.isClaimReceived = null;
    this.isClaimAvailable = null;
    this.transfersRefund = null;
    this.showBanner = false;
  }

  errorHandler() {
    this.set('loaded', true);
    this.set('loadError', true);
    this.set('transaction', null);
  }

  /**
   * Function that shows status icon and text if showStatus or if
   * showPendingStatusOnly are true and mainTransaction status id is Pending
   * @param {Boolean} showStatus
   * @param {Object} mainTransaction
   */
  _computedShowStatus(showStatus, mainTransaction) {
    if (showStatus && ((mainTransaction || {}).status || {}).id) {
      if ((!this.showPendingStatusOnly) ||
          (this.showPendingStatusOnly && mainTransaction.status.id.toLowerCase() === this.pendingStatus.toLowerCase())) {
        return true;
      }
    }
    return false;
  }

  /**
   * Function that shows status icon button if mainTransaction status icon is defined
   * @param {Object} mainTransaction
   */
  _computedShowStatusIcon(mainTransaction) {
    if (((mainTransaction || {}).status || {}).icon) {
      return true;
    }
    return false;
  }
  /**
   * Function that returns value to show date
   * @param {Boolean} isActive
   */
  _computedShowDate(isActive) {
    return typeof isActive !== 'undefined' ? isActive : true;
  }

  _showStatusAfterTitle(showStatus) {
    return showStatus && this.showStatusAfterTitle;
  }

  _showStatusAfterAmount(showStatus) {
    return showStatus && !this.showStatusAfterTitle;
  }

  _setLoaded(transaction) {
    if (transaction) {
      this.set('loaded', true);
      this.set('loadError', false);

      if (transaction.data) {
        this.showOperations = transaction.data.showOperations;
        this.showNotification = transaction.data.showNotification;
        this.showNotificationbelow = transaction.data.showNotificationbelow;
        const arrayData = (transaction.data.data || {})[0] || [];
        arrayData.forEach((item) => {
          if (this.nameHolderLabel.includes(item.key)) {
            item.value = !this.forMeFrequentOperation.includes(item.value) ? this.camelize(item.value) : this.capitalize(item.value);
          }
        });
      }
      this.dispatchEvent(new CustomEvent('transaction-value', {
        bubbles: true,
        composed: true,
        detail: transaction
      }));

      if (transaction?.additionalInformation?.additionalData?.split(':')?.includes('REF')) {
        const additionalData = transaction.additionalInformation.additionalData.replaceAll(':', ' ').split(' ');
        const reference = transaction.additionalInformation.reference.replace('GUIA:', '');

        transaction.operations[0].operative = 'billPayments';
        transaction.additionalInformation.reference = reference;
        transaction.additionalInformation.ref = additionalData[1];
        transaction.additionalInformation.cie = additionalData[3];
      }
    }
  }

  _getImage(type) {
    if (this.showAlwaysSamePendingImage && ((this.mainTransaction || {}).status || {}).id.toLowerCase() === this.pendingStatus.toLowerCase()) {
      return this.images && this.images[this.pendingStatus.toLowerCase()] || '';
    }
    return this.images && this.images[type] || '';
  }

  _onClickStatusIcon() {
    this.dispatchEvent(new CustomEvent('on-click-status-icon', {
      bubbles: true,
      composed: true
    }));
  }

  _deferToMonths() {
    this.dispatchEvent(new CustomEvent('on-click-defer-months-icon', {
      detail: this.transaction,
      bubbles: true,
      composer: true
    }));
  }
  _payWithPoints() {
    this.dispatchEvent(new CustomEvent('on-click-pay-with-points-icon', {
      detail: this.transaction,
      bubbles: true,
      composer: true
    }));
  }

  _claimTransaction() {
    this.dispatchEvent(new CustomEvent('on-click-claim-transaction-icon', {
      detail: this.transaction,
      bubbles: true,
      composed: true
    }));
  }

  _generateSkeletonItems(skeletonItems) {
    return Array.from(Array(skeletonItems), (_, items) => items);
  }

  _transferRefund() {
    this.dispatchEvent(new CustomEvent('on-click-transfer-refund-icon', {
      detail: this.transaction,
      bubbles: true,
      composer: true
    }));
  }

  /**
   * Show error load message
   */
  _checkedMessageLoadError(loaded, loadError) {
    return loaded && loadError;
  }

  /**
   * Fire event to retry load transaction detail
   */
  _retryLoadTransactionDetail() {
    this.set('loadError', false);
    this.set('loaded', false);
    this.dispatchEvent(new CustomEvent('retry-load-transaction-detail', {
      bubbles: true,
      composed: true
    }));
  }

  /**
   * Show skeleton while loading if showSpinner property is false
   */
  _showSkeleton(loaded) {
    return !loaded && !this.showSpinner;
  }

  /**
   * Show data key and value
   */
  _showItemData(subheader, link) {
    return !subheader && !link;
  }

  /**
   * Return the header class
   * @param {transaction} mainTransaction
   */
  _getHeaderClass(mainTransaction) {
    return (mainTransaction || {}).headerClass || (mainTransaction || {}).type;
  }

  /**
   * Fire and event when Item button is clicked
   */
  _itemClicked(ev) {
    if (ev && ev.currentTarget && ev.currentTarget.dataset) {
      const eventName = ev.currentTarget.dataset.event;
      const value = ev.currentTarget.dataset.value;
      const detail = value ? JSON.parse(value) : value;
      this.dispatchEvent(new CustomEvent(eventName, {
        detail: detail,
        bubbles: true,
        composed: true
      }));
    }
  }

  /**
   * Manages the operations to capture an image of the shareable-receipt
   * @param {*} ev
   * @param {*} target
   */
  _manageOperation(ev, target) {
    const id = (target || {}).id;
    const followPath = {
      share: this._shareReceipt.bind(this),
      installments: this._navigateInstallmentsPage.bind(this),
      execute: this._goToExecute.bind(this),
      navigation: this._navigationToPage.bind(this),
      custom: this._dynamicEvent.bind(this)
    };

    if (followPath[id] instanceof Function) {
      followPath[id](target);
    } else {
      this._goToComingSoon();
    }
  }

  /**
   * Create a dynamic custom event and send dynamic transaction
   * @param {*} target
   */
  _dynamicEvent(target) {
    const eventName = this.c(target, 'eventName');
    const dynamicDetail = this.c(target, 'sendTransaction') ? this.transaction : target;
    this.dispatchEvent(new CustomEvent(eventName, {
      detail: dynamicDetail,
      bubbles: true,
      composed: true
    }));
  }

  /**
   * Dispatches an event to navigate to coming soon
   */
  _goToComingSoon() {
    this.dispatchEvent(new CustomEvent('navigation-to-coming-soon', {
      bubbles: true,
      composed: true
    }));
  }

  _shareReceipt(target) {
    this.dispatchEvent(new CustomEvent('share-transaction-receipt-capture', {
      detail: target,
      bubbles: true,
      composed: true
    }));
  }

  /**
   * Dispatches an event with transaction data to recategorize transaction movement
   */
  _recategorizeTransaction() {
    this.dispatchEvent(new CustomEvent('recategorize-button-pressed', {
      bubbles: true,
      composed: true,
      detail: this.mainTransaction
    }));
  }

  /**
   * Observer to change icon color depending on category color
   * @param {String} iconColor Category icon color
   */
  _categoryIconColorObserver(iconColor) {
    this.style.setProperty('--category-icon-color', iconColor);
  }

  /**
   * Fire event when copy button clicked.
   * @event cells-transaction-detail-copy-button-click
   */
  _copyButtonClicked(ev) {
    ev.preventDefault();
    var item = ev && ev.model && ev.model.item;
    this.itemKey = item.key + '-copy';
    this.dispatchEvent(new CustomEvent('cells-transaction-detail-copy-button-click', {
      bubbles: true,
      composed: true,
      detail: item.value
    }));
  }

  /**
   * Fire the key related to copied text.
   * @event cells-transaction_detail-info-key
   */
  launchKey() {
    this.dispatchEvent(new CustomEvent('cells-transaction_detail-info-key', {
      bubbles: true,
      composed: true,
      detail: this.itemKey
    }));
    this.itemKey = '';
  }

  /**
   * Fire event when help icon clicked.
   * @event help-icon-tapped
   */
  _helpIconTapped(ev) {
    let key = ev.model.__data.item.key;
    this.dispatchEvent(new CustomEvent('help-icon-tapped', {
      bubbles: true,
      composed: true,
      detail: { id: key }
    }));
  }

  /**
   * Manages click on actionBtn of notificationBelow
   */
  _onNotificationActionClick() {
    this.dispatchEvent(new CustomEvent('retry-load-transaction-detail', {
      bubbles: true,
      composed: true
    }));
  }

  /**
   * Navigate to page card installments detail
   */
  _navigateInstallmentsPage() {
    this.dispatchEvent(new CustomEvent('navigate-card-installments-detail', {
      bubbles: true,
      composed: true,
      detail: {
        productId: this.productId,
        transactionId: this.transaction.id
      }
    }));
  }

  /**
   * Send an event to the DM for navigation to the FO Execute
   * @param   {Object}  target
   * @return  {void}
   */
  _goToExecute(target) {
    this.dispatchEvent(new CustomEvent('go-to-execute', {
      detail: target,
      bubbles: true,
      composed: true
    }));
  }

  /**
   * Navigate to page with data of transaction
   */
  _navigationToPage() {
    this.dispatchEvent(new CustomEvent('navigation-to-page', {
      detail: this.transaction,
      bubbles: true,
      composed: true
    }));
  }

  /**
   * Compute transaction amount
   */
  _computeMainTransactionAmount(mainTransaction, productType) {
    const amount = this.c(mainTransaction, 'amount.amount', 0);
    if (productType === 'voucherDetail') {
      this.notExistAmount = !amount;
    }
    return amount;
  }

  /**
   * Compute transaction points
   */
  _computeMainTransactionPoints(mainTransaction) {
    const amount = this.c(mainTransaction, 'points.amount.amount', 0);
    if (amount > 0) {
      return amount;
    }
  }

  /**
   * Compute transaction points label
   */
  _computeMainTransactionPointsLabel(mainTransaction) {
    const amount = this.c(mainTransaction, 'points.amount.amount', 0);
    const label = this.c(mainTransaction, 'points.amount.label');
    return amount > 0 ? label : '';
  }

  /**
   * Determines if transaction-info section should be hidden
   */
  _computeHideTransactionInfo(hideDetailInfo, showNotification, showNotificationbelow, transaction) {
    return hideDetailInfo || (!showNotification && !showNotificationbelow && !this.c(transaction, 'data.data'));
  }
}

window.customElements.define(CellsTransactionDetail.is, CellsTransactionDetail);
