/*global moment*/
class GlomoTollRechargeManagerMx extends Polymer.mixinBehaviors([CellsBehaviors.CellsCheckNestedKeysBehavior, CellsBehaviors.i18nBehavior], Polymer.Element) {

  static get is() {
    return 'glomo-toll-recharge-manager-mx';
  }

  static get properties() {
    return {
      /**
       * @desc global cache Storage
       * @type {Object}
       */
      globalCacheStorage: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc show accounts
       * @type {String}
       */
      financialData: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc show local currency
       * @type {String}
       */
      localCurrency: {
        type: String,
        value: () => ({})
      },
      /**
       * @desc cards to be displayed
       * @type {Object}
       */
      products: {
        type: Object,
        value: () => ({}),
        notify: true
      },
      /**
       * @desc Value of comission
       * @type {Object}
       */
      commissionValue: {
        type: Number,
        value: 12
      },
      /**
       * @desc Values to send to header recharge
       * @type {Object}
       */
      detailTag: {
        type: Object,
        observer: '_getLimitedAmount'
      },
      /**
       * @desc Max amount available
       * @type {Number}
       */
      maxRangeAmount: {
        type: Number,
        value: 2999
      },
      /**
       * @desc Limit of amount to can recharge
       * @type {Number}
       */
      limitedAmount: {
        type: Number,
        notify: true
      },
      /**
       * @desc Amount selected to recharge
       * @type {Object}
       */
      amountRechargeSelected: {
        type: Object,
        observer: '_parseAccount'
      },
      /**
       * @desc Account selected to pay
       * @type {Object}
       */
      accountSelected: {
        type: Object
      },
      /**
       * @desc Max amount value of account to recharge
       * @type {Number}
       */
      maxValueAmount: {
        type: Number,
        value: 2800
      },
      /**
       * @desc Object with buttons to show
       * @type {Array}
       */
      showAmounts: {
        type: Array,
        value: () => [200, 300, 400, 500, 700, 1000, 1500, 2000]
      },
      /**
       * @desc Object with amount and currency
       * @type {Object}
       */
      summaryAmount: {
        type: Object,
        value: () => ({}),
        notify: true
      },
      /**
     * serviceResponse to send save response
     * @type {Object}
     */
      serviceResponse: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Agreement number with the service
       * @type {object}
       */
      currentAgreement: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Customer ID
       * @type {String}
       */
      customerId: {
        type: String,
        value: () => ({}),
        notify: true
      },
      /**
       * @desc Customer email
       * @type {String}
       */
      userEmail: {
        type: String,
        value: ''
      },
      /**
       * @desc vaue comission
       * @type {String}
       */
      commissionValueString: {
        type: String,
        value: '12.00'
      },
      /**
       * @desc accounts Data
       * @type {Object}
       */
      accountsData: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Set modal config items
       * @type {Object}
      */
      modalConfigItems: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Prefix
       * @type {Object}
      */
      agreements: {
        value: () => ({
          pase: {
            prefixies: /^(CPFI|IMDM|005|006)([0-9]{9})+$/g,
            logo: 'images/tagCard/pase.svg',
            logo2: 'images/tagCard/paseb.svg',
            agreement: '001783556',
            text2: 'tag-recharge-dm-success-top-info-key-two'
          },
          televia: {
            prefixies: /^(OHLM|099)([0-9]{8})+$/g,
            logo: 'images/tagCard/televiab.svg',
            logo2: 'images/tagCard/televia.svg',
            agreement: '002036657',
            text2: 'tag-recharge-dm-success-top-info-key'
          }
        }),
        type: Object
      },
      /**
       * @desc Type of pag
       * @type {String}
       */
      typeAgreement: {
        type: String,
        value: ''
      },
      /**
       * @desc data for analytics
       * @type {String}
       */
      persistentData: {
        type: Object,
        notify: true,
        value: () => ({})
      },
      /**
       * @desc Feature flags
       * @type {Object}
       */
      featureFlags: { type: Object },
      /**
       * @description flag to handler payment MTU
       * @type {Object}
       * @default {}
       */
      mtuFlag: {
        type: Object,
        value: () => ({})
      }
    };
  }

