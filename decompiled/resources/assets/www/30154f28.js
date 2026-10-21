import{a as t,h as s,i as e,b as i}from"./952f98a9.js";import{d as o}from"./da3e0d64.js";import{g as r}from"./22a0f424.js";import"./e32b4658.js";import"./4dec7a01.js";import"./a7a3928b.js";import"./315263f5.js";import"./4eb8d874.js";import"./40b41b3c.js";import"./a4e2d801.js";import"./62b11973.js";import"./8ce4f6c3.js";import"./aaa76bb8.js";import"./29a2800d.js";import"./84af4f94.js";import"./e1831171.js";import"./7cfc68eb.js";import"./a83e7741.js";import"./ca1bc295.js";import"./e0054bd5.js";import"./cad32da5.js";import"./85e2fa69.js";import"./523f7d21.js";import"./8e6fdf7b.js";import"./bee1f904.js";import"./0b83b988.js";import"./5d5c4a21.js";class a extends(t(o)){static get is(){return"bbva-account-limits-es-api-dm"}static get scopedElements(){const t=[i];return a.scopedElementsFromClasses(t)}render(){return s`
      <bbva-core-generic-dp
        requirestoken
        id="limitsData"
        headers="${e(r(this.host,this.headers))}"
        host="${this.host}"
        method='GET'
        .cacheType="${this.cacheType}"
        cacheKey="${this.cacheKey}"
        .semaasMonitoring="${this.semaasMonitoring}"
        .encodeCache="${this.encodeCache}"
        @request-success="${this._handleLocalDMSuccess}"
        @request-error="${this._handleLocalDMError}"
        cross-domain>
      </bbva-core-generic-dp>
    `}_handleLocalDMSuccess(t){const s=this._responseMapping(t.detail.data);this.dispatchEvent(new CustomEvent("account-limits-api-dm-fetch",{bubbles:!0,composed:!0,detail:s})),this.dispatchEvent(new CustomEvent("api-dm-response",{bubbles:!0,composed:!0,detail:!0}))}_handleLocalDMError(t){this._handleError("account-limits-api-dm-fetch-error",this.shadowRoot.querySelector("#limitsData"))(t.detail)}async getAccountLimits(t){const s=this.shadowRoot.querySelector("#limitsData");s.path=`accounts/v1/accounts/${t}/conditions`,s.generateRequest()}_responseMapping(t){if(!t.length)return[];const s=t.find((t=>"conditions.limitAmount"===t.id)),{formats:e}=s;return[{id:"MAXIMUM_CREDIT",amountLimits:e.filter((t=>"AMOUNT"===t.format.formatType)).map((t=>t.format.amount))}]}}customElements.define(a.is,a);export{a as BbvaAccountLimitsEsApiDm};
