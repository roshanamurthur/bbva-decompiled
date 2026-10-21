/**
 * @summary CELLS Data Manager for GLOBAL APIS URUGUAY Transfer.
 * @customElement
 * @polymer
 * @extends {Polymer.Element}
 */
/* global GlobalApisTransferDm */
class GlobalApisTransferDmUy extends GlobalApisTransferDm.mixin(Polymer.Element) {
  static get is() {
    return 'cells-dm-global-apis-transfer-uy';
  }

  static get properties() {
    return {
      /**
       * Transfer type
      */
      transferExecutionType: {
        type: Object
      },
      /**
       * Custom external reference
       */
      customExternalReference: {
        type: String
      },
      /**
       * Simulation response
      */
      simulationResponse: {
        type: Object,
        notify: true
      }
    };
  }

  /**
   * Simulating transfer type
   */
  _hasSimulatingService(type) {
    const simulatingServices = ['interbankTransfer', 'mobileInterbankTransfer'];
    return simulatingServices.includes(type);
  }

  /**
   * Get transfer execution type
   */
  _getTransferExecutionType() {
    return this.c(this, 'transferExecutionType', undefined);
  }

  /**
   * Get sentMoney currency
   */
  _getSentMoneyCurrency(money, destination) {
    return this.get('currency', money) || this.get('currencies.0.currency', destination);
  }

  /**
   * Get sentMoney amount
   */
  _getSentMoneyAmount(money) {
    return this.get('amount', money) ? this.get('amount', money) : money;
  }

  /**
   * Get sendCurrency
   */
  _getSendCurrency(source) {
    return this.get('primaryAmount.currency', source) || this.get('operationImport', source) && this.get('operationImport.currency', source);
  }

  /**
  * Generate body of interbank request
  */
  _generateInterbankTransferBody(source, destination, money, sendCurrency, concept) {
    const body = {
      concept: concept && concept.concept || undefined,
      interbankTransferMode: {id: concept && concept.movementId || undefined},
      sendCurrency: this.get('primaryAmount.currency', source) || this.get('operationDetail', source) && this.get('operationDetail.sendCurrency', source),
      sender: {
        contract: {
          contractId: source.contract.contractId,
          number: source.contract.number,
          numberType: source.contract.numberType,
          contractType: source.contract.contractType
        }
      },
      receiver: {
        alias: this._getDestinationName(destination),
        contract: {
          bank: {id: ((destination || {}).bank || {}).id},
          contractType: {
            id: this._getProductTypeId(destination.productType),
            name: destination.name
          },
          number: destination.number,
          numberType: destination.numberType
        },
        holder: {
          holderName: this._getDestinationName(destination),
        }
      },
      sentMoney: [
        {
          amount: money.amount ? money.amount : money,
          currency: this.get('currency', money) ? this.get('currency', money) : this.get('currencies.0.currency', destination)
        }
      ],
      transferExecutionType: this._getTransferExecutionType(),
      customExternalReference: this.customExternalReference
    };
    return body;
  }

  /**
      * Generate body of request
      */
  _generateOwnTransferBody(source, destination, money, sendCurrency, concept) {
    const body = {
      concept: this.get('concept', concept),
      sender: {contract: this.get('contract', source)},
      receiver: {contract: this.get('contract', destination)},
      sentMoney: [
        {
          amount: this.get('amount', money) ? this.get('amount', money) : money,
          currency: this.get('currency', money)
        }
      ]
    };
    return body;
  }