  /**
   * @desc Dispatch more info recharge depending on the services
   */
  moreInfoRechargeAgreement() {
    let eventId = this.typeAgreement === 'televia' ? { id: 'more-info-recharge-televia' } : { id: 'more-info-recharge' };
    this._showInfoModal(eventId);
  }

  _setAgreementData(agreementNumber) {
    if (this.agreements.televia.prefixies.test(agreementNumber)) {
      this.set('typeAgreement', 'televia');
      let objConfInfoTel = {
        class: 'third-icon-message',
        type: 'info',
        icon: 'coronita:info',
        heading: 'pase-tag-recharge-step-two-info-heading',
        message: this.t('tag-recharge-step-two-info-message-televia', '', { commissionValueRecharge: this._dataConvert(this.commissionValue) }),
        textButton: 'pase-tag-recharge-step-two-more-info-button-label'
      };
      this._dispatchEvent('set-enter-amount-third-message', objConfInfoTel);
      Object.assign(this.agreements.televia, { text: this.t('tag-recharge-dm-success-fees', '', { commissionValueRecharge: this._dataConvert(this.commissionValue) }) });
      this.currentAgreement = this.agreements.televia;
      this._dispatchEvent('agreement-type', 'televia');
      Object.assign(this.persistentData, {
        provider: 'televia'
      });
    } else if (this.agreements.pase.prefixies.test(agreementNumber)) {
      this.set('typeAgreement', 'pase');
      let objConfInfoPas = {
        class: 'third-icon-message',
        type: 'info',
        icon: 'coronita:info',
        heading: 'pase-tag-recharge-step-two-info-heading',
        message: this.t('tag-recharge-step-two-info-message-pase', '', { commissionValueRecharge: this._dataConvert(this.commissionValue) }),
        textButton: 'pase-tag-recharge-step-two-more-info-button-label'
      };
      this._dispatchEvent('set-enter-amount-third-message', objConfInfoPas);
      Object.assign(this.agreements.pase, { text: this.t('tag-recharge-dm-success-fees-two', '', { commissionValueRecharge: this._dataConvert(this.commissionValue) }) });
      this.currentAgreement = this.agreements.pase;
      this._dispatchEvent('agreement-type', 'pase');
      Object.assign(this.persistentData, {
        provider: 'pase'
      });
    }
  }

  /**
   * @desc Obtain data from cardList page
   * @param {Object} detail values of pase account
  */
  getDetailRecharge(detail) {
    this._dispatchEvent('reset-steps-event');
    this._setAgreementData(this.get('billNumber', detail));
    const tagDetail = {
      name: this.get('name', detail),
      id: this.get('contactId', detail),
      imgSrc: this.get('logo', this.currentAgreement),
      description: { value: this.get('billNumber', detail), masked: true },
      group: 'account',
      primaryAmount: {
        amount: this.get('amount.amount', detail),
        currency: this.get('amount.currency', detail),
        label: 'pase-tag-recharge-dm-amount',
      }
    };
    this.set('detailTag', tagDetail);
    this._dispatchEvent('set-recharge-detail-event', tagDetail);
    this._validationAmount(detail);
  }

  /**
   * @desc Validate of amount with maxValueAmount to show next steps
   * @param {Object} detail values of pase account
   */
  _validationAmount(detail) {
    let disabledStep = false;
    if (this.get('amount.amount', detail) >= this.maxValueAmount) {
      this._dispatchEvent('set-recharge-detail-error-message-event', 'tag-recharge-dm-max-value-amount');
      this._dispatchEvent('set-recharge-detail-error-message-show-event', true);
    } else {
      disabledStep = true;
    }
    this._dispatchEvent('set-recharge-detail-disable-steps', disabledStep);
  }

