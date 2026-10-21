/* global GlomoEquityTransferManagerMixin */
/* global moment */
class GlomoEquityTransferManagerMx extends GlomoEquityTransferManagerMixin {

  static get is() {
    return 'glomo-equity-transfer-manager-mx';
  }
  static get properties() {
    return {
      /**
       * @desc Propertie for save the user email
       * @type {String}
       */
      accountEmail: {
        type: String,
        value: ''
      },
      /**
       * @desc Propertie for save the user email from API (local)
       * @type {String}
       */
      accountEmailLocal: {
        type: String,
        value: ''
      },
      /**
       * @desc Propertie for save the accounts from service
       * @type {Array}
       */
      accountsService: {
        type: Array,
        value: () => []
      },
      /**
       * @desc Collection the global flags
       * @type {Object}
       */
      equityGlobalFlags: {
        type: Object,
        value: () => ({})
      },
      /**
       * @desc Flag to detect when to change the denomination
       * @type {Boolean}
       */
      equityNativeFlag: {
        type: Boolean,
        value: false,
      },
      /**
       * @desc Flag from flag collection
       * @type {Boolean}
       */
      equityTransferFlag: {
        type: Boolean,
        value: false
      },
      /**
       * Path to error.svg image
       */
      errorAlertImagePath: {
        type: String,
        value: '../images/errors/error.svg'
      },
      /**
       * Stores entry point
       */
      entryPoint: {
        type: String,
        value: ''
      },
      /**
       * @desc Internal flag for equity transfer process
       * @type {Boolean}
       */
      flagEquity: {
        type: Boolean,
        value: false
      },
      /**
       * FinancialOverview from Dashboard
       * @type {Array}
       */
      financialOverview: {
        type: Array,
        value: () => ({})
      },
      /**
       * @desc The final amount of the transfer is saved
       * @type {Object}
       */
      finalAmountSelected: {
        type: Object,
        value: () => ({})
      },
      /**
       *  @desc Origin's account final
       *  @type {Object}
       */
      finalConcept: {
        type: Object,
        value: () => ({})
      },
      /**
       *  @desc Array of amounts`s contracts
       *  @type {Array}
       */
      globalAmountContracts: {
        type: Array,
        value: () => []
      },
      /**
       *  @desc Array of contracts
       *  @type {Array}
       */
      globalContracts: {
        type: Array,
        value: () => []
      },
      /**
       *  @desc Array of accounts after being parsed into specific structure
       *  @type {Array}
       */
      globalContractsParsed: {
        type: Array,
        value: () => [],
      },
      /**
       * Array of local accounts before being parsed into specific structure
       */
      globalLocalAccounts: {
        type: Array,
        value: () => [],
      },
      /**
       * @desc Destination' account
       * @type {Object}
       */
      selectedReceiver: {
        type: Object,
        value: () => ({}),
      },
      /**
       *  @desc Origin's account
       *  @type {Object}
       */
      selectedSender: {
        type: Object,
        value: () => ({}),
      },
      /**
       * Used to persist data from transfers to transfersSuccess
       */
      transfersOperationData: {
        type: Object
      },
      /**
       * Array of accounts before being parsed into specific structure
       */
      globalAccounts: {
        type: Array,
        value: () => [],
      },
      /**
       * Array of accounts before being parsed into specific structure
       */
      listOriginAccount: {
        type: Array,
        value: () => [],
      },
      /**
       * Flag active when origin account selected is a contract
       * @type {Boolean}
       */
      equityOrigin: {
        type: Boolean,
        value: false,
      },
      /**
       * Flag active when receive account selected is a contract
       * @type {Boolean}
       */
      equityReceiver: {
        type: Boolean,
        value: false,
      },
      /**
       * image to show in refund review
       * @type {String}
       */
      successResponseRefundAvatar: {
        type: String,
        value: ''
      },
      /**
       * Validate when stand in mode is active
       * @type {Boolean}
       */
      standIn: {
        type: Boolean,
        value: false
      },      /**
      * Indicator if the customer has a btrader contract
      * @type {Boolean}
      */
      _hasBtraderContract: {
        type: Boolean,
        value: false
      },
      /**
        * Indicator if the customer has a patrimonial contract
        * @type {Boolean}
        */
      _hasPatrimonialContract: {
        type: Boolean,
        value: false
      }
    };
  }
  /**
   * Gets customer info, used to get client's email
   */
  parsedEmail(response) {
    this.accountEmail = this.c(response, '1.contact', '');
  }
  /**
   * Method get response from native for the flag
   */
  setDenominationFlag(payload) {
    if (this.c(payload, 'module') === 'patrimonial' && this.c(payload, 'feature') === 'refactorTransfersEquity' && !this.standIn) {
      this.equityNativeFlag =  this.c(payload, 'isFlagEnable');
      this._initEquity();
    }
  }
  /**
   * Method get response from global for the flag
   */
  setDenominationFlagGlobal(payload) {
    this.equityGlobalFlags = payload;
    if (this.c(this.equityGlobalFlags['glomo.account.equityTransfers'], 'value') && !this.standIn) {
      this._initEquity();
    }
  }
  /**
   * Init method to find equity global flags
   */
  sendDenomination() {
    if (this.equityGlobalFlags) {
      this.setDenominationFlagGlobal(this.equityGlobalFlags);
    } else {
      this._fireEvent('get-denomination-flag');
    }
  }