  /**
      * Generate body of internal request
      */
  _generateInternalTransferBody(source, destination, money, sendCurrency, concept) {
    const internalTransferMode = concept && concept.movementId ? {id: concept.movementId} : undefined;
    const body = {
      concept: this.get('concept', concept) || undefined,
      internalTransferMode,
      sendCurrency: this._getSendCurrency(source),
      sender: {
        contract: {
          contractId: this.get('contract.contractId', source),
          number: this.get('contract.number', source),
          numberType: this.get('contract.numberType', source),
          contractType: this.get('contract.contractType', source)
        }
      },
      receiver: {
        alias: this._getDestinationName(destination),
        contract: {
          bank: {id: this.get('bank.id', destination)},
          contractType: {
            id: this._getProductTypeId(destination.productType),
            name: this.get('productType.name', destination)
          },
          number: this.get('number', destination),
          numberType: this.get('numberType', destination)
        },
        holder: {
          holderName: this._getDestinationName(destination),
        }
      },
      sentMoney: [
        {
          amount: this._getSentMoneyAmount(money),
          currency: this._getSentMoneyCurrency(money, destination)
        }
      ],
      customExternalReference: this.get('reference', concept) || undefined
    };
    return body;
  }

  /**
   * Do request transfers
   */
  _doTransfer(source, destination, money, sendCurrency, concept, simulating, type, operationDetails) {
    const _type = this._formatTransferType(type);
    const transferType = _type.concat((this._hasSimulatingService(type) && simulating) ? 'Simulate' : '');
    const servicePath = this._getNpmTransferPath(transferType);
    if (servicePath) {
      const params = this._getParams(_type, source, destination, money, sendCurrency, concept, simulating);
      const service = this._getNpmService('Transfers', this.transfersApiVersion, servicePath, params);
      service.generateRequest().then(() => {
        const response = this._parseResponse(service.getLastResponse());
        this.transferType = type;
        if (simulating) {
          this.set('simulationResult', this._parseSimulation(response, type));
          this.set('simulationResponse', response);
        } else {
          this.set('transferResult', this['_parse' + _type](response, source, destination, operationDetails));
        }
      }, this._generateErrorFireEventHandler(simulating ? 'simulation-error' : 'transfer-error'));
    }
  }

  /**
   * Parse response amounts transfer UY
   */
  _parseAmountResponse(response) {
    const amounts = {};
    amounts.chargeAmount = {
      amount: this.get('exchangeRate', response) ? this.get('sentMoney.1.amount', response) : this.get('sentMoney.0.amount', response),
      currency: this.get('exchangeRate', response) ? this.get('sentMoney.1.currency', response) : this.get('sentMoney.0.currency', response)
    };
    amounts.amount = this.get('chargeAmount', amounts);
    amounts.sendCurrency = this.get('sentMoney.0.currency', response);
    amounts.exchangeRate = {
      key: 'cells-successful-response-exchange-rates',
      values: response.exchangeRate && response.exchangeRate.targetCurrency && response.exchangeRate.baseCurrency ? this._getExchangeRate(response.exchangeRate, response.sentMoney, true) : {},
      amounts: [
        {
          key: 'cells-successful-response-debit-amount',
          amount: this.get('chargeAmount.amount', response),
          currency: this.get('chargeAmount.currency', response)
        }
      ]
    };
    if (response.receiver?.contract?.contractType?.id === 'PREPAID_CARD') {
      amounts.exchangeRate.amounts.push(
        {
          key: 'cells-successful-response-prepaid-card-recharged-success',
          amount: this.get('exchangeRate', response) ? this.get('sentMoney.1.amount', response) : this.get('sentMoney.0.amount', response),
          currency: this.get('exchangeRate', response) ? this.get('sentMoney.1.currency', response) : this.get('sentMoney.0.currency', response)
        }
      );
    }
    return amounts;
  }

