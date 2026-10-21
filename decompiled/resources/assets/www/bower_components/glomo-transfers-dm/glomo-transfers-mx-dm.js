/* global moment */
/* eslint new-cap: 0 */
/* eslint no-shadow: "error" */
/* global transfersDmMixin */

class GlomoTransfersMxDm extends Polymer.mixinBehaviors([
  CellsBehaviors.i18nBehavior
], CellsBehaviors.transfersDmMixin(Polymer.Element)) {

  static get is() {
    return 'glomo-transfers-mx-dm';
  }

  static get observers() {
    return [
      '_updateFilterTags(_currentFilters.*)',
      '_existMobileTransfers(mobileTransfersParsed)',
      '_onChangedFinalAmount()'
    ];
  }

  static get properties() {
    return {

      /**
       * Types of mobile transfer
       */
      _types: {
        type: Array,
        value: () => [
          'PENDING',
          'EXPIRED',
          'REJECTED'
        ]
      },
      /**
       * Pending mobile transfers
       */
      pending: {
        type: Array,
        notify: true
      },

      /**
       * Expired mobile transfers
       */
      expired: {
        type: Array,
        notify: true
      },

      /**
       * Rejected mobile transfers
       */
      rejected: {
        type: Array,
        notify: true
      },
      /**
       * actual state of user interaction
       * @type {String}
       */
      state: {
        type: String,
        value: '',
        observer: '_updateState',
      },
      /**
       * current selection of filters
       * @type {String}
       */
      _currentFilters: {
        type: Object
      },
      /**
       * Mobile transfers
       * @type {Array}
       */
      _allMobileTransfers: {
        type: Array,
        value: () => []
      },
      /**
       * Status selected from filter
       * @type {Object}
       */
      _checkedStatus: {
        type: Object,
        value: () => ({
          pendingCheckedStatus: undefined,
          rejectedCheckedStatus: undefined,
          expiredSCheckedStatus: undefined,
        })
      },
      /**
       * Local currency
       */
      localCurrency: String,

      /**
       * @description local currency
       * @type {String}
       */
      currency: String,

      /**
       * Mobile transfers array
       */
      mobileTransfersParsed: {
        type: Array,
        notify: true
      },
      /**
       * Mobile transfer object
       */
      _mobileTransferParsed: {
        type: Object
      },
      /**
      * @description the service response is saved
      * @type {Boolean}
      */
      _cachedTransfer: Object,
      /**
       * Mobile transfer id
       */
      mobileTransferId: String,
      /**
      * @description enable access for QR reader
      * @type {Boolean}
      */
      cardlessWithdrawalQR: {
        type: Boolean,
        value: false
      },
      /**
      * Cancel object response
      */
      _openCancelRes: {
        type: Object,
      },
      /**
      * Counter request
      */
      counter: {
        type: Number,
        value: 0
      },

      /**
       * The email linked to the account is saved
       */
      accountEmail: {
        type: String,
        value: ''
      },

      /**
       * Origin account encrypted id
       */
      clientId: {
        type: String,
        value: ''
      },

      /**
       * Origin account clear id
       */
      clientIdSettlement: {
        type: String,
        value: ''
      },

      /**
       * Origin's account
       */
      selectedSender: {
        type: Object,
        value: () => ({}),
      },

      /**
       * Origin's account currency
       */
      originCurrency: {
        type: String,
        value: 'glomo-transfer-origin-currency'
      },

      /**
       * Type of the transfer made: 'INTERNAL_TRANSFERS', 'INTERBANK_TRANSFERS' or 'OWN_TRANSFERS'
       */
      transferType: {
        type: String,
        value: '',
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
      contactDetail: {
        type: Object,
        value: () => ({})
      },

      /**
       *  Here is stored the information of a contact that already is in savedContacts, used when validating if number is in savedContacts
       */
      savedContactDetail: {
        type: Object,
        value: () => ({})
      },

      /**
       * Destination' account
       */
      selectedReceiver: {
        type: Object,
        value: () => ({}),
      },

      /**
       * Destination's account currency
       */
      foreignCurrency: {
        type: String,
        value: 'glomo-transfer-foreign-currency'
      },

      /**
       * If true, it means that we are in exchangeRates section
       */
      exchangeRatesFlag: {
        type: Boolean,
        value: false
      },

      /**
       * Typed amount selected
       */
      _inputAmount: {
        type: String,
        value: ''
      },

      /**
       * Stores succesful response of exchangeRates service, used later on when using transfer service
       */
      _parsedExchangeRatesDetail: {
        type: Object,
        value: () => ({})
      },

      /**
       * Value of 1 base currency in quote currency
       */
      relativeValue: {
        type: String,
        value: ''
      },

      /**
       * Equivalence of inputAmount in foreignCurrency
       */
      totalAmount: {
        type: String,
        value: ''
      },

      /**
       * The final amount of the transfer is saved
       */
      finalAmountSelected: {
        type: Object,
        value: () => ({}),
        observer: '_onChangedFinalAmount'
      },

      /**
       * The commission to be charged for a transfer is saved
       */
      _totalFees: {
        type: Object,
        value: () => ({})
      },

      /**
       * The object used to display the screenshot is saved
       */
      _transferDetailShare: {
        type: Object,
        value: () => ({})
      },

      /**
       * Api version for cells-dm-global-apis-contacts-book-bgadpmock
       */
      contactsBookApiVersion: {
        type: String,
        value: '0'
      },

      /**
       * Api version for cells-dm-global-apis-receivers
       */
      receiversApiVersion: {
        type: String,
        value: '0'
      },

      /**
       * Api version for cells-dm-global-apis-catalogs
       */
      catalogsApiVersion: {
        type: String,
        value: '0'
      },

      /**
       * Api version for cells-dm-global-apis-exchange-rates
       */
      exchangeRatesApiVersion: {
        type: String,
        value: '0'
      },

      /**
       * Bgadp implementation configuration, used in cells-dm-global-apis-exchange-rates
       */
      bgadpImpl: {
        type: String,
        value: 'global'
      },

      /**
       * Array of cards before being parsed into specific structure
       */
      globalCards: {
        type: Array,
        value: () => [],
      },

      /**
       * Array of accounts before being parsed into specific structure
       */
      globalAccounts: {
        type: Array,
        value: () => [],
      },

      /**
       *  Array of accounts after being parsed into specific structure
       */
      _globalAccountsParsed: {
        type: Array,
        value: () => [],
      },

      /**
       * Array of cards after being parsed into specific structure
       */
      _globalCardsParsed: {
        type: Array,
        value: () => [],
      },

      /**
       * Stores client's products before being parsed, local flow
       */
      globalAccountsNativeProp: {
        type: Object,
        value: () => ({}),
      },

      /**
       * Path to error.svg image
       */
      errorAlertImagePath: {
        type: String,
        value: '../images/errors/error.svg'
      },

      /**
       * Path to speedometer-high.svg image
       */
      speedometerHighImagePath: {
        type: String,
        value: '../images/errors/speedometer-high.svg'
      },

      /**
       * Used to persist data from transfers to transfersSuccess
       */
      transfersOperationData: {
        type: Object
      },

      /**
       * Stores external link
       */
      externalLink: {
        type: String,
        value: ''
      },

      /**
       * Stores primary external link that will be assigned to external link
       */
      primaryExternalLink: {
        type: String,
        value: ''
      },

      /**
       * Stores secondary external link that will be assigned to external link
       */
      secondaryExternalLink: {
        type: String,
        value: ''
      },

      /**
       * Stores entry point
       */
      entryPoint: {
        type: String,
        value: ''
      },

      /**
       * Stores concept after being validated
       */
      conceptValidated: {
        type: Object,
        value: () => ({}),
      },
      /**
       * google assitant data
       */
      assistantData: {
        type: Object,
        value: () => ({}),
      },

      /**
       * saves the current account ID of the account from which the transfer is being made.
       */
      _idEntryPoint: {
        type: String,
        value: ''
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
       * flag to indicate that the quote was successful
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
       * Indicates when stand in mode its on
       * @type {Boolean}
       */
      standIn: {
        type: Boolean,
        value: false
      },
      /**
       * Headers for request
       * @type {Object}
       */
      _headers: {
        type: Object,
        value: () => ({})
      },
      /**
       * Authentication type for headers request
       * @type {String}
       */
      authenticationType: {
        type: String
      },
      /**
       * Customer device info
       * @type {Object}
       */
      deviceId: {
        type: Object,
        value: () => ({})
      },
      /**
       * The object used to post Contact in contacts Agenda
       */
      newContactToPost: {
        type: Object,
        value: () => ({})
      },
      /**
       * Flag to activate dimo feature
       */
      dimoFeature: {
        type: Boolean,
        value: false
      },
      /**
       * Object to equal the success payload
       * @type Object
       */
      dataTransfer: {
        type: Object,
        value: () => ({})
      },
      /**
       * Property to use to concatenate bussinessCode, amount and date
       * @type String
       */
      businessCode: {
        type: String,
        value: ''
      },
      /**
       * config featureFlagCollection by channel with allowed flags
       * @type {Object}
       */
      featureFlagCollection: {
        type: Object,
        value: () => ({})
      },
      /**
       * State of reviewAndAuthorize
       * @type Boolean
       */
      _reviewAndAuthorizeCalled: {
        type: Boolean,
        value: false
      },
      /**
       * Forze no timezone calculation for transfer date
       * @type {Boolean}
       */
      fixedTimezone: {
        type: Boolean,
        value: false
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
       * Auxiliar key that indicates if the type of a transfer is FX
       * @type {String}
       */
      transferTypeFx: {
        type: String,
        value: ''
      },
      /**
       * Auxiliar key that indicates if the currecy of a transfer is FX
       * @type {String}
       */
      currencyTypeFx: {
        type: String,
        value: ''
      },
      /**
       * Indicates whether a petition was already made to the Banks list
       * @type {Boolean}
       */
      isGetListBanks: {
        type: Boolean,
        value: false
      },
      /**
      * Obtain the data from app-settings
      * @type {Object}
      */
      publicSettings: {
        type: Object,
        value: () => ({})
      },
      /**
      * Property to preserve the phone assistance number
      * @type {Object}
      */
      phoneAssistanceNumber: {
        type: String,
        value: ''
      },
      /**
       * Indicates whether the authentication headers are set in stand in mode
       * for contacts book request
       * @type {Boolean}
       */
      setContactsStandInHeaders: {
        type: Boolean,
        value: false
      },
      /**
       * Indicates whether the bank list should request in initPage method
       * @type {Boolean}
       */
      getBanksOnInit: {
        type: Boolean,
        value: false
      },
      /**
       * @description flag to handler payment MTU
       * @type {Object}
       */
      mtuFlag: {
        type: Object,
        value: () => ({})
      },
      /**
       * Indicate if the user come from expenses group
       * @type {Boolean}
       */
      comeFromExpensesGroup: {
        type: Boolean,
        value: false
      }
    };
  }

  /**
   * Method to set flag to indicate come from ExpensesGroup in true
   */
  entryFromExpensesGroup() {
    this.comeFromExpensesGroup = true;
  }

  /**
   * Method to set flag to indicate exit from ExpensesGroup in false
   */
  exitFromExpensesGroup() {
    this.comeFromExpensesGroup = false;
  }

  /**
   * @description Fetch data
   * @public
   */
  getMobileTransfers() {
    if (!this.state) {
      this.state = 'initial';
      this._types.forEach(type => this.$.dm.getMobileTransfers({'status.id': type}));
    }
  }

  /**
   * @description Shows the manners of help depending on who the operation is for.
   */
  openCardlessWithdrawalJHistoricHelpModal() {
    this._openModal('historic-help', true);
  }

  /**
   * @description Shows modal when the user click in cancel transfer.
   *
   */
  openCancelModal({
    productId
  }) {
    const response = {
      id: {
        'mobile-transfer-id': productId
      },
      isDetail: false
    };
    this._openCancelRes = response;
    this._openModal('cancel-modal-transaction', false);
  }

  /**
   * @description Parse transfers and update params
   * @private
   */
  _parseTransfers(payload) {
    const key = 'mobileTransfersParsed';
    const {
      detail
    } = payload;
    this._saveMobileTransfers(detail, key);
  }

  /**
   * @description Save mobile transfers fetched
   * @param {Array} _mobileTransfers
   * @param {Number} key
   * @private
   */
  _saveMobileTransfers(_mobileTransfers, key) {
    this.counter++;
    if (this.state === 'initial') {
      this._allMobileTransfers.push(..._mobileTransfers);
      if (this.counter === 3) {
        this.set(key, this._mapTransfer(this._allMobileTransfers));
      }
      return;
    }
    this.set(key, this._mapTransfer(_mobileTransfers));

  }

  /**
   * @description Mapped transfers
   * @param {Array} transfer
   * @private
   */
  _mapTransfer(transfer) {
    const _mobileTransfersMapped = transfer.map(mobileTransfer => {
      const _transfer = {
        concept: this._getConcept(mobileTransfer.concept),
        id: this.c(mobileTransfer, 'mobileTransferId'),
        main: this.c(mobileTransfer, 'receiver') ?
          this.c(mobileTransfer, 'receiver.alias') || this.c(mobileTransfer, 'receiver.holder.holderName') :
          this.t('glomo-forme-header-title'),
        tertiary: this._setTertiaryMessage(this.c(mobileTransfer, 'status.id'), this.c(mobileTransfer, 'date')),
        status: this._getTransferStatus(this.c(mobileTransfer, 'status')),
        operationDate: this.c(mobileTransfer, 'date'),
        localAmount: mobileTransfer.sentMoney.find((amount) => this.c(amount, 'currency') === 'MXN'),
        actions: this._getActions(this.c(mobileTransfer, 'status.id')),
        hasActions: true,
        templateSelected: 'swipeWithdrawalShare'
      };
      this._closeControlVeil();
      return _transfer;
    });
    const _firstElementPending = _mobileTransfersMapped.find(element => element.status.type === 'info');
    if (_firstElementPending !== undefined) {
      Object.assign(_firstElementPending, {
        additionalInformation: [
          {
            type: 'text',
            value: this.t('glomo-transfer-info-qr-available')
          }
        ]
      });
    }

    if (_mobileTransfersMapped.length !== 0) {
      this._fire('show-floating-button-filter', false);
    }
    return _mobileTransfersMapped;
  }

  /**
   * @description Recieve a concept, if concept is undefined return a default string
   * @param {String} concept
   * @private
   */
  _getConcept(concept) {
    if (concept === undefined) {
      return this.t('cells-operations-retiro-section');
    }
    return concept;
  }

  /**
   * @description set the actions depend of the status
   * @param {String} status
   * @private
   */
  _getActions(status) {
    let actionText = '';
    let actionIcon = '';
    let actionMethod = '';
    let className = '';
    if (status === 'PENDING') {
      actionText = this.t('glomo-transfers-dm-cardless-withdrawal-historic-cancel-action');
      actionIcon = 'coronita:error';
      actionMethod = 'CANCEL';
      className = 'bg-delete';

    } else {
      actionText = this.t('glomo-transfers-dm-cardless-withdrawal-historic-share-action');
      actionIcon = 'coronita:share';
      actionMethod = 'SHARE';
      className = '';
    }
    return Object.assign([
      {
        text: actionText,
        icon: actionIcon,
        method: actionMethod,
        className
      }
    ]);
  }

  /**
   * Set tertiary message in parsing transfer
   */
  _setTertiaryMessage(status, date) {
    let message = '';
    if (status === 'EXPIRED') {
      message = this.t('glomo-transfers-past-overcome');
    } else if (status === 'PENDING') {
      message = this.t('glomo-transfers-overcome');
    } else {
      return message;
    }
    return message + moment(date).format('DD MMMM YYYY');
  }
  /**
   * @description Get transfer status data
   * @param {Object} status
   * @private
   */
  _getTransferStatus(status) {
    let statusKey = '';
    if (['PENDING', 'SENT', 'EXPIRED', 'REJECTED'].includes(this.c(status, 'id'))) {
      statusKey = `glomo-transfers-status-${status.id.toLowerCase()}`;
    } else if (status.id === 'SETTLED') {
      statusKey = 'glomo-transfers-status-settled';
    } else if (status.id === 'BLOCK') {
      statusKey = 'glomo-transfers-status-';
      statusKey += status.reason && status.reason.id === 'F' ? 'block-fraud' : 'block-max-attempt';
    }

    return Object.assign({
      description: statusKey,
      id: statusKey,
      type: this._getStatusType(status)
    });
  }

  /**
   * Hide view all button and show full result list
   * @param {Boolean} hide
   * @event 'update-list-limit'
   * @event 'update-view-all'
   */
  _hideViewAll(hide) {
    this._fire('update-list-limit', hide ? null : this.defaultListLimit);
    this._fire('update-view-all', hide);
  }

  /**
   * Update messages and buttons
   * @param {String} - state: initial | empty | all | filter | emptyFilter
   * @event 'update-empty-message'
   * @event 'update-top-description'
   * @event 'update-bottom-description'
   * @event 'update-title'
   * @event 'update-tags'
   * @event 'update-show-sort-by'
   * @event 'update-text-description'
   */

  _updateState(state) {
    if (!state) {
      return;
    }

    const {
      hide,
      hideTags
    } = {
      initial: { // initial list of checks
        hide: false,
        hideTags: true,
      },
      empty: { // empty list of checks
        hide: true,
        hideTags: true
      },
      filter: { // filtered results
        hide: true,
        hideTags: false
      },
      emptyFilter: { // empty list of checks
        hide: true,
        hideTags: false
      },
    } [state];

    this._hideViewAll(hide);
    this._fire('update-tags', hideTags);
  }

  /**
   * Filter tag value by filter id
   * @param {String} id - period | dateRange | amountRange | status
   */
  _parseFilterTagValue(id) {
    const {
      currencyCode = '$',
      minDate,
      maxDate,
      minAmount,
      maxAmount,
      selectedDateFilter = {},
    } = this._currentFilters;
    return ({
      period: () => this.t(selectedDateFilter.name),
      dateRange: () => [
        moment(minDate).format('D MMM YYYY'),
        moment(maxDate).format('D MMM YYYY')
      ].join(' - '),
      amountRange: () => {
        const min = minAmount && `${currencyCode}${minAmount}`;
        const max = maxAmount && `${currencyCode}${maxAmount}`;
        const from = this.t('glomo-cardless-withdrawal-historic-filter-from');
        const to = this.t('glomo-cardless-withdrawal-historic-filter-to');

        return min && max ?
          [min, max].join('- ') :
          (min && `${from} ${min}` || max && `${to} ${max}`);
      },
      pending: () => {
        return this.t('glomo-transfers-status-pending');
      },
      rejected: () => {
        return this.t('glomo-transfers-status-rejected');
      },
      expired: () => {
        return this.t('glomo-transfers-status-expired');
      }

    })[id]();
  }

  /**
   * Filter tags changed by the current filter selection
   * @param {Object} _currentFilters
   * @event 'update-filter-tags'
   */
  _updateFilterTags({
    value
  }) {
    const filterTags = [];
    const {
      minDate,
      maxDate,
      minDateInitial,
      maxDateInitial,
      minAmount,
      maxAmount,
      selectedDateFilter = {},
      pendingCheckedStatus,
      rejectedCheckedStatus,
      expiredSCheckedStatus
    } = value;
    if (minDate && maxDate && (minDate !== minDateInitial || maxDate !== maxDateInitial)) {
      const periodSelected = selectedDateFilter.name && selectedDateFilter.name !== 'glomo-date-filter-period-historic';
      filterTags.push({
        id: 1,
        associatedFilters: ['minDate', 'maxDate', 'selectedDateFilter'],
        value: this._parseFilterTagValue(periodSelected ? 'period' : 'dateRange')
      });
    }
    if (minAmount || maxAmount) {
      filterTags.push({
        id: 2,
        associatedFilters: ['minAmount', 'maxAmount'],
        value: this._parseFilterTagValue('amountRange')
      });
    }
    this._statusFilterTags(filterTags, pendingCheckedStatus, rejectedCheckedStatus, expiredSCheckedStatus);
    this._fire('update-filter-tags', filterTags);
    this._fire('hide-filter-tags', !(filterTags.length > 0));
  }

  /**
   * Filter tag value by filter id
   * @param {Array} filterTags
   * @param {String} pendingCheckedStatus
   * @param {String} rejectedCheckedStatus
   * @param {String} expiredSCheckedStatus
   * @private
   */
  _statusFilterTags(filterTags, pendingCheckedStatus, rejectedCheckedStatus, expiredSCheckedStatus) {
    if (pendingCheckedStatus) {
      filterTags.push({
        id: 3,
        associatedFilters: [ 'pendingCheckedStatus' ],
        value: this._parseFilterTagValue('pending')
      });
    }
    if (rejectedCheckedStatus) {
      filterTags.push({
        id: 4,
        associatedFilters: [ 'rejectedCheckedStatus' ],
        value: this._parseFilterTagValue('rejected')
      });
    }
    if (expiredSCheckedStatus) {
      filterTags.push({
        id: 5,
        associatedFilters: [ 'expiredSCheckedStatus' ],
        value: this._parseFilterTagValue('expired')
      });
    }
  }
  /**
   * Handle filter tags closed by the user  --- param -> filterTags = []
   * @param {Array} filterTags - filter params
   */
  onChangeFilterTags(filterTags = []) {
    const params = {};
    if (filterTags.length === 0) {
      this._openControlVeil();
      this.reset();
      this.getMobileTransfers();
      return;
    }

    filterTags.forEach(({
      associatedFilters
    }) => {
      associatedFilters.forEach(filter => {
        params[filter] = this._currentFilters[filter];
      });
    });
    this.filterCheckList(params);
  }

  /**
   * @description Reset the filter values for the checkBox.
   * @private
   */
  _resetFiltersCheckBox() {
    this.set('_checkedStatus.pendingCheckedStatus', undefined);
    this.set('_checkedStatus.rejectedCheckedStatus', undefined);
    this.set('_checkedStatus.expiredSCheckedStatus', undefined);
  }

  /**
   * Load filtered list of checks
   * @param {Object} params - filter params
   * @param {string} params.minDate - date FROM value (DD-MM-YYYY)
   * @param {string} params.maxDate - date TO value (DD-MM-YYYY)
   * @param {number} params.minAmount - amount FROM value
   * @param {number} params.maxAmount - amount TO value
   * @param {number} params.status - status id
   */

  filterCheckList(filters) {
    this.state = 'filter';
    const {
      minDate,
      maxDate,
      minDateInitial,
      maxDateInitial,
      minAmount,
      maxAmount,
      selectedDateFilter,
      checkedCheckboxes,
      pendingCheckedStatus,
      rejectedCheckedStatus,
      expiredSCheckedStatus
    } = filters;
    if (checkedCheckboxes === undefined || checkedCheckboxes.length === 0) {
      this._resetFiltersCheckBox();
    }
    if (checkedCheckboxes !== undefined && checkedCheckboxes.length > 0) {
      const checkBoxValue = checkedCheckboxes[0].checks;
      this._checkedStatus.pendingCheckedStatus = checkBoxValue.find((status) => `${status.id}` === '01') ? 'Pendiente' : undefined;
      this._checkedStatus.rejectedCheckedStatus = checkBoxValue.find((status) => `${status.id}` === '02') ? 'Cancelado' : undefined;
      this._checkedStatus.expiredSCheckedStatus = checkBoxValue.find((status) => `${status.id}` === '03') ? 'Vencido' : undefined;
    }
    this._currentFilters = Object.assign({},
      this._getObjectFromParam(minDate, 'minDate'),
      this._getObjectFromParam(maxDate, 'maxDate'),
      this._getObjectFromParam(minDateInitial, 'minDateInitial'),
      this._getObjectFromParam(maxDateInitial, 'maxDateInitial'),
      this._getObjectFromParam(minAmount, 'minAmount'),
      this._getObjectFromParam(maxAmount, 'maxAmount'),
      this._getObjectFromParam(selectedDateFilter, 'selectedDateFilter'),
      this._getObjectFromParam(checkedCheckboxes, 'checkedCheckboxes'),
      (pendingCheckedStatus) ?
        this._getObjectFromParam(pendingCheckedStatus, 'pendingCheckedStatus') :
        this._getObjectFromParam(this._checkedStatus.pendingCheckedStatus, 'pendingCheckedStatus'),
      (rejectedCheckedStatus) ?
        this._getObjectFromParam(rejectedCheckedStatus, 'rejectedCheckedStatus') :
        this._getObjectFromParam(this._checkedStatus.rejectedCheckedStatus, 'rejectedCheckedStatus'),
      (expiredSCheckedStatus) ?
        this._getObjectFromParam(expiredSCheckedStatus, 'expiredSCheckedStatus') :
        this._getObjectFromParam(this._checkedStatus.expiredSCheckedStatus, 'expiredSCheckedStatus')
    );

    this._parseTransfersFilters(this._currentFilters);
  }

  /**
   * Filter tag value by filter id
   * @param {Object} filters
   * @private
   */
  _parseTransfersFilters(filters) {
    let _transfers = [];
    _transfers = this._period(this._allMobileTransfers, filters);
    _transfers = this._amountRange(filters, _transfers);
    _transfers = this._statusSelected(filters, _transfers);

    const key = 'mobileTransfersParsed';

    this.set(key, this._mapTransfer(_transfers));
  }

  /**
   * @description set period time dates from filters
   * @param {Array} transfers
   * @param {Object} filtdatesers
   * @private
   */
  _period(transfers, dates) {
    if (dates.minDate === undefined && dates.maxDate === undefined) {
      return transfers;
    }
    const startDate = moment(dates.minDate).format('YYYY-MM-DD');
    const endDate = moment(dates.maxDate).format('YYYY-MM-DD');

    if (startDate === endDate) {
      const rangeResults = transfers.filter(transfer => {
        const dateFormat = moment(transfer.date).format('YYYY-MM-DD');
        return dateFormat >= startDate && dateFormat <= endDate;
      });
      return rangeResults;
    }

    const rangeResults = transfers.filter(transfer => {
      const dateFormat = moment(transfer.date).format('YYYY-MM-DD');
      const res = dateFormat >= startDate && dateFormat <= endDate;
      return res;
    });
    return rangeResults;
  }

  /**
   * @description set amount range from filters
   * @param {Array} amounts
   * @param {Array} _transfers
   * @private
   */
  _amountRange(amounts, _transfers) {
    const minAmount = amounts.minAmount;
    const maxAmount = amounts.maxAmount;

    if (minAmount === undefined && maxAmount === undefined) {
      return _transfers;
    }

    if (maxAmount === undefined) {
      const rangeResults = _transfers.filter(transfer => {
        const monto = transfer.sentMoney[0].amount;
        return monto >= minAmount;
      });
      return rangeResults;
    }

    if (minAmount === undefined) {
      const rangeResults = _transfers.filter(transfer => {
        return transfer.sentMoney[0].amount <= maxAmount;
      });
      return rangeResults;
    }

    const rangeResults = _transfers.filter(transfer => (transfer.sentMoney[0].amount >= minAmount && transfer.sentMoney[0].amount <= maxAmount));
    return rangeResults;
  }
  /**
   * @description set status selected from filters
   * @param {Array} checkBoxSelected
   * @param {Array} _transfers
   * @private
   */
  _statusSelected(checkBoxSelected, _transfers) {
    const pendingStatus = checkBoxSelected.pendingCheckedStatus;
    const rejectedStatus = checkBoxSelected.rejectedCheckedStatus;
    const expiredStatus = checkBoxSelected.expiredSCheckedStatus;

    if (!pendingStatus && !rejectedStatus && !expiredStatus) {
      return _transfers;
    }

    let checkBoxFilter = [];
    if (pendingStatus) {
      const rangeResults = _transfers.filter(transfer => {
        const status = transfer.status.id;
        return status === 'PENDING';
      });
      checkBoxFilter.push(...rangeResults);
    }

    if (rejectedStatus) {
      const rangeResults = _transfers.filter(transfer => {
        const status = transfer.status.id;
        return status === 'REJECTED';
      });
      checkBoxFilter.push(...rangeResults);
    }

    if (expiredStatus) {
      const rangeResults = _transfers.filter(transfer => {
        const status = transfer.status.id;
        return status === 'EXPIRED';
      });
      checkBoxFilter.push(...rangeResults);
    }

    return checkBoxFilter;
  }

  /**
   * @description Get the key and value.
   * @param {Object} param
   * @param {Object} key
   **/
  _getObjectFromParam(param, key) {
    let objUtil = {};
    objUtil[key] = param;
    return param && objUtil;
  }
  /**
   * @description set error response
   * @param {Object} error
   */
  onDeleteMobileTransferError() {
    this._closeControlVeil();
    this._errorGetMobileTransfers();
  }

  /**
   * @description error handling for cardless withdrawals service.
   *
   **/
  _errorGetMobileTransfers() {
    this._fire('open-error-on-get-mobile-transfers', {
      image: Polymer.ResolveUrl.resolveUrl('./images/errors/general_error.svg'),
      message: 'glomo-transaction-detail-transaction-error-message',
      buttonLabel: 'glomo-transaction-detail-transaction-error-button-label'
    });
  }

  /**
   * @description the event is launched to activate the share receipt.
   * @param {Object} params
   **/
  shareMobileTransferSwipe(params) {
    if (params) {
      const {
        operationData
      } = params;
      this._fire('data-share-receipt', operationData);
    }
  }

  /**
   * @description Service validation if response is empty.
   * @param {Object} mobileTransfersParsed
   **/
  _existMobileTransfers(mobileTransfersParsed) {
    const isArray = mobileTransfersParsed && Array.isArray(mobileTransfersParsed);
    if (isArray && !mobileTransfersParsed.length > 0) {
      this._fire('without-mobile-transfers');
    } else if (isArray && mobileTransfersParsed.length > 0) {
      this._fire('with-mobile-transfers');
    }
  }

  /**
   * ==========================================================
   * CARDLESS WITHDRAWAL HISTORIC DETAIL
   * ==========================================================
   */

  /**
   * @description Identify which type of component to use depending on its status.
   * @param {Object} payload
   **/
  _manageEventsByStatus(payload) {
    this._cachedTransfer = this.c(payload, 'detail');
    const status = this.c(payload, 'detail.status');
    const isPending = this.c(status, 'id') === 'PENDING';
    switch (status.id) {
      case 'PENDING':
        this._parseWithdrawalData(payload, isPending);
        this._showEventComponent('glomo', 'cells');
        break;
      case 'EXPIRED':
        this.openCardlessWithdrawalDetailExpiredModal();
        this._parseWithdrawalData(payload, isPending);
        this._showEventComponent('cells', 'glomo');
        break;
      case 'REJECTED':
      default:
        this._parseWithdrawalData(payload, isPending);
        this._showEventComponent('cells', 'glomo');
        break;
    }
  }

  /**
   * @description Identify which component to hide and which to show.
   * @param {string} showNameEvent
   * @param {string} hiddeNameEvent
   **/
  _showEventComponent(showNameEvent, hiddeNameEvent) {
    if (showNameEvent !== undefined && hiddeNameEvent !== undefined) {
      this._fire(`dm-show-component-${showNameEvent}-transfer`, false);
      this._fire(`dm-hidde-component-${hiddeNameEvent}-transfer`, true);
    }
  }

  /**
   * @description Identifies the codes needed to display and enters them into an array.
   * @param {Object} transfer
   **/
  _getParsedCodes(transfer) {
    const _reference = this.get('references.0', transfer);
    const _withdrawalCodes = this.get('withdrawalCodes.0', transfer);
    const codes = [];
    const validCodes = ['SENDER_CODE', 'RECEIVER_CODE'];
    if (this.get('id', _reference) === 'TRACKING' && validCodes.includes(this.get('id', _withdrawalCodes))) {
      codes.push({
        key: 'glomo-cardless-withdrawal-review-dm-twelve-digits',
        split: [
          this.get('value', _reference) ? this.get('value', _reference).substring(0, 4) : undefined,
          this.get('value', _reference) ? this.get('value', _reference).substring(4, 8) : undefined,
          this.get('value', _reference) ? this.get('value', _reference).substring(8, 12) : undefined
        ]
      });
      codes.push({
        key: 'glomo-cardless-withdrawal-review-dm-four-digits',
        split: [
          this.get('value', _withdrawalCodes) ? this.get('value', _withdrawalCodes) : undefined
        ]
      });
    }
    return codes;
  }

  /**
   * @description returns the class name to take in the following component.
   * @param {Object} status
   **/
  _getStatusType(status) {
    return {
      PENDING: 'info',
      PENDING_TO_CASH: 'info',
      SETTLED: 'info',
      SENT: 'success',
      CANCELLED: 'error',
      EXPIRED: 'error',
      BLOCK: 'error',
      REJECTED: 'error'
    } [status.id] || '';
  }

  /**
   * @description returns the a reserved word depending on the reason or the id.
   * @param {Object} status
   **/
  _getReasonName(status) {
    if (this.get('reason', status)) {
      return this.capitalize(this.get(status, 'reason.name') || '');
    } else {
      return {
        PENDING: 'glomo-transfers-status-pending',
        PENDING_TO_CASH: 'glomo-transfers-status-pending',
        SETTLED: 'glomo-transfers-status-sent',
        SENT: 'glomo-transfers-status-sent',
        CANCELLED: 'glomo-transfers-status-rejected',
        EXPIRED: 'glomo-transfers-status-expired',
        BLOCK: 'glomo-transfers-status-rejected',
        REJECTED: 'glomo-transfers-status-rejected'
      } [status.id] || '';
    }
  }

  /**
   * @description Date and Hour formatter
   * @param {Object} date
   */
  _formatDate(date) {
    return `${moment(date).format('DD MMMM YYYY, HH:mm')}h`;
  }

  /**
   * @description Just Date formatter
   * @param {Object} date
   */
  _justFormatDate(date) {
    return `${moment(date).format('DD MMMM YYYY')}`;
  }

  /**
   * @description Hour formatter
   * @param {Object} time
   */
  _formatHour(time) {
    return `${moment(time).format('HH:mm')}h`;
  }

  /**
   * @description Amount formatter
   * @param {Object} ob
   */
  _formatAmount(ob) {
    if (this.c(ob, 'amount') && this.c(ob, 'currency')) {
      return `$ ${ob.amount}`;
    }
  }

  /**
   * @description Extracts all necessary information to be displayed by the component.
   * @param {Object} transfer
   */
  _getWithdrawalData(transfer) {
    const formatAmount = this._formatAmount.bind(this);
    const data = [];
    const addData = (key, value, fn) => {
      if (value) {
        data.push({
          key,
          value: fn ? fn(value) : value,
          class: 'spacing-s'
        });
      }
    };
    addData('cells-transaction-detail-expiry-date', this.c(transfer, 'dueDate'), this._formatDate);
    addData('cells-transaction-detail-concept', this.c(transfer, 'concept'));
    addData('cells-transaction-detail-amount', this.c(transfer, 'sentMoney.0'), formatAmount);
    if (this.c(transfer, 'sender.contract.number') && this.c(transfer, 'status.id') === 'PENDING') {
      data.push({
        key: 'glomo-transaction-detail-withdrawal-number',
        musk: {
          value: this.c(transfer, 'sender.contract.number'),
          chars: 5,
          simbol: '•'
        },
        class: 'spacing-s'
      });
    } else {
      data.push({
        key: 'glomo-transaction-detail-withdrawal-number',
        value: this.c(transfer, 'sender.contract.number'),
        visibleChars: 5,
        maskChars: '•',
        masked: true
      });
    }
    addData('glomo-transaction-detail-date-operation', this.c(transfer, 'date'), this._justFormatDate);
    addData('glomo-transaction-detail-time-hour-operation', this.c(transfer, 'date'), this._formatHour);
    return data;
  }

  /**
   * @description includes all the necessary information required by the component
   * @param {Object} payload
   */
  _parseWithdrawalData(payload, isPending) {
    const transfer = this.c(payload, 'detail');
    const status = this.c(transfer, 'status');
    const enableCommerce = this._getFlagValue();
    if (isPending) {
      const data = {
        id: this.mobileTransferId,
        additionalInformation: {
          additionalData: ''
        },
        amountLabel: 'glomo-transaction-detail-title',
        chargeAmount: this.c(transfer, 'sentMoney.0'),
        statusTransaction: {
          text: 'glomo-transfers-status-pending',
          status: 'pending',
          class: 'italic spacing-m pending'
        },
        lowStatusDate: {
          date: transfer.date,
          class: 'bold italic'
        },
        isDividerAfterDate: true,
        advice: {
          text: 'glomo-transfers-dm-cardless-withdrawal-detail-options',
          afterText: {
            id: 'icon-clic-help',
            iconButton: 'coronita:help',
            iconClass: 'icon-size-24 color-icon blue'
          },
          class: 'inline bold',
          containerClass: 'spacing-l'
        },
        messageInTheMiddle: {
          text: 'glomo-transfers-dm-cardless-withdrawal-detail-message',
          class: 'amount-description spacing-l'
        },
        codes: this._getParsedCodes(transfer, isPending),
        operations: [
          {
            label: 'glomo-cardless-withdrawal-review-dm-nearby-atms',
            id: 'route',
            icon: 'coronita:place'
          },
          {
            label: 'glomo-transaction-detail-share',
            id: 'share',
            icon: 'coronita:share',
            operative: 'cardlessWithdrawal'
          },
          {
            label: 'glomo-transfers-dm-cardless-withdrawal-historic-accept',
            id: 'delete',
            icon: 'coronita:error'
          }
        ],
        messageError: {
          typeCases: 'topInfo',
          text: 'cells-successful-response-message-error',
          link: 'cells-successful-response-message-error-button'
        },
        bodyClass: 'left-detail',
        topInfo: this._getWithdrawalData(transfer),
        templateSelected: 'cardlessWithdrawalDetail'
      };
      if (this.cardlessWithdrawalQR) {
        Object.assign(data, {
          buttonLinkDown: {
            class: 'btn-blue-color spacing-top',
            iconLeft: {
              class: 'icon-size-20',
              icon: 'coronita:qr'
            },
            label: 'glomo-cardless-withdrawal-review-dm-button-link',
            eventName: 'read-qr-code',
            eventDetail: this.mobileTransferId
          },
        });
      }
      if (enableCommerce) {
        data.operations.unshift({
          label: 'glomo-cardless-withdrawal-review-dm-commerce',
          id: 'commerce',
          icon: 'coronita:shop'
        });
      }
      this._mobileTransferParsed = data;
      this._fire('mobile-transfer-parsed-glomo', this._mobileTransferParsed);
    } else {
      const transaction = {
        id: this.mobileTransferId,
        additionalInformation: {
          additionalData: ''
        },
        data: {
          title: 'glomo-transaction-detail-title',
          amount: this.c(transfer, 'sentMoney.0'),
          date: this._formatDate(transfer.date),
          status: {
            id: status.id,
            class: this._getStatusType(status),
            value: this._getReasonName(status)
          },
          type: 'cash_withdrawal',
          data: [ this._getWithdrawalData(transfer) ],
          templateSelected: 'cardlessWithdrawalOtherStatus'
        },
        operations: [
          {
            label: 'cells-successful-response-card-detail-share',
            id: 'share',
            icon: 'coronita:share',
            operative: 'withdrawalDetail'
          }
        ]
      };
      this._mobileTransferParsed = transaction;
      this._fire('mobile-transfer-parsed-cells', this._mobileTransferParsed);
      this._fire('mobile-transfer-main', transaction.data);
    }
    this.businessCode = 'Operation=101otp=' + this.get('businessCode', transfer) + 'amount=' + this._amountFormat(this.get('sentMoney.0.amount', transfer)) + 'Date=' + this._dateFormat(this.get('date', transfer));
    this.dataTransfer = transfer;
    this._closeControlVeil();
  }
  /**
   * @description send the data and execute the navaigation
   */
  sendDetailToCommerce() {
    this._fire('set-business-code-of-detail', this.businessCode);
    this._fire('set-data-to-commerce-detail', this.dataTransfer);
    this._fire('navigate-detail-to-commerce');
  }

  /**
   * @description formats a string to 12 decimal places
   * @param amount
   * @private
   */
  _amountFormat(amount) {
    const result = (parseFloat(amount) * 100).toString().padStart(12, '0');
    return result;
  }

  /**
   * @description format a string to Date without separators
   * @param {String} dateTime
   * @private
   */
  _dateFormat(dateTime) {
    const dateFormated = moment(dateTime).format('YYYYMMDD');
    return dateFormated;
  }

  /**
   * @description Get mobile transfer detail
   */
  getMobileTransfer() {
    this._openControlVeil();
    if (this.mobileTransferId !== 'undefined') {
      this.$.dm.getMobileTransfer(this.mobileTransferId);
    } else if (this._mobileTransferParsed) {
      this.mobileTransferId = this.c(this._mobileTransferParsed, 'id');
      this.$.dm.getMobileTransfer(this.mobileTransferId);
    }
  }

  /**
   * @description Displays a warning mode when the withdrawal is expired.
   *
   */
  openCardlessWithdrawalDetailExpiredModal() {
    this._openModal('withdrawal-error-expired', true);
  }

  /**
   * @description Shows the manners of help depending on who the operation is for.
   *
   */
  openCardlessWithdrawalDetailHelpModal() {
    this._openModal('detail-pending-withdrawal', true);
  }

  /**
   * @description It will display the warning mode to cancel the withdrawal and initiate the cancellation if necessary.
   * @param {string} mobileTransferId
   */
  openCancelWithdrawalModal() {
    const response = {
      id: {
        'mobile-transfer-id': this.mobileTransferId
      },
      isDetail: true
    };
    this._openCancelRes = response;
    this._openModal('cancel-modal-transaction-withdrawal', false);
  }

  /**
   * @description Initiates the cancellation of the withdrawal
   * @param {Object} object
   */
  cancelTransactionDetail() {
    this._openControlVeil();
    this._fire('cancel-transfer');
    this.$.dm.deleteMobileTransfer(this.c(this._openCancelRes, 'id'));
    if (this.c(this._openCancelRes, 'isDetail')) {
      this._showEventComponent('cells', 'glomo');
      setTimeout(() => {
        this.getMobileTransfer();
        this._closeControlVeil();
      }, 1000);
    } else {
      setTimeout(() => {
        this.reset();
        this.getMobileTransfers();
      }, 1000);
    }

  }

  /**
   * @description Disptachs event for show mobile transfer error
   */
  _errorOnSetMobileTransfer() {
    this._closeControlVeil();
    this._fire('open-error-on-get-mobile-transfer', {
      image: Polymer.ResolveUrl.resolveUrl('./images/errors/general_error.svg'),
      message: 'glomo-transaction-detail-transaction-error-message',
      buttonLabel: 'glomo-transaction-detail-transaction-error-button-label'
    });
  }
  /**
   * @description open modals
   * @param {String, Boolean}
   * @private
   */
  _openModal(type = 'error', openMaximized = false, body = null) {
    let code = `cardless-widthdrawal-historic-${type}`;
    const modal = {
      code,
      selectedConfig: {
        openMaximized,
        iconOnlyFullHeight: true,
        acceptBtLabel: `${code}-accept`,
      }
    };
    switch (type) {
      case 'withdrawal-error-expired':
        Object.assign(modal.selectedConfig, this._modalErrorExpired());
        break;
      case 'detail-pending-withdrawal':
        Object.assign(modal.selectedConfig, this._modalPendingWithdrawal());
        break;
      case 'historic-help':
        Object.assign(modal.selectedConfig, this._modalHelpHistoric());
        break;
      case 'cancel-modal-transaction-withdrawal':
      case 'cancel-modal-transaction':
        Object.assign(modal.selectedConfig, this._cancelModalTransaction());
        break;
      case 'success-qr':
        Object.assign(modal.selectedConfig, this._modalSuccessQR(body));
        if (this.c(body, 'concept')) {
          modal.selectedConfig.template.values.push({
            title: this.c(body, 'concept'),
            class: 'text-align-left simple-text font-size-xl normal'
          });
          this.exitOperative();
        }
        break;
      default:
        Object.assign(modal.selectedConfig, this._modalQrError());
        break;
    }
    this._fire('glomo-transfers-open-modal-with-settings', modal);
  }
  /**
  * @description create success modal
  * @private
  */
  _modalSuccessQR(body) {
    return {
      className: 'full-height-info header--blue',
      title: 'glomo-cardless-withdrawal-review-header-title',
      iconOnlyFullHeight: true,
      heroImage: Polymer.ResolveUrl.resolveUrl('./images/cardlessWithdrawal/withdrawal-money.svg'),
      openMaximized: true,
      acceptBtLabel: 'glomo-cardless-withdrawal-review-accept',
      template: {
        type: 'paragraphs',
        values: [
          {
            title: this.t('glomo-cardless-withdrawal-review-dm-qr-modal-success-title'),
            class: 'font-size-xl margin-bottom-s'
          },
          {
            text: 'glomo-cardless-withdrawal-review-dm-qr-modal-success-info'
          },
          {
            text: ' ',
            class: 'spacing',
            divider: true
          },
          {
            title: 'glomo-cardless-withdrawal-review-dm-qr-modal-success-detail-title',
            class: 'text-align-left font-size-xl spacing--xl'
          },
          {
            title: 'glomo-cardless-withdrawal-review-dm-qr-modal-success-detail-first-info',
            class: 'text-align-left simple-text grey margin-bottom-s  font-size-xl',
          },
          {
            title: this.c(body, 'amount'),
            class: 'text-align-left simple-text font-size-xl spacing--xl normal'
          },
          {
            title: 'glomo-cardless-withdrawal-review-dm-qr-modal-success-detail-second-info',
            class: 'text-align-left simple-text grey margin-bottom-s font-size-xl'
          }
        ]
      }
    };
  }
  /**
  * @description create error qr modal
  * @private
  */
  _modalQrError() {
    return {
      className: 'full-height-info header--blue',
      heroImage: Polymer.ResolveUrl.resolveUrl('./images/errors/error.svg'),
      title: 'glomo-cardless-withdrawal-review-header-title',
      acceptBtLabel: 'glomo-cardless-withdrawal-review-dm-qr-modal-error-accept',
      cancelBtLabel: 'glomo-cardless-withdrawal-review-dm-qr-modal-error-cancel',
      template: {
        type: 'paragraphs',
        values: [
          {
            title: 'glomo-cardless-withdrawal-review-dm-qr-modal-error-alert',
            class: 'font-size-xl'
          },
          {
            text: 'glomo-cardless-withdrawal-review-dm-qr-modal-error-info-alert',
          }
        ]
      }
    };
  }
  /**
  * @description create error expired modal
  * @private
  */
  _modalErrorExpired() {
    return {
      className: 'full-height-info header--blue',
      openMaximized: true,
      title: 'alert-CARDLESS-WITH-DRAWAL-HISTORIC-INFO-header-modal',
      heroImage: Polymer.ResolveUrl.resolveUrl('./images/errors/error.svg'),
      acceptBtLabel: 'glomo-cardless-withdrawal-dm-error-retry-cancel',
      template: {
        type: 'paragraphs',
        values: [
          {
            title: 'alert-CARDLESS-WITH-DRAWAL-HISTORIC-DETAIL-ERROR-TITLE'
          },
          {
            text: 'alert-CARDLESS-WITH-DRAWAL-HISTORIC-DETAIL-ERROR-MESSAGE',
          }
        ]
      }
    };
  }
  /**
  * @description create pending modal
  * @private
  */
  _modalPendingWithdrawal() {
    const enableCommerce = this._getFlagValue();
    if (enableCommerce) {
      return {
        className: 'full-height-info info header--white',
        openMaximized: true,
        title: 'glomo-transfers-dm-cardless-withdrawal-detail-options',
        acceptBtLabel: 'info-UNDERSTAND-accept',
        template: {
          type: 'paragraphs',
          values: [{
            icon: 'coronita:help',
            class: 'spacing',
            iconClass: 'dark-core-blue'
          },
          {
            title: 'alert-CARDLESS-WITH-DRAWAL-HISTORIC-INFO-title-second',
            class: 'simple-title simple-title spacing'
          },
          {
            title: 'glomo-cardless-withdrawal-dm-modal-subtitle-list-title',
            class: 'text-align-left strong margin-bottom-none below-paragraph'
          },
          {
            list: [
              'glomo-cardless-withdrawal-dm-modal-list-item-1',
              'glomo-cardless-withdrawal-dm-modal-list-item-2',
              'glomo-cardless-withdrawal-dm-modal-list-item-3',
              'glomo-cardless-withdrawal-dm-modal-list-item-4',
            ],
            class: 'cells-lists-with-text-left margin-bottom-xl'
          },
          {
            title: 'glomo-cardless-withdrawal-dm-modal-subtitle-second-list-title',
            class: 'text-align-left strong margin-bottom-none below-paragraph',
          },
          {
            list: [
              'glomo-cardless-withdrawal-dm-modal-second-list-item-1',
              'glomo-cardless-withdrawal-dm-modal-second-list-item-2',
              'glomo-cardless-withdrawal-dm-modal-second-list-item-3',
            ],
            class: 'cells-lists-with-text-left'
          }]
        }
      };
    } else {
      return {
        className: 'full-height-info info header--white',
        openMaximized: true,
        title: 'alert-CARDLESS-WITH-DRAWAL-HISTORIC-INFO-header-modal',
        acceptBtLabel: 'info-UNDERSTAND-accept',
        template: {
          type: 'paragraphs',
          values: [{
            icon: 'coronita:help',
            class: 'spacing',
            iconClass: 'dark-core-blue'
          },
          {
            title: 'alert-CARDLESS-WITH-DRAWAL-HISTORIC-HELP-DETAIL-TITLE',
            class: 'simple-title simple-title spacing'
          },
          {
            list: [
              'alert-CARDLESS-WITH-DRAWAL-HISTORIC-HELP-DETAIL-item-1',
              'alert-CARDLESS-WITH-DRAWAL-HISTORIC-HELP-DETAIL-item-2',
              'alert-CARDLESS-WITH-DRAWAL-HISTORIC-HELP-DETAIL-item-3'
            ],
            class: 'cells-lists-with-text-left margin-bottom-xl'
          }]
        }
      };
    }
  }
  /**
  * @description create success modal
  * @private
  */
  _modalHelpHistoric() {
    return {
      className: 'full-height-info header--blue image--md',
      openMaximized: true,
      title: 'alert-CARDLESS-WITH-DRAWAL-HISTORIC-INFO-header-modal',
      heroImage: Polymer.ResolveUrl.resolveUrl('./images/cardlessWithdrawal/money-app-dollar.svg'),
      acceptBtLabel: 'info-UNDERSTAND-accept',
      template: {
        type: 'paragraphs',
        values: [{
          title: 'alert-CARDLESS-WITH-DRAWAL-HISTORIC-INFO-title'
        },
        {
          list: [
            'alert-CARDLESS-WITH-DRAWAL-HISTORIC-INFO-detail-item-1',
            'alert-CARDLESS-WITH-DRAWAL-HISTORIC-INFO-detail-item-2',
          ],
          class: 'cells-lists-with-text-left'
        },
        {
          icon: 'coronita:info',
          iconClass: 'icon-size-24',
          message: 'alert-CARDLESS-WITH-DRAWAL-HISTORIC-INFO-message',
          type: 'info-dark-blue'
        }]
      }
    };
  }
  /**
  * @description create cancel transaction modal
  * @private
  */
  _cancelModalTransaction() {
    return {
      className: 'error exit',
      iconOnlyFullHeight: true,
      acceptBtLabel: 'glomo-transfers-dm-cardless-withdrawal-historic-accept',
      cancelBtLabel: 'glomo-transfers-dm-cardless-withdrawal-historic-back',
      template: {
        type: 'paragraphs',
        values: [
          {
            icon: 'coronita:alert',
            class: 'spacing'
          },
          { text: 'glomo-transfers-dm-cardless-withdrawal-historic-cancel-message' }
        ]
      }
    };
  }
  /**
  * @description create post confirm code after read QR
  * @param {JSON} data
  */
  postConfirmCodeRequest(data) {
    const _data = JSON.parse(data.content);
    if (this.get('dOp', _data)) {
      const random = this.get('dOp.aleatorio', _data,);
      const _random = random.split('-');
      const hour = _random[3];
      const _hour = hour.split('.');
      const confirmationDate = `${_random[0]}-${_random[1]}-${_random[2]}T${_hour[0]}:${_hour[1]}:${_hour[2]}:${_hour[3]}`;
      this.$.dm.postConfirmCode({
        atm: {
          id: this.get('dOp.cajero', _data)
        },
        confirmationDate,
        code: this.get('dOp.codigo', _data)
      });
      this._fire('copi-cache-transfer', this._mobileTransferParsed);
    }
    this._closeControlVeil();
  }

  /**
  * @description Success Response
  *
  */
  _postConfirmCodeSuccessResponse() {
    const amount = this._formatAmount(this.c(this._mobileTransferParsed, 'chargeAmount'));
    const body = {
      concept: this.c(this._mobileTransferParsed, 'topInfo.1.value', null),
      amount
    };
    this._openModal('success-qr', true, body);
  }

  /**
   * @description Error Response
   *
   */
  _postConfirmCodeErrorResponse() {
    this._openModal('qr-error', true);
    this._closeControlVeil();
  }
  /**
  * @description emits an event to initialize the QR reader.
  **/
  setRequestQR() {
    this._fire('qr-init');
  }

  /**
   * @description reset values to their initial states.
   * @private
   */
  reset() {
    this.loading = false;
    this._allMobileTransfers = [];
    this.state = '';
    this._fire('dm-hidde-component-cells-transfer', true);
    this._fire('dm-hidde-component-glomo-transfer', true);
    this._fire('show-floating-button-filter', true);
    this.counter = 0;
    this._isAbandonSummary = false;
    this._isQuotationDone = false;
  }
  /**
   * @description generic dispatch event
   * @param {String} eventName required
   * @param {Object} detail optional
   * @private
   */
  _fire(eventName, detail = null) {
    this.dispatchEvent(new CustomEvent(eventName, {
      detail,
      bubbles: true,
      composed: true,
    }));
  }
  /**
   * @description open spinner
   * @private
   */
  _openControlVeil() {
    this._fire('open-control-veil');
  }
  /**
   * @description close spinner
   * @private
   */
  _closeControlVeil() {
    this._fire('close-control-veil');
  }

  /**
   * Stores device id data
   * @param {Object} deviceIdInfo
   */
  setDeviceId(deviceIdInfo) {
    this.deviceId = deviceIdInfo.secondaryUserId ?? deviceIdInfo.value;
  }

  /**
   * Gets list of banks, saved contacts and parses aaccounts and cards
   */
  initPage() {
    this._pendingTranferAvailability = false;
    if (this.standIn) {
      this._setStandInHeaders();
    } else if (this.getBanksOnInit) {
      this._getListOfBanks();
    }

    this._getLocalStorage(this._loginDataKey, true);
    this._getSavedContacts();
    this._parseGlobalAccounts(this.globalAccounts);
    this._parseGlobalCards(this.globalCards);
    this._fire('validate-products');
    this._fire('customer-id-changed', this.clientId);
  }

  /**
   * Sets headers for stand in case
   */
  _setStandInHeaders() {
    if (this.setContactsStandInHeaders) {
      this._headers = {
        authenticationtype: this.authenticationType,
        authenticationdata: `deviceid=${this.deviceId}`
      };
    }
  }

  /**
   * @desc dispatch event to consult consent geo
   * @param {Object} data
   * @event consult-consent-geo
   */
  loginDataLocalStoreSuccess(data = {}) {
    this.clientIdSettlement = data.grantingTicketUserId;
  }

  /**
   * @desc Consult variable in localStorage
   * @param {String} key
   * @event get-native-local-storage
   */
  _getLocalStorage(key, secure = false) {
    this._fire('get-native-local-storage', { key, secure });
  }

  /**
   * Public getter for contactsAgenda on transfers
   */
  getContactsAgenda() {
    this._getSavedContacts();
    if (this.mtuFlag?.makePayment || this.mtuFlag?.cancelPayment) {
      this.mtuMakePayment();
    }
  }
  /**
   * Gets customer info, used to get client's email
   */
  _getCustomerInfo() {
    this.$.customersBgadpmockDm.getCustomerContacts();
  }

  /**
   * Gets successful response from customers api
   * @param {response} response
   */
  _successfulCustomerDetailsResponse(response) {
    this.accountEmail = this.c(response, 'detail.1.contact', '');
  }

  /**
   * Gets list of banks, saved contacts and parses aaccounts and cards in local
   */
  initPageLocal() {
    this._parseLocalAccounts(this.globalAccountsNativeProp);
    this._parseLocalCards(this.globalAccountsNativeProp);
    this._fire('validate-products');
    this.clientId = this.c(this.globalAccountsNativeProp, 'customer.customerId');
    this._fire('customer-id-changed', this.clientId);
    this._getCustomerInfo();
  }

  /**
   * Method that parses list of accounts
   * @param {Array} accountList
   */
  _parseGlobalAccounts(accountList = []) {
    if (accountList && accountList.length > 0) {
      let allAccounts = accountList.reduce((accounts, i) => {
        accounts.push(...i.products);
        return accounts;
      }, []);
      let parsedAccounts = allAccounts.map(account => ({
        alias: this.c(account, 'name'),
        accountId: this.c(account, 'id'),
        number: this.c(account, 'description.value'),
        masked: this.c(account, 'description.masked'),
        availableBalance: {
          currentBalances: [ {
            amount: this.c(account, 'primaryAmount.amount'),
            currency: this.c(account, 'primaryAmount.currency')
          } ]
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
        _type: 'ACCOUNTS',
        _family: 'ACCOUNTS',
        accountIndicator: this.c(account, 'detail.indicators.1.isActive')
      }));

      this.set('_globalAccountsParsed', parsedAccounts);
      this._fire('set-global-accounts-parsed', this._globalAccountsParsed);
    }
  }

  /**
   * Method that parses list of cards and filters them
   * @param {Array} globalCards
   */
  _parseGlobalCards(globalCards = []) {
    if (globalCards && globalCards.length > 0) {
      let parsedCards = [];
      let allCards = globalCards.reduce((cards, i) => {
        cards.push(...i.products);
        return cards;
      }, []);
      allCards.map(card => {
        const cardOrder = {
          alias: this.c(card, 'name'),
          accountId: this.c(card, 'id'),
          number: this.c(card, 'originalProduct.number'),
          masked: this.c(card, 'description.masked'),
          availableBalance: {
            currentBalances: [ {
              amount: this.c(card, 'detail.specificAmounts.2.amounts.0.amount'),
              currency: this.c(card, 'detail.specificAmounts.2.amounts.0.currency')
            } ]
          },
          imgSrc: this.c(card, 'detail.images.0.url'),
          subProductType: this.c(card, 'subProductType'),
          status: this.c(card, 'status'),
          numberType: {
            id: 'PAN',
            name: 'Pan'
          },
          contractType: {
            id: 'CARD',
            name: 'Card'
          },
          _type: 'CARDS',
          _family: 'CARDS'
        };
        if (this.c(card, 'status') === 'operative' && this.c(card, 'subProductType') === 'CREDIT_CARD') {
          parsedCards.push(cardOrder);
        }
      }, {});
      this.set('_globalCardsParsed', parsedCards);
      this._fire('set-global-cards-parsed', this._globalCardsParsed);
    }
  }

  /**
   * Method that parses list of accounts to local
   * @param {Object} accountNativeList
   */
  _parseLocalAccounts(accountNativeList = {}) {
    if (accountNativeList && this.c(accountNativeList, 'dashboard.accounts')) {
      let accounts = this.c(accountNativeList, 'dashboard.accounts');
      accounts = accounts.filter(function(account) {
        return account.availableBalance && account.status && account.numberType && account.status.id;
      });
      let parsedAccounts = [];
      accounts.map(account => {
        const acccountOrder = {
          alias: this.c(account, 'alias'),
          accountId: this.c(account, 'accountId'),
          productTitle: this.c(account, 'accountFamily.name'),
          number: this.c(account, 'number'),
          availableBalance: {
            currentBalances: [
              {
                amount: this.c(account, 'availableBalance.currentBalances.0.amount'),
                currency: this.c(account, 'availableBalance.currentBalances.0.currency')
              }
            ]
          },
          status: this.c(account, 'status.id'),
          numberType: {
            id: this.c(account, 'numberType.id'),
            name: 'Customer Account Code'
          },
          contractType: {
            id: 'ACCOUNT',
            name: 'ACCOUNTS'
          },
          _type: 'ACCOUNTS',
          _family: 'ACCOUNTS'
        };
        if (this.c(account, 'availableBalance.currentBalances.0.currency') === 'MXN' || this.c(account, 'availableBalance.currentBalances.0.currency') === 'USD') {
          parsedAccounts.push(acccountOrder);
        }
      });
      this.set('_globalAccountsParsed', parsedAccounts);
      this._fire('set-global-accounts-parsed', this._globalAccountsParsed);
    }
  }

  /**
   * Method that parses list of cards and filters to local
   * @param {Object} accountNativeList
   */
  _parseLocalCards(accountNativeList = {}) {
    if (accountNativeList && this.c(accountNativeList, 'dashboard.cards')) {
      let allCards = this.c(accountNativeList, 'dashboard.cards');
      allCards = allCards.filter(function(card) {
        return card.availableBalance;
      });
      let parsedCards = [];
      allCards.map(card => {
        const cardOrder = {
          alias: this.c(card, 'alias'),
          accountId: this.c(card, 'cardId'),
          productTitle: this.c(card, 'title.name'),
          number: this.c(card, 'number'),
          availableBalance: {
            currentBalances: [
              {
                amount: this.c(card, 'availableBalance.currentBalances.0.amount'),
                currency: this.c(card, 'availableBalance.currentBalances.0.currency')
              }
            ]
          },
          imgSrc: this.c(card, 'images.0.url'),
          cardType: {
            name: this.c(card, 'cardType.name')
          },
          subProductType: this.c(card, 'cardType.id'),
          numberType: {
            id: 'PAN',
            name: 'Pan'
          },
          contractType: {
            id: 'CARD',
            name: 'Card'
          },
          _type: 'CARDS',
          _family: 'CARDS'
        };

        if (this.c(card, 'status.id') === 'OPERATIVE' && this.c(card, 'cardType.id') === 'CREDIT_CARD' && this.c(card, 'physicalSupport.id') === 'NORMAL_PLASTIC') {
          parsedCards.push(cardOrder);
        }
      }, {});
      this.set('_globalCardsParsed', parsedCards);
      this._fire('set-global-cards-parsed', this._globalCardsParsed);
    }
  }

  /**
   * Gets list of banks
   */
  _getListOfBanks() {
    this.$.catalogsDm.getBanks();
  }

  /**
   * Handle the modal that opens by adding a new recipient
   */
  handleNewRecipient() {
    if (!this.isGetListBanks) {
      this._getListOfBanks();
    }
    this._fire('set-properties-new-recipient');
    this._fire('open-modal-new-recipient', true);
  }

  /**
   * Receives _getListOfBanks response, receives list of banks
   * @param {Object} response
   */
  _getBanksSuccesfulResponse(response) {
    if (response && this.c(response, 'detail')) {
      this.isGetListBanks = true;
      this._fire('set-list-of-banks', this.c(response, 'detail'));
    }
  }

  /**
   * Gets user's saved contacts
   */
  _getSavedContacts() {
    const body = {
      pageSize: 999,
      expand: 'products'
    };
    this.$.contactsBookDm.getContacts(body);
  }

  /**
   * Receives user's saved contacts, gets here when receiving a succesful response
   * @param {Event} response
   */
  _getSavedContactsSuccessfulResponse(response) {
    const contactReponse = this.get('detail', response);
    this._fire('set-saved-contacts', contactReponse);
  }

  /**
   * Receives error response from getSavedContacts and sets savedContacts to null
   * @param {Object} response
   */
  _errorGetSavedContacts(response) {
    if (response !== undefined) {
      this._fire('set-saved-contacts', null);
    }
  }

  /**
   * Method that logouts and navigates to external link
   */
  setLogoutExternalLink() {
    this._fire('navigation-to-logout-and-external-link', {
      link: this.t(this.externalLink)
    });
    this._fire('action-launcher-external-link', {
      scheme: this.t(this.externalLink),
      packageId: null,
    });
  }

  /**
   * Method that sets primaryExternalLink to externalLink
   */
  setPrimaryLink() {
    this.externalLink = this.urlBanxico;
    this._fire('navigation-to-external-link');
  }

  /**
   * Method that sets secondaryExternalLink to externalLink
   */
  setSecondaryLink() {
    this.externalLink = this.secondaryExternalLink;
    this._fire('navigation-to-external-link');
  }

  /**
   * Gets account information
   * @param {Number} inputValue
   */
  dispatchReceivers(inputValue) {
    this.$.receiversDm.getReceiver({number: inputValue});
  }

  /**
   * Receives succesful response from receivers service
   * @param {Object} response
   */
  _onGetReceiverSuccessful(response) {
    if (this.c(response, 'detail')) {
      this.set('_responseReceivers', this._parseReceiversResponse(this.c(response, 'detail')));
      this._fire('set-response-receivers', this._responseReceivers);
      if (!this.dimoFeature) {
        this._closeControlVeil();
      }
    }
  }

  /**
   * Receives error response from receivers service
   * @param {Object} response
   */
  _onGetReceiverErrorResponse(response) {
    if (this.c(response, 'detail')) {
      const receiverResponse = {
        bank: this.t('glomo-transfer-other-bank'),
        name: this.t('glomo-transfer-receiver-shared-account-text'),
        numberType: {
          id: this.t('glomo-transfer-receiver-number-type-id'),
          name: this.t('glomo-transfer-receiver-number-type-name')
        },
        productType: {
          id: this.t('glomo-transfer-receiver-product-type-id'),
          name: this.t('glomo-transfer-receiver-product-type-name')
        },
        specificProductType: {
          id: this.t('glomo-transfer-receiver-specific-product-type-id'),
          name: this.t('glomo-transfer-receiver-specific-product-type-name')
        }
      };
      this.set('_responseReceivers', this._parseReceiversResponse(receiverResponse));
      this._fire('set-response-receivers', this._responseReceivers);
      this._closeControlVeil();
    }
  }

  /**
   * Parses receivers service successful response
   */
  _parseReceiversResponse(responseReceivers) {
    if (this.c(responseReceivers, 'bank')) {
      return {
        bank: this.c(responseReceivers, 'bank'),
        number: this.c(responseReceivers, 'number'),
        person: this.c(responseReceivers, 'person'),
        name: this.c(responseReceivers, 'name'),
        numberType: this.c(responseReceivers, 'numberType'),
        productType: this.c(responseReceivers, 'productType'),
        specificProductType: this.c(responseReceivers, 'specificProductType')
      };
    }
  }

  /**
   * Data of a saved contact is mapped, which is sent when consuming a service to notify it by email
   * dispatch event 'operation-registries-sed-notification'
   */
  _emailConfirmationSavedContact() {
    let sendNotificationBody = {};
    let customReference = this.clientId;

    const firstName = this._capitalizeStringManager(this.c(this.globalAccountsNativeProp, 'customer.firstName'));
    const lastName = this._capitalizeStringManager(this.c(this.globalAccountsNativeProp, 'customer.lastName'));
    const secondLastName = this._capitalizeStringManager(this.c(this.globalAccountsNativeProp, 'customer.secondLastName'));

    let nameLength = firstName + ' ' + lastName + ' ' + secondLastName;
    let name = nameLength + Array(62 - nameLength.length + 1).join(' ');

    let destinationLength = this.get('bank.name', this.contactDetail).trim();
    let destination = destinationLength + Array(35 - destinationLength.length + 1).join(' ');

    let last = '';

    let numberLength = this.c(this.contactDetail, 'displayNumber');
    let number = numberLength + Array(35 - numberLength.length + 1).join(' ');

    let date = moment().format('YYYY-MM-DD');
    let localhour = moment();
    let hour = localhour.hour()  + '' + localhour.minutes() + '' + localhour.seconds();

    if (this.c(this.contactDetail, 'bank.id') === '0012') {
      sendNotificationBody = {
        eventCode: '0000000140',
        customExternalReference: customReference,
        destinationType: {
          id: 'REGISTERED',
          name: 'REGISTERED'
        },
        destinationMail: this.accountEmail,
        templateCode: 'KZCA0101',
        messageBody: 'MBANKS10Registro de operación                             #$CUSTOMER$#' + name + destination + 'TRIZ                                                              ' + number + '****MXP 00000000000000000                    106                 #$FOLIOR$#' + date + '0' + hour + ' BANMOVIL'
      };
    } else {
      sendNotificationBody = {
        eventCode: '0000000140',
        customExternalReference: customReference,
        destinationType: {
          id: 'REGISTERED',
          name: 'REGISTERED'
        },
        destinationMail: this.accountEmail,
        templateCode: 'KZCA0101',
        messageBody: 'MBANKS10Registro de operación                             #$CUSTOMER$#' + name + destination + 'TRIZ                                                              ' + number + '****MXP 00000000000000000                    107                 #$FOLIOR$#' + date + '0' + hour + ' BANMOVIL'
      };
    }
    this._fire('operation-registries-sed-notification', sendNotificationBody);
  }


  /**
   * Splits text by blank spaces and rejoins them after capitalization
   * @param {String} text
   */
  _capitalizeStringManager(text) {
    const capitalizedTexts = [];
    const splittedText = text ? text.split(/\s+/) : [];
    splittedText.forEach(el => capitalizedTexts.push(this.capitalize(el)));
    return capitalizedTexts.join(' ');
  }

  /**
   * Receives after succesfully adding a contact to savedContacts
   * @param {Object} contact
   */
  getSaveContact(contact = {}) {
    if (contact && this.c(contact, 'displayNumber')) {
      this.set('newContactToPost', contact);
      this._emailConfirmationSavedContact();
    }
  }
  /**
   * Receives after succesfully send new contact notification
   */
  successOnSendNewContactNotification() {
    if (!this.newContactToPost.disableInputSecondary) {
      this.$.contactsBookDm.postContact(this.newContactToPost);
    }
  }

  /**
   * Receives after error response send new contact notification
   * @param {Object} response
   */
  errorOnSendNewContactNotification(response) {
    this._fire('error-on-post-notification', response);
  }

  /**
   * Update contacts after add or delete a contact
   */
  updateContacts() {
    this._getSavedContacts();
  }

  /**
   * Receives response after succesfully adding a contact to savedContacts
   * @param {Object} response
   */
  _successfulResponsePostContact(response) {
    if (this.c(response, 'detail')) {
      const parsedPostContactResponse = this._parsePostContactResponse(this.c(response, 'detail'));
      this._getSavedContacts();
      this._fire('set-succesful-post-contact-response', parsedPostContactResponse);
    }
  }

  /**
   * Parses post contact successful response
   */
  _parsePostContactResponse(newContact) {
    if (this.c(newContact, 'contactId')) {
      return {
        alias: this.c(newContact, 'alias'),
        contactId: this.c(newContact, 'contactId'),
        bank: {
          name: this.c(this.contactDetail, 'bank.name')
        },
        number: this.c(this.contactDetail, 'displayNumber'),
        name: this.c(newContact, 'person.firstName'),
        savedContact: true
      };
    }
  }

  /**
   * Sets body that will be sent to add product to a saved contact
   */
  aliasInUseModalOnClickAccept() {
    const body = {
      number: this.c(this._responseReceivers, 'number'),
      numberType: {
        id: this.c(this._responseReceivers, 'numberType.id'),
        name: this.c(this._responseReceivers, 'numberType.name')
      },
      bank: {
        id: this.c(this._responseReceivers, 'bank.id'),
        name: this.c(this._responseReceivers, 'bank.name')
      },
      productType: {
        id: this.c(this._responseReceivers, 'productType.id'),
        name: this.c(this._responseReceivers, 'productType.name')
      },
      specificProductType: {
        id: this.c(this._responseReceivers, 'specificProductType.id'),
        name: this.c(this._responseReceivers, 'specificProductType.name')
      }
    };
    this.$.contactsBookDm.postContactsProduct({
      contactId: this.c(this.savedContactDetail, 'contactId'),
      body: body,
    });
  }

  /**
   * Dispatches events after adding a new contact, for messages to be displayed on screen
   */
  _postContactsProductSuccess() {
    this._getSavedContacts();
    this._fire('successful-post-contact-product');
  }

  /**
   * Method that sends request body to exchangeRate if amount is > 0
   * @param {Object} detail
   */
  inputFocusOutExchangeRates(detail = {}) {
    if (detail && this.c(detail, 'localCurrency')) {
      this._inputAmount = this.c(detail, 'amount');
      this._fire('set-input-amount', this._inputAmount);
      if (this.c(detail, 'amount') > 0) {
        this.$.exchangeRatesDm.calculateExchangeRates(this._setCalculateExchangeRatesBody(detail));
        this._openControlVeil();
        this._isQuotationDone = true;
      } else {
        this._fire('clean-foreign-currency');
      }
    }
  }

  /**
   * Sets detail body used in exchangeRates
   */
  _setCalculateExchangeRatesBody(detail) {
    return {
      sender: {
        id: this.clientIdSettlement,
        contract: {
          id: this.clientIdSettlement,
          number: this.c(this.selectedSender, 'description.value'),
          numberType: {
            id: this.c(this.selectedSender, 'numberType.id'),
            name: this.c(this.selectedSender, 'numberType.name')
          },
          contractType: {
            id: this.c(this.selectedSender, 'contractType.id')
          }
        }
      },
      receiver: {
        id: this.clientIdSettlement,
        contract: {
          id: this.clientIdSettlement,
          number: this.c(this.selectedReceiver, 'description.value'),
          numberType: {
            id: this.c(this.selectedReceiver, 'numberType.id')
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
        exchangeRate: {
          baseCurrency: this.c(this.selectedSender, 'primaryAmount.currency'),
          targetCurrency: this.c(this.selectedReceiver, 'primaryAmount.currency'),
          operationType: {
            id: 'SALE'
          },
          settlementType: {
            id: 'SETTLEMENT_ACCOUNT'
          },
        },
        isInternationalOperation: 'N',
        tenor: 'T',
        function: '723'
      },
      sentMoney: {
        credit: {
          amount: this.c(detail, 'amount'),
          currency: this.originCurrency,
        }
      }
    };
  }

  /**
   * Method that receives succesful response of exchangeRates service and sets values to be displayed on screen
   * @param {Object} response
   */
  _successCalculateExchangeRates(response) {
    if (this.c(response, 'detail')) {
      this._closeControlVeil();
      this.set('_parsedExchangeRatesDetail', this._parseExchangeRatesDetail(this.c(response, 'detail.data')));
      this._fire('set-successful-exchange-rates-response', this._parsedExchangeRatesDetail);
    }
  }

  /**
   * Parses calculate exchange rates successful response
   */
  _parseExchangeRatesDetail(exchangeRatesDetail) {
    if (this.c(exchangeRatesDetail, 'sentMoney')) {
      return {
        sentMoney: this.c(exchangeRatesDetail, 'sentMoney'),
        references: this.c(exchangeRatesDetail, 'references'),
        creationDate: this.c(exchangeRatesDetail, 'creationDate'),
        preferenceRate: this.c(exchangeRatesDetail, 'preferenceRate'),
        operation: this.c(exchangeRatesDetail, 'operation')
      };
    }
  }

  /**
   * Sets properties to alert modal when failed response from exchangeRates service
   */
  _failedResponseCalculateExchangeRates() {
    this._closeControlVeil();
    let config = {
      title: this.t('glomo-card-detail-manager-activation-error-max-retries-title'),
      acceptBtLabel: this.t('glomo-transfer-error-calculate-exchange-rates-accept'),
      cancelBtLabel: '',
      className: '',
      srcImage: this.errorAlertImagePath,
      message: this.t('glomo-transfer-error-calculate-exchange-rates-description'),
      messageClass: '',
      fullModal: true
    };
    let retryErrorData = {
      errorId: 'INFORMATION-MODAL-BACK-TO-START',
      errorType: 'operative',
      retryConfig: config,
      callConfig: config
    };
    this._fire('retry-error', Object.assign({retryErrorData}));
  }

  /**
   * Receives concept and reference and sets concept property
   * @param {Object} data
   */
  getConcept(data = {}) {
    const {
      concept,
      reference
    } = data;
    this.set('_concept', {
      concept: concept || '',
      reference: reference || null
    });
    this._isAbandonSummary = true;
  }

  /**
   * @description Observes if transfer amount has been modified
   * @param {Object} newVal
   * @param {Object} oldVal
   */
  _onChangedFinalAmount(newVal = {}, oldVal = {}) {
    const amount = this.get('amount', this.finalAmountSelected) || {};
    let validations = [Object.keys(amount).length, Object.keys(this.conceptValidated).length, this._reviewAndAuthorizeCalled];
    let completion = validations.reduce((acc, currentValue) => acc && currentValue, true);
    if (!completion) {
      return;
    }
    this.reviewAndAuthorize();
  }
  /**
   * The own-transfer service is consumed with the property simulated = true, to consult the commission of a transfer
   */
  reviewAndAuthorize() {
    this._reviewAndAuthorizeCalled = true;
    if (this.c(this.selectedSender, 'subProductType')  === 'CREDIT_CARD') {
      const source = {
        contract: {
          number: this.c(this.selectedSender, 'description.value'),
          numberType: {
            id: this.c(this.selectedSender, 'numberType.id'),
            name: this.c(this.selectedSender, 'numberType.name')
          }
        }
      };
      const destination = {
        contract: {
          number: this.c(this.selectedReceiver, 'number'),
          numberType: {
            id: this.c(this.selectedReceiver, 'numberType.id'),
            name: this.c(this.selectedReceiver, 'numberType.name')
          }
        }
      };
      const money = this.c(this.finalAmountSelected, 'amount.amount');
      const sendCurrency = this.c(this.finalAmountSelected, 'amount.currency') || 'MXN';
      const concept = {
        concept: this.c(this.conceptValidated, 'concept')
      };
      this.$.dm.makeOwnTransferSimulation({ source, destination, money, sendCurrency, concept });
      this._openControlVeil();
    } else {
      this._responseTotalFees({});
    }
    this._fire('amount-and-currency-selected', {
      transferType: this.transferType,
      amount: this.c(this.finalAmountSelected, 'amount.amount'),
      currency: this.c(this.finalAmountSelected, 'amount.currency') || 'MXN'
    });
  }

  /**
   * A service response is received and it is validated if it shows the collection of a transfer commission
   * @param {Object} response
   */
  _responseTotalFees(response) {
    let defaultMock = {
      amount: {
        amount: this.c(this.finalAmountSelected, 'amount.amount'),
        currency: this.c(this.finalAmountSelected, 'amount.currency')
      },
      status: {
        id: 'SETTLED',
        name: 'Settled'
      },
      totalFees: {
        text: this.t('glomo-transfer-total-fees-text'),
        amount: 0.00,
        currency: 'MXN'
      }
    };
    if (this.c(response, 'detail')) {
      let fees = this.c(response, 'detail.value.fees.0');
      let itemize = this.c(response, 'detail.value.itemizeFees.0');
      defaultMock = Object.assign({}, defaultMock, {
        totalFees: {
          text: this.t('glomo-transfer-total-fees-text'),
          amount: this.c(itemize, 'amount.amount'),
          currency: this.c(itemize, 'amount.currency')
        },
        fees: [ {
          feeType: {
            id: this.c(fees, 'feeType.id'),
            name: this.c(fees, 'feeType.name')
          },
          feeAmount: {
            amount: this.c(fees, 'feeAmount.amount'),
            currency: this.c(fees, 'feeAmount.currency')
          }
        } ],
      });
    } else {
      defaultMock = Object.assign({}, defaultMock, {
        fees: [ {
          feeType: {
            id: 'TOTAL_FEE',
            name: 'Total fee',
          },
          feeAmount: {
            amount: 0.00,
            currency: 'MXN'
          }
        } ]
      });
    }
    this.set('_totalFees', defaultMock);
    this._fire('set-data-summary-review-and-authorize', defaultMock);
    this._closeControlVeil();
    this.currentTransferSummary = defaultMock;
  }

  /**
   * It is defined what type of service is consumed, in order to make a transfer
   * @deprecated use `processTransferOperation` instead, keept for compatibility reasons
   */
  transfersSuccesPage() {

    const transferTypeMethod = {
      INTERNAL_TRANSFERS: '_makeInternalTransfer',
      INTERBANK_TRANSFERS: '_makeInterbankTransfer',
    };
    const typeMethod = transferTypeMethod[this.transferType];
    if (typeMethod) {
      this[typeMethod]();
    } else {
      const ownTransferType = this.exchangeRatesFlag ? '_makeSettlementTransferCurrency' : '_makeOwnTransferRequest';
      this[ownTransferType]();
    }
    this._openControlVeil();
  }

  /**
   * start the process to request a new tranfer operation, and define what kind of service will be consumed
   * eg. settlement, internal, interbak
   */
  processTransferOperation() {
    this._openControlVeil();
    switch (this.transferType) {
      case 'INTERNAL_TRANSFERS':
        this._makeInternalTransfer();
        break;
      case 'INTERBANK_TRANSFERS':
        this._pendingTranferAvailability = true;
        this._fire('transfer-availavility-requested');
        break;
      default:
        if (this.exchangeRatesFlag) {
          this._makeSettlementTransferCurrency();
        } else {
          this._makeOwnTransferRequest();
        }
    }
  }

  /**
   * Request an intebank transfer with a given spei status, if spei availability has been requested
   * but fails, user must be notifyed. note: process tranfer operation is always needed to perform
   * a interban transfer
   * @param {Object} avalabilityStatus spei availability status from bbva banxico/spei-availability service
   */
  requestInterbankTransfer(avalabilityStatus) {
    if (!this._pendingTranferAvailability) {
      return;
    }
    this._pendingTranferAvailability = false;

    if (avalabilityStatus.id  !== 'Active') {
      this.notifyInterbankTransferUnavailable();
      return;
    }

    this._fire('transfer-unavailability-status', false);
    this._makeInterbankTransfer();
  }

  /**
   * notify an error while spei availability has been requested
   */
  notifyInterbankTransferUnavailable() {
    this._closeControlVeil();
    const summary = Object.assign({}, this.currentTransferSummary, {
      message: {
        position: 'before',
        class: 'margin-l',
        icon: 'coronita:info',
        message: 'glomo-transfer-generate-interbank-unavailible-status-label',
        type: 'warning',
      }
    });
    this._fire('transfer-unavailible-summary', summary);
    this._fire('transfer-unavailability-status', true);
  }

  /**
   * Data used to consume the service of an internal transfer is collected
   */
  _makeInternalTransfer() {
    const source = {
      contract: {
        number: this._getDescription(this.selectedSender),
        numberType: {
          id: this._getNumberTypeId(this.selectedSender),
          name: this._getNumberTypeName(this.selectedSender)
        },
        contractType: {
          id: this._getContractTypeId(this.selectedSender),
          name: this._getContractTypeName(this.selectedSender)
        }
      },
      primaryAmount: {
        currency: this._getPrimaryAmountCurrency(this.selectedSender),
      }
    };
    const destination = {
      alias: this.c(this.contactDetail, 'alias'),
      name: this._getAccountCurrencyType(this.contactDetail),
      number: this._getCompleteNumber(this.contactDetail) || this._getDisplayNumber(this.contactDetail),
      productType: {
        id: this._getProductTypeId(this.contactDetail),
        name: this._getProductTypeName(this.contactDetail)
      },
      numberType: {
        id: this._getProductNumberTypeId(this.contactDetail),
        name: this._getProductNumberTypenName(this.contactDetail)
      },
      contractType: {
        id: this._getProductTypeId(this.contactDetail),
        name: this._getProductTypeName(this.contactDetail)
      },
      bank: {
        id: this._getBankId(this.contactDetail),
        name: this._getBankName(this.contactDetail)
      }
    };
    const money = this._getAmount(this.finalAmountSelected);
    const sendCurrency = this._getAmountCurrency(this.finalAmountSelected);
    const concept = {
      concept: this._getTransfersConcept(this.conceptValidated),
      reference: this._getReference(this._concept)
    };
    this.$.dm.makeInternalTransfer({ source, destination, money, sendCurrency, concept });
    this._fire('transfers-otp');
  }

  /**
   * Evaluates stand in mode status to fire new recipient event or blocking modal config
   * @event stand-in-bank-transfers-modal
   * @event transfers-dm-modal-config
   * @event add-new-recipient
   */
  addNewRecipient() {
    if (this.standIn) {
      this._fire('stand-in-bank-transfers-modal');
      this._fire('transfers-dm-modal-config', this._createStandInModal('newRecipient'));
    } else {
      this._fire('add-new-recipient', true);
    }
  }

  /**
   * Data is collected used to consume the service of an interbank transfer
   */
  _makeInterbankTransfer() {
    const source = {
      contract: {
        number: this._getDescription(this.selectedSender),
        title: this.t('glomo-transfer-make-interbank-transfer-title'),
        numberType: {
          id: this._getNumberTypeId(this.selectedSender),
          name: this._getNumberTypeName(this.selectedSender)
        },
        contractType: {
          id: this._getContractTypeId(this.selectedSender),
          name: this._getContractTypeName(this.selectedSender)
        }
      },
      primaryAmount: {
        currency: this._getPrimaryAmountCurrency(this.selectedSender),
      }
    };
    const destination = {
      alias: this.c(this.contactDetail, 'name'),
      name: this._getAccountCurrencyType(this.contactDetail),
      number: this._getDisplayNumber(this.contactDetail),
      productType: {
        id: this._getProductTypeId(this.contactDetail),
        name: this._getProductTypeName(this.contactDetail)
      },
      numberType: {
        id: this._getProductNumberTypeId(this.contactDetail),
        name: this._getProductNumberTypenName(this.contactDetail)
      },
      contractType: {
        id: this._getProductTypeId(this.contactDetail),
        name: this._getProductTypeName(this.contactDetail)
      },
      specificProductType: {
        id: this.c(this.contactDetail, 'products.0.specificProductType.id'),
        name: this.c(this.contactDetail, 'products.0.specificProductType.name')
      },
      bank: {
        id: this._getBankId(this.contactDetail),
        name: this._getBankName(this.contactDetail)
      },
    };
    const money = this._getAmount(this.finalAmountSelected);
    const sendCurrency = this._getAmountCurrency(this.finalAmountSelected);
    const concept = {
      concept: this._getTransfersConcept(this._concept),
      reference: this._getReference(this._concept)
    };

    const transferDetails = { source, destination, money, sendCurrency, concept };

    if (this.standIn || (this.featureFlagCollection['glomo.codi.transfersPaymentsHub'] && this.get('products.0.specificProductType.id', this.contactDetail) !== 'CREDIT_CARD')) {
      transferDetails.reason = 'ordinary-interbank-transfer';
    }

    this.transferApiVersion = '0';
    this.$.dm.makeInterbankTransfer(transferDetails);
    this._fire('transfers-otp');
  }

  /**
   * Get the number of a property
   * @param {Object} selectedReceiver
   */
  _getNumberReceiver(selectedReceiver) {
    return this.c(selectedReceiver, 'number');
  }

  /**
   * Get the numberType id of a property
   * @param {Object} selectedReceiver
   */
  _getNumberTypeReceiver(selectedReceiver) {
    return this.c(selectedReceiver, 'numberType.id');
  }

  /**
   * Get the description value of a property
   * @param {Object} selectedSender
   */
  _getDescription(selectedSender) {
    return this.c(selectedSender, 'description.value');
  }

  /**
   * Get the numberType id of a property
   * @param {Object} selectedSender
   */
  _getNumberTypeId(selectedSender) {
    return this.c(selectedSender, 'numberType.id');
  }

  /**
   * Get the numberType name of a property
   * @param {Object} selectedSender
   */
  _getNumberTypeName(selectedSender) {
    return this.c(selectedSender, 'numberType.name');
  }

  /**
   * Get the contractType id of a property
   * @param {Object} selectedSender
   */
  _getContractTypeId(selectedSender) {
    return this.c(selectedSender, 'contractType.id');
  }

  /**
   * Get the contractType name of a property
   * @param {Object} selectedSender
   */
  _getContractTypeName(selectedSender) {
    return this.c(selectedSender, 'contractType.name');
  }

  /**
   * Get the primaryAmount currency of a property
   * @param {Object} selectedSender
   */
  _getPrimaryAmountCurrency(selectedSender) {
    return  this.c(selectedSender, 'primaryAmount.currency');
  }

  /**
   * Get the accountCurrencyType name of a property
   * @param {Object} contactDetail
   */
  _getAccountCurrencyType(contactDetail) {
    return this.c(contactDetail, 'accountCurrencyType.name').trim();
  }

  /**
   * Get the completeNumber of a property
   * @param {Object} contactDetail
   */
  _getCompleteNumber(contactDetail) {
    return this.get('completeNumber', contactDetail);
  }

  /**
   * Get the displayNumber of a property
   * @param {Object} contactDetail
   */
  _getDisplayNumber(contactDetail) {
    return this.c(contactDetail, 'displayNumber');
  }

  /**
   * Get the numberType id of a property
   * @param {Object} contactDetail
   */
  _getProductNumberTypeId(contactDetail) {
    return this.c(contactDetail, 'products.0.numberType.id');
  }

  /**
   * Get the numberType name of a property
   * @param {Object} contactDetail
   */
  _getProductNumberTypenName(contactDetail) {
    return this.c(contactDetail, 'products.0.numberType.name');
  }

  /**
   * Get the productType id of a property
   * @param {Object} contactDetail
   */
  _getProductTypeId(contactDetail) {
    return this.c(contactDetail, 'products.0.productType.id');
  }

  /**
   * Get the productType name of a property
   * @param {Object} contactDetail
   */
  _getProductTypeName(contactDetail) {
    return this.c(contactDetail, 'products.0.productType.name');
  }

  /**
   * Get the bank id of a property
   * @param {Object} contactDetail
   */
  _getBankId(contactDetail) {
    return this.c(contactDetail, 'bank.id');
  }

  /**
   * Get the bank name of a property
   * @param {Object} contactDetail
   */
  _getBankName(contactDetail) {
    return this.c(contactDetail, 'bank.name').trim();
  }

  /**
   * Get the total amount of a property
   * @param {Object} amountSelected
   */
  _getAmount(amountSelected) {
    return this.c(amountSelected, 'amount.amount');
  }

  /**
   * Get the amount currency of a property
   * @param {Object} amountSelected
   */
  _getAmountCurrency(amountSelected) {
    return this.c(amountSelected, 'amount.currency') || 'MXN';
  }

  /**
   * Get the concept of a property
   * @param {Object} concept
   */
  _getTransfersConcept(concept) {
    return this.c(concept, 'concept');
  }

  /**
   * Get the reference of a property
   * @param {Object} concept
   */
  _getReference(concept) {
    return this.c(concept, 'reference');
  }

  /**
   * Sets request body to make settlement transfers
   */
  _makeSettlementTransferCurrency() {
    this._fire('reset-timer-before-transfer');
    const channel = {
      id: 'MG'
    };

    const branch = {
      id: '0835'
    };

    const receiver = {
      id: this.clientIdSettlement,
      contract: {
        number: this.c(this.selectedReceiver, 'description.value'),
      }
    };

    const sender = {
      id: this.clientIdSettlement,
      contract: {
        number: this.c(this.selectedSender, 'description.value')
      }
    };

    const moneyTransfers = [
      {
        amount: this.c(this._parsedExchangeRatesDetail, 'sentMoney.credit.amount'),
        currency: this.c(this._parsedExchangeRatesDetail, 'sentMoney.credit.currency')
      }
    ];

    const transferDate = this.c(this._parsedExchangeRatesDetail, 'creationDate');

    const references = [
      {
        id: 'TRACKING',
        value: this.c(this._parsedExchangeRatesDetail, 'operation.id')
      }
    ];

    const exchangeRate = {
      baseCurrency: this._getPrimaryAmountCurrency(this.selectedSender),
      targetCurrency: this.c(this.selectedReceiver, 'primaryAmount.currency'),
      transferDate: this.c(this._parsedExchangeRatesDetail, 'creationDate'),
    };

    const targetUserId = this.clientIdSettlement;

    const additionalInformation = {
      folio: '11111111'
    };

    const body = {
      channel,
      branch,
      receiver,
      sender,
      moneyTransfers,
      transferDate,
      references,
      exchangeRate,
      targetUserId,
      additionalInformation
    };
    this._fire('request-exchange-settlement', body);
  }

  /**
   * Data used to consume the service of an own transfer is collected
   */
  _makeOwnTransferRequest() {
    const source = {
      contract: {
        number: this._getDescription(this.selectedSender),
        numberType: {
          id: this._getNumberTypeId(this.selectedSender),
          name: this._getNumberTypeName(this.selectedSender)
        }
      },
      primaryAmount: {
        currency: this.c(this.selectedSender, 'currency.primaryAmount'),
      }
    };

    const destination = {
      contract: {
        number: this._getNumberReceiver(this.selectedReceiver),
        numberType: {
          id: this._getNumberTypeReceiver(this.selectedReceiver),
          name: this.c(this.selectedReceiver, 'numberType.name')
        }
      }
    };

    const money = this._getAmount(this.finalAmountSelected);

    const sendCurrency = this._getAmountCurrency(this.finalAmountSelected);
    const concept = {
      concept: this._getTransfersConcept(this.conceptValidated),
      reference: this._getReference(this._concept)
    };
    this.$.dm.makeOwnTransfer({source, destination, money, sendCurrency, concept});
  }

  /**
   * Gets base currency
   */
  _getBaseCurrency() {
    return this.c(this._parsedExchangeRatesDetail, 'preferenceRate.amount.currency') === this.originCurrency ? this.foreignCurrency : this.originCurrency;
  }

  /**
   * Validates entry point and resets entry point page according to it
   */
  _resetEntryPoint() {
    if (this.entryPoint === 'account') {
      this._fire('reset-account-detail', {
        productType: this.t('glomo-transfer-reset-accounts'),
        productNumber: this.c(this.selectedSender, 'description.value')
      });
    } else {
      this._fire('reset-dashboard');
    }
  }

  /**
   * Receives a service response and the data sent to the methods where the payload is generated for the successful screen is mapped
   * @param {Object} response
   * @event transfer-success-data
   * @event set-transfers-success-data
   * @event redirect-success-to-expenses-group
   */
  parsedResponseTransfer(response) {
    const parsedResponse = this.exchangeRatesFlag ? {detail: {value: response}} : response;
    if (this.c(parsedResponse, 'detail')) {
      const responseTransfer = this.c(parsedResponse, 'detail.value');
      this._fire('transfers-success-data', {});
      let commonData = {
        date: this.exchangeRatesFlag ? this.c(responseTransfer, 'transferDate') : this.c(responseTransfer, 'date'),
        operationNumber: this.c(responseTransfer, 'operationNumber'),
        concept: {
          concept: this.transferType === 'INTERBANK_TRANSFERS' ? this.c(this._concept, 'concept') : this.c(this.conceptValidated, 'concept'),
        },
        reference: {
          reference: this.c(this._concept, 'reference')
        },
        references: this.get('references', responseTransfer),
        transferType: this.transferType,
        email: this.accountEmail,
        senderProductTitle: this.c(this.selectedSender, 'productTitle'),
        senderSubProductType: this.c(this.selectedSender, 'subProductType'),
        senderAvatarImg: this.c(this.selectedSender, 'imgSrc', this._getAvatarImageTransfer()),
        receiverProductTitle: this.c(this.selectedReceiver, 'productTitle'),
        receiverSubProductType: this.c(this.contactDetail, 'products.0.specificProductType.id', this.c(this.selectedReceiver, 'subProductType')),
        receiverAvatarImg: this.c(this.selectedReceiver, 'imgSrc'),
      };

      if (this.exchangeRatesFlag) {
        commonData = Object.assign({}, commonData, this._parseExchangeRatesResponse(responseTransfer));
      } else {
        commonData = Object.assign({}, commonData, this._parseLocalResponse(responseTransfer));

        const transferTypeMethod = {
          INTERNAL_TRANSFERS: '_parseInternalAditionalInformation',
          INTERBANK_TRANSFERS: '_parseInterbankAditionalInformation',
          OWN_TRANSFERS: '_parseOwnAditionalInformation'
        };

        const typeMethod = transferTypeMethod[this.transferType] || transferTypeMethod.OWN_TRANSFERS;
        commonData = Object.assign({}, commonData, this[typeMethod](responseTransfer));
      }

      this._resetEntryPoint();
      this._fire('set-transfers-success-data', {
        page: 'transfersSuccess',
        params: {
          detail: commonData,
          persistData: this.transfersOperationData,
          fromPage: 'transfersSuccess',
        }
      }
      );
      if (this.comeFromExpensesGroup) {
        this._fire('redirect-success-to-expenses-group');
        this.comeFromExpensesGroup = false;
      }
    }
  }

  /**
   * Generates a mapping with foreign currency transfer data
   * @param {Object} response
   */
  _parseExchangeRatesResponse(response) {
    let baseCurrency = this._getBaseCurrency();
    let quoteCurrency = baseCurrency === this.originCurrency ? this.foreignCurrency : this.originCurrency;
    return {
      title: this.t('glomo-transfer-parsed-response-transfer-title'),
      origin: {
        product: {
          id: this.c(this.selectedSender, 'id')
        },
        number: this.c(this.selectedSender, 'number')
      },
      topInfo: [],
      amount: {
        amount: this._inputAmount,
        currency: this.originCurrency
      },
      chargeAmount: {
        amount: this._inputAmount,
        currency: this.originCurrency
      },
      operations: [],
      destination: {
        product: {
          id: this.c(this.selectedReceiver, 'id')
        },
        number: this.c(this.selectedReceiver, 'number')
      },
      fees: [
        {
          text: this.t('glomo-transfer-parsed-response-transfer-fees-text'),
          amount: 0.00,
          currency: 'MXN'
        }
      ],
      exchangeRate: {
        key: this.t('cells-successful-response-exchange-rates'),
        values: {
          baseCurrencySymbol: `1 ${baseCurrency} = ${this.relativeValue} ${quoteCurrency}`,
          targetCurrencySymbol: baseCurrency,
          exchangeRate: this.relativeValue,
        },
        amounts: [
          {
            key: this.t('glomo-transfer-exchange-rate-local-amount'),
            amount: this._inputAmount,
            currency: this.originCurrency
          },
          {
            key: this.t('glomo-transfer-exchange-rate-foreign-currency-amount'),
            amount: this.totalAmount,
            currency: this.foreignCurrency
          }
        ]
      },
      id: this.c(response, 'id'),
      exchangeRatesFlag: true
    };
  }

  /**
   * Generates a mapping with local currency transfer data
   * @param {Object} response
   */
  _parseLocalResponse(response) {
    return {
      title: this.t('glomo-transfer-make-interbank-transfer-title'),
      origin: {
        product: {
          id: this.c(response, 'origin.product.id')
        },
        number: this.c(response, 'origin.number')
      },
      topInfo: this.c(response, 'topInfo'),
      amount: {
        amount: this.c(response, 'amount.amount'),
        currency: this.c(response, 'amount.currency')
      },
      chargeAmount: {
        amount: this.c(response, 'chargeAmount.amount'),
        currency: this.c(response, 'chargeAmount.currency')
      },
      exchangeRate: {
        key: this.c(response, 'exchangeRate.key'),
        values: this.c(response, 'exchangeRate.values'),
        amounts: [
          {
            key: this.c(response, 'exchangeRate.amounts.0.key'),
            amount: this.c(response, 'exchangeRate.amounts.0.amount'),
            currency: this.c(response, 'exchangeRate.amounts0.currency')
          },
          {
            key: this.c(response, 'exchangeRate.amounts.1.key')
          }
        ]
      },
      operations: this.c(response, 'operations'),
    };
  }

  /**
   * The playload gets the destination product id from a service response
   * @param {Object} response
   */
  _getDestinationProduct(response) {
    return this.c(response, 'destination.product.id');
  }

  /**
   * The playload gets the destination number from a service response
   * @param {Object} response
   */
  _getDestinationNumber(response) {
    return this.c(response, 'destination.number');
  }

  /**
   * The playload gets the destination name from a service response
   * @param {Object} contactDetail
   */
  _getDestinationAlias(contactDetail) {
    return this.c(contactDetail, 'name');
  }

  /**
   * The playload gets the destination bank id from a service response
   * @param {Object} contactDetail
   */
  _getDestinationBankId(contactDetail) {
    return this.c(contactDetail, 'bank.id');
  }

  /**
   * The playload gets the destination bank name from a service response
   * @param {Object} contactDetail
   */
  _getDestinationBankName(contactDetail) {
    return this.c(contactDetail, 'bank.name');
  }

  /**
   * The playload gets the fees text from a service response
   * @param {Object} totalFees
   */
  _getFeesText(totalFees) {
    return this.c(totalFees, 'totalFees.text');
  }

  /**
   * The playload gets the fees amount from a service response
   * @param {Object} totalFees
   */
  _getFeesAmount(totalFees) {
    return this.c(totalFees, 'fees.0.feeAmount.amount');
  }

  /**
   * The playload gets the fees currency from a service response
   * @param {Object} totalFees
   */
  _getFeesCurrency(totalFees) {
    return this.c(totalFees, 'fees.0.feeAmount.currency');
  }

  /**
   * Maps additional information to the transfer type internal
   * @param {Object} response
   */
  _parseInternalAditionalInformation(response) {
    return {
      destination: {
        product: {
          id: this._getDestinationProduct(response)
        },
        number: this._getDestinationNumber(response),
        alias: this._getDestinationAlias(this.contactDetail),
        bank: {
          id: this._getDestinationBankId(this.contactDetail),
          name: this._getDestinationBankName(this.contactDetail)
        }
      },
      fees: [
        {
          text: this._getFeesText(this._totalFees),
          amount: this._getFeesAmount(this._totalFees),
          currency: this._getFeesCurrency(this._totalFees)
        }
      ],
      id: this.c(response, 'id')
    };
  }

  /**
   * Maps additional information to the transfer type interbank
   * @param {Object} response
   */
  _parseInterbankAditionalInformation(response) {
    return {
      destination: {
        product: {
          id: this._getDestinationProduct(response),
          name: this.c(response, 'destination.product.name')
        },
        number: this._getDestinationNumber(response),
        description: this.c(response, 'destination.description'),
        alias: this._getDestinationAlias(this.contactDetail),
        bank: {
          id: this._getDestinationBankId(this.contactDetail),
          name: this._getDestinationBankName(this.contactDetail)
        }
      },
      fees: [
        {
          text: this._getFeesText(this._totalFees),
          amount: this._getFeesAmount(this._totalFees),
          currency: this._getFeesCurrency(this._totalFees)
        }
      ]
    };
  }

  /**
   * Maps additional information to the transfer type Own
   * @param {Object} response
   */
  _parseOwnAditionalInformation(response) {
    return {
      destination: {
        product: {
          id: this._getDestinationProduct(response)
        },
        number: this._getDestinationNumber(response)
      },
      fees: [
        {
          text: this._getFeesText(this._totalFees),
          amount: this._getFeesAmount(this._totalFees),
          currency: this._getFeesCurrency(this._totalFees)
        }
      ],
      id: this.c(response, 'id')
    };
  }

  /**
   * Wait for the _mainTransfersDetail method to be executed, to fire an event with the response
   * @param {Object} response
   */
  async requestOperationNumber(response = {}) {
    await this._mainTransfersDetail(response);
    this._fire('successful-operation-number', response);
  }

  /**
   * It is decided what type of payload will be generated for the success screen
   * @param {Object} response
   */
  _mainTransfersDetail(response) {
    if (response) {
      this.transferTypeFx = this.get('detail.transferType', response);
      this.currencyTypeFx = this.get('persistData.currency', response);
      this._fire('successful-transfers-data', this.c(response, 'persistData'));
      const detailTransferType = this.get('detail.transferType', response);
      const transferTypeMethod = {
        INTERNAL_TRANSFERS: '_generateInternalTransferResponse',
        INTERBANK_TRANSFERS: '_generateInterbankTransferResponse',
        OWN_TRANSFERS: '_generateOwnTransferResponse'
      };

      if (this.standIn) {
        transferTypeMethod.INTERBANK_TRANSFERS = '_generatePendingTransferReceipt';
      }

      const typeMethod = transferTypeMethod[detailTransferType] || transferTypeMethod.OWN_TRANSFERS;

      const parseData = this[typeMethod](this.get('detail', response));
      this._transferDetailShare = parseData;
      this._fire('set-parce-data-success', parseData);
      this._closeControlVeil();
    }
  }

  /**
   * The playload gets the transfer id from a success screen
   * @param {Object} detail
   */
  _getTransferId(detail) {
    return this.c(detail, 'id');
  }

  /**
   * The playload gets the date from a success screen
   * @param {Object} detail
   */
  _getTransferDate(detail) {
    const date = this.c(detail, 'date');
    if (!this.fixedTimezone) {
      return date;
    }

    const timeOffset = /-\d{2}:\d{2}$/;
    const match = timeOffset.exec(date);
    return match ? date.slice(0, match.index) : date;
  }

  /**
   * The playload gets the title from a success screen
   * @param {Object} detail
   */
  _getTransferTitle(detail) {
    return this.c(detail, 'title');
  }

  /**
   * The playload gets the origin product id from a success screen
   * @param {Object} detail
   */
  _getOriginProductTransferId(detail) {
    return this.c(detail, 'origin.product.id');
  }

  /**
   * The playload gets the origin number from a success screen
   * @param {Object} detail
   */
  _getOriginTransferNumber(detail) {
    return this.c(detail, 'origin.number');
  }

  /**
   * The playload gets the icon card from a success screen
   */
  _getAvatarImageTransfer() {
    return './images/icon_card.svg';
  }

  /**
   * The playload gets the destination product id from a success screen
   * @param {Object} detail
   */
  _getDestinationProductTransferId(detail) {
    return this.c(detail, 'destination.product.id');
  }

  /**
   * The playload gets the destination number from a success screen
   * @param {Object} detail
   */
  _getDestinationTransferNumber(detail) {
    return this.c(detail, 'destination.number');
  }

  /**
   * The playload gets the fees text from a success screen
   * @param {Object} detail
   */
  _getTransferFeesText(detail) {
    return this.c(detail, 'fees.0.text');
  }

  /**
   * The playload gets the fees amount from a success screen
   * @param {Object} detail
   */
  _getTransferFeesAmount(detail) {
    return this.c(detail, 'fees.0.amount');
  }

  /**
   * The playload gets the fees currency from a success screen
   * @param {Object} detail
   */
  _getTransferFeesCurrency(detail) {
    return this.c(detail, 'fees.0.currency');
  }

  /**
   * The playload gets the total amount from a success screen
   * @param {Object} detail
   */
  _getTransferAmount(detail) {
    return this.c(detail, 'amount.amount');
  }

  /**
   * The playload gets the amount currency from a success screen
   * @param {Object} detail
   */
  _getTransferCurrency(detail) {
    return this.c(detail, 'amount.currency');
  }

  /**
   * The playload gets the email from a success screen
   * @param {Object} detail
   */
  _getTransferEmail(detail) {
    return this.c(detail, 'email');
  }

  /**
   * The playload gets the transfer type from a success screen
   * @param {Object} detail
   */
  _getTransferType(detail) {
    return this.c(detail, 'transferType');
  }

  /**
   * The payload of a transfer between own accounts is generated and sent to the success screen
   * @param {Object} detail
   */
  _generateOwnTransferResponse(detail) {
    if (this.c(detail, 'id')) {
      let parseData = {};
      parseData = {
        id: this._getTransferId(detail),
        date: this._getTransferDate(detail),
        title: this._getTransferTitle(detail),
        amountLabel: this.t('glomo-transfer-generate-own-transfer-response-amount-label'),
        origin: {
          product: {
            id: this._getOriginProductTransferId(detail),
            name: this.c(detail, 'senderProductTitle')
          },
          number: this._getOriginTransferNumber(detail),
          avatar: this.c(detail, 'senderAvatarImg')
        },
        destination: {
          product: {
            id: this._getDestinationProductTransferId(detail),
            name: this.c(detail, 'receiverProductTitle')
          },
          number: this._getDestinationTransferNumber(detail),
          avatar: this.c(detail, 'receiverAvatarImg', this._getAvatarImageTransfer())
        },
        isOriginCardType: true,
        isDestinationCardType: true,
        fees: [
          {
            text: this._getTransferFeesText(detail),
            amount: this._getTransferFeesAmount(detail),
            currency: this._getTransferFeesCurrency(detail)
          }
        ],
        chargeAmount: {
          amount: this._getTransferAmount(detail),
          currency: this._getTransferCurrency(detail),
          class: 'amount-huge-decimals'
        },
        additionalInfo: [
          {
            key: this.t('glomo-transfer-generate-own-transfer-response-additional-info-0-key'),
            value: this.c(detail, 'concept.concept') || this.t('glomo-transfer-generate-own-transfer-response-additional-info-0-value'),
            class: 'not-italic spacing',
          },
          {
            key: this.t('glomo-transfer-generate-own-transfer-response-additional-info-1-key'),
            value: this.c(detail, 'additionalInfomation', this.t('glomo-transfer-generate-own-transfer-response-additional-info-1-value')),
            class: 'spacing',
          },
          {
            key: this.t('glomo-transfer-generate-own-transfer-response-additional-info-2-key'),
            value: this.c(detail, 'operationNumber'),
            class: 'spacing'
          },
          {
            key: this.t('glomo-transfer-generate-own-transfer-response-additional-info-3-key'),
            class: 'spacing-l bold',
            musk: {
              value: this._getTransferEmail(detail),
              chars: 12,
              simbol: '•'
            }
          }
        ],
        operations: [
          {
            label: this.t('glomo-transfer-generate-own-transfer-response-operations-label'),
            id: 'share',
            icon: 'coronita:share'
          }
        ],
        buttons: {
          primary: {
            text: this.t('glomo-transfer-generate-own-transfer-response-buttons-text'),
            action: 'go-to-next'
          },
          secondary: {
            hidden: true
          }
        },
        transferType: this._getTransferType(detail)
      };

      if (this.c(detail, 'senderSubProductType') === 'CREDIT_CARD') {
        this.c(parseData, 'additionalInfo').push(
          {
            message: {
              type: 'info-dark-blue',
              text: this.t('glomo-transfer-generate-interbank-transfer-response-parse-data-additional-info-credit-card'),
              icon: 'coronita:info'
            },
          },
        );
      }

      if (this.c(detail, 'exchangeRatesFlag')) {
        parseData.amount = {
          amount: this._getTransferAmount(detail),
          currency: this._getTransferCurrency(detail)
        };
        parseData.exchangeRate = this.c(detail, 'exchangeRate');
      }
      return parseData;
    }
  }

  /**
   * The payload of an internal transfer is generated and sent to the success screen
   * @param {Object} detail
   */
  _generateInternalTransferResponse(detail) {
    if (this.c(detail, 'id')) {
      let parseData = {};
      parseData = {
        id: this._getTransferId(detail),
        date: this._getTransferDate(detail),
        title: this._getTransferTitle(detail),
        amountLabel: this.t('glomo-transfer-generate-internal-transfer-response-amount-label'),
        origin: {
          product: {
            id: this._getOriginProductTransferId(detail),
            name: this.c(detail, 'senderProductTitle')
          },
          number: this._getOriginTransferNumber(detail),
          avatar: this._getAvatarImageTransfer()
        },
        destination: {
          product: {
            id: this.c(detail, 'destination.product.id'),
            name: this.c(detail, 'destination.alias')
          },
          number: this.c(detail, 'destination.number'),
          avatar: this.t('glomo-transfer-no-image'),
          description: this.t('glomo-transfer-generate-internal-transfer-response-destination-description') + this.c(detail, 'destination.bank.name'),
        },
        isOriginCardType: true,
        fees: [
          {
            text: this._getTransferFeesText(detail),
            amount: this._getTransferFeesAmount(detail),
            currency: this._getTransferFeesCurrency(detail)
          }
        ],
        chargeAmount: {
          amount: this._getTransferAmount(detail),
          currency: this._getTransferCurrency(detail),
          class: 'amount-huge-decimals'
        },
        additionalInfo: [
          {
            key: this.t('glomo-transfer-generate-internal-transfer-response-additional-info-0-key'),
            value: this.c(detail, 'concept.concept')  || this.t('glomo-transfer-generate-internal-transfer-response-additional-info-0-value'),
            class: ' spacing',
          },
          {
            key: this.t('glomo-transfer-generate-internal-transfer-response-additional-info-1-key'),
            value: this.t('glomo-transfer-generate-internal-transfer-response-additional-info-1-value'),
            class: ' spacing',
          },
          {
            key: this.t('glomo-transfer-generate-internal-transfer-response-additional-info-2-key'),
            value: this.c(detail, 'operationNumber'),
            class: ' spacing'
          },
          {
            key: this.t('glomo-transfer-generate-internal-transfer-response-additional-info-3-key'),
            class: 'spacing-l bold',
            musk: {
              value: this._getTransferEmail(detail),
              chars: 12,
              simbol: '•'
            }
          },
        ],
        operations: [
          {
            label: this.t('glomo-transfer-generate-internal-transfer-response-operations-label'),
            id: 'share',
            icon: 'coronita:share'
          }
        ],
        buttons: {
          primary: {
            text: this.t('glomo-transfer-generate-internal-transfer-response-buttons-text'),
            action: 'go-to-next'
          },
          secondary: {
            hidden: true
          }
        },
        transferType: this._getTransferType(detail)
      };
      return parseData;
    }
  }

  /**
   * The payload of an interbank transfer is generated and sent to the success screen
   * @param {Object} detail
   */
  _generateInterbankTransferResponse(detail) {
    if (this.c(detail, 'destination')) {
      let parseData = {};
      if (this.c(detail, 'receiverSubProductType') === 'CREDIT_CARD') {
        parseData = {
          date: this._getTransferDate(detail),
          title: this._getTransferTitle(detail),
          amountLabel: this.t('glomo-transfer-generate-interbank-transfer-response-amount-label'),
          origin: {
            product: {
              id: this._getOriginProductTransferId(detail),
              name: this.c(detail, 'senderProductTitle')
            },
            number: this._getOriginTransferNumber(detail),
            avatar: this._getAvatarImageTransfer()
          },
          destination: {
            product: {
              id: this.c(detail, 'destination.product.id'),
              name: this.c(detail, 'destination.alias')
            },
            number: this.c(detail, 'destination.number'),
            avatar: this.t('glomo-transfer-no-image'),
            description: this.t('glomo-transfer-generate-interbank-transfer-response-destination-description') + this.c(detail, 'destination.bank.name')
          },
          isOriginCardType: true,
          fees: [
            {
              text: this._getTransferFeesText(detail),
              amount: this._getTransferFeesAmount(detail),
              currency: this._getTransferFeesCurrency(detail)
            }
          ],
          chargeAmount: {
            amount: this._getTransferAmount(detail),
            currency: this._getTransferCurrency(detail),
            class: 'amount-huge-decimals'
          },
          topInfo: [
            {
              key: this.t('glomo-transfer-generate-interbank-transfer-response-top-info-0-key'),
              value: this.c(detail, 'concept.concept'),
              class: ' spacing',
            },
            {
              key: this.t('glomo-transfer-generate-interbank-transfer-response-top-info-1-key'),
              value: this.c(detail, 'reference.reference'),
              class: ' spacing',
            },
            {
              key: this.t('glomo-transfer-generate-interbank-transfer-response-top-info-2-key'),
              value: this.t('glomo-transfer-generate-interbank-transfer-response-top-info-2-value'),
              class: ' spacing',
            },
            {
              key: this.t('glomo-transfer-generate-interbank-transfer-response-top-info-3-key'),
              value: this.get('operationNumber', detail),
              class: ' spacing'
            },
            {
              key: this.t('glomo-transfer-generate-interbank-transfer-response-top-info-4-key'),
              class: 'spacing-l bold',
              musk: {
                value: this._getTransferEmail(detail),
                chars: 12,
                simbol: '•'
              }
            }
          ],
          operations: this.operations,
          buttons: {
            primary: {
              text: this.t('glomo-transfer-generate-interbank-transfer-response-buttons-text'),
              action: 'go-to-next'
            },
            secondary: {
              hidden: true
            }
          },
          transferType: this._getTransferType(detail)
        };
      } else {
        this.urlBanxico = this.get('references.1.value', detail);
        parseData = {
          id: this._getTransferId(detail),
          date: this._getTransferDate(detail),
          title: this._getTransferTitle(detail),
          amountLabel: this.t('glomo-transfer-generate-interbank-transfer-response-parse-data-amount-label'),
          origin: {
            product: {
              id: this._getOriginProductTransferId(detail),
              name: this.t('glomo-transfer-generate-interbank-transfer-response-parse-data-origin-name')
            },
            number: this._getOriginTransferNumber(detail),
            avatar: this._getAvatarImageTransfer()
          },
          destination: {
            product: {
              id: this.c(detail, 'destination.product.id'),
              name: this.c(detail, 'destination.alias')
            },
            number: this.c(detail, 'destination.number'),
            avatar: this.t('glomo-transfer-no-image'),
            description: this.t('glomo-transfer-generate-interbank-transfer-response-destination-description') + this.c(detail, 'destination.bank.name')
          },
          isOriginCardType: true,
          fees: [
            {
              text: this._getTransferFeesText(detail),
              amount: this._getTransferFeesAmount(detail),
              currency: this._getTransferFeesCurrency(detail)
            }
          ],
          chargeAmount: {
            amount: this._getTransferAmount(detail),
            currency: this._getTransferCurrency(detail),
            class: 'amount-huge-decimals'
          },
          topInfo: [
            {
              key: this.t('glomo-transfer-generate-interbank-transfer-response-parse-data-top-info-0-key'),
              value: this.c(detail, 'concept.concept'),
              class: ' spacing',
            },
            {
              key: this.t('glomo-transfer-generate-interbank-transfer-response-parse-data-top-info-1-key'),
              value: this.c(detail, 'reference.reference'),
              class: ' spacing',
            },
            {
              key: this.t('glomo-transfer-generate-interbank-transfer-response-parse-data-top-info-2-key'),
              value: this.t('glomo-transfer-generate-interbank-transfer-response-parse-data-top-info-2-value'),
              class: ' spacing',
            },
            {
              key: this.t('glomo-transfer-generate-interbank-transfer-response-parse-data-top-info-3-key'),
              value: this.get('operationNumber', detail),
              class: ' spacing'
            },
            {
              key: this.t('glomo-transfer-generate-interbank-transfer-response-parse-data-top-info-4-key'),
              value: this.get('references.0.value', detail),
              class: 'spacing'
            },
            {
              topInfoLink: {
                key: this.t('glomo-transfer-generate-interbank-transfer-response-parse-data-top-info-5-key'),
                link: this.t('glomo-transfer-generate-interbank-transfer-response-parse-data-banxico-link'),
                class: 'bold spacing'
              },
              class: 'spacing'
            },
            {
              key: this.t('glomo-transfer-generate-interbank-transfer-response-parse-data-top-info-6-key'),
              class: 'spacing-l bold',
              musk: {
                value: this._getTransferEmail(detail),
                chars: 12,
                simbol: '•'
              }
            },
            {
              iconMessageSecondary: {
                type: 'info-dark',
                icon: 'coronita:info',
                message: this.t('glomo-transfer-generate-interbank-transfer-response-parse-data-top-info-8-message'),
                iconSize: {
                  width: 20,
                  height: 20
                }
              },
              class: 'spacing'
            },
            {
              iconMessageSecondary: {
                type: 'info-dark',
                icon: 'coronita:info',
                message: this.t('glomo-transfer-generate-interbank-transfer-response-parse-data-top-info-7-message'),
                link: this.t('glomo-transfer-successful-screen-spei-link'),
                iconSize: {
                  width: 20,
                  height: 20
                }
              },
              class: 'spacing'
            },
          ],
          operations: this.operations,
          buttons: {
            primary: {
              text: this.t('glomo-transfer-generate-interbank-transfer-response-parse-data-buttons'),
              action: 'go-to-next'
            },
            secondary: {
              hidden: true
            }
          },
          transferType: this._getTransferType(detail)
        };
      }
      return parseData;
    }
  }

  /**
   * Creates the config for the receipt of a pending transfer
   * @param {Object} detail
   * @returns {Object} config for transfer receipt
   */
  _generatePendingTransferReceipt(detail) {
    this._fire('pending-movement-header-receipt', 'header--core');
    this._fire('pending-movement-ios-header-receipt-color', 'bbva-core-blue');
    this._fire('pending-movement-animate-receipt', true);
    this._fire('pending-movement-receipt-class', 'common-transfer-data');

    const {
      reference: {
        reference = ''
      } = { reference: '' }
    } = detail;

    const operationId = reference;

    if (operationId) {
      let parseData = {};
      parseData = {
        id: operationId,
        date: this._getTransferDate(detail),
        title: this.t('glomo-transfers-stand-in-success-receipt-title'),
        headerSectionConfig: 'core',
        origin: {
          product: {
            id: this._getOriginProductTransferId(detail),
            name: this.get('senderProductTitle', detail)
          },
          number: this._getOriginTransferNumber(detail),
          avatar: this.get('senderAvatarImg', detail)
        },
        destination: {
          product: {
            id: this._getDestinationProductTransferId(detail),
            name: this.get('destination.alias', detail)
          },
          number: this._getDestinationTransferNumber(detail),
          avatar: this.t('glomo-transfer-no-image')
        },
        isOriginCardType: true,
        isDestinationCardType: false,
        fees: [
          {
            text: 'cells-successful-response-no-fees'
          }
        ],
        chargeAmount: {
          amount: this._getTransferAmount(detail),
          currency: 'MXN',
          class: 'amount-huge-decimals'
        },
        additionalInfo: [
          {
            key: this.t('glomo-transfer-generate-own-transfer-response-additional-info-0-key'),
            value: this.get('concept.concept', detail),
            class: 'spacing not-italic',
          },
          {
            key: this.t('glomo-transfers-stand-in-success-application-number-label'),
            value: operationId,
            class: 'spacing'
          },
          {
            message: {
              type: 'info',
              icon: 'coronita:info',
              text: this.t('glomo-transfers-stand-in-success-spei-notificacion-text-1'),
              iconSize: '24',
              class: 'spacing-bottom-l'
            },
            class: 'spacing'
          },
          {
            message: {
              type: 'info',
              icon: 'coronita:info',
              text: this.t('glomo-transfers-stand-in-success-spei-notificacion-text'),
              iconSize: '24'
            },
            class: 'spacing'
          },
        ],
        buttons: {
          primary: {
            text: this.t('glomo-transfer-generate-own-transfer-response-buttons-text'),
            action: 'go-to-next'
          },
          secondary: {
            hidden: true
          }
        },
        transferType: detail.transferType
      };

      return parseData;
    }
  }

  /**
   * Identifies the type of operation to be performed
   */
  operativeSelected() {
    this._shareTransferVoucher();
  }

  /**
   * It identifies what type of screenshot will be taken
   */
  _shareTransferVoucher() {
    let shareCommonData = {
      date: this.c(this._transferDetailShare, 'date'),
      originAccount: this.c(this._transferDetailShare, 'origin.number'),
      chargeAmount: '',
      localAmount: {
        amount: this.c(this._transferDetailShare, 'chargeAmount.amount'),
        currency: this.c(this._transferDetailShare, 'chargeAmount.currency')
      },
      fees: [
        {
          text: this.c(this._transferDetailShare, 'fees.0.text'),
          amount: this.c(this._transferDetailShare, 'fees.0.amount'),
          currency: this.c(this._transferDetailShare, 'fees.0.currency')
        }
      ],
      templateSelected: 'genericTransferDetail'
    };

    const transferDetailShare = this.c(this._transferDetailShare, 'transferType');

    const detailShareMethod = {
      INTERNAL_TRANSFERS: '_makeShareInternalTransfer',
      INTERBANK_TRANSFERS: '_makeShareInterbankTransfer',
      OWN_TRANSFERS: '_makeShareOwnTransfer'
    };

    const shareMethod = detailShareMethod[transferDetailShare] || detailShareMethod.OWN_TRANSFERS;
    shareCommonData = Object.assign({}, shareCommonData, this[shareMethod]());
    this._fire('share-receipt-capture', shareCommonData);
  }

  /**
   * A payload is generated, which is sent to show the own-transfer screenshot
   */
  _makeShareOwnTransfer() {
    return {
      folioNumber: this.c(this._transferDetailShare, 'additionalInfo.2.value'),
      operationType: this.c(this._transferDetailShare, 'additionalInfo.1.value'),
      beneficiary: {
        name: this.c(this._transferDetailShare, 'destination.product.name'),
        bank: this.t('glomo-transfer-share-own-transfer-bank'),
        number: this.c(this._transferDetailShare, 'destination.number')
      },
      concept: this.c(this._transferDetailShare, 'additionalInfo.0.value'),
      description: this.t('glomo-transfer-share-own-transfer-description'),
      templateSelected: 'genericTransferDetail'
    };
  }

  /**
   * A payload is generated, which is sent to show the internal-transfer screenshot
   */
  _makeShareInternalTransfer() {
    return {
      folioNumber: this.c(this._transferDetailShare.additionalInfo[2], 'value'),
      operationType: this.c(this._transferDetailShare.additionalInfo[1], 'value'),
      beneficiary: {
        name: this.c(this._transferDetailShare, 'destination.product.name'),
        bank: this.c(this._transferDetailShare, 'destination.description'),
        number: this.c(this._transferDetailShare, 'destination.number')
      },
      concept: this.c(this._transferDetailShare, 'additionalInfo.0.value'),
      description: this.t('glomo-transfer-share-internal-transfer-description'),
      templateSelected: 'genericTransferDetail'
    };
  }

  /**
   * A payload is generated, which is sent to show the interbank-transfer screenshot
   */
  _makeShareInterbankTransfer() {
    return {
      folioNumber: this.c(this._transferDetailShare.topInfo[3], 'value'),
      operationType: this.c(this._transferDetailShare.topInfo[2], 'value'),
      beneficiary: {
        name: this.c(this._transferDetailShare, 'destination.product.name'),
        bank: this.c(this._transferDetailShare, 'destination.description'),
        number: this.c(this._transferDetailShare, 'destination.number'),
      },
      concept: this.c(this._transferDetailShare.topInfo[0], 'value'),
      description: this.t('glomo-transfer-share-interbank-transfer-description'),
      trackingCode: this.get('topInfo.4.value', this._transferDetailShare),
      urlBbva: this.t('glomo-transfer-spei-clarification-template-12-text'),
      urlBanxico: this.t(this.primaryExternalLink),
      templateSelected: 'genericTransferDetailInterbank'
    };
  }

  /**
   * Shows information on spei transfers, in a modal
   */
  showSpeiClarification() {
    let clarificationModal = {
      code: 'MODAL-SPEI-CLARIFICATION',
      textWithIcon: 'text-with-icon spacing-left ',
      selectedConfig: {
        className: 'paragraphs__list header--white paragraph_transfer',
        openMaximized: true,
        title: this.t('glomo-transfer-spei-clarification-title'),
        acceptBtLabel: this.t('glomo-transfer-spei-clarification-accept'),
        template: {
          type: 'paragraphs',
          values: [
            {
              title: this.t('glomo-transfer-spei-clarification-template-0-title'),
              class: 'below-paragraph spacing strong'
            },
            {
              text: this.t('glomo-transfer-spei-clarification-template-1-text'),
              class: 'tiled-title normal simple-left-align-pharagraph'
            },
            {
              text: this.t('glomo-transfer-spei-clarification-template-2-text'),
              class: 'tiled-title normal simple-left-align-pharagraph'
            },
            {
              text: this.t('glomo-transfer-spei-clarification-template-3-text'),
              class: 'tiled-title normal simple-left-align-pharagraph'
            },
            {
              text: this.t('glomo-transfer-spei-clarification-template-4-text'),
              class: 'tiled-title normal simple-left-align-pharagraph'
            },
            {
              text: this.t('glomo-transfer-spei-clarification-template-5-text'),
              class: 'tiled-title normal simple-left-align-pharagraph'
            },
            {
              text: this.t('glomo-transfer-spei-clarification-template-6-text'),
              class: 'below-paragraph spacing text-center strong'
            },
            {
              text: this.t('glomo-transfer-spei-clarification-template-7-text'),
              class: 'tiled-title normal simple-left-align-pharagraph'
            },
            {
              text: this.t('glomo-transfer-spei-clarification-template-8-text'),
              class: 'tiled-title normal simple-left-align-pharagraph'
            },
            {
              text: this.t('glomo-transfer-spei-clarification-template-9-text'),
              class: 'tiled-title normal simple-left-align-pharagraph'
            },
            {
              text: this.t('glomo-transfer-spei-clarification-template-10-text'),
              class: 'below-paragraph spacing text-center paragraph_transfer'
            },
            {
              textUrl: 'glomo-transfer-spei-clarification-template-12-text',
              paragraph: this.t('glomo-transfer-spei-clarification-template-11-message'),
              target: '_self',
              urlParagraph: '#',
              urlFlag: true
            }
          ]
        }
      }
    };
    this._fire('transfers-show-spei', clarificationModal);
  }

  /**
   * Dispatches event to go back where the user started, used when click on cancel button in modal errors
   */
  backToStartDashboardOrProductDetail() {
    this._fire('back-to-start-dashboard-product-detail');
  }

  /**
   * Modal generic for prevent to response of default service error
   */
  _showGenericErrorModal() {
    const genericErrorModal = {
      code: 'transfers-generic-error',
      selectedConfig: {
        className: 'full-height-error header--title-grey',
        heroImage: this.errorAlertImagePath,
        hideCloseIcon: false,
        openMaximized: true,
        title: 'glomo-standard-error-handler-header',
        message: 'glomo-standard-error-handler-operation-not-done-message-title',
        acceptBtLabel: 'glomo-additional-card-hiring-manager-exit',
        template: {
          type: 'paragraphs',
          values: [
            { text: 'glomo-transfer-error-generic-message' }
          ]
        }
      }
    };

    this._fire('transfers-dm-modal-config', genericErrorModal);
  }

  /**
   * Receives failed transfer response
   * @param {Object} responseError
   * @event mtu-exception-handler-navigation
   */
  _failedTransfersResponse(responseError) {
    this._closeControlVeil();
    let retryErrorData;
    if (this.c(responseError, 'detail.error-code')) {
      if (this.c(responseError, 'detail.error-code') === 'KNE6666') {
        this.mtuFlag = {
          makePayment: true,
          cancelPayment: false
        };
        this._fire('mtu-exception-handler-navigation', true);
      } else {
        const fullErrorIdAndType = this._getErrorIdAndType(this.c(responseError, 'detail.error-code'));
        if (fullErrorIdAndType) {
          const retryAndCallConfig = this._getErrorAlertConfig(this.get('detail.error-code', responseError));
          retryErrorData = {...fullErrorIdAndType, ...retryAndCallConfig, errorType: 'operative'};
        } else if (this.standIn) {
          retryErrorData = this._getDefaultErrorModal();
        } else {
          this._showGenericErrorModal();
        }
      }
      this._fire('retry-error', Object.assign({retryErrorData}));
    } else if (this.standIn) {
      retryErrorData = this._getDefaultErrorModal();
      this._fire('retry-error', Object.assign({retryErrorData}));
    } else {
      this._showGenericErrorModal();
    }
  }
  /**
   * @description Method to make payment if the user confirm mtu exception
   * @event mtu-make-payment
   */
  mtuMakePayment() {
    if (this.mtuFlag?.makePayment && !this.mtuFlag?.cancelPayment) {
      this._fire('mtu-make-payment', true);
    }
    this.mtuFlag = {};
  }
  /**
   * Returns config for default error modal
   * @returns {Object}
   */
  _getDefaultErrorModal() {
    return {
      errorId: 'transfer-error-default',
      errorType: 'informationNotLoaded',
      retryConfig: {
        srcImage: this.errorAlertImagePath
      },
      callConfig: {
        srcImage: this.errorAlertImagePath,
        acceptBtLabel: 'glomo-transfer-default-error-modal-accept-btn',
        cancelBtLabel: ''
      }
    };
  }

  /**
   * Gets errorId and errorType
   * @param {String} errorCode
   */
  _getErrorIdAndType(errorCode) {
    const errorIdAndType = {
      MGMX001: {
        errorId: 'INFORMATION-MODAL-BACK-TO-START',
      },
      BGE0047: {
        errorId: 'ACCEPT-BACK-ON-SAME-PAGE',
      },
      CNE0234: {
        errorId: 'ACCEPT-BACK-ON-SAME-PAGE',
      },
      CNE0235: {
        errorId: 'ACCEPT-BACK-ON-SAME-PAGE',
      },
      CNE0236: {
        errorId: 'ACCEPT-BACK-ON-SAME-PAGE',
      },
      NLE0023: {
        errorId: 'CALL-BBVA-LINE',
      },
      '604': {
        errorId: 'CALL-BBVA-LINE',
      },
      MPE3502: {
        errorId: 'CALL-BBVA-LINE',
      },
      MPE0976: {
        errorId: 'INFORMATION-MODAL-BACK-TO-START',
      },
      FEE0479: {
        errorId: 'INFORMATION-MODAL-BACK-TO-START',
      },
      FEE9801: {
        errorId: 'INFORMATION-MODAL-BACK-TO-START',
      },
      BGE9919: {
        errorId: 'ACCEPT-BACK-ON-SAME-PAGE',
      },
      MPE1279: {
        errorId: 'ACCEPT-BACK-ON-SAME-PAGE',
      },
      BNE0901: {
        errorId: 'INFORMATION-MODAL-BACK-TO-START',
      },
      BGE1390: {
        errorId: 'INFORMATION-MODAL-BACK-TO-START',
      },
      BGE0639: {
        errorId: 'INFORMATION-MODAL-BACK-TO-START',
      },
      MPE1326: {
        errorId: 'INFORMATION-MODAL-BACK-TO-START',
      },
      BGE0060: {
        errorId: 'ACCEPT-BACK-ON-SAME-PAGE',
      },
      MPE0201: {
        errorId: 'INFORMATION-MODAL-BACK-TO-START',
      },
      MPE0094: {
        errorId: 'INFORMATION-MODAL-BACK-TO-START',
      }
    };

    return errorIdAndType[errorCode];
  }

  /**
   * Gets error alert config
   * @param {String} errorCode
   */
  _getErrorAlertConfig(errorCode) {

    const errorConfig = {
      MGMX001: {
        title: this.t('glomo-standard-error-handler-header'),
        message: this.t('glomo-standard-error-handler-operation-not-done-message-title'),
        acceptBtLabel: this.t('glomo-additional-card-hiring-manager-exit'),
        cancelBtLabel: '',
        template: {
          type: 'paragraphs',
          values: [
            { text: 'glomo-transfer-error-spei-flag-message' }
          ]
        }
      },
      BGE0047: {
        title: this.t('glomo-transfer-error-alert-title'),
        acceptBtLabel: this.t('glomo-transfer-own-transfer-foreign-currency-accept'),
        cancelBtLabel: this.t('glomo-transfer-own-transfer-foreign-currency-cancel'),
        srcImage: this.speedometerHighImagePath,
        message: this.t('glomo-transfer-amount-exceeded-alert-error')
      },
      CNE0234: {
        title: this.t('glomo-transfer-daily-amount-alert-error-title'),
        acceptBtLabel: this.t('glomo-transfer-reduce-amount-accept-label'),
        cancelBtLabel: '',
        srcImage: this.speedometerHighImagePath,
        message: this.t('glomo-transfer-alert-error-message-7', '', {term: 'diario'})
      },
      CNE0235: {
        title: this.t('glomo-transfer-daily-amount-alert-error-title'),
        acceptBtLabel: this.t('glomo-transfer-reduce-amount-accept-label'),
        cancelBtLabel: '',
        srcImage: this.speedometerHighImagePath,
        message: this.t('glomo-transfer-alert-error-message-7', '', {term: 'diario'})
      },
      CNE0236: {
        title: this.t('alert-monthly-consumption'),
        acceptBtLabel: this.t('glomo-transfer-reduce-amount-accept-label'),
        cancelBtLabel: '',
        srcImage: this.speedometerHighImagePath,
        message: this.t('glomo-transfer-alert-error-message-7', '', {term: 'mensual'})
      },
      FEE9801: {
        title: this.t('glomo-transfer-error-alert-title'),
        acceptBtLabel: this.t('glomo-transfer-own-transfer-foreign-currency-cancel'),
        cancelBtLabel: '',
        srcImage: this.speedometerHighImagePath,
        message: this.t('glomo-transfer-error-spei-flag-message')
      },
      NLE0023: {
        title: this.t('glomo-transfer-error-alert-title'),
        acceptBtLabel: this.t('glomo-help-header-title'),
        cancelBtLabel: '',
        srcImage: this.errorAlertImagePath,
        message: this.t('glomo-transfer-alert-error-message-2')
      },
      '604': {
        title: this.t('glomo-transfer-error-alert-title'),
        acceptBtLabel: this.t('glomo-help-header-title'),
        cancelBtLabel: '',
        srcImage: this.errorAlertImagePath,
        message: this.t('glomo-transfer-alert-error-message-2')
      },
      MPE3502: {
        title: this.t('glomo-transfer-error-alert-title'),
        acceptBtLabel: this.t('glomo-help-header-title'),
        cancelBtLabel: '',
        srcImage: this.errorAlertImagePath,
        message: this.t('glomo-transfer-inactive-account-alert-error-message')
      },
      MPE0976: {
        title: this.t('glomo-transfer-overdue-payments-title'),
        acceptBtLabel: this.t('glomo-transfer-alert-error-accept-label'),
        cancelBtLabel: '',
        srcImage: this.errorAlertImagePath,
        message: this.t('glomo-transfer-card-overdue-payments-alert-error-message')
      },
      FEE0479: {
        title: this.t('glomo-transfer-error-alert-title2'),
        acceptBtLabel: this.t('glomo-transfer-alert-error-accept-label'),
        cancelBtLabel: '',
        srcImage: this.errorAlertImagePath,
        message: this.t('glomo-transfer-alert-error-message-3')
      },
      BGE9919: {
        title: this.t('glomo-transfer-error-alert-title'),
        acceptBtLabel: this.t('glomo-transfer-alert-error-accept-label'),
        cancelBtLabel: '',
        srcImage: this.errorAlertImagePath,
        message: this.t('glomo-transfer-amount-exceeded-alert-error-own-transfers')
      },
      MPE1279: {
        title: this.t('glomo-transfer-not-completed-error-alert-title'),
        acceptBtLabel: this.t('glomo-transfer-retry-accept-label'),
        cancelBtLabel: this.t('glomo-transfer-quit-cancel-button'),
        className: '',
        srcImage: this.errorAlertImagePath,
        message: this.t('glomo-transfer-operation-not-completed-error-alert-message')
      },
      BNE0901: {
        title: this.t('glomo-transfer-incorrect-data-title'),
        acceptBtLabel: this.t('glomo-transfer-alert-error-accept-label'),
        cancelBtLabel: '',
        srcImage: this.errorAlertImagePath,
        message: this.t('glomo-transfer-alert-error-message-5')
      },
      BGE1390: {
        title: this.t('glomo-transfer-error-alert-title'),
        acceptBtLabel: this.t('glomo-transfer-alert-error-accept-label'),
        cancelBtLabel: '',
        srcImage: this.errorAlertImagePath,
        message: this.t('glomo-transfer-alert-error-message-4')
      },
      BGE0639: {
        title: this.t('glomo-transfer-error-alert-title'),
        acceptBtLabel: this.t('glomo-transfer-alert-error-accept-label'),
        cancelBtLabel: '',
        srcImage: this.errorAlertImagePath,
        message: this.t('glomo-transfer-account-profile-not-accept-transfer-message')
      },
      MPE1326: {
        title: this.t('alert-card-payment-simulation-error-title'),
        acceptBtLabel: this.t('glomo-transfer-alert-error-accept-label'),
        cancelBtLabel: '',
        srcImage: this.errorAlertImagePath,
        message: this.t('glomo-transfer-cancelled-card-error-alert-message')
      },
      BGE0060: {
        title: this.t('glomo-transfer-error-alert-title'),
        acceptBtLabel: this.t('glomo-transfer-retry-accept-label'),
        cancelBtLabel: this.t('glomo-transfer-quit-cancel-button'),
        srcImage: this.errorAlertImagePath,
        message: this.t('glomo-transfer-verify-account-error-alert-message')
      },
      MPE0201: {
        title: this.t('glomo-transfer-error-alert-title'),
        acceptBtLabel: this.t('glomo-transfer-error-calculate-exchange-rates-accept'),
        cancelBtLabel: '',
        srcImage: this.errorAlertImagePath,
        message: this.t('glomo-alert-transfer-inactive-number-card-error-alert-message')
      },
      MPE0094: {
        title: this.t('glomo-transfer-error-alert-title'),
        acceptBtLabel: this.t('glomo-transfer-error-calculate-exchange-rates-accept'),
        cancelBtLabel: '',
        srcImage: this.errorAlertImagePath,
        message: this.t('glomo-transfer-card-profile-not-accept-transfer-error-alert-message')
      }
    };

    const fullErrorConfig = {
      ...errorConfig[errorCode],
      className: 'header--title-grey full-height-error',
      messageClass: '',
      fullModal: true
    };

    return {
      retryConfig: fullErrorConfig,
      callConfig: fullErrorConfig
    };
  }

  /**
   * Sets properties to display alert when getting an error while making own transfer with foreign currency
   */
  errorMakeOwnTransferForeignCurrency() {
    this._closeControlVeil();
    let config = {
      title: this.t('glomo-transfer-own-transfer-foreign-currency-template-title'),
      acceptBtLabel: this.t('glomo-transfer-own-transfer-foreign-currency-accept'),
      cancelBtLabel: this.t('glomo-transfer-own-transfer-foreign-currency-cancel'),
      className: '',
      srcImage: this.errorAlertImagePath,
      message: this.t('glomo-transfer-own-transfer-foreign-currency-template-text'),
      messageClass: '',
      fullModal: true
    };
    let retryErrorData = {
      errorId: 'OWN-TRANSFER-FOREIGN-CURRENCY-ERROR',
      errorType: 'operative',
      retryConfig: config,
      callConfig: config
    };
    this._fire('retry-error', Object.assign({ retryErrorData }));
  }

  /**
   * Parse contact from mobile agenda
   * @param {Array} contact
   */
  parseMobileContact(contact = []) {
    if (contact && this.c(contact, 'phoneNumber')) {
      const { phoneNumber } = contact;
      this._fire('set-contact-mobile-phone', phoneNumber);
    }
  }
  /**
   * event to generate back step from exit operative
   * @event exit-page-transfers
   */
  exitOperative() {
    this._fire('exit-operative');
  }

  /**
   * Exit page
   */
  exit() {
    if (this.c(this.assistantData, 'key') === 'googleAssistant') {
      this._fire('exit-page-transfers-from-google');
    }
    if (this.enablePrepareFeedback && this._isQuotationDone) {
      if (this._isAbandonSummary) {
        this._fire('prepare-feedback-event', { feedbackOperation: 'own_foreign_transfer_abandon_summary' });
      } else {
        this._fire('prepare-feedback-event', { feedbackOperation: 'own_foreign_transfer_abandon_quotation' });
      }
    } else {
      this._fire('exit-page-transfers');
    }
    this.reset();
    this.comeFromExpensesGroup = false;
  }

  /**
  * Method that parse info from contactsAgenda response
  * @param {Object} response
  */
  contactsAgendaResponse(response) {
    if (response) {
      let savedContact = this.c(response, 'detail');
      let savedContactAccount = {
        number: this.c(savedContact, 'displayNumber'),
        numberType: {
          id: this.c(savedContact, 'products.0.numberType.id'),
          name: this.c(savedContact, 'products.0.numberType.name')
        },
        bank: {
          id: this.c(savedContact, 'bank.id'),
          name: this.c(savedContact, 'bank.name')
        },
        productType: {
          id: this.c(savedContact, 'products.0.productType.id'),
          name: this.c(savedContact, 'products.0.productType.name')
        },
        specificProductType: {
          id: this.c(savedContact, 'products.0.specificProductType.id'),
          name: this.c(savedContact, 'products.0.specificProductType.name')
        },
        favourite: false
      };

      if (this.standIn) {
        this._validateStandInContactSelection(savedContact, savedContactAccount);
      } else {
        this._fire('set-recipient-from-contacts-agenda', {savedContact, savedContactAccount});
      }
    }
  }

  /**
   * Evaluates when stand in mode is on to avoid own product selection
   * @param {Object} selectedProduct - selected product info
   * @event continue-selected-product-receiver
   */
  onSelectOwnProduct(selectedProduct) {
    if (this.standIn) {
      this._validateStandInContactSelection({ bank: { name: 'BBVA'} });
    } else {
      this._fire('continue-selected-product-receiver', selectedProduct);
    }
  }

  /**
   * Validates when a info modal should be displayed
   * and when the contact data should be dispatched
   * @param {Object} savedContact
   * @param {Object} savedContactAccount
   * @event stand-in-bank-transfers-modal
   * @event transfers-dm-modal-config
   * @event set-recipient-from-contacts-agenda
   */
  _validateStandInContactSelection(savedContact, savedContactAccount) {
    const contactInfix = savedContact.bank.name === 'BBVA' ? 'bbva' : 'spei';
    const modalConfig = this._createStandInModal(contactInfix);
    this._fire('stand-in-bank-transfers-modal');
    this._fire('transfers-dm-modal-config', modalConfig);

    if (contactInfix === 'spei') {
      this._fire('set-recipient-from-contacts-agenda', {savedContact, savedContactAccount});
    }
  }

  /**
   * Set EntryPont
   */
  setIdEntryPont(account) {
    if (this.c(account, 'continue') === 'account' || this.c(account, 'nameValuePairs.continue') === 'account') {
      if (this.c(account, 'nameValuePairs')) {
        this._idEntryPoint = this.c(account, 'nameValuePairs.productId');
        return;
      }
      this._idEntryPoint = this.c(account, 'productId');
    }
  }

  /**
   * Dispatch an event to go to dashboard or account detail or expenses group
   * @event tratransfers-success-exit-to-entry-point-event
   * @event exit-to-dashboard
   * @event exit-to-expenses
   */
  prepareToExit() {
    const eventExit = (this._idEntryPoint === '') ? this.comeFromExpensesGroup ? 'exit-to-expenses' : 'exit-to-dashboard' : 'exit-to-product-detail-event';
    if (this.enablePrepareFeedback) {
      this._fire('prepare-feedback-event', { feedbackOperation: 'transfers-success-exit-to-entry-point-event' });
      this._idEntryPoint = '';
      return;
    }
    this._fire(eventExit, this.comeFromExpensesGroup ? true : { productId: this._idEntryPoint});
    this._idEntryPoint = '';
    this.comeFromExpensesGroup = false;
  }

  /**
   * Exit Transfer Success page
   * @event prepare-feedback-event
   * @event rating-app-transfer-success
   * @event exit-page-transfers
   * @event exit-to-expenses
   */
  exitTransferSuccessPage() {
    if (this.enablePrepareFeedback && this.transferTypeFx === 'OWN_TRANSFERS' && this.currencyTypeFx !== 'MXN' && this.currencyTypeFx !== '' && !this.comeFromExpensesGroup) {
      this._fire('prepare-feedback-event', { feedbackOperation: 'own_foreign_transfer_success' });
    } else {
      this._fire(this.comeFromExpensesGroup ? 'exit-to-expenses' : 'exit-page-transfers', true);
      this._listMovements();
    }

    this._fire('rating-app-transfer-success', {
      view: 'transfers',
      value: true
    });
    this.comeFromExpensesGroup = false;
  }

  /**
   * Dispatches events so that the account balance details are updated
   * @event set-account-transactions-started
   * @event reset-account-has-transactions
   * @event reset-has-fetched-pending-transactions
   * @event reset-pending-transactions
   * @event reset-show-pendings
   * @event update-the-amount
   */
  _listMovements() {
    this._fire('set-account-transactions-started', false);
    this._fire('reset-account-has-transactions', null);
    this._fire('reset-has-fetched-pending-transactions', false);
    this._fire('reset-pending-transactions', []);
    this._fire('reset-show-pendings', true);
    this._fire('update-the-amount');
  }

  /**
   * Returns the modal config depending on stand in case
   * @param {String} modalCase
   * @returns {Object} - modal structure
   */
  _createStandInModal(modalCase) {
    const modalCases = {
      'newRecipient': {
        code: 'stand-in-account-modal',
        title: 'cells-step-recipient-stand-in-modal-account-title',
        paragraphs: [
          { title: 'cells-step-recipient-stand-in-modal-account-text-title', class: 'simple-title' },
          { text: 'cells-step-recipient-stand-in-modal-account-text-content', class: 'grey' }
        ],
        acceptBtLabel: 'glomo-stand-in-button-label',
        cancelBtLabel: ''
      },
      'spei': {
        code: 'stand-in-spei-transfers',
        title: 'glomo-transfers-stand-in-modal-title',
        paragraphs: [
          { text: 'glomo-transfers-stand-in-spei-modal-text', class: 'grey' },
          { text: 'glomo-transfers-stand-in-spei-modal-text-2', class: 'grey' }
        ],
        acceptBtLabel: 'glomo-transfers-stand-in-spei-modal-accept-button-text',
        cancelBtLabel: 'glomo-transfers-stand-in-spei-modal-cancel-button-text'
      },
      'bbva': {
        code: 'stand-in-bbva-transfers',
        title: 'glomo-transfers-stand-in-modal-title',
        paragraphs: [
          { title: 'glomo-stand-in-modal-title', class: 'simple-title' },
          { text: 'glomo-stand-in-modal-text', class: 'grey' }
        ],
        acceptBtLabel: 'glomo-transfers-stand-in-bbva-modal-accept-button-text',
        cancelBtLabel: ''
      },
    };

    let modalTemplate = {
      code: modalCases[modalCase].code,
      selectedConfig: {
        className: 'full-height-error',
        heroImage: 'images/Info.svg',
        openMaximized: true,
        message: '',
        title: modalCases[modalCase].title,
        acceptBtLabel: modalCases[modalCase].acceptBtLabel,
        cancelBtLabel: modalCases[modalCase].cancelBtLabel,
        template: {
          type: 'paragraphs',
          values: modalCases[modalCase].paragraphs
        }
      }
    };

    return modalTemplate;
  }

  /**
     * Private method that returns the value of the functionality flag.
     * @returns {Boolean}
     */
  _getFlagValue() {
    let flagValue = false;
    if (this.featureFlagCollection && this.featureFlagCollection['glomo.account.cardlessWithdrawalCommerce']) {
      flagValue = this.get('value', this.featureFlagCollection['glomo.account.cardlessWithdrawalCommerce']) || false;
    } else {
      flagValue = false;
    }
    return flagValue;
  }

  /**
   * Load transfers from a deeplink and if the accountEmail has no value, consult it
   */
  initPageDeeplink() {
    if (!this.accountEmail) {
      this._getCustomerInfo();
    }
    this._fire('glomo-transfers-mx-dm-init-transfers', { continue: 'dashboard' });
  }

  /**
  * Method that dispatch structure of error of High Risk Of Fraud.
  * @param {Object} error
  */
  functionErrorHighRiskOfFraud() {
    this._closeControlVeil();
    this._fire('retry-error', true);
    this._fire('glomo-transfers-mx-dm-reject-transfers', true);
  }
  /**
      * @description call bbva line
      * @public
      */
  callBBVALine() {
    this.phoneAssistanceNumber = this.get('contact.phone', this.publicSettings);
    if (this.phoneAssistanceNumber) {
      this._fire('call-bbva-line', {value: this.phoneAssistanceNumber});
    }
  }
}
window.customElements.define(GlomoTransfersMxDm.is, GlomoTransfersMxDm);
