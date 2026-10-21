/* eslint new-cap: 0 */
/* global CellsMixins */
class GlomoProductCheckerDmMx extends CellsMixins.GlomoProductCheckerMixin(Polymer.Element) {

  static get is() {
    return 'glomo-product-checker-dm-mx';
  }

  static get properties() {
    return {
      /**
       * List of offers when get app settings
       */
      configurationOffers: {
        type: Object,
        value: () => ({})
      },
      /**
       * Boolean to check if goes to financing
       */
      goFinancing: {
        type: Boolean,
        value: false
      }
    };
  }

  /**
   * Object get data from settings
   */
  setConfigurationOffers({ deeplinkConfigurationOffers }) {
    this.set('configurationOffers', deeplinkConfigurationOffers);
  }

  /**
   * Retrieved the offers for the glomo settings
   * @param {Object}
   */
  getOffers(params) {
    this.paramsCampaigns = params || {};
    if (this.configurationOffers?.alternative?.includes(params.params)) {
      this.offersParams = { 'origin.id': 'OLG' };
    } else if (this.configurationOffers?.nonPreapproved?.includes(params.params)) {
      const checkPageNPA = ['creditCardHolder', 'ocLoanOfferPage'].includes(params.destination);
      this.offersParams = checkPageNPA ? {} : { 'label.id': 'no preaprobados' };
    } else {
      this.offersParams = {};
    }
    let headers = {};
    const isFixedOffer = this.configurationOffers.fixed.includes(params.params);

    if (!isFixedOffer) {
      if (this.useDeviceInfoPluginEnabled && this.get('CellsNativePlugins.pluginManager', window)) {
        this.$.deviceInfoPlugin.getApplicationVersion().then(result => {
          this.appDefaultVersion = (result.versionData || result).versionName;
          headers = {
            'BCS-Device-App-Version': this.appDefaultVersion
          };
          this.$.campaignsDm.getOffers(this.offersParams, headers);
        });
      } else {
        if (this.appDefaultVersion) {
          headers = {
            'BCS-Device-App-Version': this.appDefaultVersion
          };
        }
        this.$.campaignsDm.getOffers(this.offersParams, headers);
      }
    } else {
      this._dispatchEvent(this.productFoundEventName, {
        page: params.destination
      });
    }
  }

  /**
   * Function to set the offers
   */
  _oneOfferEvent() {
    const offerTypeLink = this.get('params', this.paramsCampaigns);
    const offer = this._parseOfferType(this.allOffers);
    const parseOffer = offer.find(item => (this.get('product.id', item) === offerTypeLink));
    const deeplinkEven = parseOffer ? this.productFoundEventName : this.notProductEventName;
    const dataDeeplink = (parseOffer) ? {
      page: this.destination,
      offerId: parseOffer.id,
      offerName: parseOffer.name,
      productId: parseOffer.product.contractId,
      continue: 'dashboard'
    } : {};
    const productIdCase = this.get('product.contractId', parseOffer);
    const data = (this.get('offerType.id', parseOffer) === 'IL') ? Object.defineProperty(dataDeeplink, 'productId', { value: productIdCase, writable: true, configurable: true, enumerable: true }) : dataDeeplink;
    this._dispatchEvent(deeplinkEven, data);
  }

  /**
   * Assign property values
   * @param {Object}
   */
  getCards(params) {
    if (params) {
      this.productInfo = params.params.args[0];
      this.destination = params.destination;
      this.altDestination = params.altDestination;
      this.goFinancing = params.params.args[1];
    }
    this.navigateToCardDetail();
  }

  /**
   * Navigate to product detail if contains data
   */
  navigateToCardDetail() {
    const dataDeeplink = {
      page: this.destination,
      productId: this.productInfo,
      productType: 'card',
      extra: this.goFinancing
    };
    if (this.productInfo) {
      this._dispatchEvent(this.productFoundEventName, dataDeeplink);
    }
  }

}

customElements.define(GlomoProductCheckerDmMx.is, GlomoProductCheckerDmMx);