  /**
   * Parse response credit card payment
   */
  _parseCreditCardPayment(response, source, destination) {
    if (!response) {
      return;
    }
    const amount = this._getSetSentMoney(response.sentMoney);
    const contractTypeName = (this._getContractType(destination) || {}).name;
    const result = {
      transferType: this.transferType,
      id: response.ownTransferId,
      date: response.date,
      title: 'cells-successful-response-credit-card-payment-success',
      origin: {
        product: {
          id: this._getProductTypeOrDefault(destination),
          name: contractTypeName
        },
        avatar: {
          type: 'card',
          src: destination.imgSrc || ''
        }
      },
      fees: this.getFeesObject(response.fees, 'cells-successful-response-fees', 'cells-successful-response-credit-card-payment-no-fees'),
      topInfo: [ {
        value: contractTypeName,
        musk: {
          value: this._getDestinationNumber(destination),
          chars: 4,
          simbol: '•'
        },
        class: 'bold'
      }, ],
      bottomInfo: [{
        key: 'cells-successful-response-credit-card-payment-charge-account',
        value: source && source.name,
        class: 'bold'
      },
      {
        value: source && source.description && source.description.value,
        class: 'spacing cursive'
      },
      {
        key: 'cells-successful-response-operation-type',
        value: 'cells-successful-response-operation-type-credit-card-payment',
        class: 'inline'
      }
      ],
      operations: this._filterOperations(this.operations, response)
    };
    const amounts = this._parseAmountResponse(response);
    result.amount = amounts.chargeAmount;
    result.chargeAmount = amounts.chargeAmount;
    Object.assign(result, this._setHeaderAdditionalInfo(response.status));

    result.exchangeRate = this._getCreditCardPaymentExchageRate(amounts.exchangeRate);

    this._getCreditCardPaymentTaxes(response.taxes, result.fees);

    if (response.operationNumber) {
      result.bottomInfo.push({
        key: 'cells-successful-response-credit-card-payment-operation-number',
        value: response.operationNumber,
        class: 'inline'
      });
    }

    this._setSummaryInfo(result.topInfo, response);

    return result;
  }

  /**
   * Parse response own transfer
   */
  _parseOwnTransfer(response, source, destination) {
    if (!response) {
      return;
    }
    const amount = this._getSetSentMoney(response.sentMoney);
    const result = {
      transferType: this.transferType,
      id: response.ownTransferId,
      date: response.date,
      title: 'cells-successful-response-success',
      amountLabel: 'cells-successful-response-transfer-amount-label',
      origin: {
        product: {
          id: this._getProductTypeOrDefault(source),
          name: source && source.name
        },
        number: source && source.description && source.description.value
      },
      destination: {
        product: {
          id: this._getProductTypeOrDefault(destination),
          name: destination.alias || destination.name
        },
        number: destination.description && destination.description.value
      },
      fees: this.getFeesObject(response.fees, 'cells-successful-response-fees', 'cells-successful-response-no-fees'),
      topInfo: [],
      operations: this._filterOperations(this.operations, response)
    };
    const amounts = this._parseAmountResponse(response);
    result.amount = amounts.amount;
    result.chargeAmount = amounts.chargeAmount;
    result.exchangeRate = amounts.exchangeRate || {};
    this._setSummaryInfo(result.topInfo, response);

    return result;
  }

  /**
   * Parse response own transfer foreign currency
   */
  _parseOwnTransferForeignCurrency(response, source, destination, operationDetails) {
    if (!response) {
      return;
    }
    const result = {
      transferType: this.transferType,
      id: response.ownTransferId,
      date: response.date,
      title: 'cells-successful-response-success',
      amountLabel: 'cells-successful-response-amount-title-foreign-currency',
      origin: {
        product: {
          id: this._getProductTypeOrDefault(source),
          name: source && source.name
        },
        number: source && source.description && source.description.value
      },
      destination: {
        product: {
          id: this._getProductTypeOrDefault(destination),
          name: destination.alias || destination.name
        },
        number: destination.description && destination.description.value
      },
      topInfo: [],
      operations: this._filterOperations(this.operations, response)
    };

    result.chargeAmount = {
      amount: operationDetails.receivedAmount,
      currency: operationDetails.receivedCurrency,
      class: 'amount-huge-decimals'
    };

    this._setSummaryInfo(result.topInfo, response);

    result.exchangeRate = {
      key: 'cells-successful-response-exchange-rates',
      values: {
        baseCurrencySymbol: operationDetails.rateBaseCurrency,
        targetCurrencySymbol: operationDetails.rateCurrency,
        exchangeRate: operationDetails.rateAmount
      },
      amounts: [ {
        key: 'cells-successful-response-debit-amount-foreign-currency',
        amount: operationDetails.sentAmount,
        currency: operationDetails.sentCurrency
      } ]
    };

    result.topInfo = [{
      key: 'cells-successful-response-concept-foreign-currency',
      value: operationDetails.concept,
      class: 'bold spacing'
    },
    {
      key: 'cells-successful-response-id-or-reference-foreign-currency',
      value: response.operationNumber,
      class: 'bold spacing'
    }
    ];

    result.buttons = {
      primary: {
        text: 'cells-successful-response-next-foreign-currency',
        action: 'cells-successful-response-continue-foreign-currency'
      },
      secondary: {
        hidden: true
      }
    };

    return result;
  }

