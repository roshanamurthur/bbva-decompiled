/*e/**
* @summary CELLS Manager for MEXICO Fund Hiring.
* @customElement
* @polymer
* @extends {Polymer.Element}
*/
/* global moment */
/*eslint new-cap: 0*/
/* global WithFundsParserStep2 */
/* global iconInfo */
/* global profileAggressive */
/* global profileConservator */
/* global profileModerate */
/* global contactType */
/* eslint no-shadow: "error" */

const contactTypeName = 'EMAIL';

class GlomoFundHiringManagerMx extends Polymer.mixinBehaviors(
  [ CellsBehaviors.CellsCheckNestedKeysBehavior ], CellsBehaviors.withFundsParserStep2(Polymer.Element)) {

  static get is() {
    return 'glomo-fund-hiring-manager-mx';
  }

  static get properties() {
    return {
      /** native globall cache storege
       * @type{Object}
       **/
      globalCacheStorage: {
        type: Object
      },
      /** native globall cache storege
       * @type{Object}
       **/
      globalUser: {
        type: Object
      },
      /** native globall cache storege
       * @type{Object}
       **/
      globalAccounts: {
        type: Array
      },
      globalAccountsParsed: {
        type: Array,
        computed: '_parseGlobalAccounts(globalAccounts)'
      },
      /** Choosen currency by user in modal selector * @type{Object} */
      fundCurrencySelected: {
        type: Object,
        value: () => ({
          id: 'MXN'
        }),
        notify: true
      },
      /** Choosen account related * @type{Object} */
      accountSelected: {
        type: Object,
        value: () => ({})
      },
      /** Response of fund simulate * @type{Object} */
      dataFundSimulate: {
        type: Object,
        value: () => ({}),
        resettable: true
      },
      detailsAndPerformance: {
        type: Object,
        value: () => ({}),
        resettable: true
      },
      /** Unique currencies available from User accounts @type{Array} */
      availableCurrencies: {
        type: Array,
        computed: '_getAccountCurrenciesList(products)'
      },
      /** Funds received from API @type{Array} */
      fundsProducts: {
        type: Array,
        value: () => ([]),
        resettable: true
      },
      /** Funds sanitized @type{Array} */
      fundsParsed: {
        type: Array,
        computed: '_parseFunds(fundsProducts, availableCurrencies)',
      },
      /**
       * Can show the Dropdown?
       * @type {Boolean}
       */
      hasSetDropdown: {
        type: Boolean,
        computed: '_computedHasSetDropdown(fundsParsed)',
        observer: '_hasSetDropdownObserver'
      },
      /** Unique currencies available from User accounts
       * @type {Array}
       */
      fundsCurrenciesList: {
        type: Array,
        computed: '_getFundsCurrenciesList(fundsParsed)',
        notify: true
      },
      /** Flag to control for change in type fund @type {Boolean} */
      isChangeTypeFund: {
        type: Boolean,
        value: false,
        resettable: true
      },
      /** Max registry the months @type {Number} */
      maxRegistryMonth: {
        type: Number,
        value: 5
      },
      /** Max registry the years @type {Number} */
      maxRegistryYear: {
        type: Number,
        value: 5
      },

      // = = = = = = = = = = = = = = = = = = = = = == = = = = = =  Funds = = = = = = =

      descendingOrder: {
        type: Boolean,
        value: false
      },
      visibleFundsMx: {
        type: Array,
        value: () => ([]),
        observer: '_dataFundsMx'
      },
      investmentServiceSelected: {
        type: Object
      },
      /** Risk scale of funds @type {Array} */
      riskScale: {
        type: Array,
        value: () => ([])
      },
      /** Mount min of funds @type {Array} */
      minFundsAmounts: {
        type: Array,
        value: () => ([])
      },
      accountsList: {
        type: Array,
        value: () => ([]),
        notify: true
      },
      canExecute: {
        type: Boolean,
        observer: 'showIconMessageAlert'
      },
      minValueInput: {
        type: Object
      },
      enterAmount: {
        type: Object
      },
      /** Fund product id selected COME or EJOP @type {String} */
      investmentFundProductIdSelected: {
        type: String
      },
      fundsAll: {
        type: Object,
        value: {}
      },
      /** Fund title and description in modal filter @type {Object} */
      titleFilterFunds: {
        type: Object,
        value: {
          title: 'funds-hiring-investment-service-title-type',
          classTitle: 'filter-title',
          description: 'funds-hiring-investment-service-description-type',
          classSubTitle: 'filter-subtitle'
        },
      },
      /** Selected fund type @type {String} */
      selectedTypeFound: {
        type: String,
        value: ''
      },
      /** types of terms in the funds @type {Array} */
      termTypeTexts: {
        type: Array,
        value: () => ([])
      },
      /** Term texts in multi-strategy fund @type {Array} */
      multistrategyTerms: {
        type: Array,
        value: () => ([])
      },
      /** Detail of funds Debt Variable Income and Multi-strategy @type {Array} */
      payloadSelectedTypeFund: {
        type: Array,
        value: () => ([])
      },
      /** Choosen fund * @type{Object} */
      fundSelected: {
        type: Object,
        value: () => ({}),
        observer: '_setMinValueAccepted'
      },
      /**Time the fundSelected starts traiding */
      fundSelectedStartHour: {
        type: String,
        value: ''
      },
      /**Time the fundSelected ends traiding */
      fundSelectedFinalHour: {
        type: String,
        value: ''
      },
      /**Store the  detailsAndPerformance value for comparison*/
      prevDetailsAndPerformance: {
        type: Object,
        value: () => ({})
      },
      /** Buffer account id to get participants * @type{String} */
      accountId: {
        type: String
      },
      /** Participants detail * @type{String} */
      participants: {
        type: Object,
        notify: true
      },
      enterAmountSimulation: {
        type: Object,
        value: () => ({}),
        observer: '_validateInTimeSimulation'
      },
      /** Main address * @type{Object} */
      mainAddress: {
        type: String,
        value: ''
      },
      /** @desc tsec for pdf request @type {Object} */
      tsec: {
        type: Object,
        value: () => ({}),
        notify: true
      },
      /** @desc device id for pdf request @type {Object} */
      deviceId: {
        type: Object,
        value: () => ({}),
        notify: true
      },
      /** @desc Accepts base64 string or pdf url @type {string} */
      baseSrc: {
        type: String,
        notify: true
      },
      /** @desc Accepts base64 string or pdf url @type {string} */
      mainEmail: {
        type: String,
        value: '',
        notify: true
      },
      /** @desc Accepts base64 string or pdf url @type {string} */
      mainEmailShow: {
        type: String,
        value: '',
        notify: true
      },
      /** @desc set true if is single account @type {Object} */
      _singleAccount: {
        type: Object,
        value: false
      },
      /** @desc set true if simulation is in time @type {Boolean} */
      inTime: {
        type: Boolean,
        value: false,
        notify: true
      },
      /** @desc set true if liquidity is instant @type {Boolean} */
      _instantLiquidity: {
        type: Boolean,
        value: false
      },
      /** @desc step reset id @type {Object} */
      componentContent: {
        type: Object,
        value: () => ({}),
      },
      /** @desc contract details @type {Object} */
      contactDetails: {
        type: Object,
        value: () => ({}),
      },
      /** @desc Flag to know if it is ios @type {Boolean} */
      isNativeIos: {
        type: Boolean,
        value: false
      },
      /** @desc store the number of the active step  @type {Number} */
      currentStep: {
        type: Number,
        value: 0
      },
      /** @desc store the number of the last active step @type {Number} */
      lastActiveStep: {
        type: Number,
        value: 0
      },
      /** @desc Save the initial time to make operations with investment funds and change the text in the informative modal of step 1. @type {String} */
      businessStartTime: {
        type: String,
        value: ''
      },
      /** @desc Save the final time to make operations with investment funds and change the text in the informative modal of step 1. @type {String} */
      businessFinalTime: {
        type: String,
        value: ''
      },
      /** @desc This property save the title of each PDF modal of step 1 and step 7 @type {String} */
      pdfViewTitle: {
        type: String,
        value: ''
      },
      /**
       * @desc This property disable the participants requirement @type {Boolean}
       * @default false
      */
      notBeneficiariesFunds: {
        type: Boolean,
        value: false
      },
      /**
       * @desc Property to receive fund data array @type {Array}
      */
      finalFundsCatalog: {
        type: Array,
        value: []
      },
      /**
       * @desc Property to recive fund data the app-settings @type {Array}
       */
      dataFunds: {
        type: Array,
        value: []
      }
    };
  }
  static get observers() {
    return [
      '_resetFundSelectedHours(detailsAndPerformance)'
    ];
  }
  /**
   * Compare the value of detailsAndPerformance with prevDetailsAndPerformance, if the fund has
   * changed, it reset the fundSelectedStartHour and fundSelectedFinalHour props
   * @param {Object} detailsAndPerformance
   */
  _resetFundSelectedHours(detailsAndPerformance) {
    if (!!detailsAndPerformance.name && (detailsAndPerformance.name !== this.prevDetailsAndPerformance.name)) {
      this.fundSelectedStartHour = '';
      this.fundSelectedFinalHour = '';
      this.prevDetailsAndPerformance = detailsAndPerformance;
    }
  }
  init() {
    this._dispatchEvents('fund-hiring-account-service');
    this.accountsHasBeenValidated = false;
    this.enterAmountSimulation = {};
    this.lastActiveStep = 0;
    this.currentStep = 0;
    this.getCustomerAddresses();
    if (Object.keys(this.globalAccountsParsed || {}).length) {
      this.validateAccounts();
    }
    this._dispatchEvents('disable-button-modal', true);
    this._dispatchEvents('title-filter-funds', this.titleFilterFunds);
    this._dispatchEvents('disable-title-modal', '');
    this.setTermsAndConditionsPDF();
    this._inBussinessHours();
    this.modalConfigItems = {
      isDollar: {
        code: 'DIY-MODAL-INFO-IS-DOLLAR',
        className: 'header--white',
        heroImage: './images/fundsHiring/Account.svg',
        maximize: true,
        cancelFromHeaderEvent: 'HEADER',
        title: this.t('funds-hiring-account-another-currency'),
        acceptBtLabel: 'Salir',
        cancelBtLabel: 'Ver información de fondos',
        values: [{
          title: this.t('funds-hiring-hire-fund-mexican-pesos'),
          class: 'simple-title margin-bottom-s text-center'
        },
        {
          text: this.t('funds-hiring-open-account'),
          class: 'text-styles-ml'
        }]
      },
      isDiferentToN4: {
        code: 'DIY-MODAL-INFO-N4',
        className: 'header--white',
        heroImage: './images/fundsHiring/Account.svg',
        maximize: true,
        cancelFromHeaderEvent: 'HEADER',
        title: this.t('funds-hiring-account-file'),
        acceptBtLabel: 'Salir',
        cancelBtLabel: this.t('funds-hiring-fund-information'),
        values: [{
          title: this.t('funds-hiring-update-account-file'),
          class: 'simple-title margin-bottom-s text-center'
        },
        {
          text: this.t('funds-hiring-proof-address-greater'),
          class: 'text-styles-ml'
        }]
      },
      isMinAmount: {
        code: 'DIY-MODAL-INFO-MIN-AMOUNT',
        className: 'header--white',
        heroImage: './images/fundsHiring/Account-Error.svg',
        maximize: true,
        cancelFromHeaderEvent: 'HEADER',
        title: this.t('funds-hiring-insufficient-balance'),
        acceptBtLabel: this.t('funds-hiring-out'),
        cancelBtLabel: 'Ver información de fondos',
        values: [{
          title: 'Saldo insuficiente',
          class: 'simple-title margin-bottom-s text-center'
        },
        {
          text: this.t('funds-hiring-minimum-account-balance'),
          class: 'text-styles-ml'
        }]
      },
      isWithoutParticipats: {
        code: 'DIY-MODAL-INFO-NO-PARTICIPANTS',
        className: 'header--white',
        heroImage: './images/fundsHiring/Beneficiaries.svg',
        maximize: true,
        cancelFromHeaderEvent: 'HEADER',
        title: 'Beneficiarios',
        acceptBtLabel: this.t('funds-hiring-out'),
        cancelBtLabel: this.t('funds-hiring-fund-information'),
        values: [{
          title: this.t('funds-hiring-contract-fund'),
          class: 'simple-title margin-bottom-s text-center'
        },
        {
          text: this.t('funds-hiring-beneficiaries-share-address'),
          class: 'margin-bottom-s text-center text-styles-ml'
        },
        {
          text: this.t('funds-hiring-address'),
          class: 'text-styles-ml'
        }]
      },
      notOperable: {
        code: 'DIY-MODAL-INFO-NOT-OPERABLE',
        className: 'header--white',
        heroImage: './images/fundsHiring/Account.svg',
        maximize: true,
        cancelFromHeaderEvent: 'HEADER',
        title: this.t('funds-hiring-account-features'),
        acceptBtLabel: 'Salir',
        cancelBtLabel: 'Ver información de fondos',
        values: [{
          title: this.t('funds-hiring-accounts-not-meet-characteristics'),
          class: 'simple-title margin-bottom-s text-center'
        },
        {
          text: this.t('funds-hiring-personalized-advice'),
          class: 'text-styles-ml'
        }]
      },
    };
  }

  /**
   * This method builds the object that is sent to raise the modal, according to the selected service.
   * @param {Object} service
   */
  modalObjectConstructor(service = {}) {
    const objectService = {
      id: this._formatCode(service.index),
      name: this.get('text', service) || '',
      additionalInformation: [
        {
          className: '',
          value: ''
        }
      ]
    };
    this._dispatchEvents('new-object-service-selected', objectService);
    this.setInvestmentServiceSelected(objectService);
  }

  /**
   * This method is used to format the object that is used to list the button data.
   */
  _formatCode(id = 0) {
    const idNumber = (id + 1).toString();
    return '00'.concat(idNumber);
  }

  /**
   * This method is used to build the objects to display the radio buttons
   * @param {Object} service
   */
  setInvestmentServiceOptions(params) {
    this.set('accountSelected', params);
    const investmentServiceOptions = [
      {
        externalLink: false,
        config: {
          id: 0,
          radio: 'funds-hiring-investment-service-radio-selector-text-1',
          description: 'funds-hiring-investment-service-subtitle-description-1',
          disabled: false,
          classIconMessage: 'inline',
          class: 'bold-radio-text',
          collapsedDescription: 'funds-hiring-investment-service-subtitle-description-1-selected',
        }
      },
      {
        externalLink: false,
        config: {
          id: 1,
          radio: 'funds-hiring-investment-service-radio-selector-text-2',
          description: 'funds-hiring-investment-service-subtitle-description-2',
          disabled: false,
          classIconMessage: 'inline',
          class: 'bold-radio-text',
          collapsedDescription: 'funds-hiring-investment-service-subtitle-description-2-selected',
        }
      }
    ];
    this._dispatchEvents('set-investment-service-list-options', investmentServiceOptions);
    this._dispatchEvents('set-investment-header', 'funds-hiring-investment-service-header');
  }

  /**
   * @desc Modify offset top for scroll
   * @type {Object}
   */
  scrollZoneModify(payload) {
    if (this.isNativeIos && payload.offsetTop > 100) {
      Object.defineProperty(payload, 'offsetTop', {
        value: payload.offsetTop - 100,
        configurable: true
      });
    }
    this._dispatchEvents('cells-scroll-zone-modify', payload);
  }
  /**
   * Updates lastActiveStep prop with the current value of currentStep
   * and then updates the currentStep prop with the number of the step
   * that has just been activated
   * @param {Object} detail
   */
  changeStep(detail) {
    let {currentStep} = detail;
    if (currentStep) {
      this.lastActiveStep = this.currentStep;
      this.currentStep = currentStep;
    }
  }
  /**
   * Fires an event to go back to the last active step, before the modal
   * were displayed, or to go back to the summary view
   */
  goToLastActiveStep() {
    this.currentStep = this.lastActiveStep;
    if (this.canExecute) {
      this._dispatchEvents('go-to-summary-view', true);
    } else {
      this._dispatchEvents('go-to-last-active-step', {
        currentStep: this.lastActiveStep
      });
    }
  }
  getCustomerAddresses() {
    let customerId = this.globalCacheStorage ? this.globalCacheStorage.customer.customerId : this.globalUser.customerId;
    this._dispatchEvents('set-customer-id', customerId);
    if (!this.mainAddress) {
      this._dispatchEvents('request-customer-addresses');
    }

    if (!this.contactDetails.contactDetails) {
      this._dispatchEvents('request-customer-detail');
    }
  }

  setCustomerMainAddresses(addresses) {
    if (addresses && addresses.length !== 0) {
      const addess = addresses.find(item => item.addressType.id === 'HOME');
      this.mainAddress = `•${addess.location.state.id}, ${addess.location.country.name}`;
    }
  }
  /**
   * @desc Get the correct email of the dashboad
   * @type {String}
   */
  setCustomerMainEmail(contactDetails) {
    if (contactDetails && contactDetails.contactDetails) {
      const email = contactDetails.contactDetails.find(item => item.contactType.id === contactTypeName);
      this.mainEmail = email.contact;
      this.mainEmailShow = `•${email.contact.split('*')[email.contact.split('*').length - 1]}`;
    }
  }

  showMainAddress() {
    const accountStatementMail = [ {
      name: '',
      id: 'HOME',
      description: {
        value: this.mainAddress
      }
    } ];

    //Delay for rerender styles in iOS
    this._dispatchEvents('set-mail-header', '');
    setTimeout(()=>{
      this._dispatchEvents('set-mail-header', 'funds-hiring-send-accound-description');
      this._dispatchEvents('set-statement-mail', accountStatementMail);
    }, 100);
  }

  setTermsAndConditionsPDF() {
    const fundPdfAlias = 'sci0000s';
    let titleLink = this.investmentFundProductIdSelected === 'COME' ? this.t('funds-step-card-checklist-contract-apffmm_Contrato') : this.t('funds-step-card-checklist-contract-apffmm_Contrato-and-exacution-letter');
    const pdfData = [{
      name: 'apffmm_Contrato',
      id: 'apffmm_Contrato',
      icon: 'coronita:pdf',
      text: titleLink
    },
    {
      name: 'apffmm_Detalle',
      id: 'apffmm_Dici',
      icon: 'coronita:pdf',
      text: 'funds-step-card-checklist-contract-apffmm_dici'
    },
    {
      name: 'apffmm_Detalle',
      id: 'apffmm_Prospect',
      icon: 'coronita:pdf',
      text: 'funds-step-card-checklist-contract-apffmm_prospect'
    },
    {
      name: fundPdfAlias,
      id: fundPdfAlias,
      icon: 'coronita:pdf',
      text: `${this.t('funds-step-card-checklist-contract-apffmm_Guide')}`
    }];

    this._dispatchEvents('set-checklist-contract-pdf-data', pdfData);
  }

  /**
   * @desc Parse accounts from global
   * @type {Array}
   */
  _parseGlobalAccounts(globalAccounts) {
    let parsedAccounts = [];
    globalAccounts[0].products.forEach(account => {
      const accountOrder = {
        alias: account.name,
        accountId: account.id,
        number: account.description.value,
        availableBalance: {
          currentBalances: [ {
            amount: account.primaryAmount.amount,
            currency: account.primaryAmount.currency
          } ]
        },
        level: account.level
      };
      parsedAccounts.push(accountOrder);
    }, {});
    if (!this.accountsHasBeenValidated) {
      setTimeout(() => {
        this.validateAccounts();
        this.accountsHasBeenValidated = true;
      });
    }
    return parsedAccounts;
  }

  /**
   * Gets the current time and performs a comparison to see if you are in business hours.
   * Trigger an event to send a text through a channel.
   */
  _inBussinessHours() {
    const format = 'HH:mm:ss';
    const now = moment().format(format);
    const time = moment(now, format);
    const initialTime = moment(this.businessStartTime, format);
    const finalTime = moment(this.businessFinalTime, format);

    const bussinessText = (time.isBetween(initialTime, finalTime)) ? 'funds-hiring-offer-page-info-message-warning-2' : 'funds-hiring-offer-page-info-message-warning-3';

    this._dispatchEvents('set-fund-hiring-bussiness-text', bussinessText);
  }

  validateAccounts() {
    this.accountsHasBeenValidated = true;
    let accounts;
    let stepConfig = {
      header: 'funds-hiring-account-selector-header',
      changeLabel: 'funds-hiring-cells-step-common-operatives-change'
    };

    if (this.globalCacheStorage) {
      accounts = this.globalCacheStorage.dashboard.accounts;
    } else {
      accounts = this.globalAccountsParsed;
    }

    if (accounts.length >= 2) {
      this._validateAcountList(accounts);
    } else {
      stepConfig = {
        header: 'funds-hiring-account-selector-header-single-account',
        changeLabel: 'funds-hiring-product-step-common-operatives-change'
      };
      this._singleAccount = true;
      this._validateAcountList(accounts);
    }

    this._dispatchEvents('update-account-step-description', stepConfig);
  }

  /* eslint-disable-next-line */
  async _validateAcountList(accounts) {
    this.accountsList = await accounts.reduce(async(previewsAccounts, account) => {
      const parseAccounts = await previewsAccounts;
      const parseAccount = {
        'name': account.alias,
        'id': account.accountId,
        'number': account.number,
        'imgSrc': '',
        'currencies': [ {
          'currency': account.availableBalance.currentBalances[0].currency,
          'isMajor': true
        } ],
        'description': {
          'value': account.number,
          'masked': true
        },
        'type': account.cardType,
        'group': 'account',
        'holds': [],
        'primaryAmount': {
          'amount': account.availableBalance.currentBalances[0].amount,
          'currency': account.availableBalance.currentBalances[0].currency,
          'label': this.t('account-label-available_current_balances')
        },
        'productType': 'ACCOUNTS'
      };

      if (account.availableBalance.currentBalances[0].currency !== 'MXN') {
        if (this._singleAccount) {
          this._dispatchEvents('set-questionnaire-text', this.t('funds-hiring-hire-fund-mexican-pesos'));
          this._dispatchEvents('disabled-next-button-offer', true);
          this.showInfoModal({
            id: 'isDollar'
          });
          return [];
        } else {
          return [ ...parseAccounts ];
        }
      }

      const accountLevel = account.level ? account.level : account.meta.accountLevel;
      if (accountLevel !== '04') {
        if (this._singleAccount) {
          this._dispatchEvents('set-questionnaire-text', this.t('funds-hiring-update-file'));
          this._dispatchEvents('disabled-next-button-offer', true);
          this.showInfoModal({
            id: 'isDiferentToN4'
          });
          return [];
        } else {
          return [...parseAccounts, {
            ...parseAccount,
            disabled: true,
            hasTextMessage: true,
            errorMessage: this.t('funds-hiring-associate-fund-account')
          }];
        }
      }

      if (account.availableBalance.currentBalances[0].amount < 50) {
        if (this._singleAccount) {
          this._dispatchEvents('set-questionnaire-text', this.t('funds-hiring-minimum-balance'));
          this._dispatchEvents('disabled-next-button-offer', true);
          this.showInfoModal({
            id: 'isMinAmount'
          });
          return [];
        } else {
          return [...parseAccounts, {
            ...parseAccount,
            disabled: true,
            hasTextMessage: true,
            errorMessage: this.t('funds-hiring-insufficient-balance')
          }];
        }
      }
      this._dispatchEvents('set-account-id', account.accountId);
      this._dispatchEvents('request-account-participants');

      const {
        detail: {
          value: {
            participants
          }
        }
      } = await new Promise(resolve => this.addEventListener('participants-changed', resolve));

      if (participants.length === 1 && !this.notBeneficiariesFunds) {
        if (this._singleAccount) {
          this._dispatchEvents('set-questionnaire-text', this.t('funds-hiring-assigns-beneficiaries'));
          this._dispatchEvents('disabled-next-button-offer', true);
          this.showInfoModal({
            id: 'isWithoutParticipats'
          });
          return [];
        } else {
          return [...parseAccounts, {
            ...parseAccount,
            disabled: true,
            hasTextMessage: true,
            errorMessage: this.t('funds-hiring-beneficiaries')
          }];
        }
      }

      return [...parseAccounts, parseAccount];
    }, []);
    this._showSpinner(false);
  }

  /**
   * @Desc Fire event in order to show or hide the spinner
   */
  _showSpinner(statusSpinner = true) {
    this._dispatchEvents('spinner-toggle-event', !statusSpinner);
  }

  setAccounts() {
    //Delay for rerender styles in iOS
    this._delayEvent('set-accounts-list', this.accountsList);
  }

  showModalInvGuide() {
    this.filterDocumentRequest({
      id: 'sci0000s'
    });
  }

  setInvestmentService(params) {
    this.set('accountSelected', params);
    let investmentServiceList = [{
      'id': '001',
      'name': this.t('funds-hiring-investment-service-subtitle-1'),
      'description': '',
      'additionalInformation': [ {
        'value': this.t('funds-hiring-investment-service-subtitle-description-1'),
        'className': ' '
      } ]
    },
    {
      'id': '002',
      'name': this.t('funds-hiring-investment-service-subtitle-2'),
      'description': '',
      'additionalInformation': [ {
        'value': this.t('funds-hiring-investment-service-subtitle-description-2'),
        'className': ' '
      } ]
    }];

    //Delay for rerender styles in iOS
    this._dispatchEvents('set-investment-header', '');
    setTimeout(()=>{
      this._dispatchEvents('set-investment-service-list', investmentServiceList);
      this._dispatchEvents('set-investment-header', 'funds-hiring-investment-service-header');
    }, 100);
  }

  setInvestmentServiceSelected(service) {
    this.investmentServiceSelected = service;
    if (service.id === '001') {
      this.set('investmentFundProductIdSelected', 'COME');
      service.additionalInformation[0].value = this.t('funds-hiring-investment-service-subtitle-description-1-selected');
    }
    if (service.id === '002') {
      this.set('investmentFundProductIdSelected', 'EJOP');
      service.additionalInformation[0].value = this.t('funds-hiring-investment-service-subtitle-description-2-selected');
    }
    this.confirmInvestmentServiceSelected(service);
    this.setTermsAndConditionsPDF();
    this.setCheckListTerms();
    this._dispatchEvents('set-investment-service-selected', service);
  }

  /**
   * @Desc identify type of service to show checkbox
   */
  setCheckListTerms() {
    let checkboxList = [{
      valid: false,
      active: true,
      buttonText: 'funds-hiring-checklist-contract-one'
    },
    {
      valid: false,
      active: true,
      buttonText: 'funds-hiring-checklist-contract-two'
    },
    {
      valid: false,
      active: true,
      buttonText: 'funds-hiring-checklist-contract-three'
    },
    {
      valid: false,
      active: true,
      buttonText: 'funds-hiring-checklist-contract-four',
      preaccepted: true,
      preacceptedInfoText: 'funds-hiring-checklist-contract-preaccepted-message',
      className: 'no-padding help'
    }];
    let checkBoxBew = {
      valid: false,
      active: true,
      buttonText: 'funds-hiring-checklist-contract-exacution-service'
    };
    if (this.investmentFundProductIdSelected === 'EJOP') {
      checkboxList.splice(0, 0, checkBoxBew);
    }
    this._dispatchEvents('list-checkbox-terms-and-conditions', checkboxList);
  }
  /**
   * @desc Method Get investment fund list
   * @event get-investment-funds-list
   */
  getInvestmentFundList() {
    let params = {
      investmentFundProductId: this.investmentFundProductIdSelected
    };
    this._dispatchEvents('get-investment-funds-list', params);
  }

  cancelServiceSelected() {
    this._dispatchEvents('return-step-service', {
      currentStep: 3
    });
  }

  confirmInvestmentServiceSelected(service) {
    let serviceModal = {};
    if (service.id === '001') {
      serviceModal = {
        values: [{
          title: this.t('funds-hiring-investment-service-subtitle-1'),
          class: 'simple-title'
        },
        {
          title: this.t('funds-hiring-investment-service-subtitle-description-1-selected-subtitle'),
          class: 'cells-lists-with-text-left spacing text-styles-ml'
        },
        {
          list: [
            this.t('funds-hiring-generalized-recommendations-one'),
            this.t('funds-hiring-generalized-recommendations-two'),
            this.t('funds-hiring-generalized-recommendations-three')
          ],
          class: 'cells-lists-with-text-left text-styles-ml'
        }]
      };
    }
    if (service.id === '002') {
      serviceModal = {
        values: [{
          title: this.t('funds-hiring-investment-service-subtitle-description-2-selected'),
          class: 'simple-title'
        },
        {
          title: this.t('funds-hiring-investment-service-subtitle-description-2-selected-subtitle'),
          class: 'cells-lists-with-text-left spacing text-styles-ml'
        },
        {
          list: [
            this.t('funds-hiring-financial-products-one'),
            this.t('funds-hiring-financial-products-two'),
            this.t('funds-hiring-financial-products-three')
          ],
          class: 'cells-lists-with-text-left spacing text-styles-ml'
        },
        {
          icon: 'coronita:info',
          iconClass: 'icon-size-24',
          class: 'text-styles-ml',
          message: this.t('funds-hiring-experienced-investors'),
          type: 'info'
        }]
      };

    }

    let modalService = {
      code: 'SERVIVCEINFO',
      primaryButtonClass: 'secondary',
      selectedConfig: {
        className: 'header--white investment-service',
        heroImage: './images/fundsHiring/Info.svg',
        openMaximized: true,
        cancelFromHeaderEvent: 'cancel',
        title: this.t('funds-hiring-investment-service-modal-title'),
        acceptBtLabel: this.t('funds-hiring-modal-change-service-alert-acept'),
        cancelBtLabel: this.t('funds-hiring-modal-change-service-alert-back'),
        template: {
          type: 'paragraphs',
          values: [
            ...serviceModal.values
          ]
        }
      }
    };
    this._dispatchEvents('open-diy-info-modal', modalService);

  }

  modalSimulationHelp() {
    let modalSimulationHelp = {
      code: 'DIY-MODAL-INFO-SIMULATION-HELP',
      selectedConfig: {
        className: 'paragraphs__list header--white info',
        openMaximized: true,
        title: this.t('funds-hiring-investment-amount'),
        acceptBtLabel: 'info-UNDERSTAND-accept',
        template: {
          type: 'paragraphs',
          values: [{
            icon: 'coronita:help',
            iconClass: 'dark-core-blue icon-size-24',
            class: 'text-center margin-top-none'
          },
          {
            title: this.t('funds-hiring-title-calculation'),
            class: 'simple-title spacing--xs text-center'
          },
          {
            text: this.t('funds-hiring-title-values'),
            class: 'spacing--xs text-gray-ml'
          },
          {
            title: 'Serie',
            class: 'simple-title spacing--xs text-center'
          },
          {
            text: this.t('funds-hiring-investor-series'),
            class: 'spacing--xs text-gray-ml'
          }
          ]
        }
      }
    };
    this._dispatchEvents('open-diy-info-modal', modalSimulationHelp);
  }

  /**
   * @desc Method for set data from investment list fund
   * @param {Array} data
   */
  setResponseListFunds(data) {
    this.appSettingsFundsCatalog(this.dataFunds);
    let listFunds = this._parseListFunds(data);
    this.set('visibleFundsMx', listFunds);
  }

  /**
   * @desc Method for error on get funds list
   * @param {Object} detail
   */
  errorOnGetFundList(detail) {
    if (detail.messages[0].message.includes('QCE0014')) {
      let modalErrorListFund = {
        code: 'GENERIC-ERROR',
        primaryButtonClass: 'primary',
        selectedConfig: {
          className: 'full-height-info header--white-light-grey header--white-call-me-back',
          heroImage: './images/Clock_funds.svg',
          openMaximized: true,
          title: 'cells-funds-hiring-modal-list-funds-error-title',
          acceptBtLabel: 'cells-funds-hiring-modal-list-funds-error-button-text',
          template: {
            type: 'paragraphs',
            values: [
              { title: 'cells-funds-hiring-modal-list-funds-error-subtitle', class: 'simple-title margin-bottom-s' },
              { text: 'cells-funds-hiring-modal-list-funds-error-text', class: 'text-styles-ml' }
            ]
          }
        }
      };
      this._dispatchEvents('open-diy-info-modal', modalErrorListFund);
    } else {
      this._showModalNotAvailableFunds(true);
    }
  }

  /**
   * @desc Error on get fund detail
   */
  errorGetDetailFunds() {
    this._showModalNotAvailableFunds(false);
  }

  /**
   * @desc Error method in the list of available funds
   */
  _showModalNotAvailableFunds(detail) {
    let modalErrorFundsAvailable = {
      code: 'NOTAVAILABLE-FUNDS',
      primaryButtonClass: 'primary',
      selectedConfig: {
        className: 'full-height-info header--white-light-grey header--white-call-me-back',
        heroImage: './images/Clock_funds.svg',
        openMaximized: true,
        title: detail ? 'cells-funds-hiring-modal-funds-available-error-title' : 'cells-funds-hiring-modal-fund-available-error-title',
        acceptBtLabel: 'cells-funds-hiring-modal-funds-available-error-button-text',
        template: {
          type: 'paragraphs',
          values: [
            { title: detail ? 'cells-funds-hiring-modal-funds-available-error-subtitle' : 'cells-funds-hiring-modal-fund-available-error-subtitle', class: 'simple-title margin-bottom-s' },
            { text: detail ? 'cells-funds-hiring-modal-funds-available-error-text' : 'cells-funds-hiring-modal-fund-available-error-text', class: 'text-styles-ml' }
          ]
        }
      }
    };
    this._dispatchEvents('open-diy-info-modal', modalErrorFundsAvailable);
  }

  /**
   * @desc Method to get fund data from app-settings
   * @param {Array} dataFunds
   */
  appSettingsFundsCatalog(dataFunds) {
    this.finalFundsCatalog = (dataFunds && dataFunds.length > 0) ? dataFunds : this.minFundsAmounts;
  }

  /**
   * @desc Method for parsed list funds
   * @param {Array} fundsList
   */
  _parseListFunds(fundsList = []) {
    if (!fundsList.length) {
      return [];
    }
    let parsedList = [];
    fundsList.forEach(element => {
      const fundMoreInfo = this.finalFundsCatalog.find(fund => fund.id === parseInt(element.id));
      if (fundMoreInfo) {
        const basicFundData = {
          name: (element.description) ? `${element.name} - ${element.description}` : element.name,
          productType: 'FUNDS',
          profitabilityRiskScale: element.profitabilityRiskScale.id,
          fundImportance: (element.fundImportance) ? parseInt(element.fundImportance.id) : 9999,
          investmentHorizon: (element.investmentHorizon) ? element.investmentHorizon.id : '',
          fundType: (element.fundType) ? element.fundType.id : '',
          experienceLevelRequired: element.experienceLevelRequired,
          additionalInformation: [ {
            key: 'Liquidez',
            value: (element.liquidity) ? this._getLiquidityLabel(element.liquidity.id.toLowerCase()) : '',
            className: 'item__label text-right'
          } ],
          additionalLink: {
            text: 'cells-step-funds-hiring-fund-selection-additional-link-text',
            className: 'item__label text-right',
            detail: {
              name: (element.description) ? `${element.name} - ${element.description}` : element.name,
              fundId: element.id,
              fundKey: element.name,
              description: element.description,
              minAmount: fundMoreInfo.minAmount,
              DICIURL: `https://portal.bbva.mx/siabinternet/Repositorio/import/doctos/analisis/${fundMoreInfo.DICIId.padStart(8, 0)}.pdf`,
              prospectURL: `https://portal.bbva.mx/siabinternet/Repositorio/import/doctos/analisis/${fundMoreInfo.prospectId.padStart(8, 0)}.pdf`,
            }
          }
        };
        parsedList.push(basicFundData);
      }
    }, {});
    parsedList.sort((a, b) => a.fundImportance - b.fundImportance);
    return parsedList;
  }

  /**
   * @desc Method for get liquidity label for list funds
   * @param {String} liquidity
   */
  _getLiquidityLabel(liquidity) {
    if (liquidity === 'mismo dia') {
      liquidity = 'mismo día';
    }
    return liquidity.charAt(0).toUpperCase() + liquidity.slice(1);
  }

  _validateInTimeSimulation(enterAmount) {
    if (enterAmount.amount) {
      if (this.dataFundSimulate.isOperationSchedule) {
        this.inTime = true;
        if (this.dataFundSimulate.positionSize.quantity !== 0) {
          this._instantLiquidity = true;
          this.requestSimulationFund(this.fundSelected);
        } else {
          this._instantLiquidity = false;
          this._dispatchEvents('set-amount-collapsed-simulator-out-of-time', {
            ...enterAmount,
            notEnoughAmount: true
          });
          this.sendInfoSummary(enterAmount);
        }
      } else {
        this.inTime = false;
        this._dispatchEvents('set-amount-collapsed-simulator-out-of-time', {
          ...enterAmount,
          notEnoughAmount: true
        });
        this.amountMessageSimulator();
        this.sendInfoSummary(enterAmount);
      }
    }
  }
  /**
   * @desc Send information in cells-step-simulation-operation when the operation is out of time
   * @param {Object} message
   */
  amountMessageSimulator() {
    let amountOutTime = {
      availableCurrenciesInfo: this.t('funds-hiring-final-amount'),
      _showDestinationCurrencyMessage: true
    };
    this._dispatchEvents('set-amount-collapsed-simulator-out-of-time-message', amountOutTime);
  }

  /**
   * @desc Method for send funds list
   * @event request-post-fund-simulate
   */
  _dataFundsMx(visibleFundsMx) {
    this._dispatchEvents('set-fund-step-description', '');

    //Delay for rerender styles in iOS
    setTimeout(() => {
      this._dispatchEvents('set-fund-step-description', 'funds-hiring-product-step-funds-selector-main-description');
      this._dispatchEvents('products-parsed-funds', visibleFundsMx);
    }, 100);
  }

  /**
   * @desc Method for request simulation fund
   * @param {Object} detail
   * @event request-post-fund-simulate
   */
  requestSimulationFund(detail) {
    this.set('detailsAndPerformance', detail.additionalLink ? detail.additionalLink.detail : {
      ...detail,
      show: true
    });
    let params = {
      body: {
        title: {
          id: this.detailsAndPerformance.fundId
        },
        relatedContract: {
          number: this.accountSelected.id,
          numberType: {
            id: 'CCC'
          }
        },
        positionSize: {
          positionType: {
            id: 'AMOUNT'
          },
          positionAmount: {
            amount: this.enterAmountSimulation.amount ? this.enterAmountSimulation.amount : this.detailsAndPerformance.minAmount,
            currency: 'MXN'
          }
        }
      }
    };
    this._dispatchEvents('request-post-fund-simulate', params);
  }

  /**
   * @desc Method for set data from service simulate fund
   * @param {Object} data
   */
  setResponseSimulate(data) {
    this.dataFundSimulate = data;
    if (this.detailsAndPerformance.show) {
      this._showModalPerformance();
    }
    if (this.enterAmountSimulation.amount) {
      this.setResponseSimulation(data);
    }
    this._dispatchEvents('close-spinner-simulation');
  }

  /**
   * @desc Method for set data for modal fund detail
   * @event open-modal-performance-and-details
   */
  _showModalPerformance() {
    let dateMoment = this._getDateFormat(this.dataFundSimulate.openingDate);
    let modalParams = {
      fundDetails: {
        name: this.detailsAndPerformance.name,
        description: this.t('funds-hiring-performance-historical'),
        fundId: this.detailsAndPerformance.fundId
      },
      performanceList: [{
        key: this.t('funds-hiring-minimum-amount'),
        value: [ {
          currencyCode: 'MXN',
          amount: parseInt(this.detailsAndPerformance.minAmount),
        } ]
      }, {
        key: this.t('funds-hiring-success-series'),
        value: this.dataFundSimulate.serie
      }, {
        key: this.t('funds-hiring-price-title'),
        value: `al ${dateMoment}`,
        class: 'subtitle'
      }, {
        key: this.t('funds-hiring-price-title'),
        value: [ {
          currencyCode: this.dataFundSimulate.netAssetValue.currency,
          amount: this.dataFundSimulate.netAssetValue.amount,
        } ]
      }, {
        key: this.t('funds-hiring-performance'),
        value: `al ${dateMoment}`,
        class: 'subtitle'
      }, {
        key: this.t('funds-hiring-months-one'),
        value: `${this._getRatesSimulate('MONTHLY')}%`
      }, {
        key: this.t('funds-hiring-months-latest'),
        value: `${this._getRatesSimulate('YEARLY')}%`
      }, {
        key: this.t('funds-hiring-latest-months'),
        value: `${this._getRatesSimulate('BIYEARLY')}%`
      }],
      pdfToShow: [],
      selectedTab: 0,
      performanceIconMessage: {
        type: 'warning',
        icon: 'coronita:info',
        iconLabel: null,
        message: this.t('funds-hiring-past-performance')
      },
    };
    let modalParamsSerieGB = {
      showPerformanceIconMessageSerie: true,
      performanceIconMessageSerie: {
        type: 'info',
        icon: 'coronita:info',
        iconLabel: null,
        message: this.t('funds-hiring-performance-collaborator')
      }
    };
    if (this.dataFundSimulate.serie === 'GB') {
      this._dispatchEvents('data-detail-fund-serie', modalParamsSerieGB);
    }
    this._dispatchEvents('open-modal-performance-and-details', modalParams);
  }

  /**
   * @desc Method for get date format
   * @param {String} date
   */
  _getDateFormat(date) {
    let dateFormat = date.substr(0, 10);
    return dateFormat.replace(/^(\d{4})-(\d{2})-(\d{2})$/g, '$3/$2/$1');
  }

  /**
   * @desc Method for get rates from simulate
   * @param {String} param
   */
  _getRatesSimulate(param) {
    let rate = this.dataFundSimulate.rates.find(rates => rates.rateType.id === param);
    return rate.unit.amount.toFixed(2);
  }

  _setMinValueAccepted(fund) {
    if (fund.additionalLink) {
      this._dispatchEvents('set-simulation-description', '');

      //Delay for rerender styles in iOS
      setTimeout(()=>{
        this._dispatchEvents('set-simulation-description', 'cells-funds-hiring-amount-step-description');
        this._dispatchEvents('set-min-value-accepted', String(this.get('additionalLink.detail.minAmount', fund)));
        this._dispatchEvents('set-max-value-accepted', String(this.get('primaryAmount.amount', this.accountSelected)));
      }, 100);
    }
  }

  /**
   * @desc Method for request fund details
   * @param {Number} detail
   * @event request-fund-detail
   */
  requestFundDetail(detail) {
    if (detail === 1) {
      let performanceName = this.detailsAndPerformance.fundKey.replace(/\+/g, '%2B');
      let params = {
        investmentFundProductId: this.investmentFundProductIdSelected,
        fundId: `?name=${performanceName}&serie=${this.dataFundSimulate.serie}`
      };
      this._dispatchEvents('request-fund-detail', params);
    }
  }

  /**
   * @desc Method for set response from fund detail request
   * @param {Array} data
   * @event data-to-detail-section-modal
   */
  setResponseFundDetail(data) {
    let dataService = data[0];
    this.fundSelectedStartHour = dataService.tradingHours.startHour;
    this.fundSelectedFinalHour = dataService.tradingHours.finalHour;
    let dataModal = {
      detailsList: [{
        key: this.t('funds-hiring-success-description'),
        value: this._getLiquidityLabel(dataService.description.toLowerCase())
      },
      {
        key: this.t('funds-hiring-success-fund-key'),
        value: dataService.name
      },
      {
        key: this.t('funds-hiring-success-type'),
        value: this._getLiquidityLabel(dataService.fundType.id.toLowerCase())
      },
      {
        key: this.t('funds-hiring-success-investment-horizon'),
        value: this._getLiquidityLabel(dataService.investmentHorizon.id.toLowerCase())
      },
      {
        key: this.t('funds-hiring-success-hours-operation'),
        value: `Días hábiles de ${dataService.tradingHours.startHour} a ${dataService.tradingHours.finalHour} h`
      },
      {
        key: this.t('funds-hiring-success-liquidity-increase'),
        value: this._getLiquidityLabel(dataService.liquidity.id.toLowerCase())
      },
      {
        key: ('funds-hiring-success-liquidity-withdraw'),
        value: this._getLiquidityLabel(dataService.liquidity.id.toLowerCase())
      },
      {
        key: this.t('funds-hiring-success-minimum-investment-amount'),
        value: [ {
          currencyCode: dataService.conditions.priceCondition.currency,
          amount: parseInt(this.detailsAndPerformance.minAmount),
        } ]
      },
      {
        key: this.t('funds-hiring-success-denomination-currency'),
        value: this.t('funds-hiring-success-mexican-peso')
      }
      ],
      pdfToShow: [ {
        icon: 'coronita:pdf',
        text: this.t('funds-hiring-success-apffm-dici'),
        id: this.detailsAndPerformance.DICIURL,
        selectable: true
      } ]
    };
    this._dispatchEvents('data-to-detail-section-modal', dataModal);
  }

  /**
   * @desc Method for search and send data fund to product selector
   * @param {Object} eventName
   * @event data-fund-modal-detail
   */
  selectFundFromModalDetail(eventName) {
    const changeTypeEvent = 'on-change-product-selected';
    let dataFundModal = this.visibleFundsMx.find(fund => fund.additionalLink.detail.fundId === eventName.fundId);
    this._dispatchEvents('change-ignore-dispatch', changeTypeEvent);
    this._dispatchEvents('data-fund-modal-detail', dataFundModal);
  }


  setResponseSimulation(simulationResponse) {
    const simulationAmount = simulationResponse.positionSize.positionAmount.amount > this.enterAmountSimulation.amount ? this.enterAmountSimulation.amount : simulationResponse.positionSize.positionAmount.amount;
    const buttonsSimulator = {
      buttons: {
        primary: {
          class: 'secondary',
          text: 'funds-hiring-simulation-operation-success-button-continue'
        },
        secondary: {
          class: 'link',
          text: 'funds-hiring-simulation-operation-success-button-change-import'
        }
      }
    };
    this._dispatchEvents('manage-buttons-simulator', buttonsSimulator);

    const simulationDetail = [{
      key: 'funds-hiring-simulation-operation-investment-amount',
      value: {
        amount: simulationAmount,
        currencyCode: simulationResponse.positionSize.positionAmount.currency
      }
    },
    {
      key: 'funds-hiring-simulation-operation-shares-price',
      value: {
        amount: simulationResponse.netAssetValue.amount,
        currencyCode: simulationResponse.netAssetValue.currency
      }
    },
    {
      key: 'funds-hiring-simulation-operation-numbres-of-shares',
      value: String(simulationResponse.positionSize.quantity)
    },
    {
      key: 'funds-hiring-simulation-operation-investment-serie',
      value: simulationResponse.serie
    }
    ];
    this._dispatchEvents('set-simulation-created', simulationDetail);
    this._dispatchEvents('set-amount-collapsed-simulator', { value: simulationAmount });
    this.sendInfoSummary({ amount: simulationAmount });
  }

  sendInfoSummary(amount) {
    let amountStickyValue = {
      amount: {
        amount: amount.amount,
        currency: 'MXN'
      }
    };
    this._dispatchEvents('send-step-amount-sticky-value', amountStickyValue);
  }

  /**
   * @desc reset the "input amount step" view when the change button is pressed
   * @event reset-step-amount-view
   */
  showInputAmountView() {
    this._dispatchEvents('reset-step-amount-view', {
      showInput: true
    });
  }

  showIconMessageAlert(hidden) {
    if (!this.inTime) {
      this._dispatchEvents('show-last-icon-message-out-of-time-event', !hidden);
    }
    this._dispatchEvents('show-last-icon-message-event', !hidden);
  }

  /**
   * @desc method that send request for fund contracted
   * @event request-contract-fund
   */
  contracFundRequest() {
    let requestPayload = {
      body: {
        funds: [ {
          name: this.dataFundSimulate.title.id,
          series: this.dataFundSimulate.serie
        } ],
        positionSize: {
          positionAmount: {
            amount: this.enterAmountSimulation.amount,
            currency: 'MXN'
          }
        },
        productClassification: {
          id: '20',
          productType: {
            id: this.investmentFundProductIdSelected
          },
          subproductType: {
            id: 'MBINVEST'
          }
        },
        relatedContract: {
          number: this.accountSelected.number,
          relationType: {
            id: 'PAYING_ACCOUNT'
          }
        },
        simulationOperationNumber: this.dataFundSimulate.operationTracking.operationNumber,
        title: {
          id: '20'
        }
      }
    };
    if (!(this._instantLiquidity && this.inTime) && (!this.fundSelectedStartHour || !this.fundSelectedFinalHour)) {
      this.requestFundDetail(1);
    }
    this._dispatchEvents('request-contract-fund', requestPayload);
  }

  /**
   * @desc method that parse and send data for hiring review
   * @event review-hiring-data
   * @param {Object} payload
   */
  successHiring(payload) {
    let conditions = this._getSuccessOrError(payload);
    if (conditions) {
      const screenGreen = this._instantLiquidity && this.inTime ? true : false;
      const classReceipt = screenGreen ? 'success' : 'process';
      const isCome = this._getServiceSelectedToShow();
      let dataReview = {
        sections: [{
          name: 'header',
          class: classReceipt
        },
        {
          name: 'middle',
          class: classReceipt
        },
        {
          name: 'main'
        },
        {
          name: 'footer'
        }
        ],
        items: {
          header: this._parseHeaderReceiptSection(screenGreen, payload),
          middle: [ {
            image: {
              text: './images/Recibo.svg',
              class: '',
            },
            class: 'rounded',
          } ],
          main: [{
            value: [{
              text: this.accountSelected.name,
              class: 'title',
            },
            {
              text: this.accountSelected.number,
              masked: true,
              maskChars: '•',
              visibleChars: 4,
              class: 'italic',
            }],
            class: 'spacing-top spacing-lg-bottom',
          },
          {
            key: 'cells-funds-hiring-title-operation',
            value: {
              text: 'cells-funds-hiring-title-operation-text',
              class: 'medium',
            },
            class: 'spacing-lg-bottom',
          },
          {
            key: this.t('funds-hiring-success-investment-service'),
            value: [{
              text: isCome ? 'funds-hiring-success-little-experience' : 'funds-hiring-success-invest-fund',
              class: 'medium',
            },
            {
              text: isCome ? 'cells-funds-hiring-investment-service-commercialization' : 'cells-funds-hiring-investment-service-ejecution',
              class: '',
            },
            ],
            class: 'spacing-lg-bottom e2e-selector-investment-service',
          },
          {
            key: this.t('funds-hiring-success-fund-name'),
            value: {
              text: this.detailsAndPerformance.description,
              class: 'medium',
            },
            class: 'spacing-lg-bottom e2e-selector-fund-name',
          },
          {
            key: this.t('funds-hiring-success-fund-key'),
            value: {
              text: this.detailsAndPerformance.fundKey,
              class: 'medium',
            },
            class: 'spacing-lg-bottom e2e-selector-fund',
          },
          {
            key: this.t('funds-hiring-success-liquidity'),
            value: {
              text: this.c(this.fundSelected, 'additionalInformation.0.value'),
              class: 'medium',
            },
            class: 'spacing-lg-bottom e2e-selector-liquidity',
          },
          {
            key: this.t('funds-hiring-success-series'),
            value: {
              text: this.dataFundSimulate.serie,
              class: 'medium',
            },
            class: 'spacing-lg-bottom e2e-selector-series',
          },
          {
            key: this.t('funds-hiring-success-account-status'),
            value: [
              'Domicilio',
              {
                text: this.mainAddress,
                class: 'italic medium',
              },
            ],
            class: 'spacing-lg-bottom e2e-selector-account-status',
          },
          {
            id: 'folioId',
            key: this.t('funds-hiring-success-operattion-folio'),
            value: {
              text: this._getOperationNumber(payload),
              class: 'medium',
            },
            class: 'spacing-lg-bottom e2e-selector-folio',
          },
          {
            type: screenGreen ? 'info' : 'warning',
            icon: 'coronita:info',
            message: this._getIconMessagetext(screenGreen),
            class: 'spacing-lg-bottom',
          },
          {
            key: this.t('funds-hiring-success-ticket'),
            value: {
              text: this.mainEmailShow,
              class: 'italic medium spacing-sm-top e2e-selector-email',
            },
          },
          {
            operations: [ {
              label: this.t('funds-hiring-success-share'),
              id: '1',
              icon: 'coronita:share',
              height: 1633,
              share: true,
              download: false
            } ],
            gridColumns: 1,
            layout: 'grid',
            event: 'share-event'
          }],
          footer: [ {
            button: {
              text: 'Salir',
              class: 'primary',
            },
            event: 'navigate-to-dashboard',
            class: 'spacing-lg',
          } ]
        }
      };
      let contractNumber = {
        key: 'cells-funds-hiring-contract-number-title',
        value: {
          text: payload.relatedContract ? payload.relatedContract.number : '',
          class: 'medium',
        },
        class: 'spacing-lg-bottom',
      };
      if (payload && payload.relatedContract) {
        dataReview.items.main.splice(2, 0, contractNumber);
      }

      this._getColorHeaderReview(screenGreen);
      this._sendGlobalReceipt({
        payload,
        screenGreen,
        isCome,
        operationNumber: this._getOperationNumber(payload),
        iconMessage: this._getIconMessagetext(screenGreen)
      });
      this._dispatchEvents('review-hiring-data', dataReview);
      this._dispatchEvents('rating-funds-hiring', {
        view: 'fundsHiring',
        value: true
      });
      this._sendNotificationsFunds(dataReview);
    } else {
      this.errorContractFunds();
    }
    this._dispatchEvents('hide-spinner-fund-contracted');
  }

  /**
   * @Desc send config object for global receipt
   * @param {Object} data
   */
  _sendGlobalReceipt(config) {
    const {payload, screenGreen, isCome, operationNumber, iconMessage} = config;
    const title = `cells-funds-hiring-${screenGreen ? 'success' : 'in-process'}-screen-title`;
    const date = this.c(payload, 'operationTracking.operationDate', new Date());

    let globalReceipt = {
      templateSelected: 'investmentFunds',
      date: date,
      dateClass: 'bold cursive',
      title: title,
      receiptTitle: this.t(title).toUpperCase(),
      amountLabel: 'cells-funds-hiring-investment-amount-title',
      chargeAmount: {
        amount: this.c(payload, 'positionSize.positionAmount.amount', this.enterAmountSimulation.amount),
        currency: this.c(payload, 'positionSize.positionAmount.currency', this.enterAmountSimulation.currency),
        class: 'amount-huge-decimals'
      },
      taxes: {
        amounts: screenGreen ? [
          {
            key: 'cells-funds-withdrawal-sale-info-net-asset-value-text',
            amount: this.c(this.dataFundSimulate, 'netAssetValue.amount', ''),
            currency: 'MXN'
          },
          {
            key: 'cells-funds-withdrawal-sale-info-total-shares-text',
            amount: this.c(this.dataFundSimulate, 'positionSize.quantity'),
            showAllDecimals: true
          }
        ] : []
      },
      topInfo: [
        {
          key: this.accountSelected.name,
          musk: {
            value: this.accountSelected.number,
            chars: 5,
            simbol: '•'
          },
          class: 'bold-key cursive-value',
        }
      ],
      additionalInfo: [
        {
          key: 'cells-share-operative-receipt-funds-operation-type',
          value: 'cells-funds-hiring-title-operation-text',
          class: 'spacing bold',
        },
        ...(payload.relatedContract ? [
          {
            key: 'cells-share-operative-receipt-funds-contract-number',
            value: this.c(payload, 'relatedContract.number'),
            class: 'spacing bold',
          }
        ] : []),
        {
          key: 'cells-share-operative-receipt-funds-investment-service',
          value: isCome ? 'funds-hiring-success-little-experience' : 'funds-hiring-success-invest-fund',
          class: 'bold e2e-selector-investment-service',
        },
        {
          value: `cells-funds-hiring-investment-service-${isCome ? 'commercialization' : 'ejecution'}`,
          class: 'spacing',
        },
        {
          key: 'cells-share-operative-receipt-funds-fund-name',
          value: this.detailsAndPerformance.description,
          class: 'spacing bold e2e-selector-fund-name',
        },
        {
          key: 'cells-share-operative-receipt-funds-fund-key',
          value: this.detailsAndPerformance.fundKey,
          class: 'spacing bold e2e-selector-fund',
        },
        {
          key: 'cells-share-operative-receipt-funds-liquidity',
          value: this.c(this.fundSelected, 'additionalInformation.0.value'),
          class: 'spacing bold e2e-selector-liquidity',
        },
        {
          key: 'cells-share-operative-receipt-funds-serial',
          value: this.dataFundSimulate.serie,
          class: 'spacing bold e2e-selector-series',
        },
        {
          key: 'funds-hiring-success-account-status',
          value: 'Domicilio',
          class: 'bold',
        },
        {
          value: this.mainAddress,
          class: 'spacing e2e-selector-account-status'
        },
        {
          id: 'folioId',
          key: 'cells-share-operative-receipt-funds-operation-folio',
          value: operationNumber,
          class: 'bold e2e-selector-folio',
        },
        {
          value: this.t('funds-hiring-success-bbva'),
          class: 'spacing bold e2e-selector-series',
        },
        {
          message: {
            type: screenGreen ? 'info' : 'warning',
            icon: 'coronita:info',
            text: iconMessage
          },
          class: 'spacing'
        },
        {
          key: this.t('funds-hiring-success-ticket'),
          value: this.mainEmailShow,
          class: 'spacing bold'
        }
      ],
      onlyOneAvatar: true,
      destination: {
        product: {id: 'ACCOUNTS', name: this.c(this.accountSelected, '0.name')},
        number: this.c(this.accountSelected, '0.number'),
        avatar: {src: './images/Recibo.svg'}
      },
      operations: [
        {
          label: 'funds-hiring-success-share',
          id: 'share',
          icon: 'coronita:share',
          operative: 'investmentFunds'
        }
      ],
      buttons: {
        primary: {
          text: 'funds-hiring-success-exit-label',
          action: 'go-to-next'
        },
        secondary: {
          hidden: true
        }
      }
    };

    this._dispatchEvents('review-hiring-data-result', {
      type: screenGreen ? '' : 'core',
      result: globalReceipt,
      localCurrency: 'MXN'
    });
  }

  /**
   * @Desc send notification successful hiring email
   * @param {Object} data
   */
  _sendNotificationsFunds(data) {
    const serviceType = 'COME';
    let textTypeService = '';
    let customerName;
    let date = this._formatDate(data.items.header[0].value.text, 'date');
    let time = this._formatDate(data.items.header[0].value.text, 'time');
    let customerId = this.globalCacheStorage ? this.globalCacheStorage.customer.customerId : this.globalUser.customerId;
    if (this.globalCacheStorage) {
      customerName = this.globalCacheStorage.customer.firstName.concat(' ', this.globalCacheStorage.customer.lastName, ' ', this.globalCacheStorage.customer.secondLastName);
    } else {
      customerName = this.globalUser.firstName.concat(' ', this.c(this.globalUser, 'customer.lastName'), ' ', this.c(this.globalUser, 'secondLastName'));
    }
    if (this.investmentFundProductIdSelected === serviceType) {
      textTypeService = this.t('funds-hiring-notifications-send-come');
    } else {
      textTypeService = this.t('funds-hiring-notifications-send-exacute');
    }
    let body = {
      body: {
        'eventCode': 'A000000374',
        'senderId': '0000000001',
        'message': {
          /* eslint-disable-next-line */
          'messageBody': `{\'sNOMBRE\': \'${customerName}\', \'sCONTRATO\':\'${data.items.main[2].value.text}\',\'sSERVICIO\' : \'${textTypeService}\',\'sCUENTA\' : \'${data.items.main[0].value[1].text}\',\'sTIPOOPERACION\':\'Contrataci&oacute;n\',\'sFECHA\':\'${date}\',\'sHORA\':\'${time}\',\'sFOLIO\' : \'${data.items.main[9].value.text}\'}`
        }
      },
      urlParams: {
        'customer-id=': customerId
      }

    };
    this._dispatchEvents('post-notifications', body);
  }
  /**
   * @desc method for parse header receipt section
   * @param {Boolean} screenBlue
   * @param {Object} payload
   */
  _parseHeaderReceiptSection(screenGreen, payload) {
    let headerTitle = screenGreen ? 'success' : 'in-process';
    let header = [{
      key: {
        text: `cells-funds-hiring-${headerTitle}-screen-title`,
        class: 'title'
      },
      value: {
        text: payload.operationTracking ? payload.operationTracking.operationDate : new Date(),
        formatDate: 'D MMMM YYYY, HH:mm:ss [h]',
      },
      class: 'spacing-top',
    },
    {
      key: {
        text: 'cells-funds-hiring-investment-amount-title'
      },
      value: {
        amount: this.c(payload, 'positionSize.positionAmount.amount', this.enterAmountSimulation.amount),
        currencyCode: 'MXN',
        localCurrency: 'MXN',
        language: 'es-mx',
        class: 'amount-huge-decimals',
      },
      class: 'spacing-top spacing-lg-bottom',
    }];
    let adicionalInfo = [{
      key: 'cells-funds-withdrawal-sale-info-net-asset-value-text',
      value: {
        amount: this.c(this.dataFundSimulate, 'netAssetValue.amount', ''),
        currencyCode: 'MXN',
        localCurrency: 'MXN',
        language: 'es-mx',
        showAllDecimals: true
      },
      class: 'inline spacing-sm-bottom',
    },
    {
      key: 'cells-funds-withdrawal-sale-info-total-shares-text',
      value: this.c(this.dataFundSimulate, 'positionSize.quantity'),
      class: 'inline spacing-lg-bottom',
    }];
    if (screenGreen) {
      header = header.concat(adicionalInfo);
    }
    return header;
  }

  /**
   * @desc The operation number get
   * @param {String} operation
   */
  _getOperationNumber(operation) {
    return this.c(operation, 'operationTracking.operationNumber') || this.c(operation, 'messages.0.message', '').split(' ')[1].substr(0, 15);
  }

  /**
   * @desc Success or error get
   * @param {String} operation
   */
  _getSuccessOrError(payload) {
    return (payload.investmentFundId || payload && payload.status === 400 && payload.messages && payload.messages[0].message.includes('QGE1011')) ? true : false;
  }

  /**
   * @desc The service selected get
   * @param {String} operation
   */
  _getServiceSelectedToShow() {
    return this.investmentFundProductIdSelected === 'COME' ? true : false;
  }

  /**
   * @desc The color header review page get
   * @param {String} operation
   * @event set-color-header-success
   * @event set-color-header-success-ios
   */
  _getColorHeaderReview(screenGreen) {
    let colorHeader = {
      className: screenGreen ? 'header--dark-success' : 'header--core'
    };
    let colorHeaderIOS = {
      extraHeaderClass: screenGreen ? 'darker-green-bg' : 'bbva-core-blue'
    };
    this._dispatchEvents('set-color-header-success', colorHeader);
    this._dispatchEvents('set-color-header-success-ios', colorHeaderIOS);
  }

  /**
   * @Desc Fire an event after [delay]ms
   */
  _delayEvent(evName, detail = {}, delay = 100) {
    setTimeout(()=>{
      this._dispatchEvents(evName, detail);
    }, delay);
  }

  /**
   * @Desc Value reset step
   */
  resetStepProp(detail) {
    let {currentStep} = detail;
    if (currentStep === 7) {
      //Delay for rerender styles in iOS
      this._dispatchEvents('set-checklist-header', '');
      this._delayEvent('set-checklist-header', 'funds-hiring-checklist-contract-description');
    } else if (currentStep === 4 || currentStep === 5) {
      let fundReplica = this.fundSelected;
      this.fundSelected = {};
      this.fundSelected = fundReplica;
    }
  }
  /**
   * @desc The icon message text get
   * @param {String} operation
   */
  _getIconMessagetext(screenGreen) {
    return screenGreen ? 'cells-funds-hiring-icon-message-in-time' : this._setInfoMessageScreenBlue();
  }

  /**
   * @desc Method for set data for info message
   */
  _setInfoMessageScreenBlue() {
    let infoLocal = { beginningOfOperations: this.fundSelectedStartHour, endOfOperations: this.fundSelectedFinalHour };
    return this.t('cells-funds-hiring-notification-message-success-process-confirmation-out-of-time-or-different-liquidity', '', infoLocal);
  }

  /**
   * @desc Receive all disapatch events
   * @param {String} eventName
   * @param {Object} detail
   */
  _dispatchEvents(eventName, detail = {}) {
    this.dispatchEvent(new CustomEvent(eventName, {
      bubbles: true,
      composed: true,
      detail: detail
    }));
  }

  /**
   * @desc Dispatch the event types of funds to filter
   * @param {Object} payloadFund
   */
  filterFound(payloadFund) {
    const optionModal = 'option';
    const changeTypeEvent = 'on-change-product-selected-change';
    if (this.investmentServiceSelected.id === '002') {
      this.set('fundsAll', payloadFund);
      this.set('selectedTypeFound', optionModal);
      this._dispatchEvents('disable-button-modal', false);
      this.payloadSelectedTypeFund.selectedConfig = { title: this.t('funds-hiring-modal-title') };
      this._dispatchEvents('fund-disabale-event', changeTypeEvent);
      this._dispatchEvents('fund-type-filter', this.payloadSelectedTypeFund);
    } else {
      this._dispatchEvents('show-all-products', this.visibleFundsMx);
    }
  }

  /**
   * @desc Event that filters the selectd fund type
   * @param {Object} selectedFilter
   */
  filterTypeFound(selectedFilter = {}) {
    let typeFund = '';
    let payloadFilterTypeFunds = [];
    let positionInsertPayload = 0;
    if (selectedFilter.name === this.payloadSelectedTypeFund[0].name) {
      this.set('selectedTypeFound', 'debt');
      payloadFilterTypeFunds = this.visibleFundsMx.filter(i => i.fundType.includes('DEUDA'));
      this._dispatchEvents('filterAllFunds', payloadFilterTypeFunds);
    }
    if (selectedFilter.name === this.payloadSelectedTypeFund[1].name) {
      this.set('selectedTypeFound', 'rent');
      const variableIncome = 'RENTA VARIABLE';
      const variableIncomeNote = 'NOTA ESTRUCTURADA';
      for (let n = 0; n < this.visibleFundsMx.length; n++) {
        if ((this.visibleFundsMx[n].investmentHorizon === this.termTypeTexts[1].term || this.visibleFundsMx[n].investmentHorizon === this.termTypeTexts[2].term) && this.filterFundTypeSelected(n, variableIncome) || this.filterFundTypeSelected(n, variableIncomeNote)) {
          payloadFilterTypeFunds[positionInsertPayload] = this.visibleFundsMx[n];
          positionInsertPayload++;
        }
      }
      this._dispatchEvents('filter-funds-selected-variable', payloadFilterTypeFunds);
    }
    if (selectedFilter.name === this.payloadSelectedTypeFund[2].name) {
      const typesMultistrategyFunds = [{typeFund: 'MERCADO ESTRATEGIA'},
        {typeFund: 'GENERACION FLUJOS'},
        {typeFund: 'PRESERVACION CAPITAL'},
        {typeFund: 'CRECIMIENTO'}];
      this.set('selectedTypeFound', 'multi');
      typesMultistrategyFunds.forEach(typefund => {
        for (let n = 0; n < this.visibleFundsMx.length; n++) {
          if (this.filterFundTypeSelected(n, typefund.typeFund)) {
            payloadFilterTypeFunds[positionInsertPayload] = this.visibleFundsMx[n];
            positionInsertPayload++;
          }
        }
      });
      this._dispatchEvents('filter-funds-selected-multi', payloadFilterTypeFunds);
    }
  }

  /**
   * @desc Event that identifies the debt fund in the selected term
   * @param {Object} contactFilter
   */
  contactSelectedFound(contactFilter) {
    let payloadFilterTypeFunds = [];
    let positionInsertPayload = 0;
    if (contactFilter.contact === this.termTypeTexts[0].text) {
      this.selectedTermFilter(payloadFilterTypeFunds, positionInsertPayload, this.termTypeTexts[0].term, this.termTypeTexts[0].typeFund);
    } else if (contactFilter.contact === this.termTypeTexts[1].text) {
      this.selectedTermFilter(payloadFilterTypeFunds, positionInsertPayload, this.termTypeTexts[1].term, this.termTypeTexts[1].typeFund);
    } else {
      this.selectedTermFilter(payloadFilterTypeFunds, positionInsertPayload, this.termTypeTexts[2].term, this.termTypeTexts[2].typeFund);
    }
    this.selectedFundTypes(payloadFilterTypeFunds);
  }

  /**
   * @desc event that filters  the fund according to the selected term
   * @param {Object} payloadFilterTypeFunds
   * @param {Number} positionInsertPayload
   * @param {String} term
   * @param {String} typeFund
   * @param {Array} multistrategyTerms
   */
  selectedTermFilter(payloadFilterTypeFunds, positionInsertPayload, term, typeFund, multistrategyTerms = []) {
    for (let filteredObjectPosition = 0; filteredObjectPosition < this.visibleFundsMx.length; filteredObjectPosition++) {
      if (this.visibleFundsMx[filteredObjectPosition].fundType.includes('DEUDA') && (this.visibleFundsMx[filteredObjectPosition].investmentHorizon || {}) === term) {
        payloadFilterTypeFunds[positionInsertPayload] = this.visibleFundsMx[filteredObjectPosition];
        positionInsertPayload++;
      }
    }
    return payloadFilterTypeFunds;
  }

  /**
   * @desc event that restarts the flag to close modals
   */
  ignoreEventCloseModal() {
    const changeTypeEvent = 'on-change-product-selected';
    this._dispatchEvents('disable-event-modal-' + this.selectedTypeFound, changeTypeEvent);
  }
  /**
   * @desc Do not let the fund selector step collapse when close a modal
   */
  productSelectedFromModal(fund) {
    if (!fund.profitabilityRiskScale) {
      this._dispatchEvents('open-fund-selector-step');
    }
  }
  /**
   *
   * @param {Object} dataPdf
   */
  filterDocumentRequest(dataPdf) {
    const SeerviceType = 'COME';
    if (dataPdf.id === 'apffmm_Contrato') {
      let titleLink = this.investmentFundProductIdSelected === SeerviceType ? `${this.t('funds-step-card-checklist-contract-apffmm_Contrato')}` : `${this.t('funds-step-card-checklist-contract-apffmm_Contrato-and-exacution-letter')}`;
      this.pdfViewTitle = titleLink;
      this._dispatchEvents('title-pdf-text', titleLink);
      this._requestPDF('MBINVEST', 'CONTRATOPS');
    } else if (dataPdf.id === 'sci0000s') {
      this.pdfViewTitle = `${this.t('funds-step-card-checklist-contract-apffmm_Guide')}`;
      this._dispatchEvents('title-pdf-text', this.t('funds-step-card-checklist-contract-apffmm_Guide'));
      this._requestPDF('MBINVEST', 'GUIASERVIN');
    } else if (dataPdf.id === 'apffmm_Dici') {
      this.pdfViewTitle = 'funds-step-contract-apffmm_dici';
      this.sendPdfLink({title: this.t('funds-step-contract-apffmm_dici'), link: this.fundSelected.additionalLink.detail.DICIURL});
    } else if (dataPdf.id === 'apffmm_Prospect') {
      this.pdfViewTitle = 'funds-step-contract-apffmm_prospect';
      this.sendPdfLink({title: this.t('funds-step-contract-apffmm_prospect'), link: this.fundSelected.additionalLink.detail.prospectURL});
    }
  }
  /**
    *@desc  that sends the parameters for the PDF query
    *@param {String} product
    *@param {String} subproduct
    */
  _requestPDF(product, subproduct) {
    let params = {'product.id': product, 'subproduct.id': subproduct};
    let businessProperties = {'tsec': this.tsec.token, 'deviceId': this.deviceId.value};
    this._dispatchEvents('set-business-properties', businessProperties);
    this._dispatchEvents('request-pdf-contract', params);
  }
  /**
   *@desc  that sends the parameters to get the base64
   *@param {Array} response
   */
  successResponsePDF(response) {
    if ((response[0].id)) {
      let requestTermns = { documentTemplate: { id: response[0].id, templateType: { id: 'PDF' } } };
      let businessProperties = {'tsec': this.tsec.token, 'deviceId': this.deviceId.value};
      this._dispatchEvents('set-business-properties', businessProperties);
      this._dispatchEvents('request-post-document', requestTermns);
    }
  }
  /**
   * @desc event that filters the fund according to the selected term by comparing the fund.id property
   * @param {Number} filteredObjectPosition
   * @param {String} typeFund
   * @param {Array} multistrategyTerms
   */
  filterFundTypeSelected(filteredObjectPosition, typeFund, multistrategyTerms = []) {
    let compare = false;
    if (typeFund === this.termTypeTexts[2].typeFund) {
      for (let termsDebt = 0; termsDebt < multistrategyTerms.length; termsDebt++) {
        if (this.visibleFundsMx[filteredObjectPosition].fundType === multistrategyTerms[termsDebt].type) {
          compare = true;
        }
      }
    }
    if (this.visibleFundsMx[filteredObjectPosition].fundType === typeFund && multistrategyTerms.length === 0) {
      compare = true;
    }
    return compare;
  }

  /**
   * @desc event that dispatches the funds already filtered
   * @param {Array} payloadFilterTypeFunds
   */
  selectedFundTypes(payloadFilterTypeFunds) {
    this._dispatchEvents('filter-funds-short-term', payloadFilterTypeFunds);
  }

  /**
   * @desc event that identifies the modal to be closed
   */
  closeModal() {
    let orderFilter = false;
    if (this.investmentServiceSelected.id === '002') {
      this._dispatchEvents('close-modal-funds-' + this.selectedTypeFound);
    } else {
      this._dispatchEvents('filter-funds-order-ok-all', !orderFilter);
    }
  }

  /**
   *@desc  get the base64 of the answer
   *@param {String} responseBase
   *@event 'show-funds-pdf'
   */
  successBasePdf(responseBase) {
    var base64;
    if (this.isNativeIos) {
      base64 = this.validateBasePdf(this.get('data.parts.0.content', responseBase));
    } else {
      let dato = this.validateBasePdf(responseBase);
      let startBase64 = dato.indexOf('>') + 3;
      let endBase64 = dato.indexOf('=')  + 3;
      if (endBase64 <= 2) {
        let foie = dato.substring(startBase64);
        endBase64 = foie.indexOf('-');
        base64 = foie.substring(0, endBase64);
      } else {
        base64 = dato.substring(startBase64, endBase64);
      }
    }
    this.set('baseSrc', base64);
    this._dispatchEvents('show-document-event');
    const params = {
      value: this.baseSrc.replace(/(\r\n|\n|\r)/gm, ''),
      mimeType: 'application/pdf',
      headerColor: 'FFFFFFFF',
      tintColor: 'FF072146',
      canShare: true,
      title: this.pdfViewTitle,
      titleColor: '000000',
      blackStatusBar: false
    };
    this._dispatchEvents('show-funds-pdf', params);
  }

  /**
   *@Desc Validate content Base64
   * @param {String} responseBase
   */
  validateBasePdf(responseBase) {
    let uri = responseBase;
    try {
      let response;
      if (uri !== window.atob(uri)) {
        response = window.atob(uri);
      }
      return response;
    } catch (e) {
      return uri;
    }
  }

  /**
   *
   * @param {Object} params
   */
  sendPdfLink(params) {
    const getPdfInfo = ({title, text, id, link}) => {
      if (title) {
        return { title, link: link || id };
      }
      if (text) {
        return {title: text, link: link || id };
      }
      return {title: this.t('funds-step-contract-apffmm_dici'), link: link || id};
    };
    let pdfURL = getPdfInfo(params);
    this._dispatchEvents('funds-pdf', pdfURL);
    const dataDocument = {
      value: pdfURL.link,
      mimeType: 'application/pdf',
      method: 'get',
      headerColor: 'FFFFFFFF',
      tintColor: 'FF072146',
      canShare: true,
      title: pdfURL.title,
      titleColor: '000000',
      blackStatusBar: false
    };
    this._dispatchEvents('pdf-get-url', dataDocument);
  }

  getErrorResponsePdf() {
    let modalService = {
      code: 'ERRORMODALGENERIC',
      selectedConfig: {
        className: 'error',
        openMaximized: false,
        acceptBtLabel: 'Salir',
        iconOnlyFullHeight: true,
        closeOnPrimaryButton: true,
        template: {
          type: 'paragraphs',
          values: [{
            icon: 'coronita:alert'
          },
          {
            title: 'funds-hiring-modal-generic-error-title',
            class: 'margin-bottom-s text-center'
          },
          {
            text: this.t('funds-hiring-modal-generic-error-desscription'),
            class: 'text-styles-ml'
          }]
        }
      }
    };
    this._dispatchEvents('open-diy-info-modal', modalService);
  }

  /**
   * @desc fire event for modal error
   */
  errorContractFunds() {
    let detail = {
      code: 'GENERIC-ERROR',
      selectedConfig: {
        className: 'full-height-error',
        heroImage: './images/general_error_2.svg',
        openMaximized: true,
        title: 'cells-funds-hiring-modal-error-title',
        acceptBtLabel: 'cells-funds-withdrawal-success-screen-button',
        template: {
          type: 'paragraphs',
          values: [
            {
              title: 'cells-investments-funds-error-generic-message',
              class: 'spacing text-center'
            }
          ]
        }
      }
    };
    this._dispatchEvents('open-diy-info-modal', detail);
  }

  /**
   * @desc fire event for redirect to dashboard
   */
  redirectToDashboard() {
    this._dispatchEvents('redirect-to-dashboard');
  }

  /**
   * @desc Create a object. This Object is send when the button in the header is clicked
   */
  modalConfirmExit() {
    const alertLeaveOperativeMock = {
      code: 'LEAVE-OPERATIVE',
      selectedConfig: {
        className: 'pr-exit-modal',
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'cells-funds-withdrawal-success-screen-button',
        cancelBtLabel: 'cells-funds-withdrawal-primary-button-close-modal-screen',
        template: {
          type: 'paragraphs',
          values: [{
            icon: 'coronita:alert'
          },
          {
            text: 'alert-EXIT-fundsWithdrawal-message'
          }]
        }
      }
    };
    this._dispatchEvents('open-diy-info-modal', alertLeaveOperativeMock);
  }

  modalAlert(componentContent) {
    if (componentContent) {
      this.componentContent = componentContent;
    }
    let modalService = {
      code: 'ERRORMODAL',
      selectedConfig: {
        className: 'error',
        closeOnPrimaryButton: true,
        openMaximized: false,
        iconOnlyFullHeight: true,
        acceptBtLabel: 'Continuar',
        cancelBtLabel: 'Regresar',
        onAcceptEvent: () => {
          this.aceptedAlert();
        },
        onCancelEvent: () => {
          // wait for animation an close the step
          setTimeout(() => {
            this.goToLastActiveStep();
          }, 400);
        },
        template: {
          type: 'paragraphs',
          values: [{
            icon: 'coronita:alert'
          },
          {
            text: this.t('funds-hiring-modal-change-service-alert')
          }]
        }
      }
    };
    if (!!componentContent && componentContent.currentStep === 2) {
      return;
    }
    this._dispatchEvents('open-diy-info-modal', modalService);
  }

  aceptedAlert() {
    this.enterAmountSimulation = {};
    this.lastActiveStep = this.currentStep;
    this.resetStepProp(this.componentContent);
    this._dispatchEvents('content-id', this.componentContent);
    this._dispatchEvents('reset-step-id', this.componentContent.currentStep);
    this._dispatchEvents('collpsed-steps', true);
  }

  /**
   * @Desc Retrieves the time or date according to what was sent
   * @param {String} data
   * @param {String} subtract
   */
  _formatDate(data, subtract) {
    return (subtract === 'date' ? data.substr(0, 10) : data.substr(11, 8));
  }

  /**
   * @desc Show an animation in the sticky and hide with animation too
   * @param {Object} scrollDetail
   */
  animationStiky(scrollDetail) {
    let { offsetHeight, scrollHeight, scrollTop } = scrollDetail.target;
    let realScreenHeight = (scrollHeight - offsetHeight) - 160;

    if (this.canExecute) {
      if (scrollTop >= realScreenHeight) {
        this.async(() => {
          this._dispatchEvents('open-stiky-animation', true);
        }, 300);
      }
    }
  }

  /**
   * this method, receipt detail of share button and trig
   * an event to global_download_channel with size of screen
   * @param {Object} event detail of share button in the withouthead
   * screen, constains screen size
  */
  receiptCaptureWithouthead() {
    let htmlTemplate = document.getElementById('cells-template-fundsHiringReview');
    let receipt = htmlTemplate.querySelector('#step-funds-hiring-receipt');
    let header = htmlTemplate.querySelector('#funds-hiring-header-receipt');
    let headerBtn = header.shadowRoot.querySelector('#btnRight');
    let operations = receipt.shadowRoot.querySelector('cells-operations-list');
    let actions = receipt.shadowRoot.querySelector('#footer');

    //Clean receipt
    headerBtn.style.visibility = 'hidden';
    operations.style.display = 'none';
    actions.style.display = 'none';
    htmlTemplate.style.minHeight = (receipt.offsetHeight + header.offsetHeight + 24) + 'px';

    this.async(() => {
      this.dispatchEvent(new CustomEvent('share-btn-tapped-withouthead', {
        detail: {
          height: htmlTemplate.offsetHeight,
          share: true,
          download: false
        }
      }));
    }, 500);

    //Restore receipt
    this.async(() => {
      headerBtn.style.visibility = 'visible';
      operations.style.display = 'block';
      actions.style.display = 'flex';
      htmlTemplate.style.minHeight = 'auto';
    }, 3000);
  }

  /**
   * this method uses the features flags find the flag for beneficiaries funds
   * and set the notBeneficiariesFunds property to desactive or active the condition
   * @param {Object} featureFlags
   */
  setFeatureFlags(featureFlags = {}) {
    const keyEnableBeneficiariesValidation = featureFlags['glomo.investmentfunds.notBeneficiariesFunds'];
    if (keyEnableBeneficiariesValidation?.value) {
      this.notBeneficiariesFunds = keyEnableBeneficiariesValidation.value;
      return;
    }
    this.notBeneficiariesFunds = false;
  }
}


customElements.define(GlomoFundHiringManagerMx.is, GlomoFundHiringManagerMx);
