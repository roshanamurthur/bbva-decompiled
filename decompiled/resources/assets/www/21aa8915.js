import{a as t,h as e,i as s,b as i}from"./952f98a9.js";import{c as r}from"./da3e0d64.js";import"./e32b4658.js";import"./4dec7a01.js";import"./a7a3928b.js";import"./315263f5.js";import"./4eb8d874.js";import"./40b41b3c.js";import"./a4e2d801.js";import"./62b11973.js";import"./8ce4f6c3.js";import"./aaa76bb8.js";import"./29a2800d.js";import"./84af4f94.js";import"./e1831171.js";import"./7cfc68eb.js";import"./a83e7741.js";import"./ca1bc295.js";import"./e0054bd5.js";import"./cad32da5.js";import"./85e2fa69.js";import"./523f7d21.js";import"./8e6fdf7b.js";import"./bee1f904.js";import"./0b83b988.js";import"./5d5c4a21.js";class a extends(t(r)){static get is(){return"bbva-account-participants-es-api-dm"}get _ASOCustomHeaders(){let t={};if(this.host.includes("ASO")){const e="x-dm-local-",s=window.sessionStorage;t=Object.keys(s).filter((t=>t.startsWith(e))).reduce(((t,i)=>(t[i.replace(e,"")]=s.getItem(i),t)),{})}return JSON.stringify({...this.headers,...t})}static get scopedElements(){const t=[i];return a.scopedElementsFromClasses(t)}render(){return e`
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
