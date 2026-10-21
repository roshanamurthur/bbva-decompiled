{
  const {
    html,
  } = Polymer;
  /**
    `<glomo-deposits-purchase-dm>` Description.
    * @customElement glomo-deposits-purchase-dm
    * @polymer
    * @extends {Polymer.Element}
    * @demo demo/index.html
  */
  /*eslint new-cap: [1, {"capIsNewExceptions": ["GlomoDepositsMixin"]}]*/
  /*global moment*/
  class GlomoDepositsPurchaseDm extends CellsBehaviors.GlomoDepositsMixin([CellsBehaviors.CellsCheckNestedKeysBehavior, Polymer.Element]) {
    static get is() {
      return 'glomo-deposits-purchase-dm';
    }

    static get properties() {
      return {
        /**
         * receive account information
         * @type {Object}
         */
        dataAccount: {
          type: Object
        },
        /**
         * Stores accounts
         * @type {Object}
         */
        accounts: {
          type: Object,
          value: () => ({})
        },
        /**
         * @desc input amount values
         * @type {Object}
         */
        inputAmount: {
          type: Object,
          notify: true,
          value: () => ({})
        },
        /**
         * @desc type of time deposits
         * @type {String}
         */
        depositTimeType: {
          type: String,
          value: 'DAYS'
        },
        /**
         * @desc origin type deposits
         * @type {String}
         */
        originType: {
          type: String,
          value: 'REQUESTED_BY_CUSTOMER'
        },
        /**
         * @desc ralation type deposits
         * @type {String}
         */
        relationType: {
          type: String,
          value: 'LINKED_DESTINATION'
        },
        /**
         * @desc code error S&F deposit purchase
         * @type {String}
         */
        codeErrorStoreAndForward: {
          type: String,
          value: 'QGE1011'
        },
        /**
        * @desc BG out of time error
        * @type {String}
        */
        codeOutTimeError: {
          type: String,
          value: 'BGE0832'
        },
        /**
         * @desc limit amount error
         * @type {String}
         */
        limitAmountError: {
          type: String,
          value: 'CNE0234'
        },
        /**
         * @desc addinional code out time response api error
         * @type {String}
        */
        additionalCodeTime: {
          type: String,
          value: 'BGE3318'
        },
        /**
         * @desc Response Simulator data
         * @type {Object}
         */
        responseSimulator: {
          type: Object
        },
        /**
         * @desc config option buttons for deposit
         * @type {Object}
         */
        expirationInstructions: {
          type: Object
        },
        /**
         * counter attempts
         * @type {Number}
         */
        _counterAttempts: {
          type: Number,
          value: 0
        },
        /**
         * @type {String}
         * @description day value of simulator
         */
        _simulatorDays: {
          type: String,
          value: '',
        },
        /**
         * @desc amount value of simulator
         * @type {String}
         */
        _simulatorAmount: {
          type: String
        },
        /**
         * @desc allow next step
         * @type {Boolean}
         */
        _allowNextStep: {
          type: Boolean,
          value: false
        },
        /**
         * @desc default flow config
         * @type {Object}
         */
        defaultSettings: {
          type: Object,
          value: {
            enable: true,
            minimumAmount: 2000,
            termDays: [1, 7, 28, 91, 182],
            defaultAmount: 2000,
            defaultTermDays: 28,
            indexDefault: 2
          }
        },
        /**
         * @desc default config msg S&F
         * @type {Object}
         */
        outOfHoursMessage: {
          type: Object,
          value: {
            icon: 'coronita:caution',
            type: 'warning-dark',
            iconSize: '12',
            class: '',
            message: ''
          }
        },
        /**
         * @desc variable para term
         * @type {Number}
         */
        termNumber: {
          type: Number,
          value: 0
        },
        /**
         * @desc the user Email @type {String}
         **/
        userEmail: {
          type: String,
          value: ''
        },
        /**
         * @desc native global cache storege glomomx @type {Object}
         **/
        globalUser: {
          type: Object
        },
        /**
         * Control view Gat Real and Nominal in page success
         * @type {Boolean}
         */
        helpBtnInfo: {
          type: Boolean,
          value: false
        },
        apiVersion: {
          type: String,
          value: '0'
        },
        /** @desc info Deposit Hiring flag promotion @type {Object} */
        couponNative: {
          type: Object,
          value: () => ({})
        },
        /** @desc Encrypted data to consume the voucher service @type {String} */
        environment: {
          type: String,
          value: ''
        },
        /** @desc Info header coupon @type {Object} */
        couponHeader: {
          type: Object,
          value: () => ({})
        },
        /** @desc Information shown on the body of the coupon @type {Array} */
        couponData: {
          type: Array,
          value: () => []
        },
        /** @desc Response from coupon services (API) @type {Object} */
        successCoupon: {
          type: Object,
          value: () => ({})
        },
        /** @desc Respuesta del nuevo simulador sobre la gat ESTO AUN NO ESTA (API) @type {Object} */
        couponOffer: {
          type: Object,
          value: () => ({})
        },
        /** @desc Information received from the coupon to validate the minimum amount and the days for applying the promotion @type {Object} */
        infoCouponComparative: {
          type: Object,
          value: () => ({})
        },
        /** @desc Information about min and max days @type {Object} */
        termConditions: {
          type: Object,
          value: () => ({})
        },
        /** @desc Promotion date of the service response coupon @type {Object} */
        dateCoupon: {
          type: Array,
          value: () => []
        },
        /** @desc validate the continue button @type {Boolean} */
        _enableButtonContinue: {
          type: Boolean,
          value: false
        },
        /** @desc Coupon valid @type {Object} */
        validCupon: {
          type: Boolean,
          value: false
        },
        /** @desc Porcentaje of the value  code in service simulate v2  @type {Boolean} */
        itemizeRates: {
          type: Boolean,
          value: false
        },
        /**
       * @description account feature flags
       * @type {Object}
       */
        featureFlagCollection: {
          type: Object,
          value: () => ({})
        },
        featureFlags: {
          type: Object,
          value: () => ({
            'depositsPurchaseCoupon': {}
          })
        },
        /** @desc valid success services promotion @type {Boolean} */
        promotionValid: {
          type: Boolean,
          value: false,
          notify: true
        },
        percentagesCoupons: {
          type: Object,
          value: () => ({})
        },
        datesCouponModal: {
          type: Object,
          value: () => ({})
        }
      };
    }

    static get observers() {
      return [
        '_manageAccount(accounts, featureFlagCollection)'
      ];
    }

    /**
     * @desc method that initiates the mapping and calling of functions for subsequent purchase
     */
    initDataPage(payload) {
      this.resetPurchase();
      this.depositSpinner(true);
      this.dataAccount = payload;
      this.$.accountDm.getAccounts();
      this.getAppSettings();
      this.setInstructions([false, false, false]);
      this._getHoursSF();
      this.depositSpinner(false);
      this.couponOffer = {};
    }

    /**
     * @description Validate list
     * @param {Array} list
     * @returns Boolean
     */
    _validList(list) {
      return list && Array.isArray(list) && list.length > 0;
    }

    /**
     * @description validate the input amount
     * @param {Number} amount
     * @returns Boolean
     */
    _validateInputAmount(amount) {
      const { amountMin } = this.infoCouponComparative;
      const maxBalance = parseInt(this.maxAvailableBalance);
      const minimumAmount = this.defaultSettings.minimumAmount;
      const isValidAmount = amount <= maxBalance && (amountMin === undefined || amount >= minimumAmount);
      return isValidAmount;
    }

    /**
     * @description Assign a featureFlags the flag belonging to the flow
     * @param {Object} featureFlagCollection
     */
    _parseFeatureFlag(featureFlagCollection) {
      const _featureFlags = this.featureFlags;
      Object.keys(_featureFlags).forEach(flag => {
        this.set(`featureFlags.${flag}`,
          this.get('value', featureFlagCollection['glomo.investments.depositsPurchaseCoupon'])
        );
      });
      this._fireEvent('set-feature-flags', this.featureFlags);
    }

    /**
     * @description Fire the request to campaings DM
     * @param {Object} payload
     */
    getPromotionCode(payload) {
      if (payload.depositsPurchaseCoupon) {
        const body = { promotionCode: 'NOCOUPON', offerId: this.environment };
        this.$.dmCampaings.postRedeemCoupon(body);
      } else {
        this.generateDepositSimulate();
      }
    }

    /**
     * @desc get deposit app settings
     */
    getAppSettings() {
      const slideValues = this.defaultSettings.termDays;
      this.depositAppSettings = {
        amount: {
          default: this.defaultSettings.defaultAmount,
          minimum: this.defaultSettings.minimumAmount,
        },
        slideSnaps: slideValues.map(snap => slideValues.indexOf(snap)),
        slideValues: slideValues,
        selectedValue: slideValues.indexOf(this.defaultSettings.defaultTermDays)
      };
    }

    /**
     * @desc check if the coupon is valid
     */
    _validateCupon() {
      const { minDays, maxDays, amountMin } = this.infoCouponComparative;
      const isTermValid = this._simulatorDays >= parseInt(minDays) && this._simulatorDays <= parseInt(maxDays);
      if (isTermValid && this._simulatorAmount >= amountMin) {
        this.validCupon = true;
      } else {
        this.validCupon = false;
      }
    }

    /**
     * @desc Build body for generate deposit simulate
     */
    generateDepositSimulate() {
      this._validateCupon();
      if (this._simulatorAmount < this.depositAppSettings.amount.minimum || this._simulatorAmount === '') {
        this._fireEvent('disable-simulator-button', true);
        this._fireEvent('purchase-hiden-spinner-simulator-offer', true);
      } else {
        this._fireEvent('purchase-hiden-spinner-simulator-offer', false);
        this.depositSpinner(true);
        let body = {
          depositsSimulate: true,
          maturityDate: moment(new Date()).format(this.maturityDateFormat),
          initialAmount: [ { amount: this._simulatorAmount, currency: this.localCurrency } ],
          terms: { number: this._simulatorDays, unit: 'DAYS' },
          relatedContracts: [ { id: this.depositAccount.number } ]
        };
        if (this.environment && this.promotionValid) {
          body = {
            ...body,
            isCouponUsed: true,
            product: {
              id: this.get('product.id', this.successCoupon),
              subProduct: { id: this.get('product.subproduct.id', this.successCoupon) }
            },
            dueDate: this.get('benefit.dueDate', this.successCoupon),
            promotionCode: this.get('benefit.benefitType.value', this.successCoupon),
            title: { id: '0003' }
          };
        }
        this._fireEvent('info-process-promotion-code', this.promotionValid);
        if (body.terms.number !== '' && body.initialAmount[0].amount !== '' && body.relatedContracts[0].id) {
          this.$.dmDeposits.postDepositsSimulate(body);
        } else {
          this.modalErrorOperation('simulate', 'exit');
        }
      }
    }

    /**
     * @desc when call account service manage the response
     */
    _manageAccount(accounts, featureFlagCollection) {
      if (this._validateProperties()) {
        this._parseFeatureFlag(featureFlagCollection);
        const number = this.dataAccount.relatedContracts.number;
        const account = this.accounts.find(item => item.number === number);
        if (account === undefined || account.meta.accountLevel === 'N2') {
          this._modalInitPageErrors(false);
        }
        this.depositAccount = {
          alias: account.alias,
          id: account.accountId,
          number: account.number,
          amount: account.availableBalance.currentBalances[0].amount,
          currency: account.availableBalance.currentBalances[0].currency
        };
        this.maxAvailableBalance = this.depositAccount.amount;
        this._setDepositDetalInfo();
        if (this.depositAccount.amount < this.defaultSettings.minimumAmount) {
          this._modalInitPageErrors(true);
        } else {
          this.setDataSimulator();
          this.getPromotionCode(this.featureFlags);
        }
      }
    }

    /**
     * Validates that the properties contain a value
     * @returns {Boolean}
     */
    _validateProperties() {
      const existProperties = this.accounts && this.featureFlagCollection;
      const hasContent = existProperties
        && Object.keys(this.accounts).length
        && Object.keys(this.featureFlagCollection).length;
      return hasContent && this._validList(Object.keys(this.featureFlagCollection));
    }

    /**
     * @desc Set properties for step deposits simulator
     * @event 'set-default-amount' event that set default amount value
     */
    setDataSimulator() {
      this.inputAmount = {
        default: {
          amount: this.depositAppSettings.amount.default,
          currency: this.localCurrency
        },
        min: {
          amount: this.depositAppSettings.amount.minimum,
          currency: this.localCurrency
        }
      };
      this.slider = {
        title: 'glomo-step-deposits-simulator-in-a-term',
        unit: 'glomo-step-deposits-simulator-unit',
        singleUnit: 'glomo-step-deposits-simulator-single-unit',
        min: 0,
        max: 4,
        step: 1,
        snaps: this.depositAppSettings.slideSnaps,
        arrayValues: this.depositAppSettings.slideValues,
        selectedValue: this.depositAppSettings.selectedValue
      };
      this._simulatorDays = this.defaultSettings.defaultTermDays.toString();
      this._simulatorAmount = this.inputAmount.default.amount;
      this.depositTimeType = 'DAY';
      this._fireEvent('set-default-amount', {
        amount: parseInt(this.depositAppSettings.amount.default),
        currency: '$'
      });
    }

    /**
     * @desc Truncate number decimals
     */
    truncate(num, places) {
      return Math.trunc(num * Math.pow(10, places)) / Math.pow(10, places);
    }

    /**
     * @desc Receive deposits simulate success response API
     * @param {Object} payload
     */
    manageResponseSuccessSimulate(payload) {
      const amountMin = this.get('benefit.amounts.0.amount', this.successCoupon);
      const responseData = this.get('detail.data', payload);
      const realGat = `${this.truncate(this.get('annualTotalProfit.rates.3.unit.percentage', responseData), 2)}%`;
      const annualRate = this.truncate(this.get('annualRate', responseData), 2);
      this.termNumber = `${this._computeTerm(this.get('terms.number', responseData))}`;
      this.totalInterests = {
        amount: this.get('scheduledInterestPayments.0.capital.amount', responseData),
        currency: this.get('scheduledInterestPayments.0.capital.currency', responseData)
      };
      if (this.get('rates', responseData)) {
        const percentage = this.get('rates.itemizeRates.0.itemizeRateUnits.0.percentage', responseData);
        this.percentagesCoupons = {
          percentageAnual: this.get('annualRate', responseData),
          percentageAnualPromo: percentage
        };
      }
      this.offerData = {
        detail: {
          title: this.t('glomo-deposit-hiring-offer-data-detail-title'),
          values: [
            {
              key: this.t('glomo-deposit-hiring-offer-data-detail-fixed-rate'),
              value: `${annualRate}%`,
              class: 'value-bold'
            },
            {
              key: this.t('glomo-deposit-hiring-offer-data-detail-before-taxes-gain'),
              afterKey: `(${this.t('glomo-deposit-hiring-offer-data-detail-gross-interest')})`,
              value: {
                amount: this.get('totalGrossBenefits.amount', responseData),
                currencyCode: this.get('totalGrossBenefits.currency', responseData)
              },
              localCurrency: this.get('totalGrossBenefits.currency', responseData),

              language: this.currentLanguage,
              class: ''
            },
            {
              key: this.t('glomo-deposit-hiring-offer-data-detail-interest-isr-tax'),
              afterKey: `(${this.t('glomo-deposit-hiring-offer-data-detail-total-tax')})`,
              value: {
                amount: `-${this.get('taxes.itemizeTaxes.0.itemizeTaxUnits.0.amount', responseData)}`,
                currencyCode: this.get('taxes.itemizeTaxes.0.itemizeTaxUnits.0.currency', responseData),
                class: 'non-color'
              },
              localCurrency: this.get('taxes.itemizeTaxes.0.itemizeTaxUnits.0.currency', responseData),
              language: this.currentLanguage,
              class: '',
              configMessage: {
                type: 'info-dark',
                icon: 'coronita:info',
                message: 'glomo-deposits-purchas-info-config-message',
                messageClass: 'message-input message'
              }
            },
            {
              key: this.t('glomo-deposit-hiring-offer-data-detail-final-gain'),
              afterKey: `(${this.t('glomo-deposit-hiring-offer-data-detail-net-interest')})`,
              value: {
                amount: this.get('totalNetBenefits.amount', responseData),
                currencyCode: this.get('totalNetBenefits.currency', responseData)
              },
              localCurrency: this.get('totalNetBenefits.currency', responseData),

              language: this.currentLanguage,
              class: ''
            }
          ],
          additionalTaxes: [
            {
              text: `<span class="bold-tax">${this.t('glomo-deposit-hiring-offer-data-detail-nominal-gat')}</span><br> ${this.t('glomo-deposit-hiring-offer-data-detail-before-taxes')}`,
              percentage: `${this.truncate(this.get('annualTotalProfit.rates.1.unit.percentage', responseData), 2)}%`,
              class: 'bold-tax',
              icon: 'coronita:help',
              iconMessage: {
                type: 'info-dark',
                icon: 'coronita:info',
                message: 'glomo-deposits-purchas-info-additional-taxes',
                messageClass: 'message-input message-deposit'
              }
            },
            {
              text: `<span class="bold-tax">${this.t('glomo-deposit-hiring-offer-data-detail-real-gat')}</span><br> ${this.t('glomo-deposit-hiring-offer-data-detail-before-taxes')}`,
              percentage: realGat,
              icon: 'coronita:help',
              iconMessage: {
                type: 'info-dark',
                icon: 'coronita:info',
                message: 'glomo-deposits-purchas-info-additional-taxes',
                messageClass: 'message-input message-deposit'
              }
            }
          ]
        },
        amount: {
          amount: this.get('scheduledInterestPayments.0.capital.amount', responseData),

          currency: '$'
        },
        summary: {
          values: [
            {
              key: 'cells-step-deposits-offer-page-filled-investment-amount',
              value: {
                amount: this.get('initialAmount.0.amount', responseData),

                currencyCode: '$'
              },
              localCurrency: this.get('initialAmount.0.currency', responseData),

              language: this.currentLanguage,
              class: ''
            },
            {
              key: this.t('glomo-deposit-hiring-offer-data-summary-term'),
              value: this.termNumber,
              class: ''
            },
            {
              key: this.t('glomo-deposit-hiring-offer-data-summary-expiration-date'),
              value: moment(responseData?.scheduledInterestPayments[0].settlementDate).format(this.depositDateFormat),

              class: ''
            },
            {
              key: this.t('glomo-deposit-hiring-offer-data-detail-fixed-rate'),
              value: `${annualRate}%`,
              class: ''
            },
            {
              key: this.t('glomo-deposit-hiring-offer-data-detail-gross-interest'),
              value: {
                amount: this.get('totalGrossBenefits.amount', responseData),

                currencyCode: '$'
              },
              localCurrency: this.get('totalGrossBenefits.currency', responseData),

              language: this.currentLanguage,
              class: 'padding-key'
            },
            {
              key: this.t('glomo-deposit-hiring-offer-data-detail-total-tax'),
              value: {
                amount: `-${this.get('taxes.itemizeTaxes.0.itemizeTaxUnits.0.amount', responseData)}`,

                currencyCode: '$',
                class: 'white-color'
              },
              localCurrency: this.get('taxes.itemizeTaxes.0.itemizeTaxUnits.0.currency', responseData),

              language: this.currentLanguage,
              class: ''
            },
            {
              key: this.t('glomo-deposit-hiring-offer-data-detail-net-interest'),
              value: {
                amount: this.get('totalNetBenefits.amount', responseData),

                currencyCode: '$'
              },
              localCurrency: this.get('totalNetBenefits.currency', responseData),

              language: this.currentLanguage,
              class: 'padding-key'
            },
            {
              key: this.t('glomo-deposit-hiring-offer-data-detail-nominal-gat'),
              value: `${this.truncate(responseData?.annualTotalProfit.rates[1].unit.percentage, 2)}%`,

              class: ''
            },
            {
              key: this.t('glomo-deposit-hiring-offer-data-detail-before-taxes'),
              class: 'after-key deposit-help-icon',
              keyIcon: 'coronita:help',
              infoMessage: {
                type: 'info-light',
                icon: 'coronita:info',
                message: 'glomo-deposits-purchas-info-summary-values',
                messageClass: 'message-input'
              }
            },
            {
              key: this.t('glomo-deposit-hiring-offer-data-detail-real-gat'),
              value: realGat,
              class: ''
            },
            {
              key: this.t('glomo-deposit-hiring-offer-data-detail-before-taxes'),
              class: 'after-key deposit-help-icon',
              keyIcon: 'coronita:help',
              infoMessage: {
                type: 'info-light',
                icon: 'coronita:info',
                message: 'glomo-deposits-purchas-info-summary-values',
                messageClass: 'message-input'
              }
            },
            this._verifyPromotionApplied()
          ]
        }
      };
      if (this._allowNextStep) {
        this.set('disableOfferButton', false);
      }
      this.depositSpinner(false);
      this._fireEvent('set-offer-simulation-data', {
        amount: {
          amount: parseInt(this._simulatorAmount),
          currency: '$'
        },
        maxAvailableBalance: this.depositAccount?.amount,
        min: this.depositAppSettings?.amount.minimum,
        sliderValues: this.depositAppSettings?.slideValues,
        selectedSliderIndex: this.depositAppSettings?.selectedValue,
        offerData: this.offerData,
        disabledNextButton: !this._enableButtonContinue,
        totalInterests: {
          amount: this.get('scheduledInterestPayments.0.capital.amount', responseData),

          currency: '$'
        },
        rate: this.get('taxes.itemizeTaxes.0.itemizeTaxUnits.0.amount', responseData),
        depositList: [
          {
            title: this.t('cells-step-deposits-offer-page-list-title'),
            list: [
              this.t('cells-step-deposits-offer-page-list-item'),
              this.t('cells-step-deposits-offer-page-list-item-1')
            ],
            background: '',
            bullet: 'medium-blue',
            font: ''
          }
        ],
      });
      if (this.validCupon && this._simulatorAmount >= amountMin) {
        this._showComparativeCoupon();
      } else {
        this._fireEvent('show-panel-comparative', false);
      }
      this._fireEvent('disable-simulator-button', !this._enableButtonContinue);
    }

    /**
     * @desc Set offer day from deposit offer
     * @param {Object} evt
     */
    offerSliderChanged(evt) {
      this.depositAppSettings.selectedValue = evt;
      this._simulatorDays = this.depositAppSettings.slideValues[evt];
      this.generateDepositSimulate();
    }

    /**
     * @desc Set offer amount from deposit offer
     * @param {Object} evt
     */
    offerAmountChanged(evt) {
      const minimumAmount = this.defaultSettings.minimumAmount;
      this._simulatorAmount = evt.amount;
      if (this._simulatorAmount >= minimumAmount) {
        this.generateDepositSimulate();
      } else {
        this._fireEvent('show-panel-comparative', false);
      }
    }

    /**
     * @desc Shows information about the coupon such as expiration date and minimum amount
     * @param {Object} evt
     */
    manageSuccessResponseCoupon(evt) {
      this.promotionValid = true;
      this.validCupon = true;
      this.successCoupon = this.get('detail', evt);
      this._parseGetPromotionCodeSuccessfulResponse();
      this.generateDepositSimulate();
    }

    _parseGetPromotionCodeSuccessfulResponse() {
      const months = ['enero', 'febrero', 'marzo', 'abril', 'mayo', 'junio', 'julio', 'agosto', 'septiembre', 'octubre', 'noviembre', 'diciembre'];
      this.dateCoupon = this.get('benefit.dueDate', this.successCoupon);
      const datesCoupon = this.dateCoupon?.split('-');
      const couponMonth = months?.[ parseInt(datesCoupon?.[1], 10) - 1 ];
      const couponDay = this.get('2', datesCoupon);
      const couponYear = this.get('0', datesCoupon);
      this.termConditions = (this.get('benefit.termConditions', this.successCoupon))?.split('|');
      const minimumDay = this.get('0', this.termConditions);
      const maximunDay = this.get('1', this.termConditions);
      this.infoCouponComparative = {
        amountMin: this.get('benefit.amounts.0.amount', this.successCoupon),
        minDays: minimumDay,
        maxDays: maximunDay
      };
      this.datesCouponModal = {
        day: couponDay,
        month: couponMonth,
        year: couponYear
      };
      const title = this.t('glomo-deposit-purchase-header-promotion-coupon').toUpperCase();
      this.couponHeader = { text: title, icon: 'coronita:help', HeaderClass: 'coupon-header' };
      const days = this._computeTerm(this.get('minDays', this.infoCouponComparative));
      this.couponData = [
        {
          id: 'coupon-offer',
          titleText: 'glomo-deposit-purchase-title-coupon',
          text: this.get('maxDays', this.infoCouponComparative) === undefined ?
            `${this.t('glomo-deposit-purchase-text-coupon-item-one')}${this.infoCouponComparative?.amountMin} ${this.t('glomo-deposit-purchase-text-coupon-item-three')} ${days}.`
            : `${this.t('glomo-deposit-purchase-text-coupon-item-one')}${this.infoCouponComparative?.amountMin} ${this.t('glomo-deposit-purchase-text-coupon-item-two')} ${days}.`,
          src: 'images/offers/loan/bbva-tag.svg',
          isImage: true,
          altText: 'glomo-deposit-purchase-title-coupon',
          moreInfo: `Hasta el ${couponDay} de ${couponMonth}`,
          textClass: 'button-description'
        }
      ];
      this._fireEvent('set-promotion-header-purchase', this.couponHeader);
      this._fireEvent('set-promotion-body-purchase', this.couponData);
    }

    /**
     * @desc reset propierties coupon
     * @param {Object} evt
     */
    manageErrorResponseCoupon(evt) {
      this._fireEvent('set-promotion-header-purchase', {});
      this._fireEvent('set-promotion-body-purchase', []);
      this.validCupon = false;
      this.promotionValid = false;
      this.generateDepositSimulate();
    }

    /**
     * @desc Shows the comparative table about such as rates
     */
    _showComparativeCoupon() {
      this.validCupon = true;
      this.promotionValid = true;
      this.couponOffer = {
        className: 'spacing-slider comparative-cupon-header',
        alignRight: true,
        containerDynamicStyle: 'division-comparative-white',
        firstElement: { title: this.t('glomo-deposit-purchase-itemize-rates-coupon'), amount: `${this.percentagesCoupons.percentageAnualPromo}` },
        secondElement: { title: this.t('glomo-deposit-purchase-annual-rate-coupon'), amount: `${this.percentagesCoupons.percentageAnual}` },
        currencyCode: '%',
        titleHeader: {
          title: this.t('glomo-deposit-purchase-title-header-comparative-coupon'),
          class: 'header-title'
        }
      };
      this._fireEvent('send-comparative-coupon', this.couponOffer);
      this._fireEvent('show-panel-comparative', this.validCupon);
    }

    /**
     * @desc Shows the text 'Promoción aplicada' in summary section while validCoupon to be true
     */
    _verifyPromotionApplied() {
      return this.validCupon ?
        {
          key: '',
          class: 'cupon-applied',
          keyIcon: '',
          infoMessage: {
            type: 'info-light',
            icon: 'coronita:correct',
            message: 'glomo-deposit-purchase-summary-promotion-applied',
            messageClass: 'message-input'
          }
        } : {};
    }

    /**
     * @desc Shows the text 'Promoción aplicada' in receipt page while validCoupon to be true
     */
    _veryfyPromotionSuccess() {
      return this.validCupon ? {
        text: 'glomo-deposit-purchase-review-promotion-applied',
        atomIcon: {
          value: 'coronita:correct',
          class: 'icon-size-20',
          iconSize: 20
        }
      } : {};
    }

    /**
     * @desc Disable button deposit offer when input amount changed
     */
    offerInputAmountChanged(payload) {
      if (payload === null || payload === '') {
        this._fireEvent('reset-simulator-input-text', '');
        this._fireEvent('show-panel-comparative', false);
      }
      this._enableButtonContinue = this._validateInputAmount(this._simulatorAmount);
      this._fireEvent('disable-simulator-button', true);
    }

    /**
     * @desc Mapping Stiky data title and amount
     */
    setDataStiky() {
      const summaryViewTitle = `${this.t('glomo-deposit-purchase-summary-title')} ${this.termNumber} ${this.t('glomo-deposit-purchase-summary-title-value')}`;
      const amountStickyValue = {
        amount: {
          amount: this.totalInterests.amount,
          currency: '$'
        }
      };
      this._fireEvent('send-info-stiky-deposit-puchase', amountStickyValue);
      this._fireEvent('send-title-stiky-deposit-puchase', summaryViewTitle);
    }

    /**
     * @desc object changed focus radioSelected radio buttons
     */
    configButtons(payload) {
      this.expirationInstructions = payload.radioSelected;
    }

    /**
     * @desc Build object data model for request (POST)
     */
    generateDepositImposition() {
      const promotionCode = this.validCupon ? this.get('benefit.benefitType.value', this.successCoupon) : '';
      const payload = {
        depositId: this.dataAccount.depositId,
        body: {
          initialAmount: {
            amount: parseInt(this._simulatorAmount),
            currency: this.localCurrency
          },
          renovationType: {
            id: this.expirationInstructions.type,
            description: this.expirationInstructions.values[0]
          },
          term: {
            number: this._simulatorDays,
            impositionTimeType: {
              id: this.depositTimeType
            }
          },
          relatedContracts: [
            {
              contractId: this.dataAccount.relatedContracts.number
            },
            {
              contractId: this.dataAccount.relatedContracts.number,
              relationType: {
                id: this.relationType
              }
            }
          ],
          origin: {
            originType: {
              id: this.originType
            }
          },
          product: {
            id: '13',
            subProduct: {
              id: '0300'
            }
          },
          maturityDate: moment(new Date()).format(this.maturityDateFormat),
          dueDate: this.get('benefit.dueDate', this.successCoupon),
          promotionCode: promotionCode,
          title: { id: '0003' },
          coupon: {
            rate: 4.0,
            isUsed: this.validCupon
          }
        }
      };
      this._fireEvent('send_data_request_deposit-puchase', payload);
      this.responseSimulator = payload;
    }

    /**
     * @desc Add info user in mock success
     */
    _userInfo(payload) {
      payload.userEmail = this.userEmail;
      payload.userName = this.globalUser.firstName;
      return { ...payload };
    }

    /**
     * @desc Response Success cells-dm-global-apis-deposits
     */
    depositSuccess(payload) {
      const success = this._userInfo(payload);
      this._successDepositPurchases(success);
    }

    /**
     * @description validate the error message with a regular expresion of the code
     * @param {String} code
     * @param {String} errorMessage
     */
    _validCodeExp(code, errorMessage) {
      return RegExp(code, 'gi').test(errorMessage);
    }

    /**
     * @description manage common purchases sale response API error
     * @param {Object} payload
     */
    manageResponseErrors(payload) {
      const errorMessage = this.c(payload, ['messages', 0, 'message'], '');
      this.depositSpinner(false);
      if (this._validCodeExp(this.codeErrorStoreAndForward, errorMessage)) {
        const data = this._userInfo(payload);
        this._inProcessDepositSuccess(data);
      } else if (this._validCodeExp(this.codeOutTimeError, errorMessage) || this._validCodeExp(this.additionalCodeTime, errorMessage)) {
        this.manageResponseOutTimeUpdate();
      } else {
        this._modalRetryError();
      }
    }

    /**
     * @desc Concatenates single unit with single day and unit if it is not single day
     * @param {String} day selected day
     * @returns string with '1 day' or '2 days' ex.
     */
    _computeTerm(day) {
      return day === '1' ? `${day} ${this.t('glomo-deposit-purchase-summary-day')}` : `${day} ${this.t('glomo-deposit-purchase-summary-days')}`;
    }

    /**
     * @desc Shows the message of promissory note after hours
     */
    _getHoursSF() {
      const hours = new Date().getHours();
      const hrBefore = 20;
      const hrAfter = 8;
      if (hours >= hrBefore || hours < hrAfter) {
        this.outOfHoursMessage.message = this.t('glomo-deposits-purchas-info-message-time');
        const message = this.outOfHoursMessage;
        this._fireEvent('purchase-sale-out-of-hours-message', message);
      } else {
        this._fireEvent('purchase-sale-out-of-hours-message', {});
      }
    }

    /**
     * @desc Reset data depositsPurchaseSale Pendiente
     */
    resetPurchase() {
      this._enableButtonContinue = false;
      this.dataAccount = {};
      this.accounts = {};
      this.getAppSettings();
      this._fireEvent('set-offer-simulation-data', {
        sliderValues: this.depositAppSettings.slideValues,
        selectedSliderIndex: this.depositAppSettings.selectedValue
      });
      this.depositSpinner(false);
      this._fireEvent('reset-deposit-puchase-flow');
    }

    /**
     * @desc refresh list dashboard
     */
    refreshToDashboard() {
      this._fireEvent('refresh-deposit-puchase-to-dashboard', true);
    }


    /**
     * @desc Operation in process page deposits imposition
     */
    _inProcessDepositSuccess(message) {
      const folio = message.messages[0].message.split(' ')[1].slice(0, 15);
      const days = this._computeTerm(this.responseSimulator.body.term.number);
      const value = this.offerData.summary.values;
      const processData = {
        status: 'pending',
        type: 'core',
        id: '',
        date: new Date(),
        title: 'glomo-deposits-purchas-sucessfull-title-pending',
        amountLabel: 'glomo-deposits-purchas-sucessfull-amount-label',
        origin: {
          product: { name: message.userName }
        },
        coupon: this._veryfyPromotionSuccess(),
        chargeAmount: {
          amount: this.offerData.amount.amount,
          currency: '$',
          class: 'amount-huge-decimals'
        },
        headerAdditionalListInfo: [
          {
            key: 'glomo-deposits-purchas-sucessfull-header-import',
            value: {
              amount: value[0].value.amount,
              currencyCode: '$'
            },
            localCurrency: '',
            language: this.currentLanguage
          },
          {
            key: 'glomo-deposits-purchas-sucessfull-header-interest',
            value: value[3].value,
          },
          {
            key: 'glomo-deposits-purchas-sucessfull-header-maturity',
            value: {
              amount: this.get('4.value.amount', value),
              currencyCode: this.get('4.value.currencyCode', value)
            },
            localCurrency: '',
            language: this.currentLanguage
          },
          {
            key: 'glomo-deposits-purchas-sucessfull-header-total-tax',
            value: {
              amount: this.get('5.value.amount', value),
              currencyCode: this.get('5.value.currencyCode', value),
              class: 'white-color'
            },
            localCurrency: '',
            language: this.currentLanguage,
            infoMessage: {
              type: 'info-light',
              icon: 'coronita:info',
              message: 'glomo-deposits-purchase-sale-icon-messagge-list-info',
              messageClass: 'message-input message-icon-helpers-list'
            }
          },
          {
            key: 'glomo-deposits-purchas-sucessfull-net-interest',
            value: {
              amount: this.get('6.value.amount', value),
              currencyCode: this.get('6.value.currencyCode', value)
            },
            localCurrency: '',
            language: this.currentLanguage
          }
        ],
        headerHelpersList: [
          {
            key: 'glomo-deposit-hiring-offer-data-detail-nominal-gat',
            value: value[7].value,
            class: 'cells-key-values-without-space normal'
          },
          {
            key: 'glomo-deposit-hiring-offer-data-detail-before-taxes',
            icon: 'coronita:help',
            class: 'cells-key-values-without-space normal'
          },
          {
            key: '',
            value: '',
            class: 'cells-key-values-message-helpers-list cells-key-values-without-space',
            icon: '',
            infoMessage: {
              type: 'info-light',
              icon: 'coronita:info',
              message: 'glomo-deposits-purchase-tax-info',
              messageClass: 'message-input'
            }
          },
          {
            key: 'glomo-deposit-hiring-offer-data-detail-real-gat',
            value: value[9].value,
            class: 'cells-key-values-without-space normal'
          },
          {
            key: 'glomo-deposit-hiring-offer-data-detail-before-taxes',
            icon: 'coronita:help',
            class: 'cells-key-values-without-space normal'
          },
          {
            key: '',
            value: '',
            class: 'cells-key-values-message-helpers-list cells-key-values-without-space',
            icon: '',
            infoMessage: {
              type: 'info-light',
              icon: 'coronita:info',
              message: 'glomo-deposits-purchase-tax-info',
              messageClass: 'message-input'
            }
          },
        ],
        topInfo: [
          {
            key: 'glomo-deposit-hiring-info-title-amount',
            value: 'glomo-deposits-purchas-sucessfull-check-account',
            musk: {
              value: this.depositAccount.number,
              chars: 4,
              simbol: '•'
            },
            class: 'spacing'
          },
          {
            key: 'cells-transaction-detail-deposit-term',
            value: days,
            class: 'spacing light-key'
          },
          {
            key: 'cells-transaction-detail-investment-end-date',
            value: value[2].value,
            class: 'spacing light-key'
          },
          {
            key: 'glomo-deposits-purchase-title-radio-buttons',
            value: this.responseSimulator.body.renovationType.description,
            class: 'spacing light-key'
          },
          {
            key: 'glomo-deposit-hiring-info-title-mask',
            value: this.get('number', this.dataAccount).substring(10),
            class: 'spacing light-key'
          },
          {
            key: 'cells-transaction-detail-deposit-investment-concept',
            value: 'glomo-deposits-purchas-sucessfull-promissory',
            class: 'spacing light-key'
          },
          {
            key: 'glomo-deposits-purchas-sucessfull-type-of-currency',
            value: 'glomo-deposits-purchas-sucessfull-national-currency',
            class: 'spacing light-key'
          },
          {
            key: 'glomo-deposits-configuration-success-operation-number',
            value: folio,
            class: 'light-key'
          },
          {
            key: 'glomo-deposits-purchas-sucessfull-bbva',
            class: 'spacing'
          },
          {
            iconMessage: {
              type: 'warning-dark',
              message: 'glomo-deposits-purchas-sucessfull-pending-info-one',
              icon: 'coronita:caution'
            },
            class: 'spacing'
          },
          {
            iconMessageSecondary: {
              type: 'info-dark',
              icon: 'coronita:info',
              message: 'glomo-deposits-purchas-sucessfull-pending-info-two',
              link: 'glomo-deposits-purchas-sucessfull-more',
            },
            class: 'spacing'
          }
        ],
        bottomInfo: [
          {
            key: 'glomo-deposits-configuration-success-operation-email',
            musk: {
              value: message.userEmail,
              chars: 12,
              simbol: '•'
            },
            class: 'bold spacing md'
          }
        ],
        operations: [],
        buttons: {
          primary: {
            text: 'salir',
            action: 'navigate-to-dashboard',
          },
          secondary: { hidden: true }
        }
      };
      this._fireEvent('send-data-success-deposit', { result: processData, pending: true });
      this.resetPurchase();
    }

    /**
     * @desc Init success page deposits imposition
     */
    _successDepositPurchases(dataSuccess) {
      const days = this._computeTerm(this.get('data.term.number', dataSuccess));
      const gatReal = `${this.truncate(this.get('data.annualTotalProfit.rates.1.unit.percentage', dataSuccess), 2)}%`;
      const gatNominal = `${this.truncate(this.get('data.annualTotalProfit.rates.0.unit.percentage', dataSuccess), 2)}%`;
      const successData = {
        id: this.get('data.id', dataSuccess),
        date: this.get('openingDate', dataSuccess) || new Date(),

        title: 'glomo-deposits-purchas-sucessfull-title',
        amountLabel: 'glomo-deposits-purchas-sucessfull-amount-label',
        origin: {
          product: { name: this.get('userName', dataSuccess) }
        },
        coupon: this._veryfyPromotionSuccess(),
        chargeAmount: {
          amount: this.get('data.totalNetBenefits.amount', dataSuccess),
          currency: '$',
          class: 'amount-huge-decimals'
        },
        headerAdditionalListInfo: [
          {
            key: 'glomo-deposits-purchas-sucessfull-header-import',
            value: {
              amount: this.get('data.initialAmount.amount', dataSuccess),

              currencyCode: '$'
            },
            localCurrency: this.get('data.initialAmount.currency', dataSuccess),

            language: this.currentLanguage
          },
          {
            key: 'glomo-deposits-purchas-sucessfull-header-interest',
            value: `${this.truncate(this.get('data.annualTotalProfit.rates.2.unit.percentage', dataSuccess), 2)}%`
          },
          {
            key: 'glomo-deposits-purchas-sucessfull-header-maturity',
            value: {
              amount: this.get('data.interestPayment.liquidationWindows.0.interests.0.grossBenefit.amount', dataSuccess),
              currencyCode: this.get('data.interestPayment.liquidationWindows.0.interests.0.grossBenefit.currency', dataSuccess)
            },
            localCurrency: this.get('data.interestPayment.liquidationWindows.0.interests.0.grossBenefit.currency', dataSuccess),
            language: this.currentLanguage
          },
          {
            key: 'glomo-deposits-purchas-sucessfull-header-total-tax',
            value: {
              amount: `-${this.get('data.taxes.itemizeTaxes.0.amount', dataSuccess)}`,
              currencyCode: this.get('data.taxes.itemizeTaxes.0.currency', dataSuccess),
              class: 'white-color'
            },
            localCurrency: this.get('data.taxes.itemizeTaxes.0.currency', dataSuccess),
            language: this.currentLanguage,
            infoMessage: {
              type: 'info-light',
              icon: 'coronita:info',
              message: 'glomo-deposits-purchase-sale-icon-messagge-list-info',
              messageClass: 'message-input message-deposit'
            }
          },
          {
            key: 'glomo-deposits-purchas-sucessfull-net-interest',
            value: {
              amount: this.get('data.interestPayment.liquidationWindows.0.interests.0.netBenefit.amount', dataSuccess),
              currencyCode: this.get('data.interestPayment.liquidationWindows.0.interests.0.netBenefit.currency', dataSuccess)
            },
            localCurrency: this.get('data.interestPayment.liquidationWindows.0.interests.0.netBenefit.currency', dataSuccess),
            language: this.currentLanguage
          }
        ],
        headerHelpersList: [
          {
            key: 'glomo-deposit-hiring-offer-data-detail-nominal-gat',
            value: gatNominal,
            class: 'cells-key-values-without-space normal'
          },
          {
            key: 'glomo-deposit-hiring-offer-data-detail-before-taxes',
            icon: 'coronita:help',
            class: 'cells-key-values-without-space normal'
          },
          {
            key: '',
            value: '',
            class: 'cells-key-values-message-helpers-list cells-key-values-without-space',
            icon: '',
            infoMessage: {
              type: 'info-light',
              icon: 'coronita:info',
              message: 'glomo-deposits-purchase-tax-info',
              messageClass: 'message-input'
            }
          },
          {
            key: 'glomo-deposit-hiring-offer-data-detail-real-gat',
            value: gatReal,
            class: 'cells-key-values-without-space normal'
          },
          {
            key: 'glomo-deposit-hiring-offer-data-detail-before-taxes',
            class: 'cells-key-values-without-space normal',
            icon: 'coronita:help',
          },
          {
            key: '',
            value: '',
            class: 'cells-key-values-message-helpers-list cells-key-values-without-space',
            icon: '',
            infoMessage: {
              type: 'info-light',
              icon: 'coronita:info',
              message: 'glomo-deposits-purchase-tax-info',
              messageClass: 'message-input'
            }
          },
        ],
        topInfo: [
          {
            key: 'glomo-deposit-hiring-info-title-amount',
            value: 'glomo-deposits-purchas-sucessfull-check-account',
            musk: {
              value: this.get('data.relatedContracts.0.contractId', dataSuccess),
              chars: 4,
              simbol: '•'
            },
            class: 'spacing'
          },
          {
            key: 'cells-transaction-detail-deposit-term',
            value: days,
            class: 'spacing light-key'
          },
          {
            key: 'Fecha de vencimiento',
            value: moment(dataSuccess.maturityDate).format(this.depositDateFormat),
            class: 'spacing light-key'
          },
          {
            key: 'glomo-deposits-purchase-title-radio-buttons',
            value: this.get('data.renovationType.description', dataSuccess),
            class: 'spacing light-key'
          },
          {
            key: 'glomo-deposit-hiring-info-title-mask',
            value: this.get('number', this.dataAccount).substring(10),
            class: 'spacing light-key'
          },
          {
            key: 'cells-transaction-detail-deposit-investment-concept',
            value: 'glomo-deposits-purchas-sucessfull-promissory',
            class: 'spacing light-key'
          },
          {
            key: 'glomo-deposits-purchas-sucessfull-type-of-currency',
            value: 'glomo-deposits-purchas-sucessfull-national-currency',
            class: 'spacing light-key'
          },
          {
            key: 'glomo-deposits-configuration-success-operation-number',
            value: this.get('data.operationData.operationNumber', dataSuccess),
            class: 'light-key'
          },
          {
            key: 'glomo-deposits-purchas-sucessfull-bbva',
            class: 'spacing'
          },
          {
            iconMessage: {
              type: 'info-dark',
              message: 'glomo-deposits-purchas-sucessfull-info-one',
              icon: 'coronita:info',
            },
            class: 'spacing'
          },
          {
            iconMessageSecondary: {
              type: 'info-dark',
              icon: 'coronita:info',
              message: 'glomo-deposits-purchas-sucessfull-info-two',
              link: 'glomo-deposits-purchas-sucessfull-more',
            },
            class: 'spacing'
          }
        ],
        bottomInfo: [
          {
            key: 'glomo-deposits-configuration-success-operation-email',
            musk: {
              value: this.get('userEmail', dataSuccess),

              chars: 12,
              simbol: '•',
            },
            class: 'bold spacing md'
          }
        ],
        operations: [],
        buttons: {
          primary: {
            text: 'salir',
            action: 'navigate-to-dashboard',
            class: 'buttons button'
          },
          secondary: { hidden: true }
        }
      };
      this._fireEvent('send-data-success-deposit', { result: successData, pending: false });
      this.resetPurchase();
    }

    /**
     * @desc modal info gat nominal or gat real
     */
    modalInfoOfferPage(id) {
      let mock = {
        code: 'HELP-MODAL-PURCHASE-OFFER-PAGE',
        selectedConfig: {
          openMaximized: true,
          iconOnlyFullHeight: undefined,
          title: '',
          className: '',
          acceptBtLabel: 'glomo-deposits-modal-help-understood',
          template: ''
        }
      };
      if (id === 0 || id === 8 || (id === 1 && this.helpBtnInfo)) {
        mock.selectedConfig.title = 'cells-transaction-detail-investment-gat-nom-help_page-title';
        mock.selectedConfig.template = {
          type: 'paragraphs',
          values: [
            {
              icon: 'coronita:help',
              iconClass: 'icon-size-30',
              class: 'info-dark text-center margin-top-none'
            },
            {
              title: 'glomo-deposits-purchas-modal-gat-nominal-title',
              class: 'simple-title'
            },
            {
              text: 'glomo-deposits-purchas-modal-gat-nominal-one',
              class: 'spacing text-center'
            },
            {
              text: 'glomo-deposits-purchas-modal-gat-nominal-two',
              class: 'spacing text-center'
            }
          ]
        };
      } else if (id === 1 || id === 4 || id === 10) {
        mock.selectedConfig.title = 'cells-transaction-detail-investment-gat-real-help_page-title';
        mock.selectedConfig.template = {
          type: 'paragraphs',
          values: [
            {
              icon: 'coronita:help',
              iconClass: 'icon-size-30',
              class: 'info-dark text-center margin-top-none'
            },
            {
              title: 'glomo-deposits-purchas-modal-gat-real-title',
              class: 'simple-title'
            },
            {
              text: 'glomo-deposits-purchas-modal-gat-real-one',
              class: 'spacing text-center'
            },
            {
              text: 'glomo-deposits-purchas-modal-gat-real-two',
              class: 'spacing text-center'
            }
          ]
        };
      }
      this._fireEvent('send-info-help-offer-page-modal', mock);
    }

    /**
     * @desc Shows modal to know more about the promotion coupon
     */
    modalHelpInformation() {
      const days = this._computeTerm(this.infoCouponComparative.minDays);
      const text = this.infoCouponComparative.maxDays === undefined ?
        `${this.t('glomo-deposit-purchase-text-coupon-item-one')} ${this.infoCouponComparative.amountMin} ${this.t('glomo-deposit-purchase-text-coupon-item-three')} ${days}.`
        : `${this.t('glomo-deposit-purchase-text-coupon-item-one')}${this.infoCouponComparative.amountMin} ${this.t('glomo-deposit-purchase-text-coupon-item-two')} ${days}.`;
      const configCouponHelp = {
        code: 'MODAL-HELP-INFORMATION',
        primaryButtonClass: 'button-secondary--white-core-blue',
        selectedConfig: {
          className: 'full-height-info header--white image--mid spacing',
          heroImage: 'images/offers/loan/bbva-tag.svg',
          openMaximized: true,
          title: 'glomo-deposit-purchase-header-promotion-coupon',
          acceptBtLabel: 'glomo-deposit-purchase-button-agree',
          template: {
            type: 'paragraphs',
            values: [
              { title: 'glomo-deposit-purchase-modal-bullet-title-coupon', class: 'text-center spacing content-container simple-title' },
              { text: 'glomo-deposit-purchase-modal-bullet-subtitle-coupon', class: 'text-center spacing' },
              { title: 'glomo-deposit-purchase-modal-bullet-list-title-coupon', class: 'text-align-left' },
              {
                list: [
                  `${text}`,
                  `${this.t('glomo-deposit-purchase-modal-first-bullet-list-coupon')}${this.datesCouponModal.day} ${this.t('glomo-deposit-purchase-title-more-info-second-item-coupon')} ${this.datesCouponModal.month} ${this.t('glomo-deposit-purchase-title-more-info-second-item-coupon')} ${this.datesCouponModal.year} ${this.t('glomo-deposit-purchase-modal-second-bullet-list-coupon')}`,
                  'glomo-deposit-purchase-modal-list-three-coupon'
                ],
                class: 'cells-lists-with-text-left'
              }
            ]
          }
        }
      };
      this._fireEvent('modal-help-information', configCouponHelp);
    }

    /**
     * @desc method retry errors Glomomx
     */
    showCallError() {
      this.modalExitPuchaseSale();
    }

    /**
     * @desc modal exit page flow
     */
    modalExitPuchaseSale() {
      const config = {
        code: 'DEPOSITS-PURCHASE-SALE',
        selectedConfig: {
          className: 'alert error',
          openMaximized: false,
          iconOnlyFullHeight: true,
          acceptBtLabel: this.t('glomo-deposits-modal-btn-exit'),
          cancelBtLabel: this.t('glomo-deposits-modal-btn-cancel'),
          template: {
            type: 'paragraphs',
            values: [
              {
                icon: 'coronita:alert'
              },
              {
                text: 'glomo-deposits-purchas-modal-exit'
              }
            ]
          }
        }
      };
      this._fireEvent('modal-sale-exit-puchase', config);
    }

    /**
     * @desc modal IPAB
     */
    modalIpabInfo() {
      const alertIpabInfo = {
        code: 'DEPOSIT-IPAB',
        selectedConfig: {
          className: '',
          openMaximized: true,
          title: 'glomo-deposits-purchase-success-info-ipab',
          acceptBtLabel: 'glomo-deposits-modal-help-understood',
          template: {
            type: 'paragraphs',
            values: [
              {
                icon: 'coronita:help',
                class: 'info-dark'
              },
              { title: 'glomo-deposits-purchase-success-ipab' },
              {
                text: 'glomo-deposits-purchase-success-ipab-text',
                class: 'spacing'
              },
              { text: 'glomo-deposits-purchase-success-ipab-link' },
            ]
          }
        }
      };
      this._fireEvent('modal-info-ipab', alertIpabInfo);
    }

    /**
     * @desc Modal errors case n2 or beneficiaries
     */
    _modalInitPageErrors(datail) {
      let config = {};
      if (datail) {
        config = {
          code: 'DEPOSITS-PURCHASE-Modal-Minimal-Amount',
          selectedConfig: {
            className: 'alert error',
            openMaximized: false,
            noCancelOnOutsideClick: true,
            iconOnlyFullHeight: true,
            acceptBtLabel: this.t('glomo-deposits-modal-btn-exit'),
            cancelBtLabel: '',
            template: {
              type: 'paragraphs',
              values: [
                { icon: 'coronita:alert' },
                { text: 'glomo-deposits-purchase-minimal-amount' }
              ]
            }
          }
        };
      } else {
        config = {
          code: 'DEPOSITS-PURCHASE-Modal-Bank',
          selectedConfig: {
            title: 'glomo-deposits-purchase-sale-title',
            className: 'full-height-info spacing image--sd',
            heroImage: './images/errors/error.svg',
            openMaximized: true,
            iconOnlyFullHeight: true,
            acceptBtLabel: 'glomo-deposits-modal-help-understood',
            cancelBtLabel: '',
            template: {
              type: 'paragraphs',
              values: [
                {
                  title: 'glomo-deposits-purchase-modal-address-bank',
                  class: 'spacing'
                },
                {
                  text: 'glomo-deposits-purchase-modal-address-bank-one',
                  class: 'spacing'
                },
                {
                  text: 'glomo-deposits-purchase-modal-address-bank-two',
                  class: 'spacing'
                },
                {
                  icon: 'coronita:place',
                  class: 'spacing',
                  type: 'info',
                  message: 'Sucursales'
                }
              ]
            }
          }
        };
      }
      this._fireEvent('deposit-purchase-error-init-page', config);
    }

    /**
     * @description get modal error operation for retry errors
     * @event 'retry-error' start retry error manage
     */
    _modalRetryError() {
      this._fireEvent('retry-error', {
        retryErrorData: {
          errorId: 'deposits_purchase',
          errorType: 'operation',
          retryConfig: {
            srcImage: this.heroImageError,
            header: this.modalHeadTitle,
            title: 'glomo-deposits-modal-fault-operation',
            message: 'glomo-deposits-modal-fault-operation-message',
            acceptBtLabel: 'glomo-deposits-modal-btn-retry',
            cancelBtLabel: this.btnLabelCancel,
            fullModal: true,
          },
          callConfig: {
            isProductDetail: true,
            hidden: true,
          },
        }
      });
    }

  }

  customElements.define(GlomoDepositsPurchaseDm.is, GlomoDepositsPurchaseDm);
}