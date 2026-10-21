
/**
* @summary CELLS Data Manager for GLOBAL APIS MEXICO Transfer.
* @customElement
* @polymer
* @extends {Polymer.Element}
*/
/* global GlobalApisTransferDm */


class GlobalApisTransferDmMx extends GlobalApisTransferDm.mixin(Polymer.Element) {
  static get is() {
    return 'cells-dm-global-apis-transfer-mx';
  }

  static get properties() {
    return {
      /**
       * Indicates when stand in mode is on
       * @type {Boolean}
       */
      standIn: {
        type: Boolean,
        value: false
      }
    };
  }

  /**
  * Make own transfer
  * @param {Object} source
  * @param {Object} destination
  * @param {Object} money
  * @param {Object} sendCurrency
  * @param {Object} concept
  */
  makeOwnTransfer({ source, destination, money, sendCurrency, concept }) {
    this._doTransfer(source, destination, money, sendCurrency, concept, undefined, 'ownTransfer');
  }

  /**
  * Make simulation of own transfer
  * @param {Object} source
  * @param {Object} destination
  * @param {Object} money
  * @param {Object} sendCurrency
  * @param {Object} concept
  */
  makeOwnTransferSimulation({ source, destination, money, sendCurrency, concept }) {
    this._doTransfer(source, destination, money, sendCurrency, concept, true, 'ownTransfer');
  }

  /**
  * Make internal transfer
  * @param {Object} source
  * @param {Object} destination
  * @param {Object} money
  * @param {Object} sendCurrency
  * @param {Object} concept
  * @param {Object} frequentOperationId
  * @param {Object} reason
  */
  makeInternalTransfer({ source, destination, money, sendCurrency, concept, frequentOperationId, reason }) {
    this._doTransfer(source, destination, money, sendCurrency, concept, false, 'internalTransfer', frequentOperationId, reason);
  }

  /**
  * Make interbank transfer
  * @param {Object} source
  * @param {Object} destination
  * @param {Object} money
  * @param {Object} sendCurrency
  * @param {Object} concept
  * @param {Object} frequentOperationId
  * @param {Object} reason
  * @param {Object} operationType
  */
  makeInterbankTransfer({ source, destination, money, sendCurrency, concept, frequentOperationId, reason, operationType }) {
    this._doTransfer(source, destination, money, sendCurrency, concept, false, 'interbankTransfer', frequentOperationId, reason, operationType);
  }

  /**
   * Get request params
   * @param {Object} _type
   * @param {Object} sourcen
   * @param {Object} destinationn
   * @param {Object} moneyn
   * @param {Object} sendCurrencyn
   * @param {Object} conceptn
   * @param {Boolean} simulatedn
   * @param {Object} reason
   * @param {Object} operationType
   * @return {Object}
   */
  _getParams(_type, source, destination, money, sendCurrency, concept, simulated, reason, operationType) {
    if (_type && source && destination && money) {
      const params = {
        host: this.host,
        body: this['_generate' + _type + 'Body'](source, destination, money, sendCurrency, concept, reason, operationType),
        version: this.transfersApiVersion,
        requiredToken: this.requiredToken,
        native: this.native
      };

      if (typeof simulated === 'boolean') {
        Object.assign(params, { params: { simulated: simulated } });
      }

      if (this.secondFactorToken) {
        params.headers = {
          Authorization: this.secondFactorToken
        };
      }
      return params;
    }
  }

  /**
   * Generate request body
   * @param {Object} source
   * @param {Object} destination
   * @param {Object} money
   * @param {Object} sendCurrency
   * @param {Object} concept
   * @return {Object}
   */
  _generateOwnTransferBody(source, destination, money, sendCurrency, concept) {
    const body = {
      concept: this.c(concept, 'concept'),
      sender: { contract: this.c(source, 'contract') },
      receiver: { contract: this.c(destination, 'contract') },
      sentMoney: [
        {
          amount: money,
          currency: sendCurrency
        }
      ]
    };
    return body;
  }

