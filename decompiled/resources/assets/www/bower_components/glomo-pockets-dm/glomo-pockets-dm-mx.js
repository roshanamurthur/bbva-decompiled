/*global moment*/

/**
  # glomo-pockets-dm

  ![Polymer 2.x](https://img.shields.io/badge/Polymer-2.x-green.svg)

  `<glomo-pockets-dm>` is a data manager component for GloMo Pockets, used to handle
  Pockets data from Global Services and use in GloMo application. It uses `cells-dm-global-apis-pockets`
  component to have access to Pockets Global API

  Example:

  ```html
  <dom-module id="my-component">
    <template>
      <glomo-pockets-dm id="dm"
        pocket-id="[[pocketId]]"
        host="[[host]]"
        pocket="[[pocketData]]"
        pockets-api-version="[[_pocketsApiVersion]]"
        required-token="[[requiredToken]]"
        native="[[native]]"
      ></glomo-pockets-dm>
    </template>
    <script>
      class MyComponent extends Polymer.Element() {
        static get is() {
          return 'my-component';
        }
      }
    </script>
  </dom-module>
  ```

  * @customElement
  * @polymer
  * @extends {Polymer.Element}
  * @demo demo/index.html
 */
/*eslint new-cap: 0*/

class GlomoPocketsDmMx extends Polymer.mixinBehaviors([
  CellsBehaviors.i18nBehavior,
  CellsBehaviors.CellsCheckNestedKeysBehavior
], CellsBehaviors.CellsProductFormatBehavior(CellsBehaviors.AmountBehavior(CellsBehaviors.PfmOperativesBehavior(Polymer.Element)))) {

  static get is() {
    return 'glomo-pockets-dm-mx';
  }

  static get properties() {
    return {
      /**
       * @desc Email user
       * @type {String}
       */
      customerEmail: {
        type: String,
        value: ''
      },
      /**
       * Account selected from dashboard
       */
      selectedAccount: {
        type: Object,
        value: () => {}
      },
      /**
       * Id from selected account
       */
      selectedAccountId: {
        type: String,
        value: ''
      },
      /**
       * Financial overview response
       */
      financialOverviewResponse: {
        type: Object,
        value: () => {}
      },
      product: {
        type: Object,
        value: () => {}
      },
      /**
       * The account is payrolled
       */
      isPayrollAccount: {
        type: Boolean,
        value: false
      },
      /**
       * Maximum available amount
       */
      maxAmount: {
        type: Number,
        value: 0
      },
      /**
       * Mínimum available amount
       */
      minAmount: {
        type: Number,
        value: 0
      },
      /**
       * Store user amount to call pockets services
       */
      amount: {
        type: String,
        value: ''
      },
      /**
       * Store user scheduled amount
       */
      scheduledAmount: {
        type: String,
        value: ''
      },
      /**
       * Pocket alias
       */
      pocketAlias: {
        type: String,
        value: ''
      },
      /**
       * Flag to indicate if pocket is scheduled
       */
      isPocketScheduled: {
        type: Boolean,
        value: false
      },
      /**
       * Number of user pockets
       * Max value: '7'
       */
      numberOfPockets: {
        type: String,
        value: '0'
      },
      /**
       * Sum every user pocket amount
       */
      pocketsBalance: {
        type: Number
      },
      /**
       * Pocket id
       */
      pocketId: {
        type: String,
        value: ''
      },
      /**
       * Full pocket data
       */
      pocketInfo: {
        type: Object,
        value: () => ({})
      },
      /**
       * Pocket amount
       */
      pocketAmount: {
        type: Number,
        value: ''
      },
      /**
       * Pocket name
       */
      pocketName: {
        type: String,
        value: ''
      },
      /**
       * Product associated to pocket
       */
      pocketProductName: {
        type: String,
        value: ''
      },
      /**
       * Pocket movements (operations)
       */
      pocketOperations: {
        type: Array,
        value: () => ([])
      },
      /**
       * Currency used in every amount
       * Default: 'MXN'
       */
      currency: {
        type: String,
        value: 'MXN'
      },
      /**
       * Data that will be shared by plug-in
       */
      shareData: {
        type: Object,
        value: () => ({})
      },
      /**
       * Flag to update pocket info
       */
      _listPocketsUpdate: {
        type: Boolean,
        value: false
      },
      /**
       * Flag to update pocket operations
       */
      _pocketOperationsUpdate: {
        type: Boolean,
        value: false
      },
      /**
       * Flag to update when withdrawal is completed
       */
      _updatePocketWithdrawal: {
        type: Boolean,
        value: false
      },
      /**
       * Load pocket operatives
       */
      _shouldLoadOperatives: {
        type: Boolean,
        value: false
      },
      /**
       * Current account balance
       */
      accountAmount: {
        type: Number,
        value: 0
      },
      /**
       * @property {Object} _responseCreate - An object that stores the response from the create pocket service.
       * This property is used to hold the response from the create pocket service when the feature flag for
       * making contributions from create pockets is active. The response is then used when making a contribution
       * to the newly created pocket.
       * @type {Object}
       * @default {}
       */
      _responseCreate: {
        type: Object,
        value: () => ({})
      },
      /**
       * @property {Boolean} _contributionCreate - A flag that indicates whether to make contributions from create pockets.
       * This property is used to hold the value of the feature flag for making contributions from create pockets.
       * If the flag is active (true), contributions will be made from create pockets. If the flag is inactive (false),
       * contributions will not be made from create pockets.
       * @type {Boolean}
       * @default false
       */
      _contributionCreate: {
        type: Boolean,
        value: false
      },
      /**
       * @property {String} keyContributionCreateFlag - A key used to retrieve the feature flag for making contributions from create pockets.
       * This property is used to hold the key that is used to retrieve the value of the feature flag for making contributions from create pockets from the feature flag collection.
       * @type {String}
       */
      keyContributionCreateFlag: { type: String },
      /**
        * @property {String} contractNumber Is the contract number that is used to filter the financial overview response.
        * @type {String}
       */
      contractNumber: {
        type: String,
        value: ''
      },
      /**
       * Flag to initialize flow retargeting
       */
      _retargeting: {
        type: Boolean,
        value: false
      },
    };
  }

  /**
  * Sets the deep link operation based on the provided filter.
  * @param {Object} filter - The filter object.
  */
  setDeepLinkOperation({ filter }) {
    const arg = this.get('args.0', filter);
    this.contractNumber = arg ? arg.split('=')[1] : '';
    this._dispatchCustomEvent('set-contract-number', this.contractNumber);
  }

  /**
   * Sets the financial overview response.
   * @param {Object} foData - The financial overview data.
   * @returns {void}
   */
  setFinancialOverviewResponse(foData) {
    this.financialOverviewResponse = foData;
    if (this.contractNumber) {
      this.selectedAccount = this.getAccountByContractNumber(this.contractNumber);
      this.selectedAccountId = this.selectedAccount.id;
    }
  }

  /**
   * Retrieves the selected account based on the provided contract number.
   *
   * @param {string} contractNumber - The contract number to search for.
   * @returns {object|null} - The selected account object if found, or null if not found.
   */
  getAccountByContractNumber(contractNumber) {
    const contracts = this.c(this.financialOverviewResponse, 'data.contracts');
    const product = contracts.find(item => this.getLastNDigits(item.number, 4) === contractNumber);
    return product;
  }

  /**
   * Returns the last N digits of a given string.
   *
   * @param {string} str - The input string.
   * @param {number} n - The number of digits to retrieve.
   * @returns {string} The last N digits of the input string.
   */
  getLastNDigits(str, n) {
    const myStr = str.substring(Math.max(str.length - n, 0));
    return myStr;
  }

  /**
   * Init function to set welcome modal and user product data
   */
  init() {
    this._setProductId();
    this._toggleWelcomeModal();
  }

  /**
   * Init list of pockets
   * @event set-is-payroll-account
   */
  initListPockets() {
    this._spinner(true);
    this._setData();
    this._isPayrollSelectedAccount(this.financialOverviewResponse);
    this.listPockets();
    this._shouldLoadOperatives = true;
    this._dispatchCustomEvent('set-is-payroll-account', this.isPayrollAccount);
  }

  /**
   * Load pockets list operatives
   * If number of pockets is 1 then order pockets operative must be disabled
   * @event set-list-pocket-operatives
   */
  _loadOperatives() {
    let operations = [];
    if (this.numberOfPockets === '1' || !this.isPayrollAccount) {
      operations = [
        {
          eventName: 'click-on-create-pocket-operative',
          label: 'Crear apartado',
          id: 'createPocket',
          icon: 'coronita:add',
          type: 'operation'
        },
        {
          eventName: 'click-on-sort-pockets-operative',
          label: 'Ordenar apartados',
          id: 'sortPockets',
          disabled: true,
          icon: 'coronita:arrows',
          type: 'operation'
        }
      ];
    } else {
      operations = [
        {
          eventName: 'click-on-create-pocket-operative',
          label: 'Crear apartado',
          id: 'createPocket',
          icon: 'coronita:add',
          type: 'operation'
        },
        {
          eventName: 'click-on-sort-pockets-operative',
          label: 'Ordenar apartados',
          id: 'sortPockets',
          icon: 'coronita:arrows',
          type: 'operation'
        }
      ];
    }
    this._dispatchCustomEvent('set-list-pocket-operatives', operations);
  }

  /**
   * Set user data
   */
  _setData() {
    this._setProductId();
    this._setProduct();
  }

  /**
   * Reset page
   */
  _reset() {
    this._retargeting = false;
    this._dispatchCustomEvent('reset-page-' + this.pageName, false);
  }

  /**
   * Init pocket withdrawal
   * @event set-selected-account
   * @event set-selected-pocket
   * @event set-maximum-amount
   * @event set-maximum-pocket-amount
   * @event init-{this.pageName}
   */
  initPocketWithdrawal() {
    this._reset();
    this._setData();
    if (this._updatePocketWithdrawal) {
      this._updatePocketWithdrawal = false;
      const pocket = this.pockets.find(item => item.id === this.pocketId);
      let selectedPocket = {
        name: this.c(pocket, 'alias'),
        id: this.c(pocket, 'id'),
        primaryAmount: {
          amount: this.get('balances.0.unit.amount', pocket),
          currency: this.get('balances.0.unit.currency', pocket),
          label: 'glomo-pockets-dm-selected-pocket-label'
        }
      };
      const contracts = this.c(this.financialOverviewResponse, 'data.contracts');
      const product = contracts.find(item => item.id === this.selectedAccountId);
      const specificAmounts = this.c(product, 'detail.specificAmounts');
      const currentBalance = specificAmounts.find(balance => balance.id === 'CURRENT_BALANCE');
      const amount = this.c(currentBalance, 'amounts.0.amount');
      this.set('maxAmount', amount);
      const currency = this.c(currentBalance, 'amounts.0.currency');
      let selectedAccount = {
        name: this.c(this.product, 'alias'),
        id: this.c(this.product, 'alias'),
        primaryAmount: {
          amount: amount,
          currency: currency,
          label: this.pageName === 'pocketsWithdrawal' ? 'glomo-pockets-dm-selcted-account-available-balance' : ''
        },
        description: {
          value: this.c(this.product, 'number'),
          masked: true
        }
      };
      this._dispatchCustomEvent('set-selected-account', selectedAccount);
      this._dispatchCustomEvent('set-selected-pocket', selectedPocket);
      this._dispatchCustomEvent('set-maximum-amount', this.c(selectedAccount, 'primaryAmount.amount'));
      this._dispatchCustomEvent('set-maximum-pocket-amount', this.c(selectedPocket, 'primaryAmount.amount'));
    } else {
      if (!this._updatePocketWithdrawal) {
        this._updatePocketWithdrawal = true;
        this.listPockets();
      }
    }
    this._dispatchCustomEvent('init-' + this.pageName);
  }

  /**
   * Init data required to create pocket
   * @param {Object} params
   * @event set-selected-account
   * @event set-selected-account-alias
   * @event set-maximum-amount
   * @event set-is-payroll-account
   */
  initializeData(params = {}) {
    this._reset();
    params = this.financialOverviewResponse;
    this._setData();
    this._isPayrollSelectedAccount(params);
    const contracts = this.c(params, 'data.contracts');
    const product = contracts.find(item => item.id === this.selectedAccountId);
    const specificAmounts = this.c(product, 'detail.specificAmounts');
    const currentBalance = specificAmounts.find(balance => balance.id === 'CURRENT_BALANCE');
    const amount = this.c(currentBalance, 'amounts.0.amount');
    this.set('maxAmount', amount);
    const currency = this.c(currentBalance, 'amounts.0.currency');
    let selectedAccount = {
      name: this.c(this.product, 'alias'),
      id: this.c(this.product, 'alias'),
      primaryAmount: {
        amount: amount,
        currency: currency
      },
      description: {
        value: this.c(this.product, 'number'),
        masked: true
      }
    };

    this._dispatchCustomEvent('set-selected-account', selectedAccount);
    this._dispatchCustomEvent('set-selected-account-alias', this.c(this.product, 'subProductType.name'));
    this._dispatchCustomEvent('set-maximum-amount', this.maxAmount);
    this._dispatchCustomEvent('set-is-payroll-account', this.isPayrollAccount);
  }

  /**
   * Init data to load pocket detail
   * @param {Object} pocket
   * @event set-pocket-optional-items
   * @event show-transaction-skeleton
   * @event get-pocket-operations
   * @event set-product
   * @event set-pocket-id
   * @event set-pocket-amount
   * @event set-pocket-info
   * @event set-pocket-heading
   * @event set-pocket-main-items
   * @event set-pocket-detail-operatives
   * @event navigation-to-pocket-detail
   * @event loading-operatives
   */
  initPocketDetail(pocket) {
    this._setData();
    this.set('pocketAmount', this.get('additionalAmount.amount.amount', pocket));
    this.set('pocketInfo', pocket);
    this.set('pocketId', pocket.id);
    const pocketName = pocket.name;
    this.set('pocketName', pocketName);
    const pocketMainItems = [ {
      key: 'glomo-pockets-dm-selected-pocket-label',
      localCurrency: this.get('additionalAmount.amount.currency', pocket),
      language: 'es-MX',
      value: [
        {
          amount: this.get('additionalAmount.amount.amount', pocket),
          currencyCode: this.get('additionalAmount.amount.currency', pocket),
          class: 'amount-large'
        }
      ]
    } ];
    if (pocket.additionalSecondaryAmount) {
      const pocketOptionalItems = [ {
        key: 'glomo-pockets-dm-scheduled-amount',
        localCurrency: this.get('additionalSecondaryAmount.amount.currency', pocket),
        language: 'es-MX',
        value: [
          {
            amount: this.get('additionalSecondaryAmount.amount.amount', pocket),
            currencyCode: this.get('additionalAmount.amount.currency', pocket),
            class: 'amount-large'
          }
        ]
      } ];
      this._dispatchCustomEvent('set-pocket-optional-items', pocketOptionalItems);
    } else {
      this._dispatchCustomEvent('set-pocket-optional-items', {});
    }
    const amount = this.c(this.product, 'detail.specificAmounts.0.amounts.0.amount');
    this._dispatchCustomEvent('show-transaction-skeleton', false);
    this._dispatchCustomEvent('get-pocket-operations');
    this._dispatchCustomEvent('set-product', this.product);
    this._dispatchCustomEvent('set-account-amount', amount);
    this._dispatchCustomEvent('set-pocket-id', this.pocketId);
    this._dispatchCustomEvent('set-pocket-amount', this.pocketAmount);
    this._dispatchCustomEvent('set-pocket-info', pocket);
    this._dispatchCustomEvent('set-pocket-heading', pocketName);
    this._dispatchCustomEvent('set-pocket-main-items', pocketMainItems);
    this._dispatchCustomEvent('set-pocket-detail-operatives');
    this._dispatchCustomEvent('navigation-to-pocket-detail');
    this._dispatchCustomEvent('loading-operatives', false);
  }

  /**
   * Method to initiate retargeting when the page loads
   */
  initRetargeting() {
    this._retargeting = true;
  }

  /**
   * Method to validate the sending of the post for flow retargeting
   * @param {Object} detail
   * @event send-pockets-post-retargeting
   * @event send-retargeting-account
   */
  sendPostRetargeting(detail = {}) {
    if (!this.native || (this._retargeting && Object.keys(detail).length !== 0)) {
      this._retargeting = false;
      this._dispatchCustomEvent('send-retargeting-account', this.selectedAccount);
      this._dispatchCustomEvent('send-pockets-post-retargeting');
    }
  }

  /**
   * Set pocket detail
   * @event set-pocket-detail
   */
  setPocketDetail() {
    this._dispatchCustomEvent('set-pocket-detail');
  }

  /**
   * Get pocket operations
   * Calls service pockets/v0/pockets/{pocket-id}/operations
   */
  getOperations() {
    this.$.apiPockets.pocketId = this.pocketId;
    this.$.apiPockets.getPocketOperations();
  }

  /**
   * Set pocket operations
   * If pocket amount is 0 then withdrawMoney operations must be disabled
   * @event loading-operatives
   * @event set-pocket-operatives
   * @event init-pocket-detail
   */
  setPocketOperations() {
    const operations = [
      this.pocketAmount === 0 ?
        {
          eventName: 'click-on-withdrawal-money',
          label: 'glomo-pockets-dm-operatives-withdraw',
          id: 'withdrawalMoney',
          icon: 'coronita:substract',
          type: 'operation',
          disabled: true
        } : {
          eventName: 'click-on-withdrawal-money',
          label: 'glomo-pockets-dm-operatives-withdraw',
          id: 'withdrawalMoney',
          icon: 'coronita:substract',
          type: 'operation'
        },
      this.accountAmount === 0 ?
        {
          eventName: 'click-on-add-money',
          label: 'glomo-pockets-dm-operatives-contribute',
          id: 'addMoney',
          icon: 'coronita:add',
          type: 'operation',
          disabled: true
        } : {
          eventName: 'click-on-add-money',
          label: 'glomo-pockets-dm-operatives-contribute',
          id: 'addMoney',
          icon: 'coronita:add',
          type: 'operation'
        },
      {
        eventName: 'click-on-edit-pocket',
        label: 'glomo-pockets-dm-operatives-edit',
        id: 'editPocket',
        icon: 'coronita:edit',
        type: 'operation'
      },
      {
        eventName: 'click-on-delete-saving',
        label: 'glomo-pockets-dm-operatives-delete',
        id: 'deletePocket',
        icon: 'coronita:trash',
        type: 'operation'
      }
    ];
    this._dispatchCustomEvent('loading-operatives', true);
    this._dispatchCustomEvent('set-pocket-operatives', operations);
    this._dispatchCustomEvent('init-pocket-detail');
  }

  /**
   * Update pocket detail
   * Should execute after any pocket operation (add or withdraw money)
   * @event set-pocket-optional-items
   * @event set-pocket-main-items
   * @event set-pocket-heading
   */
  updatePocketDetail() {
    this._setData();
    this.listPockets().then(() => {
      const pocket = this.pockets.find(item => item.id === this.pocketId);
      this._dispatchCustomEvent('set-pocket-info', pocket);
      this.pocketAmount = this.get('balances.0.unit.amount', pocket);
      const pocketMainItems = [ {
        key: 'glomo-pockets-dm-selected-pocket-label',
        localCurrency: this.get('balances.0.unit.currency', pocket),
        language: 'es-MX',
        value: [
          {
            amount: this.get('balances.0.unit.amount', pocket),
            currencyCode: this.get('balances.0.unit.currency', pocket),
            class: 'amount-large'
          }
        ]
      } ];
      if (pocket.isScheduled) {
        const pocketOptionalItems = [ {
          key: 'glomo-pockets-dm-scheduled-amount',
          localCurrency: this.get('scheduledDeposit.depositAmount.currency', pocket),
          language: 'es-MX',
          value: [
            {
              amount: this.get('scheduledDeposit.depositAmount.amount', pocket),
              currencyCode: this.get('scheduledDeposit.depositAmount.currency', pocket),
              class: 'amount-large'
            }
          ]
        } ];
        this._dispatchCustomEvent('set-pocket-optional-items', pocketOptionalItems);
      } else {
        this._dispatchCustomEvent('set-pocket-optional-items', []);
      }
      this._dispatchCustomEvent('set-pocket-main-items', pocketMainItems);
      this._dispatchCustomEvent('set-pocket-heading', this.pocketName);
      this._spinner(false);
    });
  }

  /**
   * Update pockets
   * Should execute when returning to pockets list
   * @event set-pocket-optional-items
   * @event set-pocket-main-items
   * @event set-pocket-heading
   */
  updatePocket() {
    const pocketPromises = [];
    this._setData();
    this._spinner(true);
    pocketPromises.push(this.listPockets());
    this._dispatchCustomEvent('show-transaction-skeleton', false);
    this.$.apiPockets.pocketId = this.pocketId;
    pocketPromises.push(this.$.apiPockets.getPocketOperations());
    Promise.all(pocketPromises).then(() => {
      this._spinner(false);
      const pocket = this.pockets.find(item => item.id === this.pocketId);
      this._dispatchCustomEvent('set-pocket-info', pocket);
      this.pocketAmount = this.get('balances.0.unit.amount', pocket);
      const pocketMainItems = [ {
        key: 'glomo-pockets-dm-selected-pocket-label',
        localCurrency: this.get('balances.0.unit.currency', pocket),
        language: 'es-MX',
        value: [
          {
            amount: this.get('balances.0.unit.amount', pocket),
            currencyCode: this.get('balances.0.unit.currency', pocket),
            class: 'amount-large'
          }
        ]
      } ];
      if (pocket.isScheduled) {
        const pocketOptionalItems = [ {
          key: 'glomo-pockets-dm-scheduled-amount',
          localCurrency: this.get('scheduledDeposit.depositAmount.currency', pocket),
          language: 'es-MX',
          value: [
            {
              amount: this.get('scheduledDeposit.depositAmount.amount', pocket),
              currencyCode: this.get('scheduledDeposit.depositAmount.currency', pocket),
              class: 'amount-large'
            }
          ]
        } ];
        this._dispatchCustomEvent('set-pocket-optional-items', pocketOptionalItems);
      }
      this.setPocketOperations();
      this._dispatchCustomEvent('set-pocket-main-items', pocketMainItems);
      this._dispatchCustomEvent('set-pocket-heading', this.pocketName);
    });
  }

  /**
   * Init full pocket movements list
   * @event set-full-operations
   */
  initMovementsList(data) {
    this._dispatchCustomEvent('set-full-operations', data);
  }

  /**
   * Set pocket movement list heading
   * @event set-header-operations
   */
  setMovementsHeading() {
    const title = this.t('glomo-pockets-dm-movement-list-header', '', { name: this.pocketName.toLowerCase() });
    this._dispatchCustomEvent('set-header-operations', title);
  }

  /**
   * Init data for every success operation
   * @param {Object} data
   * @event set-pocket-create-success
   * @event set-pocket-withdrawal-success
   * @event set-pocket-contribution-success
   * @event set-success
   * @event set-success-color-header
   * @event set-success-header-title
   */
  initSuccess(data = {}) {
    this.set('shareData', data);
    let detail;
    let header;
    let genericSucces;
    let resetSuccess = {};
    switch (data.title) {
      case 'glomo-pockets-dm-pocket-created':
        detail = 'glomo-pockets-dm-create-pocket';
        header = 'header--core';
        genericSucces = true;
        this._dispatchCustomEvent('set-pocket-create-success');
        break;
      case 'glomo-pockets-dm-pocket-deleted':
        detail = 'glomo-pockets-dm-delete-pocket';
        header = 'header--core';
        genericSucces = true;
        break;
      case 'glomo-pockets-dm-pocket-updated':
        detail = 'glomo-pockets-dm-update-pocket';
        header = 'header--core';
        genericSucces = true;
        break;
      case 'glomo-pockets-dm-money-added':
        detail = 'glomo-pockets-dm-add-money';
        header = 'header--dark-success';
        genericSucces = false;
        this._dispatchCustomEvent('set-pocket-contribution-success');
        break;
      case 'glomo-pockets-dm-money-withdrawal':
        detail = 'glomo-pockets-dm-withdraw-money';
        header = 'header--dark-success';
        genericSucces = false;
        this._dispatchCustomEvent('set-pocket-withdrawal-success');
        break;
      default:
        break;
    }
    if (genericSucces && detail === 'glomo-pockets-dm-update-pocket') {
      resetSuccess = {
        withOutAvatar: true,
        withOutAmount: true,
        withoutHead: true,
        hideDivider: true
      };
    } else if (genericSucces) {
      resetSuccess = {
        withOutAvatar: true,
        withOutAmount: true,
        withoutHead: false,
        hideDivider: false
      };
    } else {
      resetSuccess = {
        withOutAvatar: false,
        withOutAmount: false,
        withoutHead: false,
        hideDivider: true,
      };
    }
    this._dispatchCustomEvent('set-success', resetSuccess);
    this._dispatchCustomEvent('set-success-color-header', header);
    this._dispatchCustomEvent('set-success-header-title', detail);
  }

  /**
   * Set user selected product
   * @event set-product
   */
  _setProduct() {
    const product = this.c(this.financialOverviewResponse, 'data.contracts').find(item => item.id === this.selectedAccountId);
    this.set('product', product);
    this._dispatchCustomEvent('set-product', this.product);
  }

  /**
   * Set user selected product id
   */
  _setProductId() {
    this.set('selectedAccountId', this.c(this.selectedAccount, 'id'));
  }

  /**
   * Check if account is payroll
   * @param {Object} params
   * @return {Boolean} - True is is payroll account
   */
  _isPayrollSelectedAccount(params) {
    const contracts = this.c(params, 'data.contracts');
    const product = contracts.find(item => item.id === this.selectedAccountId);
    const accountIndicators = this.c(product, 'detail.indicators');
    const payrollAccountIndicator = accountIndicators.find(indicator => indicator.id === 'IS_PAYROLL_ACCOUNT');
    this.set('isPayrollAccount', this.get('isActive', payrollAccountIndicator));
    this._dispatchCustomEvent('set-is-payroll-account', this.isPayrollAccount);
    return this.isPayrollAccount;
  }

  /**
   * Show welcome modal
   * The configuration depends upon isPayrollAccount property
   * @event info-modal-open
   */
  _toggleWelcomeModal() {
    let cardAdviceBody;
    if (this._isPayrollSelectedAccount(this.financialOverviewResponse)) {
      cardAdviceBody = {
        hiddenLinkText: false,
        isBackgroundLight: true,
        showIconMessage: true,
        showBtn: true,
        btnCustomClass: 'card-advice__button',
        listItemClass: 'cells-card-advice-list-item-pockets',
        iconMessage: {'class': 'icon-message', 'type': 'info-dark', 'icon': 'coronita:info', 'text': 'glomo-pockets-dm-welcome-modal-icon-message'},
        imageUrl: 'images/pockets/wallet_money.svg',
        titleText: 'glomo-pockets-dm-welcome-modal-icon-message-title',
        list: [
          'glomo-pockets-dm-welcome-modal-payroll-list-1',
          'glomo-pockets-dm-welcome-modal-payroll-list-2',
          'glomo-pockets-dm-welcome-modal-payroll-list-3',
          'glomo-pockets-dm-welcome-modal-payroll-list-4'
        ],
      };
    } else {
      cardAdviceBody = {
        hiddenLinkText: false,
        isBackgroundLight: true,
        showIconMessage: true,
        showBtn: true,
        btnCustomClass: 'card-advice__button',
        listItemClass: 'cells-card-advice-list-item-pockets',
        iconMessage: {'class': 'icon-message', 'type': 'info-dark', 'icon': 'coronita:info', 'text': 'glomo-pockets-dm-welcome-modal-icon-message'},
        imageUrl: 'images/pockets/savings.svg',
        titleText: 'glomo-pockets-dm-welcome-modal-icon-message-title',
        list: [
          'glomo-pockets-dm-welcome-modal-no-payroll-list-1',
          'glomo-pockets-dm-welcome-modal-no-payroll-list-2',
          'glomo-pockets-dm-welcome-modal-no-payroll-list-3'
        ],
      };
    }
    this._dispatchCustomEvent('info-modal-open', cardAdviceBody);
  }

  /**
   * Set pocket amount
   * @param {Object} amount
   * @event set-amount
   * @event set-pocket-amount-info
   * @event set-summary-amount
   * @event set-summary-amount-{pageName}
   */
  setAmount(amount = {}) {
    let amountValue;
    if (amount.secondAmount && amount.amount === 0) {
      amountValue = {
        additionalAmount: {
          amount: amount.secondAmount,
          currency: amount.currency
        }
      };
    } else if (amount.secondAmount && amount.amount !== 0) {
      amountValue = {
        amount: {
          amount: amount.amount,
          currency: amount.currency,
        },
        additionalAmount: {
          amount: amount.secondAmount,
          currency: amount.currency
        }
      };
    } else {
      amountValue = {
        amount: {
          amount: amount.amount,
          currency: amount.currency,
        }
      };
    }
    this.set('amount', this.c(amount, 'amount'));
    this.set('currency', this.c(amount, 'currency'));
    this.set('scheduledAmount', this.c(amount, 'secondAmount'));
    this.isPocketScheduled = Boolean(this.scheduledAmount);
    this._dispatchCustomEvent('set-amount', amountValue);
    this._dispatchCustomEvent('set-pocket-amount-info', amountValue);
    this._dispatchCustomEvent('set-summary-amount', amountValue);
    this._dispatchCustomEvent('set-summary-amount-' + this.pageName, amountValue);
  }

  /**
   * Set pocket alias
   * @param {String} param
   * @event set-pocket-alias
   */
  setPocketAlias(param) {
    this.set('pocketAlias', param);
    this._dispatchCustomEvent('set-pocket-alias', param);
  }

  /**
   * Set params to call create pocket service
   * @event set-number-of-pockets
   */
  setPostPocket() {
    this._spinner(true);
    const requestCreatePocket = {
      initialAmount: {
        amount: this.amount,
        currency: this.currency
      },
      alias: this.pocketAlias,
      isScheduled: this.isPocketScheduled,
      scheduledDeposit: {
        depositAmount: {
          amount: this.isPocketScheduled ? this.scheduledAmount : 0,
          currency: this.currency
        }
      },
      relatedContract: {
        id: this.get('id', this.product),
        product: {
          productType: {
            id: 'ACCOUNTS'
          },
          numberType: {
            id: 'SIMPLE_ACCOUNT'
          }
        }
      },
      priority: this.numberOfPockets === '0' ? '1' : this.numberOfPockets
    };
    this.numberOfPockets = (parseInt(this.numberOfPockets) + 1).toString();
    this._dispatchCustomEvent('set-number-of-pockets', this.numberOfPockets);
    this.$.apiPockets.createPocket(requestCreatePocket);
  }

  /**
   * Calls contribute money to pocket service
   */
  addMoneyToPocket() {
    this._spinner(true);
    const body = {
      contributionAmount: {
        amount: this.amount,
        currency: this.currency
      }
    };
    if (Object.keys(this._responseCreate).length > 0) {
      this.$.apiPockets.pocketId = this._responseCreate.id;
    } else {
      this.$.apiPockets.pocketId = this.get('id', this.pocketInfo);
    }
    this.$.apiPockets.contributePocket(body);
  }

  /**
   * Calls withdraw money to pocket service
   */
  withdrawMoneyToPocket() {
    this._spinner(true);
    const body = {
      withdrawalAmount: {
        amount: this.amount,
        currency: this.currency
      }
    };
    this.$.apiPockets.pocketId = this.get('id', this.pocketInfo);
    this.$.apiPockets.withdrawalPocket(body);
  }

  /**
   * Methods that is called when a pocket is succesfully created
   * @param {Object} eventPayload - Success pocket create event
   * @event create-pocket-success
   *
   */
  _onPocketCreateSuccess(eventPayload) {
    const response = eventPayload.detail || {};
    if (this._contributionCreate) {
      if (this.amount > 0 && response?.balances[0]) {
        response.balances[0].unit = {};
        response.balances[0].unit.amount = this.amount;
        response.balances[0].unit.currency = this.currency;
        this._responseCreate = response;
        this.initListPockets();
        return;
      }
    }
    this._dispatchCustomEvent('refresh-account');
    this._dispatchCustomEvent('create-pocket-success', response);
  }

  /**
   * Executed when encounters error on create pocket service
   * @event send-retry-error
   */
  _onPocketCreateError() {
    this._dispatchCustomEvent('send-retry-error', {
      retryErrorData: {
        errorId: 'create-pocket-error',
        errorType: 'otherNotClasifiedErrors'
      }
    });
  }

  /**
   * Gets every user pocket
   * @return {Function} getPockets with current params
   */
  listPockets() {
    const params = {
      'relatedContract.number': this.selectedAccountId
    };
    return this.$.apiPockets.getPockets(params);
  }

  /**
   * Method that is called when retrieving pockets successfully
   * @param {Object} eventPayload
   * @event set-partial-pockets
   * @event set-number-of-pockets
   * @event set-pockets-list
   * @event set-pockets-list-order
   */
  _onGetPocketsSuccess(eventPayload) {
    this._spinner(false);
    const response = eventPayload.detail || [];
    this.set('pockets', response);
    const pocket = this.pockets.find(item => item.id === this.pocketId);
    this.pocketName = this.get('alias', pocket);
    const partialPockets = this._getPartialPockets(response);
    this._dispatchCustomEvent('set-partial-pockets', partialPockets);
    const numberOfPockets = response.length.toString();
    this.set('numberOfPockets', numberOfPockets);
    this._dispatchCustomEvent('set-number-of-pockets', this.numberOfPockets);
    this._dispatchCustomEvent('set-pockets-list', this._parsePockets(response));
    this._dispatchCustomEvent('set-pockets-list-order', this._parsePockets(response));

    if (this._updatePocketWithdrawal) {
      this.initPocketWithdrawal();
    }
    if (Object.keys(this._responseCreate).length > 0) {
      this._responseCreate.id = response[response.length - 1].id;
      this.addMoneyToPocket();
    }
    if (this._shouldLoadOperatives) {
      this._loadOperatives();
    }
  }

  /**
   * Executed when encounters error when retrieving pockets
   * @event send-retry-error
   */
  _onGetPocketsError() {
    this._dispatchCustomEvent('send-retry-error', {
      retryErrorData: {
        errorId: 'get-pockets-error',
        errorType: 'otherNotClasifiedErrors'
      }
    });
  }

  /**
   * Maps pocket data, product and email
   * @param {Array} pockets
   * @return {Object} params, body, product and email
   */
  _getPartialPockets(pockets) {
    const params = {
      'relatedContract.number': this.selectedAccountId
    };
    const body = pockets.map(({ id, alias, isScheduled, scheduledDeposit, priority }) => ({ id, alias, isScheduled, scheduledDeposit, priority }));
    const product = {
      account: this.product
    };
    const email = this.customerEmail;
    const partialPockets = {
      params,
      body,
      product,
      email
    };
    return partialPockets;
  }

  /**
   * Send pockets to pockets order
   * @event pocket-order
   */
  goPocketsOrder() {
    this._dispatchCustomEvent('pocket-order', this.pockets);
  }

  /**
   * Executed when retrieving pocket movements (operations)
   * @param {Object} eventPayload
   * @event set-pockets-operations
   */
  _onPocketOperationGetSuccess(eventPayload) {
    const pocketOperations = eventPayload.detail || [];
    const parsedPocketOperations = pocketOperations.map(({id, operationAmount, operationType, operationDate })  => ({
      id,
      localAmount: {
        amount: operationType.id === 'WITHDRAWAL' ? '-' + this.get('amount', operationAmount) :  this.get('amount', operationAmount),
        currency: this.get('currency', operationAmount),
      },
      concept: operationType.id === 'CONTRIBUTION' || operationType.id === 'SCHEDULED' ? this.t('glomo-pockets-dm-operations-contribution') : this.t('glomo-pockets-dm-operations-withdrawal'),
      operationDate,
      ...(operationType.id === 'SCHEDULED' && {
        additionalInformation: [
          {
            type: 'text',
            value: this.t('glomo-pockets-dm-scheduled')
          }
        ]
      })
    }));
    this.set('pocketOperations', parsedPocketOperations);
    this._dispatchCustomEvent('set-pockets-operations', parsedPocketOperations);
  }

  /**
   * Executed when encounter error while getting pocket operations
   * @event send-retry-error
   * @event no-operations
   */
  _onPocketOperationGetError() {
    this._dispatchCustomEvent('send-retry-error', {
      retryErrorData: {
        errorId: 'operations-pocket-error',
        errorType: 'otherNotClasifiedErrors'
      }
    });
    this._dispatchCustomEvent('no-operations', []);
  }

  /**
   * Calls contribute pocket service
   * @param {Object} eventPayload
   * @event refresh-account
   * @event set-contribution-operation-number
   */
  _onPocketContributeSuccess(eventPayload) {
    this._spinner(false);
    if (Object.keys(this._responseCreate).length > 0) {
      this._dispatchCustomEvent('refresh-account');
      this._dispatchCustomEvent('create-pocket-success', this._responseCreate);
      this._responseCreate = {};
      return;
    }
    const response = eventPayload.detail || {};
    this._addMoneySuccess(response);
    this._dispatchCustomEvent('set-contribution-operation-number', this.c(response, 'operationNumber'));
    this._dispatchCustomEvent('refresh-account');
  }

  /**
   * Calls when encounters error while contribute to pocket
   * @event send-retry-error
   */
  _onPocketContributeError() {
    this._dispatchCustomEvent('send-retry-error', {
      retryErrorData: {
        errorId: 'contribute-pocket-error',
        errorType: 'otherNotClasifiedErrors'
      }
    });
  }

  /**
   * Calls withdraw money from pocket service
   * @param {Object} eventPayload
   * @event set-withdrawal-operation-number
   * @event set-product-info
   * @event refresh-account
   */
  _onPocketWithdrawalSuccess(eventPayload) {
    this._spinner(false);
    const response = eventPayload.detail || {};
    this._withdrawalSuccess(response);
    this._dispatchCustomEvent('set-withdrawal-operation-number', this.c(response, 'operationNumber'));
    this._dispatchCustomEvent('set-product-info', this.product);
    this._dispatchCustomEvent('refresh-account');
  }

  /**
   * Executed when encounters error while withdraw money from pocket
   * @event error-withdrawal-pocket
   * @event send-retry-error
   */
  _onPocketWithdrawalError() {
    this._dispatchCustomEvent('error-withdrawal-pocket');
    this._dispatchCustomEvent('send-retry-error', {
      retryErrorData: {
        errorId: 'withdraw-pocket-error',
        errorType: 'otherNotClasifiedErrors'
      }
    });
  }

  /**
   * Parse list of pockets
   * @param {Array} response
   * @return {Array} - Parsed pockets
   * @event set-pockets-total-balance
   */
  _parsePockets(response) {
    let balance = 0;
    let listBalance;
    response.forEach(pocket => {
      balance += this.get('balances.0.unit.amount', pocket);
      this.set('pocketsBalance', balance);
      listBalance = {
        amount: balance.toString(),
        currency: 'MXN',
        scale: 0
      };
    });
    const parsedPockets = response.map(({alias, balances, id, isScheduled, scheduledDeposit })  => ({
      localCurrency: this.get('0.unit.currency', balances),
      name: alias,
      additionalAmount: {
        amount: {
          amount: this.get('0.unit.amount', balances),
          currency: this.get('0.unit.currency', balances),
          className: 'amount-xl',
          decimalHidden: true
        },
        label: 'Saldo apartado',
        className: 'item__label text-right primary-label-amount',
      },
      ...(isScheduled && {
        additionalSecondaryAmount: {
          amount: {
            amount: this.get('depositAmount.amount', scheduledDeposit),
            currency: this.get('0.unit.currency', balances),
            className: 'currency-m',
            decimalHidden: false
          },
          label: 'Importe programado',
          className: 'item__label text-right second-amount'
        }
      }),
      id
    }));
    this._dispatchCustomEvent('set-pockets-total-balance', listBalance);
    return parsedPockets;
  }

  /**
   * Set success receipt when creating a pocket
   * @param {Object} data
   * @event set-number-of-pockets
   * @event set-success-properties-{pageName}
   * @event navigate-to-success
   */
  setSuccess(data) {
    this._dispatchCustomEvent('create-pocket-success-receipt');
    const amount = this.c(data, 'balances.0.unit.amount');
    const today = moment(new Date());
    const time = today.format('HH:mm');
    const date = this.c(data, 'creationDate').split('T').splice(0)[0] + 'T' + time + ':00.000-06:00';
    let reviewInfo = {
      status: 'pocketSuccess',
      date: date,
      dateClass: 'opacity',
      title: 'glomo-pockets-dm-pocket-created',
      destination: false,
      origin: false,
      headerSectionConfig: 'white  content-header',
      topInfo: [
        {
          value: ''
        },
        {
          value: 'glomo-pockets-dm-pocket-name',
          class: 'container-label-color'
        },
        {
          value: this.c(data, 'alias'),
          class: 'spacing pocket-success-size'
        },
        {
          value: 'glomo-pockets-dm-pocket-amount',
          class: 'container-label-color'
        },
        {
          amount: {
            amount: this.c(data, 'balances.0.unit.amount'),
            currency: this.c(data, 'balances.0.unit.currency')
          },
          class: 'spacing pocket-success-size'
        },
        this.isPocketScheduled ?
          {
            key: 'glomo-pockets-dm-scheduled-pocket-amount',
            amount: {
              amount: this.c(data, 'scheduledDeposit.depositAmount.amount'),
              currency: this.c(data, 'scheduledDeposit.depositAmount.currency')
            },
            class: 'spacing'
          } : {},
        {
          value: 'glomo-pockets-dm-pocket-account',
          class: 'container-label-color'
        },
        {
          value: this.c(this.product, 'alias'),
        },
        {
          musk: {
            value: this.c(this.product, 'number'),
            chars: 4,
            simbol: '•',
            class: 'spacing'
          },
          class: 'spacing'
        },
        {
          value: 'glomo-pockets-dm-folio',
          class: 'container-label-color'
        },
        {
          value: this.c(data, 'operationNumber'),
        },
        {
          value: 'glomo-pockets-dm-bbva',
          class: 'block spacing'
        }
      ],
      buttons: {
        primary: {
          text: 'glomo-pockets-dm-exit',
          action: 'go-back'
        },
        secondary: {
          hidden: true
        }
      }
    };
    if (this.isPocketScheduled && amount !== 0) {
      reviewInfo = {
        ...reviewInfo,
        bottomMessage: {
          type: 'info-dark',
          class: 'icon-dark-blue',
          icon: 'coronita:info',
          text: 'glomo-pockets-dm-success-scheduled-info'
        }
      };
      reviewInfo.topInfo.push(
        {
          key: '',
          value: 'glomo-pockets-dm-email-notification',
          class: 'container-label-color'
        },
        {
          value: '•' + this.customerEmail.replaceAll('*', '').toLowerCase(),
          class: 'secondary container-label-style',
        }
      );
    } else if (amount !== 0) {
      reviewInfo.topInfo.push(
        {
          key: '',
          value: 'glomo-pockets-dm-email-notification',
          class: 'container-label-color'
        },
        {
          value: '•' + this.customerEmail.replaceAll('*', '').toLowerCase(),
          class: 'secondary container-label-style',
        }
      );
    } else if (this.isPocketScheduled) {
      reviewInfo = {
        ...reviewInfo,
        bottomMessage: {
          type: 'info-dark',
          class: 'icon-dark-blue',
          icon: 'coronita:info',
          text: 'glomo-pockets-dm-success-scheduled-info'
        }
      };
    }
    const properties = {
      className: 'pocket-success',
      withOutAvatar: true,
      withOutAmount: true,
      pocketSuccessSrcImg: 'images/check_successful.svg'
    };
    this._spinner(false);
    this._dispatchCustomEvent('set-number-of-pockets', this.numberOfPockets);
    this._dispatchCustomEvent('set-success-properties-' + this.pageName, properties);
    this._dispatchCustomEvent('navigate-to-success', reviewInfo);
  }

  /**
   * Set success receipt when adding money to pocket
   * @param {Object} data
   * @event update-pocket-detail
   * @event set-success-properties-{pageName}
   * @event set-add-money-success
   */
  _addMoneySuccess(data) {
    const today = moment(new Date());
    const time = today.format('HH:mm');
    const date = this.c(data, 'operationDate').split('T').splice(0)[0] + 'T' + time + ':00.000-06:00';
    const reviewInfo = {
      title: 'glomo-pockets-dm-money-added',
      status: 'pocketSuccess',
      headerSectionConfig: 'pockets-header-info',
      date: date,
      amountLabel: 'glomo-pockets-dm-amount',
      chargeAmount: {
        amount: this.c(data, 'contributionAmount.amount'),
        currency: this.c(data, 'contributionAmount.currency'),
        class: 'amount-huge-decimals  container-amount-weight'
      },
      origin: {
        product: {
          id: 'ACCOUNTS',
          name: this.c(this.product, 'alias')
        },
        avatar: {
          src: 'images/accounts/account.svg'
        }
      },
      bodyClass: 'pockets-footer-info',
      topInfo: [
        {
          value: ''
        },
        {
          value: this.c(this.pocketInfo, 'name'),
          class: 'spacing bold value container-internal-space'
        },
        {
          value: 'glomo-pockets-dm-pocket-account',
          class: 'container-label-color',
        },
        {
          key: this.c(this.product, 'alias'),
          musk: {
            value: this.c(this.product, 'number'),
            simbol: '•',
            chars: 4,
            class: 'spacing'
          },
          class: 'spacing'
        },
        {
          value: 'glomo-pockets-dm-folio',
          class: 'container-label-color'
        },
        {
          value: this.c(data, 'operationNumber')
        },
        {
          value: 'glomo-pockets-dm-bbva',
          class: 'block spacing'
        },
        {
          value: 'glomo-pockets-dm-email-notification',
          class: 'container-label-color'
        },
        {
          value: '•' + this.customerEmail.replaceAll('*', '').toLowerCase(),
          class: 'secondary container-label-style',
        },
      ],
      operations: [
        {
          label: 'glomo-pockets-dm-share',
          id: 'share',
          icon: 'coronita:share',
          operative: 'pocketsAddMoney'
        }
      ],
      buttons: {
        primary: {
          text: 'glomo-pockets-dm-exit',
          action: 'go-back'
        },
        secondary: {
          hidden: true
        }
      }
    };
    const properties = {
      withOutAvatar: false,
      withOutAmount: false,
      withoutHead: false,
      pocketSuccessSrcImg: '',
      operationListClass: 'container-internal-space',
      className: 'date-font-medium-italic header-additional-values-key'
    };
    this._dispatchCustomEvent('update-pocket-detail');
    this._dispatchCustomEvent('set-success-properties-' + this.pageName, properties);
    this._dispatchCustomEvent('set-add-money-success', reviewInfo);
  }

  /**
   * Set success receipt when withdraw money from pocket
   * @param {Object} data
   * @event update-pocket-detail
   * @event set-success-properties-{pageName}
   * @event set-add-money-success
   */
  _withdrawalSuccess(data) {
    const today = moment(new Date());
    const time = today.format('HH:mm');
    const date = this.c(data, 'operationDate').split('T').splice(0)[0] + 'T' + time + ':00.000-06:00';
    const reviewInfo = {
      title: 'glomo-pockets-dm-money-withdrawal',
      status: 'pocketSuccess',
      headerSectionConfig: 'pockets-header-info',
      date: date,
      amountLabel: 'glomo-pockets-dm-amount',
      chargeAmount: {
        amount: this.c(data, 'withdrawalAmount.amount'),
        currency: this.c(data, 'withdrawalAmount.currency'),
        class: 'amount-huge-decimals  container-amount-weight'
      },
      origin: {
        product: {
          id: 'ACCOUNTS',
          name: this.c(this.product, 'alias')
        },
        avatar: {
          src: 'images/accounts/account.svg'
        }
      },
      bodyClass: 'pockets-footer-info',
      topInfo: [
        {
          value: ''
        },
        {
          value: this.c(this.product, 'alias'),
          class: 'bold'
        },
        {
          musk: {
            value: this.c(this.product, 'number'),
            simbol: '•',
            chars: 4,
            class: 'spacing'
          },
          class: 'spacing'
        },
        {
          value: 'glomo-pockets-dm-folio',
          class: 'container-label-color'
        },
        {
          value: this.c(data, 'operationNumber')
        },
        {
          value: 'glomo-pockets-dm-bbva',
          class: 'block spacing'
        },
        {
          value: 'glomo-pockets-dm-email-notification',
          class: 'container-label-color'
        },
        {
          value: '•' + this.customerEmail.replaceAll('*', '').toLowerCase(),
          class: 'secondary container-label-style',
        },
      ],
      operations: [
        {
          label: 'glomo-pockets-dm-share',
          id: 'share',
          icon: 'coronita:share',
          operative: 'pocketsWithdrawMoney'
        }
      ],
      buttons: {
        primary: {
          text: 'glomo-pockets-dm-exit',
          action: 'go-back'
        },
        secondary: {
          hidden: true
        }
      }
    };
    const properties = {
      withOutAvatar: false,
      withOutAmount: false,
      withoutHead: false,
      pocketSuccessSrcImg: '',
      operationListClass: 'container-internal-space',
      className: 'date-font-medium-italic header-additional-values-key'
    };
    this._dispatchCustomEvent('update-pocket-detail');
    this._dispatchCustomEvent('set-success-properties-' + this.pageName, properties);
    this._dispatchCustomEvent('set-add-money-success', reviewInfo);
  }

  /**
   * Handle navigation after success receipt
   * @event navigate-to-product-detail
   * @event navigate-to-origin
   */
  navigateAfterCreate() {
    let eventName = 'navigate-to-pockets-list';
    if (this.numberOfPockets === '0') {
      eventName = 'navigate-to-product-detail';
    } else {
      eventName = 'navigate-to-origin';
    }
    this._dispatchCustomEvent(eventName);
  }

  /**
   * Validate number of pockets when creating a pocket
   * Pocket limit = 7
   * @event open-info-modal
   * @event navigate-to-create-pocket
   */
  goCreatePocket() {
    if (this.numberOfPockets === '7') {
      this._dispatchCustomEvent('open-info-modal', {
        code: 'POCKET-LIMIT',
        selectedConfig: {
          className: 'caution',
          openMaximized: false,
          iconOnlyFullHeight: true,
          acceptBtLabel: 'glomo-pockets-dm-ok',
          template: {
            type: 'paragraphs',
            values: [
              { icon: 'coronita:info', iconClass: 'icon-size-24', class: 'caution' },
              { text: 'glomo-pockets-dm-max-pocket-message' }
            ]
          }
        }
      });
    } else {
      this._dispatchCustomEvent('navigate-to-create-pocket');
    }
  }

  /**
   * Function that emits an event with the config object to show the delete confirmation modal.
   * @event confirm-delete-pocket
   */
  confirmDeleteGoal() {
    const message = this.pocketAmount === 0 ? 'glomo-pockets-dm-delete-pocket-without-money-message' : 'glomo-pockets-dm-delete-pocket-with-money-message';
    this._dispatchCustomEvent('confirm-delete-pocket-modal', {
      code: 'CONFIRM-DELETE-GOAL',
      time: 300,
      eventName: 'delete-pocket-confirmed',
      selectedConfig: {
        openMaximized: false,
        className: 'error',
        iconOnlyFullHeight: true,
        acceptBtLabel: 'glomo-alert-manager-accept-pocket-delete',
        onAcceptEvent: this.deletePocket.bind(this),
        cancelBtLabel: 'glomo-alert-manager-exit-pocket-delete',
        template: {
          type: 'paragraphs',
          values: [
            { icon: 'coronita:alert', iconClass: 'icon-size-24', class: 'error' },
            { text: message }
          ]
        }
      }
    });
  }

  /**
   * Calls delete pocket service
   * @event set-number-of-pockets
   */
  deletePocket() {
    this._spinner(true);
    this.set('numberOfPockets', (parseInt(this.numberOfPockets) - 1).toString());
    this._dispatchCustomEvent('set-number-of-pockets', this.numberOfPockets);
    if (this.pocketId) {
      this.$.apiPockets.pocketId = this.pocketId;
      this.$.apiPockets.deletePocket();
    }
  }

  /**
   * Executed when deleting a pocket successfully
   * @param {Object} eventPayload
   * @event refresh-account
   */
  _onPocketDeleteSuccessResponse(eventPayload) {
    const response = eventPayload.detail || [];
    this._deletePocketSuccess(response);
    this._dispatchCustomEvent('refresh-account');
  }

  /**
   * Executed when encounter service error while deleting a pocket
   * @event send-retry-error
   */
  _onDeletePocketError() {
    this._dispatchCustomEvent('send-retry-error', {
      retryErrorData: {
        errorId: 'delete-pocket-error',
        errorType: 'otherNotClasifiedErrors'
      }
    });
  }

  /**
   * Set success receipt when deleting a pocket
   * @param {Object} response
   * @event set-success-properties-{pageName}
   * @event navigate-to-success
   */
  _deletePocketSuccess(response) {
    this._spinner(false);
    const today = moment(new Date());
    const date = today.format('YYYY MM DD').replaceAll(' ', '-');
    const time = today.format('HH:mm');
    const formattedDate = date + 'T' + time + ':00.000-06:00';
    let reviewInfo;
    if (this.pocketAmount === 0) {
      reviewInfo = {
        status: 'pocketSuccess',
        date: formattedDate,
        dateClass: 'opacity',
        title: 'glomo-pockets-dm-pocket-deleted',
        titleClass: 'titleClass',
        destination: false,
        origin: false,
        headerSectionConfig: 'white content-header',
        topInfo: [
          {
            value: ''
          },
          {
            value: 'glomo-pockets-dm-pocket-account',
            class: 'container-label-color'
          },
          {
            value: this.c(this.product, 'alias')
          },
          {
            musk: {
              value: this.c(this.product, 'number'),
              chars: 4,
              simbol: '•',
              class: 'spacing'
            },
            class: 'spacing '
          },
          {
            value: 'glomo-pockets-dm-folio',
            class: 'container-label-color'
          },
          {
            value: this.c(response, 'operationNumber')
          },
          {
            value: 'glomo-pockets-dm-bbva',
            class: 'block spacing'
          }
        ],
        buttons: {
          primary: {
            text: 'glomo-pockets-dm-exit',
            action: 'go-back'
          },
          secondary: {
            hidden: true
          }
        }
      };
    } else {
      reviewInfo = {
        status: 'pocketSuccess',
        date: formattedDate,
        dateClass: 'opacity',
        title: 'glomo-pockets-dm-pocket-deleted',
        titleClass: 'titleClass',
        destination: false,
        origin: false,
        headerSectionConfig: 'white content-header',
        topInfo: [
          {
            value: ''
          },
          {
            value: 'glomo-pockets-dm-return-amount-after-delete-pocket',
            class: 'container-label-color'
          },
          {
            amount: {
              amount: this.pocketAmount,
              currency: this.currency
            },
            class: 'spacing pocket-success-size'
          },
          {
            value: 'glomo-pockets-dm-pocket-account',
            class: 'container-label-color'
          },
          {
            value: this.c(this.product, 'alias')
          },
          {
            musk: {
              value: this.c(this.product, 'number'),
              chars: 4,
              simbol: '•',
              class: 'spacing'
            },
            class: 'spacing '
          },
          {
            value: 'glomo-pockets-dm-folio',
            class: 'container-label-color'
          },
          {
            value: this.c(response, 'operationNumber')
          },
          {
            value: 'glomo-pockets-dm-bbva',
            class: 'block spacing'
          },
          {
            key: '',
            value: 'glomo-pockets-dm-email-notification',
            class: 'container-label-color'
          },
          {
            value: '•' + this.customerEmail.replaceAll('*', '').toLowerCase(),
            class: 'secondary container-label-style',
          },
        ],
        buttons: {
          primary: {
            text: 'glomo-pockets-dm-exit',
            action: 'go-back'
          },
          secondary: {
            hidden: true
          }
        }
      };
    }
    const properties = {
      className: 'pocket-success',
      withOutAvatar: true,
      withOutAmount: true,
      withoutHead: true,
      pocketSuccessSrcImg: 'images/check_successful.svg'
    };
    this._dispatchCustomEvent('set-success-properties-' + this.pageName, properties);
    this._dispatchCustomEvent('navigate-to-success', reviewInfo);
  }

  /**
   * Identifies the type of operation to be performed
   * @event reset-share-data
   */
  operativeSelected() {
    this._dispatchCustomEvent('reset-share-data', {});
    this._sharePocketsReceipt();
  }

  /**
   * Set data to share receipt
   * @event share-data
   */
  _sharePocketsReceipt() {
    const toggleDataReceipt = this.c(this.shareData, 'title') === 'glomo-pockets-dm-money-added';
    let shareData = {
      operationDate: this.c(this.shareData, 'date'),
      operationType: toggleDataReceipt ? 'glomo-pockets-dm-contribute-saved-money' : 'glomo-pockets-dm-withdraw-saved-money',
      referenceFolio: toggleDataReceipt ? this.c(this.shareData, 'topInfo.5.value') : this.c(this.shareData, 'topInfo.4.value'),
      localAmount: {
        amount: this.c(this.shareData, 'chargeAmount.amount'),
        currency: this.c(this.shareData, 'chargeAmount.currency')
      },
      origin: {
        number: toggleDataReceipt ? this.c(this.shareData, 'topInfo.3.musk.value') : this.c(this.shareData, 'topInfo.2.musk.value')
      },
      templateSelected: toggleDataReceipt ? 'pocketsAddMoney' : 'pocketsWithdrawMoney'
    };
    this._dispatchCustomEvent('share-data', shareData);
  }

  /**
   * Auxiliary function to fire events in a standard way
   *
   * @param {String} eventName
   * @param {Any} detail
   * @param {Boolean} bubbles
   * @param {Boolean} composed
   *
   * @private
   */
  _dispatchCustomEvent(eventName, detail, bubbles = true, composed = true) {
    this.dispatchEvent(new CustomEvent(
      eventName, { detail, bubbles, composed }
    ));
  }


  /**
   * Function to manage spinner
   * @param {Boolean} show
   */
  _spinner(show) {
    let eventSpinner = show ? 'show-spinner' : 'hide-spinner';
    this._dispatchCustomEvent(eventSpinner, show);
  }

  /**
   * Validates whether the flag is active or not to send makeContributions from createPockets.
   * @param {Object} featureFlagCollection - The feature flag collection.
   * If null or undefined, it defaults to an empty object.
   */
  getFeatureFlags(featureFlagCollection) {
    const flagCollection = featureFlagCollection ?? {};
    this._contributionCreate = flagCollection[this.keyContributionCreateFlag]?.value ?? false;
  }

}

customElements.define(GlomoPocketsDmMx.is, GlomoPocketsDmMx);
