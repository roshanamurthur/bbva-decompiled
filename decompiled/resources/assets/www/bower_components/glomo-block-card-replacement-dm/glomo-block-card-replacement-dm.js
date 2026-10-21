class GlomoBlockCardReplacementDm extends Polymer.mixinBehaviors([ CellsBehaviors.CellsCheckNestedKeysBehavior ], Polymer.Element) {

  static get is() {
    return 'glomo-block-card-replacement-dm';
  }

  static get properties() {
    return {
      /**
       * @description global cache retrieved from native
       * @type {Object}
       */
      globalCacheStorage: Object,
      /**
       * @description encrypted card ID
       * @type {String}
       */
      cardId: {
        type: String,
        value: ''
      },
      /**
       * @description card number
       * @type {String}
       */
      cardNumber: {
        type: String,
      },
      /**
       * @description card name
       * @type {String}
       */
      cardName: {
        type: String,
        value: ''
      },
      /**
       * @description card image url
       * @type {String}
       */
      cardImage: {
        type: String,
        value: ''
      },
      /**
       * @description card type
       * can be etiher INFINITE, CREA or OTHER
       * @type {String}
       */
      cardType: {
        type: String,
        computed: '_computeCardType(cardNumber, isDebitCard, isVipPatrimonialCard)'
      },
      /**
       * @description card replacement type
       * can be either Instantanea or Personalizada
       */
      cardReplacementType: {
        type: String,
        value: 'Instantánea'
      },
      /**
       * @description card replacement cost
       * 0 for INFINITE
       * 166 for CREA
       * 180 for OTHER
       * @type {String}
       */
      cardReplacementCost: {
        type: String,
        value: '0'
      },
      /**
       * @description customer id
       * @type {String}
       */
      customerId: {
        type: String,
        value: ''
      },
      /**
       * @description user email
       * @type {String}
       */
      customerEmail: {
        type: String,
        value: ''
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
       * @description block card date
       * @type {String}
       */
      blockDate: {
        type: String,
        value: ''
      },
      /**
       * @description block card reference
       * @type {String}
       */
      blockReference: {
        type: String,
        value: ''
      },
      /**
       * @description replacement card number
       * @type String
       */
      replacementCardNumber: {
        type: String,
        value: ''
      },
      /**
       * @description replacement card id
       * @type String
       */
      replacementCardId: {
        type: String,
        value: ''
      },
      /**
       * @description selected delivery address
       * @type String
       */
      currentDeliveryAddress: {
        type: String,
        value: 'HOME'
      },
      /**
       * @description available addresses descriptions
       * @type Object
       */
      addresses: {
        type: Object,
        value: {
          home: '',
          openingBranch: '',
          anotherBranch: ''
        }
      },
      /**
       * @description current state of masked address
       * @type Boolean
       */
      isMasked: {
        type: Boolean,
        value: true
      },
      /**
       * @description home address masked description
       * @type String
       */
      maskedHomeAddress: {
        type: String,
        value: ''
      },
      /**
       * @description home address unmasked description
       * @type String
       */
      unmaskedHomeAddress: {
        type: String,
        value: ''
      },
      /**
       * @description selected branch ID
       * @type String
       */
      currentBranchId: {
        type: String,
        value: ''
      },
      /**
       * @description opening BBVA branch ID
       * @type String
       */
      openingBranchId: {
        type: String,
        value: ''
      },
      /**
       * @description BBVA branch ID
       * @type String
       */
      anotherBranchId: {
        type: String,
        value: ''
      },
      /**
       * @description geolocation longitude and latitude
       * @type Object
       */
      geolocation: {
        type: Object,
        value: {}
      },
      /**
       * @description pois markers
       * @type Array
       */
      markers: {
        type: Array,
        value: []
      },
      /**
       * @description Indicate if other page will open, and avoid reset things
       * @type {Boolean}
       */
      _isOpenOtherPage: {
        type: Boolean,
        value: false
      },
      /**
       * Added for Abiel
       */
      _allStepCompleted: {
        type: Boolean,
        value: false
      },
      /**
       * Added for Abiel
       */
      _scrollValue: {
        type: Number,
        value: 0
      },
      /**
       * It is for redirect to block and replacement page from branchLocator page
       */
      continue: {
        type: String,
        value: '',
        notify: true
      },
      /**
       * Receive and save additional card data.
       */
      additionalCardDetail: {
        type: Object,
        value: () => ({})
      },
      /**
       * Flag that indicates if it is an additional card.
       */
      isAdditionalCard: {
        type: Boolean,
        value: false
      },
      /**
       * Flag that indicates if it is an card debit
       */
      isDebitCard: {
        type: Boolean,
        value: false
      },
      /**
       * Flag that indicates if it is an card vip patrimonial
       */
      isVipPatrimonialCard: {
        type: Boolean,
        value: false
      },
      /**
       * Param to get data from customer
       */
      customerData: {
        type: Object,
        value: () => ({})
      },
      /**
       * @description Event that sends the configuration of modals
       * @type String
       */
      sendModalEvent: {
        type: String,
        value: 'send-modals-configuration'
      },
    };
  }

  /**
   * @description Static labels for copys
   */
  static get LABELS() {
    return {
      TITLES: {

      },
      MESSAGES: {
        INSTANT: 'block-and-replacement-successful-response-info-message-instant',
        INSTANT_ADDITIONAL: 'block-and-replacement-successful-response-info-message-instant-additional',
        HOME: 'block-and-replacement-successful-response-info-message-customized-home',
        HOME_ADDITIONAL: 'block-and-replacement-successful-response-info-message-customized-home-additional',
        OPENING: 'block-and-replacement-successful-response-info-message-customized-opening-branch',
        ANOTHER: 'block-and-replacement-successful-response-info-message-customized-another-branch',
      },
      HEADINGS: {
        MAIN_TITLE: 'block-and-replacement-successful-response-header-title',
        SUB_TITLE: 'block-and-replacement-successful-response-header-subtitle',
        SUB_TITLE_ADDITIONAL: 'block-and-replacement-successful-response-header-subtitle-additional',
        CARD_NUMBER: 'block-and-replacement-successful-response-card-number',
        REPLACEMENT_COST: 'block-and-replacement-successful-response-amount',
        BLOCK_REFERENCE: 'block-and-replacement-successful-response-operation-code',
        DELIVERY_ADDRESS: 'block-and-replacement-successful-response-delivery-address-description',
        DELIVERY_ADDRESS_ADDITIONAL: 'block-and-replacement-successful-response-delivery-address-description-additional',
        USER_EMAIL: 'block-and-replacement-successful-response-email-message',
        USER_EMAIL_ADDITIONAL: 'block-and-replacement-successful-response-email-message-additional',
        BUTTON_PRIMARY: 'block-and-replacement-successful-response-primary-button-label',
      }/*,
      GEOLOCATION_PERMISSIONS: {
        TITLE: 'block-and-replacement-alert-manager-geolocation-title',
        TEXT: 'block-and-replacement-alert-manager-geolocation-text'
      }*/
    };
  }

  /**
   * @description Complex observers for get data
   */
  static get observers() {
    return [
      '_globalCacheObserver(globalCacheStorage)',
      '_blockIdObserver(blockId)',
      '_globalDataCustomer(customerData)'
    ];
  }

  /**
   * @description Get data from gloabl cache and get user email from api service
   * @param {Object} globalCacheStorage
   */
  _globalCacheObserver(globalCacheStorage) {
    this.set('customerId', this.c(globalCacheStorage, 'customer.customerId', ''));
    this.set('openingBranchId', this.c(globalCacheStorage, 'customer.bank.branch.id', ''));
    this._dispatch('set-customer-id', this.customerId);
    this._dispatch('request-get-customer-email-event', { customerId: this.customerId });
  }

  /**
   * @description Get data from gloabl login and get user email from api service
   * @param {Object} customerData
   */
  _globalDataCustomer(customerData) {
    if (Object.keys(customerData).length > 0) {
      this.set('customerId', this.c(customerData, 'customerId', ''));
      this.set('openingBranchId', this.c(customerData, 'bank.branch.id', ''));
      this._dispatch('set-customer-id', this.customerId);
      this._dispatch('request-get-customer-email-event', { customerId: this.customerId });
    }
  }

  /**
   * @description init method for reset events and request get card data from card ID
   */
  init() {
    if (!this._isOpenOtherPage) {
      this._showSpinner();
      this._dispatch('reset-event');
    } else {
      this.set('_isOpenOtherPage', false);
    }
    if (!this.additionalCardDetail.product) {
      this._dispatch('request-get-card-data-event', { cardId: this.cardId });
    } else {
      this.successGetCardDataHandler({ ...this.additionalCardDetail });
      this._dispatch('set-is-additional-card', true);
      this.set('isAdditionalCard', true);
    }
  }

  /**
   * @description masked address information
   */
  reset() {
    if (!this.isMasked) {
      this.set('isMasked', true);
      this._dispatch('set-is-masked-property-event', true);
      this._dispatch('set-addresses-property-event', Object.assign({},
        this.addresses,
        { home: this.maskedHomeAddress }
      ));
    }
  }

  /**
   * @description set customer email
   * @param {Object} value data contact of customer
   */
  setCustomerEmail(value) {
    let virtualCustomerEmail = '';
    if (value) {
      value.find(item => virtualCustomerEmail = this._getContactEmail(item));
    }
    this.customerEmail = virtualCustomerEmail;
  }

  /**
   * @description get contact email
   * @param {Object} item data contact
   */
  _getContactEmail(item) {
    let contactDetailType = this.c(item, 'contact.contactDetailType', '');
    let address = this.c(item, 'contact.address', '');
    return contactDetailType === 'EMAIL' ? address : '';
  }

  /**
   * @description resets the property values that indicate whether it is an additional card and sucursal.
   */
  resetAdditionalCardValues() {
    this.set('isAdditionalCard', false);
    this.set('additionalCardDetail', {});
    this.set('isDebitCard', false);
    this.set('isVipPatrimonialCard', false);
    this.set('anotherBranchId', '');
  }

  /**
   * @description return what is reason for block card
   * @param {String} blockId id of reason for block card
   */
  _blockIdObserver(blockId) {
    const blockReasonId = blockId === 'LOST' ? 'AL' : blockId === 'STOLEN' ? 'AS' : 'AL';
    this.set('blockReasonId', blockReasonId);
  }

  _successGetCardConditions(response) {

    const cost = response.filter(i => {
      if (i.id === 'REISSUE') {
        return i;
      }
    });

    this.cardReplacementCost = this.c(cost, '0.format.amount.amount', '0');

    this._dispatch('set-card-data-property-event', {
      name: this.cardName,
      number: +this.cardNumber,
      image: this.cardImage,
      type: this.cardType,
      reestampingCost: +this.cardReplacementCost,
    });
    this._dispatch('set-reestamping-cost-event', this.cardReplacementCost);
  }

  /**
   * @public
   * @description used when the user requires to leave in the middle of the process
   * @event 'interrupt-block-and-replacement-process'
   */
  leaveBlockAndReplacement() {
    this._dispatch('interrupt-block-and-replacement-process');
  }

  /**
   * @public
   * @description used when the user requires to leave in the middle of the process
   * @event 'interrupt-block-and-replacement-process'
   */
  errorGetCardConditions() {
    const content = [
      { icon: 'coronita:alert', iconClass: 'icon-size-24' },
      { text: 'block-and-replacement-generic-error-message' },
    ];
    const modalConfig = {
      code: 'BLOCK-REPLACEMENT-CONDITIONS-ERROR-MODAL',
      primaryButtonClass: 'primary',
      selectedConfig: {
        className: 'error',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'block-and-replacement-generic-modal-button',
        template: {
          type: 'paragraphs',
          values: content,
        },
      },
    };
    this._dispatch(this.sendModalEvent, modalConfig);
  }

  /**
   * @description set steps on UI and return card name from card number
   * @param {String} cardNumber number of card
   */
  _computeCardType(cardNumber, isDebitCard, isVipPatrimonialCard) {
    if (cardNumber) {
      const bin = cardNumber.slice(0, 6);
      let steps = ['prefilledStep', 'blockingReasonsStep', 'replacementTypeStep', 'shippingAddressStep', 'termsAndConditionsStep'];
      let cardName = '';
      if (bin === '455504') {
        cardName = 'Infinite';
        this.set('cardReplacementType', 'Personalizada');
        this._dispatch('set-replacement-type-property-event', 'Personalizada');
        steps.splice(2, 1);
      } else if (bin === '477211') {
        cardName = 'Crea';
      } else if (bin !== '455509' && isDebitCard && !isVipPatrimonialCard) {
        cardName = 'Debito';
        this.set('cardReplacementType', 'Instantánea');
        this._dispatch('set-replacement-type-property-event', 'Instantánea');
        steps.splice(2, 1);
      } else {
        cardName = 'Other';
      }
      this._dispatch('get-card-conditions', { 'card-id': this.cardId });
      this._dispatch('set-steps', steps);
      this._dispatch('request-get-customer-addresses-event');
      return cardName;
    } else {
      return '';
    }
  }

  /**
   * @description return the params and the body of my request to the service
   * @param {String} service type of service i will need
   */
  _createServicePayload(service) {
    return ({
      BLOCK_CARD: {
        params: {
          'card-id': this.cardId,
          'block-id': this.blockId
        },
        body: {
          reason: { id: this.blockReasonId }
        }
      },
      CREATE_DELIVERY: {
        apiVersion: '1',
        params: { 'card-id': this.replacementCardId },
        body: {
          serviceType: { id: 'PHYSICAL' },
          destination: {
            id: 'BRANCH',
            branch: { id: this.anotherBranchId }
          }
        }
      },
      CREATE_REPLACEMENTS: {
        apiVersion: '1',
        params: { 'card-id': this.cardId },
        body: { blockReference: this.blockReference }
      }
    })[service];
  }

  /**
   * @description response from service cards api
   * @param {*} response
   */
  successGetCardData(response) {
    const dataCard = response;
    if (Object.keys(dataCard).length > 0 && typeof response === 'object') {
      dataCard.title = { name: dataCard?.brandAssociation?.description || '' };
      this.successGetCardDataHandler({ ...dataCard });
    }
  }

  /**
   * @description get card data is empty to call service cards api
   * @param {*} response
   * @event 'set-card-id'
   * @event 'get-card-data'
   */
  verifyGetCardDataHandler(response) {
    if (Object.keys(response).length > 0 && typeof response === 'object') {
      this.successGetCardDataHandler(response);
    } else {
      this._dispatch('set-card-id', this.cardId);
      this._dispatch('get-card-data', { expand: 'payment-methods,blocks,indicators,activations' });
    }
  }

  /**
   * Data received from additional card detail
   * @param {Object} cardData
   * @event 'set-is-additional-card'
   */
  setIsAdditionalCard() {
    this._dispatch('set-is-additional-card', true);
    this.set('isAdditionalCard', true);
  }

  /**
   * Receives the current cardDetail data (data rendered at card detail page)
   * and set the card image for the first prefilled step
   * @param {object} data
   */
  setCardImgFromCurrentCardInfo(data) {
    this.set('cardImage', data?.cardInfo?.frontImage ?? '');
  }

  /**
   * @description Set all the details for the current card
   * @param {*} response
   */
  successGetCardDataHandler(response = {}) {
    if (Object.keys(response).length > 0 && typeof response === 'object') {
      const debitCard = this.c(response, 'cardType.id', '').includes('DEBIT_CARD');
      const vipCard = debitCard ? this.c(response, 'title.name', '').includes('VIP PATRIMONIAL') : false;
      if (debitCard && vipCard) {
        this.set('isVipPatrimonialCard', vipCard);
        this._dispatch('patrimonial-card-response', vipCard);
      } else if (debitCard && !vipCard) {
        this.set('isDebitCard', debitCard);
        this._dispatch('debit-card-response', debitCard);
      }

      const aliasCard = this.c(response, 'number', '').includes('517439')
        ? this.c(response, 'alias', '') : null;

      this.set('cardNumber', this.c(response, 'number'));
      this.set('cardName', this.c(response, 'title.name', this.c(response, 'product.name')));

      if (!this.cardName) {
        this.set('cardName', this.c(response, 'alias'));
      }

      this._dispatch('set-card-data-property-event', {
        name: aliasCard || this.cardName,
        number: +this.cardNumber,
        image: this.cardImage,
        type: this.cardType,
        reestampingCost: +this.cardReplacementCost,
      });
      this._dispatch('set-reestamping-cost-event', this.cardReplacementCost);
    }
    this._hideSpinner();
  }

  /**
   * @private
   * @description error in get card data handler
   */
  errorGetCardDataHandler(error) {
    this._dispatch(this.sendModalEvent, this._getErrorModalConfig());
    this._hideSpinner();
  }

  /**
   * @description
   * @param {*} response
   */
  successBlockCardDataHandler(response) {
    this.set('blockDate', this.c(response, 'blockDate'));
    this.set('blockReference', this.c(response, 'reference'));
    if (this.cardReplacementType === 'Instantánea') {
      const result = this._createSuccessResult('INSTANT');
      this._dispatch('navigate-to-page-event', {
        page: 'success-page',
        params: result
      });
      this._hideSpinner();
    } else if (this.cardReplacementType === 'Personalizada') {
      const payload = this._createServicePayload('CREATE_REPLACEMENTS');
      this._dispatch('request-post-create-replacement-event', payload);
    }
  }

  /**
   * @description configuration for branch error modal
   */
  _getBranchErrorModal() {
    const config = {
      code: 'error-modal-block-and-replacement',
      time: 250,
      selectedConfig: {
        className: 'full-height-error --bbva-core-blue',
        heroImage: 'images/atm_locator_welcome.svg',
        openMaximized: true,
        closeOnPrimaryButton: true,
        title: 'glomo-additional-card-hiring-manager-error-modal-header',
        acceptBtLabel: 'glomo-additional-card-hiring-manager-error-modal-btn-change',
        cancelBtLabel: 'glomo-additional-card-hiring-manager-error-modal-btn-cancel',
        template: {
          type: 'paragraphs',
          values: [
            { title: 'glomo-additional-card-hiring-manager-error-modal-title', class: 'simple-title' },
            { text: 'glomo-additional-card-hiring-manager-error-modal-subtitle', class: 'text-styles-ml' }
          ]
        }
      }
    };

    return config;
  }

  /**
   * @private
   * @description configuration for error modal
   * @returns {Object}
   */
  _getErrorModalConfig() {
    return {
      code: 'error-modal-block-and-replacement',
      primaryButtonClass: 'primary',
      selectedConfig: {
        className: 'full-height-info',
        heroImage: './images/errors/error.svg',
        openMaximized: true,
        title: 'block-and-replacement-main-title-error-modal',
        acceptBtLabel: 'block-and-replacement-accept-button-text-error-modal',
        template: {
          type: 'paragraphs',
          values: [
            {
              title: 'block-and-replacement-main-paragraph-title-error-modal',
              class: 'simple-title'
            },
            {
              text: 'block-and-replacement-paragraph-text-error-modal'
            }
          ]
        }
      }
    };
  }

  /**
   * @private
   * @description configuration for error modal when branch is not selected
   */
  _getErrorModalConfigBranchNotSeleted() {
    const config = {
      code: 'error_modal_branch_not_selected',
      selectedConfig: {
        className: 'error',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'block-and-replacement-branch-not-selected-accept-button-label',
        template: {
          type: 'paragraphs',
          values: [
            {icon: 'coronita:alert'},
            {text: 'block-and-replacement-branch-not-selected-text-value'}
          ]
        }
      }
    };

    return config;
  }

  /**
   * @public
   * @description Dispatch an event when the block is failed
   * @event send-modals-configuration
   */
  putBlockCardDataErrorHandler(error) {
    this._dispatch(this.sendModalEvent, this._getErrorModalConfig());
    this._hideSpinner();
  }

  /**
   * @description Manage the response when the user blocks the card
   * @event request-post-create-delivery-event
   * @param {*} response
   */
  successPostCreateReplacementHandler(response) {
    // const { cardAgreement } = response;
    this.set('replacementCardNumber', this.c(response, 'cardAgreement', ''));
    if (this.currentDeliveryAddress === 'HOME') {
      const result = this._createSuccessResult('HOME');
      this._dispatch('navigate-to-page-event', {
        page: 'success-page',
        params: result
      });
    } else {
      if (this.replacementCardNumber.length === 16) {
        this._dispatch('request-get-financtial-overview-event', {
          contracts: {
            productType: 'CARDS'
          }
        });
      } else {
        this.set('replacementCardId', this.replacementCardNumber);
        const payload = this._createServicePayload('CREATE_DELIVERY');
        this._dispatch('request-post-create-delivery-event', payload);
      }
    }
  }

  /**
   * @description
   */
  errorPostCardReplacementsHandler(error) {
    this._dispatch(this.sendModalEvent, this._getErrorModalConfig());
    this._hideSpinner();
  }

  /**
   * @description
   * @param {*} response
   */
  successGetFinancialOverviewHandler(response) {
    const contracts = this.c(response, 'data.contracts');
    if (contracts) {
      const { id } = contracts.find(card => card.number === this.replacementCardNumber);
      this.set('replacementCardId', id);
      const payload = this._createServicePayload('CREATE_DELIVERY');
      this._dispatch('request-post-create-delivery-event', payload);
    }
  }

  /**
   * @description
   */
  errorGetFinancialOverviewHandler(error) {
    this._dispatch(this.sendModalEvent, this._getErrorModalConfig());
    this._hideSpinner();
  }

  /**
   * @description
   * @param {*} response
   */
  successPostCardDeliveryHandler(response) {
    const result = this._createSuccessResult(this.currentDeliveryAddress);
    this._dispatch('navigate-to-page-event', {
      page: 'success-page',
      params: result
    });
    this._hideSpinner();
  }

  /**
   * @description
   * @param {*} response
   */
  errorPostCardDeliveryHandler(response) {
    let modalType = {};
    let errorMessage = response.messages[0].message;
    let errorCode = errorMessage.split('#')[0];

    if (errorCode === 'MPE3206') {
      modalType = this._getBranchErrorModal();
    } else {
      modalType = this._getErrorModalConfig();
    }

    this._dispatch(this.sendModalEvent, modalType);
    this._hideSpinner();
  }

  /**
   * @description
   * @param {*} response
   */
  successGetCustomerAddressesHandler(response) {
    if (response) {
      let updatedAddresses = {};
      const address = this.parseAddress(response);
      this.set('maskedHomeAddress', `• ${this.c(address, 'location.state.id')}, ${this.c(address, 'location.country.name')}`);
      this.set('unmaskedHomeAddress', `${this.c(address, 'location.addressName')}, ${this.c(address, 'location.state.id')}, CP. ${this.c(address, 'location.zipCode')}`);
      if (this.isMasked) {
        updatedAddresses = this._updateAddresses({ home: this.maskedHomeAddress });
      } else {
        updatedAddresses = this._updateAddresses({ home: this.unmaskedHomeAddress });
      }
      this._dispatch('set-addresses-property-event', updatedAddresses);
    }
    this._hideSpinner();
  }

  /**
   * @description Returns the address when addressType.id is "HOME",
   * if not,
   * returns the first object in the array
   */
  parseAddress(response) {
    let address = response.find(item => item.addressType.id === 'HOME');
    if (!address) {
      address = response[0];
    }
    return address;
  }

  /**
   * @description
   */
  errorGetCustomerAddressesHandler(error) {
    this._dispatch(this.sendModalEvent, this._getErrorModalConfig());
    this._hideSpinner();
  }

  /**
   * @description PENDIENTE, ver que trae el response
   * @param {*} response
   */
  successGetPoisAddressHandler(response) {
    this.anotherBranchId = this.c(response, 'info.id', '');
    const address = {
      anotherBranch: `${this.c(response, 'info.address.addressName', '')}, ${this.c(response, 'info.address.city', '')}, CP. ${this.c(response, 'info.address.zipCode', '')}
      ${this.c(response, 'info.address.state.name', '')}, ${this.c(response, 'info.address.country.name', '')}`
    };
    const payload = this._updateAddresses(address);
    this._dispatch('set-addresses-property-event', payload);
    this._hideSpinner();
  }

  /**
   * @description
   */
  errorGetPoisAddressHandler(error) {
    this._dispatch(this.sendModalEvent, this._getErrorModalConfig());
    this._hideSpinner();
  }

  /**
   * @public
   * @description
   * @param {*} response
   * @event 'navigate-to-page-map'
   */
  acceptGeolocationPermissionsHandler(response) {
    const latitude = this.c(response, 'latitude');
    const longitude = this.c(response, 'longitude');
    this.set('geolocation', { latitude, longitude });
    this.set('_isOpenOtherPage', true);
    this._dispatch('navigate-to-page-map', {
      page: 'branchLocator',
      params: this.geolocation
    });
  }

  /**
   * @description
   */
  cancelGeolocationPermissionsHandler() {
    const TYPE = 'block-replacement-permissions';
    const CONTENT = [
      { text: `${TYPE}-subtitle`, class: 'spacing--xs strong' },
      { text: `${TYPE}-message`, class: 'spacing' }
    ];
    this._dispatch(this.sendModalEvent, this._openModal({
      type: TYPE,
      className: 'info',
      icon: 'coronita:help',
      hideCloseIcon: true,
      secondaryBtn: true
    }, CONTENT));
  }

  /**
   * @description
   * @param {*} CASE se dejo al ultimo
   */
  _createSuccessResult(CASE) {
    let regEx = /([*])/g;
    const cleanEmail = this.customerEmail.replace(regEx, '');

    let result = {};
    const SELECTED_CASE = ({
      INSTANT: {
        title: 'Instantánea',
        message: !this.isAdditionalCard ? GlomoBlockCardReplacementDm.LABELS.MESSAGES.INSTANT : GlomoBlockCardReplacementDm.LABELS.MESSAGES.INSTANT_ADDITIONAL,
      },
      HOME: {
        title: 'Mi domicilio',
        message: !this.isAdditionalCard ? GlomoBlockCardReplacementDm.LABELS.MESSAGES.HOME : GlomoBlockCardReplacementDm.LABELS.MESSAGES.HOME_ADDITIONAL,
        address: this.addresses.home
      },
      OPENING_BRANCH: {
        title: 'Sucursal de apertura BBVA',
        message: GlomoBlockCardReplacementDm.LABELS.MESSAGES.OPENING,
        address: this.addresses.openingBranch
      },
      ANOTHER_BRANCH: {
        title: 'Sucursal BBVA',
        message: GlomoBlockCardReplacementDm.LABELS.MESSAGES.ANOTHER,
        address: this.addresses.anotherBranch,
        timeDeliveryTitle: 'block-and-replacement-successful-response-time-delivery-title',
        timeDeliveryDaysNumber: 'block-and-replacement-successful-response-time-delivery-days-number'
      },
    })[CASE];

    const {
      addressDescription,
      addressTitle,
      blockReference,
      buttons,
      cardNumber,
      customerEmail,
      extraInfo,
      infoMessage,
      mainIcon,
      mainTitle,
      replacementCost,
      timeDelivery
    } = {
      mainIcon: {
        src: 'images/check_successful.svg',
        info: 'Operation Success'
      },
      mainTitle: {
        key: GlomoBlockCardReplacementDm.LABELS.HEADINGS.MAIN_TITLE,
        value: this.blockDate,
        class: 'bold with-default-space',
        description: GlomoBlockCardReplacementDm.LABELS.HEADINGS.SUB_TITLE,
        descriptionClass: 'spacing-top-b light-key'
      },
      cardNumber: {
        key: GlomoBlockCardReplacementDm.LABELS.HEADINGS.CARD_NUMBER,
        musk: {
          value: this.cardNumber,
          chars: 4,
          simbol: '•'
        },
        class: 'mask-bold spacing-top light-key'
      },
      replacementCost: {
        key: GlomoBlockCardReplacementDm.LABELS.HEADINGS.REPLACEMENT_COST,
        value: '$' + Number(this.cardReplacementCost).toFixed(2) + ' + IVA',
        class: 'bold-value spacing-top light-key'
      },
      blockReference: {
        key: GlomoBlockCardReplacementDm.LABELS.HEADINGS.BLOCK_REFERENCE,
        value: this.blockReference,
        class: 'bold-value spacing-top light-key'
      },
      extraInfo: {
        value: 'block-and-replacement-successful-response-extra-info-BBVA',
        class: 'bold spacing'
      },
      infoMessage: {
        iconMessage: {
          type: 'info',
          icon: 'coronita:info',
          message: SELECTED_CASE.message,
          iconSize: {
            width: 24,
            height: 24
          },
          class: 'icon-dark-blue'
        },
        class: 'spacing-top'
      },
      addressTitle: {
        key: !this.isAdditionalCard ? GlomoBlockCardReplacementDm.LABELS.HEADINGS.DELIVERY_ADDRESS : GlomoBlockCardReplacementDm.LABELS.HEADINGS.DELIVERY_ADDRESS_ADDITIONAL,
        value: SELECTED_CASE.title,
        class: 'bold-value spacing-top light-key',
      },
      addressDescription: {
        value: SELECTED_CASE.address
      },
      customerEmail: {
        key: !this.isAdditionalCard ? GlomoBlockCardReplacementDm.LABELS.HEADINGS.USER_EMAIL : GlomoBlockCardReplacementDm.LABELS.HEADINGS.USER_EMAIL_ADDITIONAL,
        class: 'bold-value spacing-top spacing-l email-key light-key',
        value: '•' + cleanEmail
      },
      buttons: {
        primary: {
          text: GlomoBlockCardReplacementDm.LABELS.HEADINGS.BUTTON_PRIMARY,
          action: 'exit-block-and-replacement'
        },
        secondary: {
          hidden: true
        }
      },
      timeDelivery: {
        key: SELECTED_CASE.timeDeliveryTitle,
        value: SELECTED_CASE.timeDeliveryDaysNumber,
        class: 'bold-value spacing-top light-key'
      }
    };

    if (CASE === 'INSTANT') {
      result = {
        mainIcon,
        mainTitle,
        topInfo: [
          Object.assign({}, cardNumber),
          Object.assign({}, replacementCost),
          Object.assign({}, blockReference),
          Object.assign({}, extraInfo),
          Object.assign({}, infoMessage),
          Object.assign({}, customerEmail)
        ],
        buttons
      };
    } else if (CASE === 'HOME' || CASE === 'OPENING_BRANCH' || CASE === 'ANOTHER_BRANCH') {
      result = {
        mainIcon,
        mainTitle,
        topInfo: [
          Object.assign({}, cardNumber),
          Object.assign({}, replacementCost),
          Object.assign({}, addressTitle),
          Object.assign({}, addressDescription),
          CASE === 'ANOTHER_BRANCH' ? Object.assign({}, timeDelivery) : null,
          Object.assign({}, blockReference),
          Object.assign({}, extraInfo),
          Object.assign({}, infoMessage),
          Object.assign({}, customerEmail),
        ],
        buttons
      };
    }
    this.set('additionalCardDetail', {});
    if (this.cardReplacementCost === '0') {
      delete result.topInfo[1];
    }
    return result;
  }

  /**
   * @description
   * @param {*} payload
   */
  changeRadioOptionHandler(payload) {
    const { value } = payload;
    switch (value) {
      case 'Robo':
        this.set('blockId', 'STOLEN');
        this._dispatch('set-block-id-property-event', value);
        break;
      case 'Extravío':
        this.set('blockId', 'LOST');
        this._dispatch('set-block-id-property-event', value);
        break;
      case 'Tarjeta instantánea':
        this.set('cardReplacementType', 'Instantánea');
        this._dispatch('set-replacement-type-property-event', 'Instantánea');
        break;
      case 'Tarjeta personalizada':
        this._showSpinner();
        this.set('cardReplacementType', 'Personalizada');
        this._dispatch('set-replacement-type-property-event', 'Personalizada');
        this._dispatch('request-get-customer-addresses-event');
        break;
      case 'Mi domicilio':
        this._dispatch('set-selected-address', 'home');
        this.set('currentDeliveryAddress', 'HOME');
        break;
      case 'Sucursal de apertura BBVA':
        this._dispatch('set-selected-address', 'openingBranch');
        this.set('currentDeliveryAddress', 'OPENING_BRANCH');
        this.set('currentBranchId', this.openingBranchId);
        this._dispatch('request-get-pois-address-event', { 'branch-id': this.openingBranchId });
        break;
      case 'Sucursal BBVA':
        this._dispatch('set-selected-address', 'anotherBranch');
        this.set('currentDeliveryAddress', 'ANOTHER_BRANCH');
        break;
      default:
        break;
    }
  }

  /**
   * @description
   */
  blockCardButtonPressedHandler() {
    this._showSpinner();
    if (this.currentDeliveryAddress === 'ANOTHER_BRANCH' && this.anotherBranchId === '') {
      this._dispatch(this.sendModalEvent, this._getErrorModalConfigBranchNotSeleted());
      this._hideSpinner();
    } else {
      const payload = this._createServicePayload('BLOCK_CARD');
      this._dispatch('request-put-block-card-event', payload);
    }
  }

  /**
   * @description
   */
  configModalHandler() {
    const TYPE = 'block-replacement-unknown-address';
    const CONTENT = [
      { text: `${TYPE}-message`, class: 'spacing' }
    ];
    this._dispatch(this.sendModalEvent, this._openModal({
      type: TYPE,
      className: 'block-and-replacement-help-modal info',
      openMaximized: true,
      fullHeight: true,
      title: `${TYPE}-title`,
      icon: 'coronita:help',
      iconClass: 'light-blue'
    }, CONTENT));
  }

  /**
   * @description
   * @param {*} address
   */
  _updateAddresses(address = {}) {
    const addresses = Object.assign({}, this.addresses, address);
    this.set('addresses', addresses);
    return addresses;
  }

  /**
   * @description modify anotherBranch property with the full address
   * @param {Object} address
   */
  setFullAddresses(address = {}) {
    const fullAddress = this.get('anotherBranch', address);
    if (this.currentDeliveryAddress === 'ANOTHER_BRANCH' && fullAddress) {
      this.addresses.anotherBranch = fullAddress;
    }
  }

  /**
   * @public
   * @event 'set-is-masked-property-event'
   * @event 'request-get-customer-addresses-unmasked-event'
   * @event 'set-addresses-property-event'
   * @description change the visibility of the address or hidden the address
   */
  toggleMaskedAddressHandler() {
    if (this.isMasked) {
      this._showSpinner();
      this.set('isMasked', false);
      this._dispatch('set-is-masked-property-event', false);
      this._dispatch('request-get-customer-addresses-unmasked-event', { unmasked: true });
    } else {
      this.set('isMasked', true);
      this._dispatch('set-is-masked-property-event', true);
      this._dispatch('set-addresses-property-event', Object.assign({},
        this.addresses,
        { home: this.maskedHomeAddress }
      ));
    }
  }

  /**
   * Show advice to open modal for exit the process
   */
  showExitProcess() {
    const TYPE = 'block-replacement-exit-process';
    const CONTENT = [
      { text: `${TYPE}-message`, class: 'spacing--xs'}
    ];
    this._dispatch(this.sendModalEvent, this._openModal({
      type: TYPE,
      secondaryBtn: true,
      hideCloseIcon: true
    }, CONTENT));
  }

  /**
   *
   * @param {*} param0
   * @param {*} content
   */
  _openModal({
    className = 'error',
    type = 'block-replacement-alert-error',
    icon = 'coronita:alert',
    closeOnPrimaryButton = true,
    iconOnlyFullHeight = true,
    openMaximized = false,
    fullHeight = false,
    hideCloseIcon = false,
    time = 0,
    heroImage = '',
    title = '',
    secondaryBtn = false,
    iconClass = ''
  } = {}, content = []) {
    const SETTINGS = {
      code: type,
      time,
      selectedConfig: {
        className,
        closeOnPrimaryButton,
        iconOnlyFullHeight,
        openMaximized,
        fullHeight,
        title,
        heroImage,
        hideCloseIcon,
        template: {
          type: 'paragraphs',
          values: [
            { icon, class: 'spacing', iconClass },
            ...content
          ]
        },
        acceptBtLabel: `alert-${type}-accept`
      },
    };
    if (secondaryBtn) {
      SETTINGS.selectedConfig.cancelBtLabel = `alert-${type}-cancel`;
    }
    return SETTINGS;
  }

  /**
   * Added for Abiel
   */
  _scrollModalBehavior(evt) {
    if (this._allStepCompleted) {
      this._showPanel = !(evt.target.scrollTop > this._scrollValue);
    }
    this._scrollValue = evt.target.scrollTop;
    this._dispatch('set_show_panel', this._showPanel);
  }

  /**
   * Added for Abiel
   */
  _isCompletedSteps(evt) {
    if (evt) {
      this._allStepCompleted = evt;
      this._showPanel = evt;
      this._dispatch('set_show_panel', this._showPanel);
      this._dispatch('fire_APP_STEP_5', true);
    }
  }

  _showSpinner() {
    this._dispatch('show-spinner-event');
  }

  _hideSpinner() {
    this._dispatch('hide-spinner-event');
  }

  /**
   * Handler all new events that we create
   * @param {String} eventName name of new event
   * @param {*} detail detail that we send
   * @param {Boolean} bubbles bubbles effect
   * @param {Boolean} composed composed effect
   */
  _dispatch(eventName, detail, bubbles = true, composed = true) {
    this.dispatchEvent(new CustomEvent(eventName, {
      bubbles,
      composed,
      detail
    }));
  }

  /**
  * Handler cardId from other page
  * @param {String} cardId that we recived
  */
  gettingCardIdfromLockCardsPage(cardId) {
    if (cardId) {
      this._dispatch('request-get-card-data-event', { cardId: cardId });
    }
  }

  /**
  * Method to get the branch address selected by the user
  * @event 'get-full-address-selected'
  * @param {Object} Address info
  */
  parseSelectedBranFullAddress(payload) {
    const { address, id } = payload.info;
    this.anotherBranchId = id;
    const fullAddress = {
      street: address?.addressName,
      colony: address?.geographicGroups[0]?.name,
      zipCode: address?.zipCode,
      city: address?.city,
      state: address?.state?.name,
      country: address?.country?.name
    };
    this._dispatch('get-full-address-selected', fullAddress);
  }

  /**
  * @event 'reset-event'
  * @event 'go-to-dashboard'
  * @description Method used to reset props
  */
  exitPage() {
    this._dispatch('reset-event');
    this._dispatch('go-to-dashboard', {page: 'dashboard'});
  }
}
customElements.define(GlomoBlockCardReplacementDm.is, GlomoBlockCardReplacementDm);
