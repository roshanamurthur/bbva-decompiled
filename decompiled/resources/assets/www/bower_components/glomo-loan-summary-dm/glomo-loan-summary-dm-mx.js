/**
* @summary Glomo DM of loans summary.
* @customElement
* @polymer
* @extends {Polymer.Element}
*/
/* global GlomoLoanSummaryDm, moment */
/* eslint new-cap: off */
class GlomoLoanSummaryDmMx extends GlomoLoanSummaryDm.Mixin(Polymer.Element) {

  static get is() {
    return 'glomo-loan-summary-dm-mx';
  }

  static get properties() {
    return {
      /**
       * Loan
       * @type {Object}
       */
      loan: {
        type: Object,
        value: () => ({})
      },
      /**
       * More info of Loan
       * @type {Array}
       */
      moreInfo: {
        type: Object,
        value: () => ({})
      },
      /**
       * Loan related contracts
       */
      relatedContracts: {
        type: String,
        value: ''
      },
      /**
       * Loan commissions
       */
      commissions: {
        type: String,
        value: ''
      },
      /**
       * Number of visible chars
       */
      mask: {
        type: Object,
        value: () => ({
          separator: '•',
          chars: '5'
        })
      },
      /**
      * Monoproduct flag
      * @type {Boolean}
      */
      isMonoproductUser: {
        type: Boolean,
        value: false
      },
      /**
      * Monoproduct localstorage consulting
      * @type {number}
      */
      _consultingMonoproduct: {
        type: Number,
        value: 0
      },
      /**
       * Icon id
       * @type {Object}
       */
      iconId: {
        type: Object,
        observer: '_iconIdSearch'
      },
      /**
       * Functionality flag for sustainable loans
       * @type {Boolean}
       */
      _flagSustainableLoan: {
        type: Boolean,
        value: false
      }
    };
  }

  /**
   * Reset
   */
  reset() {
    this.set('loan', {});
    this.set('moreInfo', {});
    this.relatedContracts = '';
    this.commissions = '';
    this._setLoansApiVersion();
  }

  /**
   * Get product
   */
  getProduct() {
    this.$.dmMx.getLoan(this.productId);
  }

  /**
   * Get product and reset properties with the new alias is success
   */
  getProductSuccessAlias() {
    this._fireEvent('set-productid-to-edit-alias', { productId: this.productId });
    this.reset();
    this.getProduct();
  }

  /**
   * Change version to loans api
   */
  _setLoansApiVersion(loansApiVersion = 1) {
    this.loansApiVersion = loansApiVersion;
  }

  /**
   * Get product detail
   */
  _handleGetLoan(loan) {
    this.set('loan', loan.detail);
    const loanParsed = this._parseLoan(this.loan);
    this._fireEvent('loan-response-success', loanParsed);
    this._fireEvent('send-to-more-info', this.loan);
  }

  /**
   * Parse loan and checked short version
   */
  _parseLoan(loan) {
    if (!loan) {
      return;
    }
    let loanProcessed = {};
    Object.assign(loanProcessed, loan);
    const loanType = this.get('loanType.id', loanProcessed);
    const productId = this.get('id', loanProcessed);
    const currentInstallment = this.get('currentInstallment', loanProcessed);

    this.getService(loanType);

    const currencyVSM = this._findCurrencyVSM(this.get('totalOverdueInstallmentsAmounts', loanProcessed), 'currency', 'VSM') || '';
    const loanCurrency = currencyVSM ? currencyVSM : this._findObjectByKeyValue(this.get('currencies', loanProcessed), 'isMajor', true).currency;
    const paymentPeriods = this.get('reviewPeriod.id', loanProcessed.periods);

    const fixRate = this.getFixedRate(this.get('annualFixedRate', loanProcessed));
    const totalInstallmentsNumber = this.get('totalInstallmentsNumber', loanProcessed);
    const totalOverdueInstallmentsAmounts = this.get('totalOverdueInstallmentsAmounts', loanProcessed);
    const contractingDate = this.get('contractingDate', loanProcessed);

    const amortised = this.get('amortisedAmounts', loanProcessed);
    const monthPayment = this._getMonthPayment(currentInstallment, totalInstallmentsNumber, loanCurrency, paymentPeriods, fixRate, totalOverdueInstallmentsAmounts);
    const statusId = this._getStatusId(loanCurrency, currentInstallment, totalInstallmentsNumber);
    const pendingAmount = this.get('pendingAmount', loanProcessed);
    const initialAmount = this.get('initialAmounts', loanProcessed);

    let parsedLoan = {
      class: 'amount-aline',
      loanId: productId,
      number: this.get('number', loanProcessed),
      numberType: this.get('numberType', loanProcessed),
      productId: this.productId,
      productType: this.get('product', loanProcessed),
      loanType: loanType,
      loanTypeName: this.get('alias', loanProcessed) || this.get('product.name', loanProcessed),
      optionalItems: this._getOptionalItems(pendingAmount, initialAmount, loanCurrency),
      monthPayment: monthPayment,
      statusId: statusId,
      contractingDate: contractingDate,
      amortisedAmount: amortised,
      totalInstallments: totalInstallmentsNumber,
      sustainableAlternative: this._getSustainableAlternative(loanProcessed),
      originalProduct: {
        alias: this.get('alias', loanProcessed) || '',
        product: {
          name: this.get('product.name', loanProcessed)
        },
        loanId: this.productId,
        productType: 'loan'
      }
    };

    return parsedLoan;
  }

