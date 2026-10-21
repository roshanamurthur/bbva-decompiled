/*global moment*/
/* global GlomoDepositsDmMixin */
class GlomoDepositsDmMx extends GlomoDepositsDmMixin.mixin(Polymer.Element) {
  static get is() {
    return 'glomo-deposits-dm-mx';
  }

  static get properties() {
    return {
      /**
      * @desc The account id for the services
      * @type {String}
      */
      _accountId: {
        type: String,
        value: ''
      },
      /**
      * @desc Review the accout is valid
      * @type {Boolean}
      */
      _checkNext: {
        type: Boolean,
        value: false
      },
      /**
      * @desc Deposits API version
      * @type {String}
      */
      accountsApiVersion: {
        type: String,
        value: '0'
      },
      /**
      * @desc Accounts list
      * @type {Array}
      */
      _accountsList: {
        type: Array,
        value: () => []
      },
      /**
      * @desc Accounts list
      * @type {Array}
      */
      products: {
        type: Array,
        value: () => []
      },
      /**
      * @desc Accepts base64 string or pdf url
      * @type {String}
      */
      baseSrc: {
        type: String,
        notify: true
      },
      /**
       * @Desc Data about contract
       * @type
       */
      _contractId: {
        type: String,
        value: ''
      },
      /**
      * @desc Counter account
      * @type {Number}
      */
      _counterAccount: {
        type: Number,
        value: 0
      },
      /**
      * @desc Current language
      * @type {String}
      */
      currentLanguage: {
        type: String,
        value: 'es-MX'
      },
      /**
      * @desc Default settings
      * @type {Object}
      */
      defaultSettings: {
        type: Object,
        value: () => ({
          enable: true,
          minimumAmount: 2000,
          termDays: [1, 7, 28, 91, 182],
          defaultAmount: 2000,
          defaultTermDays: 28,
          instruccionsEnabled: [false, false, false]
        })
      },
      /**
      * @desc Deposit id
      * @type {String}
      */
      depositId: {
        type: String,
        value: ''
      },
      /**
      * @desc Instruction id
      * @type {String}
      */
      _instructionId: {
        type: String,
        value: ''
      },
      /**
      * @desc Instruction description
      * @type {String}
      */
      _instructionDescription: {
        type: String,
        value: ''
      },
      /**
      * @desc Local currency
      * @type {String}
      */
      localCurrency: {
        type: String,
        value: 'MXN'
      },
      /**
      * @desc Max available balance
      * @type {Number}
      */
      maxAvailableBalance: {
        type: Number,
        value: 0
      },
      /**
      * @desc Instruction change message
      * @type {Object}
      */
      messageContent: {
        type: Object,
        value: () => ({})
      },
      /**
      * @desc Offer instruction
      * @type {Number}
      */
      offerInstruction: {
        type: Number,
        notify: true
      },
      /**
      * @desc Offer amount
      * @type {String}
      */
      _offerAmount: {
        type: String,
        value: ''
      },
      /**
      * @desc Offer day
      * @type {String}
      */
      _offerDay: {
        type: String,
        value: ''
      },
      /**
      * @desc Offer rate
      * @type {String}
      */
      _offerRate: {
        type: String,
        value: ''
      },
      /**
      * @desc Offer data
      * @type {Object}
      */
      offerData: {
        type: Object,
        value: () => ({}),
        notify: true
      },
      /**
      * @desc Product selected
      * @type {Object}
      */
      productSelected: {
        type: Object,
        value: () => ({})
      },
      /**
      * @desc Rate aplications for hiring
      * @type {String}
      */
      rate: {
        type: String,
        notify: true
      },
      /**
      * @desc Total interests offer
      * @type {Object}
      */
      totalInterests: {
        type: Object,
        notify: true,
        value: () => ({})
      },
      /**
      * @desc User email
      * @type {String}
      */
      userEmail: {
        type: String,
        value: ''
      },
      /**
      * @desc Valid participants
      * @type {Boolean}
      */
      _validParticipant: {
        type: Boolean,
        value: false
      },
      /**
      * @desc Valid accounts
      * @type {Boolean}
      */
      _validAccounts: {
        type: Boolean,
        value: false
      },
      /**
      * @desc Valid minimum amount
      * @type {Boolean}
      */
      _validMinimumAmounts: {
        type: Boolean,
        value: false
      },
      /**
      * @desc List of items payments
      * @type {Array}
      **/
      listPayments: {
        type: Array,
        value: () => []
      },
      /**
      * @desc Contract alias
      * @type {String}
      */
      _alias: {
        type: String,
        value: ''
      },
      /**
      * @desc Native global cache storege
      * @type {Object}
      */
      globalCacheStorage: {
        type: Object,
        value: () => ({})
      },
      /**
      * @desc Native global cache storeg eAccounts
      * @type {Object}
      */
      accountsStorage: {
        type: Object,
        value: () => ({})
      },
      /**
      * @desc Native global cache storege glomomx
      * @type {Object}
      */
      globalUser: {
        type: Object,
        value: () => ({})
      },
      /**
      * @desc Store the accounts data from the dashboard
      * @type {String}
      */
      continue: {
        type: String,
        value: 'deposit'
      },
      /**
      * @desc Flag. True when contractPaymentExistingPage redirect to
      * depositPurchaseSale or to deposit Hiring
      * @type {Boolean}
      */
      _redirectedFromContractExisting: {
        type: Boolean,
        value: false
      },
      /**
      * @desc Redirect flow for contracts
      * @type {Boolean}
      */
      redirectPurchase: {
        type: Boolean,
        value: false
      },
      /**
      * @desc Flag for test in message Out of time
      * @type {Boolean}
      */
      validHours: {
        type: Boolean,
        value: false
      },
      /**
      * @desc Time to do operations after hours
      * @type {Array}
      */
      _operationSandF: {
        type: Array,
        value: () => [8, 20]
      },
      /**
      * @desc Validates the after hours information message
      * @type {Object}
      */
      messageInfo: {
        type: Object,
        value: () => ({
          icon: 'coronita:info',
          type: 'warning-dark',
          iconSize: '12',
          messageClass: 'space-message',
          message: ''
        })
      },
      /**
       * @desc index valid gat nominal
       * @type {Array}
      */
      _gatNomIndex: {
        type: Array,
        value: () => [0, 1, 8]
      },
      /**
       * @desc index valid gat real
       * @type {Array}
      */
      _gatRealIndex: {
        type: Array,
        value: () => [1, 4, 10]
      },
      /**
       * @desc view Gat Real and Nominal in page success
       * @type {Boolean}
      */
      helpBtnInfo: {
        type: Boolean,
        value: false
      },
      /**
       * Required fixed version
       */
      fixedVersion: {
        type: Boolean,
        value: false
      },
      /** @desc Encrypted data to consume the voucher service @type {String} */
      environment: {
        type: String,
        value: ''
      },
      /** @desc Information shown on the body of the coupon @type {Array} */
      promotionBody: {
        type: Array,
        value: () => []
      },
      /** @desc valid success services promotion @type {Boolean} */
      promotionValid: {
        type: Boolean,
        value: false,
        notify: true
      },
      /**
       * @description account feature flags
       * @type {Object}
       */
      featureFlagCollection: {
        type: Object,
        value: () => ({})
      },
      /**
       * @description flag depositsHiring
       * @type {Array}
       */
      featureFlags: {
        type: Object,
        value: () => ({
          'depositsHiringCoupon': {}
        })
      },
      /**
       * info header category promotion code
       */
      cuponHeader: {
        type: Object,
        value: () => ({})
      },
      /**
       * info data promotion header category
       */
      cuponData: {
        type: Array,
        value: () => []
      },
      /**
      * offer promotion Panel Comparative
      */
      cuponOffer: {
        type: Object,
        value: () => ({})
      },
      /** @desc Promotion date of the service response coupon @type {String} */
      dateCupon: {
        type: String,
        value: ''
      },
      /** @desc Response from coupon services (API) @type {Object} */
      successCoupon: {
        type: Object,
        value: () => ({})
      },
      /** @desc Information received from the coupon to validate the minimum amount and the days for applying the promotion @type {Object} */
      infoCouponComparative: {
        type: Object,
        value: () => ({})
      },
      /** @desc benefit showing offer  @type {Array} */
      termConditions: {
        type: Array,
        value: () => []
      },
      /** @desc percentage with promotion without promotion for the preferential rate  @type {Object} */
      percentagesCoupons: {
        type: Object,
        value: () => ({})
      },
      /**
      * @desc Images from modals Default settings
      * @type {Object}
      */
      imgModalsSettings: {
        type: Object,
        value: () => ({
          manageSuccesResponseCoupon: 'images/offers/loan/bbva-tag.svg',
          modalHelpInfoCoupon: './images/deposits/bbva-tag-light.svg',
          modalContractPayment: './images/Info.svg',
          modalErrorRequirements: './images/general_error_2.svg',
          modalErrorMinimumAmount: './images/general_error_2.svg',
          modalErrorNotParticipants: './images/general_error_2.svg',
          modalErrorNotHolder: './images/general_error_2.svg',
          modalErrorNotHundredPercent: './images/general_error_2.svg',
          modalErrorNotContractingProduct: './images/general_error_2.svg',
          modalErrorLevelAccounts: './images/general_error_2.svg',
          modalErrorOperationOutTime: './images/out_time.svg',
          modalErrorWrongCurrency: './images/general_error_2.svg',
          modalErrorAccountBlocked: './images/general_error_2.svg',
          onRevertModalDispatch: './images/general_error_2.svg'
        })
      },
      /**
       * @desc Inidicates if the coupon is valid
       * @type {Boolean}
       */
      validCupon: {
        type: Boolean,
        value: false
      },
      /**
      * @desc Encrypted term day data
      * @type {String}
      */
      _encryptedOfferDay: {
        type: String,
        value: ''
      }
    };
  }

  static get observers() {
    return [
      '_getDataFromGlobalCacheStorage(globalCacheStorage.*)',
      '_getAccountsGlobalCacheStorage(accountsStorage.*)',
      '_requestParticipants(_accountsList,featureFlagCollection)'
    ];
  }

  /**
   * @description request participants and featureFlagCollection
   * @param {Array} accounts
   * @param {Object} featureFlagCollection
   */
  _requestParticipants(accounts, featureFlagCollection) {
    if (this._validateProperties()) {
      this._parseFeatureFlag(featureFlagCollection);
      this._requestAccountsParticipants(this.get(`${[ this._counterAccount ]}.id`, this._accountsList));
      this._getMaxAmount();
    }
  }

