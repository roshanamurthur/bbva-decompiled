import{a as t,h as s,i as e,b as o}from"./952f98a9.js";import{d as i}from"./c0ce0520.js";import{g as r}from"./7059525f.js";import"./216055dc.js";import"./7f3d7ca9.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./8e6fdf7b.js";import"./9b163ef4.js";import"./a0b89eb0.js";import"./4eb8d874.js";import"./40b41b3c.js";import"./a4e2d801.js";import"./62b11973.js";import"./8ce4f6c3.js";import"./8fb82dfa.js";import"./4acd66de.js";import"./459715fc.js";import"./1aa4dd16.js";import"./6580680e.js";import"./a54cd56b.js";import"./d7cc5593.js";import"./30ef6f1f.js";import"./854beed0.js";import"./84dff06e.js";import"./5e7550b1.js";import"./ff2cdeea.js";class a extends(t(i)){static get is(){return"bbva-account-limits-es-api-dm"}static get scopedElements(){const t=[o];return a.scopedElementsFromClasses(t)}render(){return s`
      <bbva-core-generic-dp
        requirestoken
        id="limitsData"
        headers="${e(r(this.host,this.headers))}"
        host="${this.host}"
        method='GET'
        .cacheType="${this.cacheType}"
        .cacheKey="${this.cacheKey}"
        .semaasMonitoring="${this.semaasMonitoring}"
        .encodeCache="${this.encodeCache}"
        @request-success="${this._handleLocalDMSuccess}"
        @request-error="${this._handleLocalDMError}"
        cross-domain>
      </bbva-core-generic-dp>
    `}_handleLocalDMSuccess(t){const s=this._responseMapping(t.detail.data);this.dispatchEvent(new CustomEvent("account-limits-api-dm-fetch",{bubbles:!0,composed:!0,detail:s})),this.dispatchEvent(new CustomEvent("api-dm-response",{bubbles:!0,composed:!0,detail:!0}))}_handleLocalDMError(t){this._handleError("account-limits-api-dm-fetch-error",this.shadowRoot.querySelector("#limitsData"))(t.detail)}async getAccountLimits(t){const s=this.shadowRoot.querySelector("#limitsData");s.path=`accounts/v1/accounts/${t}/conditions`,s.generateRequest(!0)}_responseMapping(t){if(!t.length)return[];const s=t.find((t=>"conditions.limitAmount"===t.id)),{formats:e}=s;return[{id:"MAXIMUM_CREDIT",amountLimits:e.filter((t=>"AMOUNT"===t.format.formatType)).map((t=>t.format.amount))}]}}customElements.define(a.is,a);export{a as BbvaAccountLimitsEsApiDm};