  /**
    * Returns sustainable loan information
    * @param {Object} loanProcessed - Loan information.
    * @returns {Object} - Sustainable loan information.
    */
  _getSustainableAlternative(loanProcessed) {
    let sustainableAlternative = {};
    if (this._flagSustainableLoan && Object.prototype.hasOwnProperty.call(loanProcessed, 'sustainableAlternative') && Object.keys(loanProcessed.sustainableAlternative).length > 0) {
      sustainableAlternative =  this.get('sustainableAlternative', loanProcessed);
      sustainableAlternative.elapsedDaysLoan = this._elapsedDaysLoan(loanProcessed.contractingDate);
    }
    return sustainableAlternative;
  }

  /**
   * @desc The function validates and sets the values of different feature flags
   * @param {Object} fetureFlags
   */
  getFlagCollection(fetureFlags) {
    this._flagSustainableLoan = fetureFlags['glomo.loans.productDetailSustainability']?.value;
  }

  /**
    * Returns the days elapsed since the loan was contracted
    * @param {String} contractingDate - contractingDate information.
    * @returns {Number} - Elapsed days loan.
    */
  _elapsedDaysLoan(contractingDate) {
    return moment().diff(moment(contractingDate), 'days');
  }

  /**
   * Validate and set data to operation billpayment
   */
  validateBillPayments({ product }) {
    let eventName = '';
    let productId = this.get('productId', product);
    const carId = this.get('productType.id', product).startsWith('CZ');
    const consumerId = this.get('productType.id', product).startsWith('C');
    const mortgageId = this.get('loanType', product) === 'MORTGAGE';

    if (!carId) {
      if (consumerId) {
        eventName = 'consume-personal';
      }
    } else {
      eventName = 'car';
    }

    if (mortgageId) {
      eventName = 'mortgage';
    }

    if (!this.isMonoproductUser) {

      this._fireEvent(`navigate-to-billpayment-${eventName}`, { productId });
      this._fireEvent('set-billpayment-info', { response: this.loan, loanId: productId });
    } else {
      this._fireEvent('invitation-non-account-link');

    }

  }

  /**
   * Set events to get relatedContracts and Commissions services
   */
  getService(type) {
    if (type === 'CONSUME_PERSONAL') {
      this.$.dmMx.getRelatedContracts(this.productId);
      this._setLoansApiVersion(0);
      this.$.dmMx.getCommissions(this.productId);
    }
  }

  /**
   * Generate related contracts
   */
  _handleGetLoanRelatedContracts(payload) {
    let response = payload.detail;
    this._fireEvent('loan-related-contracts', (response.find(data => data.relationType.id === 'LINKED_WITH')).number);
  }

  /**
   * Generate commissions
   */
  _handleGetLoanCommissions(payload) {
    let response = payload.detail;
    const commissionFind = (response.find(data => data.commissionId === 'ARREARS_INTEREST'));
    this._fireEvent('loan-commissions-percentage', commissionFind !== undefined ? commissionFind.percentage : '');
  }