  /**
   * Method for request the contracts from service
   */
  _initEquity() {
    this._parseAccounts(this.financialOverview);
    this._hasPatrimonialContract = this.financialOverview.data?.contracts?.some(
      contract => contract?.product?.id === 'PT');
    this._hasBtraderContract = this.financialOverview.data?.contracts?.some(
      contract => contract?.product?.id === 'BR');
    if ((this._hasPatrimonialContract  || this._hasBtraderContract) && (this.c(this.equityGlobalFlags['glomo.account.equityTransfers'], 'value') || this.equityNativeFlag)) {
      this._fireEvent('equity-request-contracts', {expand: 'participants'});
    }
  }

  /**
   * Method when receive the response from service
   */
  responseEquityContracts(contracts) {
    if (contracts && contracts.length > 0) {
      if (this.c(this.financialOverview, 'data.contracts')) {
        this.flagEquity = true;
        this.globalAmountContracts = contracts;
        this._parseGlobalContracts(this.financialOverview, this.globalAmountContracts);
        this._fireEvent('validate-equity-contracts');
        this._fireEvent('equity-request-balances-portfolios');
      }
    }
  }
  /**
   * Method when receive a error from service
   */
  errorResponseContracts() {
    this.flagEquity = false;
  }
  /**
   * Method for validate if service response
   */
  validateContractsEquity() {
    if (this.flagEquity && this.globalContractsParsed && this.globalContractsParsed.length > 0) {
      this._fireEvent('validate-equity-contracts');
    } else {
      this._fireEvent('validate-equity-products');
    }
  }

  /**
   * Method when no receive the own accounts from service
   */
  errorResponseAccount() {
    this.accountsService = '';
  }

