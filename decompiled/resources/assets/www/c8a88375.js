import{a as e,a4 as t,h as s,i as r,b as n}from"./952f98a9.js";import{f as a,g as o,a as i}from"./92501e08.js";class d extends(e(t)){static get is(){return"bbva-card-offer-options-es-api-dm"}static get properties(){return{_contentFragmentHost:{type:String},_publicWebHost:{type:String},_contentFragmentPath:{type:String},_contentFragmentRequestMethod:{type:String}}}static get scopedElements(){const e=[n];return d.scopedElementsFromClasses(e)}constructor(){super(),this._contentFragmentHost="https://assets-stage.caasbbva.com",this._publicWebHost="https://bbva.es",this._contentFragmentPath="content/caas/spain/app/payments/upgradetarjeta.model.json",this._contentFragmentRequestMethod="GET"}update(e){super.update(e),e.forEach(((e,t)=>{"headers"===t&&this.headers&&this.headers!==e&&(this._contentFragmentPath=a(this.headers),this._contentFragmentLanguage=this.headers["Accept-Language"])}))}render(){return s`
      ${this.cardOfferOptionsDM}${this.cardUpgradeDM}
    `}get cardOfferOptionsDM(){return s`
      <bbva-core-generic-dp
        id="cardOfferOptions"
        requiresToken
        cross-domain
        .host="${this.host}"
        .path="${this.path}"
        headers="${r(o(this.host,this.headers))}"
        method="${this.method}"
        @request-success="${this._handleLocalDMSuccess}"
        @request-error="${this._handleLocalDMError}"
      >
      </bbva-core-generic-dp>
    `}get cardUpgradeDM(){return s`
      <bbva-core-generic-dp
        id="cardUpgrade"
        .host=${this._contentFragmentHost}
        .native=${this.native}
        .path=${this._contentFragmentPath}
        .method=${this._contentFragmentRequestMethod}
      >
      </bbva-core-generic-dp>
    `}getCardOfferOptions(e,t){const s=this.shadowRoot.getElementById("cardOfferOptions");this._setGenericRequest({dm:s,path:`cards/v1/cards/${e}/offers/${t}/options`,method:"get"})}_setGenericRequest({dm:e,path:t,method:s}){return e.native=!1,e.requiresToken=!0,e.path=`${t}`,e.method=s,e.generateRequest()}_requestCardUpgradeModel(){return new Promise(((e,t)=>{const s=this.shadowRoot.getElementById("cardUpgrade");return this._addEventListeners(s,e,t),s.generateRequest()}))}_addEventListeners(e,t,s){e.addEventListener("request-success",(e=>{t({id:"cardOfferOptions",response:e.detail})})),e.addEventListener("request-error",(e=>{s({id:"cardOfferOptions",error:e})})),e.addEventListener("bbva-core-generic-dp-error",(e=>{s({error:e,type:"generic"})}))}_mergeResponse(e,t={}){var s,r,n,a,o;const d=null===(s=t.response)||void 0===s||null===(r=s[":items"])||void 0===r||null===(n=r.root)||void 0===n||null===(a=n[":items"])||void 0===a||null===(o=a.contentfragmentlist)||void 0===o?void 0:o.items;return e.map((e=>{var t,s,r,n;const a=d.find((t=>{var s,r;return(null===(s=t.elements)||void 0===s||null===(r=s.productId)||void 0===r?void 0:r.value)===e.id}));return e.images=[{id:"FRONT_CARD",url:`${this._contentFragmentHost}${null==a||null===(t=a.elements)||void 0===t||null===(s=t.cardImage)||void 0===s?void 0:s.value}`}],e.additionalInformation=[{additionalInformationType:{id:"WEB",url:`${this._publicWebHost}/${i(null==a||null===(r=a.elements)||void 0===r||null===(n=r.cardMoreInfo)||void 0===n?void 0:n.value,this._contentFragmentLanguage)}`}}],e}))}async _handleLocalDMSuccess(e){var t;await this.updateComplete,this.dispatchEvent(new CustomEvent("card-offer-option-es-api-dm-fetch",{detail:e.detail,bubbles:!0,composed:!0}));const s=await this._requestCardUpgradeModel();this.dispatchEvent(new CustomEvent("card-offer-options-api-dm-fetch",{detail:this._mergeResponse(null===(t=e.detail)||void 0===t?void 0:t.data,s),bubbles:!0,composed:!0})),this.dispatchEvent(new CustomEvent("api-dm-response",{bubbles:!0,composed:!0,detail:!0}))}_handleLocalDMError(e){this._handleError("card-offer-options-api-dm-fetch-error",this.shadowRoot.getElementById("cardOfferOptions"))(e.detail)}}customElements.define(d.is,d);export{d as BbvaCardOfferOptionsEsApiDm};
