import{a as e,a5 as t,h as r,i as s,b as n}from"./952f98a9.js";import{f as a,g as o}from"./92501e08.js";class i extends(e(t)){static get is(){return"bbva-card-offer-option-es-api-dm"}static get properties(){return{_contentFragmentHost:{type:String},_publicWebHost:{type:String},_contentFragmentPath:{type:String},_contentFragmentRequestMethod:{type:String}}}static get scopedElements(){const e=[n];return i.scopedElementsFromClasses(e)}render(){return r`
      ${this.cardOfferOptionDM}${this.cardUpgradeDM}
    `}constructor(){super(),this._contentFragmentHost="https://assets-stage.caasbbva.com",this._publicWebHost="https://bbva.es",this._contentFragmentPath="content/caas/spain/app/payments/upgradetarjeta.model.json",this._contentFragmentRequestMethod="GET"}update(e){super.update(e),e.forEach(((e,t)=>{"headers"===t&&this.headers&&this.headers!==e&&(this._contentFragmentPath=a(this.headers))}))}get cardOfferOptionDM(){return r`
      <bbva-core-generic-dp
        id="cardOfferOption"
        requiresToken
        cross-domain
        .host="${this.host}"
        .path="${this.path}"
        headers="${s(o(this.host,this.headers))}"
        method="${this.method}"
        @request-success="${this._handleLocalDMSuccess}"
        @request-error="${this._handleLocalDMError}"
      >
      </bbva-core-generic-dp>
    `}get cardUpgradeDM(){return r`
      <bbva-core-generic-dp
        id="cardUpgrade"
        .host=${this._contentFragmentHost}
        .native=${this.native}
        .path=${this._contentFragmentPath}
        .method=${this._contentFragmentRequestMethod}
      >
      </bbva-core-generic-dp>
    `}getCardOfferOption(e,t,r){const s=this.shadowRoot.getElementById("cardOfferOption");this._setGenericRequest({dm:s,path:`cards/v1/cards/${e}/offers/${t}/options/${r}`,method:"get"})}_setGenericRequest({dm:e,path:t,method:r}){return e.native=!1,e.requiresToken=!0,e.path=t,e.method=r,e.generateRequest()}_requestCardUpgradeModel(){return new Promise(((e,t)=>{const r=this.shadowRoot.getElementById("cardUpgrade");return this._addEventListeners(r,e,t),r.generateRequest()}))}_addEventListeners(e,t,r){e.addEventListener("request-success",(e=>{t({id:"cardOfferOption",response:e.detail})})),e.addEventListener("request-error",(e=>{r({id:"cardOfferOption",error:e})})),e.addEventListener("bbva-core-generic-dp-error",(e=>{r({error:e,type:"generic"})}))}_mergeResponse(e,t={}){var r,s,n,a,o;const i=e.data,d=(null===(r=t.response)||void 0===r||null===(s=r[":items"])||void 0===s||null===(n=s.root)||void 0===n||null===(a=n[":items"])||void 0===a||null===(o=a.contentfragmentlist)||void 0===o?void 0:o.items).find((e=>{var t,r;return(null===(t=e.elements)||void 0===t||null===(r=t.productId)||void 0===r?void 0:r.value)===i.id}));var c,h,p,l;d&&(i.images=[{id:"FRONT_CARD",url:`${this._contentFragmentHost}${null==d||null===(c=d.elements)||void 0===c||null===(h=c.cardImage)||void 0===h?void 0:h.value}`}],i.additionalInformation=[{additionalInformationType:{id:"WEB",url:`${this._publicWebHost}${null==d||null===(p=d.elements)||void 0===p||null===(l=p.cardMoreInfo)||void 0===l?void 0:l.value}`}}]);return i}async _handleLocalDMSuccess(e){await this.updateComplete,this.dispatchEvent(new CustomEvent("card-offer-option-es-api-dm-fetch",{detail:e.detail,bubbles:!0,composed:!0}));const t=await this._requestCardUpgradeModel();this.dispatchEvent(new CustomEvent("card-offer-option-api-dm-fetch",{detail:this._mergeResponse(e.detail,t),bubbles:!0,composed:!0})),this.dispatchEvent(new CustomEvent("api-dm-response",{bubbles:!0,composed:!0,detail:!0}))}_handleLocalDMError(e){this._handleError("card-offer-option-api-dm-fetch-error",this.shadowRoot.getElementById("cardOfferOption"))(e.detail)}}customElements.define(i.is,i);export{i as BbvaCardOfferOptionEsApiDm};