  /**
   * @desc Validate of amount to show max to recharge
   * @param {Object} detail values of pase account
   */
  _getLimitedAmount(detail) {
    let amount = this.get('primaryAmount.amount', detail);
    let setLimitedAmount = this.maxRangeAmount - amount;
    let maxAmount = 0;

    for (let i = 100; i < setLimitedAmount; i = i + 100) {
      maxAmount = i;
    }

    this.set('limitedAmount', maxAmount);
  }

  /**
   * @desc Initialize and show steps
   */
  init() {
    if (this.mtuFlag?.makePayment || this.mtuFlag?.cancelPayment) {
      return this.mtuMakePayment();
    }
    this._dispatchEvent('currency-mx', this.localCurrency);
    this._dispatchEvent('set-message-amount-collapsed', this.t('tag-recharge-step-two-message-below-label-collapsed', '', { commissionValueRecharge: this._dataConvert(this.commissionValue) }));
    this._dispatchEvent('request-customer-id-event');
    this._dispatchEvent('show-buttons-amount', [ ...this.showAmounts ]);
    this._dispatchEvent('close-control-veil');
  }

  /**
   * @description Make payment when confirm mtu limit
   */
  mtuMakePayment() {
    /* istanbul ignore else */
    if (this.mtuFlag?.makePayment && !this.mtuFlag?.cancelPayment) {
      this.requestRecharge();
    }
    this.mtuFlag = {};
  }

  /**
   * @desc prepare the value of the commission to be sent
   * @param {Number} comission commission value
   */
  _dataConvert(comission) {
    return comission + '.00';
  }

  /**
   * @desc Dispatch an event to do a request to get email
   * @param {Object} payload valuess of customer
   */
  requestEmail(payload) {
    this.set('customerId', this.get('0.customerId', payload));
    this._dispatchEvent('request-customer-addresses-event');
  }

  /**
   * @desc Obtain customer email
   * @param {Object} payload valuess of customer
   */
  getEmail(payload) {
    let email = this.get('contactDetails.1.contact', payload);
    this.set('userEmail', email ? email : '');
  }

  errorCustomerDetail() {
    this.set('userEmail', '');
  }

  /**
   * @desc Enable next step if account has less amount than recharge
   * @param {Object} amountSelected
   */
  _parseAccount(amountSelected) {
    if (this.accountSelected && amountSelected && amountSelected.amount > this.accountSelected.primaryAmount.amount) {
      this._dispatchEvent('reset-steps-after-user-selector', 1);
    }
    this.set('summaryAmount', {
      alternativeCommission: this.t('tag-recharger-message', '', { commissionValueRecharge: this._dataConvert(this.commissionValue) }),
      amount: {
        amount: this.c(amountSelected, 'amount', ''),
        currency: this.localCurrency
      }
    });
    this.set('accountsData', this.get('contracts', this.financialData.data));
    if (Object.entries(this.financialData).length !== 0) {
      this.accounts = this.accountsData.filter(data => data.productType === 'ACCOUNT' && (this.get('detail.specificAmounts.0.amounts.0.currency', data) === this.localCurrency));
      this._getAccounts(this.accounts);
    } else {
      this.accounts = this.globalCacheStorage.dashboard.accounts;
      this._getAccounts(this.globalCacheStorage.dashboard.accounts);
    }
  }