  /**
   * Validates that the properties contain a value
   * @returns {Boolean}
   */
  _validateProperties() {
    const existProperties = this._accountsList && this.featureFlagCollection;
    const hasContent = existProperties
      && this._accountsList.length
      && Object.keys(this.featureFlagCollection).length;
    return hasContent && this._validList(Object.keys(this.featureFlagCollection));
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
     * @description parse feature flags from glomo-settings
     * @param {Object} featureFlagCollection
     */
  _parseFeatureFlag(featureFlagCollection) {
    const _featureFlags = this.featureFlags;
    Object.keys(_featureFlags).forEach(flag => {
      this.set(`featureFlags.${flag}`,
        this.get('value', featureFlagCollection['glomo.investments.depositsHiringCoupon'])
      );
    });
    this._dispatchEvents('set-feature-flags', this.featureFlags);
  }

  /**
     * @description parse public settings from glomo-settings
     * @param {Object} publicSettings
     */
  setPublicSettings(publicSettings) {
    this.maxAvailableBalance =  this.get('depositHiringConfig.maxAvailableBalance', publicSettings);
    this._dispatchEvents('set-max-available-balance', this.maxAvailableBalance);
  }

  /** @description Initialize and set up data for contracting. */
  initMainHiringPage() {
    this._counterAccount = 0;
    this.validCupon = false;
    this.set('infoCouponComparative', {});
    this._depositSpinner(true);
    this._setInitialStaticData();
    this._dispatchEvents('request-accouts-services');
    this.set('cuponOffer', {});
  }

  /** @description Restarting the promissory note contracting flow. */
  resetDepositHiring() {
    this._accountsList = [];
    this._setInitialStaticData();
    this._dispatchEvents('reset-deposit-hiring-flow');
  }

  /** @description Generates the recruitment simulation with the estimated base data. */
  _setInitialStaticData() {
    const daySelected = this.get('defaultTermDays', this.defaultSettings);
    this._dispatchEvents('send-comparative-coupon', {});
    this._dispatchEvents('show-panel-comparative', false);
    this._dispatchEvents('set-promotion-header-hiring', {});
    this._dispatchEvents('set-promotion-body-hiring', []);
    this._dispatchEvents('set-data-instructions', this._setDataInstructions(this.get('instruccionsEnabled', this.defaultSettings)));
    this._dispatchEvents('set-data-terms', this._setDataTerms());
    this._dispatchEvents('set-deposit-list', this._formatDepositList());
    this._dispatchEvents('set-input-amount', { amount: this.get('defaultAmount', this.defaultSettings), currency: this.localCurrency });
    this._dispatchEvents('set-input-amount-min', this.get('minimumAmount', this.defaultSettings));
    this._dispatchEvents('set-slide-values', (this.get('termDays', this.defaultSettings)).join().split(','));
    this._dispatchEvents('set-slide-value-selected', (this.get('termDays', this.defaultSettings)).indexOf(daySelected));
    this._dispatchEvents('disable-offer-button', true);
    const listMessages = {
      icon: 'coronita:caution', type: 'warning-dark', class: '',
      messages: [
        { title: 'cells-step-deposits-offer-page-warning-messages-title', class: 'title' },
        { title: 'cells-step-deposits-offer-page-warning-messages-text', class: 'text' }
      ]
    };
    this._dispatchEvents('set-messages-list-deposit-hiring', listMessages);
    this._dispatchEvents('show-message-out-of-time-hiring', this.messageInfo);
    this.validateHoursForMessage();
  }

  /**
  * @description Set properties for deposits instructions.
  * @param {Object} optionsDisabled Info radio buttons
  */
  _setDataInstructions(optionsDisabled) {
    const instructions = [
      {
        externalLink: false,
        config: {
          id: 0,
          radio: `${this.t('glomo-deposits-instruction-title-0')}`,
          icon: 'coronita:help',
          message: 'glomo-deposits-instruction-message-0',
          disabled: this.get('0', optionsDisabled),
          type: 'AUTOMATIC',
          iconType: 'info-dark',
          classIconMessage: 'inline help'
        }
      },
      {
        externalLink: false,
        config: {
          id: 1,
          radio: `${this.t('glomo-deposits-instruction-title-1')}`,
          icon: 'coronita:help',
          message: 'glomo-deposits-instruction-message-1',
          disabled: this.get('1', optionsDisabled),
          type: 'AUTOMATIC_ONLY_PRINCIPAL',
          iconType: 'info-dark',
          classIconMessage: 'inline help'
        }
      },
      {
        externalLink: false,
        config: {
          id: 2,
          radio: `${this.t('glomo-deposits-instruction-title-2')}`,
          icon: 'coronita:help',
          message: 'glomo-deposits-instruction-message-2',
          disabled: this.get('2', optionsDisabled),
          type: 'ACCOUNT',
          iconType: 'info-dark',
          classIconMessage: 'inline help'
        }
      },
    ];
    this.set('messageContent', { description: 'glomo-deposit-hiring-instructions-step-msg', data: ' ', buttonText: ' ' });
    this.offerInstruction = 0;
    return instructions;
  }

  /** @description Displays message if contract is out of hours. */
  validateHoursForMessage() {
    const hour = moment().hours();
    if ((hour < this.get('0', this._operationSandF) || hour >= this.get('1', this._operationSandF)) || this.validHours) {
      this.set('messageInfo', {...this.messageInfo, message: this.t('glomo-deposit-hiring-hours-validate-messages') });
      this._dispatchEvents('show-message-out-of-time-hiring', this.messageInfo);
    } else {
      this.set('messageInfo', {...this.messageInfo, message: '' });
      this._dispatchEvents('show-message-out-of-time-hiring', this.messageInfo);
    }
  }

  /** @description Set properties for deposits terms. */
  _setDataTerms() {
    return {
      pdfData: [
        {
          icon: 'coronita:pdf',
          text: this.t('glomo-deposit-hiring-terms-pdf-title-1'),
          id: '1'
        },
        {
          icon: 'coronita:pdf',
          text: this.t('glomo-deposit-hiring-terms-pdf-title-2'),
          id: '2'
        },
      ],
      checkboxList: [
        {
          valid: false,
          active: true,
          buttonText: this.t('glomo-deposit-hiring-terms-pdf-check-1'),
        },
        {
          valid: false,
          active: true,
          buttonText: this.t('glomo-deposit-hiring-terms-pdf-check-2'),
        },
        {
          valid: false,
          active: true,
          buttonText: this.t('glomo-deposit-hiring-terms-pdf-check-3'),
          preaccepted: true,
          preacceptedInfoText: 'glomo-deposit-hiring-terms-pdf-check-preaccepted',
          isNotReadOnly: true
        }
      ],
      messageDescription: this.t('glomo-deposit-hiring-terms-pdf-msg')
    };
  }

  /** @description Dashboard information give format of deposit list. */
  _formatDepositList() {
    return [
      {
        title: 'cells-step-deposits-hiring-page-list-title-0',
        list: ['cells-step-deposits-hiring-page-list-item-0', 'cells-step-deposits-hiring-page-list-item-1'],
        background: '',
        bullet: 'medium-blue',
        font: ''
      },
      {
        title: 'cells-step-deposits-hiring-page-list-title-1',
        list: ['cells-step-deposits-hiring-page-list-item-2', 'cells-step-deposits-hiring-page-list-item-3', 'cells-step-deposits-hiring-page-list-link-1'],
        link: { 'cells-step-deposits-hiring-page-list-link-1': '#' },
        background: '',
        bullet: 'medium-blue',
        font: ''
      }
    ];
  }

  /**
  * @description Give format for the dato of the simulator.
  * @param {Object} detail Info for deposit hiring
  */
  _getOfferData({ annualRate, responseData, realGat }) {
    const days = this._computeTerm(parseInt(this._offerDay));
    return {
      detail: {
        title: this.t('glomo-deposit-hiring-offer-data-detail-title'),
        values: [
          {
            key: this.t('glomo-deposit-hiring-offer-data-detail-fixed-rate'),
            value: `${annualRate}%`,
            class: 'bold-key'
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
            class: 'bold-key'
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
            class: 'bold-key'
          }
        ],
        additionalTaxes: [
          {
            text: 'glomo-deposit-hiring-offer-data-detail-nominal-gat-top',
            percentage: `${this._truncate(this.get('annualTotalProfit.rates.1.unit.percentage', responseData), 2)}%`,
            icon: 'coronita:help',
            iconMessage: {
              type: 'info-dark',
              icon: 'coronita:info',
              message: 'glomo-deposit-hiring-offer-data-detail-warning-1',
              messageClass: 'message-input message-deposit'
            }
          },
          {
            text: 'glomo-deposit-hiring-offer-data-detail-real-gat-top',
            percentage: realGat,
            icon: 'coronita:help',
            iconMessage: {
              type: 'info-dark',
              icon: 'coronita:info',
              message: 'glomo-deposit-hiring-offer-data-detail-warning-1',
              messageClass: 'message-input message-deposit'
            }
          }
        ],
        warnings: []
      },
      amount: {
        amount: this.get('scheduledInterestPayments.0.capital.amount', responseData),
        currency: this.get('scheduledInterestPayments.0.capital.currency', responseData)
      },
      summary: {
        values: [
          {
            key: 'cells-step-deposits-offer-page-filled-investment-amount',
            value: {
              amount: this.get('initialAmount.0.amount', responseData),
              currencyCode: this.get('initialAmount.0.currency', responseData)
            },
            localCurrency: this.get('initialAmount.0.currency', responseData),
            language: this.currentLanguage,
          },
          {
            key: this.t('glomo-deposit-hiring-offer-data-summary-term'),
            value: days,
          },
          {
            key: this.t('glomo-deposit-hiring-offer-data-summary-expiration-date'),
            value: moment(this.get('scheduledInterestPayments.0.settlementDate', responseData)).format('DD MMMM YYYY'),
          },
          {
            key: this.t('glomo-deposit-hiring-offer-data-detail-fixed-rate'),
            value: `${annualRate}%`,
          },
          {
            key: this.t('glomo-deposit-hiring-offer-data-detail-gross-interest'),
            value: {
              amount: this.get('totalGrossBenefits.amount', responseData),
              currencyCode: this.get('totalGrossBenefits.currency', responseData)
            },
            localCurrency: this.get('totalGrossBenefits.currency', responseData),
            language: this.currentLanguage,
            class: 'padding-key'
          },
          {
            key: this.t('glomo-deposit-hiring-offer-data-detail-total-tax'),
            value: {
              amount: `-${this.get('taxes.itemizeTaxes.0.itemizeTaxUnits.0.amount', responseData)}`,
              currencyCode: this.get('taxes.itemizeTaxes.0.itemizeTaxUnits.0.currency', responseData),
              class: 'white-color'
            },
            localCurrency: this.get('taxes.itemizeTaxes.0.itemizeTaxUnits.0.currency', responseData),
            language: this.currentLanguage,
          },
          {
            key: this.t('glomo-deposit-hiring-offer-data-detail-net-interest'),
            value: {
              amount: this.get('totalNetBenefits.amount', responseData),
              currencyCode: this.get('totalNetBenefits.currency', responseData)
            },
            localCurrency: this.get('totalNetBenefits.currency', responseData),
            language: this.currentLanguage,
            class: 'padding-key'
          },
          {
            key: this.t('glomo-deposit-hiring-offer-data-detail-nominal-gat'),
            value: `${this._truncate(this.get('annualTotalProfit.rates.1.unit.percentage', responseData), 2)}%`,
            class: 'deposit-help-icon'
          },
          {
            key: 'glomo-deposit-hiring-offer-data-detail-before-taxes',
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
            class: 'deposit-help-icon'
          },
          {
            key: 'glomo-deposit-hiring-offer-data-detail-before-taxes',
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
          message: 'glomo-deposit-hiring-title-promotion-applied',
          messageClass: 'message-input'
        }
      } : {};
  }

  /** @description Removes asterisks in obfuscated data. */
  _removeAsterisks(data) {
    return data.replace(/\*/gi, '');
  }

  /**
  * @description Receive deposits hiring success response API.
  * @param {Object} evt Info success response API
  * @event app-page-completed-success Fire app page completed
  */
  manageResponseSuccessHiring(evt) {
    let payload = evt;
    const accountId = this._removeAsterisks(this.get('relatedContracts.0.relatedContractId', payload));
    const accounts = this._accountsList.find(item => item.number === accountId);
    const customerName = `${this.get('fullName', this.globalUser)}`;
    payload.accountAlias = accounts ? this.get('name', accounts) : this.t('glomo-deposit-hiring-success-investment-account-alias');
    payload.customerName = customerName;
    payload.coupon = this.validCupon ? {
      text: 'glomo-deposit-hiring-title-promotion-applied',
      atomIcon: { value: 'coronita:correct', class: 'icon-size-18', iconSize: 18 }
    } : {};
    this.generateNavigationTo('success', payload);
    this._depositSpinner(false);
    this.resetDepositHiring();
  }

  /**
  * @description Manages the response of service errors.
  * @param {Object} evt Info errors response API´S
  */
  manageResponseErrorHiring(evt) {
    const errorMessageComplete = evt;
    const errorCode = this.get('messages.0.message', errorMessageComplete);
    const errorMessage = this._convertToValidCodeError(errorCode);
    const pendingOperation = { message: errorCode, customerName: this.get('fullName', this.globalUser) };
    this._depositSpinner(false);
    const _errorMessage = {
      'PEE0359': () => this.modalErrorNotHolder(),
      'PEE0509': () => this.modalErrorNotHundredPercent(),
      'BGE3322': () => this.modalErrorNotContractingProduct(),
      'QGE1011': () => this._manageStoreAndForward(pendingOperation),
      'BGE0832': () => this.modalErrorOperationOutTime(),
      'BGE7735': () => this.modalErrorWrongCurrency(),
      '0000000': () => this.onRevertModalDispatch()
    };
    (_errorMessage[errorMessage]());
  }

  /**
  * @description Manage and create the method to generate success page.
  * @event store-and-forward-success Send success data to success page
  */
  _manageStoreAndForward(payload) {
    const date = moment().format('YYYY-MM-DD');
    let dateFolio = this.get('message', payload);
    dateFolio = dateFolio.split(' ')[1];
    const hour = dateFolio.substr(-5).replace(/\./g, ':');
    const formatDate = `${date}T${hour}`;
    const customerName = this.get('customerName', payload);
    let folio = this.get('message', payload);
    folio = folio.split(' ')[1].slice(0, 15);
    const days = this._computeTerm(parseInt(this._offerDay));
    const coupon = this.validCupon ? {
      text: 'glomo-deposit-hiring-title-promotion-applied',
      atomIcon: { value: 'coronita:correct', class: 'icon-size-18', iconSize: 18 }
    } : {};
    const successData = {
      id: 'depositHiring',
      date: formatDate,
      title: this.t('glomo-deposits-purchas-sucessfull-title-pending'),
      amountLabel: 'glomo-deposit-hiring-success-amount-label',
      templateSelected: 'depositHiring',
      origin: {
        product: {
          id: 'ACCOUNTS',
          name: customerName,
        },
        number: ''
      },
      coupon: coupon,
      chargeAmount: {
        amount: this.get('amount.amount', this.offerData),
        currency: this.get('amount.currency', this.offerData),
        class: 'amount-huge-decimals'
      },
      headerAdditionalListInfo: [
        {
          key: 'glomo-deposit-hiring-success-investment-amount',
          value: {
            amount: this._offerAmount,
            currencyCode: this.localCurrency,
          },
          localCurrency: this.localCurrency,
          language: this.currentLanguage,
        },
        {
          key: 'glomo-deposit-hiring-success-fixed-rate',
          value: `${this._truncate(this._offerRate, 2)}%`,
          class: 'bold-value'
        },
        {
          key: 'glomo-deposit-hiring-success-gross-interest',
          value: {
            amount: this.get('summary.values.4.value.amount', this.offerData),
            currencyCode: this.get('summary.values.4.value.currencyCode', this.offerData),
          },
          localCurrency: this.get('summary.values.4.value.currencyCode', this.offerData),
          language: this.currentLanguage,
        },
        {
          key: 'glomo-deposit-hiring-success-total-tax',
          value: {
            amount: this.get('summary.values.5.value.amount', this.offerData),
            currencyCode: this.get('summary.values.5.value.currencyCode', this.offerData),
            class: 'white-color'
          },
          localCurrency: this.get('summary.values.5.value.currencyCode', this.offerData),
          language: this.currentLanguage
        },
        {
          key: 'glomo-deposit-hiring-success-net-interest',
          value: {
            amount: this.get('summary.values.6.value.amount', this.offerData),
            currencyCode: this.get('summary.values.6.value.currencyCode', this.offerData),
          },
          localCurrency: this.get('summary.values.6.value.currencyCode', this.offerData),
          language: this.currentLanguage
        }
      ],
      headerHelpersList: [
        {
          key: 'glomo-deposit-hiring-success-nominal-gat',
          value: this.get('summary.values.7.value', this.offerData),
          class: 'cells-key-values-without-space'
        },
        {
          key: 'glomo-deposit-hiring-offer-data-detail-before-taxes',
          icon: 'coronita:help',
          class: 'cells-key-values-without-space'
        },
        {
          key: '',
          value: '',
          class: 'cells-key-values-message-helpers-list',
          icon: '',
          infoMessage: {
            type: 'info-light',
            icon: 'coronita:info',
            message: 'glomo-deposits-purchase-tax-info',
            messageClass: 'message-input message-deposit'
          }
        },
        {
          key: 'glomo-deposit-hiring-success-real-gat',
          value: this.get('summary.values.9.value', this.offerData),
          class: 'cells-key-values-without-space'
        },
        {
          key: 'glomo-deposit-hiring-offer-data-detail-before-taxes',
          icon: 'coronita:help',
          class: 'cells-key-values-without-space'
        },
        {
          key: '',
          value: '',
          class: 'cells-key-values-message-helpers-list',
          icon: '',
          infoMessage: {
            type: 'info-light',
            icon: 'coronita:info',
            message: 'glomo-deposits-purchase-tax-info',
            messageClass: 'message-input message-deposit'
          }
        },
      ],
      topInfo: [
        { value: '', class: 'spacing lg' },
        {
          key: 'glomo-deposit-hiring-success-investment-account',
          value: `${this.t('glomo-deposit-hiring-success-investment-account-title')}`,
          musk: {
            value: this.get('description.value', this.productSelected),
            chars: 4,
            simbol: '•'
          },
          class: 'bold spacing'
        },
        {
          key: 'glomo-deposit-hiring-success-term',
          value: days,
          class: 'bold spacing'
        },
        {
          key: 'glomo-deposit-hiring-success-maturity-date',
          value: this.get('summary.values.2.value', this.offerData),
          class: 'bold spacing'
        },
        {
          key: 'glomo-deposit-hiring-success-expiration-instructions',
          value: this._instructionDescription,
          class: 'bold spacing'
        },
        {
          key: 'glomo-deposit-hiring-success-service',
          value: 'glomo-deposit-hiring-success-commercialization',
          class: 'bold spacing'
        },
        {
          key: 'glomo-deposit-hiring-success-instrument',
          value: 'glomo-deposit-hiring-success-taxable-yield',
          class: 'bold spacing'
        },
        {
          key: 'glomo-deposit-hiring-success-coin-type',
          value: 'glomo-deposit-hiring-success-national-currency',
          class: 'bold spacing'
        },
        {
          key: 'glomo-deposit-hiring-success-invoice',
          value: folio,
          class: 'bold'
        },
        {
          value: 'glomo-deposit-hiring-success-bbva',
          class: 'bold spacing'
        },
        {
          key: '',
          value: 'glomo-deposit-hiring-success-contracts',
        },
      ],
      additionalInfo: [
        {
          message: {
            type: 'warning-dark',
            class: 'spacing',
            text: `${this.t('glomo-deposit-hiring-success-store-warning')}`,
            icon: 'coronita:caution'
          },
        },
        {
          class: 'spacing'
        },
        {
          message: {
            type: 'info-dark',
            class: 'spacing',
            text: `${this.t('glomo-deposit-hiring-success-store-msg')}`,
            icon: 'coronita:info'
          },
        },
        {
          class: 'spacing'
        },
        {
          key: 'glomo-deposit-hiring-success-mail-forward',
          value: `•${this._removeAsterisks(this.userEmail)}`,
          class: 'bold spacing'
        },
      ],
      operations: [
        {
          label: 'glomo-deposit-hiring-success-share',
          id: 'share',
          icon: 'coronita:share',
          height: '2027',
          share: true
        },
        {
          label: 'glomo-deposit-hiring-success-info-ipab',
          id: 'download',
          icon: 'coronita:document'
        }
      ],
      buttons: {
        primary: {
          text: 'glomo-deposit-hiring-successful-btn-exit',
          action: 'go-to-next'
        },
        secondary: {
          hidden: true
        }
      }
    };
    this.generateNavigationTo('store-and-forward', successData);
    this.resetDepositHiring();
  }

  /**
  * @description Init success page deposits imposition.
  * @event set-success-type Send type to success component
  * @event set-success-data Send success date to page
  */
  initSuccessStoreAndForward(successData) {
    this._dispatchEvents('set-success-data', successData);
    this._dispatchEvents('header-class-changed', 'header--core');
    this._dispatchEvents('set-success-type', 'core');
  }

  /**
  * @description Init success page deposits imposition.
  * @event set-success-type Send type to success component
  * @event set-success-data Send success date to page
  */
  initSuccessHiringPage(evt) {
    const coupon = this.get('coupon', evt);
    const dataSuccess = evt;
    const messageSuccess = this.get('messages.0', evt);
    const mail = this.get('deliveries.0.contactDetails.0.contactDetailId', dataSuccess);
    const nominalGat = this.get('code', messageSuccess) === 'BGA3061' ? this.t('glomo-deposit-hiring-success-not-apply') : `${this._truncate(this.get('annualTotalProfit.rates.0.unit.percentage', dataSuccess), 2)}%`;
    const realGat = this.get('code', messageSuccess) === 'BGA3061' ? this.t('glomo-deposit-hiring-success-not-apply') : `${this._truncate(this.get('annualTotalProfit.rates.1.unit.percentage', dataSuccess), 2)}%`;
    let days = this.get('term.number', dataSuccess);
    days = this._computeTerm(parseInt(days));
    const successData = {
      id: this.get('number', dataSuccess),
      date: this.get('openingDate', dataSuccess),
      title: this.t('glomo-deposit-hiring-success-title'),
      amountLabel: 'glomo-deposit-hiring-success-amount-label',
      templateSelected: 'depositHiring',
      origin: {
        product: {
          id: 'ACCOUNTS',
          name: this.get('customerName', dataSuccess),
        },
        number: ''
      },
      coupon: coupon,
      chargeAmount: {
        amount: this.get('totalNetBenefits.amount', dataSuccess),
        currency: this.get('totalNetBenefits.currency', dataSuccess),
        class: 'amount-huge-decimals'
      },
      headerAdditionalListInfo: [
        {
          key: 'glomo-deposit-hiring-success-investment-amount',
          value: {
            amount: this.get('initialAmount.amount', dataSuccess),
            currencyCode: this.get('initialAmount.currency', dataSuccess),
          },
          localCurrency: this.get('initialAmount.currency', dataSuccess),
          language: this.currentLanguage,
        },
        {
          key: 'glomo-deposit-hiring-success-fixed-rate',
          value: `${this._truncate(this.get('annualRate', dataSuccess), 2)}%`,
          class: ''
        },
        {
          key: 'glomo-deposit-hiring-success-gross-interest',
          value: {
            amount: this.get('interestPayment.liquidationWindows.0.interests.0.grossBenefit.amount', dataSuccess),
            currencyCode: this.get('interestPayment.liquidationWindows.0.interests.0.grossBenefit.currency', dataSuccess),
          },
          localCurrency: this.get('interestPayment.liquidationWindows.0.interests.0.grossBenefit.currency', dataSuccess),
          language: this.currentLanguage,
        },
        {
          key: 'glomo-deposit-hiring-success-total-tax',
          value: {
            amount: `-${this.get('interestPayment.liquidationWindows.0.totalInterests.amount', dataSuccess)}`,
            currencyCode: this.get('interestPayment.liquidationWindows.0.totalInterests.currency', dataSuccess),
            class: 'white-color'
          },
          localCurrency: this.get('interestPayment.liquidationWindows.0.totalInterests.currency', dataSuccess),
          language: this.currentLanguage,
          infoMessage: {
            type: 'info-light',
            icon: 'coronita:info',
            message: 'glomo-deposits-purchase-sale-icon-messagge-list-info',
            messageClass: 'message-input message-deposit icon-padding'
          }
        },
        {
          key: 'glomo-deposit-hiring-success-net-interest',
          value: {
            amount: this.get('interestPayment.liquidationWindows.0.interests.0.netBenefit.amount', dataSuccess),
            currencyCode: this.get('interestPayment.liquidationWindows.0.interests.0.netBenefit.currency', dataSuccess),
          },
          localCurrency: this.get('interestPayment.liquidationWindows.0.interests.0.netBenefit.currency', dataSuccess),
          language: this.currentLanguage
        }
      ],
      headerHelpersList: [
        {
          key: 'glomo-deposit-hiring-success-nominal-gat',
          value: nominalGat,
          class: 'cells-key-values-without-space'
        },
        {
          key: 'glomo-deposit-hiring-offer-data-detail-before-taxes',
          icon: 'coronita:help',
          class: 'cells-key-values-without-space'
        },
        {
          key: '',
          value: '',
          class: 'cells-key-values-message-helpers-list',
          icon: '',
          infoMessage: {
            type: 'info-light',
            icon: 'coronita:info',
            message: 'glomo-deposits-purchase-tax-info',
            messageClass: 'message-input message-deposit'
          }
        },
        {
          key: 'glomo-deposit-hiring-success-real-gat',
          value: realGat,
          class: 'cells-key-values-without-space'
        },
        {
          key: 'glomo-deposit-hiring-offer-data-detail-before-taxes',
          icon: 'coronita:help',
          class: 'cells-key-values-without-space'
        },
        {
          key: '',
          value: '',
          class: 'cells-key-values-message-helpers-list',
          icon: '',
          infoMessage: {
            type: 'info-light',
            icon: 'coronita:info',
            message: 'glomo-deposits-purchase-tax-info',
            messageClass: 'message-input message-deposit icon-padding'
          }
        }
      ],
      topInfo: [
        { value: '', class: 'spacing lg' },
        {
          key: 'glomo-deposit-hiring-success-investment-account',
          value: `${this.t('glomo-deposit-hiring-success-investment-account-title')}`,
          musk: {
            value: this.get('relatedContracts.0.relatedContractId', dataSuccess),
            chars: 4,
            simbol: '•'
          },
          class: 'spacing spacing-normal light-key ellipsis'
        },
        {
          key: 'glomo-deposit-hiring-success-term',
          value: days,
          class: 'spacing spacing-normal light-key ellipsis'
        },
        {
          key: 'glomo-deposit-hiring-success-maturity-date',
          value: moment(this.get('maturityDate', dataSuccess)).format('DD MMMM YYYY'),
          class: 'spacing spacing-normal light-key ellipsis'
        },
        {
          key: 'glomo-deposit-hiring-success-expiration-instructions',
          value: this.get('renovationType.description', dataSuccess),
          class: 'spacing spacing-normal light-key ellipsis'
        },
        {
          key: 'glomo-deposit-hiring-success-nvestment-contract',
          value: this.get('depositId', dataSuccess).substring(20, 10),
          class: 'spacing spacing-normal light-key ellipsis'
        },
        {
          key: 'glomo-deposit-hiring-success-service',
          value: 'glomo-deposit-hiring-success-commercialization',
          class: 'spacing spacing-normal light-key ellipsis'
        },
        {
          key: 'glomo-deposit-hiring-success-instrument',
          value: 'glomo-deposit-hiring-success-taxable-yield',
          class: 'spacing spacing-normal light-key ellipsis'
        },
        {
          key: 'glomo-deposit-hiring-success-coin-type',
          value: 'glomo-deposit-hiring-success-national-currency',
          class: 'spacing spacing-normal light-key ellipsis'
        },
        {
          key: 'glomo-deposit-hiring-success-invoice',
          value: this.get('operationData.operationNumber', dataSuccess),
          class: 'bold'
        },
        {
          value: 'glomo-deposit-hiring-success-bbva',
          class: 'spacing spacing-normal light-key ellipsis'
        },
        {
          key: '',
          value: 'glomo-deposit-hiring-success-contracts',
        },
      ],
      message: {
        type: 'info-dark',
        text: 'glomo-deposit-hiring-success-msg',
        icon: 'coronita:info'
      },
      bottomInfo: [
        {
          key: 'glomo-deposit-hiring-success-mail',
          value: `•${this._removeAsterisks(mail)}`,
          class: 'spacing spacing-normal light-key ellipsis'
        }
      ],
      operations: [
        {
          label: 'glomo-deposit-hiring-success-share',
          id: 'share',
          icon: 'coronita:share',
          height: '2027',
          share: true
        },
        {
          label: 'glomo-deposit-hiring-success-info-ipab',
          id: 'download',
          icon: 'coronita:document'
        }
      ],
      buttons: {
        primary: {
          text: 'glomo-deposit-hiring-successful-btn-exit',
          action: 'go-to-next'
        },
        secondary: {
          hidden: true
        }
      }
    };
    this._dispatchEvents('set-success-data', successData);
    this._dispatchEvents('set-success-type', '');
    this._dispatchEvents('header-class-changed', 'header--dark-success');
  }

  /**
  * @description Generates the event for make a navigation based on param name.
  * @param {String} destinationPage To generate navigation
  * @param {String} payload Params for navigation to page.
  */
  generateNavigationTo(destinationPage, payload) {
    this._dispatchEvents('deposit-navigate-to-page-' + destinationPage, { page: destinationPage, params: Array.isArray(payload) ? { payload } : payload });
  }
  /**
   * @description know what event is being launched for each case
   */
  createNameToNavigateContractPaymentExistingModal() {
    this.generateNavigationTo('contract-payments-existing-modal', '');
  }
  createNameToNavigateDepositsHiring() {
    this.generateNavigationTo('deposits-hiring', '');
  }
  createNameToNavigateToDashboard() {
    this.generateNavigationTo('dashboard', '');
  }

  redirectToContractProductSection() {
    this.generateNavigationTo('contract-product-section', '');
  }
  /**
   * @description convert object to array
   * @param {Object} payload
   */
  parseDataListPayment(payload) {
    let dataList = Object.values(payload);
    this.listPayments = dataList[0];
  }
  /**
  * @description Maps the account information and validates the information to continue with the contracting process.
  * @param {Array} accounts account information
  */
  mappingAcountInfo(accounts) {
    let counterIndex = 0;
    const dataAccounts = accounts;
    if (dataAccounts.length > 0) {
      const mappedAccounts = dataAccounts.map(item => {
        const level = this.get('level', item) || this.get('meta.accountLevel', item);
        let index = '';
        if (level === 'N4') {
          index = counterIndex;
          counterIndex++;
        }
        return {
          index: index,
          name: this.get('alias', item),
          id: this.get('accountId', item),
          level: level,
          number: this.get('number', item).substring(20, 10),
          description: {
            value: this.get('number', item),
            masked: true
          },
          group: 'account',
          holds: [],
          primaryAmount: {
            amount: this.get('availableBalance.currentBalances.0.amount', item),
            currency: this.get('availableBalance.currentBalances.0.currency', item),
            label: 'glomo-deposit-hiring-accounts-step-label-available-amount'
          },
          productType: 'ACCOUNTS',
          localCurrency: this.get('availableBalance.currentBalances.0.currency', item),
        };
      });
      const accountsAllowed = mappedAccounts.filter(account => account.level === 'N4');
      this._validAccounts = accountsAllowed.length > 0;
      this.set('_accountsList', accountsAllowed.length > 0 ? accountsAllowed : mappedAccounts);
      const accountOffer = this._accountsList.find(item => this.get('primaryAmount.amount', item) >= this.get('minimumAmount', this.defaultSettings));
      this._validMinimumAmounts = !!accountOffer;
      this._contractId = accountOffer ? this.get('description.value', accountOffer) : '';
    } else {
      this.modalErrorRequirements();
    }
    if (!this._validAccounts && this._validMinimumAmounts) {
      this.modalErrorLevelAccounts();
    }
  }

  /**
  * @description Set offer instruction
  * @param {Object} option Info instruction selected
  */
  changeInstructionSelected(option) {
    this.offerInstruction = this.get('radioSelected.index', option);
    this._instructionId = this.get('radioSelected.type', option);
    this._instructionDescription = this.get('radioSelected.values.0', option);
  }

  /** @description Disable button deposit offer when input amount changed. */
  offerInputAmountChanged() {
    this._dispatchEvents('disable-offer-button', true);
  }

  /**
  * @description Set offer amount from deposit offer
  * @param {Object} evt changed value input
  */
  offerAmountChanged(evt) {
    const amountMin = this.get('minimumAmount', this.defaultSettings);
    this._offerAmount = this.get('amount', evt);
    this.updateAccounts();
    if (this._offerAmount !== null && this._offerAmount <= this.maxAvailableBalance && this._offerAmount >= amountMin) {
      this._generateDepositSimulate();
      this._dispatchEvents('changed-amount-info', this._offerAmount);
    }
  }

  /**
   * @description Method that validates if the tariff has a minimum and maximum day
  */
  validateCuponSimulate() {
    const isValidAmount = this._offerAmount >= this.infoCouponComparative.amountMin;
    const isValidTerm = (this._offerDay >= this.infoCouponComparative.minDays && this._offerDay <= this.infoCouponComparative.maxDays) ||
    (this._offerDay === parseInt(this.infoCouponComparative.minDays) && this.infoCouponComparative.maxDays === undefined);
    if (isValidAmount && isValidTerm) {
      this._dispatchEvents('values-for-promotion-code', true);
      this._dispatchEvents('set-new-gat-simulate', this.cuponOffer);
      this.validCupon = true;
    } else {
      this._dispatchEvents('values-for-promotion-code', false);
      this.validCupon = false;
    }
  }

  /**
   * @desc Displays a comparative coupon with annual rates and itemized percentages.
   * Sets the necessary properties for the coupon offer and dispatches events to notify listeners.
   */
  showComparativeCoupon() {
    this.validCupon = true;
    this.set('cuponOffer', {
      currencyCode: '%',
      className: 'spacing-slider comparative-cupon-header',
      alignRight: true,
      firstElement: { title: this.t('glomo-deposit-hiring-itemize-rates'), amount: `${this.percentagesCoupons.percentageAnualPromo}` },
      secondElement: { title: this.t('glomo-deposit-hiring-annual-rate'), amount: `${this.percentagesCoupons.percentageAnual}` },
      titleHeader: {
        title: this.t('glomo-deposit-hiring-title-header'),
        class: 'header-title'
      },
      containerDynamicStyle: 'division-comparative-white'
    });
    this._dispatchEvents('send-comparative-coupon', this.cuponOffer);
    this._dispatchEvents('show-panel-comparative', true);
  }

  /**
  * @description Set offer day from deposit offer
  * @param {Number} evt Changed value slider
  */
  offerSliderChanged(evt) {
    let selectedDay = this.get('termDays', this.defaultSettings);
    selectedDay = this.get(`${[ evt ]}`, selectedDay);
    this._offerDay = selectedDay;
    this._generateDepositSimulate();
  }

  /**
   * @description Fire the request to campaings DM
   * @param {Object} payload
   */
  getPromotionCode(payload) {
    if (payload.depositsHiringCoupon) {
      const body = { promotionCode: 'NOCOUPON', offerId: this.environment };
      this.$.dmCampaings.postRedeemCoupon(body);
    }
  }

  /** @description Build body for generate deposit simulate */
  _generateDepositSimulate() {
    if (this._contractId !== '') {
      this._depositSpinner(true);
      const body = {
        depositsSimulate: true,
        maturityDate: moment().format(''),
        initialAmount: [ { amount: this._offerAmount, currency: this.localCurrency } ],
        terms: { number: this._offerDay, unit: 'DAYS' },
        relatedContracts: [ { id: this._contractId } ]
      };
      if (this.environment && this.promotionValid) {
        Object.assign(body, {
          isCouponUsed: true,
          product: {
            id: this.get('product.id', this.successCoupon),
            subProduct: { id: this.get('product.subproduct.id', this.successCoupon) }
          },
          dueDate: this.get('benefit.dueDate', this.successCoupon),
          promotionCode: this.get('benefit.benefitType.value', this.successCoupon),
          title: { id: '0003' }
        });
      }
      this._dispatchEvents('info-process-promotion-code', this.promotionValid);
      if (this._contractId !== '' && this._offerDay !== '' && this._offerAmount !== '') {
        this.$.dmDeposits.postDepositsSimulate(body);
        this.validateCuponSimulate();
      } else {
        this._depositSpinner(false);
        this.onRevertModalDispatch();
      }
    }
  }

  /**
   * @description Method that consumes the reedme coupon API
   * @param {Object} evt data success response successful-redeem-coupo
  */
  manageSuccessResponseCoupon(evt) {
    this.promotionValid = true;
    this.successCoupon = this.get('detail', evt);
    this.dateCupon = this.get('benefit.dueDate', this.successCoupon);
    this.termConditions = this.get('benefit.termConditions', this.successCoupon);
    this.termConditions = (this.termConditions !== undefined) ? this.termConditions.split('|') : [];
    this.infoCouponComparative = {
      amountMin: this.get('benefit.amounts.0.amount', this.successCoupon),
      minDays: this.termConditions[0],
      maxDays: this.termConditions[1]
    };
    const title = this.t('glomo-deposit-hiring-header').toUpperCase();
    this.cuponHeader = { text: title, icon: 'coronita:help', HeaderClass: 'coupon-header' };
    const days = this._computeTerm(this.infoCouponComparative.minDays);
    this.set('promotionBody', [
      {
        id: 'coupon-offer',
        titleText: 'glomo-deposit-hiring-title-coupon',
        text: this.infoCouponComparative.maxDays === undefined ?
          `${this.t('glomo-deposit-hiring-text-coupon-item-one')} ${this.infoCouponComparative.amountMin} ${this.t('glomo-deposit-hiring-text-coupon-item-three')} ${days}.`
          : `${this.t('glomo-deposit-hiring-text-coupon-item-one')} ${this.infoCouponComparative.amountMin} ${this.t('glomo-deposit-hiring-text-coupon-item-two')} ${days}.`,
        src: this.get('manageSuccesResponseCoupon', this.imgModalsSettings),
        isImage: true,
        altText: 'glomo-deposit-hiring-title-coupon',
        moreInfo: `${this.t('glomo-deposit-hiring-title-more-info-item')} ${moment(this.dateCupon).format('DD')} ${this.t('glomo-deposit-hiring-title-more-info-second-item')} ${moment(this.dateCupon).format('MMMM')}`,
        textClass: 'button-description',
      }
    ]);
    this._dispatchEvents('set-promotion-header-hiring', this.cuponHeader);
    this._dispatchEvents('set-promotion-body-hiring', this.promotionBody);
    this._generateDepositSimulate();
  }

  /**
   * @description Method that consumes the reedme coupon API
   * @param {Object} evt data error response error-on-redeem-coupon
  */
  manageErrorResponseCoupon(evt) {
    this._dispatchEvents('set-promotion-header-hiring', {});
    this._dispatchEvents('set-promotion-body-hiring', []);
    this.promotionValid = false;
    this._generateDepositSimulate();
  }

  /**
  * @description Method to view help information on the coupon
  */
  modalHelpInfoCoupon() {
    const days = this._computeTerm(this.infoCouponComparative.minDays);
    const text = this.infoCouponComparative.maxDays === undefined ?
      `${this.t('glomo-deposit-hiring-text-coupon-item-one')} ${this.infoCouponComparative.amountMin} ${this.t('glomo-deposit-hiring-text-coupon-item-three')} ${days}.`
      : `${this.t('glomo-deposit-hiring-text-coupon-item-one')} ${this.infoCouponComparative.amountMin} ${this.t('glomo-deposit-hiring-text-coupon-item-two')} ${days}.`;
    const configCouponHelp = {
      code: 'MODAL-HELP-INFORMATION',
      primaryButtonClass: 'button-secondary--white-core-blue',
      selectedConfig: {
        className: 'full-height-info header--white image--sd spacing',
        heroImage: this.get('modalHelpInfoCoupon', this.imgModalsSettings),
        openMaximized: true,
        title: 'glomo-deposit-hiring-header-promotion-coupon',
        acceptBtLabel: 'glomo-deposit-hiring-button-agree',
        template: {
          type: 'paragraphs',
          values: [
            { title: 'glomo-deposit-hiring-modal-bullet-title-coupon', class: 'text-center spacing content-container simple-title' },
            { text: 'glomo-deposit-hiring-modal-bullet-subtitle-coupon', class: 'text-center spacing' },
            { title: 'glomo-deposit-hiring-modal-bullet-list-title-coupon', class: 'text-align-left' },
            {
              list: [
                `${text}`,
                `${this.t('glomo-deposit-hiring-modal-first-bullet-list-coupon')} ${moment(this.dateCupon).format('DD')}
                ${this.t('glomo-deposit-hiring-title-more-info-second-item-coupon')} ${moment(this.dateCupon).format('MMMM')}
                ${this.t('glomo-deposit-hiring-title-more-info-second-item-coupon')} ${moment(this.dateCupon).format('YYYY')}
                ${this.t('glomo-deposit-hiring-modal-second-bullet-list-coupon')}`,
                'glomo-deposit-hiring-modal-list-three-coupon'
              ],
              class: 'cells-lists-with-text-left'
            }
          ]
        }
      }
    };
    this._dispatchEvents(`${this.constructor.is}-show-modal`, configCouponHelp);
  }

  /**
  * @description Receive deposits simulate success response API
  * @param {Object} payload Info response API
  */
  _manageResponseSuccessSimulate(payload) {
    const responseData = this.get('detail.data', payload);
    this._encryptedOfferDay = this.get('terms.count', responseData);
    let realGat = `${this._truncate(this.get('annualTotalProfit.rates.3.unit.percentage', responseData), 2)}%`;
    let annualRate = this._truncate(this.get('annualRate', responseData), 2);
    if (this.get('rates', responseData)) {
      this.percentagesCoupons = {
        percentageAnual: this.get('annualRate', responseData),
        percentageAnualPromo: this.get('rates.itemizeRates.0.itemizeRateUnits.0.percentage', responseData)
      };
    }
    this.set('totalInterests', {
      amount: this.get('scheduledInterestPayments.0.capital.amount', responseData),
      currency: this.get('scheduledInterestPayments.0.capital.currency', responseData)
    });
    const data = {
      annualRate: annualRate,
      responseData: responseData,
      realGat: realGat
    };
    this.set('offerData', this._getOfferData(data));
    this._dispatchEvents('set-offer-data', data);
    this.rate = `${annualRate} %`;
    this._offerRate = annualRate;
    if (this._checkNext) {
      this._dispatchEvents('disable-offer-button', false);
    }
    this._depositSpinner(false);
    this._dispatchEvents('deposit-disabled-slider', 'enabled-slider');
    this.refreshAccounts();
    if (this.validCupon) {
      this.showComparativeCoupon();
    } else {
      this._dispatchEvents('show-panel-comparative', false);
    }
  }

  /** @description Manage common deposits simulate response API error */
  _manageResponseErrorSimulate() {
    this._depositSpinner(false);
    this.onRevertModalDispatch();
  }

  /** @description Build body for generate deposit hiring */
  generateDepositHiring() {
    const promotionCode = this.validCupon ? this.get('benefit.benefitType.value', this.successCoupon) : '';
    this._depositSpinner(true);
    const body = {
      joint: { id: 'SINGLE' },
      title: {
        id: '13',
        subProduct: { id: '0300' }
      },
      initialAmount: {
        amount: this._offerAmount,
        currency: this.localCurrency
      },
      term: {
        number: this._encryptedOfferDay || this._offerDay,
        depositTimeType: { id: 'DAY' }
      },
      relatedContracts: [
        {
          contractId: this.productSelected.description.value,
          product: { id: 'ACCOUNTS' },
          relationType: { id: 'LINKED_WITH' }
        }
      ],
      interestPayment: {
        liquidationType: { id: 'LIQUIDATION_DEADLINE' },
        liquidationWindows: [
          {
            period: { id: 'LAST_DAY' },
            interests: [
              {
                outcomeType: {
                  unit: {
                    unitType: 'DAILY',
                    percentage: this._offerRate
                  }
                }
              }
            ]
          }
        ]
      },
      renovationType: {
        id: this._instructionId,
        description: this._instructionDescription
      },
      petitionerBusinessAgent: { id: '' },
      deliveries: [
        {
          deliveryType: 'VIRTUAL',
          documentType: 'TICKET'
        }
      ],
      promotionCode: promotionCode,
      product: { id: '13', subProduct: { id: '0300' } }
    };
    this._dispatchEvents('deposit-hiring-service', body);
  }

  /** @description Get max amount of accounts list */
  _getMaxAmount() {
    this.maxAmountAccount = Math.max(...this._accountsList.map(
      account => parseInt(this.get('primaryAmount.amount.0', account))
    ));
  }

  /**
  * @description Build body for generate request accounts participants
  * @param {Object} accountId Id for Request accouts
  */
  _requestAccountsParticipants(accountId) {
    const body = { 'account-id': accountId };
    this._accountId = accountId;
    this._dispatchEvents('request-accouts-partincipants', body);
  }

  /** @description refresh accounts */
  refreshAccounts() {
    this._dispatchEvents('refresh-accounts', this.products);
  }

  /**
  * @description Receive participants success response API
  * @param {Object} reponse Info response API
  */
  manageResponseSuccessParticipants(reponse) {
    const participants = this.get('participants', reponse);
    const disabled = participants.length > 1;
    this._updateAccountsList(disabled);
  }

  /** @description Manage common account participants response API error */
  manageResponseErrorParticipants() {
    this._updateAccountsList(false);
  }

  /** @description Update account when offer amount changed */
  updateAccounts() {
    let accounts = this.products;
    this.set('accounts', []);
    accounts
      .filter(account => this.get('participants', account))
      .map(item => {
        const counterAccount = this.get('index', item);
        const accountAmount = this.get('primaryAmount.amount', item);
        this._validateMessageAccount(counterAccount, accountAmount, this._offerAmount, this.get('minimumAmount', this.defaultSettings));
      });
    this.set('products', this._accountsList);
    this.refreshAccounts();
  }

  /** @description Open product sheet pdf */
  openProductSheetPdf() {
    this._dispatchEvents('title-pdf-text', 'glomo-deposit-hiring-sheet-pdf-title');
    const params = { 'product.id': 'INVERSIONES', 'subproduct.id': 'PAGARE' };
    this._dispatchEvents('request-pdf-contract', params);
  }

  /**
  * @description Open product terms pdf.
  * @param {Object} evt Id type term pdf
  */
  openProductTermsPdf(evt) {
    const id = this.get('id', evt);
    this._depositSpinner(true);
    const title = id === '1' ? 'glomo-deposit-hiring-contract-pdf-title' : 'glomo-deposit-hiring-guide-pdf-title';
    const params = id === '1'
      ? { 'product.id': 'PASIVOS', 'subproduct.id': 'DEPOSITOPLAZOFIJOPF' }
      : { 'product.id': 'GUIA DE SERVICIOS', 'subproduct.id': 'INVERSION' };
    this._dispatchEvents('title-pdf-text', title);
    this._dispatchEvents('request-pdf-contract', params);
  }

  /**
  * @description  That sends the parameters to get the base64.
  * @param {Array} response Info id pdf
  */
  successResponsePDF(response) {
    const responseId = this.get('0.id', response);
    if (responseId) {
      const requestTermns = { documentTemplate: { id: responseId, templateType: { id: 'PDF' } } };
      this._dispatchEvents('request-post-document', requestTermns);
    }
  }

  /** @description Manage deposits spinner. */
  closeSpinner() {
    this._depositSpinner(false);
  }

  /**
  * @description  Get base64 from the response to display PDF.
  * @param {String} responseBase Info base64 for pdf
  */
  successBasePdf(responseBase) {
    let base64;
    if (this.native) {
      base64 = this._validateBasePdf(this.get('data.parts.0.content', responseBase));
    } else {
      let dato = this._validateBasePdf(responseBase);
      const startBase64 = dato.indexOf('>') + 3;
      let endBase64 = dato.indexOf('=') + 3;
      if (endBase64 <= 2) {
        endBase64 = dato.indexOf('-', startBase64);
        base64 = dato.substring(startBase64, endBase64);
      } else {
        base64 = dato.substring(startBase64, endBase64);
      }
    }
    this.baseSrc = base64;
    this._dispatchEvents('open-document-open-by-base64', {
      value: base64.replace(/(\r\n|\n|\r)/gm, ''),
      mimeType: 'application/pdf',
      headerColor: 'FFFFFFFF',
      tintColor: 'FF072146',
      canShare: false,
      titleColor: 'FF072146',
      blackStatusBar: true,
    });
  }

  /**
  * @description Update account list.
  * @param {Boolean} participants True or false
  */
  _updateAccountsList(participants) {
    let counterNotParticipants = 0;
    this.set(`_accountsList.${this._counterAccount}.participants`, participants);
    this.set(`_accountsList.${this._counterAccount}.primaryAmountClass`, 'amount-large');
    if (!participants) {
      counterNotParticipants++;
      this.set(`_accountsList.${this._counterAccount}.disabled`, true);
      this.set(`_accountsList.${this._counterAccount}.hasTextMessage`, true);
      this.set(`_accountsList.${this._counterAccount}.errorMessage`, 'glomo-deposit-hiring-accounts-step-error-not-participants');
    } else {
      const offerMinimumAmount = this.get('minimumAmount', this.defaultSettings);
      const offerAmount = this.get('defaultAmount', this.defaultSettings);
      const accountAmount = this.get(`${[ this._counterAccount ]}.primaryAmount.amount`, this._accountsList);
      this._validateMessageAccount(this._counterAccount, accountAmount, offerAmount, offerMinimumAmount);
    }
    this._counterAccount++;
    if (this._counterAccount < this._accountsList.length) {
      this._requestAccountsParticipants(this.get(`${[ this._counterAccount ]}.id`, this._accountsList));
    } else {
      this._validParticipant = counterNotParticipants !== this._accountsList.length;
      this._setDataDepositOffer();
      this.set('products', this._accountsList);
    }
  }

  /** @description Set properties for deposits offer. */
  _setDataDepositOffer() {
    this._offerAmount = this.get('defaultAmount', this.defaultSettings);
    this._offerDay = this.get('defaultTermDays', this.defaultSettings);
    this._validateDepositRequirements();
  }

  /** @description Valid if the accounts have the requirements to mkae a deposit hiring. */
  _validateDepositRequirements() {
    if (!this._validMinimumAmounts && !this._validParticipant && !this._validAccounts) {
      this.modalErrorRequirements();
      this._checkNext = false;
      this._depositSpinner(false);
    } else {
      this._validMinimumAmount();
    }
  }

  /** @description Valid if the accounts meet the all minimum amount. */
  _validMinimumAmount() {
    if (!this._validMinimumAmounts) {
      this.modalErrorMinimumAmount();
      this._checkNext = false;
      this._depositSpinner(false);
    } else {
      this._validParticipants();
    }
  }

  /** @description Valid if the accounts meet the participants. */
  _validParticipants() {
    this._depositSpinner(false);
    if (!this._validParticipant && this._validMinimumAmounts) {
      this._checkNext = false;
      this.modalErrorNotParticipants();
    } else {
      this._checkNext = true;
      this.getPromotionCode(this.featureFlags);
    }
  }

  /**
  * @description Validate error message for the account.
  * @param {String} accountAmount Account amount
  * @param {String} offerAmount Offer amount
  * @param {String} offerMinimumAmount Offer minimum amount
  */
  _validateMessageAccount(counterAccount, accountAmount, offerAmount, offerMinimumAmount) {
    let validMinimumAmount = false;
    let disabled = false;
    let hasTextMessage = false;
    let errorMessage = '';
    const amount = this.getFormattedAmount(offerMinimumAmount, this.localCurrency, this.localCurrency, this.currentLanguage);
    if (offerMinimumAmount > accountAmount) {
      disabled = true;
      hasTextMessage = true;
      errorMessage = `${this.t('glomo-deposit-hiring-accounts-step-error-minimum-amount')} $${amount}`;
      validMinimumAmount = true;
    }
    if (!validMinimumAmount) {
      if (offerAmount > accountAmount) {
        disabled = true;
        hasTextMessage = true;
        errorMessage = 'glomo-deposit-hiring-accounts-step-error-insufficient-amount';
        if (this._accountsList.length <= 1 && disabled) {
          this._dispatchEvents('set-product-status', {
            showErrorProductsItem: true,
            primaryButtonDisabled: true
          });
        }
      } else {
        disabled = false;
        hasTextMessage = false;
        errorMessage = '';
        this._dispatchEvents('set-product-status', {
          showErrorProductsItem: false,
          primaryButtonDisabled: false
        });
      }
    }
    this.set(`_accountsList.${counterAccount}.disabled`, disabled);
    this.set(`_accountsList.${counterAccount}.hasTextMessage`, hasTextMessage);
    this.set(`_accountsList.${counterAccount}.errorMessage`, errorMessage);
  }

  /** @description Truncate number decimals */
  _truncate(num, places) {
    return Math.trunc(num * Math.pow(10, places)) / Math.pow(10, places);
  }

  /**
  * @description Validate content Base64
  * @param {String} responseBase
  */
  _validateBasePdf(responseBase) {
    const uri = responseBase;
    try {
      let response = '';
      response = (uri !== window.atob(uri)) ? window.atob(uri) : response;
      return response;
    } catch (e) {
      return uri;
    }
  }

  /**
  * @description Concatenates single unit with single day and unit if it is not single day.
  * @param {Number} day Selected day
  */
  _computeTerm(day) {
    return day === 1 ?
      `${day} ${this.t('glomo-step-deposits-simulator-single-unit')}` :
      `${day} ${this.t('glomo-step-deposits-simulator-unit')}`;
  }

  /**
  * @description Convert the error message to only codemessage
  * @param {String} message Message for BG response
  */
  _convertToValidCodeError(message) {
    return message?.split('#')[0].trim();
  }

  /** @description Clean input amount */
  cleanInputAmount() {
    this._dispatchEvents('set-input-amount', { amount: '', currency: this.localCurrency });
    this._dispatchEvents('deposit-disabled-slider', 'disabled-slider');
  }

  /**
  * @description Add the accounts to the local storage.
  * @param {Array} data List accounts
  */
  _getAccountsGlobalCacheStorage(data) {
    const accountsDashboard = this.get('base.0.products', data);
    if (accountsDashboard) {
      this.set('products', accountsDashboard);
    }
  }

  /**
  * @description Store accounts data form globalCache Storage in accounts DEPOSIT.
  * @param {Array} data List accounts
  */
  _getDataFromGlobalCacheStorage(data) {
    const contracts = this.get('base.data.contracts', data);
    if (contracts) {
      const constractsDeposits = contracts.filter((e) => e.productType === 'DEPOSIT');
      this._getPaymentsDataSucces(constractsDeposits);
    }
  }

  /**
  * @description Validates that purchases exist in the list of contracts.
  * @param {Array} newPayload List accounts
  */
  _getPaymentsDataSucces(newPayload) {
    this._mappingData(newPayload);
    this._alias = this.listPayments.length === 1 ? this.get('0.alias', this.listPayments) : '';
    this.initInfoPage();
  }

  /**
  * @description Mapping the list of contracts.
  * @param {Array} payloadMap Data for new object
  */
  _mappingData(payloadMap) {
    const mappingInfo = payloadMap.map(item => {
      return {
        id: this.get('id', item),
        alias: this.get('alias', item),
        name: this.get('alias', item),
        description: {
          value: this.get('number', item),
          masked: true
        },
        primaryAmount: {
          amount: this.get('detail.specificAmounts.0.amounts.0.amount', item),
          label: this.t('glomo-pfm-profiles-dm-available-balance'),
          currency: this.get('detail.specificAmounts.0.amounts.0.currency', item),
        },
        relatedContracts: this.get('relatedContracts', item),
        localCurrency: this.get('detail.specificAmounts.0.amounts.0.currency', item),
        depositId: this.get('id', item),
        primaryAmountClass: 'amount-large'
      };
    });
    this.set('listPayments', mappingInfo);
  }

  /** @description Init pages for contracts existing. */
  initInfoPage() {
    if (this.listPayments.length > 0) {
      this.redirectPurchase = false;
      this.modalContractPayment();
    }
  }

  /** @description Init pages for list contracts. */
  initListPage() {
    this._setTextHeaders();
    this._configButtonReturn();
    this._setListItems(this.listPayments);
  }

  /** @description Send information in the event heade. */
  _setTextHeaders() {
    this._dispatchEvents('contract-header-text-message', this.t('glomo-contract-payment-existing-text-header'));
    this._dispatchEvents('contract-active-header-title', this.t('glomo-contract-payment-existing-header'));
  }

  /**
  * @description Limit item list and see more in modal.
  * @param {Object} payload List for items
  */
  _setListItems(payload) {
    const jsonItems = (payload || {});
    if (jsonItems.length > 3) {
      const viewData = jsonItems.slice(0, 3);
      this._dispatchEvents('contract-list-items-payments', viewData);
      this._dispatchEvents('contract-active-header-more-info', this.t('glomo-contract-payment-existing-more-info'));
    } else {
      this._dispatchEvents('contract-list-items-payments', jsonItems);
    }
  }

  /** @description Send the list of items to see more. */
  onViewAllPressed() {
    this._dispatchEvents('view-all-list-items-modal', this.listPayments);
  }

  /** @description Return goBack page contracts existing. */
  _configButtonReturn() {
    const configButtonClose = {
      buttons: {
        secondary: {
          text: 'glomo-contract-payment-existing-back-button-label',
          class: 'link',
          action: 'exit-message-contract-payments'
        }
      }
    };
    this._dispatchEvents('contract-button-return-payments', configButtonClose);
  }

  /** @description Return the complete number prop from the account */
  _getAccountCompleteNumber(number) {
    let completeNumber = -1;
    if (this.products.length > 0 && !!number) {
      const numberLength = number.length;
      const accountSelected = this.products.find(item => this.get('description.value', item).slice(-numberLength) === number);
      completeNumber = this.get('description.value', accountSelected);
    }
    return completeNumber;
  }

  /** @description Validates if there is one or more subsequent purchases of a contract. */
  chooseNewRedirect() {
    if (this.redirectPurchase) {
      this._depositSpinner(true);
      this.$.dmDeposits.getDeposit();
    } else {
      this.generateNavigationTo('redirect-contract-payments-existing', this.listPayments);
    }
  }

  /** @description Send depositId to request */
  selectProductItem(depositData) {
    this._depositSpinner(true);
    this.depositId = this.get('depositId', depositData);
    this.$.dmDeposits.getDeposit();
  }

  /** @description Get data response of depositId and filter payment valid. */
  _getResponseRequestDeposit(response) {
    const id = this.get('detail.title.id', response);
    const contractId = '13-0300';
    if (id !== undefined && id === contractId) {
      this.redirectToDepositPurchaseSale();
    } else {
      this._depositSpinner(false);
      this.modaDetailGetData();
    }
  }

  /** @description Redirect to DepositPurchaseSale page, with the data needed. */
  redirectToDepositPurchaseSale() {
    const depositId = this.depositId;
    const depositcontractSelected = depositId ? this.listPayments.find(depositContract => this.get('depositId', depositContract) === depositId) : this.get('0', this.listPayments);
    const accountNumber = this.get('relatedContracts.0.number', depositcontractSelected) || this.get('relatedContracts.0.contractId', depositcontractSelected);
    const accountcompleteNumber = this._getAccountCompleteNumber(accountNumber);
    this._redirectedFromContractExisting = true;
    this._depositSpinner(false);
    this.generateNavigationTo('purchases-sale', {
      depositId: this.get('depositId', depositcontractSelected),
      number: this.get('description.value', depositcontractSelected),
      alias: this.get('alias', depositcontractSelected),
      productId: this.get('depositId', depositcontractSelected),
      relatedContracts: { number: accountcompleteNumber },
      productType: this.productType,
      continue: 'deposit'
    });
  }

  /** @description Show modal when isn´t valid contract */
  modaDetailGetData() {
    let templateMessageModal;
    if (this.listPayments.length > 1) {
      templateMessageModal = {
        type: 'paragraphs',
        values: [
          { icon: 'coronita:alert', iconClass: 'icon-size-24' },
          { text: 'glomo-contract-payment-existing-message-text-detailTwo' }
        ]
      };
    } else {
      templateMessageModal = {
        type: 'paragraphs',
        values: [
          { icon: 'coronita:alert', iconClass: 'icon-size-24' },
          { text: 'glomo-contract-payment-existing-message-text-detailOne' }
        ]
      };
    }
    const modalSettingInfoData = {
      code: 'CONTRACT-EXISTING-DETAIL-GETDATA-MODAL',
      selectedConfig: {
        className: 'custom error',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'glomo-contract-payment-existing-message-exit',
        template: templateMessageModal
      }
    };
    this._dispatchEvents(`${this.constructor.is}-show-modal`, modalSettingInfoData);
  }

  /** @description See a template if the item is equal to one or another template if it is greater than one. */
  modalContractPayment() {
    let result = {
      code: 'deposit-hiring',
      fullHeight: true,
      unfixed: true,
      headerTitle: 'glomo-contract-payment-existing',
      closeIconIdRigth: 'coronita:close',
      imageUrl: this.get('modalContractPayment', this.imgModalsSettings),
      configButtons: {
        buttons: {
          primary: {
            text: 'glomo-deposits-purchase-sale-title',
            class: 'primary'
          },
          secondary: {
            text: 'glomo-contract-payment-existing-new-contract',
            class: 'link'
          }
        }
      }
    };
    if (this.listPayments.length > 1) {
      result = {
        ...result,
        titleText: 'glomo-contract-payment-existing-many-modal-title',
        list: [
          this.t('glomo-contract-payment-existing-modal-One-many'),
          this.t('glomo-contract-payment-existing-modal-Two-many')
        ],
      };
    } else {
      this.redirectPurchase = true;
      result = {
        ...result,
        titleText: 'glomo-contract-payment-existing-first-modal-title',
        list: [
          this.t('glomo-contract-payment-existing-modal-One'),
          this.t('glomo-contract-payment-existing-modal-Two')
        ],
        alias: [
          {
            text: 'glomo-contract-payment-existing-modal-Alias',
            class: 'text-position',
          },
          {
            text: `•${this._alias}`,
            class: 'under-text-position',
          }
        ],
      };
      this.depositId = this.get('0.depositId', this.listPayments);
    }
    this._dispatchEvents('configuration-contract-message-info', result);
    this._depositSpinner(false);
  }

  /**
  * @description Manage deposits spinner.
  * @param {Object} evt True or false
  */
  _depositSpinner(evt) {
    const spinner = evt ? 'deposits-start-spinner' : 'deposits-stop-spinner';
    return this._dispatchEvents(spinner, spinner);
  }

  /** @description Set data for modal validate requirements. */
  modalErrorRequirements() {
    const modalErrorRequirements = {
      code: 'deposit-hiring-error-requirements',
      selectedConfig: {
        className: 'deposit-imposition-header-core-blue deposit-imposition-p deposit-imposition-p-h2-xl-padding-l deposit-imposition-p-ml-600 deposit-imposition-hero-image deposit-imposition-button-large',
        heroImage: this.get('modalErrorRequirements', this.imgModalsSettings),
        openMaximized: true,
        title: 'glomo-deposit-hiring-title',
        acceptBtLabel: 'glomo-deposits-modal-btn-exit',
        template: {
          type: 'paragraphs',
          values: [
            { title: 'glomo-deposit-hiring-modal-error-requirements-title' },
            { text: 'glomo-deposit-hiring-modal-error-requirements-msg' }
          ]
        }
      }
    };
    this._dispatchEvents(`${this.constructor.is}-show-modal`, modalErrorRequirements);
    this.resetDepositHiring();
  }

  /** @description Set data for modal validate minimum amount. */
  modalErrorMinimumAmount() {
    const amount = this.getFormattedAmount(this.get('minimumAmount', this.defaultSettings), this.localCurrency, this.localCurrency, this.currentLanguage);
    const message = `${this.t('glomo-deposit-hiring-modal-error-minimum-amount-msg-1')} $${amount} ${this.t('glomo-deposit-hiring-modal-error-minimum-amount-msg-2')}`;
    const modalErrorMinimumAmount = {
      code: 'deposit-hiring-error-minimum-amount',
      selectedConfig: {
        className: 'deposit-imposition-header-core-blue deposit-imposition-p deposit-imposition-p-h2-xl-padding-l deposit-imposition-p-ml-600 deposit-imposition-hero-image deposit-imposition-button-large',
        heroImage: this.get('modalErrorMinimumAmount', this.imgModalsSettings),
        openMaximized: true,
        title: 'glomo-deposit-hiring-title',
        acceptBtLabel: 'glomo-deposits-modal-btn-exit',
        template: {
          type: 'paragraphs',
          values: [
            { title: 'glomo-deposit-hiring-modal-error-minimum-amount-title' },
            { text: message }
          ]
        }
      }
    };
    this._dispatchEvents(`${this.constructor.is}-show-modal`, modalErrorMinimumAmount);
    this.resetDepositHiring();
  }

  /** @description Set data for modal error not participants. */
  modalErrorNotParticipants() {
    const modalErrorNotParticipants = {
      code: 'deposit-hiring-error-not-participants',
      selectedConfig: {
        className: 'deposit-imposition-header-core-blue deposit-imposition-p deposit-imposition-p-h2-l-padding-l deposit-imposition-p-ml-600 deposit-imposition-hero-image deposit-imposition-button',
        heroImage: this.get('manageSuccesResponseCoupon', this.imgModalsSettings),
        openMaximized: true,
        title: 'glomo-deposit-hiring-title',
        acceptBtLabel: 'glomo-deposits-modal-help-understood',
        template: {
          type: 'paragraphs',
          values: [
            { title: 'glomo-deposit-hiring-modal-error-not-participants-title' },
            { text: 'glomo-deposit-hiring-modal-error-not-participants-msg' }
          ]
        }
      }
    };
    this._dispatchEvents(`${this.constructor.is}-show-modal`, modalErrorNotParticipants);
    this.resetDepositHiring();
  }

  /** @description Set data for modal error not holder. */
  modalErrorNotHolder() {
    const modalErrorNotHolder = {
      code: 'deposit-hiring-error-not-holder',
      selectedConfig: {
        className: 'deposit-imposition-header-core-blue deposit-imposition-p deposit-imposition-p-h2-l-padding-l deposit-imposition-p-ml-600 deposit-imposition-hero-image deposit-imposition-button',
        heroImage: this.get('modalErrorNotHolder', this.imgModalsSettings),
        openMaximized: true,
        title: 'glomo-deposit-hiring-title',
        acceptBtLabel: 'glomo-deposits-modal-help-understood',
        template: {
          type: 'paragraphs',
          values: [
            { title: 'glomo-deposit-hiring-modal-error-not-holder-title' },
            { text: 'glomo-deposit-hiring-modal-error-not-holder-msg' }
          ]
        }
      }
    };
    this._dispatchEvents(`${this.constructor.is}-show-modal`, modalErrorNotHolder);
    this.resetDepositHiring();
  }

  /** @description Set data for modal error not hundred percent. */
  modalErrorNotHundredPercent() {
    const modalErrorNotHundredPercent = {
      code: 'deposit-hiring-error-not-hundred-percent',
      selectedConfig: {
        className: 'deposit-imposition-header-core-blue deposit-imposition-p deposit-imposition-p-h2-l-padding-l deposit-imposition-p-ml-600 deposit-imposition-hero-image deposit-imposition-button',
        heroImage: this.get('modalErrorNotHundredPercent', this.imgModalsSettings),
        openMaximized: true,
        title: 'glomo-deposit-hiring-title',
        acceptBtLabel: 'glomo-deposits-modal-help-understood',
        template: {
          type: 'paragraphs',
          values: [
            { title: 'glomo-deposit-hiring-modal-error-not-hundred-percent-title' },
            { text: 'glomo-deposit-hiring-modal-error-not-hundred-percent-msg' }
          ]
        }
      }
    };
    this._dispatchEvents(`${this.constructor.is}-show-modal`, modalErrorNotHundredPercent);
    this.resetDepositHiring();
  }

  /** @description Set data for modal error not contracting product. */
  modalErrorNotContractingProduct() {
    const modalErrorNotContractingProduct = {
      code: 'deposit-hiring-error-not-contracting-product',
      selectedConfig: {
        className: 'deposit-imposition-header-core-blue deposit-imposition-p deposit-imposition-p-h2-l-padding-l deposit-imposition-p-ml-600 deposit-imposition-hero-image deposit-imposition-button',
        heroImage: this.get('modalErrorNotContractingProduct', this.imgModalsSettings),
        openMaximized: true,
        title: 'glomo-deposit-hiring-title',
        acceptBtLabel: 'glomo-deposits-modal-help-understood',
        template: {
          type: 'paragraphs',
          values: [
            { title: 'glomo-deposit-hiring-modal-error-not-contracting-product-title' },
            { text: 'glomo-deposit-hiring-modal-error-not-contracting-product-msg' }
          ]
        }
      }
    };
    this._dispatchEvents(`${this.constructor.is}-show-modal`, modalErrorNotContractingProduct);
    this.resetDepositHiring();
  }

  /** @description Set data for modal error level accounts. */
  modalErrorLevelAccounts() {
    const modalErrorLevelAccounts = {
      code: 'deposit-hiring-error-level-accounts',
      selectedConfig: {
        className: 'deposit-imposition-header-core-blue deposit-imposition-p deposit-imposition-p-h2-l deposit-imposition-p-ml-600 deposit-imposition-hero-image deposit-imposition-button',
        heroImage: this.get('modalErrorLevelAccounts', this.imgModalsSettings),
        openMaximized: true,
        title: 'glomo-deposit-hiring-title',
        acceptBtLabel: 'glomo-deposits-modal-help-understood',
        template: {
          type: 'paragraphs',
          values: [
            { title: 'glomo-deposit-hiring-modal-error-level-accounts-title' },
            { text: 'glomo-deposit-hiring-modal-error-level-accounts-msg' }
          ]
        }
      }
    };
    this._dispatchEvents(`${this.constructor.is}-show-modal`, modalErrorLevelAccounts);
    this.resetDepositHiring();
  }

  /**
    * @description show modal exit confirmation
    * @event modal-exit-confirmation modal exit confirmation
    */
  modalExitConfirmation() {
    const modalExitConfirmation = {
      code: 'deposit-hiring-exit',
      selectedConfig: {
        className: 'alert deposit-imposition-exit deposit-imposition-button-large error',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'glomo-deposits-modal-btn-exit',
        cancelBtLabel: 'glomo-deposits-modal-btn-continue',
        template: {
          type: 'paragraphs',
          values: [
            {
              icon: 'coronita:alert',
              iconClass: 'icon-size-24',
              class: 'error',
            },
            { text: 'glomo-deposits-modal-exit-message' },
          ]
        }
      }
    };
    this._dispatchEvents('modal-exit-confirmation', modalExitConfirmation);
  }

  /**
   * @desc Set data for modal error operation out time
  */
  modalErrorOperationOutTime() {
    const modalErrorOperationOutTime = {
      code: 'deposit-error-operation-out-time',
      selectedConfig: {
        className: 'deposit-imposition-header-core-blue deposit-imposition-p deposit-imposition-p-h2-xl-padding-l deposit-imposition-p-ml-600 deposit-imposition-hero-image deposit-imposition-button',
        heroImage: this.get('modalErrorOperationOutTime', this.imgModalsSettings),
        openMaximized: true,
        title: 'glomo-deposit-hiring-title',
        acceptBtLabel: 'glomo-deposits-modal-help-understood',
        template: {
          type: 'paragraphs',
          values: [
            { title: 'glomo-deposits-fault-operation-out-time' },
            { text: 'glomo-deposits-fault-operation-out-time-message' }
          ]
        }
      }
    };
    this._dispatchEvents('modal-error-operation-out-time', modalErrorOperationOutTime);
  }

  /**
   * @desc Set data for modal error wrong currency
   * @event 'modal-error-wrong-currency' show modal wrong currency
  */
  modalErrorWrongCurrency() {
    const modalErrorWrongCurrency = {
      code: 'deposit-hiring-error-wrong-currency',
      selectedConfig: {
        className: 'deposit-imposition-header-core-blue deposit-imposition-p deposit-imposition-p-h2-l-padding-l deposit-imposition-p-ml-600 deposit-imposition-hero-image deposit-imposition-button',
        heroImage: this.get('modalErrorWrongCurrency', this.imgModalsSettings),
        openMaximized: true,
        title: 'glomo-deposit-hiring-title',
        acceptBtLabel: 'glomo-deposits-modal-help-understood',
        template: {
          type: 'paragraphs',
          values: [
            { title: 'glomo-deposit-hiring-modal-error-wrong-currency-title' },
            { text: 'glomo-deposit-hiring-modal-error-wrong-currency-msg' }
          ]
        }
      }
    };
    this._dispatchEvents(`${this.constructor.is}-show-modal`, modalErrorWrongCurrency);
  }

  /**
   * @desc Set data for modal error account blocked
   * @event 'modal-error-account-blocked' show modal account blocked
  */
  modalErrorAccountBlocked() {
    const modalErrorAccountBlocked = {
      code: 'deposit-hiring-error-account-blocked',
      selectedConfig: {
        className: 'deposit-imposition-header-core-blue deposit-imposition-p deposit-imposition-p-h2-l-padding-l deposit-imposition-p-ml-600 deposit-imposition-hero-image deposit-imposition-button',
        heroImage: this.get('modalErrorAccountBlocked', this.imgModalsSettings),
        openMaximized: true,
        title: 'glomo-deposit-hiring-title',
        template: {
          type: 'paragraphs',
          values: [
            { title: 'glomo-deposit-hiring-modal-error-account-blocked-title' },
            { text: 'glomo-deposit-hiring-modal-error-account-blocked-msg' }
          ]
        }
      }
    };
    this._dispatchEvents(`${this.constructor.is}-show-modal`, modalErrorAccountBlocked);
  }

  /**
   * @description show modal simulator help btn info
    * @event modal-info-simulator modal simulator info
    * @param {Object} evt data id button
  */
  modalSimulatorHelpBtnTapped(evt) {
    let template = {
      type: 'paragraphs',
      values: []
    };
    let evtName = '';
    if (evt === this.get('0', this._gatNomIndex) || (evt === this.get('1', this._gatNomIndex) && this.helpBtnInfo) || evt === this.get('2', this._gatNomIndex)) {
      template = {
        ...template,
        values: [
          { icon: 'coronita:help', class: 'paragraph-icon info dark-core-blue' },
          { title: 'glomo-deposits-simulator-title-nominal-2', class: 'simple-title' },
          { text: 'glomo-deposits-simulator-modal-help-text-3-nominal', class: 'text-gray-ml' },
          { text: 'glomo-deposits-simulator-modal-help-text-4-nominal', class: 'text-gray-ml' }
        ]
      };
      evtName = 'modal-info-simulator';
    } else if (evt === this.get('0', this._gatRealIndex) || evt === this.get('1', this._gatRealIndex) || evt === this.get('2', this._gatRealIndex)) {
      template = {
        ...template,
        values: [
          { icon: 'coronita:help', class: 'paragraph-icon info dark-core-blue' },
          { title: 'glomo-deposits-simulator-title-3', class: 'simple-title ' },
          { text: 'glomo-deposits-simulator-modal-help-text-3-real', class: 'text-gray-ml' },
          { text: 'glomo-deposits-simulator-modal-help-text-4-real', class: 'text-gray-ml' }
        ]
      };
      evtName = 'modal-info-simulator';
    }
    const modalInfoSimulator = {
      code: 'simulator',
      selectedConfig: {
        className: 'deposit-imposition-header-light-white deposit-imposition-p deposit-imposition-info-icon deposit-imposition-p-h2-weight-500 deposit-imposition-p-h2-l deposit-imposition-p-h2-margin deposit-imposition-p-margin deposit-imposition-p-ml-500',
        openMaximized: true,
        title: evt === this.get('0', this._gatNomIndex) ? 'glomo-deposits-simulator-title-0' : 'glomo-deposits-simulator-title-1',
        acceptBtLabel: 'glomo-deposits-modal-help-understood',
        template: template
      }
    };
    this._dispatchEvents(evtName, modalInfoSimulator);
  }

  /**
   * @description show modal instruction help btn info
   * @event modal-info-instruction modal instruction info
   * @param {Object} evt data id button
   */
  modalInstructionHelpBtnInfo(evt) {
    const id = this.get('id', evt);
    const modalInfoInstruction = {
      code: 'instruction',
      selectedConfig: {
        className: 'deposit-imposition-header-light-white deposit-imposition-p deposit-imposition-info-icon deposit-imposition-p-h2-weight-500 deposit-imposition-p-h2-l deposit-imposition-p-h2-margin deposit-imposition-p-margin deposit-imposition-p-ml-500 deposit-imposition-button-core-light-blue',
        openMaximized: true,
        title: 'glomo-deposit-hiring-title',
        acceptBtLabel: 'glomo-deposits-modal-help-understood',
        template: {
          type: 'paragraphs',
          values: [
            { icon: 'coronita:help' },
            { title: `glomo-deposits-instruction-title-${id}` },
            { text: `glomo-deposits-instruction-modal-help-text-${id}-1` },
            { text: `glomo-deposits-instruction-modal-help-text-${id}-2` }
          ]
        }
      }
    };
    this._dispatchEvents('modal-info-instruction', modalInfoInstruction);
  }

  /**
   * @desc Set data for modal ipab info
   * @event 'modal-info-ipab' show modal ipab
   */
  modalIpabInfo() {
    const alertIpabInfo = {
      code: 'ipab',
      selectedConfig: {
        className: 'deposit-imposition-header-light-white deposit-imposition-p deposit-imposition-info-icon deposit-imposition-p-h2-weight-500 deposit-imposition-p-h2-l deposit-imposition-p-h2-margin deposit-imposition-p-margin deposit-imposition-p-ml-600',
        openMaximized: true,
        title: 'glomo-deposit-hiring-title',
        acceptBtLabel: 'glomo-deposits-modal-help-understood',
        template: {
          type: 'paragraphs',
          values: [
            { icon: 'coronita:help' },
            { title: 'glomo-deposits-purchase-success-ipab' },
            { text: 'glomo-deposit-hiring-success-ipab-text' },
            { text: 'glomo-deposits-purchase-success-ipab-link' }
          ]
        }
      }
    };
    this._dispatchEvents('modal-info-ipab', alertIpabInfo);
  }
  /**
   * Modal Retry Error
   */
  onRevertModalDispatch() {
    this._dispatchEvents('retry-error', {
      retryErrorData: {
        errorId: 'deposits_hiring',
        errorType: 'operation',
        retryConfig: {
          srcImage: this.get('onRevertModalDispatch', this.imgModalsSettings),
          header: 'glomo-deposit-hiring-title',
          title: 'glomo-deposits-modal-fault-operation',
          message: 'glomo-deposits-modal-fault-operation-message',
          acceptBtLabel: 'glomo-deposits-modal-btn-retry',
          cancelBtLabel: 'glomo-deposits-modal-btn-cancel',
          fullModal: true
        },
        callConfig: {
          isProductDetail: true,
          hidden: true
        }
      }
    });
  }
  /** Dispatches a custom event with name and detail
  * @param {String} eventName
  * @param {any} detail
  */
  _dispatchEvents(eventName, detail) {
    this.dispatchEvent(new CustomEvent(eventName, {
      detail,
      bubbles: true,
      composed: true
    }));
  }
}

customElements.define(GlomoDepositsDmMx.is, GlomoDepositsDmMx);