  /**
   * Get status of message info
   */
  _getStatusId(loanCurrency, currentInstallment, totalInstallmentsNumber) {
    let update = (currentInstallment.number === 0 && totalInstallmentsNumber.amortised !== 0);
    if (update) {
      return 'VALID';
    }
    return loanCurrency;
  }

  /**
   * Data to show in summary loan
   */
  _getOptionalItems(pendingAmount, initialAmounts, loanCurrency) {
    const pendingAmountPrincipal = this._findObjectByKeyValue((pendingAmount.totals || []), 'currency', loanCurrency);
    const initialAmount = this._findObjectByKeyValue((initialAmounts || []), 'currency', loanCurrency);

    if (loanCurrency === 'UCF') {
      pendingAmountPrincipal.currency = 'UDI';
      initialAmount.currency = 'UDI';
    }

    return [
      {
        type: 'pending',
        key: this.t('cells-product-summary-loan-pending-amount'),
        localCurrency: this.locale,
        language: this.language,
        icon: {
          keyIcon: 'coronita:help',
          id: 'loan-pending-amount'
        },
        value: {
          amount: (pendingAmountPrincipal || {}).amount,
          currencyCode: (pendingAmountPrincipal || {}).currency,
          class: 'amount-large amount-aline'
        }
      }, {
        type: 'total',
        key: this.t('cells-product-summary-loan-initial-amount'),
        localCurrency: this.locale,
        language: this.language,
        value: {
          amount: (initialAmount || {}).amount,
          currencyCode: (initialAmount || {}).currency,
          class: 'amount-large amount-aline'
        }
      }
    ];
  }

  /**
   * Send a modal filtering by icon ID
   * @param {Object} iconId
   * @event cells-product-summary-optional-items-loan-pending-amount
   */
  _iconIdSearch(iconId) {
    if (iconId && iconId.id === 'loan-pending-amount') {
      const modalInfo = {
        code: 'PRODUCT-SUMMARY-LOAN-INFO',
        primaryButtonClass: 'primary',
        selectedConfig: {
          className: 'title-modal-summary-loan-pending image--md',
          openMaximized: true,
          title: 'cells-product-summary-loan-pending-amount',
          heroImage: './images/No-offer.svg',
          acceptBtLabel: 'cells-product-summary-loan-pending-amount-button',
          template: {
            type: 'paragraphs',
            values: [
              {
                title: 'cells-product-summary-loan-pending-title'
              },
              {
                text: 'cells-product-summary-loan-pending-description-one'
              },
              {
                list: ['cells-product-summary-loan-pending-description-two-dotone', 'cells-product-summary-loan-pending-description-two-dottwo', 'cells-product-summary-loan-pending-description-two-dotthree']
              },
              {
                text: 'cells-product-summary-loan-pending-description-three'
              }
            ]
          }
        }
      };
      this._fireEvent('cells-product-summary-optional-items-loan-pending-amount', modalInfo);
    }
  }

  /**
   * Get date of services
   */
  _getMaturityDate(date) {
    if (date !== '') {
      return {
        text: 'cells-loan-installment-maturity-date',
        date: date
      };
    }
    return { text: '', date: '' };
  }

  /**
   * Set style to pending loan
   */
  _getPendingStyle(pending, paymentPeriods) {
    if (pending) {
      return {
        text: 'cells-loan-installment-current-receipt-detail',
        style: ''
      };
    }

    return {
      text: 'cells-loan-installment-' + paymentPeriods + '-payment',
      style: 'important'
    };
  }

  /**
   * Show message in part loan installment
   */
  _hasMessage(loanCurrency) {
    if (loanCurrency === 'UDI' || loanCurrency === 'VSM') {
      return true;
    }
    return false;
  }

  /**
   * Product Updating
   */
  _getUpdateProduct(currentInstallment, totalInstallmentsNumber) {
    if (currentInstallment.number === 0 && totalInstallmentsNumber.amortised !== 0) {
      return true;
    }
    return false;
  }

