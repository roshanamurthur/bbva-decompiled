import{a as e,h as t,i as s,b as a}from"./952f98a9.js";import{d as i}from"./ff18b1dc.js";import"./a0b89eb0.js";import"./4eb8d874.js";import"./40b41b3c.js";import"./a4e2d801.js";class r extends(e(i)){static get is(){return"bbva-account-participants-es-api-dm"}get _ASOCustomHeaders(){let e={};if(this.host.includes("ASO")){const t="x-dm-local-",s=window.sessionStorage;e=Object.keys(s).filter((e=>e.startsWith(t))).reduce(((e,a)=>(e[a.replace(t,"")]=s.getItem(a),e)),{})}return JSON.stringify({...this.headers,...e})}static get scopedElements(){const e=[a];return r.scopedElementsFromClasses(e)}render(){return t`
      <bbva-core-generic-dp
        requirestoken
        id="accountParticipantsDP"
        headers="${s(this._ASOCustomHeaders)}"
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
    `}async _handleLocalDMSuccess(e){const t=await this._responseMapping(e.detail);this.dispatchEvent(new CustomEvent("account-participants-api-dm-fetch",{bubbles:!0,composed:!0,detail:t})),this.dispatchEvent(new CustomEvent("api-dm-response",{bubbles:!0,composed:!0,detail:!0}))}_handleLocalDMError(e){this._handleError("account-participants-api-dm-fetch-error",this.shadowRoot.querySelector("#accountParticipantsDP"))(e.detail)}getAccountParticipants(e){const t=this.shadowRoot.querySelector("#accountParticipantsDP");t.path=`contracts/V01/${e}/participants`,t.generateRequest()}_getGlobalParticipantTypeId(e){return{TIT:"HOLDER",PAU:"AUTHORIZED",REP:"REPRESENTATIVE"}[e]??e}async _responseMapping(e){return await this.updateComplete,null!=e&&e.participants?e.participants.map((e=>{const{relationship:t}=e,s=this._getGlobalParticipantTypeId(t.type.id);return{id:s,order:t.order,participantType:{id:s,name:t.type.name},customDetails:{customerId:e.id,firstName:e.name,lastName:e.lastName,personType:"NATURAL_KNOWN"}}})):[]}}customElements.define(r.is,r);export{r as BbvaAccountParticipantsEsApiDm};
