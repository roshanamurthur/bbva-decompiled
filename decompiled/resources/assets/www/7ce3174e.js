import{a as t,h as e,i as n,b as i}from"./952f98a9.js";import{I as a}from"./7f3d7ca9.js";import{g as s}from"./b70f402d.js";import"./216055dc.js";import"./c0a2f832.js";import"./cae0f1de.js";class c extends(t(a)){static get is(){return"bbva-flexible-financings-financing-line-financial-statement-mx-api-dm"}static get scopedElements(){const t=[i];return c.scopedElementsFromClasses(t)}static get properties(){return{_accountNumber:{type:String}}}constructor(){super(),this._accountNumber=""}get financingLineDM(){return e`
      <bbva-core-generic-dp
        id="financingLine"
        requiresToken
        cross-domain
        .host="${this.host}"
        .path="${this.path}"
        headers="${n(s(this.host))}"
        method="${this.method}"
        @request-success="${this._handleFinancingLineFetch}"
        @request-error="${this._handleFinancingLineFetchError}">
      </bbva-core-generic-dp>
    `}get accountStatementsDM(){return e`
      <bbva-core-generic-dp
        id="accountStatements"
        requiresToken
        cross-domain
        .host="${this.host}"
        .path="${this.path}"
        headers="${n(s(this.host))}"
        method="${this.method}"
        @request-success="${this._handleAccountStatementsFetch}"
        @request-error="${this._handleAccountStatementsFetchError}">
      </bbva-core-generic-dp>
    `}get accountStatementDM(){return e`
      <bbva-core-generic-dp
        id="accountStatement"
        requiresToken
        cross-domain
        .host="${this.host}"
        .path="${this.path}"
        headers="${n(s(this.host))}"
        method="${this.method}"
        @request-success="${this._handleAccountStatementFetch}"
        @request-error="${this._handleAccountStatementFetchError}">
      </bbva-core-generic-dp>
    `}async _handleAccountStatementsFetch({detail:t}){await this.updateComplete;const e=null==t?void 0:t.listPeriods,n=null==e?void 0:e.find((({reference:t})=>t===this.financialStatementId)),{period:i,reference:a,cutDate:s}=n;this._requestAccountStatement({period:i,reference:a,cutDate:s})}_handleAccountStatementsFetchError(t){this._handleError("financing-line-financial-statement-api-dm-fetch-error",this.shadowRoot.getElementById("accountStatements"))(null==t?void 0:t.detail)}async getFinancingLineFinancialStatement(t,e){this._requestFinancingLine(t),this.financialStatementId=e}_requestFinancingLine(t){const e=this.shadowRoot.getElementById("financingLine");this._setGenericRequest({dm:e,path:`flexible-financings/v0/financing-lines/${t}`,method:"get"})}_requestAccountStatement({period:t,reference:e,cutDate:n}){const i=this.shadowRoot.getElementById("accountStatement");this._setGenericRequest({dm:i,path:`accountStatement/V04/?accountId=${this._accountNumber}&productType=CHECKACCOUNT&period=${t}&format=PDF&reference=${e}&cutDate=${n}`,method:"get"})}_setGenericRequest({dm:t,path:e,method:n}){return t.native=!1,t.requiresToken=!0,t.path=`${e}`,t.method=n,t.generateRequest()}async _handleFinancingLineFetch({detail:t}){var e;await this.updateComplete,this._accountNumber=null==t||null===(e=t.data)||void 0===e?void 0:e.number,this._requestAccountStatements()}_requestAccountStatements(){const t=this.shadowRoot.getElementById("accountStatements");this._setGenericRequest({dm:t,path:`accountStatement/V04/listPeriods?productType=CONSUMER&accountId=${this._accountNumber}`,method:"get"})}async _handleAccountStatementFetch({detail:t}){await this.updateComplete;const e=this._responseMapping(t);this._dispatchEvent("financing-line-financial-statement-api-dm-fetch",e),this._dispatchEvent("api-dm-response",!0)}_handleFinancingLineFetchError(t){this._handleError("financing-line-financial-statement-api-dm-fetch-error",this.shadowRoot.getElementById("financingLine"))(null==t?void 0:t.detail)}_handleAccountStatementFetchError(t){this._handleError("financing-line-financial-statement-api-dm-fetch-error",this.shadowRoot.getElementById("accountStatements"))(null==t?void 0:t.detail)}_responseMapping({documentFile:t}){return null==t?void 0:t.data}render(){return e` ${this.financingLineDM}${this.accountStatementsDM}${this.accountStatementDM} `}}customElements.define(c.is,c);export{c as BbvaFlexibleFinancingsFinancingLineFinancialStatementMxApiDm};