  /**
  * Generate body of internal request
  * @param {Object} source
  * @param {Object} destination
  * @param {Object} money
  * @param {Object} sendCurrency
  * @param {Object} concept
  * @return {Object}
  */
  _generateInternalTransferBody(source, destination, money, sendCurrency, concept) {
    const internalTransferMode = concept && concept.movementId ? {id: concept.movementId} : undefined;
    const body = {
      concept: concept && concept.concept || undefined,
      internalTransferMode,
      sendCurrency: sendCurrency,
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
          alias: destination.name,
          bank: {id: ((destination || {}).bank || {}).id},
          contractType: {
            id: this._getProductTypeId(destination.productType),
            name: destination.productType && destination.productType.name
          },
          number: destination.number,
          numberType: destination.numberType,
          productType: destination.productType
        },
        holder: {
          holderName: this._getDestinationName(destination)
        }
      },
      sentMoney: [
        {
          amount: money,
          currency: source.primaryAmount.currency
        }
      ],
      customExternalReference: concept && concept.reference || undefined
    };
    return body;
  }

  /**
  * Modifies interbank transfer body in case the operationType has id
  * @param {Object} body
  * @param {Object} operationType
  * @return {Object}
  */
  _getOperationType(body, operationType) {
    if (operationType?.id) {
      body.operationType = operationType;
    }
    return body;
  }

  /**
  * Generate body of interbank request
  * @param {Object} source
  * @param {Object} destination
  * @param {Object} money
  * @param {Object} sendCurrency
  * @param {Object} concept
  * @param {Object} operationType
  * @return {Object}
  */
  _generateInterbankTransferBody(source, destination, money, sendCurrency, concept, reason, operationType) {
    let body = {
      concept: concept && concept.concept || 'Sin concepto',
      interbankTransferMode: {id: concept && concept.movementId || undefined},
      sendCurrency: sendCurrency,
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
          alias: destination.name,
          bank: this._bankDestinationRequest(destination),
          contractType: {
            id: this._getProductTypeId(destination.productType),
            name: destination.name
          },
          number: destination.number,
          numberType: destination.numberType,
          productType: destination.productType,
          specificProductType: destination.specificProductType
        },
        holder: {
          holderName: destination.alias,
        }
      },
      sentMoney: [
        {
          amount: money,
          currency: source.primaryAmount.currency
        }
      ],
      customExternalReference: concept && concept.reference || undefined,
    };

    if (!this.c(concept, 'movementId')) {
      delete body.interbankTransferMode;
    }

    if (reason) {
      body.reason = reason;
    }

    body = this._getStandInBodyAddition(body, destination);
    body = this._getOperationType(body, operationType);

    return body;
  }

  /**
   * Makes a request to the destination bank.
   * @param {Object} destination - The parameters for the request.
   * @return {Object} Returns a object that resolves with the response from the request.
   */
  _bankDestinationRequest(destination) {
    return {
      id: this.get('bank.id', destination) || '',
      name: this.get('bank.name', destination) || ''
    };
  }

  /**
   * Modifies interbank transfer body in case the stand in mode is on
   * @param {Object} body
   * @param {Object} destination
   * @returns {Object} - updated body for stand in
   */
  _getStandInBodyAddition(body, destination) {
    if (!this.standIn) {
      return body;
    }

    const editedBody = { ...body };
    editedBody.receiver.alias = destination.alias;
    editedBody.receiver.contract.bank.name = destination.bank.name;
    editedBody.receiver.holder.holderName = destination.alias;
    editedBody.sender.contract.numberType.id = 'CCC';

    return editedBody;
  }

  /**
   * Parse response for internal transfer
   * @param {Object} response
   * @param {Object} source
   * @param {Object} destination
   * @return {object}
   */
  _parseOwnTransfer(response, source, destination) {
    if (Object.keys(response).length) {
      const result = this._getTransferResult(response, source, destination);
      result.id = response.ownTransferId;
      result.operationNumber = response.operationNumber;
      result.operations = this._filterOperations(this.operations, response);
      return result;
    }
  }

  _parseInternalTransfer(response = {}, source, destination) {
    if (Object.keys(response).length) {
      const result = this._getTransferResult(response, source, destination);
      result.id = response.internalTransferId;
      result.operationNumber = response.operationNumber;
      result.operations = this._filterOperations(this.operations, response);
      return result;
    }
  }

  _parseInterbankTransfer(response = {}, source, destination) {
    if (Object.keys(response).length) {
      const result = this._getTransferResult(response, source, destination);
      result.id = this.get('interbankTransferId', response);
      result.operationNumber = this.get('operationNumber', response);
      result.references = this.get('references', response);
      result.operations = this._filterOperations(this.operations, response);
      return result;
    }
  }

  /**
   * Gets transfer result
   * @param {Object} response
   * @param {Object} source
   * @param {Object} destination
   * @return {Object}
   */
  _getTransferResult(response, source, destination) {
    const result = {
      date: response.date,
      title: 'cells-successful-response-success',
      origin: {
        product: {
          id: this._getProductTypeOrDefault(source),
          name: this.get('name', source)
        },
        number: this.get('contract.number', source)
      },
      destination: {
        product: {
          id: this._getProductTypeOrDefault(destination),
          name: this.get('alias', destination) || this.get('name', destination)
        },
        number: this._getDestinationNumber(destination),
        description: this.get('bank.name', destination)
      },
      fees: this.getFeesObject(
        response.fees,
        'cells-successful-response-fees',
        'cells-successful-response-no-fees'
      ),
      topInfo: [],
    };
    const amount = this._getSetSentMoney(response.sentMoney);
    const amounts = this._parseAmountResponse(amount, response);
    result.amount = amounts.amount;
    result.chargeAmount = amounts.amount;
    result.exchangeRate = Object.assign({}, amounts.exchangeRate);
    this._setSummaryInfo(result.topInfo, response);
    return result;
  }

  /**
   * @description set body for mobile transfer
   * @param {Object} source
   * @param {Object} destination
   * @param {Number} money
   * @param {String} sendCurrency
   * @param {String} concept
   * @returns {Object}
   */
  _generateMobileTransferBody(source, destination, money, sendCurrency, concept) {
    return {
      concept,
      sender: {
        contract: {
          number: this.c(source, 'contract.number'),
          numberType: this.c(source, 'contract.numberType')
        }
      },
      sentMoney: [
        {
          amount: money,
          currency: sendCurrency
        }
      ],
      receiver: {
        mobile: this.c(destination, 'number'),
        mobileCompany: { id: this.c(destination, 'mobileCompany') }
      }
    };
  }

  /*
   * Service for managing the transfer of amounts
   */
  postInternationalTransfers(body) {
    const service = this._getNpmService('Transfers', this.transfersApiVersion, 'InternationalTransfersPost', {
      host: this.host,
      body: body,
      version: this.transfersApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });

    service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.dispatchEvent(new CustomEvent('success-on-post-international-transfers', {
        bubbles: true,
        composed: true,
        detail: response
      }));
    }, this._generateErrorFireEventHandler('error-on-post-international-transfers'));
  }

  /**
   *
   * @param {Object} body
   * @description attributes in body are:
   * concept String
   * sender Object
   * receiver Object
   * sentMoney Array
   * chargeAmount Object
   * references Array
   * exchangeRate Object
   *
   */
  makeOwnTransferForeignCurrency(body) {
    const service = this._getNpmService('Transfers', this.transfersApiVersion, 'OwnTransfersPost', {
      host: this.host,
      body: body,
      params: {},
      version: this.transfersApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });

    service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.dispatchEvent(new CustomEvent('success-make-own-transfer-foreign-currency', {
        bubbles: true,
        composed: true,
        detail: response
      }));
    }, this._generateErrorFireEventHandler('error-make-own-transfer-foreign-currency'));
  }
}

window.customElements.define(GlobalApisTransferDmMx.is, GlobalApisTransferDmMx);