  /**
   * @desc Get Accounts from local Storage
   * @param {Object} accounts
  */
  _getAccounts(accounts) {
    let textMessage = false;
    let disabledAccount = false;
    let amount = 0;
    let currency = 0;
    let nameParam = '';
    let mappedAccounts = accounts
      .map(item => {
        textMessage = false;
        disabledAccount = false;
        if (item.detail !== undefined) {
          amount = item.detail.specificAmounts[0].amounts[0].amount;
          currency = item.detail.specificAmounts[0].amounts[0].currency;
          nameParam = item.product.name;
        } else {
          amount = item.availableBalance.currentBalances[0].amount;
          currency = item.availableBalance.currentBalances[0].currency;
          nameParam = item.accountType.name;
        }
        if (this.amountRechargeSelected !== undefined) {
          if (this.amountRechargeSelected.amount > amount) {
            textMessage = true;
            disabledAccount = true;
            this._validateAccounts(accounts);
          }
        }
        return {
          id: item.number,
          accountId: item.accountId,
          name: nameParam,
          description: { value: item.number, masked: true },
          primaryAmount: {
            amount: amount,
            currency: currency,
            label: 'account-label-available_current_balances'
          },
          hasTextMessage: textMessage,
          disabled: disabledAccount,
          imgSrc: item.image || './images/accounts/bbva40.svg',
          imgWidth: 26,
          imgHeight: 26
        };
      });
    this.set('products', mappedAccounts);
  }