  /**
   * Parse response interbank transfer
   */
  _parseInterbankTransfer(response, source, destination) {
    if (!response) {
      return;
    }
    const transferInfo = ((this.transferExecutionType || {}).id || {}) === 'ONLINE' ? this.simulationResponse : response;

    const amount = this._getSetSentMoney(transferInfo.sentMoney);
    const result = {
      transferTypeOperation: this.transferType,
      id: response.interbankTransferId,
      date: transferInfo.date,
      title: 'cells-successful-response-success',
      amountLabel: 'cells-successful-response-transfer-amount-label',
      origin: {
        product: {
          id: this._getProductTypeOrDefault(source),
          name: source && source.name
        },
        number: this._getOriginNumber(source),
        contractId: source.id,
        productType: this._getContractType(source),
        numberType: this._getOriginNumberType(source)
      },
      destination: {
        product: {
          id: this._getProductTypeOrDefault(destination),
          name: destination.alias || destination.name
        },
        number: this._getDestinationNumber(destination),
        description: destination.bank && destination.bank.name,
        numberType: destination.numberType,
        productType: destination.productType,
        bank: destination.bank
      },
      fees: this.getFeesObject(transferInfo.fees, 'cells-successful-response-fees', 'cells-successful-response-no-fees'),
      topInfo: [],
      operations: this.operations
    };
    const amounts = this._parseAmountResponse(transferInfo);
    result.amount = amounts.amount;
    result.chargeAmount = amounts.chargeAmount;
    result.exchangeRate = amounts.exchangeRate || {};
    result.interbankTransferMode = transferInfo.interbankTransferMode;
    result.sendCurrency =  this.get('sendCurrency', amounts);
    this._setSummaryInfo(result.topInfo, transferInfo);
    return result;
  }

  /**
  * Get origin number type of the source
  */
  _getOriginNumberType(source) {
    return source && source.contract && source.contract.numberType;
  }

  /**
  * Get origin number of the source
  */
  _getOriginNumber(source) {
    return source && source.contract && source.contract.number;
  }

  /**
  * Get contract type
  */
  _getContractType(source) {
    return source && source.contract && source.contract.contractType;
  }

  /**
   * Parse response internal transfer
  */
  _parseInternalTransfer(response, source, destination) {
    if (!response) {
      return;
    }
    const amount = this._getSetSentMoney(response.sentMoney);
    const result = {
      transferType: this.transferType,
      id: response.internalTransferId,
      date: response.date,
      title: 'cells-successful-response-success',
      amountLabel: 'cells-successful-response-transfer-amount-label',
      origin: {
        product: {
          id: this._getProductTypeOrDefault(source),
          name: source && source.name
        },
        number: this._getOriginNumber(source),
        contractId: source.id,
        productType: this._getContractType(source),
        numberType: this._getOriginNumberType(source),
      },
      destination: {
        product: {
          id: this._getProductTypeOrDefault(destination),
          name: destination.alias || destination.name
        },
        number: this._getDestinationNumber(destination),
        description: destination.bank && destination.bank.name,
        numberType: destination.numberType,
        productType: destination.productType
      },
      fees: this.getFeesObject(response.fees, 'cells-successful-response-fees', 'cells-successful-response-no-fees'),
      topInfo: [],
      operations: this._filterOperations(this.operations, response)
    };
    const amounts = this._parseAmountResponse(response);
    result.amount = amounts.amount;
    result.chargeAmount = amounts.chargeAmount;
    result.exchangeRate = amounts.exchangeRate || {};
    this._setSummaryInfo(result.topInfo, response);
    result.internalTransferMode = response.internalTransferMode;
    result.sendCurrency = this.get('sendCurrency', amounts);
    return result;
  }

