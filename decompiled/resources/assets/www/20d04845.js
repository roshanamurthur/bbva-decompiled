import{a as t,h as e,i as s,b as i}from"./952f98a9.js";import{B as r}from"./1fea3c7f.js";import"./216055dc.js";import"./67256d35.js";import"./20acd25d.js";import"./f89161ad.js";import"./7d773f57.js";import"./7f3d7ca9.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./d2484b66.js";import"./4656db6d.js";import"./1aa01966.js";import"./4861c1f7.js";import"./32b24593.js";import"./077d7438.js";import"./13014d63.js";import"./7f28d0e7.js";import"./cff03f17.js";import"./577155d8.js";import"./1979ce36.js";import"./a101086e.js";import"./a0b89eb0.js";import"./4eb8d874.js";import"./40b41b3c.js";import"./a4e2d801.js";import"./fcddf1cb.js";class a extends(t(r)){static get is(){return"bbva-account-participants-es-api-dm"}get _ASOCustomHeaders(){let t={};if(this.host.includes("ASO")){const e="x-dm-local-",s=window.sessionStorage;t=Object.keys(s).filter((t=>t.startsWith(e))).reduce(((t,i)=>(t[i.replace(e,"")]=s.getItem(i),t)),{})}return JSON.stringify({...this.headers,...t})}static get scopedElements(){const t=[i];return a.scopedElementsFromClasses(t)}render(){return e`
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
    `}async _handleLocalDMSuccess(t){const e=await this._responseMapping(t.detail);this.dispatchEvent(new CustomEvent("account-participants-api-dm-fetch",{bubbles:!0,composed:!0,detail:e})),this.dispatchEvent(new CustomEvent("api-dm-response",{bubbles:!0,composed:!0,detail:!0}))}_handleLocalDMError(t){this._handleError("account-participants-api-dm-fetch-error",this.shadowRoot.querySelector("#accountParticipantsDP"))(t.detail)}getAccountParticipants(t){const e=this.shadowRoot.querySelector("#accountParticipantsDP");e.path=`contracts/V01/${t}/participants`,e.generateRequest()}_getGlobalParticipantTypeId(t){return{TIT:"HOLDER",PAU:"AUTHORIZED",REP:"REPRESENTATIVE"}[t]??t}async _responseMapping(t){return await this.updateComplete,null!=t&&t.participants?t.participants.map((t=>{const{relationship:e}=t,s=this._getGlobalParticipantTypeId(e.type.id);return{id:s,order:e.order,participantType:{id:s,name:e.type.name},customDetails:{customerId:t.id,firstName:t.name,lastName:t.lastName,personType:"NATURAL_KNOWN"}}})):[]}}customElements.define(a.is,a);export{a as BbvaAccountParticipantsEsApiDm};