  _parseGlobalContracts(contractsList, contractAmountList) {
    let parsedContracts = [];
    let allContracts = this.c(contractsList, 'data.contracts');
    if (this._hasBtraderContract && this._hasPatrimonialContract) {
      allContracts = allContracts.filter(contract => contract?.product?.id !== 'BR');
    }
    let allAmountsContracts = contractAmountList;
    let newArrayContracts = (x, b) => {
      x.filter(contract => {
        b.filter(amountContract => {
          let fromSplit = contract?.number?.length - amountContract?.number.length;
          let numberFinancial = contract?.number?.slice(fromSplit);
          let numberContract = amountContract?.number;
          if (numberFinancial === numberContract) {
            const newArray = {
              alias: this.c(contract, 'alias'),
              accountId: this.c(amountContract, 'id'),
              number: this.c(contract, 'number'),
              masked: '',
              availableBalance: {
                currentBalances: [ {
                  amount: this.c(amountContract, 'portfolioValue.amount'),
                  currency: this.c(amountContract, 'portfolioValue.currency')
                } ]
              },
              imgSrc: this.c(contract, 'detail.images.url'),
              subProductType: this.c(contract, 'subProductType.id'),
              status: 'ACTIVE',
              numberType: {
                id: 'CCC',
                name: 'Customer Account Code'
              },
              contractType: {
                id: 'CARD',
                name: 'Card'
              },
              _type: 'ACCOUNTS',
              _family: 'ACCOUNTS',
              contract: this.c(contract, 'product.id') ? this.c(contract, 'product.id') : ''
            };
            if (this.c(contract, 'product.id') === 'PT' || this.c(contract, 'product.id') === 'BR') {
              parsedContracts.push(newArray);
            }
          }
        });
      });
    };
    newArrayContracts(allContracts, allAmountsContracts);
    this.set('globalContractsParsed', this._mapContracts(parsedContracts));
    this._fireEvent('set-global-contracts-parsed', this.globalContractsParsed);
  }
  /**
   * Method that parses list of local account and filters them in local
   * @param {Array} accountList
   */
  _parseAccounts(accountList) {
    if (this.c(accountList, 'data.contracts')) {
      let allAccounts = this.c(accountList, 'data.contracts');
      let onlyPrincipalAccount = [];
      let parsedAccounts = allAccounts.map(account => ({
        alias: this.c(account, 'alias'),
        accountId: this.c(account, 'id'),
        number: this.c(account, 'number'),
        masked: this.c(account, 'description.masked'),
        level: this.c(account, 'level'),
        status: this.c(account, 'status.id'),
        principalAccount: this.c(account, 'detail.indicators') ? (account.detail.indicators).find(element => element.id === 'IS_PRINCIPAL_ACCOUNT' && element.isActive === true) ? true : false : false,
      }
      ));
      onlyPrincipalAccount = parsedAccounts.filter(item => item.principalAccount);
      this._fireEvent('equity-send-principal-account', onlyPrincipalAccount);
    }
  }

  /**
   * Maps contracts and returns a list of mapped contracts
   * @param {Array} product
   */
  _mapContracts(product) {
    if (product && product.length > 0) {
      const family = {
        CARDS: 'cards',
        ACCOUNTS: 'accounts'
      };
      let counter = 1;
      const mappedList = product.map(item => {
        let newList = {
          'name': this.c(item, 'alias'),
          'id': this.c(item, 'accountId'),
          'number': this.c(item, 'number'),
          'imgSrc': this.c(item, 'imgSrc'),
          'productTitle': this.c(item, 'alias'),
          'currencies': [ {
            'currency': this.c(item, 'availableBalance.currentBalances.0.currency'),
            'isMajor': true
          } ],
          'description': {
            'value': this.c(item, 'number'),
            'masked': true
          },
          'disabled': false,
          'family': family[this.c(item, '_type')],
          'holds': [],
          'primaryAmount': {
            'amount': this.c(item, 'availableBalance.currentBalances.0.amount'),
            'currency': this.c(item, 'availableBalance.currentBalances.0.currency'),
            'label': this.t('glomo-transfer-parsed-products-primary-amount-label')
          },
          'productType': this.c(item, '_family'),
          'numberType': {
            'id': this.c(item, 'numberType.id'),
            'name': this.c(item, 'numberType.name')
          },
          'contractType': {
            'id': this.c(item, 'contractType.id'),
            'name': this.c(item, 'contractType.name')
          },
          'status': this.c(item, 'status'),
          'subProductType': this.c(item, 'subProductType'),
          'contract': this.c(item, 'contract')
        };
        if (counter === 1) {
          newList.typeTitle = newList.contract === 'PT'
            ? this.t('glomo-transfer-generate-equity-transfer-list-title-contracts')
            : this.t('glomo-transfer-generate-btrader-transfer-list-title-contracts');
          counter++;
        }
        return newList;
      });
      return mappedList;
    }
  }

  validateEquityTransfer() {
    if (this.flagEquity && (this.equityOrigin || this.equityReceiver)) {
      this._sendRequestOrdersPrivateBanking();
    } else {
      this._fireEvent('send-transfer-ticket-save');
    }
  }

