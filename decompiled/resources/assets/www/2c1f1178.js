import{a as t,h as s,i,b as o}from"./952f98a9.js";import{a as e,g as r}from"./b106b40b.js";import"./216055dc.js";import"./030ebdec.js";import"./1aa4dd16.js";import"./6547a2ba.js";import"./43e23805.js";import"./5d7c176a.js";import"./be12d7a2.js";import"./41ed0536.js";import"./a0b89eb0.js";import"./4eb8d874.js";import"./40b41b3c.js";import"./a4e2d801.js";import"./05f50fad.js";import"./84dff06e.js";import"./41622877.js";import"./53aa438e.js";import"./f052f222.js";import"./a6a31124.js";import"./af1c6cf3.js";import"./4d2e5f99.js";import"./cf174536.js";import"./c5fdbfff.js";import"./79ad01ce.js";import"./68ec5adf.js";import"./2a0abc39.js";import"./4966a83d.js";import"./77df3611.js";import"./72e6e777.js";import"./9e63ca53.js";import"./161ddab1.js";import"./8bd0c9e1.js";import"./19a62a96.js";import"./eb966b2a.js";import"./ab4d0dcb.js";import"./ff7f0130.js";import"./30ef6f1f.js";import"./854beed0.js";import"./815eb855.js";import"./2fc6c95e.js";import"./6b902eda.js";class m extends(t(e)){static get is(){return"bbva-account-limits-es-api-dm"}static get scopedElements(){const t=[o];return m.scopedElementsFromClasses(t)}render(){return s`
      <bbva-core-generic-dp
        requirestoken
        id="limitsData"
        headers="${i(r(this.host,this.headers))}"
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
    `}_handleLocalDMSuccess(t){const s=this._responseMapping(t.detail.data);this.dispatchEvent(new CustomEvent("account-limits-api-dm-fetch",{bubbles:!0,composed:!0,detail:s})),this.dispatchEvent(new CustomEvent("api-dm-response",{bubbles:!0,composed:!0,detail:!0}))}_handleLocalDMError(t){this._handleError("account-limits-api-dm-fetch-error",this.shadowRoot.querySelector("#limitsData"))(t.detail)}async getAccountLimits(t){const s=this.shadowRoot.querySelector("#limitsData");s.path=`accounts/v1/accounts/${t}/conditions`,s.generateRequest(!0)}_responseMapping(t){if(!t.length)return[];const s=t.find((t=>"conditions.limitAmount"===t.id)),{formats:i}=s;return[{id:"MAXIMUM_CREDIT",amountLimits:i.filter((t=>"AMOUNT"===t.format.formatType)).map((t=>t.format.amount))}]}}customElements.define(m.is,m);export{m as BbvaAccountLimitsEsApiDm};