  /**
   * Get transfer execution type of simulation
   * @param {Object} simulation
  */
  _getSimulationTransferExecutionType(simulation) {
    if (this.get('transferExecutionTypes', simulation)) {
      this.dispatchEvent(new CustomEvent('set-transfer-execution-types', {
        bubbles: true,
        composed: true,
        detail: simulation.transferExecutionTypes
      }));
    }
  }

  /**
   * Assign taxes
   */
  _assignTaxes(simulation, response) {
    if (simulation.taxes) {
      response.taxes = this._getTaxes(simulation.taxes);
    }
  }

  /**
   * Assign fees
   */
  _assignFees(simulation, response, type) {
    if (simulation.fees) {
      Object.assign(response, this._getSimulationItemizeFees(simulation.fees, type));
    }
  }

  /**
   * Assign exchangeRate
   */
  _assignExchangeRate(simulation, response, type) {
    this.customExternalReference = this.get('customExternalReference', simulation);
    const simulationExchageRate = simulation.exchangeRate || {};
    if (simulationExchageRate.baseCurrency && simulationExchageRate.targetCurrency) {
      response.exchangeRate = {
        key: 'cells-summary-view-exchange-rate',
        values: this._getExchangeRate(simulationExchageRate, simulation.chargeAmount)
      };
    } else {
      const simulationExchageRateFactor = (simulationExchageRate.values || {}).factor;
      if (type === 'creditCardPayment' && simulationExchageRateFactor) {
        response.exchangeRate = this._getCreditCardPaymentExchangeRate(simulationExchageRateFactor, simulation.sentMoney);
      }
    }
  }

  _getExchangeRate(exchangeRate, chargeAmount, noFormat) {
    const baseCurrencySymbol = this._getCurrencyAsSymbol(this.localCurrency, this.get('baseCurrency', exchangeRate));
    const targetCurrencySymbol = this._getCurrencyAsSymbol(this.localCurrency, this.get('targetCurrency', exchangeRate));
    const amountPaid = chargeAmount;
    const amountPaidSymbol = this._getCurrencyAsSymbol(this.localCurrency, this.get('currency', chargeAmount));
    return  {
      baseCurrencySymbol: baseCurrencySymbol,
      targetCurrencySymbol: targetCurrencySymbol,
      exchangeRate: noFormat ? this.get('values.factor.value', exchangeRate) : this.getFormattedAmount(this.get('values.factor.value', exchangeRate), this.get('baseCurrency', exchangeRate), this.localCurrency, this.language, true, true, false),
      amountPaidSymbol: amountPaidSymbol,
      amountPaid: noFormat ? this.get('amount', amountPaid) : this.getFormattedAmount(this.get('amount', amountPaid), this.get('baseCurrency', exchangeRate), this.localCurrency, this.language, true, true, false)
    };
  }

  /**
   * Parse all transfers simulation
   */
  _parseSimulation(simulation, type) {
    const response = {};
    if (this.get('receiver', simulation) || this.get('transferExecutionTypes.length', simulation) <= 1) {
      response.transferType = this.transferType;
      response.id = simulation[type + 'Id'];
      response.status = simulation.status;
      response.amount = this._findAmountPaid(this.get('sentMoney', simulation)) ? this._findAmountPaid(this.get('sentMoney', simulation)) : this.get('chargeAmount', simulation);
      response.transferExecutionTypes = simulation.transferExecutionTypes;
      this._assignExchangeRate(simulation, response, type);
      this._assignTaxes(simulation, response);
      this._assignFees(simulation, response, type);
    } else {
      this._getSimulationTransferExecutionType(simulation);
    }
    return response;
  }

}

window.customElements.define(GlobalApisTransferDmUy.is, GlobalApisTransferDmUy);
