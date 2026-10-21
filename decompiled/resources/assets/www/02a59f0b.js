import{a as e,h as t,i as s,b as a}from"./952f98a9.js";import{a as o}from"./4966a83d.js";import"./216055dc.js";class r extends(e(o)){static get is(){return"bbva-balances-es-api-dm"}static get scopedElements(){const e=[a];return r.scopedElementsFromClasses(e)}render(){return t`${this.balancesDM}`}get balancesDM(){return t`<bbva-core-generic-dp
      id="balancesData"
      requirestoken
      cross-domain
      host="${this.host}"
      .path="${this.path}"
      headers="${s(((e,t)=>{let s={};if(e.includes("ASO")){const e="x-dm-local-",t=window.sessionStorage;s=Object.keys(t).filter((t=>t.startsWith(e))).reduce(((s,a)=>(s[a.replace(e,"")]=t.getItem(a),s)),{})}return JSON.stringify({...t,...s})})(this.host,this.headers))}"
      method='GET'
      .cacheType="${this.cacheType}"
      .cacheKey="${this.cacheKey}"
      .semaasMonitoring="${this.semaasMonitoring}"
      .encodeCache="${this.encodeCache}"
      @request-success="${this._handleLocalDMSuccess}"
      @request-error="${this._handleLocalDMError}"
    ></bbva-core-generic-dp>`}async _handleLocalDMSuccess(e){const t=await this._responseMapping(e.detail.data);this.dispatchEvent(new CustomEvent("balances-api-dm-fetch",{detail:t,bubbles:!0,composed:!0})),this.dispatchEvent(new CustomEvent("api-dm-response",{detail:t,bubbles:!0,composed:!0}))}_handleLocalDMError(e){this._handleError("balances-api-dm-fetch-error",this.shadowRoot.querySelector("#balancesData"))(e.detail)}async getBalances(e){var t;await this.updateComplete;const s=this.shadowRoot.querySelector("#balancesData"),a=`${null===(t=e["store.id"])||void 0===t?void 0:t.map((e=>`store.id=${e}`)).join("&")}&fromPostedDate=${e.fromPostedDate}&toPostedDate=${e.toPostedDate}`;s.path=`stores/v0/balances?${a}`,s.method="GET",s.generateRequest(!0)}_responseMapping(e){if(null==e||!e.length)return[];return e.map((e=>({beginDate:e.beginDate,endDate:e.endDate,sales:e.sales.map((e=>({amount:{amount:e.amount,currency:e.currency}})))})))}}customElements.define(r.is,r);export{r as BbvaBalancesEsApiDm};
