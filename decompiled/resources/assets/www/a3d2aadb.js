import"./7f3d7ca9.js";import"./216055dc.js";import"./85b2133f.js";import{H as t,z as i,a8 as e,ac as a,ad as o,ab as n,ar as s,a9 as r,aa as c,b_ as l,a as b,aJ as d,cE as p,F as h,cF as g,b$ as m,ak as u,bx as v,h as y,bt as f,c0 as $,cG as k,g as x,an as S,L as _,aD as C,aN as w,ah as E,bU as I,af as B,b4 as j,cH as L,bI as z,cD as A}from"./952f98a9.js";import{B as P}from"./cc301dbe.js";import"./a2b15c7c.js";import"./51384888.js";import"./9ff8f72c.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./17741512.js";import"./5aa1c2be.js";import"./e4099866.js";import"./a6969bf4.js";import"./ca1bc295.js";const T=t((t=>class extends t{static get properties(){return{host:{type:String,attribute:"host"},native:{type:Boolean},requiredToken:{type:String,attribute:"required-token"},language:{type:String},headers:{type:Object},ambient:{type:String,reflect:!0},locale:{type:String},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},publicSettingsHost:{type:String,attribute:"public-settings-host"},publicSettingsRequiredToken:{type:String,attribute:"public-settings-required-token"},history:{type:Object}}}constructor(){super(),this.native=!1,this.iOSFixedHeader=!1,this.publicSettingsRequiredToken="none"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("help-modal-open",this._handleModalState),this.addEventListener("help-modal-close",this._handleModalState),this.setAttribute("data-tag-name",this.constructor.is)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("help-modal-open",this._handleModalState),this.removeEventListener("help-modal-close",this._handleModalState)}static scopedElementsFromClasses(t){return t.reduce(((t,i)=>(t[i.is]=i,t)),{})}_handleModalState(t){var i;const e=null==t||null===(i=t.detail)||void 0===i?void 0:i.modal;this.dispatchEvent(new CustomEvent("modal-state-change",{bubbles:!0,composed:!0,detail:{visible:null==e?void 0:e.visible,modal:e}}))}})),F=new s;var H=i`:host {
  cursor: pointer;
  display: flex;
  box-sizing: border-box;
  flex-direction: column;
  align-items: center;
  text-align: center;
  max-width: var(--bbva-button-action-max-width, 4.125rem);
  font-size: var(--typographyType3XSmall, ${e(a.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${e(o.type3XSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(n.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${e(n.medium.fontStyle)});
  width: 100%;
  height: 100%;
  --_button-action-color: var(--bbva-button-action-dark-mode-color, var(--bbva-button-action-color, var(--colorsPrimaryMedium, ${e(r.primaryMedium)})));
  --_button-action-active-color: var(--bbva-button-action-active-dark-mode-color, var(--bbva-button-action-active-color, var(--colorsPrimaryCoreDark, ${e(r.primaryCoreDark)})));
  --_dark-display: var(--bbva-button-action-card-logo-dark-mode-dark-display, var(--bbva-button-action-card-logo-dark-display, none));
  --_light-display: var(--bbva-button-action-card-logo-dark-mode-light-display, var(--bbva-button-action-card-logo-light-display, inline));
}

:host(:not([href])) {
  border: none;
  border-radius: 0;
  color: var(--_button-action-color);
}
:host(:not([href]))[active]:not([aria-disabled=true]) {
  background-color: transparent;
}

:host([disabled]) {
  opacity: 0.4;
  cursor: default;
  pointer-events: none;
}

[data-tag-name=bbva-icon] {
  fill: var(--_button-action-color);
}

:host(:not([href])[active]:not([aria-disabled=true])) {
  background-color: transparent;
  color: var(--_button-action-active-color);
}
:host(:not([href])[active]:not([aria-disabled=true])) [data-tag-name=bbva-icon] {
  fill: var(--_button-action-active-color);
}

.app-pay-icon svg {
  height: 1.5rem;
  max-width: 3rem;
}
.app-pay-icon svg .dark, .app-pay-icon svg.dark {
  display: var(--_dark-display);
}
.app-pay-icon svg .light, .app-pay-icon svg.light {
  display: var(--_light-display);
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.text {
  cursor: pointer;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(c.spacer)}))) / 16) * 1rem);
  overflow-wrap: anywhere;
  hyphens: auto;
}

[data-tag-name=bbva-badge-notification] {
  --_margin-left: 0;
}

@supports (-webkit-line-clamp: 3) {
  .text {
    overflow: hidden;
    text-overflow: ellipsis;
    display: -webkit-box;
    -webkit-line-clamp: 3;
    -webkit-box-orient: vertical;
  }
}
${F.mediaRules()}`;var M=i`[ambient^=light] {
  --bbva-button-action-color: initial;
  --bbva-button-action-active-color: initial;
  --bbva-button-action-card-logo-dark-display: none;
  --bbva-button-action-card-logo-light-display: initial;
}
${(new s).mediaRules()}`;const N=new s;const R={dark:i`
    ${i`[ambient^=dark] {
  --bbva-button-action-color: var(--colorsPrimaryCoreLightened, ${e(r.primaryCoreLightened)});
  --bbva-button-action-active-color: var(--colorsPrimarySubduedLight, ${e(r.primarySubduedLight)});
  --bbva-button-action-card-logo-dark-display: inline;
  --bbva-button-action-card-logo-light-display: none;
}
${N.mediaRules()}`}
    ${l.dark}
  `,light:i`
    ${M}
    ${l.light}
  `};class D extends(b(d(p))){static get is(){return"bbva-button-action"}static get scopedElements(){return{"bbva-icon":h,"bbva-core-image":g,"bbva-badge-notification":m}}static get properties(){return{icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},appPayIcon:{type:String,attribute:"app-pay-icon"},imageAltText:{type:String,attribute:"image-alt-text"},label:{type:String},notifications:{type:Number},notificationsVariant:{type:String,attribute:"notifications-variant"},notificationsPosition:{type:String,attribute:"notifications-position"},notificationsAccesibilityText:{type:String}}}constructor(){super(),this.iconSize=24,this.icon="",this.image="",this.imageAltText="",this.notificationsPosition="right",this.appPayIcon=""}static get styles(){return[super.styles,H,u("bbva-button-action-shared-styles"),v(),R.light,R.dark]}get _imageWidth(){return 2*this.iconSize}get getIcon(){return this.icon?y`
        <bbva-icon onclick="void(0)" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>
      `:this.appPayIcon?y`<div class="app-pay-icon">${f[this.appPayIcon]}</div>`:y`
        <bbva-core-image
          .src="${this.image}"
          .alt="${this.imageAltText}"
          sizing="contain"
          .width="${this._imageWidth}"
          .height="${this.iconSize}"
          onclick="void(0)"
          position="center"
        ></bbva-core-image>
      `}render(){return y`
      ${this.notifications?y`
            <bbva-badge-notification
              ambient="light"
              .accessibilityText="${this.notificationsAccesibilityText}"
              .text="${this.notifications}"
              .position="${this.notificationsPosition}"
              .variant="${this.notificationsVariant}"
              >${this.getIcon}
            </bbva-badge-notification>
          `:y` ${this.getIcon} `}
      <span class="text" onclick="void(0)"> ${this.label} </span>
      <slot></slot>
      ${this._action}
    `}}x("colors.primarySubdued"),x("colors.primaryCoreLight");var q=i`:host {
  display: block;
  box-sizing: border-box;
}

:host .list-items,
bbva-list-contact {
  padding: 0;
}

:host .list-items {
  list-style: none;
  @apply --bbva-aggregation-contact-list-items;
}
:host .list-items .item-contact {
  margin-bottom: 1.4375rem;
  position: relative;
  display: flex;
  justify-content: space-between;
  @apply --bbva-aggregation-contact-list-item-contact;
}
:host .list-items .item-contact .help-icon {
  display: flex;
  font: inherit;
  color: inherit;
  margin: 0px;
  padding-right: 1rem;
  border: none;
  background-color: transparent;
  outline: none;
  cursor: pointer;
  @apply --bbva-aggregation-contact-list-help-icon;
}
:host .list-items .item-contact .help-icon .action-icon {
  color: #1973b8;
  @apply --bbva-aggregation-contact-list-action-icon;
}

.main-title-margin {
  margin-bottom: 1.25rem;
  @apply --bbva-aggregation-contact-list-main-title-margin;
}

.set-divider {
  border-bottom: 0.0625rem solid var(--bbva-300, #d3d3d3);
  @apply --bbva-aggregation-contact-set-divider;
}
.set-divider .item-contact:last-of-type {
  padding-bottom: 0.625rem;
  @apply --bbva-aggregation-contact-item-contact;
}

.contact-bottom-padded {
  padding-bottom: 1.4375rem;
}

.contact-spans-full-width bbva-list-contact {
  width: 100%;
}

.contact-phone-number-regular bbva-list-contact span {
  font-style: var(--fontFaceSecondaryRegularFontStyle, normal);
}

:host(.accounts) {
  display: block;
  box-sizing: border-box;
  margin: 0;
}

:host(.accounts) .list-items .item-account {
  margin-bottom: 1rem;
}

.action-buttons-account {
  display: flex;
  justify-content: center;
}

[data-tag-name=bbva-button-default] {
  padding: 0 1em 1em;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}
`;class O extends(b(S(T(_)))){static get scopedElements(){const t=[I,D,B,j,L,P,z,A];return O.scopedElementsFromClasses(t)}static get is(){return"bbva-aggregation-contact-list"}static get properties(){return{items:{type:Array},helpIcon:{type:String},clipBoxImage:{type:String},buttonEvent:{type:String},modalConfigs:{type:Array},flagAccounts:{type:Boolean},currencyCode:{type:String},localCurrency:{type:String},noLink:{type:Boolean}}}constructor(){super(),this.clipBoxImage="./images/phone-circle.png",this.buttonEvent="glomo-contact-item-button-event",this.items=[],this.modalConfigs=[],this.flagAccounts=!1,this.currencyCode="",this.localCurrency="",this.noLink=!0}static get styles(){return[q,u("bbva-aggregation-contact-list-shared-styles")]}get _renderItems(){const t=this.items.map((({phoneNumber:t,...i})=>({...i,phoneNumber:t?[t]:void 0})));return y`
      ${t.map((t=>y` <li
          divider="full"
          class="item-contact ${t.class?t.class:""}"
        >
          <bbva-list-contact
            action-icon-primary=""
            action-icon-secondary=""
            hide-padding-top=""
            image="${this.clipBoxImage}"
            @click=${()=>this.initCall(t)}
            content-title="${this.t(t.title)}"
            no-action-icons
            .descriptions="${this.t(t.phoneNumber)}"
          >
          </bbva-list-contact>
          ${t.hasHelpIcon?this.helpIcon(t.iconEvent):""}
        </li>`))}
    `}get _renderAccounts(){return y`
      ${this.items.map((t=>y`
          <li class="item-account">
            <bbva-list-contact
              class="accounts-list"
              disabled-tabindex
              action-icon-primary="${t.actionIcon}"
              action-icon-secondary="${t.actionIcon}"
              image="${this.clipBoxImage}"
              content-title="${this.t(t.title)}"
              .descriptions="${this.t(t.descriptions)}"
              ?no-link="${this.noLink}"
              amount="${t.amount}"
              local-currency="${this.localCurrency}"
              currency-code="${this.currencyCode}"
              hide-padding-bottom=""
              hide-padding-top=""
            >
            </bbva-list-contact>
            <div class="action-buttons-account">
              <bbva-button-default
                @click=${()=>this._methodLeftButton(t)}
                class="label-account"
                variant="link"
                ?disabled="${O._disableLeftButton(t)}"
                text="${this.t(`${this.constructor.is}-left-button`)}"
              >
              </bbva-button-default>
              <bbva-button-default
                @click=${()=>this._methodRightButton(t)}
                class="label-account"
                variant="link"
                ?disabled="${O._disableRightButton(t)}"
                text="${this.t(`${this.constructor.is}-right-button`)}"
              >
              </bbva-button-default>
            </div>
            ${O._showNotificationHelp(t)}
            ${this._renderDivider(t)}
          </li>`))}

    `}helpIcon(t){return y` <button
      class="help-icon"
      @click=${()=>{this._openHelpModal(t)}}
    >
      <bbva-core-icon class="action-icon" .icon="${C()}" size="24">
      </bbva-core-icon>
    </button>`}initCall(t){const i=t.phoneNumberUnmasked||t.phoneNumber.toString().replace(/\D/g,"");this._firedEvent(this.buttonEvent,i)}_firedEvent(t,i){this.dispatchEvent(new CustomEvent(t,{composed:!0,bubbles:!0,detail:i}))}reset(){this.clipBoxIcon="",this.buttonEvent="",this.items=[],this.modalConfigs=[]}_openHelpModal(t){const i=this.modalConfigs.find((i=>i.eventName===t));i&&this._firedEvent("open-help-modal-phone",i)}_renderDivider(t){return this.items.indexOf(t)===this.items.length-1?y``:y`<bbva-divider size="fit"></bbva-divider>`}static _showNotificationHelp(t){return t.notification?t.notification.message&&"Warning"===t.notification.iconType?y`
          <bbva-notification-help
            accessibility-label-icon="Alert"
            icon=${w()}
            class="alert"
            text="${t.notification.message}"
          ></bbva-notification-help>
        `:t.notification.message&&"Info"===t.notification.iconType?y`
          <bbva-notification-help
            accessibility-label-icon="Info"
            icon=${E()}
            text="${t.notification.message}"
          ></bbva-notification-help>`:y``:y``}_methodRightButton(t){this._firedEvent("right-button-event",t)}_methodLeftButton(t){this._firedEvent("left-button-event",t)}static _disableLeftButton(t){return t.disableLeftButton}static _disableRightButton(t){return t.disableRightButton}render(){return y` <ul class="list-items">
      ${this.flagAccounts?this._renderAccounts:this._renderItems}
    </ul>`}}customElements.define(O.is,O);
