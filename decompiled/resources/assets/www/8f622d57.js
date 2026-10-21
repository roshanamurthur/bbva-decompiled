import{a as e,h as t,i as a,b as s}from"./952f98a9.js";import{B as r}from"./e352c657.js";class i extends(e(r)){static get is(){return"bbva-financial-overview-es-api-dm"}static get scopedElements(){const e=[s];return i.scopedElementsFromClasses(e)}render(){return t`
      ${this.foDM}
    `}get foDM(){return t`
      <bbva-core-generic-dp
        id="financialOverview"
        requirestoken
        cross-domain
        host="${this.host}"
        .path="${this.path}"
        headers="${a(((e,t)=>{let a={};if(e.includes("ASO")){const e="x-dm-local-",t=window.sessionStorage;a=Object.keys(t).filter((t=>t.startsWith(e))).reduce(((a,s)=>(a[s.replace(e,"")]=t.getItem(s),a)),{})}return JSON.stringify({...t,...a})})(this.host,this.headers))}"
        method="GET"
        .cacheType="${this.cacheType}"
        .cacheKey="${this.cacheKey}"
        .semaasMonitoring="${this.semaasMonitoring}"
        .encodeCache="${this.encodeCache}"
        @request-success="${this._handleLocalDMSuccess}"
        @request-error="${this._handleLocalDMError}"
      >
      </bbva-core-generic-dp>
    `}async _handleLocalDMSuccess(e){const t=await this._responseMapping(e.detail.data);this.dispatchEvent(new CustomEvent("financial-overview-api-dm-fetch",{detail:t,bubbles:!0,composed:!0})),this.dispatchEvent(new CustomEvent("api-dm-response",{detail:t,bubbles:!0,composed:!0}))}_handleLocalDMError(e){this._handleError("financial-overview-api-dm-fetch-error",this.shadowRoot.querySelector("#financialOverview"))(e.detail)}async getFinancialOverview(){await this.updateComplete;const e=this.shadowRoot.querySelector("#financialOverview"),t=`originId=${window.sessionStorage.getItem("originId")}`;e.path=`retail-financial-aggregator/v1/financial-overview?${t}`,e.method="GET",e.generateRequest(!0)}_formatCardType(e){return{cardType:{id:e}}}_formatContracts(e){return e.map((e=>{const t=e.detail&&"CARD"===e.detail.productType?this._formatCardType(e.productType.id):{},[{currency:a,isMajor:s}]=e.currencies;return{id:e.id,alias:e.alias,number:e.number,detail:{...e.detail,...t},currencies:{currency:a,isMajor:s},productType:e.detail.productType,lastUpdateDate:e.lastUpdateDate}}))}async _responseMapping(e){var t;const a=new Map;null==e||null===(t=e.contracts)||void 0===t||t.forEach((e=>{const t=e.bank.id,s=e.bank.name;a.has(t)||a.set(t,{contracts:[],name:s}),a.get(t).contracts.push(e)}));return Array.from(a,(([e,{contracts:t,name:a}])=>({aggregatedEntityId:e,externalFinancialEntity:{id:e,name:a,contracts:this._formatContracts(t)}})))}}customElements.define(i.is,i);export{i as BbvaFinancialOverviewEsApiDm};
