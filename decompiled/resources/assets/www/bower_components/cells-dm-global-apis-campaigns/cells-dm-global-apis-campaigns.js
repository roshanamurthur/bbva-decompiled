/* eslint new-cap: 0*/
/* global BGADPCampaigns*/
/**
 * @summary CELLS Data Manager for GLOBAL APIS Campaigns
 * @customElement
 * @polymer
 * @extends {Polymer.Element}
 */
class CellsDmGlobalApisCampaigns extends Polymer.mixinBehaviors([
  CellsBehaviors.CellsGlobalApisHandleRequest,
  CellsBehaviors.CellsGlobalApisHandleRequestSign,
  CellsBehaviors.CellsGlobalApisHandleRequestError,
  CellsBehaviors.CellsGlobalApisServiceGetter
], Polymer.Element) {
  static get is() {
    return 'cells-dm-global-apis-campaigns';
  }

  static get properties() {
    return {

      /**
       * Chosen domain to make requests.
       */
      host: {
        type: String,
        value: ''
      },

      /**
       * Native request config
       */

      native: {
        type: Boolean,
        value: false
      },

      /**
       * Services API Version
       */
      apiVersion: {
        type: String,
        value: '0'
      },

      /**
       * List of retrieved offers
       */
      offers: {
        type: Array,
        notify: true
      },

      /**
       * Offer Id
       */
      offerId: String,

      /**
       * Type of token is required, 'tsec' or 'jwt'
       */
      requiredToken: {
        type: String,
        value: 'tsec'
      },
      /**
       * An empty page was reached?
       */
      emptyPageReached: {
        type: Boolean,
        value: false
      },
      /**
       * Load pages until empty page is reached?
       */
      loadPagesUntilEmptyPage: {
        type: Boolean,
        value: false
      },
      /**
       * List of feature flags
       * @type {Object}
       */
      featureFlagsCollection: {
        type: Object,
        value: () => ({})
      },
      /**
       * Offer product id reward
       * @type {String}
       */
      offerProductIdReward: {
        type: String,
        value: ''
      }
    };
  }

  /**
   * Retrieve the campaigns for the current user
   */
  getOffers(params, headers = {}) {
    this._retrieveOffers(params, this.nextKey, headers);
  }

  /**
   * Request assistance call
   */
  requestAssistanceCall() {
    this._requestAssistanceCall();
  }

  /**
   * Does the request to retrieve the Campaigns
   */
  _retrieveOffers(params, nextKey, headers) {
    const service = this._getService('Campaigns', this.apiVersion, 'offers.get', {
      host: this.host,
      params: this._generateOffersParams(params),
      version: this.apiVersion,
      native: this.native,
      htmlContext: this,
      requiresTsec: true,
      requiredToken: this.requiredToken,
      headers: headers
    });

    return service.generateRequest().then(
      success => {
        const response = this._parseResponse(service.getLastResponse());
        this.dispatchEvent(new CustomEvent('set-header-info', {
          bubbles: true,
          composed: true,
          detail: {
            headers: (success || {}).headers
          }
        }));
        this._successOffersResponse(response, nextKey);
      },
      this._generateErrorFireEventHandler('error-on-retrieve-campaigns')
    );
  }

  /**
   * Does the request to retrieve the more campaigns limited by page size
   */
  getMoreOffers(params) {
    let syncPage = this.page && (this.pagination).page === this.page;
    if (!syncPage) {
      this._generatePagination(this.pagination || {page: 0});
    }

    this._checkEmptyPageReached();

    const validPage = this.loadPagesUntilEmptyPage || this.page <= this.totalPages;

    if (!this.emptyPageReached && this.pagination && validPage && this.nextKey) {
      this.dispatchEvent(new CustomEvent('get-more-offers', {
        detail: true,
        bubbles: true,
        composed: true
      }));

      let allParams = Object.assign(params || {}, {expand: '&paginationKey=' + this.nextKey});
      this._retrieveOffers(allParams, this.nextKey);
    } else {
      this.dispatchEvent(new CustomEvent('last-offers', {
        bubbles: true,
        composed: true
      }));
    }
  }

  _onEmptyPageReached() {
    this.emptyPageReached = true;
    this.dispatchEvent(new CustomEvent('empty-page-reached', {
      bubbles: true,
      composed: true
    }));
  }

  _checkEmptyPageReached() {
    if (this.loadPagesUntilEmptyPage && this.pagination.totalElements < this.pagination.pageSize) {
      this._onEmptyPageReached();
    }
  }

  /**
   * Does the request to send the assistance call
   */
  _requestAssistanceCall() {
    this.dispatchEvent(new CustomEvent('open-control-veil', {
      bubbles: true,
      composed: true
    }));

    const service = this._getService('Campaigns', this.apiVersion, 'offers.offer.contactRequests.post', {
      host: this.host,
      params: Object.assign({
        'offer-id': this.offerId
      }),
      version: this.apiVersion,
      body: {},
      native: this.native,
      htmlContext: this,
      requiresTsec: true,
      requiredToken: this.requiredToken
    });

    return service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this._successAssistanceCallResponse(response);
    }, error => {
      const detail = Object.assign(error || {}, {
        code: 'PERSONAL-LOAN-OFFER-ASSISTANCE',
        title: 'alert-PERSONAL-LOAN-OFFER-title',
        delayed: 300
      });

      this.dispatchEvent(new CustomEvent('error-on-request-assistance-call', {
        detail,
        bubbles: true,
        composed: true
      }));
    });
  }

  /**
   * Does the request to send user events
   */
  sendUserEvent(userEvent) {
    const service = this._getService('Campaigns', this.apiVersion, 'offers.offer.userEvents.post', {
      host: this.host,
      params: Object.assign({
        'offer-id': this.offerId
      }),
      body: userEvent,
      version: this.apiVersion,
      native: this.native,
      htmlContext: this,
      requiresTsec: true,
      requiredToken: this.requiredToken
    });

    return service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this._successUserEventsResponse(response);
    }, this._generateErrorFireEventHandler('error-on-send-offer-event')
    );
  }

  /**
   * Generates the request params
   */
  _generateOffersParams(params) {
    return params || {};
  }

  /**
   * Generates the assistance call request params
   */
  _generateAssistanceCallParams(params) {
    return params || {};
  }

  /**
   * Handles successful response
   **/
  _successOffersResponse(data, nextKey) {
    const detail = Object.assign({
      data,
      currentPage: this.page ? this.page : 0,
      last: !this.pagination || !Object.keys(this.pagination).length || !this.get('links.next', this.pagination)
    }, nextKey ? { nextKey } : {});
    if (data) {
      data = this._filterOrangeReward(data);
    }
    this.set('offers', data || []);
    this.dispatchEvent(new CustomEvent('campaign-page-info', {
      bubbles: true,
      composed: true,
      detail
    }));
    this.dispatchEvent(new CustomEvent('set-offers', {
      bubbles: true,
      composed: true,
      detail: data
    }));
  }

  /**
   * Filters the offers reward by product id of good end.
   * @param {Array} offers
   * @return {Array}
   * @event orange-rewards-offer-enrollment
   */
  _filterOrangeReward(offers) {
    if (Object.keys(this.featureFlagsCollection).length > 0) {
      let flagRewards = this.featureFlagsCollection['glomo.dashboard.orangeRewards']?.value;
      if (!flagRewards) {
        const filteredOffers = [];
        for (const offer of offers) {
          if (offer.product.id === this.offerProductIdReward) {
            this.dispatchEvent(new CustomEvent('orange-rewards-offer-enrollment', {
              bubbles: true,
              composed: true,
              detail: offer
            }));
          } else {
            filteredOffers.push(offer);
          }
        }
        offers = filteredOffers;
      }
    }
    return offers;
  }

  /**
   * Handles successful assistance call response
   */
  _successAssistanceCallResponse() {
    this.dispatchEvent(new CustomEvent('successful-requested-assistance-call', {
      bubbles: true,
      composed: true
    }));
  }

  /**
   * Handles successful response
   */
  _successUserEventsResponse() {
    this.dispatchEvent(new CustomEvent('successful-user-events', {
      bubbles: true,
      composed: true
    }));
  }

  /**
  * Does redeem coupon request
  * @event successful-redeem-coupon
  * @event error-on-redeem-coupon
  */
  postRedeemCoupon(redeemData) {
    let service = this._getService('Campaigns', this.apiVersion, 'offers.offer.redeem.post', {
      host: this.host,
      params: {
        'offer-id': redeemData?.offerId
      },
      body: {
        'benefit': redeemData?.benefit,
        'promotionCode': redeemData?.promotionCode,
        'term': redeemData?.term
      },
      version: this.apiVersion,
      native: this.native,
      htmlContext: this,
      requiresTsec: true,
      requiredToken: this.requiredToken
    });
    return service.generateRequest().then(() => {
      const response = this._parseResponse(service.getLastResponse());
      this.dispatchEvent(new CustomEvent('successful-redeem-coupon', {
        bubbles: true,
        composed: true,
        detail: response
      }));
    }, this._generateErrorFireEventHandler('error-on-redeem-coupon')
    );
  }
}
window.customElements.define(CellsDmGlobalApisCampaigns.is, CellsDmGlobalApisCampaigns);