  /**
   * Get month payment of loans
   */
  _getMonthPayment(currentInstallment, totalInstallmentsNumber, loanCurrency, paymentPeriods, fixRate, totalOverdueInstallmentsAmounts) {
    let showHasMessage = this._hasMessage(loanCurrency);
    let updateProduct = this._getUpdateProduct(currentInstallment, totalInstallmentsNumber);

    let pending = totalInstallmentsNumber.overdue !== 0;
    let maturityDate = currentInstallment.maturityDate || '';

    let currentPayment = this._findObjectByKeyValue(currentInstallment.principals, 'currency', this.locale);
    let pendingPayment = this._findObjectByKeyValue(totalOverdueInstallmentsAmounts, 'currency', this.locale);
    let totalPayment = this._findObjectByKeyValue(currentInstallment.totals, 'currency', this.locale);
    let importTotal = this._findObjectByKeyValue(currentInstallment.totals, 'currency', loanCurrency);

    const monthPayment = {
      hasMessage: showHasMessage || updateProduct,
      headData: {
        current: currentInstallment.number,
        total: totalInstallmentsNumber.total,
        text: 'cells-loan-installment-current-receipt',
        separation: 'cells-loan-installment-total-installments',
        style: 'current-installment'
      },
      mainData: {
        text: this._getMaturityDate(maturityDate).text,
        date: this._getMaturityDate(maturityDate).date,
        format: 'D MMM',
        immediately: maturityDate.includes('9999'),
        additionalInformation: [
          {
            value: fixRate,
            text: 'cells-loan-installment-annual-interest-rate',
            style: 'important'
          }
        ],
        list: [
          {
            value: currentPayment,
            text: this._getPendingStyle(pending, paymentPeriods).text,
            style: this._getPendingStyle(pending, paymentPeriods).style
          },
        ]
      },
    };

    if (!pending && showHasMessage) {
      monthPayment.mainData.list.push(
        {
          value: importTotal,
          text: 'cells-loan-installment-import-to-loan-currency-' + loanCurrency,
          withoutCurrencySymbol: true,
          style: 'installment-main'
        }
      );
    }

    if (pending && showHasMessage) {
      monthPayment.mainData.list.push(
        {
          value: this._findObjectByKeyValue(currentInstallment.principals, 'currency', loanCurrency),
          text: 'cells-loan-installment-import-to-loan-currency-' + loanCurrency,
          withoutCurrencySymbol: true,
          style: 'installment-main'
        },
        {
          value: pendingPayment,
          text: 'cells-loan-installment-pending-receipt'
        },
        {
          value: this._findObjectByKeyValue(totalOverdueInstallmentsAmounts, 'currency', loanCurrency),
          text: 'cells-loan-installment-import-to-loan-currency-' + loanCurrency,
          withoutCurrencySymbol: true,
          style: 'installment-main'
        },
        {
          value: totalPayment,
          text: 'cells-loan-installment-total-payment',
          style: 'important'
        },
        {
          value: importTotal,
          text: 'cells-loan-installment-import-to-loan-currency-' + loanCurrency,
          withoutCurrencySymbol: true,
          style: 'installment-main'
        }
      );
    } else if (pending && !showHasMessage) {
      monthPayment.mainData.list.push(
        {
          value: pendingPayment,
          text: 'cells-loan-installment-pending-receipt'
        },
        {
          value: totalPayment,
          text: 'cells-loan-installment-total-payment',
          style: 'important'
        }
      );
    }

    if (updateProduct) {
      monthPayment.headData = {};
      monthPayment.mainData = {};
    }

    monthPayment.mainData.style = 'no-margin-bottom';
    return monthPayment;
  }

  /**
   * Find object for it value
   */
  _findObjectByKeyValue(objectList, key, value) {
    return objectList.find(item => item[key] === value);
  }

  /**
   * Find value
   */
  _findCurrencyVSM(objectList, key, value) {
    const currency = objectList.find(item => item[key] === value);
    if (currency) {
      return 'VSM';
    }
    return '';
  }

  /**
   * Fire Events
   */
  _fireEvent(e, detail) {
    this.dispatchEvent(new CustomEvent(e, {
      bubbles: true,
      composed: true,
      detail: detail
    }));
  }

