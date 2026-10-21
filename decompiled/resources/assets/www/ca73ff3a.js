import{a as e,h as s,i as t,b as o}from"./952f98a9.js";import{c as r}from"./f89161ad.js";import"./7d773f57.js";import"./7f3d7ca9.js";import"./216055dc.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./d2484b66.js";import"./4656db6d.js";class d extends(e(r)){static get is(){return"bbva-customer-lopd-documents-es-api-dm"}static get scopedElements(){const e=[o];return d.scopedElementsFromClasses(e)}render(){return s`
      <bbva-core-generic-dp
        id="customerLopdDocuments"
        requiresToken
        cross-domain
        .host="${this.host}"
        .path="${this.path}"
        headers="${t(this.headers)}"
        method="${this.method}"
        @request-success="${this._handleLocalDMSuccess}"
        @request-error="${this._handleLocalDMError}"
      >
      </bbva-core-generic-dp>
    `}_handleLocalDMSuccess(e){const s=this._responseMapping(e.detail);this.dispatchEvent(new CustomEvent("customer-lopd-documents-api-dm-fetch",{bubbles:!0,composed:!0,detail:s})),this.dispatchEvent(new CustomEvent("api-dm-response",{bubbles:!0,composed:!0,detail:!0}))}_handleLocalDMError(e){this._handleError("customer-lopd-documents-api-dm-fetch-error",this.shadowRoot.querySelector("#customerLopdDocuments"))(e.detail)}_requestCustomerLopdDocuments(e,s){const t=this.shadowRoot.getElementById("customerLopdDocuments");this._setGenericRequest({dm:t,path:`customers/v1/customers/${e}/lopd-documents`,method:"get"})}async getCustomerLopdDocuments(e,s){this._requestCustomerLopdDocuments(e,s)}_setGenericRequest({dm:e,path:s,method:t}){return e.native=!1,e.requiresToken=!0,e.path=`${s}`,e.method=t,e.generateRequest()}_responseMapping(e){return e.data?e.data:e}}customElements.define(d.is,d);export{d as BbvaCustomerLopdDocumentsEsApiDm};
