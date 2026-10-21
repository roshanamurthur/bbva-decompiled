import{aG as e,aH as t,aI as a}from"./7f3d7ca9.js";import{a7 as r,a8 as i,R as s,S as n,M as o,v as c,f as l,K as m,G as b,Q as d,a4 as p,a9 as h,V as u,N as y,D as g,a3 as f}from"./216055dc.js";import{z as v,ab as $,an as x,L as _,ak as S,h as A,i as C}from"./952f98a9.js";import{B as M,b as k}from"./2b04e291.js";class D extends e{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`loyalty/v${this.version}/referral-members`)}toString(){return super.toString("BGADPLoyaltyReferralMembersPostV0")}}class T extends r{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`loyalty/v${this.version}/referral-members`)}toString(){return super.toString("BGADPLoyaltyReferralMembersGetV0")}}class z extends i{static get is(){return"bbva-global-referral-members-api-dm"}static get properties(){return{referralMembers:{type:Array,attribute:!1}}}constructor(){super(),this.referralMembers=[]}resetReferralMembers(){this.referralMembers=[]}getReferralMembers(e={}){if(Object.keys(this.referralMembers).length)return;this._generateGetService(this._getService("get",{},e),{customEvent:"referral-members-api-dm-fetch",errorFireEventHandler:"referral-members-api-dm-fetch-error"},this._responseMapping,e.fields)}postReferralMembers(e){this._generateGetService(this._getService("post",e),{customEvent:"referral-members-api-dm-create",errorFireEventHandler:"referral-members-api-dm-create-error"},this._responseMapping),this.resetReferralMembers()}_getService(e,t={},a={}){const r=this._getServiceParams(a,t);return this._getServicePath(`${e}ReferralMembers`,this._getBgadp(r))}_getBgadp(e){return{getReferralMembersV0:()=>new T(e),postReferralMembersV0:()=>new D(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}var B=v`:host {
  display: block;
  box-sizing: border-box;
  --_member-get-member-receipt-accordion-text-color: var(--member-get-member-receipt-accordion-text-color, ${s("colorPrimaryText01Default",n)});
  --_member-get-member-receipt-accordion-text-color-open: var(--member-get-member-receipt-accordion-text-color-open, ${s("colorPrimaryLinkMainDefault",n)});
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.content-container {
  padding: 1rem 1rem 1.5rem 1rem;
}

.cta {
  margin-top: 1rem;
}

.cta-secondary {
  margin-top: 0.25rem;
}

.bbva-type-text-date {
  margin-top: 1.5rem;
}

.header-content {
  margin-bottom: 1.5rem;
}

.summary-content-items {
  padding: 0.5rem 0;
}
.summary-content-items :last-child {
  font-weight: ${s("fontWeight",$.medium)};
}

.notification-message {
  margin-top: 1.5rem;
  padding: 1rem 2rem 1rem 1rem;
}

.expandable-accordion {
  margin-top: 0.5rem;
}

.list-bullet {
  --gridSpacerVariant: 0;
  padding: 0;
}

.accordion-type-text {
  color: var(--_member-get-member-receipt-accordion-text-color);
  margin: 0 0.25rem;
}

.accordion-type-text.is-open {
  color: var(--_member-get-member-receipt-accordion-text-color-open);
}
`;class j extends(o(c(x(_)))){static get is(){return"bbva-widget-member-get-member-receipt"}static get scopedElements(){const e=[l,m,b,d,M,t,p,...j.configurationScopedElements()];return j.scopedElementsFromClasses(e)}static get properties(){return{receiptData:{type:Object},_accordionHandleTitleColor:{type:String},dataAcousticObfuscate:{type:Boolean,attribute:"data-acoustic-obfuscate"}}}constructor(){super(),this.receiptData={},this._accordionHandleTitleColor="",this.dataAcousticObfuscate=!1,this.addEventListener("expandable-accordion-open-change",this._accordionListener)}static get styles(){return[B,h.primary,h.primaryAlt,u.primary,u.primaryAlt,y.primary,y.primaryAlt,g.primary,g.primaryAlt,k.primary,k.primaryAlt,a.primary,a.primaryAlt,f.primary,f.primaryAlt,S("bbva-widget-member-get-member-receipt-shared-styles")]}_displayHeaderContent(e){return e?A`
      <div class="header-content">
        ${e.microillustration?A`
          <bbva-clip-microillustration
            ambient="${this.ambient}"
            class="${C(e.microillustration.class)}"
            microillustration="${C(e.microillustration.name)}"
            size="${C(e.microillustration.size)}">
          </bbva-clip-microillustration>`:""}

        ${this._displayBbvaTypeText(e.textContent)}
      </div>
    `:""}_displayBbvaTypeText(e){return e?e.map((e=>A`
      <bbva-type-text
        ambient="${this.ambient}"
        ?inherit="${e.inherit}"
        class="${C(e.class)}"
        size="${C(e.size)}"
        font-weight="${C(e.fontWeight)}"
        font-style="${C(e.fontStyle)}"
        text="${C(this.t(this._obfuscate(e.text)||""))}">
      </bbva-type-text>
    `)):""}_obfuscate(e){return/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}(?:\.[a-zA-Z]{2,})?$/.test(e)&&this.dataAcousticObfuscate?`•••${e.match(/.{4}@.+/)[0]}`:e}_displaySummaryHeader(e){return e?A`
      <bbva-header-category
        text="${e.text}"
        ambient="${this.ambient}"
        heading-level="1">
      </bbva-header-category>
    `:""}_displaySummaryContent(e){return e?e.map((e=>A`
      <div class="summary-content-items">
        ${this._displayBbvaTypeText(e)}
      </div>
    `)):""}_displayNotificationMessage(e){return e&&0!==Object.keys(e).length?A`
      <bbva-notification-message
        ambient="${this.ambient}"
        message-title="${C(e.messageTitle)}"
        description="${C(e.description)}"
        ?book-title="${e.bookTitle}"
        variant="${C(e.variant)}"
        icon="${C(e.icon)}"
        class="${C(e.class||"notification-message")}">
      </bbva-notification-message>
    `:""}_displayExpandableAccordion(e){return e&&0!==Object.keys(e).length?A`
      <bbva-expandable-accordion
        class="expandable-accordion"
        ambient="${this.ambient}">
        <div slot="header">
          <bbva-type-text
            inherit
            ambient="${this.ambient}"
            class="accordion-type-text ${this._accordionHandleTitleColor}"
            text="${C(e.title||"")}"
            font-weight="${C(e.titleFontWeight)}"
            size="${C(e.titleSize)}">
          </bbva-type-text>
        </div>
        <div slot="content">
          <bbva-list-bullet
            class="list-bullet">
            <bbva-type-text
              inherit
              ambient="${this.ambient}"
              text="${C(e.textContent||"")}"
              size="${C(e.textContentSize)}">
            </bbva-type-text>
          </bbva-list-bullet>
        </div>
      </bbva-expandable-accordion>
    `:""}_displayButtonDefault(e){return e&&0!==Object.keys(e).length?A`
      <bbva-button-default
        class="cta"
        id="${C(e.id)}"
        text="${C(e.text)}"
        ambient="${this.ambient}"
        ?fullwidth="${e.fullwidth}"
        @click=${this._onClickCta}>
      </bbva-button-default>
    `:""}_displayTypeLink(e){return e&&0!==Object.keys(e).length?A`
      <bbva-button-default
        class="cta-secondary"
        id="${C(e.id)}"
        ambient="${this.ambient}"
        variant="link"
        text="${C(e.text)}"
        fullwidth
        @click="${this._onClickCta}"
      ></bbva-button-default>
    `:""}_onClickCta(e){this.dispatchEvent(new CustomEvent(`cta-clicked-${e.target.id}`,{bubbles:!0,composed:!0}))}_accordionListener(e){this._accordionHandleTitleColor=e.detail?"":" is-open"}render(){return A`
     <div class="content-container">
        ${this._displayHeaderContent(this.receiptData.headerContent)}
        <slot name="mgm-receipt-after-header-content"></slot>
        ${this._displaySummaryHeader(this.receiptData.summaryHeader)}
        ${this._displaySummaryContent(this.receiptData.summaryContent)}
        <slot name="mgm-receipt-after-summary-content"></slot>
        ${this._displayNotificationMessage(this.receiptData.notificationMessage)}
        <slot name="mgm-receipt-after-notification-message"></slot>
        ${this._displayExpandableAccordion(this.receiptData.expandableAccordion)}
        <slot name="mgm-receipt-after-expandable-accordion"></slot>
        ${this._displayButtonDefault(this.receiptData.buttonDefault)}
        ${this._displayTypeLink(this.receiptData.typeLink)}
      </div>
    `}}export{j as B,z as a};