  /**
   * Gets all product info
   */
  getProductMoreInfo() {
    const currencyVSM = this._findCurrencyVSM(this.get('totalOverdueInstallmentsAmounts', this.moreInfo), 'currency', 'VSM');
    const loanCurrency = currencyVSM ? currencyVSM : this._findObjectByKeyValue(this.get('currencies', this.moreInfo), 'isMajor', true).currency;
    const fixRate = this.getFixedRate(this.get('annualFixedRate', this.moreInfo));

    this._fireEvent('set-more-info', this._generateMoreInfo(this.moreInfo, this.relatedContracts, this.commissions, loanCurrency, fixRate));
  }

  /**
   * Generate more info by loan
   */
  _generateMoreInfo(loan, relatedContracts, commission, loanCurrency, fixRate) {
    let loanResponseModel = [];
    let objCommissions = '';
    let paymentFrecuency = this.get('terms.frequency', loan) === undefined ? '' : this.get('terms.frequency', loan);
    let amortised = this._findObjectByKeyValue(loan.amortisedAmounts, 'currency', loanCurrency);

    if (loanCurrency === 'UCF') {
      amortised.currency = 'UDI';
    }

    const objGeneral = {
      title: 'cells-product-more-info-general',
      items: [
        {
          key: 'cells-product-more-info-loan-type',
          value: this._loanTypeName(loan),
        },
        {
          key: 'cells-product-more-info-alias',
          value: this.get('alias', loan) || this.get('product.name', loan),
        },
        {
          key: 'cells-product-more-info-loan-detail',
          value: this._formatProduct(loan.number, 'loan'),
          label: true
        },
        {
          key: 'cells-product-more-info-loan-clabe',
          label: true,
          value: this._formatProduct(loan.formats[0].number, 'clabe'),
          toolTip: {
            iconInfo: 'coronita:help',
            action: 'open-modal'
          }
        },
        {
          key: 'cells-product-more-info-contract-date',
          value: moment(loan.contractingDate).format('DD MMMM YYYY')
        },
        {
          key: 'cells-product-more-info-loan-expiration-date',
          value: moment(loan.maturityDate).format('DD MMMM YYYY'),
        },
        {
          key: 'cells-product-more-info-loan-capital-loan',
          value: {
            amount: amortised.amount,
            currency: amortised.currency
          },
          isAmount: true,
          class: 'currency-large'
        },
      ]
    };

    const objRelatedContracts = {
      title: 'cells-product-more-info-related-contracts',
      items: []
    };

    const objConditions = {
      title: 'cells-product-more-info-conditions',
      items: [
        {
          key: 'cells-product-more-info-receipts-paid',
          value: this.get('totalInstallmentsNumber.amortised', loan)
        },
        {
          key: 'cells-product-more-info-pending-receipts',
          value: this.get('totalInstallmentsNumber.pending', loan)
        },
        {
          key: 'cells-product-more-info-total-receipts',
          value: this.get('totalInstallmentsNumber.total', loan)
        },
        {
          key: 'cells-product-more-info-frequency',
          value: 'cells-product-more-info-payment-frecuency' + paymentFrecuency,
        },
      ]
    };

    switch (this.get('loanType.id', loan)) {
      case 'CONSUME_PERSONAL':
        objConditions.items.push({
          key: 'cells-product-more-info-annual-rate',
          value: fixRate
        });

        objRelatedContracts.items.push({
          key: 'cells-product-more-info-charge-account',
          value: this.formatAssociatedCardNumber(relatedContracts),
          textInfo: 'cells-product-more-info-info-account',
          iconInfo: 'coronita:info',
          classInfo: 'icon-color-core-blue'
        });

        objCommissions = (this._getArrears(commission));

        if (objCommissions) {
          loanResponseModel.push(objGeneral, objRelatedContracts, objConditions, objCommissions);
        } else {
          loanResponseModel.push(objGeneral, objRelatedContracts, objConditions);
        }
        break;

      case 'MORTGAGE':
        objGeneral.items.push({
          key: 'cells-product-more-info-loan-currency',
          value: 'cells-product-more-info-loan-currency' + loanCurrency,
        });

        loanResponseModel.push(objGeneral, objConditions);
        break;

      default:
        objConditions.items.push({
          key: 'cells-product-more-info-annual-rate',
          value: fixRate
        });

        loanResponseModel.push(objGeneral, objConditions);
        break;
    }

    return loanResponseModel;
  }

