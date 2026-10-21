/* eslint-disable max-len */
/* global moment */
/*eslint new-cap: [2, {"capIsNewExceptions": ["GlomoOpxMobileTopUpDm", "GlomoFeedbackBehavior"]}]*/
class GlomoMobileTopUpManagerMx extends Polymer.mixinBehaviors([
  CellsBehaviors.i18nBehavior,
  CellsBehaviors.GlobalProductsListsBehavior,
  CellsBehaviors.CellsCheckNestedKeysBehavior,
  CellsBehaviors.GlomoFeedbackBehavior,
  CellsBehaviors.mobileTopUpManagerMixin,
  CellsBehaviors.CellsGlobalApisHandleRequest,
  CellsBehaviors.CellsGlobalApisHandleRequestSign,
  CellsBehaviors.CellsGlobalApisHandleRequestError,
], CellsBehaviors.mobileTopUpManagerMixin(Polymer.Element)) {

  static get is() {
    return 'glomo-mobile-top-up-manager-mx';
  }

  static get properties() {
    return {
      /**
       * Dashboard accounts
       */
      _accounts: {
        type: Array,
        value: () => []
      },
      /**
       * Accounts sended from native
       */
      nativeAccounts: Object,
      /**
      *Account to topup
      */
      selectedAccount: {
        type: Object,
        value: () => ({})
      },
      /**
      * contactId
      */
      _contactId: {
        type: String,
        value: ''
      },
      /**
       * Contact already exists in agenda
       */
      existingContact: {
        type: Object,
        value: () => ({})
      },
      /**
      * Provider amount
      */
      amountProvider: {
        type: Number,
        value: 0
      },
      /**
      * Show card & modal cross sales
      */
      showOffer: {
        type: Boolean,
        value: false
      },
      /**
      * List offers
      */
      listOffer: {
        type: Object,
        value: () => ({}),
      },
      /**
      * Show opinator success feedback
      */
      _openOpinator: {
        type: Boolean,
        value: false
      },
      /**
       * Should show offer card
       */
      _showOfferCard: {
        type: Boolean,
        value: false
      },
      /**
      * Error code of mobile top up operation
      */
      _errorCode: {
        type: String,
        value: ''
      },
      /**
       * Top up data to be cached for being used on signRequestMethod
       */
      _topUpData: {
        type: Object
      },
      /**
      * Provider id
      */
      _provider: {
        type: String,
        value: '',
        observer: '_getProviderIsMigrated'
      },
      /**
      * Body formed to save a contact
      */
      _formBody: {
        type: Object,
        value: () => ({})
      },
      /**
       * Available limit error codes
       */
      _limitErrorCodes: {
        type: Object,
        value: {
          dailyErrorCode: 'CNE0235',
          monthlyErrorCode: 'CNE0236',
          operationErrorCode: 'CNE0234'
        },
      },
      /**
       * Customer Id
       */
      customerId: {
        type: String,
        value: ''
      },
      /**
       * Top up params to getTopUp service
       */
      _getTopUpData: {
        type: Object,
        value: () => ({})
      },
      /**
       * Indicates if company is migrated to new flow
       */
      _companyMigrated: {
        type: Boolean,
        value: false
      },
      /**
       * Time configuration to new flow mobile top up
       */
      topUpConfiguration: {
        type: Object,
        value: () => ({})
      },
      /**
       * Data of mobile top up from response createTopUp and getTopUp
       */
      _topUpResponse: {
        type: Object,
        value: () => ({})
      },
      /**
       * Body to send request post contactsBook
       */
      _addContactBody: {
        type: Object,
        value: () => ({})
      },
      /**
       * Flag to indicate if top up goes for new services
       */
      asyncEnabled: {
        type: Boolean,
        value: false
      },
      /**
       * Indicate if config native is iOS to set review header properties
       */
      isNativeIOS: {
        type: Boolean,
        value: false
      },
      /**
       * Flags to indicate if provider is available
       */
      _providerFlags: {
        type: Object,
        value: () => ({})
      },
      /**
       * Available duplicated mobile top up error codes
       */
      duplicatedErrorCodes: {
        type: Array,
        value: () => [],
      },
      /**
       * Indicates if request is for mobile top up
       */
      _isMobileRequest: {
        type: Boolean,
        value: false
      },
      /**
       * Flag to initialize flow retargeting
       */
      _retargeting: {
        type: Boolean,
        value: false
      }
    };
  }

  static get observers() {
    return [
      '_parseNativeAccounts(nativeAccounts.*)'
    ];
  }

  /**
   * Reset method
   */
  reset() {
    this.amountProvider = 0;
    this._provider = '';
    this._companyMigrated = false;
    this._retargeting = false;
    this.set('_accounts', []);
    this.set('selectedAccount', {});
    this.set('existingContact', {});
    this.set('_formBody', {});
    this.set('_topUpData', {});
    this.set('_topUpResponse', {});
    this.set('_getTopUpData', {});
    this.set('_getTopUpResponse', {});
    this.set('_addContactBody', {});
  }

  /**
   * Method to initialize retargeting when the page loads
   */
  initRetargeting() {
    this._retargeting = true;
  }

  /**
   * Method to validate the sending of the post for flow retargeting
   * @param {Object} detail
   * @event send-mobile-top-up-post-retargeting
   */
  sendPostRetargeting(detail = {}) {
    if (this._retargeting && Object.keys(detail).length !== 0) {
      this._retargeting = false;
      this._dispatchEvent('send-mobile-top-up-post-retargeting');
    }
  }

  /**
   * Recieve accounts object and sets property accounts from dashboard
   * @param {Object} accounts
   */
  setAccounts(accounts) {
    this.set('_accounts', this.c(accounts, '0.products', []));
    this._dispatchEvent('set-dashboard-accounts', this._accounts);
  }

  /**
   * Sets property _accounts into array with the detail recieved from product detail and send it in an event
   * @param {Object} account
   * @event set-product-detail-account
   */
  setAccountProductDetail(account) {
    this.set('_accounts', [ account?.product ]);
    this._dispatchEvent('set-product-detail-account', this._accounts);
  }

  /**
   * Method to receive appSettings data and gets settings for operative
   * @param {Object} appSettings
   */
  getMobileTopUpSettings(appSettings) {
    const settings = this.get('mobileTopUp', appSettings);
    if (settings) {
      const timeConfiguration = {
        timeLimit: settings.timeLimit ?? 0,
        interval: settings.interval ?? 0
      };
      this.set('topUpConfiguration', timeConfiguration);
      this.setProviderFlags(settings.onOffCompanies);
    }
  }

  /**
   * Method to recieve featureFlagCollection and find mobileTopUpAsync flag
   * @param {Object} collection
   */
  getAsyncFeatureFlag(collection) {
    const flag = collection && collection['glomo.operations.mobileTopUpAsync'] ? collection['glomo.operations.mobileTopUpAsync'] : {};
    this.asyncEnabled = flag.value ?? false;
  }

  /**
   * Method to set flag value and params with time configuration
   * @param {Object} flag
   * @event set-new-way-flag-properties
   */
  setMobileTopUpNewWayFlagParams(flag) {
    if (flag?.isFlagEnable) {
      this.asyncEnabled = flag?.isFlagEnable;
      const timeConfiguration = {
        timeLimit: flag?.timeLimit,
        interval: flag?.interval
      };
      this.set('topUpConfiguration', timeConfiguration);
    }
  }

  /**
   * Parse accounts recieved from native (android and ios)
   */
  _parseNativeAccounts(nativeAccounts) {
    const data = this.get('value.data', nativeAccounts);
    if (data) {
      let accounts = [];
      const response = Array.isArray(data) ? data : [ data ];
      response.forEach((element) => {
        const amounts = this.get('availableBalance.currentBalances.0', element);
        accounts.push({
          name: this.get('alias', element),
          id: this.get('id', element),
          imgSrc: '',
          currencies: [
            {
              currency: this.get('currency', amounts),
              isMajor: false
            }
          ],
          description: {
            value: this.get('number', element),
            masked: true
          },
          type: {
            id: this.get('productType', element),
            name: this.get('alias', element)
          },
          group: 'account',
          holds: [],
          numberType: this.get('numberType', element),
          primaryAmount: {
            amount: this.get('amount', amounts),
            currency: this.get('currency', amounts),
            label: this.t('mobile-top-up-accounts-primary-amount-label')
          },
          productType: this.get('productType', element)
        });
      });
      this.set('_accounts', accounts);
      const customerNumber = this.get('value.phoneNumber', nativeAccounts);
      const flagParams = this.get('value.flagParams', nativeAccounts) || {};
      this.setMobileTopUpNewWayFlagParams(flagParams);
      this._dispatchEvent('set-native-customer-number', customerNumber);
      this._dispatchEvent('set-dashboard-accounts', this._accounts);
    }
  }

  /**
   * Method to set flags for each provider
   * @param {Array} data
   */
  setProviderFlags(data) {
    if (data) {
      let flags = {};
      for (const company of data) {
        flags = { ...flags, [company?.providerId]: company?.isEnabled };
      }
      this.set('_providerFlags', flags);
    }
  }

  /**
   * Set customer info from global login succes
   * @param {Object} detail
   */
  setCustomerInfo(detail) {
    const customer = detail?.customer ?? detail;
    this.customerId =  customer?.customerId;
    const customerInfo = {
      customerId: this.customerId,
      customerName: customer?.firstName + ' ' + customer?.lastName + ' ' + customer?.secondLastName
    };
    this._dispatchEvent('set-customer-info', customerInfo);
  }

  /**
   * Recieve companies from service and send array to opx
   * @param {Object} companies
   * @event set-companies
   */
  getCompanies(companies = []) {
    if (Array.isArray(companies)) {
      companies.forEach((company) => {
        company.name = (this.get('name', company) || '').toLowerCase().replace(/^./, (match) => match.toUpperCase());
      });
    }
    this._dispatchEvent('set-companies', this._getAvailableProviders(companies));
  }

  /**
   * Method to fitler available providers
   * @param {Array} data
   * @returns {Array}
   */
  _getAvailableProviders(data) {
    return Object.keys(this._providerFlags).length === 0 ? data : data.filter((company) => this._providerFlags[company?.id]);
  }

  /**
   * Set companyMigrated value on success getProviderIsMigrated response
   */
  _setCompanyMigratedStatus(response) {
    this._companyMigrated = response?.detail?.isMigrated;
  }

  /**
   * Function that request mobiles service the transaction
   * @event request-top-up
   */
  setTopUpRequest() {
    let request = {
      source: this.c(this.selectedAccount, 'id'),
      destination: {
        number: (this.get('number', this._formBody) || '').replaceAll(/\s/g, ''),
        alias: this.c(this._formBody, 'aliasName'),
        serviceProviderId: this._provider
      },
      amount: this.amountProvider
    };
    if (this._companyMigrated && this.asyncEnabled) {
      const providerAditionalData = {
        serviceProviderName: this._formBody?.company?.ariaLabel,
        serviceProviderType: 'MIGRATED'
      };
      Object.assign(request.destination, providerAditionalData);
    }
    this._createTopUp(request);
    this._isMobileRequest = true;
  }

  /**
   * Function to verify createTopUp response and  calls the method to check status or set receipt
   * @param {Object} response
   */
  _verifyTopUpResponse(response) {
    this.set('_topUpResponse', response?.detail);
    if (this._companyMigrated && this.asyncEnabled) {
      const topUpData = {
        id: this._topUpResponse?.id,
        date: this._topUpResponse?.date
      };
      this.set('_getTopUpData', topUpData);
      this._checkTopUpStatus();
    } else {
      this._setReceipt();
    }
  }

  /**
   * Sets the value of property _createTopUpResponse on getTopUp response
   * @param {Object} response
   */
  _setTopUpInfo(response) {
    this.set('_topUpResponse', response?.detail);
  }

  /**
   * set spinner properties to show message
   */
  _setSpinnerProperties(show) {
    const showMessage = show && this._isMobileRequest;
    const spinnerProperties = {
      className: showMessage ? 'solid-spinner' : '',
      topMessage: showMessage ? this.t('mobile-top-up-spinner-title') : '',
      messages: showMessage ? [ this.t('mobile-top-up-spinner-message') ] : []
    };
    this._dispatchEvent('set-spinner-properties', spinnerProperties);
    this._openVeil(show);
  }

  /**
   * Method to dispatch is-on-request event with flag when mobile top up request starts or ends
   * @param {Boolean} flag
   * @event is-on-request
   */
  _setOnRequest(flag) {
    this._setSpinnerProperties(flag);
    this._dispatchEvent('is-on-request', flag);
  }

  /**
   * Function to iteratively call getTopUp and check top up status
   * @event request-top-up
   */
  _checkTopUpStatus() {
    const start = moment().valueOf();
    let checkStatus = setInterval(() => {
      this._getTopUp();
      let timer = moment().valueOf() - start;
      if (this._topUpResponse?.status?.id === 'PROCESSED') {
        this._setReceipt();
        clearInterval(checkStatus);
      } else if (timer > this.topUpConfiguration?.timeLimit) {
        this._setReceipt();
        clearInterval(checkStatus);
      }
    }, this.topUpConfiguration?.interval);
  }

  /**
   * Creates a new mobile top up with NpmService
   * @param {*} data
   */
  _createTopUp(data) {
    const { source, destination, amount } = data || {};
    if (source && destination && amount || this._topUpData) {
      this.set('_topUpData', data);
      this._createMobileTopUpWithNpm();
    }
  }

  /**
   * Calls POST /mobiles/v0/top-ups using Npm
   */
  _createMobileTopUpWithNpm() {
    const { source, destination, amount } = this._topUpData;
    this.$.mobileApi.createMobileTopUpWithNpm(source, destination, amount);
  }

  /**
   * Set successful response elements
   * @event navigate-to-review
   */
  _setReceipt() {
    this._requestListOffers();
    this._setListOfferCard();
    this._setOnRequest(false);
    this._setResultShareReceipt();
    this._setReceiptMobileTopUp();
  }

  /**
   * Set object to successful page
   * @event set-format-date-successful-response
   * @event set-review-header-properties
   * @event set-review-template-properties
   * @event notify-native-navigation-to-review
   * @event navigate-to-review
   */
  _setReceiptMobileTopUp() {
    const data = this._topUpResponse;
    const id = data?.operationNumber;
    let mobileTopUpResponse = {};
    const showMessageCompany = this.c(this._formBody, 'company.id') === '01';
    const regexPhone = /(\d{2})(\d{4})(\d{4})/g;
    const number = (this.get('receiver.mobile', data) || '').replace(regexPhone, '$1 $2 $3');
    const statusDetail = data?.status?.id ?? 'PROCESSED';
    const isPending = statusDetail !== 'PROCESSED';
    mobileTopUpResponse = {
      id: id,
      date: this.c(data, 'date'),
      headerSectionConfig: isPending ? 'core' : 'success',
      title: isPending ? 'mobile-top-up-response-pending-request-title' : 'mobile-top-up-response-success-title',
      amountLabel: 'mobile-top-up-amount-label',
      classTypeOperation: 'blue-avatar-background',
      origin: {
        product: {
          id: 'ACCOUNTS',
          name: this.get('name', this._formBody)
        }
      },
      chargeAmount: {
        amount: this.c(data, 'sentMoney.amount'),
        currency: 'MXN',
        class: 'amount-huge-decimals'
      },
      topInfo: [
        {
          key: this._formBody?.name,
          class: 'key-bold'
        },
        {
          key: number,
          class: 'inline'
        },
        {
          key: this.get('receiver.serviceProvider.name', data),
          class: 'inline spacing'
        },
        {
          key: 'mobile-top-up-account-title-success',
          value: data?.sender?.product?.name ?? this.selectedAccount?.name?.toLowerCase().replace(/^./, (match) => match.toUpperCase()),
          class: 'light-key'
        },
        {
          musk: {
            value: this.get('sender.number', data),
            chars: 4,
            simbol: '•'
          },
          class: 'spacing'
        },
        {
          key: this.t('mobile-top-up-operation-number-title'),
          value: id,
          class: 'light-key spacing'
        },
        {
          value: 'mobile-top-up-bank',
          class: 'spacing-xl inline cursive'
        }
      ],
      operations: isPending ? [] : [
        {
          label: 'mobile-top-up-share',
          id: 'share',
          icon: 'coronita:share',
          operative: 'mobileTopUp'
        }
      ],
      buttons: {
        primary: {
          text: 'mobile-top-up-exit',
          action: 'go-to-next'
        },
        secondary: {
          hidden: true
        }
      },
      additionalInfo: isPending ? [
        {
          message: {
            type: 'info-dark-blue',
            text: 'mobile-top-up-review-additional-info-message-pending-response',
            icon: 'coronita:info'
          }
        }
      ] : showMessageCompany === true ?  [
        {
          message: {
            type: 'info-dark-blue',
            text: 'mobile-top-up-enter-message-description-telcel-succesfull',
            icon: 'coronita:info'
          }
        }
      ] : []
    };
    const formatDate = 'DD MMMM YYYY, HH:mm [h]';
    const receiptProperties = this._getReceiptProperties(isPending);
    this._dispatchEvent('set-format-date-successful-response', formatDate);
    this._dispatchEvent('set-review-header-properties', receiptProperties?.headerProperties);
    this._dispatchEvent('set-review-template-properties', receiptProperties?.templateProperties);
    this._dispatchEvent('notify-native-navigation-to-review', { successful: !isPending });
    this._dispatchEvent('navigate-to-review', mobileTopUpResponse);
  }

  /**
   * Method to get header and template properties class and color
   * @param {Boolean} isPending
   * @returns {Object}
   */
  _getReceiptProperties(isPending) {
    const headerClass =  this.isNativeIOS ? 'header--core-ios ' : '';
    const headerColor = isPending ? 'header--core' : 'header--dark-success';
    const templateClass = this.isNativeIOS ? 'ios-top-padding ' : '';
    const templateColor = isPending ? 'bbva-core-blue' : 'darker-green-bg';
    return {
      headerProperties: {
        className: headerClass + headerColor,
        secondaryClass: headerColor
      },
      templateProperties: {
        className: templateClass + templateColor,
        extraHeaderClass: templateColor
      }
    };
  }

  /**
   * Set object to share successful receipt
   * @event share-receipt-result
   */
  _setResultShareReceipt() {
    const data = this._topUpResponse;
    const result = {
      date: this.get('date', data),
      amount: {
        amount: this.get('sentMoney.amount', data),
        currency: 'MXN'
      },
      topInfo: [
        {
          key: this.get('receiver.mobile', data),
          value: this.get('receiver.serviceProvider.name', data),
          class: 'bold-key spacing',
          name: 'destiny-phone'
        },
        {
          key: 'cells-successful-response-mobile-top-up-account',
          musk: {
            value: this.get('sender.number', data),
            chars: 4,
            simbol: '•'
          },
          class: 'bold spacing'
        },
        {
          key: 'cells-successful-response-operation-number',
          value: this.get('operationNumber', data),
          class: 'bold spacing'
        }
      ],
      operations: [
        {
          operative: 'mobileTopUp'
        }
      ]
    };
    this._dispatchEvent('share-receipt-result', result);
  }

  /**
   * Set properties of banner to display in cells-successful-response
   * @event send-information-for-card-offer
   */
  _setListOfferCard() {
    let crossSalesCard = {};
    if (!this.showOffer) {
      crossSalesCard = {
        bannerParams: {},
        bannerConfig: {},
        showBanner: false
      };
    } else {
      const cardText = this.get('0.description', this.listOffer).split('_');
      const title = this.c(cardText, '0');
      const description = this.c(this.c(cardText, '1').split('/'), '0');
      crossSalesCard = {
        bannerParams: {
          showHeader: false,
          noClose: true,
        },
        bannerConfig: {
          title: title,
          text: description,
          smallImg: {
            id: 'Offer',
            alt: '',
            src: 'images/sales_tdc_cta.svg'
          },
          bannerLink: 'mobile-top-up-see-more'
        },
        showBanner: true
      };
    }
    this._dispatchEvent('send-information-for-card-offer', crossSalesCard);
  }

  /**
   * Set object to fill card advice modal (cross sales)
   * @event set-properties-card-advice-modal
   * @event should-open-opinator-feedback
   */
  setCardAdviceModal() {
    let crossSalesModal = {};
    if (this.showOffer && this.listOffer) {
      let cardText = this.get('0.description', this.listOffer).split('_');
      const modalTitle = this.get('1', (this.get('1', cardText) || '').split('/'));
      const amount = this.get('0.amounts.0.amount', this.listOffer);
      crossSalesModal = {
        code: 'CROSS-SALES-MOBILE-TOP-UP-MODAL',
        fullHeight: true,
        unfixed: true,
        headerTitle: 'mobile-top-up-cross-sales-header-title',
        closeIconIdRigth: 'coronita:close',
        titleText: modalTitle,
        text: this.t('mobile-top-up-cross-sales-header-text', '', {
          amount
        }),
        imageUrl: 'images/sales_tdc_cta.svg',
        listTitle: 'mobile-top-up-cross-sales-list-title',
        list: [
          'mobile-top-up-cross-sales-list-item-1',
          'mobile-top-up-cross-sales-list-item-2',
          'mobile-top-up-cross-sales-list-item-3',
          'mobile-top-up-cross-sales-list-item-4'
        ],
        configButtons: {
          buttons: {
            primary: {
              text: 'mobile-top-up-cross-sales-button-text',
              class: 'primary'
            }
          }
        }
      };
    } else {
      this._openOpinator = true;
    }

    let eventName = '';
    if (this.showOffer && !this._showOfferCard) {
      eventName = 'set-properties-card-advice-modal';
    }

    if (this._openOpinator) {
      eventName = 'should-open-opinator-feedback';
    }
    this._dispatchEvent(eventName, eventName === 'set-properties-card-advice-modal' ? crossSalesModal : { feedbackOperation: 'mobile_top_up_success' });
  }

  /**
   * Set property _showOfferCard true if user scroll bottom
   */
  scrollBottomComplete() {
    this._showOfferCard = true;
  }

  /**
   * Set Limit response in a property
   * @param {Object} response
   */
  setLimits(response) {
    this._setErrorModalLimitOperations(response);
  }

  /**
   * Set code error from error on create Mobile Top Up
   * @param {Object} errorType
   * @event open-generic-error-modal
   * @event mtu-exception-handler-navigation
   */
  _setErrorModal(errorType) {
    const statusError = this.get('detail.status', errorType) ?? 0;
    if (statusError !== 0) {
      this._errorCode = this.get('0', (this.get('detail.messages.0.message', errorType) || '').split('#'));
      if (Object.values(this._limitErrorCodes).includes(this._errorCode)) {
        this._requestOperationalLimits();
      } else if (this.duplicatedErrorCodes.includes(this._errorCode)) {
        this._setCustomErrorModal('DUPLICATED');
      } else if (this._errorCode === 'KNE6666') {
        this._dispatchEvent('mtu-exception-handler-navigation', true);
      } else {
        const messages = [ {message: statusError >= 500 ? this.t('glomo-standard-error-handler-blocking-message') : this.t('glomo-standard-error-handler-message')} ];
        errorType.detail.messages = messages;
        this._dispatchEvent('open-generic-error-modal', this.get('detail', errorType));
      }
    } else {
      this._setCustomErrorModal('NOT-CONFIRMED');
    }
    this._setOnRequest(false);
  }

  /**
   * Set config modal to show custom error
   * @param {String} type type of error to config modal
   * @event open-alert-manager-modal
   */
  _setCustomErrorModal(type) {
    const errorModal = {
      code: 'MOBILE-TOP-UP-' + type + '-ERROR',
      selectedConfig: {
        className: 'full-height-error header--white',
        hideCloseIcon: true,
        openMaximized: true,
        title: this.t('alert-MOBILE-TOP-UP-' + type + '-ERROR-title'),
        heroImage: 'images/errors/error.svg',
        message: this.t('alert-MOBILE-TOP-UP-' + type + '-ERROR-message'),
        acceptBtLabel: this.t('alert-MOBILE-TOP-UP-' + type + '-ERROR-button-exit'),
        template: {
          type: 'paragraphs',
          values: [
            { text: this.t('alert-MOBILE-TOP-UP-' + type + '-ERROR-text-1'), class: 'spacing' },
            { text: this.t('alert-MOBILE-TOP-UP-' + type + '-ERROR-text-2') }
          ]
        }
      }
    };
    this._dispatchEvent('open-alert-manager-modal', errorModal);
  }

  /**
   * Set dynamic elements to limits error modal
   * @event open-alert-manager-modal
   */
  _setErrorModalLimitOperations(response) {
    const titles = [this.t('mobile-top-up-operation-limit-daily'), this.t('mobile-top-up-operation-limit-monthly'), this.t('mobile-top-up-operation-limit-operation')];
    const amounts = [this.c(response, '0.amounts.maximum.amount'), this.c(response, '2.amounts.maximum.amount'), this.c(response, '1.amounts.maximum.amount')];
    const index = Object.values(this.get('_limitErrorCodes')).findIndex((code) => code === this._errorCode);
    const limitTitle = titles[index];
    const limitAmount = amounts[index];
    const limitOperationErrorModal = {
      code: 'LIMIT-OPERATIONS',
      selectedConfig: {
        className: 'full-height-error header--white',
        hideCloseIcon: false,
        openMaximized: true,
        title: 'mobile-top-up-error-title',
        heroImage: 'images/errors/error.svg',
        message: this.t('mobile-top-up-operation-limit-message', '', {
          limitTitle
        }),
        acceptBtLabel: 'mobile-top-up-operation-limit-button-accept',
        cancelBtLabel: 'mobile-top-up-operation-limit-button-cancel',
        template: {
          type: 'paragraphs',
          values: [ {
            text: this.t('mobile-top-up-operation-limit-text', '', {
              limitTitle,
              limitAmount
            })
          } ]
        }
      }
    };
    this._dispatchEvent('open-alert-manager-modal', limitOperationErrorModal);
    this._openVeil(false);
  }

  /**
   * Fills property _contactsMobile with contacts book api response
   */
  _setContactsResponseSuccess(response) {
    this._openVeil(false);
    this._dispatchEvent('send-contacts-book-success-response', this._getAvailableContacts(response.detail));
  }

  /**
   * Method to return only contacts with available providers
   * @param {Array} data
   * @returns {Array}
   */
  _getAvailableContacts(data) {
    if (Object.keys(this._providerFlags).length === 0) {
      return data;
    } else {
      const mobileContacts = data.filter((contact) => Object.prototype.hasOwnProperty.call(contact, 'contactsInformation'));
      for (let contact of mobileContacts) {
        contact.contactsInformation = contact?.contactsInformation.filter((number) => this._providerFlags[number?.contactType?.mobileCompany?.id]);
      }
      return mobileContacts.filter((contact) => contact?.contactsInformation?.length !== 0);
    }
  }

  /**
   * Function to handle error on contacts book api response
   */
  _setErrorOnGetContactsList() {
    this._openVeil(false);
    this._dispatchEvent('get-contacts-book-response-error', { });
  }

  /**
   * Fills property listOffer with campaigns api response
   * @event response-list-offer
   * @event show-offer-modal-cross-sales
   */
  setListOffersResponse(response) {
    this.set('listOffer', response);
    if (this.listOffer !== null) {
      this.showOffer = true;
      this._dispatchEvent('response-list-offer', response);
      this._dispatchEvent('show-offer-modal-cross-sales', true);
    }
  }

  /**
   * Set the formBody and send it in event detail
   * @param {*} formBody
   */
  setFormBody(formBody) {
    this.set('_formBody', formBody);
    this._provider = this.c(this._formBody, 'company.id');
  }

  /**
   * Add new number
   * @event set-update-contact
   */
  addNumber() {
    const numberInfo = {
      contactId: this.c(this.existingContact, 'contactId'),
      body: {
        contactType: {
          id: 'MOBILE_NUMBER',
          name: this.t('mobile-top-up-phone-number'),
          mobileCompany: {
            id: this.c(this._formBody, 'company.id'),
            name: this._formBody?.company?.ariaLabel
          }
        },
        value: this.c(this._formBody, 'number'),
        additionalInformation: this.t('mobile-top-up-phone-number-with-sapce') + this.c(this._formBody, 'number'),
        operatives: [
          {
            id: 'MOBILE_TOP_UP',
            isActive: true
          }
        ],
        favourite: false
      }
    };
    this.$.contactsBook.postContactContactsInformation(numberInfo);
  }

  /**
   * Function to dispatch the event 'new-number-selected' when adding number is succes and show succes message
   */
  _addNumberSuccess() {
    this._dispatchEvent('new-number-alias-already-in-contacts-add-number-selected', this._formBody);
    this._dispatchEvent('show-saved-number-message', 'mobile-top-up-update-contact');
  }

  /**
   * Request to POST contact into contactsBook API
   * @param {Object} params
   */
  addNewContact(params) {
    this.set('_addContactBody', params ?? this._addContactBody);
    this.$.contactsBook.postContact(this._addContactBody);
  }

  /**
   * Function to dispatch events 'add-contact-success' and 'set-form-body-add-contact' when adding contact is succes and show succes message
   * @event add-contact-success
   */
  _addContactSuccess() {
    this._dispatchEvent('add-contact-success', true);
    this.sendFormBodyAddContact();
  }

  /**
   * Function to dispatch event 'set-form-body-add-contact'
   * @event set-form-body-add-contact
   */
  sendFormBodyAddContact() {
    this._dispatchEvent('set-form-body-add-contact', this._formBody);
  }

  /**
   * Function to manage error on postContact and open modal to retry or continue without savign contact
   * @event open-alert-manager-modal
   */
  _setAddContactErrorModal() {
    const modalConfig = {
      retryErrorData: {
        errorId: 'add-contact-mobile-error',
        errorType: 'operative',
        disabledOpenDialerAction: true,
        retryConfig: {
          title: this.t('alert-MOBILE-TOP-UP-ADD-CONTACT-ERROR-title'),
          className: 'error exit',
          fullModal: false,
          srcImage: './images/errors/error.svg',
          message: this.t('alert-MOBILE-TOP-UP-ADD-CONTACT-ERROR-message'),
          acceptBtLabel: this.t('alert-MOBILE-TOP-UP-ADD-CONTACT-ERROR-accept'),
          cancelBtLabel: this.t('alert-MOBILE-TOP-UP-ADD-CONTACT-ERROR-cancel')
        },
        callConfig: {
          title: this.t('alert-MOBILE-TOP-UP-ADD-CONTACT-ERROR-title'),
          className: 'error exit',
          srcImage: './images/errors/error.svg',
          message: this.t('alert-MOBILE-TOP-UP-ADD-CONTACT-ERROR-RETRY-message'),
          acceptBtLabel: this.t('alert-MOBILE-TOP-UP-ADD-CONTACT-ERROR-RETRY-accept'),
          fullModal: false
        }
      }
    };
    this._dispatchEvent('retry-error', modalConfig);
    this._openVeil(false);
  }

  /**
     * Gets successful response from customers api
     * @param {Object} response
     */
  _successfulCustomerDetailsResponse(response) {
    const accountEmail = Array.prototype.find.call((this.c(response, 'detail')), ({contactType}) => contactType.id === 'EMAIL').contact;
    this._dispatchEvent('set-account-email', accountEmail);
  }

  /* -------------------------------------------------------------------------- */
  /*                                Services requests                           */
  /* -------------------------------------------------------------------------- */

  /**
   * Calls signTypeRequest for OTP
   */
  signTypeRequest(sign) {
    this.$.mobileApi.signTypeRequest(sign);
  }

  /**
   * Calls signRequest when OTP is asked
   */
  signRequest(sign) {
    this.$.mobileApi.signRequest(sign);
    this._setOnRequest(true);
    this._isMobileRequest = false;
  }

  /**
   * Request for new OTP
   */
  signGetNewOtp() {
    this.setTopUpRequest();
  }

  /**
   * Calls cancelRequest request when OTP is cancelled
   */
  signCancel() {
    this.$.mobileApi.cancelRequest();
    this._setOnRequest(false);
  }

  /**
   * Request offers from campaigns api
   * @event request-list-offer
   */
  _requestListOffers() {
    this._dispatchEvent('request-list-offer', {
      'label.id': 'VCTA'
    });
  }

  /**
   * Request operationalLimit
   * @event request-operational-limits
   */
  _requestOperationalLimits() {
    this._dispatchEvent('request-operational-limits', { 'operative-limit-id': 'LIMITESGLOBALGLOMO' });
  }

  /**
   * Request contacts from contacts book api
   */
  requestContactsBook() {
    this._openVeil(true);
    this.$.contactsBook.getContacts({ expand: 'contacts-information', pageSize: 999 });
  }

  /**
   * Request customer info from customers api
   */
  getCustomerInfo() {
    this.$.customersBgadpmockDm.getCustomerContacts();
  }

  /**
   * Calls GET /mobiles/v0/top-ups/{top-up-id}
   */
  _getTopUp() {
    this.$.mobileApi.getTopUp(this._getTopUpData);
  }

  /**
   * Calls GET /mobiles/v0/service-providers/{service-provider-id}/migrated
   */
  _getProviderIsMigrated(providerId) {
    if (providerId && this.asyncEnabled) {
      this.$.mobileApi.getProviderIsMigrated({ id: providerId });
    }
  }
}

customElements.define(GlomoMobileTopUpManagerMx.is, GlomoMobileTopUpManagerMx);