  /**
   * Method for send the body request to private banking API
   * @param {Object} response
   */
  _sendRequestOrdersPrivateBanking() {
    let bodyRequest = '';
    if (this.equityOrigin && !this.equityReceiver) {
      bodyRequest = {
        'id': this.c(this.selectedSender, 'id'),
        'number': this.c(this.selectedSender, 'number'),
        'numberType':
        {
          'id': 'CCC'
        },
        'sentMoney':
        {
          'amount': this.c(this.finalAmountSelected, 'amount.amount'),
          'currency': 'MXN',
        },
        'transferType':
        {
          'id': 'HERITAGE_CHECK_ACCOUNT'
        }
      };
    } else if (!this.equityOrigin && this.equityReceiver) {
      bodyRequest = {
        'id': this.c(this.selectedReceiver, 'id'),
        'number': this.c(this.selectedReceiver, 'number'),
        'numberType':
        {
          'id': 'CCC'
        },
        'sentMoney':
        {
          'amount': this.c(this.finalAmountSelected, 'amount.amount'),
          'currency': 'MXN',
        },
        'transferType':
        {
          'id': 'CHECK_ACCOUNT_HERITAGE'
        }
      };
    }
    this._fireEvent('equity-dispatch-orders-private-banking', bodyRequest);
  }
  /**
   * Method when the equity trasfer is sucessful
   * @param {Object} data
   */
  successResponseOrdersPrivateBanking(data) {
    if (data) {
      let dataResponse  = {
        'data': {
          'id': this.c(data, 'id'),
          'transferId': this.c(data, 'transferId'),
          'transferType': {
            'id': this.c(data, 'transferType.id')
          },
          'sentMoney': {
            'amount': this.c(this.finalAmountSelected, 'amount.amount'),
            'currency': 'MXN',
          },
          'transactionNumber': this.c(data, 'transactionNumber'),
          'authorizationNumberPayment': this.c(data, 'authorizationNumberPayment'),
        }
      };
      this._parsedResponseTransfer(dataResponse);
    } else {
      this.errorResponseOrdersPrivateBanking();
    }
  }
  /**
   * Method for mapping the response of service when the equity trasfer is successful
   * @param {Object} detail
   */
  _parsedResponseTransfer(detail) {
    const today = moment(new Date());
    let commonData = {
      id: this.c(detail, 'data.id'),
      date: today.format('YYYY-MM-DDThh:mm:ss'),
      operationNumber: this.c(detail, 'data.transactionNumber'),
      concept: {
        concept: this.c(this.finalConcept, 'concept'),
      },
      reference: {
        reference: this.c(this.finalConcept, 'reference')
      },
      transferType: 'EQUITY_TRANSFERS',
      email: this.accountEmail.toLowerCase(),
      title: this.t('glomo-transfer-make-interbank-transfer-title'),
      senderProductTitle: this.c(this.selectedSender, 'productTitle'),
      origin: {
        product: {
          id: this.c(this.selectedSender, 'id')
        },
        number: this.c(this.selectedSender, 'number'),
        avatar: this.successResponseRefundAvatar
      },
      topInfo: 'topInfo',
      amount: {
        amount: this.c(detail, 'data.sentMoney.amount'),
        currency: this.c(detail, 'data.sentMoney.currency')
      },
      receiverProductTitle: this.c(this.selectedReceiver, 'productTitle'),
      destination: {
        number: this.c(this.selectedReceiver, 'number'),
        product: {
          id: this.c(this.selectedReceiver, 'id')
        }
      },
      fees: [ {
        text: this.t('glomo-transfer-parsed-response-transfer-fees-text'),
        amount: 0.00,
        currency: this.t('glomo-transfer-origin-currency')
      } ],
      additionalInfomation: this.t('glomo-transfer-generate-equity-transfer-additional-info'),
      operations: 'operations',
      contract: true,
    };

    this._resetEntryPoint();
    this._fireEvent('set-equity-transfers-success-data', {
      page: 'transfersSuccess',
      params: {
        detail: commonData,
        persistData: this.transfersOperationData,
        fromPage: 'transfersSuccess',
      }
    }
    );
  }
  /**
   * Method for receive the amount entered
   * @param {Object} amount
   */
  parceDataSucces(response) {
    if (response.transferType === 'EQUITY_TRANSFERS') {
      response.isOriginCardType = false;
      this._fireEvent('send-responnse-succes-equity', response);
    } else {
      this._fireEvent('send-responnse-succes-transfers', response);
    }
  }
  /**
   * Method for receive the amount entered
   * @param {Object} amount
   */
  viewAllList() {
    this._fireEvent('send-data-all-products', this.listOriginAccount);
  }
  /**
   * Method for receive the amount entered
   * @param {Object} amount
   */
  listAccount(response) {
    this.listOriginAccount = response;
    let total = [];
    let count = 0;
    let equity = response.map(function(x) {
      return x.typeTitle;
    }).indexOf(this.t('glomo-transfer-generate-equity-transfer-list-title-contracts'));
    let cards = equity >= 3 ? 3 : equity;
    if (equity > 1) {
      for (let n = 0; n < response.length; n++) {
        if (n < cards) {
          total.push(response[n]);
        } else if (count < 3 && n >= equity) {
          total.push(response[n]);
          count++;
        }
      }
      this._fireEvent('send-data-max-products', total.length);

      let view = response.length;
      if (view > total.length) {
        for (let n = 0; n < response.length; n++) {
          if (n < cards) {
            total.push(response[n]);
          }
        }
      }
      response = total;

    }
    this._fireEvent('send-data-list-account', response);

  }
  /**
   * Validates entry point and resets entry point page according to it
   */
  _resetEntryPoint() {
    if (this.entryPoint === 'account') {
      this._fireEvent('reset-account-detail', {
        productType: this.t('glomo-transfer-reset-accounts'),
        productNumber: this.c(this.selectedSender, 'description.value')
      });
    } else {
      this._fireEvent('reset-dashboard');
    }
  }
  /**
   * Method for show error message
   * @param {Object} response
   */
  errorResponseOrdersPrivateBanking(error) {
    if (error) {
      this._fireEvent('error-on-get-mock', error);
    }
  }
  /**
   * Method for validate if receiver account selected is a contract
   * @param {Object} detail
   */
  selectedReceiverEquity(detail) {
    if (this.flagEquity) {
      if (this.c(detail, 'contract')) {
        detail.additionalInformation = [ {
          key: this.t('glomo-transfer-generate-equity-transfer-destini-selected'),
          className: 'additional-info-separate-values'
        } ];
        this.set('equityReceiver', true);
        this._fireEvent('analytics-validate-selected-receiver-contract', detail);
      } else {
        this.set('equityReceiver', false);
      }
    }
  }
  /**
   * Method for validate if sender account selected is a contract
   * @param {Object} detail
   */
  selectedSenderEquity(detail) {
    if (this.flagEquity) {
      if (this.c(detail, 'contract')) {
        detail.infoMessage = this.t('glomo-transfer-generate-equity-transfer-origin-selected');
        this.set('selectedSender', detail);
        this.set('equityOrigin', true);
      } else {
        this.set('selectedSender', detail);
        this.set('equityOrigin', false);
      }
    }
  }
  /**
   * Method for receive the amount entered
   * @param {Object} amount
   */
  setSelectedAmount(amount) {
    if (this.flagEquity) {
      this.set('finalAmountSelected', amount);
    }
  }
  /**
   * Method for receive the concept entered
   * @param {Object} concept
   */
  setSelectedConcept(concept) {
    if (this.flagEquity) {
      this.set('finalConcept', concept);
      if (this.equityReceiver || this.equityOrigin) {
        let payload = {
          transferType: 'OWN_TRANSFERS',
          amount: this.c(this.finalAmountSelected, 'amount.amount'),
          currency: this.c(this.finalAmountSelected, 'amount.currency'),
          concept: this.c(this.finalConcept, 'concept'),
          contract: true
        };
        this._fireEvent('three-analytics-page', payload);
      }
    }
  }

  /**
   * Method for init tranfers from operatives
   */
  initiateTranfersFromOperative() {
    this._fireEvent('initiate-transfers-from-operative', {continue: 'dashboard'});
  }
}
window.customElements.define(GlomoEquityTransferManagerMx.is, GlomoEquityTransferManagerMx);
