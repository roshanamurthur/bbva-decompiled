import{a as e,h as t,i as s,b as i}from"./952f98a9.js";import{e as o}from"./ff18b1dc.js";import{g as a}from"./d4f10f09.js";import"./a0b89eb0.js";import"./4eb8d874.js";import"./40b41b3c.js";import"./a4e2d801.js";class r extends(e(o)){static get is(){return"bbva-account-limits-es-api-dm"}static get scopedElements(){const e=[i];return r.scopedElementsFromClasses(e)}render(){return t`
      <bbva-core-generic-dp
        requirestoken
        id="limitsData"
        headers="${s(a(this.host,this.headers))}"
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
    `}_handleLocalDMSuccess(e){const t=this._responseMapping(e.detail.data);this.dispatchEvent(new CustomEvent("account-limits-api-dm-fetch",{bubbles:!0,composed:!0,detail:t})),this.dispatchEvent(new CustomEvent("api-dm-response",{bubbles:!0,composed:!0,detail:!0}))}_handleLocalDMError(e){this._handleError("account-limits-api-dm-fetch-error",this.shadowRoot.querySelector("#limitsData"))(e.detail)}async getAccountLimits(e){const t=this.shadowRoot.querySelector("#limitsData");t.path=`accounts/v1/accounts/${e}/conditions`,t.generateRequest(!0)}_responseMapping(e){if(!e.length)return[];const t=e.find((e=>"conditions.limitAmount"===e.id)),{formats:s}=t;return[{id:"MAXIMUM_CREDIT",amountLimits:s.filter((e=>"AMOUNT"===e.format.formatType)).map((e=>e.format.amount))}]}}customElements.define(r.is,r);export{r as BbvaAccountLimitsEsApiDm};
