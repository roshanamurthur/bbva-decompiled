class GlomoConfirmationConsumptionCardDm extends Polymer.mixinBehaviors([ CellsBehaviors.i18nBehavior ], Polymer.Element) {

  static get is() {
    return 'glomo-confirmation-consumption-card-dm';
  }

  static get properties() {
    return {
      /**
      * Card id
      * @type {String}
      */
      productId: {
        type: String
      },
      /**
       *  Chosen domain to make requests.
       * @type {String}
       */
      host: {
        type: String,
        value: '',
      },
      /**
       * Financial overview api version
       * @type {String}
       */
      financialApiVersion: {
        type: String,
        value: '0'
      },
      /**
       * Cdc api version.
       * @type {String}
       */
      cdcApiVersion: {
        type: String,
        value: '0',
      },
      /**
       * requiredToken, 'jwt' or 'tsec' or empty
       * @type {String}
       */
      requiredToken: {
        type: String,
        value: 'tsec',
      },
      /**
       * Native requests
       * @type {Boolean}
       */
      native: {
        type: Boolean,
        value: false,
      },
      /**
       * BBVA line
       * @type {Number}
       */
      numberPhone: {
        type: String,
        value: '5552262663'
      },
      /**
       * Purchase information
       * @type {Object}
       */
      notificationPush: {
        type: Object,
        value: () => ({}),
        observer: '_getBuyAndRejectScreen'
      },
      /**
      * Financial overview selected card
      * @type {Array}
      */
      _financialOverviewSelectedProduct: {
        type: Array
      },
      /**
       * @description identifier to be used as a parameter in the card block request
       * @default STOLEN
       * @type {String}
       */
      blockId: {
        type: String,
        value: 'STOLEN'
      },
      /**
       * @description identifier to be used as body in the card block request
       * @default AS
       * @type {String}
       */
      blockReasonId: {
        type: String,
        value: 'AS'
      },
      /**
       * @description customer response
       * @type {Boolean}
       */
      responseCustomer: Boolean,
      /**
      * property to count API errors
      * @type {Number}
      */
      errorCount: {
        type: Number,
        value: 0
      },
      /**
       * @description Customer response
       * @type {String}
       */
      responseClient: String,

      /**
      * @description Flag to navigation block
      * @type {Boolean}
      */
      isToNaviagtionBlock: {
        type: Boolean,
        value: false
      },
      /**
      * @description flag to turn off the card
      * @type {Boolean}
      */
      offCardFlag: {
        type: Boolean,
        value: false
      },
      /**
       * domiciliation Notice
       * @type {Object}
       */
      domiciliationNotice: {
        type: Object,
        value: () => ({}),
        observer: '_handleDomiciliationNotice'
      },
      /**
       * product type
       * @type {String}
       */
      productType: {
        type: String,
        value: ''
      },
      /**
       * Change data
       * @type {Object}
       */
      persistData: {
        type: Object,
        value: () => ({})
      },
      /**
       * Type operation Accepted or Rejected
       * @type {String}
       */
      domiciliationOperationType: {
        type: String,
        value: ''
      },
      /**
       * Accept o Rejected
       * @type {Object}
       */
      operationsTypes: {
        type: Object,
        value: () => ({
          SUCCESS_OPERATION: 'OMA0044',
          PREVIOUSLY_ACCEPTED: 'OMA0045',
          PREVIOUSLY_REJECTED: 'OMA0046'
        })
      },
      /**
       * direct debit receipt
       * @type {Object}
       */
      directDebitReceipt: {
        type: Object,
        value: () => ({})
      }
    };
  }

  /**
   * @desc check customer products
   */
  getFinancialData() {
    this.$.financialDm.getFinancialOverview();
  }

  closeSpinner() {
    this._dispatch('close-spinner');
  }

  openSpinner() {
    this._dispatch('open-spinner');
  }

  /**
   * @desc successful response from financial overview
   * @param {*} event
   */
  _onSuccessResponseProducts(event) {
    const cardNumber = this.get('notificationPush.cardNumber', this);
    if (cardNumber && event && event.detail && event.detail.data) {
      const financialOverviewData = event.detail.data;
      if (financialOverviewData.contracts && financialOverviewData.contracts.length > 0) {
        const selectedProduct = financialOverviewData.contracts.find(card => {
          const cardEnding = this.get('number', card) || '';
          const cardType = this.get('productType', card) || '';
          return cardEnding.substr(12) === cardNumber && cardType === 'CARD';
        });
        this._financialOverviewSelectedProduct = selectedProduct;
        this.productId = selectedProduct ? selectedProduct.id : {};
        this.blockAndReplacement();
        this.setOffCard();
      }
    }
  }

  blockAndReplacement() {
    if (this.isToNaviagtionBlock) {
      this.isToNaviagtionBlock = false;
      let params = {
        cardId: this._financialOverviewSelectedProduct.id,
        cardTitle: this._financialOverviewSelectedProduct.name,
        cardNumber: this._financialOverviewSelectedProduct.number,
        cardType: this._financialOverviewSelectedProduct.subProductType.id,
        cardName: this._financialOverviewSelectedProduct.subProductType.id,
        productId: this._financialOverviewSelectedProduct.id
      };
      this._dispatch('navigation-to-block-card-normal', params);
    }
  }

  navigationBlockReplacement() {
    this.getFinancialData();
    this.isToNaviagtionBlock = true;
  }

  offCard() {
    this.getFinancialData();
    this.offCardFlag = true;
  }

  setOffCard() {
    let params = {};
    if (this.offCardFlag) {
      params = {
        activationId: 'ON_OFF',
        body: { isActive: false }
      };
      this.offCardFlag = false;
      this._dispatch('card-id-from-dm', this.productId);
      this._dispatch('activation-card-cdc-event', params);
      this._dispatch('refresh-financial-overview-data');
    }
  }

  reset() {
    this.errorCount = 0;
    this.domiciliationNotice = {};
    this.persistData = {};
    this.domiciliationOperationType = '';
    this.directDebitReceipt = {};
  }

  /**
   * @desc Error message for sending the response
   */
  onResponseModal(codeHttpError) {
    this.closeSpinner();
    let alertLeaveOperativeMock = null;

    if (codeHttpError.status === 404) {
      alertLeaveOperativeMock = {
        code: 'media-modal-error-cdc',
        selectedConfig: {
          className: 'caution',
          openMaximized: false,
          iconOnlyFullHeight: true,
          noCancelOnOutsideClick: true,
          acceptBtLabel: 'Salir',
          template: {
            type: 'paragraphs',
            values: [
              { icon: 'coronita:info', iconClass: 'icon-size-24', class: 'caution' },
              { title: 'Anteriormente respondiste a este intento de compra' },
              { text: 'Ya tenemos tu respuesta para este movimiento.' }
            ]
          }
        }
      };
    } else {
      alertLeaveOperativeMock = {
        code: 'response-sending-error-cdc',
        selectedConfig: {
          className: 'full-height-error image--auto',
          openMaximized: true,
          title: 'Confirmación de consumos',
          heroImage: 'images/general_error.svg',
          acceptBtLabel: 'Cancelar',
          cancelFromHeaderEvent: 'from-header-cancel',
          template: {
            type: 'paragraphs',
            values: [
              {
                title: 'Operación no realizada',
                class: 'spacing'
              },
              {
                text: 'La operación ha fallado. Inténtalo más tarde.'
              }
            ]
          }
        }
      };
      if (this.errorCount < 3) {
        alertLeaveOperativeMock.code = 'response-persist-error-cdc';
        alertLeaveOperativeMock.selectedConfig.acceptBtLabel = 'Reintentar';
        alertLeaveOperativeMock.selectedConfig.cancelBtLabel = 'Cancelar';
        alertLeaveOperativeMock.selectedConfig.template.values[1].text = 'La operación ha fallado. Inténtalo de nuevo.';
        this.errorCount++;
      }
    }

    this.closeSpinner();
    setTimeout(() => {
      this._dispatch('response-sending-modal-cdc-event', alertLeaveOperativeMock);
    }, 1000);
  }

  /**
   * @desc financial overview error response
   * @param {*} event
   */
  _onErrorResponseCardData(event) {
    console.log('Error', event);
  }

  /**
   * @desc trigger events
   * @param {*} eventName
   * @param {*} detail
   */
  _dispatch(eventName, detail = {}) {
    this.dispatchEvent(new CustomEvent(eventName, {
      bubbles: true,
      composed: true,
      detail: detail
    }));
  }

  /**
  * @desc method to confirm payment
  */
  paymentConfirmation() {
    this.openSpinner();
    this.responseClient = 'ACCEPTED';
    this.sendReply();
    this.responseCustomer = true;
  }

  /**
  * @desc method to rejected payment
  */
  paymentRejected() {
    this.openSpinner();
    this.responseClient = 'REJECTED';
    this.sendReply();
    this.responseCustomer = false;
  }

  blockReplacementReaction() {
    this._dispatch('block-replacement-event-cdc');
  }

  /**
  * @desc response method
  */
  managerResponse() {
    let response = this.responseCustomer ? this._getModalConfirmationSuccess() : this.rejectManager();
    this.closeSpinner();
  }

  /**
   * @desc Confirmed move
   */
  _getModalConfirmationSuccess() {
    let modalConfirmationSuccess  = null;
    modalConfirmationSuccess = {
      code: 'confirmation-success',
      primaryButtonClass: 'primary',
      selectedConfig: {
        className: 'full-height-info confirm-or-reject-modal image--mid',
        openMaximized: true,
        title: 'glomo-confirmation-consumption-title-header',
        heroImage: './images/success_cdc.svg',
        acceptBtLabel: 'glomo-confirmation-consumption-button-accept-success',
        cancelFromHeaderEvent: 'from-header-cancel',
        template: {
          type: 'paragraphs',
          values: [
            {
              title: 'glomo-confirmation-consumption-confirmed-move-title',
              class: 'spacing'
            },
            {
              text: 'glomo-confirmation-consumption-confirmed-move-text',
            }
          ]
        }
      }
    };
    this._dispatch('confirmation-success-modal-event', modalConfirmationSuccess);
  }

  /**
  * @desc Customer confirm purchase
  */
  _getBuyAndRejectScreen() {
    this.openSpinner();
    setTimeout(() => {
      this.closeSpinner();
    }, 500);
    let buyReject = null;
    buyReject = {
      code: 'buy-and-reject',
      primaryButtonClass: 'primary',
      selectedConfig: {
        openMaximized: true,
        className: 'full-height-info paragraph-no-padding',
        title: 'glomo-confirmation-consumption-title-header',
        acceptBtLabel: 'glomo-confirmation-consumption-buy-reject-accept-btn',
        cancelBtLabel: 'glomo-confirmation-consumption-buy-reject-cancel-btn',
        cancelFromHeaderEvent: 'from-header-cancel',
        buttonsContainer: 'buttons-container-row',
        horizontalButtons: true,
        template: {
          type: 'paragraphs',
          values: [
            {
              title: this.t('glomo-confirmation-consumption-title'),
              class: 'below-paragraph spacing text-align-left'
            },
            {
              class: 'text-align-left grey',
              rawtext: this.t('glomo-confirmation-consumption-buy-reject-charge-amount')
            },
            {
              class: 'text-align-left spacing amount',
              rawtext: `${this.notificationPush.paymentAmount}`
            },
            {
              class: 'text-align-left grey',
              rawtext: this.t('glomo-confirmation-consumption-buy-reject-card')
            },
            {
              class: 'text-align-left spacing cardNumber',
              rawtext: `•${this.notificationPush.cardNumber}`
            },
            {
              class: 'text-align-left grey',
              rawtext: this.t('glomo-confirmation-consumption-buy-establishment')
            },
            {
              class: 'text-align-left spacing establishment',
              rawtext: `${this.notificationPush.propertyName}`
            },
            {
              class: 'text-align-left',
              rawtext: this.t('glomo-confirmation-consumption-text')
            }
          ]
        }
      }
    };
    setTimeout(() => {
      this._dispatch('buy-and-reject-event', buyReject);
    }, 1000);
  }

  /**
   * @desc Purchase in commerce with physical card, Purchase with digital card and Online purchase with physical card
  */
  rejectManager() {
    let rejectionModal;
    let rejectUI = null;
    rejectUI = {
      code: 'payment-refusal',
      primaryButtonClass: 'primary',
      selectedConfig: {
        className: 'full-height-info call-size confirm-or-reject-modal image--mid',
        openMaximized: true,
        title: 'glomo-confirmation-consumption-title-header',
        heroImage: './images/success_cdc.svg',
        acceptBtLabel: '',
        cancelBtLabel: '',
        cancelFromHeaderEvent: 'from-header-cancel',
        template: {
          type: 'paragraphs',
          values: [
            {
              title: 'glomo-confirmation-consumption-common-movement-rejected-title-card',
            },
            {
              title: 'glomo-confirmation-consumption-common-movement-rejected-title-movement',
              class: 'spacing'
            },
            {
              text: '',
              class: ''
            },
            {
              linkIcon: '',
              iconClass: '',
              link: '',
              eventName: '',
              action: () => {
                this._dispatch('call-bbva-line', { phoneNumber: this.numberPhone});
              }
            },
            {}
          ]
        }
      }
    };

    rejectionModal = this.modalStructure(rejectUI);
    this._dispatch('reject-manager-event', rejectionModal);
  }

  sendReply() {
    let request = {
      queryParams: {
        'card-fraud-alert-id': this.notificationPush.alertId
      },
      body: {
        response: {
          value: this.responseClient
        }
      }
    };
    this._dispatch('send-reply-client-event', request);
    this.openSpinner();
  }

  tfisOnlineCred(rejectUI) {
    rejectUI.selectedConfig.template.values[1].text = 'glomo-confirmation-consumption-common-movement-rejected-first-paragraph';
    rejectUI.selectedConfig.template.values[1].class = 'spacing';
    rejectUI.selectedConfig.template.values[2].text = 'glomo-confirmation-consumption-common-movement-rejected-second-paragraph';
    rejectUI.selectedConfig.template.values[2].class = 'spacing';
    rejectUI.selectedConfig.acceptBtLabel = 'glomo-confirmation-consumption-common-accept-br-btn';
    rejectUI.selectedConfig.cancelBtLabel = 'glomo-confirmation-consumption-common-cancel-btn';

    if (!this.notificationPush.blockCardOrange) {
      return this._validationCaseCard(rejectUI, true);
    }
    return rejectUI;
  }

  _validationCaseCard(rejectUI, flag) {
    if (flag) {
      rejectUI.code = 'single-exit-button';
      rejectUI.selectedConfig.template.values[2].text = 'glomo-confirmation-consumption-common-movement-rejected-third-paragraph';
      rejectUI.selectedConfig.template.values[2].class = 'spacing';
      rejectUI.selectedConfig.template.values[3].linkIcon = 'coronita:telephone';
      rejectUI.selectedConfig.template.values[3].iconClass = 'icon-size-24';
      rejectUI.selectedConfig.template.values[3].link = 'glomo-confirmation-consumption-digital-card-link';
      rejectUI.selectedConfig.template.values[3].class = 'below-paragraph';
      rejectUI.selectedConfig.acceptBtLabel = 'glomo-confirmation-consumption-common-cancel-btn';
      rejectUI.selectedConfig.cancelBtLabel = '';
    } else {
      rejectUI.code = 'payment-refusal';
      rejectUI.selectedConfig.template.values[2].text = 'glomo-confirmation-consumption-common-movement-rejected-second-paragraph';
      rejectUI.selectedConfig.template.values[2].class = 'spacing';
      rejectUI.selectedConfig.template.values[3].linkIcon = '';
      rejectUI.selectedConfig.template.values[3].iconClass = '';
      rejectUI.selectedConfig.template.values[3].link = '';
      rejectUI.selectedConfig.template.values[3].class = '';
      rejectUI.selectedConfig.acceptBtLabel = 'glomo-confirmation-consumption-common-accept-br-btn';
      rejectUI.selectedConfig.cancelBtLabel = 'glomo-confirmation-consumption-common-cancel-btn';
    }

    return rejectUI;
  }

  tfisOnlineDeb(rejectUI) {
    rejectUI.code = 'single-exit-button';
    rejectUI.selectedConfig.template.values[1].text = 'glomo-confirmation-consumption-common-movement-rejected-first-paragraph';
    rejectUI.selectedConfig.template.values[1].class = 'spacing';
    rejectUI.selectedConfig.template.values[2].text = 'glomo-confirmation-consumption-common-movement-rejected-third-paragraph';
    rejectUI.selectedConfig.template.values[2].class = 'spacing';
    rejectUI.selectedConfig.template.values[3].linkIcon = 'coronita:telephone';
    rejectUI.selectedConfig.template.values[3].iconClass = 'icon-size-24';
    rejectUI.selectedConfig.template.values[3].link = 'glomo-confirmation-consumption-digital-card-link';
    rejectUI.selectedConfig.template.values[3].class = 'below-paragraph';
    rejectUI.selectedConfig.acceptBtLabel = 'glomo-confirmation-consumption-common-cancel-btn';
    if (this.notificationPush.blockDebitCard) {
      return this._validationCaseCard(rejectUI, false);
    }
    return rejectUI;
  }

  tfisPresentCred(rejectUI) {
    this.offCard();
    rejectUI.selectedConfig.template.values[1].text = 'glomo-confirmation-consumption-common-movement-rejected-fourth-paragraph';
    rejectUI.selectedConfig.template.values[1].class = 'spacing';
    rejectUI.selectedConfig.template.values[2].text = 'glomo-confirmation-consumption-common-movement-rejected-second-paragraph';
    rejectUI.selectedConfig.template.values[2].class = 'spacing';
    rejectUI.selectedConfig.acceptBtLabel = 'glomo-confirmation-consumption-common-accept-br-btn';
    rejectUI.selectedConfig.cancelBtLabel = 'glomo-confirmation-consumption-common-cancel-btn';

    if (!this.notificationPush.blockCardOrange) {
      return this._validationCaseCard(rejectUI, true);
    }
    return rejectUI;
  }

  tfisPresentDeb(rejectUI) {
    this.offCard();
    rejectUI.code = 'single-exit-button';
    rejectUI.selectedConfig.template.values[1].text = 'glomo-confirmation-consumption-common-movement-rejected-fourth-paragraph';
    rejectUI.selectedConfig.template.values[1].class = 'spacing';
    rejectUI.selectedConfig.template.values[2].text = 'glomo-confirmation-consumption-common-movement-rejected-third-paragraph';
    rejectUI.selectedConfig.template.values[2].class = 'spacing';
    rejectUI.selectedConfig.template.values[3].linkIcon = 'coronita:telephone';
    rejectUI.selectedConfig.template.values[3].iconClass = 'icon-size-24';
    rejectUI.selectedConfig.template.values[3].link = 'glomo-confirmation-consumption-digital-card-link';
    rejectUI.selectedConfig.template.values[3].class = 'below-paragraph';
    rejectUI.selectedConfig.acceptBtLabel = 'glomo-confirmation-consumption-common-cancel-btn';
    if (this.notificationPush.blockDebitCard) {
      return this._validationCaseCard(rejectUI, false);
    }
    return rejectUI;
  }

  tdigOnlineDebCred(rejectUI) {
    rejectUI.code = 'single-exit-button';
    rejectUI.selectedConfig.template.values[1].text = 'glomo-confirmation-consumption-common-movement-rejected-fifth-paragraph';
    rejectUI.selectedConfig.template.values[1].class = 'spacing';
    rejectUI.selectedConfig.template.values[2].text = 'glomo-confirmation-consumption-common-movement-rejected-sixth-paragraph';
    rejectUI.selectedConfig.template.values[2].class = 'spacing';
    rejectUI.selectedConfig.template.values[3].linkIcon = 'coronita:telephone';
    rejectUI.selectedConfig.template.values[3].iconClass = 'icon-size-24';
    rejectUI.selectedConfig.template.values[3].link = 'glomo-confirmation-consumption-digital-card-link';
    rejectUI.selectedConfig.template.values[3].class = 'below-paragraph';
    rejectUI.selectedConfig.acceptBtLabel = 'glomo-confirmation-consumption-common-cancel-btn';
    this.offCard();
    return rejectUI;
  }

  modalStructure(rejectUI) {
    let rejectionModal;
    if (this.notificationPush.typeEvent === 'TFIS EN LINEA' && this.notificationPush.typeCard === 'crédito') {
      rejectionModal = this.tfisOnlineCred(rejectUI);
    } else if (this.notificationPush.typeEvent === 'TFIS EN LINEA' && this.notificationPush.typeCard === 'débito') {
      rejectionModal = this.tfisOnlineDeb(rejectUI);
    } else if (this.notificationPush.typeEvent === 'TFIS PRESENCIAL' && this.notificationPush.typeCard === 'crédito') {
      rejectionModal = this.tfisPresentCred(rejectUI);
    } else {
      rejectionModal = this.structure(rejectUI);
    }

    return rejectionModal;
  }

  structure(rejectUI) {
    let rejectionModal;
    if (this.notificationPush.typeEvent === 'TFIS PRESENCIAL' && this.notificationPush.typeCard === 'débito') {
      rejectionModal = this.tfisPresentDeb(rejectUI);
    } else if (this.notificationPush.typeEvent === 'TDIG EN LINEA') {
      if (this.notificationPush.typeCard === 'débito digital' || this.notificationPush.typeCard === 'crédito digital') {
        rejectionModal = this.tdigOnlineDebCred(rejectUI);
      }
    }
    return rejectionModal;
  }

  /**
   * Maps the entry of the direct debit push notification
   * @param {Object} domiciliationNotice
   * @private
   */
  _handleDomiciliationNotice(domiciliationNotice) {
    if (domiciliationNotice?.notification?.content) {
      this.domiciliationNotice = JSON.parse(domiciliationNotice.notification.content);
      this.productType = this.domiciliationNotice.eventCode === 'A000000945' ? 'tdd' : '';
      this.domiciliationNotice.sMONTO = parseFloat(this.domiciliationNotice.sMONTO.replace(/,/g, ''));
      this.persistData = {
        productType: this.t(`domiciliation-notice-${this.productType}-product-charge`),
        automaticPaymentType: this.t(`domiciliation-notice-${this.productType}-product`)
      };
      const detail = {
        header: `domiciliation-notice-${this.productType}-confirms-subscription-header`,
        title: `domiciliation-notice-${this.productType}-confirms-subscription-title`,
        amount: `domiciliation-notice-${this.productType}-confirms-subscription-help-modal`,
        account: `domiciliation-notice-${this.productType}-confirms-subscription-help-modal-account`,
        serviceProvider: `domiciliation-notice-${this.productType}-confirms-subscription-help-modal-company`,
        reference: `domiciliation-notice-${this.productType}-confirms-subscription-help-modal-reference`,
        advice: `domiciliation-notice-${this.productType}-confirms-subscription-help-modal-text`,
      };
      this._dispatch('set-header', detail.header);
      this._dispatch('set-title', detail.title);
      this._dispatch('set-amount', detail.amount);
      this._dispatch('set-account', detail.account);
      this._dispatch('set-service-provider', detail.serviceProvider);
      this._dispatch('set-reference', detail.reference);
      this._dispatch('set-advice', detail.advice);
      this._dispatch('set-response-amount', this.domiciliationNotice?.sMONTO || '');
      this._dispatch('set-response-last-digit-card', this.domiciliationNotice?.sTERMINACION || '');
      this._dispatch('set-response-service-provider', this.domiciliationNotice?.sEMPRESA || '');
      this._dispatch('set-response-reference', this.domiciliationNotice?.sREFERENCIA || '');
      this._dispatch('set-confirm-or-rejected', this.persistData);
    }
  }

  /**
   * Handle service response from a subscription
   */
  handleSubscriptionAuthorizationSuccessful({responsewarningcode}) {
    this.closeSpinner();
    if (responsewarningcode === this.operationsTypes.SUCCESS_OPERATION) {
      if (this.domiciliationOperationType === 'ACCEPTED') {
        this._showSuccessfulSubscriptionPage();
      } else {
        this._showSubscriptionDeclinePage();
      }
    } else if (responsewarningcode === this.operationsTypes.PREVIOUSLY_ACCEPTED) {
      this._showPreviouslyAcceptedModal();
    } else if (responsewarningcode === this.operationsTypes.PREVIOUSLY_REJECTED) {
      this._showPreviouslyRejectedModal();
    } else {
      this.onResponseModal({status: 0});
    }
  }

  /**
   * Launch events for successful page setup
   * @private
   */
  _showSuccessfulSubscriptionPage() {
    const config = {
      invoice: this.domiciliationNotice?.sFOLIOSUS || '',
      amount: this.domiciliationNotice?.sMONTO || '',
      termination: this.domiciliationNotice?.sTERMINACION || '',
      serviceProvider: this.domiciliationNotice?.sEMPRESA || '',
      reference: this.domiciliationNotice?.sREFERENCIA || '',
      productType: this.productType
    };
    this._dispatch('set-panel-heading', this.t(`domiciliation-notice-successful-${this.productType}-subscription-panel-heading`));
    this._dispatch('set-panel-text', this.t(`domiciliation-notice-successful-${this.productType}-subscription-panel-text`));
    this._dispatch('set-invoice-description', config.invoice);
    this._dispatch('set-amount', config.amount);
    this._dispatch('set-termination-label', this.t(`domiciliation-notice-successful-${this.productType}-subscription-list-simple-termination-label`));
    this._dispatch('set-termination-description', config.termination);
    this._dispatch('set-service-provider-description', config.serviceProvider);
    this._dispatch('set-reference-description', config.reference);
    this._dispatch('set-share-button-label', this.t(`domiciliation-notice-successful-${this.productType}-subscription-button-action-label`));
    this._dispatch('show-domiciliation-notice-success-page', this.persistData);
    this._dispatch('set-receipt-info', config);
  }

  /**
   * Decline page config
   */
  _showSubscriptionDeclinePage() {
    this._dispatch('set-panel-heading-decline', `domiciliation-notice-${this.productType}-decline-subscription-decline-title`);
    this._dispatch('set-panel-text-decline', `domiciliation-notice-${this.productType}-decline-subscription-decline-text-I`);
    this._dispatch('show-domiciliation-notice-decline-page', this.persistData);
  }

  /**
   * Send payload to request collection alert patch accepted
   */
  requestCollectionAlertPatchAccepted() {
    this.domiciliationOperationType = 'ACCEPTED';
    this.requestCollectionAlertPatch();
  }

  /**
   * Send payload to request collection alert patch rejected
   */
  requestCollectionAlertPatchRejected() {
    this.domiciliationOperationType = 'REJECTED';
    this.requestCollectionAlertPatch();
  }

  /**
   * Send payload to request collection alert patch
   */
  requestCollectionAlertPatch() {
    this.openSpinner();
    const payload = {
      directDebitId: this.domiciliationNotice?.sFOLIOSUS || '',
      collectionAlertId: this.domiciliationNotice?.sIDNOTIF || '',
      body: {
        response: {
          value: this.domiciliationOperationType
        }
      }
    };
    this._dispatch('request-collection-alert-patch', payload);
  }

  /**
   * Function to catch common errors on service
   */
  handleSubscriptionAuthorizationFailure() {
    this.closeSpinner();
    this.onResponseModal({status: 0});
  }

  /**
   * Handle tab 'X' or back button on android
   */
  handleExitProcess() {
    const modal = {
      titleIcon: 'coronita:help',
      title: this.t(`domiciliation-notice-${this.productType}-help-subscription-help-modal-title`),
      body: this.t(`domiciliation-notice-${this.productType}-help-subscription-help-modal-text`),
      buttonText: this.t(`domiciliation-notice-${this.productType}-help-subscription-help-modal-button-go-out`),
      linkText: this.t(`domiciliation-notice-${this.productType}-help-subscription-help-modal-button-go-back`)
    };
    this._sendConfigurationToHelpModal(modal);
  }

  /**
   * Fire events to help modal config
   * @param {Object} config
   * @private
   */
  _sendConfigurationToHelpModal(config) {
    this._dispatch('set-title-icon-modal-event', config.titleIcon);
    this._dispatch('set-title-text-modal-event', config.title);
    this._dispatch('set-body-text-modal-event', config.body);
    this._dispatch('set-button-text-modal-event', config.buttonText);
    this._dispatch('set-link-text-modal-event', config.linkText || '');
    this._dispatch(config.event || '', this.persistData);
    this._dispatch('open-modal-event');
  }

  /**
   * Config for previously accepted modal
   * @private
   */
  _showPreviouslyAcceptedModal() {
    const modal = {
      titleIcon: 'coronita:info',
      title: this.t(`domiciliation-notice-${this.productType}-info-subscription-info-title`),
      body: this.t(`domiciliation-notice-${this.productType}-info-subscription-accepted-info-text`),
      buttonText: this.t(`domiciliation-notice-${this.productType}-help-subscription-help-modal-button-go-out`),
      event: 'set-previously-accepted-event'
    };
    this._sendConfigurationToHelpModal(modal);
  }

  /**
   * Config for previously rejected modal
   * @private
   */
  _showPreviouslyRejectedModal() {
    const modal = {
      titleIcon: 'coronita:info',
      title: this.t(`domiciliation-notice-${this.productType}-info-subscription-info-title`),
      body: this.t(`domiciliation-notice-${this.productType}-info-subscription-rejected-info-text`),
      buttonText: this.t(`domiciliation-notice-${this.productType}-help-subscription-help-modal-button-go-out`),
      event: 'set-previously-rejected-event'
    };
    this._sendConfigurationToHelpModal(modal);
  }

  /**
   * Handle direct debit info for receipt
   * @param {Object} config
   */
  handleDirectDebitReceipt(config) {
    const {invoice, amount, termination, serviceProvider, reference, productType} = config;
    this.directDebitReceipt = {
      templateSelected: 'directDebitReceipt',
      topInfo: [
        {
          key: this.t('domiciliation-notice-type-operation'),
          value: this.t(`domiciliation-notice-successful-${productType}-subscription-panel-heading`),
          class: 'spacing',
        },
        {
          key: this.t(`domiciliation-notice-successful-${productType}-subscription-list-simple-invoice-label`),
          value: invoice,
          class: 'spacing',
        },
        {
          key: this.t(`domiciliation-notice-successful-${productType}-subscription-list-simple-amount-label`),
          value: amount,
          class: 'spacing',
        },
        {
          key: this.t(`domiciliation-notice-successful-${productType}-subscription-list-simple-termination-label`),
          value: termination,
          class: ' spacing'
        },
        {
          key: this.t(`domiciliation-notice-successful-${productType}-subscription-list-simple-service-provider-label`),
          value: serviceProvider,
          class: ' spacing'
        },
        {
          key: this.t(`domiciliation-notice-successful-${productType}-subscription-list-simple-reference-label`),
          value: reference,
          class: ' spacing'
        }
      ],
    };
  }

  /**
   * handle share button
   */
  shareDirectDebitReceipt() {
    this._dispatch('set-operative-receipt', {
      operative: 'directDebitReceipt'
    });
    this._dispatch('set-direct-debit-config', {result: this.directDebitReceipt});
  }

  /**
   * Handle all close channels for glomo alert manager
   */
  handleAlertManagerCloseChannels() {
    this._dispatch('close-direct-domiciliation-notice-detail');
  }

}
customElements.define(GlomoConfirmationConsumptionCardDm.is, GlomoConfirmationConsumptionCardDm);