  /**
   * Get product name
   */
  _loanTypeName(loan) {
    let loanTypeId = this.get('loanType.id', loan);
    if (loanTypeId === 'CONSUME_PAYROLL') {
      loan.loanType.name = 'cells-product-more-info-loan-category-consume-payroll';
    } else if ((loanTypeId !== 'MORTGAGE' || loanTypeId !== 'CONSUME_PERSONAL') && loan.product.name.includes('AUTO')) {
      loan.loanType.name = 'cells-product-more-info-loan-type-car';
    }
    return loan.loanType.name;
  }

  /**
   * Convert commission data to percentage
   */
  _getArrears(data) {
    if (data) {
      const loanCommission = parseFloat(data);
      return {
        title: 'cells-product-more-info-costs',
        items: [
          {
            key: 'cells-product-more-info-loan-interest',
            value: this.getFixedRate(loanCommission),
          }
        ]
      };
    }
    return '';
  }

  /**
   * Configure the help info modal to show up in a modal screen
   */
  setHelpModalConfig() {
    const config = {
      code: 'more-info',
      selectedConfig: {
        className: 'info loan-help-info',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'cells-modal-alert-understood',
        template: {
          type: 'paragraphs',
          values: [
            { icon: 'coronita:help', iconClass: 'icon-size-24 light-blue', class: 'info' },
            { title: 'cells-product-more-info-account-clabe' },
            { text: 'cells-product-more-info-modal-help' }
          ]
        }
      }
    };
    this._fireEvent('open-modal', config);
  }

  /**
   * Close modal product detail
   */
  closeLoanProductDetail() {
    this._fireEvent('close-loan-product-detail');
  }

  /**
   * Format to related contracts
   */
  formatAssociatedCardNumber(number) {
    let parsedNumber;
    if (number) {
      let cardNumber = number.replace('****', '');
      parsedNumber = this.mask.separator + cardNumber.slice(-parseInt(this.mask.chars, 10));
    }
    return parsedNumber;
  }

  /**
   * Get rate
   */
  getFixedRate(rate) {
    return `${rate.toFixed(2)}%`;
  }

  /**
   * Error detail
   */
  _handleGetLoanError(error) {
    const config = {
      header: 'cells-product-summary-loan-modal-header-title',
      title: 'cells-product-summary-loan-modal-message',
      message: 'cells-product-summary-loan-modal-description',
      srcImage: Polymer.ResolveUrl.resolveUrl('images/errors/error.svg'),
      className: 'full-height-error header--title-grey credit-bureau--error',
      fullModal: true
    };

    const retryErrorData = {
      errorId: 'LOAN-DETAIL-ERROR-REQUEST',
      errorType: 'operative',
      retryConfig: {},
      callConfig: {}
    };

    Object.assign(retryErrorData.retryConfig, config);
    Object.assign(retryErrorData.callConfig, config);
    retryErrorData.retryConfig.acceptBtLabel = 'cells-product-summary-loan-modal-btn-retry';
    retryErrorData.retryConfig.cancelBtLabel = 'cells-product-summary-loan-modal-btn-return';
    retryErrorData.callConfig.acceptBtLabel = 'cells-product-summary-loan-modal-btn-exit';
    this._fireEvent('glomo-loan-summary-dm-get-loan-error', Object.assign({ retryErrorData }));
  }


  /**
  * get key monoproduct storage
  * @event 'get-native-local-storage'
  */
  getStorageMonoproduct() {
    this._fireEvent('get-native-local-storage', {
      key: 'monoproduct',
      secure: false
    });
  }

  /**
  * Set key monoproduct from storage
  * @param {Object} resp
  */
  setStorageMonoproduct(resp) {
    this.isMonoproductUser = JSON.parse(this.get('monoproduct', resp));
  }

  /**
  * receives error response from storage
  * @param {Object} error
  * @event 'monoproduct-dashboard-flag'
  */
  hasMonoproductStorageError(error) {
    if (this.get('code', error) === 999) {
      this._fireEvent('monoproduct-dashboard-flag');
    } else if (this.get('code', error) === -1 && this._consultingMonoproduct < 2) {
      this._consultingMonoproduct += 1;
      this.getStorageMonoproduct();
    }
  }
}
window.customElements.define(GlomoLoanSummaryDmMx.is, GlomoLoanSummaryDmMx);