import{J as e,L as t,a as s,h as a,b as o}from"./952f98a9.js";class r extends(e(t)){}class c extends(s(r)){static get is(){return"bbva-local-application-catalogs-api-dm"}static get scopedElements(){const e=[o];return c.scopedElementsFromClasses(e)}static get properties(){return{native:{type:Boolean},catalogRecords:{type:Object,attribute:!1}}}constructor(){super(),this.native=!1}get catalogRecordsDm(){return a`
      <bbva-core-generic-dp
        id="catalogRecordsApiGenericDm"
        requiresToken
        cross-domain
        .host="${this.host}"
        .path="${this.path}"
        .native="${this.native}"
        headers="${this.headers}"
        method="${this.method}"
        @request-success="${this._handleLocalDMSuccess}"
        @request-error="${this._handleLocalDMerror}"
      >
      </bbva-core-generic-dp>
    `}resetCatalogRecords(){this.catalogRecords={}}getCatalogRecords(e){const t=this.shadowRoot.getElementById("catalogRecordsApiGenericDm");this._setGenericRequest({dm:t,path:`application-catalogs/v0/sustainable-category-catalogs/${e}/records`,method:"GET"})}getCatalogCustomersRecords(e){const t=this.shadowRoot.getElementById("catalogRecordsApiGenericDm");this._setGenericRequest({dm:t,path:`applicationcatalogs/v0/application-catalogs/customers/${e}/records`,method:"GET"})}_setGenericRequest({dm:e,path:t,method:s}){const a=e;return a.native=this.native,a.requiresToken=!0,a.path=`${t}`,a.method=s,a.generateRequest()}async _handleLocalDMSuccess(e){const t=c._responseMapping(e.detail.data);this.dispatchEvent(new CustomEvent("catalog-record-api-dm-fetch",{bubbles:!0,composed:!0,detail:t}))}async _handleLocalDMerror(e){const t=e.detail;this.dispatchEvent(new CustomEvent("catalog-record-api-dm-error",{bubbles:!0,composed:!0,detail:t}))}static _responseMapping(e){return e}render(){return a`${this.catalogRecordsDm}`}}export{c as B};
