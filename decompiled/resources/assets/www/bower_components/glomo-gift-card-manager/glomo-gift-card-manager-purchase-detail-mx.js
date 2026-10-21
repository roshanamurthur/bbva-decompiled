
/* eslint new-cap: 0 */
/* global moment */
/* global GlomoGiftCardManagerMixin */
class GlomoGiftCardManagerPurchaseDetailMx extends GlomoGiftCardManagerMixin.mixin(Polymer.mixinBehaviors([
  CellsBehaviors.CellsGlomoUtilsBehavior,
  CellsBehaviors.i18nBehavior
],
Polymer.Element)) {

  static get is() {
    return 'glomo-gift-card-manager-purchase-detail-mx';
  }

  static get properties() {
    return {
      /**
       * @desc global cache Storage
       * @type {Object}
       */
      globalCacheStorage: { type: Object },
      /**
       * @desc cards to be displayed
       * @type {Object}
       */
      products: { type: Object, notify: true },
      /**
       * @desc Status sticky button
       * @type {Boolean}
       */
      stickyButton: { type: Boolean, value: false },
      /**
       * @desc Mapping the list of brands
       * @type {Object}
       */
      mappedBrand: { type: Object, value: [] },
      /**
       * @desc Enable or disable the first step button
       * @type {Boolean}
       */
      statusButton: { type: Boolean, value: true },
      /**
       * @desc Single product data
       * @type {Object}
       */
      brandItem: { type: Object, notify: true },
      /**
       * @desc Brand selected
       * @type {Object}
       */
      brandSelected: { type: String, notify: true },
      /**
       * @desc information of brands
       * @type {Object}
       */
      informationBrands: { type: Object },
      /**
       * @desc Amount brand selected
       * @type {Object}
       */
      amountBrandSelected: { type: Object, notify: true, observer: '_parseAccount' },
      /**
       * @desc Local currency
       * @type {Object}
       */
      localCurrency: { type: String },
      /**
       * @desc Account selected to pay
       * @type {Object}
       */
      accountSelected: { type: Object },
      /**
       * @desc User email
       * @type {String}
       */
      userEmail: { type: String, value: '' },
      /**
       * @desc Customer ID
       * @type {String}
       */
      customerId: { type: String, notify: true },
      /**
       * @desc Amount card selected
       * @type {Number}
       */
      amountCardSelected: { type: Number },
      /**
       * @desc tsec for pdf request
       * @type {Object}
       */
      tsec: { type: Object, notify: true },
      /**
       * @desc device id for pdf request
       * @type {Object}
       * */
      deviceId: { type: Object, notify: true },
      /**
       * @desc Accepts base64 string or pdf url
       * @type {string}
       * */
      baseSrc: { type: String, notify: true },
      /**
       * @desc send the title value to modal
       * @type {String}
       * */
      docTitle: { type: String, notify: true },
      /**
       * @desc Id Brand selected
       * @type {String}
       * */
      idBrand: { type: String },
      /**
       * @desc TSec Authentication
       * @type {Object}
       * */
      tsecAutentication: {type: Object },
      /**
       * @desc Agreement Success Data
       * @type {Object}
       * */
      getAgreementSuccessData: { type: Object },
      /**
       * @desc Item id
       * @type {String}
       * */
      itemId: { type: String },
      /**
       * @desc products Data
       * @type {Object}
       */
      financialData: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Api Version
       * @type {String}
       */
      apiVersion: {
        type: String,
        value: '0'
      },
      /**
       * @desc Feature flags
       * @type {Object}
       */
      featureFlags: { type: Object },
      /**
       * @description flag to handler payment MTU
       * @type {Object}
       */
      mtuFlag: {
        type: Object,
        value: () => ({})
      },
      /**
       * @description Error image for modal
       * @type {String}
       */
      errorImage: {
        type: String,
        value: './images/Connectivity.svg'
      }
    };
  }

  /**
   * @desc Initialize and show steps
   * @event 'request-customer-id-event'
   */
  init() {
    this._dispatchEvent('request-customer-id-event');
  }

  /**
  * @description retrieve customer contracts
  * @param {Object} dashboardAccounts
  */
  _mappedDashboardAccounts(dashboardAccounts) {
    return (this.get('data.contracts', dashboardAccounts) || []);
  }

  /**
   * @desc Build items for brand options
   * @event 'set-items-options-event'
   */
  _buildItemsOptions() {
    let description = this.informationBrands[this.brandSelected] ? this.informationBrands[this.brandSelected].title : '';
    let bullets = this.informationBrands[this.brandSelected] ? this.informationBrands[this.brandSelected].bullets : '';

    this._dispatchEvent('set-items-options-event', {
      header: [ {
        title: this.t('glomo-blackhawk-purchase-detail-product'),
        description: description,
        bullets: bullets,
      } ],
      options: this.mappedBrand,
      info: this._setTermsCondition(this.brandSelected),
      sticky: [ {
        id: 'summary',
        isSummaryView: true,
        hideExchangeRateIcon: true,
        summaryClass: 'tertiary-button no-button',
        summaryButtonLabel: 'glomo-gift-card-brand-confirm-button',
        disabledPrimaryButton: this.statusButton,
        primaryButtonEvent: 'go-to-next-step'
      } ],
      filled: [ {
        product: this.brandItem,
        keyValue: [ { key: this.t('glomo-gift-card-purchase-detail-number-term-text')} ]
      } ],
      extraInfoLink: {
        icon: 'coronita:info',
        iconSize: '24',
        type: 'info-dark-blue',
        message: this.t('glomo-gift-card-purchase-detail-google-play-help-line'),
        linkMessage: this.t('glomo-gift-card-brand-call-assistance-button'),
        hasMultipleData: true,
        showChangeData: true
      }
    });

    this._checkAccountsOrigin();
  }

  /**
   * @desc check which channel the accounts come from
   */
  _checkAccountsOrigin() {
    if (Object.entries(this.financialData).length !== 0) {
      const accountsData = this._mappedDashboardAccounts(this.financialData);
      this.accounts = accountsData.filter(data => data.productType === 'ACCOUNT' && (this.get('detail.specificAmounts.0.amounts.0.currency', data) === this.localCurrency));
      this._getAccounts(this.accounts);
    } else {
      this.accounts =  (this.get('dashboard.accounts', this.globalCacheStorage) || []);
      this._getAccounts(this.accounts);
    }
  }

  /**
   * @desc bulid other information in the first step
   * @param {String} brand
   */
  _setTermsCondition(brand) {
    if (brand === 'Google Play') {
      return [{
        description: this.t('glomo-gift-card-purchase-detail-google-play-code-card'),
        class: 'medium',
      }, {
        description: this.t('glomo-gift-card-purchase-detail-google-play-terms-and-private'),
        class: 'medium',
      }, {
        description: this.t('glomo-gift-card-purchase-detail-google-play-terms-number'),
        class: 'medium textMarginBotton'
      }];
    } else {
      return [
        { description: this.t('glomo-gift-card-purchase-detail-google-play-terms-number'), class: 'medium textMarginBotton'}
      ];
    }
  }

  /**
   * @desc Mapped brands products
   * @param {Object} detail
   */
  mappedProducts(detail) {
    this.set('brandSelected', detail.title);
    this.set('idBrand', detail.idBrand);
    let i = -1;
    let mappedBrand = detail.brandProducts
      .map(item => {
        i++;
        return {
          idProduct: item.id,
          class: 'badge-success',
          title: item.name,
          amount: item.specificAmounts[0].id === 'TOTAL_AMOUNT' ? this._limitPurchaseAmount(item.specificAmounts[0].amount.amount) : 0,
          replaceAmount: this._validateAmount(item.specificAmounts[0]),
          subInfo: this.t('glomo-gift-card-brand-information-' + this._formatProduct(detail.title)),
          extraInfo: this.t('glomo-gift-card-purchase-detail-mapped-products-date'),
          extraInfoClass: 'extra-info-italic',
          description: this.t('glomo-gift-card-purchase-detail-mapped-products-payment-card'),
          linkText: this.t('glomo-gift-card-purchase-detail-mapped-products-card-detail'),
          cardEvent: 'card-clicked-event',
          amountMin: item.specificAmounts[0].id === 'MIN_AMOUNT' ? item.specificAmounts[0].amount.amount : null,
          amountMax: item.specificAmounts[0].id === 'MIN_AMOUNT' ? this._limitPurchaseAmount(item.specificAmounts[1].amount.amount) : null,
          cardId: i,
          data: { id: i }
        };
      });

    this.set('mappedBrand', mappedBrand);
    this._buildItemsOptions();
  }

  /**
   * @private Limit Purchase Amount
   * @param {Number} amount
   */
  _limitPurchaseAmount(amount) {
    return amount > 3000 ? 3000 : amount;
  }

  /**
   * @private Mapping open amounts
   * @param {Number} amount
   */
  _validateAmount(specificAmounts) {
    return specificAmounts.id === 'TOTAL_AMOUNT' ? false : this.t('glomo-gift-card-purchase-detail-customizable-amount');
  }

  /**
   * @desc Get Accounts from local Storage
   * @param {Object} accounts
   */
  _getAccounts(accounts) {
    let textMessage = false;
    let disabledAccount = false;
    let mappedAccounts = accounts
      .filter(complete => (complete.alias || complete.title) && (complete.accountId || complete.id) && complete.number && (complete.availableBalance || this.get('detail.specificAmounts', complete)))
      .map(item => {
        const availableBalanceGlobal = (this.get('detail.specificAmounts', item) || '') ?  (item.detail.specificAmounts).find(balances => balances.id === 'CURRENT_BALANCE') : '';
        const accountbalance = item.availableBalance ? this.get('availableBalance.currentBalances.0.amount', item)  : this.get('amounts.0.amount', availableBalanceGlobal);
        if (this.amountBrandSelected && this.amountBrandSelected.amount > accountbalance) {
          textMessage = true;
          disabledAccount = true;
        } else {
          textMessage = false;
          disabledAccount = false;
        }
        return {
          id: item.number,
          accountId: (item.accountId || item.id),
          name: item.alias ? item.alias : item.title.name,
          description: { value: item.number, masked: true },
          primaryAmount: {
            amount: item.availableBalance ? item.availableBalance.currentBalances[0].amount : (item.detail.specificAmounts).find(balances => balances.id === 'CURRENT_BALANCE').amounts[0].amount,
            currency: item.availableBalance ? item.availableBalance.currentBalances[0].currency : (item.detail.specificAmounts).find(balances => balances.id === 'CURRENT_BALANCE').amounts[0].currency,
            label: 'account-label-available_current_balances'
          },
          hasTextMessage: textMessage,
          disabled: disabledAccount,
          imgSrc: item.image || './images/accounts/bbva40.svg',
          imgWidth: 26,
          imgHeight: 26
        };

      });

    this._validateAccounts(mappedAccounts);
    this.set('products', mappedAccounts);
  }

  /**
   * @Desc validate account status
   * @param {Object} accounts
   * @event 'validate-account-event'
   */
  _validateAccounts(accounts) {
    if (accounts.length === 1 && this.amountBrandSelected) {
      let disabledAccount = this.amountBrandSelected.amount > accounts[0].primaryAmount.amount ? true : false;
      this._dispatchEvent('validate-account-event', disabledAccount);
    }
  }

  /**
   * @desc Card clicked amount
   * @param {Object} detail
   * @event 'summary-amount-event'
   * @event 'app-started-card-clicked-event'
   */
  cardClicked(detail) {
    let item = detail.id;
    let amount = this.mappedBrand[item].amount  !== 0 ? {
      amount: this.mappedBrand[item].amount, currency: this.localCurrency
    } : null;
    this.set('itemId', item);

    this.set('statusButton', false);
    this.set('brandItem', [ {
      idProduct: this.mappedBrand[item].idProduct,
      productName: this.mappedBrand[item].title,
      img: './images/blackHawk/' + this._selectInfoImageList(this.brandSelected) + '.svg',
      description: { value: this.t('glomo-gift-card-purchase-detail-text-gift-card') },
      amountProduct: amount,
      imgHeight: 60,
      className: 'filled',
      noItalic: true
    } ]);

    this.set('amountBrandSelected', amount);
    this._dispatchEvent('summary-amount-event', {amount: amount});

    let amountAnalytics = this.amountBrandSelected ? this.amountBrandSelected.amount : this.t('glomo-gift-card-purchase-detail-text-amount');
    this._dispatchEvent('app-started-card-clicked-event', this.mappedBrand[item].title.toLowerCase() + ' ' + amountAnalytics);
    this._buildItemsOptions();
  }

  /**
   * @desc Show or hide custom amount step
   * @event 'set-decorated-event'
   * @event 'force-next-step'
   * @event 'go-next-step'
   */
  validateNextStep() {
    let eventName; let hidden;

    if (this.brandItem[0].amountProduct) {
      eventName = 'skip-next-step';
      hidden = true;
      this._dispatchEvent('force-next-step');
    } else {
      eventName = 'go-next-step';
      hidden = false;
    }
    this._dispatchEvent(eventName, hidden);
    this._dispatchEvent('set-decorated-event', true);
  }

  /**
   * @desc Enable variable amount
   * @event 'show-simulation-operation'
   * @event 'set-option-title'
   * @event 'set-hide-header'
   * @event 'reset-steps-after-user-selector'
   */
  enableVariableAmount() {
    this._dispatchEvent('show-simulation-operation', false);
    this._dispatchEvent('set-option-title');
    this._dispatchEvent('set-hide-header', true);
    this._dispatchEvent('reset-steps-after-user-selector', 1);
    this._checkAccountsOrigin();
  }

  /**
   * @desc Other amount is selected
   * @event 'summary-amount-event'
   */
  otherAmountSelected(detail) {
    this.set('amountBrandSelected', {amount: detail.amount});
    this._dispatchEvent('summary-amount-event', {
      amount: {
        amount: detail.amount,
        currency: this.localCurrency
      }
    });
  }

  /**
   * @desc Enable next step if account has less amount than recharge
   * @param {Object} amountSelected
   * @event 'reset-steps-after-user-selector'
   */
  _parseAccount(amountSelected) {
    if (this.accountSelected && amountSelected && amountSelected.amount  > this.accountSelected.primaryAmount.amount) {
      this._dispatchEvent('reset-steps-after-user-selector', 2);
    }
    this._checkAccountsOrigin();
  }
  /**
   * @desc Object to bring feature flags
   * @param {Object} flags
   */
  getFeatureFlagCollection(flags) {
    this.featureFlags = flags;
    this._dispatchEvent('feature-flags-blackhawk', this.featureFlags);
  }
  /**
   * @desc Request card purchase
   * @event 'request-purchase-gift-card'
   */
  requestCardPurchase() {
    let idBrand = this.idBrand + this.brandItem[0].idProduct;
    let params = {
      id: idBrand.substring(0, 20),
      description: idBrand.substring(20, idBrand.length),
    };

    if (this.featureFlags['glomo.operations.blackHawkPurchaseBackOfOperations']?.value && (this.apiVersion === '1')) {
      this._dispatchEvent('request-purchase-gift-card-back-of-operations', { body: this.generatePurcharseGiftRequestV1(params) });
    } else {
      this._dispatchEvent('request-purchase-gift-card', { body: this.generatePurcharseGiftRequestV0(params) });
    }
  }
  /**
   * Generate a body request
   * @param {*} params
   * @returns the body to generate a request to v0
   */
  generatePurcharseGiftRequestV0(params) {
    return {
      service: { id: '001835696' },
      description: this._stringComplete(params.description),
      bill: {
        id: params.id,
        billAmount: { amount: this.amountBrandSelected.amount, currency: this.localCurrency }
      },
      origin: {
        contractId: this.accountSelected.accountId,
        product: { id: 'ACCOUNTS' }
      },
      number: '1234',
      numberType: { id: 'CLABE' },
      additionalFields: [{
        additionalPaymentField: { id: 'ADDITIONAL_REFERENCE_NUMBER' },
        value: ''
      }, {
        additionalPaymentField: { id: 'VALIDATION_SEQUENCE' },
        value: ''
      }, {
        additionalPaymentField: { id: 'BUYER_QR_INFORMATION' },
        value: ''
      }, {
        additionalPaymentField: { id: 'SELLER_QR_INFORMATION' },
        value: ''
      }]
    };
  }
  /**
   * Generate a body request
   * @param {*} params
   * @returns the body to generate a request to v1
   */
  generatePurcharseGiftRequestV1(params) {
    return {
      description: this._stringComplete(params.description),
      services: [
        {
          id: '001835696',
          bills: [
            {
              id: params.id,
              amounts: [
                {
                  amountType: {
                    id: 'TOTAL_DEBT'
                  },
                  amountValue: {
                    amount: this.amountBrandSelected.amount,
                    currency: this.localCurrency
                  }
                }
              ],
              additionalFields: []
            }
          ]
        }
      ],
      origin: {
        contractId: this.accountSelected.accountId,
        productType: {
          id: 'ACCOUNTS'
        }
      },
      paymentOriginType: {
        id: 'NON_FINANCIAL_SERVICES'
      }
    };
  }
  /**
   * @desc String complete for request purchase
   * @param {String} idComplete
   */
  _stringComplete(idComplete) {
    let idConcat = '000000000000000000000000000000' + idComplete;
    return idConcat.substring((idConcat.length - 30), idConcat.length);
  }

  /**
   * @desc Detail card clicked
   * @event 'set-card-extra-detail'
   * @event 'set-card-detail-event'
   * @event 'open-modal-more-info'
   */
  detailCardClicked(cardId) {
    let formatName = this._formatProduct(this.brandSelected);
    let localName;
    let dateExpiry = this.mappedBrand[cardId].extraInfo.split(':');

    if (this.mappedBrand[cardId].amount !== 0) {
      this.amountCardSelected = this.mappedBrand[cardId].amount;
      localName = 'amount';
    } else {
      this.minAmountCardSelected = this.mappedBrand[cardId].amountMin;
      this.maxAmountCardSelected = this.mappedBrand[cardId].amountMax;
      localName = 'amount-customizable';
    }

    this._dispatchEvent('set-card-extra-detail',
      [{
        key: 'glomo-blackhawk-purchase-detail-supplier',
        class: 'dl-light key-bold margin-m'
      }, {
        key: 'glomo-blackhawk-purchase-detail-supplier-2',
      },
      {
        value: this.t('glomo-blackhawk-purchase-detail-supplier-name'),
        class: 'dl-light'
      }]);

    this._dispatchEvent('set-card-detail-event', [
      {
        key: this.brandSelected.toUpperCase(),
        class: 'dl-light key-bold margin-m'
      },
      {
        key: this.t('glomo-blackhawk-purchase-detail-gift-type-card-title')
      },
      {
        value: this.mappedBrand[cardId].title,
        class: 'dl-light'
      },
      {
        key: this.t('glomo-blackhawk-purchase-detail-gift-title-description')
      },
      {
        value: this.t(`glomo-gift-card-more-info-${formatName}-${localName}`),
        class: 'dl-light'
      },
      {
        key: this.t('glomo-blackhawk-purchase-detail-gift-title-expiration-date')
      },
      {
        value: dateExpiry[1] ? dateExpiry[1].trim() : this.t('glomo-blackhawk-purchase-detail-gift-title-no-validate'),
        class: 'dl-light'
      }
    ]);
    this._dispatchEvent('open-modal-more-info', true);
  }

  /**
    * @desc Dispatch open modal exit
    */
  openModalExit() {
    this._showInfoModal({ id: 'confirm-exit-purchase' });
  }

  /**
   * @desc Error customer detail
   */
  errorCustomerDetail() {
    this.set('userEmail', '');
  }

  /**
   * @desc Show message
   * @param {Boolean} show
   */
  showMessage(show) {
    this._dispatchEvent('show-message-event', !show);
  }

  /**
   * @desc Dispatch an event to do a request to get email
   * @param {Object} payload values of customer
   * @event 'request-customer-addresses-event'
   */
  requestEmail(payload) {
    this.set('customerId', this.get('0.customerId', payload));
    this._dispatchEvent('request-customer-addresses-event');
  }

  /**
   * @desc Obtain customer email
   * @param {Object} payload values of customer
   */
  getEmail(payload) {
    let email = this.get('contactDetails.1.contact', payload);
    this.set('userEmail', email ? email : '');
  }

  /**
   * @desc Reset properties
   * @event 'hidden-show-confirm'
   */
  reset() {
    this.statusButton = true;
    this._buildItemsOptions();
    this._dispatchEvent('hidden-show-confirm', false);
  }

  /**
  * @description resets purchase properties and components
  * @event 'reset'
  * @event 'hidden-show-confirm'
  * @event 'show-message-event'
  */
  resetComplete() {
    if (this.mtuFlag?.makePayment || this.mtuFlag?.cancelPayment) {
      return this.mtuMakePayment();
    }
    this.set('statusButton', true);
    this.set('itemId', undefined);
    this.set('accountSelected', undefined);
    this.set('products', undefined);
    this._dispatchEvent('reset');
    this._dispatchEvent('hidden-show-confirm', false);
    this._dispatchEvent('show-message-event', true);
    this.set('mtuFlag', {});
  }

  /**
   * @description make payment when the user confirm mtu
   */
  mtuMakePayment() {
    if (this.mtuFlag?.makePayment) {
      this.requestCardPurchase();
    }
    this.mtuFlag = {};
  }

  /**
   * @desc Exit to purchase
   * @event 'exit-to-purchase-event'
   */
  exitToPurchase() {
    this.resetComplete();
    this._dispatchEvent('exit-to-purchase-event');
  }

  /**
   * @desc Dispatch an event to go to success page
   * @param {Object} detail
   * @event 'post-tsec-autentication'
   * @event 'data-link-navigation'
   * @event 'post-customer-agreements'
   */
  successResponseCardPurchase(detail) {
    this.getAgreementSuccessData = detail;
    let body = [
      {
        'termType': {
          'id': 'BD-MX-AA-TREGBH-001'
        },
        'acceptanceMethod': {
          'id': this.t('glomo-gift-card-purchase-detail-autorization-electronic')
        },
        'referenceNumber': '',
        'document': {
          'id': 'GMDTCBH001'
        },
        'acceptanceMessages': [
          {
            'value': this.t('glomo-gift-card-purchase-detail-terms-an-condition-payment')
          }
        ]
      }
    ];

    this._dispatchEvent('post-tsec-autentication', {'tsec': this.tsecAutentication.tsec});
    this._dispatchEvent('data-link-navigation', this.getAgreementSuccessData);
    this._dispatchEvent('post-customer-agreements', body);
  }

  /**
   * @desc Get agreement success
   * @event 'post-customer-agreements'
   * @event 'fire-app-completed-event'
   * @event 'data-link-navigation'
   * @event 'set-successfull-data'
   * @event 'navigate-to-success-review'
   */
  getAgreementSuccess(payload) {
    let result = {
      date: (this.get('creationDate', this.getAgreementSuccessData) || ''),
      title: this.t('glomo-gift-card-purchase-detail-payment-success'),
      amountLabel: this.t('glomo-gift-card-purchase-detail-payment-amount-success'),
      origin: {
        avatar: { src: './images/blackHawk/' + this._selectInfoImageList(this.brandSelected) + '.svg' }
      },
      fees: [ {
        text: this.t('glomo-gift-card-purchase-detail-not-generate')
      } ],
      chargeAmount: {
        amount: this.amountBrandSelected.amount, currency: this.localCurrency, class: 'amount-huge-decimals'
      },
      topInfo: [
        {
          key: this.t('glomo-gift-card-purchase-detail-text-gift-card'),
          value: this.brandSelected,
          class: 'spacing-l spacing-top key-bold not-italic'
        },
        {
          key: this.t('glomo-gift-card-purchase-detail-number-term-text'),
          value: '000182251',
          class: 'bold spacing-s flex-description'
        },
        {
          key: this.t('glomo-gift-card-purchase-detail-opetation-type'),
          class: 'header-additional-info__row bold spacing-s  '
        },
        {
          key: this.t('glomo-gift-card-purchase-detail-gift-card-payment'),
          class: 'header-additional-info__row bold spacing-s'
        },
        {
          key: this.t('glomo-gift-card-purchase-detail-account-payment'),
          class: 'header-additional-info__row bold spacing-top'
        },
        {
          key: this.accountSelected.name,
          musk: {
            value: this.accountSelected.id,
            chars: 4,
            simbol: '•'
          },
          class: 'bold spacing-s flex-description'
        },
        {
          key: this.t('glomo-gift-card-purchase-detail-guide'),
          value: (this.get('trackingReference', this.getAgreementSuccessData) || ''),
          class: 'bold spacing-s flex-description'
        },
        {
          key: this.t('glomo-blackhawk-purchase-review-operation-number'),
          class: 'header-additional-info__row bold spacing-top'
        },
        {
          key: this.t('glomo-bbva'),
          value: (this.get('id', this.getAgreementSuccessData) || ''),
          class: 'bold spacing-s flex-description'
        },
        {
          iconMessage: {
            type: 'warning',
            heading: this.t('glomo-gift-card-purchase-detail-title-card-activation'),
            message: this.t('glomo-gift-card-purchase-detail-remember-activation'),
            icon: 'coronita:info',
            iconSize: '{"width": "12", "height": "12"}',
            link: this.t('glomo-gift-card-purchase-detail-get-code')
          },
          class: 'spacing'
        },
        {
          iconMessage: {
            type: 'info-dark-blue',
            heading: this.t('glomo-gift-card-purchase-detail-ticket-payment'),
            icon: 'coronita:info',
            message: this.userEmail,
          }
        }
      ],
      operations: [
        {
          label: 'glomo-blackhawk-purchase-detail-review-share',
          id: 'share',
          icon: 'coronita:share'
        }
      ],
      buttons: {
        primary: {
          text: 'cells-successful-response-next',
          action: 'go-to-next'
        },
        secondary: {
          hidden: true
        }
      }
    };
    this._dispatchEvent('fire-app-completed-event', this.get('id', this.getAgreementSuccessData));
    this._dispatchEvent('data-link-navigation', this.getAgreementSuccessData);
    this._dispatchEvent('set-successfull-data', result);
    this._dispatchEvent('navigate-to-success-review', {
      page: 'blackhawkPurchaseReview'
    });
  }

  /**
   * @desc Error response payments
   * @event mtu-exception-handler-navigation
   */
  errorResponsePayment(eventPayment) {
    if (eventPayment?.['error-code'] === 'KNE6666') {
      this.mtuFlag = {
        makePayment: true,
        cancelPayment: false
      };
      this._dispatchEvent('mtu-exception-handler-navigation', true);
    } else {
      let data = {
        idretry: {
          id: 'PURCHASE-ERROR'
        },
        dataretry: {
          title: this.t('notification-subscription-error-message'),
          fullModal: true,
          header: 'glomo-blackhawk-purchase-detail-supplier-name',
          className: 'error',
          acceptBtLabel: 'alert-GENERIC-ERROR-retry',
          cancelBtLabel: 'alert-GENERIC-ERROR-exit',
          srcImage: this.errorImage,
          message: this.t('glomo-blackhawk-purchase-detail-no-available_system-message')
        }
      };
      this.modalRechargeItems.termsError = data;
      this._showInfoModal({ id: 'termsError' });
    }
  }

  /**
   * @desc Error response terms
   */
  errorResponseTerms() {
    const data = {
      idretry: {
        id: 'TERMS-ERROR'
      },
      dataretry: {
        title: 'notification-subscription-error-message',
        fullModal: true,
        header: 'glomo-blackhawk-purchase-detail-supplier-name',
        className: 'error',
        acceptBtLabel: 'alert-GENERIC-ERROR-retry',
        cancelBtLabel: 'alert-GENERIC-ERROR-exit',
        srcImage: './images/Connectivity.svg',
        message: this.t('glomo-blackhawk-purchase-detail-no-available_system-message')
      }
    };
    this.modalRechargeItems.nameError = data;
    this._showInfoModal({ id: 'nameError' });
  }

  /**
   * @desc Dispatches 'change-collapse' event  to open pdf file
   * @event 'request-post-document'
   * */
  requestDocumentGlobal() {
    this._dispatchEvent('open-control-veil');
    this.detailDownloadConfig.body = {
      'documentTemplate': {
        'id': 'GMDTCBH001',
        'templateType': {
          'id': 'PDF'
        }
      }
    };
    this.detailDownloadConfig.value = `${this.host}/business-documents/v0/business-documents`;
    this.detailDownloadConfig.title = this.t('glomo-about-terms-and-conditions-title', 'Términos y condiciones');
    this._dispatchEvent('request-post-document', this.detailDownloadConfig);
  }

  /**
   * @desc Dispatches 'change-collapse' event  to open pdf file
   * @event 'open-control-veil'
   * @event 'set-business-properties'
   * @event 'request-post-document'
   * */
  requestDocument() {
    this._dispatchEvent('open-control-veil');
    let businessProperties = {
      tsec: this.tsec.token ? this.tsec.token : '',
      deviceId: this.deviceId ? this.deviceId.value : ''
    };
    let requestTerms = {
      documentTemplate: {
        id: 'GMDTCBH001',
        templateType: {
          id: 'PDF'
        }
      }
    };
    this._dispatchEvent('set-business-properties', businessProperties);
    this._dispatchEvent('request-post-document', requestTerms);
  }

  /**
   * @desc if the business document service to get base64 is correct and clean the information to get base64 only
   * @event 'close-control-veil'
   * */
  errorPostRequestBussDoc() {
    this._dispatchEvent('close-control-veil');
  }

  /**
   * @desc if the business document service to get base64 is correct and clean the information to get base64 only
   * @param documentPayload
   * @event 'close-control-veil'
   * @event 'show-document-event'
   * */
  successPostRequestBussDoc(documentPayload) {
    let dato = documentPayload;
    var base64;
    let startBase64 = dato.indexOf('>') + 3;
    let endBase64 = dato.indexOf('=') + 2;

    if (endBase64 <= 2) {
      let foie = dato.substring(startBase64);
      endBase64 = foie.indexOf('-');
      base64 = dato.substring(startBase64, endBase64);
    } else {
      base64 = dato.substring(startBase64, endBase64);
    }
    this.set('baseSrc', base64);
    this.set('docTitle', 'Terminos y condiciones');
    this._dispatchEvent('close-control-veil');
    this._dispatchEvent('show-document-event');
  }

  /**
    * @desc Dispatch open modal exit
    * @event 'post-customer-agreements'
    */
  errorPostResponsePayment(detail) {
    this._dispatchEvent('set-business-properties', {
      tsec: this.tsec ? this.tsec.token : '',
      deviceId: this.deviceId ? this.deviceId.value : ''
    });
    let body = [ {
      termType: {
        id: 'BD-MX-AA-REGTAG-001'
      },
      acceptanceMethod: {
        id: this.t('glomo-gift-card-purchase-detail-autorization-electronic')
      },
      referenceNumber: this.t('glomo-gift-card-purchase-detail-reference-number'),
      acceptanceMessages: [ {
        value: this.t('pase-register-agreements')
      } ]
    } ];
    this._dispatchEvent('post-customer-agreements', body);
  }

  /**
    * @desc set purchase limits
    * @event 'set-min-value-event'
    * @event 'set-max-value-event'
    */
  setPurchaseLimits() {
    this._dispatchEvent('set-option-title', 'glomo-blackhawk-purchase-detail-product');
    let amount = this.mappedBrand[this.itemId].amount  !== 0 ? {
      amount: this.mappedBrand[this.itemId].amount, currency: this.localCurrency
    } : null;

    if (!amount) {
      this._dispatchEvent('focus-in-step-variable-amount');
      this._dispatchEvent('set-min-value-event', this.mappedBrand[this.itemId].amountMin);
      this._dispatchEvent('set-max-value-event', this.mappedBrand[this.itemId].amountMax);
    }
  }

}

customElements.define(GlomoGiftCardManagerPurchaseDetailMx.is, GlomoGiftCardManagerPurchaseDetailMx);