  /**
   * @Desc validate account status
   */
  _validateAccounts(accounts) {
    this._dispatchEvent('validate-account-event', Array.isArray(accounts) && accounts.length === 1 ? true : false);
  }
  /**
   * @desc Function that generates body request to v0
   */
  generatePurcharseRequestV0() {
    return {
      service: {
        id: this.get('agreement', this.currentAgreement),
      },
      description: 'PAGO DE SERVICIO',
      bill: {
        id: this.detailTag.description.value,
        billAmount: this.summaryAmount.amount
      },
      origin: {
        contractId: this._getContractId(),
        product: {
          id: 'ACCOUNTS'
        }
      },
      numberType: {
        id: 'CLABE'
      },
      additionalFields: [{
        additionalPaymentField: {
          id: 'ADDITIONAL_REFERENCE_NUMBER'
        },
        value: ''
      }, {
        additionalPaymentField: {
          id: 'VALIDATION_SEQUENCE'
        },
        value: ''
      }, {
        additionalPaymentField: {
          id: 'BUYER_QR_INFORMATION'
        },
        value: ''
      }, {
        additionalPaymentField: {
          id: 'SELLER_QR_INFORMATION'
        },
        value: ''
      }]
    };
  }
  /**
   * @desc Function that generates body request to v1
   */
  generatePurcharseRequestV1() {
    return {
      services: [
        {
          id: this.get('agreement', this.currentAgreement),
          bills: [
            {
              id: this.detailTag.description.value,
              amounts: [
                {
                  amountType: {
                    id: 'TOTAL_DEBT'
                  },
                  amountValue: this.summaryAmount.amount
                }
              ],
              additionalFields: []
            }
          ]
        }
      ],
      origin: {
        contractId: this._getContractId(),
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
   * @desc Get Feature flags and set to use
   */
  getFeatureFlagCollection(flags) {
    this.featureFlags = flags;
    this._dispatchEvent('feature-flags', this.featureFlags);
  }
  /**
   * @desc Dispatch an event to do request of recharge
   */
  requestRecharge() {
    if (this.featureFlags['glomo.operations.blackHawkPurchaseBackOfOperations']?.value) {
      this._dispatchEvent('request-recharge-event-back-of-operation', { body: this.generatePurcharseRequestV1() });
    } else {
      this._dispatchEvent('request-recharge-event', { body: this.generatePurcharseRequestV0() });
    }
  }
  _getContractId() {
    const currentAccount = this.accounts.find((account) => this.get('number', account) === this.get('id', this.accountSelected));
    if (Object.entries(this.financialData).length !== 0) {
      return this.get('id', currentAccount);
    } else {
      return this.get('accountId', currentAccount);
    }
  }

  /**
   * @desc Dispatch an event to go to success page
  */
  successResponseRecharge(detail) {
    let services = this.get('services', detail);
    const convenio = this.get('service.id', detail) ?? this.get('id', services[0]);
    let result = {
      date: new Date(),
      title: 'tag-recharge-dm-success-title',
      amountLabel: 'tag-recharge-dm-success-amount-label',
      origin: {
        avatar: { src: this.get('logo2', this.currentAgreement), }
      },
      fees: [ {
        text: this.get('text', this.currentAgreement),
      } ],
      chargeAmount: {
        amount: this.summaryAmount.amount.amount,
        currency: '$',
        class: 'amount-huge-decimals'
      },
      topInfo: [
        {
          key: 'tag-recharge-success-description',
          class: 'key-bold',
        },
        {
          value: this.t('tag-recharge-success-agreement') + '&nbsp;' + convenio,
          class: 'spacing'
        },
        {
          key: 'tag-recharge-dm-success-retirement-account',
          class: 'header-additional-info__row spacing-top light-key',
        },
        {
          key: this.accountSelected.name,
          class: 'header-additional-info__row spacing-xs bold',
          musk: {
            value: this.accountSelected.id,
            chars: 4,
            simbol: '•'
          }
        },
        {
          key: 'tag-recharge-dm-success-operator',
          class: 'header-additional-info__row spacing-top light-key',
        },
        {
          key: this.get('text2', this.currentAgreement),
          value: this.get('description.value', this.detailTag),
          class: 'header-additional-info__row spacing-xs bold'
        },
        {
          key: 'tag-recharge-dm-success-alias-tag',
          value: this.get('name', this.detailTag),
          class: 'header-additional-info__row spacing-top bold'
        },
        {
          key: 'tag-recharge-dm-success-guide-code',
          value: this.get('trackingReference', detail),
          class: 'header-additional-info__row spacing-top bold'
        },
        {
          key: 'tag-recharge-dm-success-invoice',
          value: this.get('id', detail),
          class: 'header-additional-info__row spacing-top bold'
        }
      ],
      message: {
        type: 'info-dark-blue',
        text: 'tag-recharge-dm-success-message-text',
        icon: 'coronita:info',
      },
      maskedMessage: {
        class: 'key-bold',
        text: this.userEmail,
        visibleChars: 12,
        maskChars: '&bull;'
      },
      operations: [
        {
          label: 'tag-recharge-dm-success-share',
          id: 'share',
          icon: 'coronita:share',
          share: true
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

    Object.assign(this.persistentData, {
      operationNumber: this.get('id', detail)
    });
    this._dispatchEvent('success-response-analytics');
    this._dispatchEvent('navigation-to-recharge-review', result);
    this._dispatchEvent('success-detail', detail);
  }

  resetStepExit() {
    this.detailTag = [];
  }

  /**
   * @desc Set config open modal
   * @event open-info-modal
   * @param {Object} detail
  */
  _showInfoModal(ev) {
    const modalConfigItem = this.modalConfigItems[ev.id];
    const data = {
      code: modalConfigItem.code,
      selectedConfig: {
        className: modalConfigItem.className,
        openMaximized: modalConfigItem.maximize,
        hideCloseIcon: modalConfigItem.hideCloseIcon,
        iconOnlyFullHeight: true,
        closeOnPrimaryButton: modalConfigItem.closeOnPrimaryButton,
        acceptBtLabel: modalConfigItem.acceptBtLabel,
        onAcceptEvent: modalConfigItem.onAcceptEvent,
        template: {
          type: 'paragraphs',
          values: modalConfigItem.values
        }
      }
    };
    if (modalConfigItem.code === 'more-info-recharge') {
      data.selectedConfig.template.values[2].text = this.t('tag-recharge-more-info-paragraph-one-pase', '', { commissionValueRecharge: this._dataConvert(this.commissionValue) });
    }
    if (modalConfigItem.code === 'more-info-recharge-televia') {
      data.selectedConfig.template.values[2].text = this.t('tag-recharge-more-info-paragraph-one', '', { commissionValueRecharge: this._dataConvert(this.commissionValue) });
    }
    if (modalConfigItem.title) {
      data.selectedConfig.title = modalConfigItem.title;
    }
    if (modalConfigItem.cancelBtLabel) {
      data.selectedConfig.cancelBtLabel = modalConfigItem.cancelBtLabel;
      data.selectedConfig.onCancelEvent = modalConfigItem.onCancelEvent;
    }

    if (modalConfigItem.heroImage) {
      data.selectedConfig.heroImage = modalConfigItem.heroImage;
    }
    this._dispatchEvent('open-info-modal', data);
  }

  /** @desc error modal configuration */
  modalMessageError(ev) {
    const code = {
      id: 'error-modal-general'
    };
    const modalConfigItem = {
      code: ev.id,
      title: ev.title,
      maximize: true,
      className: 'close-button--right info header--white-call-me-back',
      closeOnPrimaryButton: true,
      acceptBtLabel: ev.acceptBtLabel,
      cancelBtLabel: ev.cancelBtLabel,
      cancelFromHeaderEvent: 'HEADER',
      heroImage: ev.svg,
      values: [{
        title: ev.titleMessage,
        class: 'spacing--xs text-center'
      },
      {
        text: ev.message,
        class: 'spacing text-center title-grey'
      },
      ]
    };
    this.modalConfigItems['error-modal-general'] = modalConfigItem;
    this._showInfoModal(code);
  }

  /**
   * @desc Config modal and dispatch event to open modal
   * @param ev {Object}
  */
  showInfoModalErrorFormat(ev) {
    let errorModalStructure = {
      corporate: {
        id: 'tag-corporate',
        codeError: 'EIE0331',
        descriptionError: 'ERROR: TAG CORPORATIVA VERIFICAR',
        descriptionErrorTelevia: '',
        svg: 'images/general_error.svg',
        title: 'tag-corporate-title',
        acceptBtLabel: 'tag-limit-max-exit',
        cancelBtLabel: 'tag-corporate-call',
        titleMessage: 'tag-corporate-title-message',
        message: 'tag-corporate-message'
      },
      suspended: {
        id: 'this-tag-is-suspended',
        codeError: 'EIE0331',
        descriptionError: 'ERROR: TAG SUSPENDIDA VERIFICAR',
        descriptionErrorTelevia: 'ERROR: TAG SUSPENDIDA- VERIFICAR',
        svg: 'images/general_error.svg',
        title: 'this-tag-is-suspended-title',
        acceptBtLabel: 'tag-limit-max-exit',
        cancelBtLabel: 'this-tag-is-suspended-call',
        titleMessage: 'this-tag-is-suspended-title-message',
        message: 'this-tag-is-suspended-message'
      },
      canceled: {
        id: 'this-tag-canceled',
        codeError: 'EIE0331',
        descriptionError: 'ERROR: TAG CANCELADO VERIFICAR',
        descriptionErrorTelevia: 'ERROR: TAG CANCELADO- VERIFICAR',
        svg: 'images/general_error.svg',
        title: 'this-tag-canceled-title',
        acceptBtLabel: 'tag-limit-max-exit',
        cancelBtLabel: 'this-tag-canceled-call',
        titleMessage: 'this-tag-canceled-title-message',
        message: 'this-tag-canceled-message'
      },
      card: {
        id: 'this-tag-is-domiciled-to-a-credit-card',
        codeError: 'EIE0331',
        descriptionError: 'ERROR: TAG CON TARJETA BANCARIA VERIFICAR',
        descriptionErrorTelevia: 'ERROR: TAG CON TARJETA BANC-ARIA VERIFICAR',
        svg: 'images/general_error.svg',
        title: 'this-tag-is-domiciled-to-a-credit-card-title',
        acceptBtLabel: 'tag-limit-max-exit',
        cancelBtLabel: 'this-tag-is-domiciled-to-a-credit-card-call',
        titleMessage: 'this-tag-is-domiciled-to-a-credit-card-title-message',
        message: 'this-tag-is-domiciled-to-a-credit-card-message'
      },
      errorGeneralInfo: {
        id: 'system-not-available-pase-error-info',
        codeError: 'EIE0331',
        descriptionError: '',
        descriptionErrorTelevia: '',
        svg: 'images/tagCard/Connectivity.svg',
        title: 'system-not-available-pase-error-info-title',
        acceptBtLabel: 'system-not-available-pase-error-info-exit',
        cancelBtLabel: 'system-not-available-pase-error-info-call',
        titleMessage: 'system-not-available-pase-error-info-title-message',
        message: 'system-not-available-pase-error-info-message'
      },
      limitTagMax: {
        id: 'tag-limit-max',
        codeError: 'EIE0331',
        descriptionError: 'tag-limit-max',
        descriptionErrorTelevia: '',
        svg: 'images/general_error.svg',
        title: 'tag-limit-max-title',
        acceptBtLabel: 'tag-limit-max-exit',
        cancelBtLabel: '',
        titleMessage: 'tag-limit-max-title-message',
        message: 'tag-limit-max-message'
      },
      errorRequestTags: {
        id: 'error-request-tags',
        codeError: 'NLE0023',
        descriptionError: 'Es necesario que confirmes esta operación llamando a línea BBVA. PF.',
        descriptionErrorTelevia: '',
        svg: 'images/general_error.svg',
        title: 'error-request-tags-title',
        acceptBtLabel: 'tag-limit-max-exit',
        cancelBtLabel: 'error-request-tags-call',
        titleMessage: 'error-request-tags-title-message',
        message: 'error-request-tags-message'
      },
      errorNotSystem: {
        id: 'there-is-no-system',
        codeError: 'EIE0331',
        descriptionError: '',
        descriptionErrorTelevia: '',
        svg: 'images/general_error.svg',
        title: 'there-is-no-system-title',
        acceptBtLabel: 'tag-limit-max-exit',
        cancelBtLabel: 'there-is-no-system-call',
        titleMessage: 'there-is-no-system-title-message',
        message: 'there-is-no-system-message'
      },
      errorGeneral: {
        id: 'system-not-available-pase-error',
        codeError: 'EIE0331',
        descriptionError: 'ERROR: SISTEMA NO DISPONIBLE VERIFICAR',
        descriptionErrorTelevia: '',
        svg: 'images/tagCard/Connectivity.svg',
        title: 'system-not-available-pase-error-title',
        acceptBtLabel: 'tag-limit-max-exit',
        cancelBtLabel: 'system-not-available-pase-error-call',
        titleMessage: 'system-not-available-pase-error-title-message',
        message: 'system-not-available-pase-error-message'
      },
    };
    if (ev.errorCode === 'NLE0023' || ev.errorCode === '604') {
      this.modalMessageError(errorModalStructure.errorRequestTags);
    } else {
      for (let value in errorModalStructure) {
        if (ev.errorMessage === errorModalStructure[value].descriptionError || ev.errorMessage === errorModalStructure[value].descriptionErrorTelevia) {
          this.modalMessageError(errorModalStructure[value]);
          break;
        } else if (errorModalStructure.errorGeneral === errorModalStructure[value]) {
          this.modalMessageError(errorModalStructure[value]);
        }
      }
    }
  }

  /**
   * @private Dispatches a custom event with name and detail
   * @param {String} nameParam
   * @param {any} detail
  */
  _dispatchEvent(nameParam, detail) {
    this.dispatchEvent(new CustomEvent(nameParam, {
      bubbles: true,
      composed: true,
      detail: detail
    }));
  }

  /**
   * @desc Error service
   * @event response-error-list-service
   * @event mtu-exception-handler-navigation
   */
  responseErrorService(payload) {
    let errorCode = this.c(payload, 'detail.error-code', this.c(payload, 'error-code', 'EIE0331'));
    let errorMessage = this.c(payload, 'detail.error-message', this.c(payload, 'error-message', 'errorGeneral'));
    let errorStatus = this.c(payload, 'detail.status', this.c(payload, 'status', 'errorGeneral'));
    if (errorCode === 'KNE6666') {
      this.mtuFlag = {
        makePayment: true,
        cancelPayment: false
      };
      this._dispatchEvent('mtu-exception-handler-navigation', true);
    } else if (errorStatus !== 500) {
      this._dispatchEvent('response-error-list-service', {
        errorCode: errorCode,
        errorMessage: errorMessage
      });
    } else {
      this.retryError();
    }
  }

  /**
   * @desc Error service payments
   * @event response-error-list-service
  */
  responseErrorPayload(payload) {
    let errorCode = this.c(payload, 'detail.error-code', this.c(payload, 'error-code', 'EIE0331'));
    let errorMessage = this.c(payload, 'detail.error-message', this.c(payload, 'error-message', 'errorGeneral'));
    this._dispatchEvent('response-error-list-service', {
      errorCode: errorCode,
      errorMessage: errorMessage
    });
  }

  /**
  * @desc Show modal info delete tag
  * @event retry-error
  */
  retryError() {
    const retryErrorData = {
      errorId: 'not-show-information',
      errorType: 'technicalError',
      retryConfig: {
        header: 'not-show-information-title',
        title: 'not-show-information-title-message',
        message: 'not-show-information-message',
        acceptBtLabel: 'not-show-information-exit',
        cancelBtLabel: 'not-show-information-call',
        srcImage: 'images/Connectivity.svg',
        fullModal: true,
      },
      callConfig: {
        header: 'not-show-information-title',
        title: 'not-show-information-title-message',
        message: 'not-show-information-message',
        srcImage: 'images/Connectivity.svg',
        acceptBtLabel: 'Salir',
        fullModal: true,
      }
    };
    this._dispatchEvent('retry-error', Object.assign({ retryErrorData }));
  }

  /**
  *Funtion to send payload to share receipt
  *
  * @return {void}
  */
  shareReceipt() {
    const receiptData = {
      date: new Date(),
      numberReference: this.c(this.serviceResponse, 'id'),
      operationType: 'tag-recharge-success-description',
      concept: 'tag-recharge-dm-success-title',
      origin: {
        product: {
          name: this.accountSelected.name,
        },
        number: this.accountSelected.id,
        chars: 4,
        simbol: '•'
      },
      localAmount: {
        amount: this.c(this.serviceResponse, 'bill.billAmount.amount'),
        currency: 'MXN',
        class: 'amount-huge-decimals'
      },
      templateSelected: 'codicelExternalTransfer'
    };
    this._dispatchEvent('share-refund-receipt', receiptData);
  }

  /**
    * @desc Dispatch open modal exit
    */
  openModalExit() {
    this._showInfoModal({ id: 'confirm-delete-tag-modal-recharge' });
  }

  /**
   * When called, depending on _showExitConfirm property
   * emits an event to navigate back or to show exit confirm modal
  */
  manageBackButton() {
    const detail = {
      code: 'CONFIRM-EXIT-TAG',
      selectedConfig: {
        className: 'custom error',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'pase-tag-recharge-title-button-one-modal',
        cancelBtLabel: 'pase-tag-recharge-title-button-two-modal',
        template: {
          type: 'paragraphs',
          values: [
            {
              icon: 'coronita:alert',
              class: 'spacing',
              iconClass: 'icon-size-24'
            },
            {
              title: 'pase-tag-recharge-title-confirm-modal-exit-recharge',
              class: 'spacing--xs text-center'
            },
            {
              text: 'alert-EXIT-TAG-CARD-message',
              class: 'spacing text-center title-grey'
            }
          ]
        }
      }
    };
    this._dispatchEvent('show-close-confirm', detail);
  }

  /**
   * @desc open recharge tag flow or share register success img
   * */
  operationClicked() {
    this._dispatchEvent('operation-clicked-share', {
      height: '1000',
      share: true
    });
  }
}

customElements.define(GlomoTollRechargeManagerMx.is, GlomoTollRechargeManagerMx);