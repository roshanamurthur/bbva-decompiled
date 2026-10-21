import{a as e,h as t,b as s}from"./952f98a9.js";import{c as i}from"./e5f89cd9.js";import"./5aa1c2be.js";import"./7f3d7ca9.js";import"./216055dc.js";import"./c0a2f832.js";import"./cae0f1de.js";class r extends(e(i)){static get is(){return"bbva-service-bills-mx-api-dm"}static get scopedElements(){const e=[s];return r.scopedElementsFromClasses(e)}async getServiceBills(e,t){var s;await this.updateComplete;const i={services:[{id:e,bills:[{id:null==t||null===(s=t.billReference)||void 0===s?void 0:s.value}]}]};this._requestServiceBills(i)}get searchBillTemplateDM(){return t`
      <bbva-core-generic-dp
        id="searchServiceBills"
        requiresToken
        cross-domain
        .host="${this.host}"
        .path="${this.path}"
        method="${this.method}"
        @request-success="${this._handleSearchBillSuccess}"
        @request-error="${this._handleSearchBillError}"
      >
      </bbva-core-generic-dp>
    `}_mappingSettingsResponse(e){let t=0,s="",i="",r="",a="";e.services.map((e=>{r=e.id,e.bills.map((e=>{a=e.id,e.maturityDate&&(s=e.maturityDate),e.amounts.map((e=>{"ORIGINAL_TOTAL_AMOUNT"===e.id&&(t=e.amount.amount,i=e.amount.currency)}))}))}));return{data:[{id:r,number:a,amounts:[{amountType:{id:"TOTAL_DEBT",name:"Total debt amount"},amountValue:{amount:t,currency:i}}],maturityDate:s}]}}_requestServiceBills(e){const t=this.shadowRoot.getElementById("searchServiceBills");t.body=e,this._setGenericRequest({dm:t,path:`payments/v${this.version}/service-bills/search`,method:"post"})}_setGenericRequest({dm:e,path:t,method:s}){return e.native=!1,e.requiresToken=!0,e.path=`${t}`,e.method=s,e.generateRequest()}async _handleSearchBillSuccess(e){var t;await this.updateComplete;const s=this._mappingSettingsResponse(null==e||null===(t=e.detail)||void 0===t?void 0:t.data);this._dispatchEvent(this.constructor.GET_EVENTS.customEvent,s)}_handleSearchBillError(e){this._dispatchEvent(this.constructor.GET_EVENTS.errorFireEventHandler,null==e?void 0:e.detail)}render(){return t` ${this.searchBillTemplateDM} `}}customElements.define(r.is,r);export{r as BbvaServiceBillsMxApiDm};
