{
  /*eslint new-cap: [2, {"capIsNewExceptions": ["AmountBehavior"]}]*/
  class GlomoOpxPointsRedeemPurchasesDm extends Polymer.mixinBehaviors([
    CellsBehaviors.i18nBehavior, CellsBehaviors.StepManagerBehavior, CellsBehaviors.CellsCheckNestedKeysBehavior], CellsBehaviors.AmountBehavior(Polymer.Element)) {

    static get is() {
      return 'glomo-opx-points-redeem-purchases-dm';
    }

    static get properties() {
      return {
        /**
        * Data configuration for review
        */
        pointsRedeemPurchasesReview: {
          type: Object,
          value: () => ({}),
          notify: true
        },
        /**
        * Data configuration for review
        */
        pointsRedeemPurchasesReceipt: {
          type: Object,
          value: () => ({}),
          notify: true
        },
        /**
         * Config Step initial image
         * @type {Object}
         */
        configStepsInit: {
          type: Object,
          value: {
            1: {
              active: true,
              blocked: false,
              collapsed: true,
              decorated: false,
              disabled: false,
              fixed: true,
              next: false,
              previous: false,
              scrolled: true,
              skip: false
            },
            2: {
              active: true,
              blocked: false,
              collapsed: true,
              decorated: false,
              disabled: false,
              fixed: true,
              next: false,
              previous: false,
              scrolled: true,
              skip: false
            },
            3: {
              active: true,
              blocked: false,
              collapsed: false,
              decorated: false,
              disabled: false,
              next: false,
              scrolled: false,
              previous: false,
              skip: false
            }
          }
        },

        /**
         * Transactions card
         * @type {Object}
         */
        transactionsCard: {
          type: Object,
          value: () => ({}),
          notify: true
        },

        /**
         * Product summary config data
         * @type {Object}
         */
        productSummaryConfigData: {
          type: Object,
          value: () => ({}),
          notify: true
        },

        /**
         * Parse transactions card
         * @type {Object}
         */
        parseTransactionsCard: {
          type: Object,
          value: () => ({}),
          notify: true
        },

        /**
         * Parse card selected
         * @type {Object}
         */
        parseCardSelected: {
          type: Object,
          value: () => ({}),
          notify: true
        },

        /**
         * Data card from cardDetail
         * @type {Object}
         */
        dataCard: {
          type: Object,
          value: () => ({}),
          notify: true
        },

        /**
         * Product id
         */
        productId: {
          type: String,
          value: ''
        },

        /**
         * Currency
         */
        currency: {
          type: String,
          value: ''
        },

        /**
         * Language
         */
        language: {
          type: String,
          value: ''
        },

        /**
         * Payment amount Simulate response
         */
        paymentAmountSimulate: {
          type: Number,
          notify: true
        },

        /**
         * Conversion amount Simulate response
         */
        conversionAmountSimulate: {
          type: Number,
          notify: true
        },

        /**
         * Error request count
         */
        errorCount: {
          type: Number,
          value: 0,
          notify: true
        },

        /**
         * Navigation from
         */
        navigationFrom: {
          type: String,
          value: ''
        },
        /**
         * Value of card name
         * @type {String}
         */
        cardName: {
          type: String,
          value: ''
        },
        /**
         * Set all cards information
         * @type {Object}
         */
        financialCardData: {
          type: Object,
          value: () => ({})
        },
        /**
         * Cards API version
         */
        cardsApiVersion: {
          type: String,
          value: '0'
        },
        /**
         * Flag to enable pob promotion
         */
        pobPromotionFlag: {
          type: Boolean,
          value: false
        },
        /**
         * Flag for global transactions
         * @type {Boolean}
         */
        transactionsFeatureFlag: {
          type: Boolean,
          value: true
        },
        /**
          * API versions for transactions flag
          * @type {Array}
          */
        loyaltyApiVersions: {
          type: String,
          value: ''
        },
        /**
         * Flag to enable redeem purchases
         * @type {Boolean}
         * @default false
         */
        isRedeemPurchasesFlag: {
          type: Boolean,
          value: false
        }
      };
    }

    /**
    * Array of strings describing multi-property observer methods and their
    * dependant properties
    */
    static get observers() {
      return [
        '_onTransactionSelected(transactionsCard)',
        '_onDataCardSelected(dataCard, productSummaryConfigData)',
        '_onPaymentAmountSimulateObserver(paymentAmountSimulate)',
        '_onGetCardName(financialCardData, productId)'
      ];
    }

    /**
     * Init and manage cache products
     */
    init() {
      this._dispatch('reset-scroll');
      if (this._steps[3].collapsed) {
        this.showConfirm();
      } else {
        this._init();
      }
    }

    /**
     * Init services and step
     */
    _init() {
      this.restart();
    }


    /**
     * Reset method
     */
    reset() {
      this.errorCount = 0;
      this._dispatch('reset-faq-feature', '');
      this.resetSteps();
      this.set('pobPromotionFlag', false);
    }

    /**
    * Restart state steps
    */
    restart() {
      this.errorCount = 0;
      this.resetManagerSteps();
      this._stepsInitConfig();

      // Method of manager step behavior
      this.initSteps();
    }

    /**
    * Set default values in steps.
    */
    resetManagerSteps() {
      this.lastActiveStep = null;
      this.canExecute = false;
      this.hasFinished = false;
      this._lastResponse = null;
    }

    /**
     * Set default values for steps init configuration
     * @override
     */
    _stepsInitConfig() {
      this.stepsInit = Object.assign({}, this.configStepsInit);
    }

    /**
     * Dispatch api version based on flag
     * @event 'set-loyalty-api-version'
     */
    _dispatchLoyaltyVersion() {
      if (this.transactionsFeatureFlag) {
        this._dispatch('set-loyalty-api-version', this.loyaltyApiVersions);
      }
    }

    /**
     * Request convert simulate service
     * /
     */
    requestConvertSimulate() {
      if (this.c(this.dataCard, 'status.id') === 'BLOCKED') {
        this._dispatch('convert-error', this._errorBlockedCardConfig);
        this._dispatch('convert-error-inactive-card');
      } else {
        this._requestService('simulate');
      }
    }

    /**
     * Request convert service
     */
    requestConvert() {
      this._dispatchLoyaltyVersion();
      this._requestService('convert');
    }

    /**
     * Request generic service
     * @param {String} type
     * @event 'request-loyalty-simulate'
     * @event 'request-loyalty-convert'
     */
    _requestService(type) {
      this._openControlVeil();
      let requestBody = {
        contractId: this.productId.toString(),
        productType: {
          id: 'CARDS'
        },
        sourceTransaction: {
          id: this.c(this.transactionsCard, 'id')
        },
        conversionType: {
          id: 'MONEY_TO_REWARD_POINTS'
        }
      };
      this._dispatch(`request-loyalty-${type}`, requestBody);
    }

    /**
     * Method that parse convert simulate response and close veil
     * @param {Object} data
     * @event 'glomo-opx-points-redeem-purchases-operation'
     * @event 'configuration-step-two-points-redeem-purchases'
     * @event 'navigation-to-points-redeem-purchases'
     */
    responseConvertSimulate(data) {
      let response;
      let productItem = {};
      let firstItem = {};
      let secondItem = {};
      let list = [];
      let targetAudience = {};
      let divideHeader = true;
      if (this._isEmptyObject(data)) {
        response = this.get('data', data) || data;
        this.set('paymentAmountSimulate', this.c(response, 'paymentAmount.amount'));
        this.set('conversionAmountSimulate', this.c(this._getOperationSummary(response.operationSumary, 'CONVERSION'), 'operationSumaryItem.conversionAmount.amount'));
        let pointVal = this.c(response, 'conversionFactor');
        productItem = {
          nameProductItem: this.c(this.parseTransactionsCard, 'concept'),
          localCurrencyProductItem: this.currency,
          nameTopToImageProductItem: true,
          imgSrcProductItem: '',
          primaryAmountProductItem: {
            label: `${this.__commafy(Math.abs(Math.trunc(this.c(this.parseTransactionsCard, 'localAmount') / pointVal)).toString(), this.language)} ${this.t('glomo-opx-points-redeem-purchases-points', 'Puntos')}`,
            amount: Math.abs(this.c(this.parseTransactionsCard, 'localAmount')),
            currency: this.currency
          },
          primaryAmountClass: 'amount-large',
          decimalsHiddenProductItem: false,
          infoMessage: this.pobPromotionFlag ? this.t('loyalty-points-transactions-pob-points-promotion-value', '', { pointValue: pointVal }) : `${this.t('cells-step-transaction-selector-info-message', 'Importe a pagar con puntos', { pointValue: pointVal.toPrecision(2) })}`,
          infoIcon: 'coronita:info',
          sizeIcon: { height: 16, width: 16 }
        };

        firstItem = {
          key: this.t('glomo-opx-points-redeem-purchases-amount-pay-with-points', 'Importe a pagar con puntos'),
          class: 'inline points-redeem-purchases-destination-selector',
          localCurrency: this.currency,
          language: this.language,
          value: [ {
            currencyCode: this.currency,
            amount: this.conversionAmountSimulate,
            decimalsHidden: false
          } ],
          infoMessage: this.isRedeemPurchasesFlag ? 'glomo-opx-points-redeem-purchases-information' : 'cells-step-transaction-selector-first-item-info-message',
          infoIcon: 'coronita:info',
          sizeIcon: { height: 16, width: 16 }
        };

        secondItem = {
          key: this.t('glomo-opx-points-redeem-purchases-price-pay-with-card', 'Importe a pagar con tarjeta'),
          class: 'inline margin-top points-redeem-purchases-destination-selector',
          localCurrency: this.currency,
          value: [ {
            currencyCode: this.currency,
            amount: this.paymentAmountSimulate,
            decimalsHidden: false
          } ]
        };

        list = [{
          key: this.t('glomo-opx-points-redeem-purchases-bbva-total-points', 'Puntos BBVA totales'),
          class: 'inline',
          localCurrency: this.currency,
          value: [ {
            amount: this.c(response.balances.find(e => e.id === 'POINTS_BEFORE_CONVERSION'), 'value.value'),
            decimalsHidden: true
          } ]
        },
        {
          key: this.t('glomo-opx-points-redeem-purchases-points-to-used', 'Puntos por utilizar'),
          class: 'inline',
          localCurrency: this.currency,
          language: this.language,
          value: [ {
            amount: -1 * this.c(this._getOperationSummary(response.operationSumary, 'CHARGE'), 'operationSumaryItem.value'),
            decimalsHidden: true,
            class: 'negative white-color'
          } ]
        },
        {
          key: this.t('glomo-opx-points-redeem-purchases-points-to-discount', 'Puntos a descontar'),
          class: 'inline',
          localCurrency: this.currency,
          language: this.language,
          value: [ {
            amount: -1 * this.c(this._getOperationSummary(response.operationSumary, 'PAYMENT'), 'operationSumaryItem.value'),
            decimalsHidden: true,
            class: 'negative white-color'
          } ],
          infoMessage: 'glomo-opx-points-redeem-purchases-points-to-discount-info-message',
          infoIcon: 'coronita:info',
          sizeIcon: { height: 16, width: 16 }
        },
        {
          key: this.t('glomo-opx-points-redeem-purchases-points-remaining', 'Puntos restantes'),
          class: 'inline',
          localCurrency: this.currency,
          language: this.language,
          value: [ {
            amount: this.c(response.balances.find(e => e.id === 'POINTS_AFTER_CONVERSION'), 'value.value'),
            decimalsHidden: true
          } ]
        }];

        targetAudience = this.c(data, 'targetAudience', false);

        const products = [
          { id: 1, name: 'faqs-points-redeem-text-one' },
          { id: 2, name: 'faqs-points-redeem-text-two' },
          { id: 3, name: 'faqs-points-redeem-text-three' }
        ];

        const productPagoConPuntos = [
          { id: 1, name: 'faqs-points-redeem-pay-with-points-title-one' },
          { id: 2, name: 'faqs-points-redeem-pay-with-points-title-two' },
          { id: 3, name: 'faqs-points-redeem-text-three' }
        ];

        this._dispatch('change-title-step', this.isRedeemPurchasesFlag ? 'glomo-opx-points-redeem-purchases-title-step' : 'cells-step-transaction-selector-title');
        this._dispatch('set-questions', this.isRedeemPurchasesFlag ? productPagoConPuntos : products);
        this._dispatch('glomo-opx-points-redeem-purchases-operation', { amount: { amount: this.conversionAmountSimulate, currency: this.currency } });
        this._dispatch('configuration-step-two-points-redeem-purchases', { productItem, firstItem, secondItem, list, divideHeader });
        this._dispatch('glomo-opx-points-redeem-purchases-all-info-for-analytics', {
          'customFields': Math.abs(Math.trunc(this.c(this.parseTransactionsCard, 'localAmount') / pointVal)).toString(),
          'paymentAmount': `${this.__commafy(this.conversionAmountSimulate.toString(), this.language)}`,
          'amount': `${this.__commafy(Math.abs(this.c(this.parseTransactionsCard, 'localAmount')).toString(), this.language)}`,
          'quantity': this.c(this._getOperationSummary(response.operationSumary, 'CHARGE'), 'operationSumaryItem.value').toString(),
          'cardName': this.cardName
        });
      }
      this.errorCount = 0;
      this._closeControlVeil();
      this._dispatch(this.pobPromotionFlag ? 'navigation-to-transaction-redeem' : 'navigation-to-points-redeem-purchases', { productItem, firstItem, secondItem, list, targetAudience, navigationFrom: this.navigationFrom });
    }

    /**
     * Error in conver simulate request
     * @event 'convert-simulate-error'
     * @event 'convert-simulate-service-not-available'
     */
    errorResponseConvertSimulate() {
      this.errorCount++;
      let [eventName, detail] = this.errorCount > 2 ?
        ['convert-simulate-error', this._errorFinalConfig] : ['convert-simulate-error', this._errorModalConfig];
      this._dispatch(eventName, detail);
      this._dispatch('convert-simulate-service-not-available');
      this._closeControlVeil();
    }

    /**
     * Method that invoke to parse convert response and close veil
     * @param {Object} data
     * @event 'navigation-to-points-redeem-purchases-review'
     */
    responseConvert(data) {
      if (this._isEmptyObject(data)) {
        let response = this.get('data', data) || data;
        let result = this._parseConvertResponse(response);
        this.set('pointsRedeemPurchasesReview', result);
        this.set('pointsRedeemPurchasesReceipt', this._prepareShareReceipt(JSON.parse(JSON.stringify(result)), response));
        this._dispatch('reload-transaction-detail', this.transactionsCard);
        this._dispatch('financial-overview-refresh');
        if (this.navigationFrom === 'cardDetail') {
          this._dispatch('navigation-to-points-redeem-purchases-review-from-card-detail');
        } else {
          this._dispatch('navigation-to-points-redeem-purchases-review-from-transaction-list');
        }
      }
      this.errorCount = 0;
      this._steps[3].collapsed = false;
      this._closeControlVeil();
    }

    /**
     * Method that prepare the receipt to share
     * @param {Object} resultCopy
     * @param {Object} data
     */
    _prepareShareReceipt(resultCopy, data) {
      if (resultCopy && data) {
        let headerAmountListMerged = [].concat.apply([], this.c(resultCopy, 'headerAmountList'));
        resultCopy.headerAmountList = headerAmountListMerged;
        resultCopy.fees[0].text = this.c(this._getOperationSummary(data.operationSumary, 'CHARGE'), 'operationSumaryItem.value');
        resultCopy.additionalInfo.find(element => {
          if (element.sharedKey === 'points-redeem-purchases-concept') {
            element.key = element.key + ' ' + element.value;
          } else if (element.sharedKey === 'points-redeem-purchases-operation-number') {
            element.value = [element.value, element.additionalValue];
          }
        });
      }
      return resultCopy;
    }

    /**
     * Error in conver request
     * @event 'convert-error'
     * @event 'convert-service-backend-error'
     */
    errorResponseConvert() {
      this.errorCount++;
      let [eventName, detail] = this.errorCount > 2 ?
        ['convert-error', this._errorConvertFinalConfig] : ['convert-error', this._errorConvertModalConfig];
      this._dispatch(eventName, detail);
      if (this.errorCount > 2) {
        this._dispatch('convert-service-backend-error');
      }
      this._closeControlVeil();
    }

    /**
     * Parse for transferPointsResponse
     * @param {Object} data
     */
    _parseConvertResponse(data) {
      return {
        id: this.productId.toString(),
        date: this.c(data, 'operationDate'),
        title: this.t('glomo-opx-points-redeem-purchases-success-operation', 'Operación exitosa'),
        amountLabel: this.t('glomo-opx-points-redeem-purchases-amount-refunded', 'Con tus puntos pagaste'),
        origin: {
          product: {
            id: 'CARDS',
            name: this.c(this.parseCardSelected, 'name'),
          },
          number: this.c(this.parseCardSelected, 'description.value'),
          avatar: {
            src: this.c(this.parseCardSelected, 'imgSrc'),
            type: 'card'
          }
        },
        fees: [
          {
            text: `${this.t('glomo-opx-points-redeem-purchases-used-points', 'Puntos utilizados')}: ${this.c(this._getOperationSummary(data.operationSumary, 'CHARGE'), 'operationSumaryItem.value')}`,
            amount: null,
            currency: null
          }
        ],
        chargeAmount: {
          amount: this.c(this._getOperationSummary(data.operationSumary, 'CONVERSION'), 'operationSumaryItem.conversionAmount.amount'),
          currency: this.currency,
          class: 'amount-huge-decimals'
        },
        headerAmountList: [
          [
            {
              key: this.t('glomo-opx-points-redeem-purchases-pending-amount', 'Importe a pagar con tarjeta'),
              sharedKey: 'points-redeem-purchases-pending-amount',
              value: {
                amount: this.c(data, 'paymentAmount.amount'),
                currencyCode: this.currency
              },
              class: 'bold margin-m'
            },
          ],
          [
            {
              key: this.t('glomo-opx-points-redeem-purchases-before-balance', 'Saldo anterior TDC'),
              sharedKey: 'points-redeem-purchases-before-balance',
              value: {
                amount: this.c(this._getBalances(data.balances, 'REVOLVING_BEFORE_CONVERSION'), 'value.conversionAmount.amount'),
                currencyCode: this.currency
              },
              class: 'bold margin-m'
            },
            {
              key: this.t('glomo-opx-points-redeem-purchases-after-balance', 'Saldo actualizado TDC'),
              sharedKey: 'points-redeem-purchases-after-balance',
              value: {
                amount: this.c(this._getBalances(data.balances, 'REVOLVING_AFTER_CONVERSION'), 'value.conversionAmount.amount'),
                currencyCode: this.currency
              },
              class: 'bold margin-m'
            },
          ],
        ],
        operations: [
          {
            label: 'cells-successful-response-share-operation',
            id: 'share',
            icon: 'coronita:share',
            disabled: false,
            operative: 'pointsRedeemPurchases'
          }
        ],
        additionalInfo: [
          {
            key: this.c(this.parseCardSelected, 'name'),
            sharedKey: 'points-redeem-purchases-card-number',
            class: 'pan spacing card',
            musk: {
              value: this.c(this.parseCardSelected, 'description.value'),
              chars: 5,
              simbol: '•'
            }
          },
          {
            key: this.t('glomo-opx-points-redeem-purchases-operation-type', 'Tipo de operación'),
            class: 'pan spacing card',
            sharedKey: 'points-redeem-purchases-operation-type',
            value: this.t('glomo-opx-points-redeem-purchases-header-title', 'Pagar con Puntos'),
          },
          {
            key: this.t('glomo-opx-points-redeem-purchases-buy-pay-with-points', 'Compra'),
            class: 'inline'
          },
          {
            key: this.c(this.parseTransactionsCard, 'concept'),
            class: 'pan spacing card',
            sharedKey: 'points-redeem-purchases-concept',
            value: `$${this.__commafy(Math.abs(this.c(this.parseTransactionsCard, 'localAmount')).toString(), this.language)}`,
          },
          this._getFolio(data) ?
            {
              key: this.t('glomo-opx-points-redeem-purchases-operation-number', 'Folio de operación'),
              sharedKey: 'points-redeem-purchases-operation-number',
              value: this.c(data, 'operationTracking.operationNumber'),
              additionalValue: 'BBVA',
              class: 'spacing'
            } :
            {
              key: this.t('glomo-opx-points-redeem-purchases-financial-institution', 'Institución Financiera'),
              sharedKey: 'points-redeem-purchases-operation-number',
              value: 'BBVA',
              class: 'spacing'
            },
          this.pobPromotionFlag ?
            {
              message: {
                type: 'info-dark-blue',
                text: this.t('glomo-opx-points-redeem-purchases-message', '¡Qué bien estás aprovechando tus puntos! Sigue pagando con tu tarjeta de crédito BBVA para generar más puntos y comprar con ellos.'),
                icon: 'coronita:info'
              }
            } :
            {}
        ],
        buttons: {
          primary: {
            text: 'cells-successful-response-next',
            action: 'cells-successful-response-continue-foreign-currency'
          },
          secondary: {
            hidden: true
          }
        }
      };
    }

    /**
    * Get folio from data convert response
    * @param {Object} data
    */
    _getFolio(data) {
      return this.c(data, 'operationTracking.operationNumber');
    }

    /**
    * Get operation summary array
    * @param {Array} operationSumary
    * @param {String} operationType
    */
    _getOperationSummary(operationSumary, operationType) {
      return operationSumary.find(e => e.operationType === operationType);
    }

    /**
    * Get balances summary array
    * @param {Array} balances
    * @param {String} balanceType
    */
    _getBalances(balances, balanceType) {
      return balances.find(e => e.id === balanceType);
    }

    /**
    * Parse transaction selected
    * @param {Object} transactionsCard
    */
    _onTransactionSelected(transactionsCard) {
      if (this._isEmptyObject(transactionsCard)) {
        let parseTransactionsCard = {
          concept: (this.c(transactionsCard, 'concept') || '').toUpperCase(),
          localAmount: this.c(transactionsCard, 'localAmount.amount'),
        };
        this.set('parseTransactionsCard', parseTransactionsCard);
      }
    }

    /**
    * Parse data card
    * @param {Object} dataCard
    * @param {Object} productSummaryConfigData
    */
    _onDataCardSelected(dataCard, productSummaryConfigData) {
      /* global moment */
      if (this._isEmptyObject(dataCard) && this._isEmptyObject(productSummaryConfigData)) {
        let parseCard = {
          productType: 'CARD',
          id: this.c(dataCard, 'cardId', this.c(dataCard, 'id')),
          name: this.c(dataCard, 'alias') || this.c(dataCard, 'title.name', this.c(dataCard, 'product.name')),
          imgSrc: this.c(productSummaryConfigData, 'cardInfo.frontImage'),
          description: {
            value: (this.c(dataCard, 'number') || '').replace('*', ''),
            masked: true
          },
          primaryAmount: {
            label: this.t('glomo-opx-points-redeem-purchases-current-balance', 'Saldo utilizado'),
            amount: this.c(dataCard, 'disposedBalance.currentBalances.0.amount'),
            currency: this.currency
          },
          additionalInformation: [
            {
              key: this.t('glomo-opx-points-redeem-purchases-cut-date', 'Fecha de corte'),
              value: moment(this.c(dataCard, 'cutOffDate')).format('DD MMM YYYY'),
              className: 'additional-info-separate-values'
            },
            {
              key: this.t('glomo-opx-points-redeem-purchases-end-date', 'Fecha límite de pago'),
              value: this._getPaymentDate(dataCard),
              className: 'additional-info-separate-values',
            },
          ],
          additionalInformationSeparator: ''
        };
        this.set('parseCardSelected', parseCard);
      }
    }

    /**
    * Check endDate in payment methods like Card Detail Orange
    * * @param {Object} card
    */
    _getPaymentDate(card) {
      const endDate = this.c(card, 'paymentMethods.0.endDate') ? this.c(card, 'paymentMethods.0.endDate') : this.c(card, 'paymentMethods.0.nextPaymentDate');
      const limitDate = endDate ? moment(endDate, 'YYYY-MM-DD').toDate().toISOString() : undefined;
      const daysDifference = limitDate ? moment(limitDate).endOf('day').diff(moment(), 'days') : 0;
      if (daysDifference <= 0) {
        return this.t('glomo-opx-points-redeem-generic-expired', 'Vencida');
      } else if (daysDifference > 5) {
        return moment(endDate).format('DD MMM YYYY');
      } else {
        return `En ${daysDifference} días`;
      }
    }

    /**
    * Check the param to add in the arrayList two or three strings
    * @param {Number} paymentAmountSimulate
    * @event 'glomo-opx-points-redeem-purchases-list'
    */
    _onPaymentAmountSimulateObserver(paymentAmountSimulate) {
      let arrayList = [
        this.t('glomo-opx-points-redeem-purchases-list-zero-points-one', 'Actualizaremos los saldos de tu tarjeta al momento de pagar con puntos.'),
        this.t('glomo-opx-points-redeem-purchases-list-zero-points-two', 'El importe no cubierto por los puntos será cobrado del saldo disponible de tu tarjeta.'),
        this.t('glomo-opx-points-redeem-purchases-list-zero-points-three', 'Una vez realizada esta transacción, no podremos regresarte los puntos utilizados.')
      ];
      this._dispatch('glomo-opx-points-redeem-purchases-list', arrayList);
    }

    /**
     * Get isRedeemPurchasesFlag value from feature flags
     * @param {Object} featureFlagsCollection
     */
    updatedRedeemPurchasesFlags(featureFlagsCollection) {
      this.isRedeemPurchasesFlag = featureFlagsCollection['glomo.cardTransactionDetail.pointsRedeemPurchases']?.value;
    }

    /**
    * Check if object is empty
    * @param {Object} obj
    */
    _isEmptyObject(obj) {
      return Object.keys(obj || {}).length;
    }

    /**
    * Throw event to open confirm control
    * @event 'close-control-veil'
    */
    showConfirm() {
      this._dispatch('open-confirm', true);
    }

    /**
    * Throw event to close confirm control
    * @event 'close-control-veil'
    */
    hideConfirm() {
      this._dispatch('open-confirm', false);
    }

    /**
    * Throw event to close control veil
    * @event 'close-control-veil'
    */
    _closeControlVeil() {
      this._dispatch('close-control-veil');
    }

    /**
    * Throw event to open control veil
    * @event 'open-control-veil'
    */
    _openControlVeil() {
      this._dispatch('open-control-veil');
    }

    /**
     * Manage close button behavior
     * @event 'show-close-confirm'
     * @event 'navigate-back-button'
     */
    manageCloseButton() {
      let areAllStepsCollapsed = true;
      for (let key in this._steps) {
        if (!this._steps[key].collapsed) {
          areAllStepsCollapsed = false;
        }
      }
      if (areAllStepsCollapsed) {
        this._dispatch('show-close-confirm', this._closeModalConfig);
      } else {
        this.navigateBackAndReset();
      }
    }

    /**
     * Close points redeem
     */
    closePointsRedeem() {
      this.errorCount = 0;
      this._dispatch('navigate-back-button', {});
    }

    /**
     * Reload transaction detail after points redeem purchase
     */
    reloadTransactionDetailAfterPointsRedeem() {
      this.reset();
      this._dispatch('reset-page');
      this._dispatch('reload-detail', this.productId);
    }

    /**
     * Returns close modal configuration
     */
    get _closeModalConfig() {
      return {
        code: 'POINTS-REDEEM-EXIT-OPERATIVE',
        selectedConfig: {
          className: 'error exit',
          openMaximized: false,
          iconOnlyFullHeight: true,
          acceptBtLabel: 'glomo-points-redeem-exit',
          cancelBtLabel: 'glomo-points-redeem-continue',
          template: {
            type: 'paragraphs',
            values: [
              {
                icon: 'coronita:alert',
                class: 'spacing'
              },
              { text: 'glomo-points-redeem-back-step-modal-message' }
            ]
          }
        }
      };
    }


    /**
     * Returns error final configuration for convert simulate service
     */
    get _errorFinalConfig() {
      return {
        code: 'POINTS-REDEEM-ERROR-FINAL-OPERATIVE',
        selectedConfig: {
          className: 'full-height-error info points-redeem-purchases',
          openMaximized: true,
          iconOnlyFullHeight: true,
          title: 'glomo-opx-points-redeem-error-title',
          heroImage: './images/errors/error.svg',
          acceptBtLabel: 'glomo-opx-points-redeem-error-exit',
          cancelFromHeaderEvent: 'cancel_from_Header',
          template: {
            type: 'paragraphs',
            values: [
              { title: 'glomo-opx-points-redeem-error-final-title' },
              { text: 'glomo-opx-points-redeem-error-final-message' }
            ]
          }
        }
      };
    }

    /**
     * Returns error modal configuration for convert simulate service
     */
    get _errorModalConfig() {
      return {
        code: 'POINTS-REDEEM-ERROR-MODAL-OPERATIVE',
        selectedConfig: {
          className: 'full-height-error info points-redeem-purchases',
          openMaximized: true,
          iconOnlyFullHeight: true,
          title: 'glomo-opx-points-redeem-error-title',
          heroImage: './images/errors/error.svg',
          acceptBtLabel: 'glomo-opx-points-redeem-error-modal-retry',
          cancelBtLabel: 'glomo-opx-points-redeem-error-exit',
          cancelFromHeaderEvent: 'cancel_from_Header',
          template: {
            type: 'paragraphs',
            values: [
              { title: 'glomo-opx-points-redeem-error-final-title' },
              { text: 'glomo-opx-points-redeem-error-modal-message' }
            ]
          }
        }
      };
    }

    /**
     * Returns error final configuration for convert service
     */
    get _errorConvertFinalConfig() {
      return {
        code: 'POINTS-REDEEM-ERROR-CONVERT-FINAL-OPERATIVE',
        selectedConfig: {
          className: 'full-height-error info points-redeem-purchases-white-header',
          openMaximized: true,
          iconOnlyFullHeight: true,
          title: 'glomo-opx-points-redeem-generic-error-title',
          heroImage: './images/errors/error.svg',
          acceptBtLabel: 'glomo-opx-points-redeem-error-call',
          cancelBtLabel: 'glomo-opx-points-redeem-error-exit',
          cancelFromHeaderEvent: 'cancel_from_Header',
          template: {
            type: 'paragraphs',
            values: [
              { title: 'glomo-opx-points-redeem-error-final-title' },
              { text: 'glomo-opx-points-redeem-error-final-message' }
            ]
          }
        }
      };
    }

    /**
     * Returns error modal configuration for convert service
     */
    get _errorConvertModalConfig() {
      return {
        code: 'POINTS-REDEEM-ERROR-CONVERT-MODAL-OPERATIVE',
        selectedConfig: {
          className: 'error',
          openMaximized: false,
          iconOnlyFullHeight: true,
          acceptBtLabel: 'glomo-opx-points-redeem-error-modal-retry',
          cancelBtLabel: 'glomo-opx-points-redeem-error-exit',
          cancelFromHeaderEvent: 'cancel_from_Header',
          template: {
            type: 'paragraphs',
            values: [
              {
                icon: 'coronita:alert',
                class: 'spacing'
              },
              { title: 'glomo-opx-points-redeem-error-final-title' },
              { text: 'glomo-opx-points-redeem-error-modal-message' }
            ]
          }
        }
      };
    }

    /**
     * Returns error final configuration for convert service
     */
    get _errorBlockedCardConfig() {
      return {
        code: 'POINTS-REDEEM-ERROR-CONVERT-FINAL-OPERATIVE',
        selectedConfig: {
          className: 'full-height-error info points-redeem-purchases-white-header',
          openMaximized: true,
          iconOnlyFullHeight: true,
          title: 'glomo-opx-points-redeem-pending-title',
          heroImage: './images/errors/error.svg',
          acceptBtLabel: 'glomo-opx-points-redeem-pending-button',
          cancelFromHeaderEvent: 'cancel_from_Header',
          template: {
            type: 'paragraphs',
            values: [
              { title: 'glomo-opx-points-redeem-error-final-blocked-card-title' },
              { text: 'glomo-opx-points-redeem-error-final-blocked-card-message' }
            ]
          }
        }
      };
    }

    /**
     * Call help number
     */
    callHelpNumber() {
      this._dispatch('open-call-action', {
        url: 'tel:' + this.contactNumber,
        windowTarget: 'external'
      });
      window.open(`tel:${this.contactNumber}`, '_system');
    }

    /**
     * Navigate back and reset
     */
    navigateBackAndReset() {
      this.reset();
      this._dispatch('navigate-back-button');
    }

    /*FAQ points redeem*/
    faqsResponse(data) {
      const getText = () => {
        const isRedeem = this.isRedeemPurchasesFlag;
        const id = this.c(data, 'id');
        return {
          1: isRedeem ? 'response-text-faq-one-points-redeem-pay-with-points' : 'response-text-faq-one-points-redeem',
          2: isRedeem ? 'response-text-faq-two-points-redeem-pay-with-points' : 'response-text-faq-two-points-redeem',
          3: isRedeem ? 'response-text-faq-three-points-redeem-pay-with-points' : 'response-text-faq-three-points-redeem',
          4: 'response-text-faq-four-points-redeem'
        }[id];
      };

      let faqsResponsePage = {
        code: 'faqs-response',
        selectedConfig: {
          className: 'info button-less header--white close-button--right faqsPointsRedeem',
          openMaximized: true,
          iconOnlyFullHeight: true,
          closeIcon: 'coronita:close',
          closeIconSize: 20,
          title: this.isRedeemPurchasesFlag ? 'faqs-points-redeem-response-title-pay-with-points' : 'faqs-points-redeem-response-title',
          template: {
            type: 'paragraphs',
            values: [
              {
                title: this.c(data, 'name'),
                class: 'text-align-left  simple-title'
              },
              {
                text: getText(),
                class: 'spacing text-align-left  title-payment-information'
              }
            ]
          }
        }
      };
      this.dispatchEvent(new CustomEvent('faqs-translated-question-event', {
        detail: this.t(this.c(data, 'name'))
      }));
      this.dispatchEvent(new CustomEvent('faqs-response-event', {
        detail: faqsResponsePage
      }));
    }

    /**
     * Get navigation from and reload params
     */
    getNavigationFromAndReload(data) {
      this.navigationFrom = this.c(data, 'navigationFrom');
      if (this.c(data, 'reloadTransactionDetailAfterPointsRedeem')) {
        this.reloadTransactionDetailAfterPointsRedeem();
      } else {
        this._dispatch('loaded', false);
      }
    }

    /**
     * Get data to use in transaction detail
     * @param {Object} data
     */
    getDataToTransactionDetail(data) {
      this.pobPromotionFlag = this.c(data, 'pobPromotionFlag', false);
      this.getNavigationFromAndReload(data);
      this._dispatch('set-pob-promotion-flag', this.pobPromotionFlag);
    }

    /**
     * Get card name from selected cad
     * @param {Object} financialCardData all information of user cards
     * @param {String} productId id of selected product
     */
    _onGetCardName(financialCardData, productId) {
      if (Object.entries(financialCardData).length && productId) {
        const data = this.c(financialCardData, 'data.contracts')
          .find(element => element.id === `${productId}` && (element.productType === 'CARDS' || element.productType === 'CARD'));
        this.cardName = this.c(data, 'product.name', '').toLowerCase()
          .normalize('NFD')
          .replace(/[^a-zA-Z0-9 ]/g, '');
        this._dispatch('glomo-opx-points-redeem-purchases-set-info-click-start', this.cardName);
      }
    }

    /**
     * Management steps for analytics
     */
    manageStepsAnalytics() {
      const step = Object.keys(this._steps).filter(index => !this._steps[index].collapsed);
      let eventName = 'get-analytics-';
      if (step.length > 0) {
        eventName += step[0] === '1' ? 'initial' : `step-${step[0]}`;
      } else {
        eventName += 'last-step';
      }
      this._dispatch(eventName);
    }

    /**
     * Dispatch event to open faq with feature
     */
    openFaqPageWithFeature() {
      this._dispatch('set-header-faq', this.t('faqs-points-redeem-response-title'));
      this._dispatch('open-faq-page', {feature: 'rewardsPointsRedeem'});
    }

    /**
     * Custom dispatch
     * @param {String} eventName
     * @param {Object} detail
     */
    _dispatch(eventName, detail = {}) {
      this.dispatchEvent(new CustomEvent(eventName, {
        bubbles: true,
        composed: true,
        detail: detail
      }));
    }

  }

  customElements.define(GlomoOpxPointsRedeemPurchasesDm.is, GlomoOpxPointsRedeemPurchasesDm);

}
