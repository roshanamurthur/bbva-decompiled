/*eslint new-cap: 0*/
/*global BGADPCards*/
/*global BGADPArCardsV0*/
/*global BGADPCardsV0*/
/*global BGADPCardsV1*/
/*global BGADPPeCardsV0*/
/*global NPMBGADPCardsV1*/
/**
 * # cells-dm-global-apis-cards-bgadpmock
 * ![Certificated](https://img.shields.io/badge/certificated-yes-brightgreen.svg) ![Polymer 2.x](https://img.shields.io/badge/Polymer-2.x-green.svg)
 * [Demo of component in Cells Catalog](https://catalogs.platform.bbva.com/cells)
 *
 * CELLS Data Manager for GLOBAL APIS Cards.
 * Example:
 *
 * ```html
 * <cells-dm-global-apis-cards-bgadpmock></cells-dm-global-apis-cards-bgadpmock>
 * ```
 * @polymer
 * @customElement
 * @summary CELLS Data Manager for GLOBAL APIS Cards
 * @extends {Polymer.Element}
 * @demo demo/index.html
 */
class CellsDmGlobalApisCardsBGADPMock extends Polymer.mixinBehaviors([
  CellsBehaviors.CellsGlobalApisHandleRequest,
  CellsBehaviors.CellsGlobalApisHandleRequestSign,
  CellsBehaviors.CellsGlobalApisHandleRequestError,
  CellsBehaviors.CellsGlobalApisServiceGetter
], Polymer.Element) {
  static get is() {
    return 'cells-dm-global-apis-cards-bgadpmock';
  }
  static get properties() {
    return {
      /**
       * Chosen domain to make requests.
       */
      host: String,
      /**
       * Additional headers for the request
       * @type {Object}
       */
      headers: Object,
      /**
       * Card Id
       */
      cardId: String,
      /**
       * Card
       */
      card: {
        type: Object,
        notify: true
      },
      /**
       * Cards list
       */
      cards: {
        type: Array,
        notify: true
      },
      /**
       * CVV
       */
      cvv: {
        type: Object,
        notify: true
      },
      /**
       * Card Financial Statements
       */
      cardFinancialStatements: {
        type: Array,
        notify: true
      },
      /**
       * Card Financial Statements Balances
       */
      cardFinancialStatementsBalances: {
        type: Array,
        notify: true
      },
      /**
       * Balances
       */
      balances: {
        type: Array,
        notify: true
      },
      /**
       * Card transactions
       */
      transactions: {
        type: Array,
        notify: true
      },
      /**
       * Transaction id
       */
      transactionsId: String,
      /**
       * Transaction detail object
       */
      transactionDetail: {
        type: Object,
        notify: true
      },
      /**
       * Offer id
       */
      offerId: String,
      /**
       * Limit id
       */
      limitId: String,
      /**
       * Offers detail object
       */
      offerDetail: {
        type: Object,
        notify: true
      },
      /**
       * Cash Advances object
       */
      cashAdvances: {
        type: Object,
        notify: true
      },
      /**
       * Offers simulation object
       */
      offerSimulation: {
        type: Object,
        notify: true
      },
      /**
       * Card Offer
       * @type  {Object}
       */
      cardOffer: {
        type: Object,
        notify: true
      },
      /**
       * Get limits response object
       */
      getLimitsResponse: {
        type: Object,
        notify: true
      },
      /**
       * Put limits response object
       */
      putLimitsResponse: {
        type: Object,
        notify: true
      },
      /**
      * Put block response object
      */
      putCardBlockResponse: {
        type: Object,
        notify: true
      },

      /**
       * Indicator params for get card indicators
       * @type {Object}
       */
      indicatorParams: {
        type: Object,
        value: () => ({})
      },

      /**
      * Get block types response object
      */
      getCardBlockTypesResponse: {
        type: Object,
        notify: true
      },
      /**
       * Card activations
       */
      cardActivations: {
        type: Array,
        notify: true
      },
      /**
      * Get cards related contracts response object
      */
      relatedContracts: {
        type: Object,
        notify: true
      },

      /**
       * Suggested Cards
       */
      suggestCards: {
        type: Array,
        notify: true
      },
      /**
       * Cards API version
       */
      cardsApiVersion: {
        type: String,
        value: '0'
      },
      /**
       * Native requests
       */
      native: {
        type: Boolean,
        value: false
      },
      /**
       * requiredToken, 'jwt' or 'tsec' or empty
       */
      requiredToken: {
        type: String,
        value: 'tsec'
      },
      /**
       * Public key for api calls
       * @type  {String}
       */
      publicKey: {
        type: String,
        value: ''
      },
      /**
       * Info card proposals
       * @type  {Object}
       */
      cardProposals: {
        type: Object,
        notify: true
      },
      /**
       * Response of cardsCardsProposals post
       * @type {Object}
       */
      cardsCardsProposals: {
        type: Object,
        notify: true
      },

      /**
       * Format to decrypt cvv
       * @type  {String}
       */
      cvvParseFormat: {
        type: String,
        value: 'f#f#f#4040404040'
      },
      /**
       * Load pages until empty page is reached
       */
      loadPagesUntilEmptyPage: {
        type: Boolean,
        value: false
      },
      /**
       * An empty page was reached
       */
      emptyPageReached: {
        type: Boolean,
        value: false
      },
      /**
       * Transactions empty is not required
       */
      transactionsEmptyIsRequired: {
        type: Boolean,
        value: false
      },
      /**
       * Token used when the operation required second token authentication
       */
      secondFactorToken: {
        type: String
      },
      /**
       * Id to generate valid block card request
       */
      blockId: {
        type: String,
        value: ''
      },
      /**
       * flag to indicate if token validation is per service
       * @type {Boolean}
       */
      forbiddenFromService: {
        type: Boolean,
        value: false
      },
      /**
       * Number used as exponent in the algorithm to encrypt the PIN.
       * @type  {String}
       */
      publicKeyExponent: {
        type: String,
        value: '010001'
      },
      /**
       * Transaction select ID
       * @type {String}
       */
      transactionId: {
        type: String
      }
    };
  }
  /**
   * Get all customer cards
   */
  getAllCards(params, cards = []) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsGet', {
      headers: this.headers || {},
      host: this.host,
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      params: params,
      native: this.native
    });

    return service.generateRequest().then(
      function() {
        const response = this._parseResponse(service.getLastResponse()) || [];

        let newCards = response.concat(cards);
        if (this.nextKey) {
          let newParams = Object.assign(params || {}, { paginationKey: this.nextKey });
          this.getAllCards(newParams, newCards);
        } else {
          this.set('cards', newCards);
          this.dispatchEvent(new CustomEvent('set-cards', {
            detail: newCards,
            bubbles: true,
            composed: true
          }));
          return newCards;
        }
      }.bind(this),
      this._generateErrorFireEventHandler('error-on-get-cards')
    );
  }

  /**
   * Get cards
   */
  getCards(params) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsGet', {
      host: this.host,
      headers: this.headers || {},
      params: params,
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });
    return service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.set('cards', response);
      this.dispatchEvent(new CustomEvent('set-cards', {
        bubbles: true,
        composed: true,
        detail: response
      }));
      return response;
    }, this._generateErrorFireEventHandler('error-on-get-cards'));
  }
  /**
   * Get Card
   */
  getCard(params = {}) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardGet', {
      host: this.host,
      headers: this.headers || {},
      params: Object.assign({ 'card-id': this.cardId }, params),
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });
    return service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.set('card', response);
      this.dispatchEvent(new CustomEvent('set-card', {
        bubbles: true,
        composed: true,
        detail: response
      }));
      return response;
    }, this._generateErrorFireEventHandler('error-on-get-card'));
  }

  /**
   * Get Card Conditions
   */
  getCardConditions(params = {}) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardConditionsGet', {
      host: this.host,
      headers: this.headers || {},
      params: Object.assign({ 'card-id': this.cardId }, params),
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });
    return service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.dispatchEvent(new CustomEvent('set-card-conditions', {
        bubbles: true,
        composed: true,
        detail: response
      }));
      return response;
    }, this._generateErrorFireEventHandler('error-on-get-card-conditions'));
  }


  /**
   * Get card participants
   * @param {Object} params
   */
  getCardParticipants(params = {}) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardParticipantsGet', {
      host: this.host,
      headers: this.headers || {},
      params: Object.assign({ 'card-id': this.cardId }, params),
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });
    return service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.dispatchEvent(new CustomEvent('set-card-participants', {
        bubbles: true,
        composed: true,
        detail: response
      }));
      return response;
    }, this._generateErrorFireEventHandler('error-on-get-card-participants'));
  }


  /**
   * Get Card Financial Statements
   */
  getCardFinancialStatements(cardId) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardFinancialStatementsGet', {
      host: this.host,
      headers: this.headers || {},
      params: { 'card-id': cardId || this.cardId },
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });

    service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.cardFinancialStatements = response;
      this.dispatchEvent(new CustomEvent('set-card-financial-statements', {
        bubbles: true,
        composed: true,
        detail: response
      }));
    }, this._generateErrorFireEventHandler('error-on-get-card-financial-statements'));
  }

  /**
   * Get Card Financial Statements Balances
   */
  getCardFinancialStatementsBalances(cardId) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardFinancialStatementsBalancesGet', {
      host: this.host,
      headers: this.headers || {},
      params: { 'card-id': cardId || this.cardId },
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });

    service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.cardFinancialStatementsBalances = response;
      this.dispatchEvent(new CustomEvent('set-card-financial-statements-balances', {
        bubbles: true,
        composed: true,
        detail: response
      }));
    }, this._generateErrorFireEventHandler('error-on-get-card-financial-statements-balances'));
  }

  /**
   * Get Card Financial Statement PDF Data
   */
  getCardFinancialStatementPdf(params) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardFinancialStatementsFinancialStatementGet', {
      host: this.host,
      headers: {
        'Content-Type': 'application/pdf',
        'Accept': '*/*'
      },
      params: params,
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native,
      responseType: this.responseType
    });

    service.generateRequest().then((data) => {
      const response = data.responseObject;
      this.dispatchEvent(new CustomEvent('set-card-financial-statement-pdf', {
        bubbles: true,
        composed: true,
        detail: response
      }));
    }, this._generateErrorFireEventHandler('error-on-get-card-financial-statement-pdf'));
  }

  /**
   * Get Card Indicators
   */
  getCardIndicators(cardId) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardIndicatorsGet', {
      host: this.host,
      headers: this.headers || {},
      params: { 'card-id': cardId || this.cardId, ...this.indicatorParams },
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });

    service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.cardIndicators = response;
      this.dispatchEvent(new CustomEvent('set-card-indicators', {
        bubbles: true,
        composed: true,
        detail: response
      }));
      return response;
    }, this._generateErrorFireEventHandler('error-on-get-card-indicators'));
  }

  /**
   * Get Card CVV
   */
  getCardCvv(id) {
    if (this.publicKey && this.publicKey !== '') {
      const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardSecurityDataGet', {
        host: this.host,
        headers: this.headers || {},
        params: {
          'card-id': id,
          'publicKey': this.publicKey
        },
        version: this.cardsApiVersion,
        requiredToken: this.requiredToken,
        native: this.native
      });
      service.generateRequest().then(() => {
        const response = this._parseResponse(service.getLastResponse());
        this.dispatchEvent(new CustomEvent('parse-card-cvv', {
          bubbles: true,
          composed: true,
          detail: {
            value: response.length ? response[0].code : '',
            format: this.cvvParseFormat
          }
        }));
      }, this._generateErrorFireEventHandler('error-on-get-card-cvv'));
    } else {
      this.dispatchEvent(new CustomEvent('error-on-get-card-cvv-no-public-key', {
        bubbles: true,
        composed: true
      }));
    }
  }

  /**
   * Cards balances
   */
  getCardsBalances(params) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsBalancesGet', {
      host: this.host,
      headers: this.headers || {},
      params: params,
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });
    return service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse()) || [];
      this.set('balances', response);
      this.dispatchEvent(new CustomEvent('set-cards-balances', {
        bubbles: true,
        composed: true,
        detail: response
      }));
    }, this._generateErrorFireEventHandler('error-on-get-cards-balances'));
  }

  /**
  * PATCH payment-methods /cards/v1/cards/{card-id}/balances
  * @param {Object} body
  * @event set-cards-cards-balances
  * @event error-on-get-cards-cards-balances
  */
  getCardsCardsBalances(body) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardBalancesGet', {
      host: this.host,
      headers: this.headers,
      version: this.cardsApiVersion,
      params: Object.assign({
        'card-id': this.cardId,
      }),
      body,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'set-cards-cards-balances', 'error-on-get-cards-cards-balances');
  }
  /**
   * Cards activations
   * @param {String} id
   */
  getCardActivations(id) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardActivationsGet', {
      host: this.host,
      headers: this.headers || {},
      params: { 'card-id': id },
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });
    return service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse()) || [];
      this.set('cardActivations', response);
      this.dispatchEvent(new CustomEvent('set-card-activations', {
        bubbles: true,
        composed: true,
        detail: response
      }));
    }, this._generateErrorFireEventHandler('error-on-get-card-activations'));
  }

  /**
   * Update alias
   */
  patchCardAlias(alias) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardPatch', {
      host: this.host,
      headers: this.headers || {},
      body: { alias: alias },
      params: Object.assign({ 'card-id': this.cardId }),
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });
    return service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.set('card', response);
      this.dispatchEvent(new CustomEvent('patch-alias', {
        bubbles: true,
        composed: true,
        detail: alias
      }));
      this.dispatchEvent(new CustomEvent('patch-card', {
        bubbles: true,
        composed: true,
        detail: response
      }));
    }, this._generateErrorFireEventHandler('error-on-patch-card'));
  }

  /**
   * Update card
   */
  patchCardStatus(params) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardPatch', {
      host: this.host,
      headers: this.headers || {},
      body: params,
      params: Object.assign({ 'card-id': this.cardId }),
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'patch-card-status', 'error-on-patch-card-status', []);
  }

  /**
   * Patch card activations
   * @param {String} id
   * @param {Array} body
   * @param {String} apiVersion
   * @event patch-activations-successful
   * @event error-on-patch-card-activations
   */
  patchCardActivations(id, body, apiVersion = this.cardsApiVersion) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardActivationsPatch', {
      host: this.host,
      headers: this.headers || {},
      body: body,
      params: Object.assign({ 'card-id': id }),
      version: apiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });
    this._getGeneratedRequest(service, 'patch-activations-successful', 'error-on-patch-card-activations');
  }

  /**
   * Override patchCardActivations for call method directly with cells channel
   * @param {String} id
   * @param {Array} body
   * @param {String} apiVersion
   */
  patchCardActivationsWithParams({ id, body, apiVersion }) {
    this.patchCardActivations(id, body, apiVersion);
  }

  /**
   * Resource for managing an operational activation related to a card
   * @param {Object} params
   * {
   *    activationId: 'ON_OFF',
   *    body: { isActive : true }
   * }
   * @event patch-activations-successful
   * @event error-on-patch-card-activations
   */
  patchCardActivationWithParams(params) {
    if (params.activationId && params.body) {
      this.patchCardActivation(this.cardId, params.activationId, params.body);
    }
  }

  /**
   * Patches an specific card activation
   * @param {*} cardId
   * @param {*} activationId
   * @param {*} body
   */
  patchCardActivation(cardId, activationId, body) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardActivationsActivationPatch', {
      host: this.host,
      headers: this.headers || {},
      body: body,
      params: Object.assign({ 'card-id': cardId, 'activation-id': activationId }),
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });

    if (this.secondFactorToken) {
      service.headers = service.headers || {};
      service.headers.Authorization = this.secondFactorToken;
    }

    return service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      if (response.activationId) {
        const newCardActivations = this.cardActivations || [];
        const activationIndex = newCardActivations.findIndex(activation => activation.activationId === activationId);
        if (activationIndex !== -1) {
          newCardActivations[activationIndex].isActive = body.isActive;
        }
        this.set('cardActivations', newCardActivations);
        this.dispatchEvent(new CustomEvent('patch-activations-successful', {
          bubbles: true,
          composed: true,
          detail: newCardActivations
        }));
      }
    }, this._generateErrorFireEventHandler('error-on-patch-card-activations'));
  }


  /**
   * Get card installments plans
   */
  getInstallmentsPlans(params) {
    const service = this._getTransactionsService(params, 'CardsCardInstallmentsPlansGet');
    service.generateRequest().then(
      this._handleGetTransactionsSuccess.bind(this, service),
      this._generateErrorFireEventHandler('error-on-get-card-transactions')
    );
  }

  /**
   * Get card transactions
   */
  getTransactions(params) {
    const service = this._getTransactionsService(params);
    service.generateRequest().then(
      this._handleGetTransactionsSuccess.bind(this, service),
      this._generateErrorFireEventHandler('error-on-get-card-transactions')
    );
  }

  _getTransactionsService(params, apiPath = 'CardsCardTransactionsGet') {
    return this._getNpmService('Cards', this.cardsApiVersion, apiPath, {
      host: this.host,
      headers: this.headers || {},
      params: Object.assign({ 'card-id': this.cardId }, params),
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });
  }

  _handleGetTransactionsSuccess(service) {
    const response = this._parseResponse(service.getLastResponse()) || [];
    if (response.length === 0 && !this.transactionsEmptyIsRequired) {
      this._onEmptyPageReached();
    } else {
      this.set('transactions', response);
      this.dispatchEvent(new CustomEvent('set-card-transactions', {
        bubbles: true,
        composed: true,
        detail: response
      }));
    }
  }

  /**
   * Empty page reached event handler
   */
  _onEmptyPageReached() {
    this.emptyPageReached = true;
    this.loading = false;
    if (this.page) {
      this.dispatchEvent(new CustomEvent('empty-page-reached', {
        bubbles: true,
        composed: true
      }));
    } else {
      this.set('transactions', []);
      this.dispatchEvent(new CustomEvent('set-card-transactions', {
        bubbles: true,
        composed: true,
        detail: this.transactions
      }));
    }
  }

  /**
   * Get more installments plans
   */
  getMoreInstallmentsPlans(params) {
    this._getTransactionsNextPage(params, this.getInstallmentsPlans);
  }

  /**
  * Get more pages transactions service
  */
  getMoreTransactions(params) {
    this._getTransactionsNextPage(params);
  }

  _getTransactionsNextPage(params, callback = this.getTransactions) {
    let syncPage = this.page && (this.pagination || {}).page === this.page;
    if (!syncPage) {
      this._generatePagination(this.pagination || { page: 0 });
    }

    this._checkEmptyPageReached();

    let validPage = this.loadPagesUntilEmptyPage || this.page <= this.totalPages;

    if (!this.emptyPageReached && this.pagination && validPage && this.nextKey) {
      this.dispatchEvent(new CustomEvent('get-more-data', {
        detail: true,
        bubbles: true,
        composed: true
      }));

      let allParams = Object.assign(params || {}, { expand: '&paginationKey=' + this.nextKey });
      callback.call(this, allParams);
    }
  }

  /**
  * Check if empty page was reached
  */
  _checkEmptyPageReached() {
    if (this.loadPagesUntilEmptyPage && this.pagination.totalElements < this.pagination.pageSize) {
      this._onEmptyPageReached();
    }
  }

  /**
   * Get card transaction detail
   */
  getTransactionDetail() {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardTransactionsTransactionGet', {
      host: this.host,
      headers: this.headers || {},
      params: Object.assign({
        'card-id': this.cardId,
        'transaction-id': this.transactionId
      }),
      requiredToken: this.requiredToken,
      native: this.native,
      version: this.cardsApiVersion
    });
    service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse()) || {};
      response.operations = [
        {
          label: 'cells-successful-response-card-detail-share',
          id: 'share',
          icon: 'coronita:share',
          operative: (response.transactionType || {}).id === 'PURCHASE' ? 'cardPurchaseDetail' : 'cardBasicDetail'
        }
      ];
      this.set('transactionDetail', response);
      this.dispatchEvent(new CustomEvent('set-card-transaction-detail', {
        bubbles: true,
        composed: true,
        detail: response
      }));
    }, this._generateErrorFireEventHandler('error-on-get-card-transaction-detail'));
  }

  /**
  * Get card trasaction defer movements simulate
  */
  getTransactionDeferMovementsSimulate(body) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardTransactionsDeferMovementsSimulatePost', {
      host: this.host,
      version: this.cardsApiVersion,
      params: Object.assign({
        'card-id': this.cardId
      }),
      body,
      requiredToken: this.requiredToken,
      native: this.native
    });
    service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.dispatchEvent(new CustomEvent('get-card-transaction-defer-movements-simulate-succes', {
        detail: response,
        bubbles: true,
        composed: true
      }));
    }, this._generateErrorFireEventHandler('get-card-transaction-defer-movements-simulate-error'));
  }

  /**
  * Post card trasaction defer movements
  */
  getTransactionDeferMovements(body) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardTransactionsDeferMovementsPost', {
      host: this.host,
      version: this.cardsApiVersion,
      params: Object.assign({
        'card-id': this.cardId
      }),
      body,
      requiredToken: this.requiredToken,
      native: this.native
    });
    service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.dispatchEvent(new CustomEvent('get-card-transaction-defer-movements-succes', {
        detail: response,
        bubbles: true,
        composed: true
      }));
    }, this._generateErrorFireEventHandler('get-card-transaction-defer-movements-error'));
  }

  /**
   * Get card offers detail
   */
  getCardCashAdvances(params) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardCashAdvancesPost', {
      host: this.host,
      headers: this.headers || {},
      params: Object.assign({ 'card-id': this.cardId }),
      body: params,
      requiredToken: this.requiredToken,
      native: this.native,
      version: this.cardsApiVersion
    });
    service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.set('cashAdvances', response);
      this.dispatchEvent(new CustomEvent('set-card-cash-advances', {
        detail: response,
        bubbles: true,
        composed: true
      }));
    }, this._generateErrorFireEventHandler('error-on-get-card-cash-advances'));
  }

  /**
   * get card offer
   * @param {String} offerId
   */
  getCardOffer(offerId) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsOffersOfferGet', {
      params: Object.assign({
        'offer-id': offerId
      }),
      host: this.host,
      native: this.native,
      headers: this.headers || {},
      requiredToken: this.requiredToken,
      version: this.cardsApiVersion
    });

    this._getGeneratedRequest(service, 'get-card-offer-data-success', 'get-card-offer-data-error');
  }

  /**
   * Get card offers detail
   */
  getOfferDetail() {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardOffersOfferGet', {
      host: this.host,
      headers: this.headers || {},
      params: Object.assign({
        'card-id': this.cardId,
        'offer-id': this.offerId
      }),
      requiredToken: this.requiredToken,
      native: this.native
    });
    service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.set('offerDetail', response);
      this.dispatchEvent(new CustomEvent('set-card-offer-detail', {
        detail: response,
        bubbles: true,
        composed: true
      }));
    }, this._generateErrorFireEventHandler('error-on-get-card-offer-detail'));
  }

  /**
  * Get card offers detail
  */
  getOfferSimulation(offer) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardOffersOfferSimulationsPost', {
      host: this.host,
      headers: this.headers || {},
      params: Object.assign({
        'card-id': this.cardId,
        'offer-id': this.offerId
      }),
      body: offer,
      requiredToken: this.requiredToken,
      native: this.native
    });
    service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.set('offerSimulation', response);
      this.dispatchEvent(new CustomEvent('set-card-offer-simulation', {
        detail: response,
        bubbles: true,
        composed: true
      }));
    }, this._generateErrorFireEventHandler('error-on-get-card-offer-simulation'));
  }
  /**
   * Get card offers simulation
   */
  postOfferSimulation(offer, offerId) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsOffersOfferSimulationsPost', {
      host: this.host,
      headers: this.headers || {},
      params: Object.assign({
        'offer-id': offerId
      }),
      body: offer,
      requiredToken: this.requiredToken,
      native: this.native,
      version: this.cardsApiVersion
    });

    service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.dispatchEvent(new CustomEvent('success-post-offer-simulation', {
        detail: response,
        bubbles: true,
        composed: true
      }));
    }).catch((error) => {
      this.dispatchEvent(new CustomEvent('error-on-post-offer-simulation', {
        detail: error?.response,
        bubbles: true,
        composed: true
      }));
    });
  }
  /*
  * POST /offers/generate
  */
  postOffersGenerateValidaton(body) {
    const service = this._getNpmService('PeCards', this.cardsApiVersion, 'PeCardsOffersGeneratePost', {
      host: this.host,
      version: this.cardsApiVersion,
      body,
      requiredToken: this.requiredToken,
      native: this.native
    });
    service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.dispatchEvent(new CustomEvent('get-cards-offers-generate-succes', {
        detail: response,
        bubbles: true,
        composed: true
      }));
    }, this._generateErrorFireEventHandler('get-cards-offers-generate-error'));
  }
  /**
   * POST payments enrollment
   */
  postOfferEnrollment(body) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardOffersOfferEnrollmentsPost', {
      host: this.host,
      headers: this.headers,
      params: Object.assign({
        'card-id': this.cardId,
        'offer-id': this.offerId
      }),
      version: this.cardsApiVersion,
      body,
      native: this.native,
      requiredToken: this.requiredToken,
    });
    this._getGeneratedRequest(service, 'set-card-offer-enrollment', 'error-on-get-card-offer-enrollment');
  }

  /**
   * POST payments simulation
   */
  postPaymentSimulation(body) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardPaymentsSimulatePost', {
      host: this.host,
      headers: this.headers,
      params: Object.assign({
        'card-id': this.cardId === '' ? body.cardId : this.cardId,
      }),
      version: this.cardsApiVersion,
      body,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'set-cards-payments-simulate', 'error-on-post-cards-payments-simulate');
  }

  /**
   * POST payments /cards/v1/cards/{card-id}/payments
   * @param {Object} body
   * @event set-cards-payments
   * @event error-on-post-cards-payments'
   */
  postPayment(body) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardPaymentsPost', {
      host: this.host,
      headers: this.headers,
      params: Object.assign({
        'card-id': this.cardId === '' ? body.cardId : this.cardId,
      }),
      version: this.cardsApiVersion,
      body,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'set-cards-payments', 'error-on-post-cards-payments');
  }
  /**
   * GET payments /cards/v1/cards/{card-id}/payments
   * @param {Object} params
   * @event get-scheduled-payments-success
   * @event error-on-get-scheduled-payments
   */
  getPayments(params = {}) {
    var service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardPaymentsGet', {
      host: this.host,
      headers: this.headers || {},
      params: Object.assign({ 'card-id': this.cardId }, params),
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    }, false);

    this._getGeneratedRequest(service, 'get-scheduled-payments-success', 'error-on-get-scheduled-payments');
  }

  /**
   * PATCH payments /cards/v1/cards/{cardId}/payments/{paymentId}
   * @param {Object} payload
   * @event patch-payments-success
   * @event error-on-patch-payments
   */
  patchPayments(payload = {}) {
    const id = payload.id || '';
    const body = payload.body || {};
    var service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardPaymentsPaymentPatch', {
      host: this.host,
      headers: this.headers || {},
      body: body,
      params: Object.assign({
        'card-id': this.cardId,
        'payment-id': id
      }),
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'patch-payments-success', 'error-on-patch-payments');
  }

  /**
   * POST /cards/v1/cards/{card-id}/payments/{payment-id}/scheduled-payment-cancel
   * @param {String} id
   * @event post-scheduled-payment-cancel-success
   * @event error-on-post-scheduled-payment-cancel
   */
  postScheduledPaymentCancel(id) {
    var service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardPaymentsPaymentScheduledPaymentCancelPost', {
      host: this.host,
      headers: this.headers || {},
      params: Object.assign({
        'card-id': this.cardId,
        'payment-id': id
      }),
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'post-scheduled-payment-cancel-success', 'error-on-post-scheduled-payment-cancel');
  }


  /**
   * POST payments /cards/v1/cards/payments/simulate
   * @param {Object} body
   * @event set-cards-alt-payments-simulate
   * @event error-on-post-cards-alt-payments-simulate
   */
  postCardsPaymentsSimulate(body) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsPaymentsSimulatePost', {
      host: this.host,
      headers: this.headers,
      version: this.cardsApiVersion,
      body,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'set-cards-alt-payments-simulate', 'error-on-post-cards-alt-payments-simulate');
  }

  /**
   * POST payments /cards/v1/cards/payments
   * @param {Object} body
   * @event set-cards-alt-payments
   * @event error-on-post-cards-alt-payments
   */
  postCardsPayments(body) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsPaymentsPost', {
      host: this.host,
      headers: this.headers,
      version: this.cardsApiVersion,
      body,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'set-cards-alt-payments', 'error-on-post-cards-alt-payments');
  }

  /**
  * PATCH payment-methods /cards/v1/cards/payment-methods
  * @param {Object} body
  * @event set-payment-methods
  * @event error-on-set-payment-methods
  */
  patchCardPaymentMethods(body) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardPaymentMethodsPatch', {
      host: this.host,
      headers: this.headers,
      version: this.cardsApiVersion,
      params: Object.assign({
        'card-id': this.cardId,
      }),
      body,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'set-payment-methods', 'error-on-set-payment-methods');
  }

  /**
   * GET /cards/v1/scheduled-top-ups
   * @param {Object} params
   * @event get-scheduled-top-ups-success
   * @event get-scheduled-top-ups-error
   */
  getScheduledTopUps(params) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsScheduledTopUpsGet', {
      host: this.host,
      headers: this.headers,
      version: this.cardsApiVersion,
      params,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'get-scheduled-top-ups-success', 'get-scheduled-top-ups-error');
  }

  /**
   * POST /cards/v1/scheduled-top-ups
   * @param {Object} body
   * @event post-scheduled-top-ups-success
   * @event post-scheduled-top-ups-error
   */
  postScheduledTopUps(body) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsScheduledTopUpsPost', {
      host: this.host,
      headers: this.headers,
      version: this.cardsApiVersion,
      body,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'post-scheduled-top-ups-success', 'post-scheduled-top-ups-error');
  }

  /**
  * POST /cards/v1/scheduled-top-ups/:scheduled-top-up-id/cancel
  */
  postCancelScheduledTopUps(params) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsScheduledTopUpsScheduledTopUpCancelPost', {
      host: this.host,
      headers: this.headers,
      version: this.cardsApiVersion,
      params: params,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'post-cancel-scheduled-top-ups-success', 'post-cancel-scheduled-top-ups-error');
  }

  /**
   * POST  /cards/v1/cards/{card-id}/top-ups/simulate
   * @param {Object} body
   * @event post-top-ups-simulate-success
   * @event post-top-ups-simulate-error
   */
  postCardsTopUpsSimulate(body) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardTopUpsSimulatePost', {
      host: this.host,
      headers: this.headers,
      params: Object.assign({
        'card-id': this.cardId,
      }),
      version: this.cardsApiVersion,
      body,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'post-top-ups-simulate-success', 'post-top-ups-simulate-error');
  }

  /**
   * POST payments /cards/v1/cards/{card-id}/top-ups
   * @param {Object} body
   * @event post-top-ups-success
   * @event post-top-ups-error
   */
  postCardsTopUps(body) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardTopUpsPost', {
      host: this.host,
      headers: this.headers,
      params: Object.assign({
        'card-id': this.cardId,
      }),
      version: this.cardsApiVersion,
      body,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'post-top-ups-success', 'post-top-ups-error');
  }

  /**
   * GET operation limits
   * @param {Object} params
   * @event get-operation-limits-success
   * @event get-operation-limits-error
   */
  getOperationLimits(params) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardOperationLimitsGet', {
      host: this.host,
      headers: this.headers || {},
      params: Object.assign({}, {
        'card-id': this.cardId
      }, params),
      native: this.native,
      version: this.cardsApiVersion
    });
    this._getGeneratedRequest(service, 'get-operation-limits-success', 'get-operation-limits-error');
  }

  /**
   * GET card limits
   * @param {Object} params
   * @event get-card-limits-response
   * @event error-on-get-card-limits
   */
  getCardLimits(params) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardLimitsGet', {
      host: this.host,
      headers: this.headers || {},
      params: Object.assign({}, {
        'card-id': this.cardId
      }, params),
      native: this.native,
      version: this.cardsApiVersion
    });
    service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.set('getLimitsResponse', response);
      this.dispatchEvent(new CustomEvent('get-card-limits-response', {
        detail: response,
        bubbles: true,
        composed: true
      }));
    }, this._generateErrorFireEventHandler('error-on-get-card-limits'));
  }

  /**
   * PUT card limits
   */
  putCardLimit(body) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardLimitsLimitPut', {
      host: this.host,
      headers: this.headers || {},
      params: Object.assign({
        'card-id': this.cardId,
        'limit-id': this.limitId
      }),
      body: body,
      native: this.native,
      version: this.cardsApiVersion
    });
    service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.set('putLimitsResponse', response);
      this.dispatchEvent(new CustomEvent('put-card-limits-response', {
        detail: response,
        bubbles: true,
        composed: true
      }));
    }, this._generateErrorFireEventHandler('error-on-put-card-limits'));
  }

  /**
    * PUT card block
    *
    * @param {Object} payload
    * @event put-card-block-response
    * @event error-on-put-card-block
    */
  putCardBlock(payload = {}) {
    const body = payload.body || {};
    const params = payload.params || {};
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardBlocksBlockPut', {
      body: Object.assign({}, {
        reason: { id: 'Al' },
        isActive: true,
        isReissued: this.isReissued || false
      }, body),
      params: Object.assign({}, {
        'card-id': this.cardId,
        'block-id': this.blockId
      }, params),
      host: this.host,
      native: this.native,
      requiredToken: this.requiredToken,
      version: this.cardsApiVersion
    });

    service.generateRequest()
      .then(() => {
        const response = this._parseResponse(service.getLastResponse());
        this.set('putCardBlockResponse', response);
        this.dispatchEvent(new CustomEvent('put-card-block-response', {
          detail: response,
          bubbles: true,
          composed: true
        }));
      }, this._generateErrorFireEventHandler('error-on-put-card-block'));
  }

  /**
   * Post Cancellations
   */

  postCardsCancellations(body, params = {}) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardCancellationPost', {
      host: this.host,
      headers: this.headers || {},
      params: params,
      body: body,
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'cancel-cards-response', 'error-on-post-cards');
  }

  /**
   * POST Card ObtainDisposedBalance
   * @param body
   * @param params
   */
  postObtainDisposedBalance(body, params = {}) {
    const service = this._getNpmService('ArCards', this.cardsApiVersion, 'ObtainDisposedBalancePost', {
      host: this.host,
      headers: this.headers || {},
      params: params,
      body: body,
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'post-obtain-disposed-balance-response', 'error-on-post-obtain-disposed-balance');
  }

  /**
   * POST Card proposals
   *
   * @param {Object} params
   */
  postCardProposals(params) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsProposalsPost', {
      host: this.host,
      body: params,
      headers: this.headers || {},
      requiredToken: this.requiredToken,
      native: this.native,
      version: this.cardsApiVersion
    });

    if (this.secondFactorToken) {
      service.headers = Object.assign({}, service.headers, {
        Authorization: this.secondFactorToken
      });
    }

    service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.set('cardProposals', response);
      this.dispatchEvent(new CustomEvent('set-card-proposals', {
        bubbles: true,
        composed: true,
        detail: response
      }));
    }, this._generateErrorFireEventHandler('error-on-get-card-proposals'));
  }

  /**
   * Post cards
   * @param {Object} body
   * @param {Object} params
   * @event post-cards
   * @event error-on-post-cards
   */
  postCards(body, params = {}) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsPost', {
      host: this.host,
      headers: this.headers || {},
      params: params,
      body: body,
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });

    const requestService = service.generateRequest();

    requestService.then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.set('postCardsResponse', response);
      this.dispatchEvent(new CustomEvent('post-cards', {
        bubbles: true,
        composed: true,
        detail: response
      }));
    }, this._generateErrorFireEventHandler('error-on-post-cards')
    );
  }

  /**
   * Post cards using getNpmService
   * @param {Object} body
   * @param {Object} params
   * @event post-cards-npm
   * @event error-on-post-cards-npm
   */
  postCardsNpm(body, params = {}) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsPost', {
      host: this.host,
      headers: this.headers || {},
      params: params,
      body: body,
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });
    if (!this.forbiddenFromService) {
      service.signatureFirstErrorCode = 'forbidden';
      service._ERROR_CODES.SIGNATURE_REQUIRED.push('forbidden');
    }

    this._getGeneratedRequest(service, 'post-cards-npm', 'error-on-post-cards-npm');
  }

  /**
   * POST Cards Cards proposals
   *
   * @param {Object} params
   * @event post-cards-cards-proposals-init
   * @event set-cards-cards-proposals
   * @event error-on-get-cards-cards-proposals
   */
  postCardsCardsProposals(params) {
    this.dispatchEvent(new CustomEvent('post-cards-cards-proposals-init', {
      bubbles: true,
      composed: true
    }));
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardProposalsPost', {
      host: this.host,
      body: params.body,
      params: Object.assign({
        'card-id': params.cardId
      }),
      requiredToken: this.requiredToken,
      native: this.native
    });
    return service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.set('cardsCardsProposals', response);
      this.dispatchEvent(new CustomEvent('set-cards-cards-proposals', {
        bubbles: true,
        composed: true,
        detail: response
      }));
    }, this._handleApiErrorAndFireSeverityError('error-on-get-cards-cards-proposals'));
  }

  /**
   * Get Card Offer
   * @event get-card-init
   */
  postOfferCard(body, params = {}) {
    let path = this.cardsApiVersion === '0' ? 'offersOfferSimulatePost' : 'offersOfferSimulationsPost';
    this.dispatchEvent(new CustomEvent('get-card-init', {
      bubbles: true,
      composed: true
    }));
    let service = this._getNpmService('Cards', this.cardsApiVersion, path, {
      host: this.host,
      body: body,
      params: Object.assign({
        'offer-id': params.offerId
      }),
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });
    return service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.set('cardOffer', response);
      this.dispatchEvent(new CustomEvent('set-card-offer', {
        bubbles: true,
        composed: true,
        detail: {}
      }));
      this.dispatchEvent(new CustomEvent('success-on-get-card-offer', {
        bubbles: true,
        composed: true
      }));
    }, this._generateErrorFireEventHandler('error-on-get-card-offer')
    );
  }

  /**
* GET Related Contracts
   * @event get-card-related-contracts-response
   * @event error-on-get-card-related-contracts
*/
  getCardRelatedContracts() {
    var service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardRelatedContractsGet', {
      host: this.host,
      params: Object.assign({
        'card-id': this.cardId,
      }),
      requiredToken: this.requiredToken,
      native: this.native,
      version: this.cardsApiVersion
    });

    service.generateRequest().then(
      function() {
        var response = this._parseResponse(service.getLastResponse());
        this.set('relatedContracts', response);
        this.dispatchEvent(new CustomEvent('get-card-related-contracts-response', {
          detail: response,
          bubbles: true,
          composed: true
        }));
      }.bind(this),
      this._generateErrorFireEventHandler('error-on-get-card-related-contracts')
    );
  }

  /**
   * POST Cards Related Contracts
   *
   * @param {Object} params
   * @event post-cards-cards-proposals-init
   * @event post-cards-related-contracts-response
   * @event error-on-post-cards-related-contracts
   */
  postCardsRelatedContracts(params) {
    this.body = {
      'relatedContractId': params.relatedContractId,
      'contractId': params.contractId,
      'number': params.number,
      'numberType': {
        'id': params.numberTypeId,
        'name': params.numberTypeName
      },
      'product': {
        'id': params.productId,
        'name': params.productName
      },
      'relationType': {
        'id': params.relationTypeId,
        'name': params.relationTypeName
      }
    };
    this.dispatchEvent(new CustomEvent('post-cards-related-contracts-init', {
      bubbles: true,
      composed: true
    }));
    var service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardRelatedContractsPost', {
      host: this.host,
      params: Object.assign({
        'card-id': this.cardId,
      }),
      body: this.body,
      requiredToken: this.requiredToken,
      native: this.native
    });
    service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.set('relatedContracts', response);
      this.dispatchEvent(new CustomEvent('post-cards-related-contracts-response', {
        bubbles: true,
        composed: true,
        detail: response
      }));
    }, this._generateErrorFireEventHandler('error-on-post-cards-related-contracts'));
  }

  /**
   * POST replace related contracts
   *
   * @param {Object} body
   * @event post-cards-replace-related-contracts-response
   * @event error-on-post-cards-replace-related-contracts
   */
  postReplaceRelatedContracts(body) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardRelatedContractsReplacePost', {
      host: this.host,
      headers: this.headers,
      params: Object.assign({
        'card-id': this.cardId,
      }),
      version: this.cardsApiVersion,
      body,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'post-cards-replace-related-contracts-response', 'error-on-post-cards-replace-related-contracts');
  }

  /**
   * Post cards
   * @param {Object} body
   * @param {Object} params
   * @event post-cards
   * @event error-on-post-cards
   */
  postSuggestCards(body, params = {}) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsSuggestCardsPost', {
      host: this.host,
      headers: this.headers || {},
      params: params,
      body: body,
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'post-suggest-cards', 'error-on-post-suggest-cards', []);
  }

  /**
   * Post cards suggestion
   * @param {Object} body
   * @param {Object} params
   * @event post-suggestion-cards
   * @event error-on-post-suggestion-cards
   */
  postSuggestionsCards(body, params = {}) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsSuggestionsPost', {
      host: this.host,
      headers: this.headers || {},
      params: params,
      body: body,
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'post-suggestion-cards', 'error-on-post-suggestion-cards', []);
  }

  /**
   *  Card installments plans simulate/execution
   */
  postInstallmentsPlans(body, simulate) {
    const simulateParams = { api: 'CardsCardInstallmentsPlansSimulatePost', success: 'post-cards-installments-plans-simulate-response', error: 'error-on-post-cards-installments-plans-simulate' };
    const executeParams = { api: 'CardsCardInstallmentsPlansPost', success: 'post-cards-installments-plans-execution-response', error: 'error-on-post-cards-installments-plans-execution' };
    const serviceParams = simulate ? simulateParams : executeParams;
    const service = this._getNpmService('Cards', this.cardsApiVersion, serviceParams.api, {
      host: this.host,
      headers: this.headers || {},
      params: Object.assign({
        'card-id': this.cardId,
      }),
      body: body,
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });

    service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      if (response) {
        this.dispatchEvent(new CustomEvent(serviceParams.success, {
          bubbles: true,
          composed: true,
          detail: response
        }));
      } else {
        this._generateErrorFireEventHandler(serviceParams.error)();
      }
    }, this._generateErrorFireEventHandler(serviceParams.error));
  }

  /**
   * PUT card PIN
   * @param {Object} body
   * @event put-card-pin-response
   * @event error-on-put-card-pin
   */
  putCardPin(e = {}) {
    let pinBlock = e.value;
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardPinPut', {
      host: this.host,
      requiredToken: this.requiredToken,
      headers: this.headers || {},
      params: Object.assign({
        'card-id': this.cardId
      }),
      body: { 'pin': pinBlock },
      native: this.native,
      version: this.cardsApiVersion
    });

    service.generateRequest().then(() => {
      const response = { 'response': 'OK' };
      this.dispatchEvent(new CustomEvent('put-card-pin-response', {
        detail: response,
        bubbles: true,
        composed: true
      }));
    }, this._generateErrorFireEventHandler('error-on-put-card-pin'));
  }

  /**
   * POST card create replacement
   *
   * @param {Object} payload
   * @event success-on-post-card-replacements
   * @event error-on-post-card-replacements
   */
  postCardReplacements(payload = {}) {
    const { body, params, apiVersion } = payload;
    const service = this._getNpmService('Cards', apiVersion, 'CardsCardReplacementsPost', {
      body: Object.assign({}, {
        feesApply: true
      }, body),
      params: Object.assign({}, {
        'card-id': this.cardId
      }, params),
      host: this.host,
      native: this.native,
      headers: this.headers || {},
      requiredToken: this.requiredToken,
      version: apiVersion
    });

    service.signatureFirstErrorCode = 'forbidden';
    service._ERROR_CODES.SIGNATURE_REQUIRED.push('forbidden');

    this._getGeneratedRequest(service, 'success-on-post-card-replacements', 'error-on-post-card-replacements');
  }

  /**
   * GET card deliveries
   *
   * @param {Object} payload
   * @event success-on-get-card-deliveries
   * @event error-on-get-card-deliveries
   */
  getCardDeliveries(payload = {}) {
    const { params, apiVersion } = payload;
    const service = this._getNpmService('Cards', apiVersion, 'CardsCardDeliveriesGet', {
      params: Object.assign({}, params),
      host: this.host,
      native: this.native,
      headers: this.headers || {},
      requiredToken: this.requiredToken,
      version: apiVersion
    });
    service.signatureFirstErrorCode = 'forbidden';
    service._ERROR_CODES.SIGNATURE_REQUIRED.push('forbidden');
    this._getGeneratedRequest(service, 'success-on-get-card-deliveries', 'error-on-get-card-deliveries');
  }

  /**
   * POST card create delivery
   *
   * @param {Object} payload
   * @event success-on-post-card-create-delivery
   * @event error-on-post-card-create-delivery
   */
  postCardCreateDelivery(payload = {}) {
    const { body, params, apiVersion } = payload;
    const service = this._getNpmService('Cards', apiVersion, 'CardsCardDeliveriesPost', {
      body: Object.assign({}, body),
      params: Object.assign({}, params),
      host: this.host,
      native: this.native,
      headers: this.headers || {},
      requiredToken: this.requiredToken,
      version: apiVersion
    });

    this._getGeneratedRequest(service, 'success-on-post-card-create-delivery', 'error-on-post-card-create-delivery');
  }

  /**
   * POST card request cancel
   */
  postCardRequestCancel(payload = {}) {
    const { body, params, apiVersion } = payload;
    const service = this._getNpmService('Cards', apiVersion, 'CardsCardRequestCancelPost', {
      body: Object.assign({}, body),
      params: Object.assign({}, params),
      host: this.host,
      native: this.native,
      headers: this.headers || {},
      requiredToken: this.requiredToken,
      version: apiVersion
    });

    this._getGeneratedRequest(service, 'success-on-post-card-request-cancel', 'error-on-post-card-request-cancel');
  }

  /**
   * GET cards/{card-id}/limit-ranges
   * @param {Object} params
   * @event get-limit-ranges-success
   * @event get-limit-ranges-error
   */
  getLimitRanges(params) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardLimitRangesGet', {
      host: this.host,
      headers: this.headers,
      version: this.cardsApiVersion,
      params: Object.assign({}, {
        'card-id': this.cardId
      }, params),
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'get-limit-ranges-success', 'get-limit-ranges-error');
  }

  /**
   * Request card cash advances
   * POST /cards/v1/cards/{card-id}/cash-advances
   * @event success-on-post-card-cash-advances
   * @event error-on-post-card-cash-advances
   */
  postCardCashAdvances(requestBody) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardCashAdvancesPost', {
      host: this.host,
      headers: this.headers,
      params: Object.assign({ 'card-id': this.cardId }),
      body: requestBody,
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'success-on-post-card-cash-advances', 'error-on-post-card-cash-advances');
  }

  /**
   * Request card cash advances simulate
   * POST /cards/v1/cards/{card-id}/cash-advances/simulate
   * @event success-on-post-card-cash-advances-simulate
   * @event error-on-post-card-cash-advances-simulate
   */
  postCardCashAdvancesSimulate(requestBody) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardCashAdvancesSimulatePost', {
      host: this.host,
      headers: this.headers,
      params: Object.assign({ 'card-id': this.cardId }),
      body: requestBody,
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'success-on-post-card-cash-advances-simulate', 'error-on-post-card-cash-advances-simulate');
  }

  /**
   * POST cards/{card-id}/debt-purchases/simulate
   * @param {Object} params
   * @event success-on-post-debt-purchases-simulate
   * @event error-on-post-debt-purchases-simulate
   */
  postDebtPurchasesSimulate(body) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardDebtPurchasesSimulatePost', {
      host: this.host,
      headers: this.headers,
      version: this.cardsApiVersion,
      params: Object.assign({}, { 'card-id': this.cardId }),
      body,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'success-on-post-debt-purchases-simulate', 'error-on-post-debt-purchases-simulate');
  }

  /**
 * POST cards/{card-id}/debt-purchases
 * @param {Object} params
 * @event success-on-post-debt-purchases
 * @event error-on-post-debt-purchases
 */
  postDebtPurchases(body) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardDebtPurchasesPost', {
      host: this.host,
      headers: this.headers,
      version: this.cardsApiVersion,
      params: Object.assign({}, { 'card-id': this.cardId }),
      body,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'success-on-post-debt-purchases', 'error-on-post-debt-purchases');
  }

  /**
 * POST cards/{card-id}/activate
 * @param {Object} body
 * @event success-on-post-card-activate
 * @event error-on-post-card-activate
 */
  postCardActivate(body) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardActivatePost', {
      host: this.host,
      headers: this.headers,
      version: this.cardsApiVersion,
      params: Object.assign({}, { 'card-id': this.cardId }),
      body: body,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'success-on-post-card-activate', 'error-on-post-card-activate');
  }

  /**
   * Get generated request from each method
   * @param {Object} service
   * @param {String} successEvent
   * @param {String} errorEvent
   * @private
   */
  _getGeneratedRequest(service, successEvent, errorEvent, defaultValue = null) {
    service.generateRequest()
      .then(() => {
        let response = this._parseResponse(service.getLastResponse());
        if (!response && defaultValue !== null) {
          response = defaultValue;
        }

        this.dispatchEvent(new CustomEvent(successEvent, {
          bubbles: true,
          composed: true,
          detail: response
        }));
      }, this._generateErrorFireEventHandler(errorEvent));
  }

  /**
   * POST /cards/v0/cards/validate-destination-cards
   * @param {Object} body
   * @event validate-destination-cards-success
   * @event validate-destination-cards-error
   */
  requestKeepCards(body) {
    const service = this._getNpmService('MXCards', this.cardsApiVersion, 'MxCardsCardsValidateDestinationCardsPost', {
      body: body,
      host: this.host,
      headers: this.headers,
      native: this.native
    });

    this._getGeneratedRequest(service, 'validate-destination-cards-success', 'validate-destination-cards-error');
  }

  /**
   * POST /cards/v0/cards/{card-id}/validate-origin-cards
   * @param {Object} body
   * @event validate-origin-cards-success
   * @event validate-origin-cards-error
   */
  requestOriginCards(body) {
    let requestOriginCards = body;
    const service = this._getNpmService('MXCards', this.cardsApiVersion, 'MxCardsCardsValidateOriginCardsPost', {
      body: body,
      host: this.host,
      headers: this.headers,
      native: this.native
    });

    this._getGeneratedRequest(service, 'validate-origin-cards-success', 'validate-origin-cards-error');
  }

  /**
   * POST /cards/v0/validate-unify-cards
   * @param {Object} body
   * @event validate-unification-cards-success
   * @event validate-unification-cards-error
   */
  requestValidateUnification(body) {
    const service = this._getNpmService('MXCards', this.cardsApiVersion, 'MxCardsCardsValidateCardsUnificationPost', {
      body: body,
      host: this.host,
      headers: this.headers,
      native: this.native
    });

    this._getGeneratedRequest(service, 'validate-unification-cards-success', 'validate-unification-cards-error');
  }

  /**
   * POST /cards/v0/unify-cards
   * @param {Object} body
   * @event unify-cards-success
   * @event unify-cards-error
   */
  requestUnifyCards(body) {
    const service = this._getNpmService('MXCards', this.cardsApiVersion, 'MxCardsCardsUnifyCardsPost', {
      body: body,
      host: this.host,
      headers: this.headers,
      native: this.native
    });
    service.signatureFirstErrorCode = 'forbidden';
    service._ERROR_CODES.SIGNATURE_REQUIRED.push('forbidden');

    this._getGeneratedRequest(service, 'unify-cards-success', 'unify-cards-error');
  }

  /**
   * GET cards/v1/cards/{card-id}/pin
   * @param {Object} data
   * @event pin-success-response-event
   * @event pin-error-response-event
   */
  getCardPin(data = {}) {
    const cardId = data.cardId || this.cardId;
    const params = data.params || {};
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardPinGet', {
      host: this.host,
      headers: this.headers || {},
      params: Object.assign({ 'card-id': cardId }, params, { 'publicKeyExponent': this.publicKeyExponent }),
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    });
    this._getGeneratedRequest(service, 'pin-success-response-event', 'pin-error-response-event');
  }

  /**
   * POST /cards/v1/decipher-qrcard
   * @param {Object} body
   * @event decipher-qr-success-response-event
   * @event decipher-qr-error-response-event
   */
  cardsDecipherQrPost(body) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsDecipherQrcardPost', {
      host: this.host,
      headers: this.headers,
      version: this.cardsApiVersion,
      body: body,
      requiredToken: this.requiredToken,
      native: this.native
    });

    this._getGeneratedRequest(service, 'decipher-qr-success-response-event', 'decipher-qr-error-response-event');
  }

  /**
   * PATCH cards/v1/proposals/{proposal-id}
   * @method patchCardProposals
   * @param {Object} payload
   * @event set-card-patch-proposals
   * @event error-on-patch-proposals
   */
  patchCardProposals(payload) {
    const body = payload.body || payload;
    const params = payload.params || {};
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsProposalsProposalPatch', {
      host: this.host,
      body: body,
      params: Object.assign({
        'proposal-id': params.proposalId
      }),
      requiredToken: this.requiredToken,
      native: this.native,
      version: this.cardsApiVersion
    });

    this._getGeneratedRequest(service, 'set-card-patch-proposals', 'error-on-patch-proposals');
  }

  /**
   * GET available cut off dates
   * @param {Object} params
   * @event get-cut-off-dates-success
   * @event get-cut-off-dates-error
   */
  getAvailableCuttOffDates(params) {
    const service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsOffersAvailableCutOffDatesGet', {
      host: this.host,
      native: this.native,
      headers: this.headers || {},
      params: params,
      requiredToken: this.requiredToken,
      version: this.cardsApiVersion
    });

    this._getGeneratedRequest(service, 'get-cut-off-dates-success', 'get-cut-off-dates-error');
  }

  /**
   * GET payments /cards/v3/cards/{card-id}/guarantees
   * @param {Object} params
   * @event get-card-guarantees-success
   * @event error-on-get-card-guarantees
   */
  getCardGuarantees(params = {}) {
    var service = this._getNpmService('Cards', this.cardsApiVersion, 'CardsCardGuaranteesGet', {
      host: this.host,
      headers: this.headers || {},
      params: Object.assign({ 'card-id': this.cardId }, params),
      version: this.cardsApiVersion,
      requiredToken: this.requiredToken,
      native: this.native
    }, false);

    this._getGeneratedRequest(service, 'get-card-guarantees-success', 'error-on-get-card-guarantees');
  }

}
window.customElements.define(CellsDmGlobalApisCardsBGADPMock.is, CellsDmGlobalApisCardsBGADPMock);
