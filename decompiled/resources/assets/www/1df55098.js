import{a as e,h as t,i as n,b as i}from"./952f98a9.js";import{H as s}from"./7f3d7ca9.js";import{g as a}from"./b70f402d.js";import"./216055dc.js";import"./c0a2f832.js";import"./cae0f1de.js";class c extends(e(s)){static get is(){return"bbva-flexible-financings-financing-line-financial-statements-mx-api-dm"}static get scopedElements(){const e=[i];return c.scopedElementsFromClasses(e)}get financingLineDM(){return t`
      <bbva-core-generic-dp
        id="financingLine"
        requiresToken
        cross-domain
        .host="${this.host}"
        .path="${this.path}"
        headers="${n(a(this.host))}"
        method="${this.method}"
        @request-success="${this._handleFinancingLineFetch}"
        @request-error="${this._handleFinancingLineFetchError}"
      >
      </bbva-core-generic-dp>
    `}get accountStatemenstDM(){return t`
      <bbva-core-generic-dp
        id="accountStatements"
        requiresToken
        cross-domain
        .host="${this.host}"
        .path="${this.path}"
        headers="${n(a(this.host))}"
        method="${this.method}"
        @request-success="${this._handleAccountStatementsFetch}"
        @request-error="${this._handleAccountStatementsFetchError}"
      >
      </bbva-core-generic-dp>
    `}async getFinancingLineFinancialStatements(e){this._requestFinancingLine(e)}_requestFinancingLine(e){const t=this.shadowRoot.getElementById("financingLine");this._setGenericRequest({dm:t,path:`flexible-financings/v0/financing-lines/${e}`,method:"get"})}_requestAccountStatements(e){const t=this.shadowRoot.getElementById("accountStatements");this._setGenericRequest({dm:t,path:`accountStatement/V04/listPeriods?productType=CONSUMER&accountId=${e}`,method:"get"})}_setGenericRequest({dm:e,path:t,method:n}){return e.native=!1,e.requiresToken=!0,e.path=`${t}`,e.method=n,e.generateRequest()}async _handleFinancingLineFetch({detail:e}){var t;await this.updateComplete;const n=null==e||null===(t=e.data)||void 0===t?void 0:t.number;this._requestAccountStatements(n)}async _handleAccountStatementsFetch(e){await this.updateComplete;const t=this._responseMapping(null==e?void 0:e.detail);this._dispatchEvent("financing-line-financial-statements-api-dm-fetch",t),this._dispatchEvent("api-dm-response",!0)}_handleFinancingLineFetchError(e){this._handleError("financing-line-financial-statements-api-dm-fetch-error",this.shadowRoot.getElementById("financingLine"))(null==e?void 0:e.detail)}_handleAccountStatementsFetchError(e){var t;409===(null==e||null===(t=e.detail)||void 0===t?void 0:t.status)?this._dispatchEvent("financing-line-financial-statements-api-dm-fetch",[]):this._handleError("financing-line-financial-statements-api-dm-fetch-error",this.shadowRoot.getElementById("accountStatements"))(null==e?void 0:e.detail)}_mappingFinancialStatementsResponse(e){var t;return null==e||null===(t=e.listPeriods)||void 0===t?void 0:t.map((e=>({cutOffDate:null==e?void 0:e.cutDate,id:null==e?void 0:e.reference,isActive:!0})))}_responseMapping(e){return this._mappingFinancialStatementsResponse(e)}render(){return t` ${this.financingLineDM}${this.accountStatemenstDM} `}}customElements.define(c.is,c);export{c as BbvaFlexibleFinancingsFinancingLineFinancialStatementsMxApiDm};
