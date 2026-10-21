import{z as t,ap as i,L as e,cl as o,ax as r,ak as a,h as n,i as s,a8 as b,ac as d,ab as c,ar as l,a9 as h,aa as g,a as v,av as f,g as m,ad as p,af as u,cF as y,bx as k}from"./952f98a9.js";var x=t`
:host {
  display: inline-flex;
  box-sizing: border-box;
  align-items: center;
  justify-content: center;
  font: inherit;
  text-align: center;
  user-select: none;
  cursor: pointer;
  outline: none;
}

:host([href]) {
  color: #0000ee;
  text-decoration: underline;
}

:host(:not([href])) {
  padding: 0.25em .5em;
  border-width: 1px;
  border-style: solid;
  border-color: #d8d8d8;
  border-radius: 4px;
  color: rgba(0, 0, 0, 0.847);
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

:host([aria-disabled=true]) {
  cursor: default;
  pointer-events: none;
  color: rgba(0, 0, 0, 0.247);
}

:host([href][aria-disabled=true]) {
  text-decoration: none;
  color: currentColor;
}

:host([focus-visible]:not([aria-disabled=true])) {
  box-shadow: 0 0 1px 1px #5e9ed6;
}

:host([href][active]) {
  color: red;
}

:host(:not([href])[active]:not([aria-disabled=true])) {
  background-color: rgba(0, 0, 0, 0.1);
}

/* Safari won't add text-decoration from host to slotted text unless
explicitly telling the slot to inherit it */
slot {
  text-decoration: inherit;
}
`;class $ extends(i(e)){static get properties(){return{href:{type:String,reflect:!0},type:{type:String},disabled:{type:Boolean},value:{type:String},name:{type:String},form:{type:String},formaction:{type:String},formenctype:{type:String},formmethod:{type:String},formnovalidate:{type:Boolean},formtarget:{type:String},download:{type:String},hreflang:{type:String},rel:{type:String},target:{type:String},_formElementId:{type:String,attribute:!1}}}constructor(){super(),this.type="submit",this._active=!1,this._formElementId=o(),this._onClick=this.onClick.bind(this),this._onKeyUp=this.onKeyUp.bind(this),this._onKeyDown=this.onKeyDown.bind(this),this.addEventListener("click",this._onClick),this.addEventListener("keyup",this._onKeyUp),this.addEventListener("keydown",this._onKeyDown),r(this,"down",(()=>{this.disabled||window.requestAnimationFrame((()=>{this._formElement&&this.focus(),this.active=!0}))})),r(this,"up",(()=>{this.active=!1})),this.addEventListener("blur",(()=>{this.active=!1}))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.active=!1}firstUpdated(t){this._formElementContainer=this.shadowRoot.getElementById(this._formElementId),this._reattachFormElement(),this._setInitialAttribute("role",this.href?"link":"button"),this.disabled||(this._setInitialAttribute("tabindex","0"),this.setAttribute("aria-disabled","false")),this.hasAttribute("autofocus")&&!this.href&&this.focus(),super.firstUpdated(t)}updated(t){super.updated(t),t.has("href")&&(this.setAttribute("role",this.href?"link":"button"),this._reattachFormElement()),t.has("disabled")&&(this.disabled?this._disableAction():this._enableAction())}_reattachFormElement(){if(this._formElementContainer){(this.href?this.shadowRoot:this).appendChild(this._formElementContainer),this._updateFormElement()}}get active(){return this._active}set active(t){t!==this._active&&(this._active=t,t?this.setAttribute("active",""):this.removeAttribute("active"),this._dispatchActive())}static get styles(){return[x,a("bbva-core-action-shared-styles")]}static getStyles(){return[t`
        :host {
          position: relative;
        }
      `,super.getStyles()]}render(){return n`
      <slot></slot>
      ${this._action}
    `}get _action(){return n`
      <span class="action-slot">
        <slot name="_action"></slot>
      </span>
      <span id="${this._formElementId}" slot="_action">
        ${this.href?this._link:this._button}
      </span>
    `}get _link(){return n`
      <a
        style="opacity: 0; position: absolute; top: 0; left: 0; right: 0; bottom: 0;"
        aria-hidden="true"
        tabindex="-1"
        ?hidden="${this.disabled}"
        href="${s(this.disabled?void 0:this.href)}"
        hreflang="${s(this.hreflang)}"
        target="${s(this.target)}"
        download="${s(this.download)}"
        rel="${s(this.rel)}"
        @click="${this._onNativeLinkClick}"
      >
      </a>
    `}get _button(){return n`
      <button
        style="display: none;"
        aria-hidden="true"
        tabindex="-1"
        type="${this.type}"
        ?disabled="${this.disabled}"
        name="${s(this.name)}"
        value="${s(this.value)}"
        form="${s(this.form)}"
        formaction="${s(this.formaction)}"
        formenctype="${s(this.formenctype)}"
        formmethod="${s(this.formmethod)}"
        ?formNoValidate="${this.formnovalidate}"
        formtarget="${s(this.formtarget)}"
      ></button>
    `}_updateFormElement(){this._formElement=this._formElementContainer.querySelector("a, button")}_setInitialAttribute(t,i){this.hasAttribute(t)||this.setAttribute(t,i)}_disableAction(){this.setAttribute("aria-disabled","true"),this.removeAttribute("tabindex")}_enableAction(){this.setAttribute("aria-disabled","false"),this.setAttribute("tabindex","0")}_onNativeLinkClick(){this.focus()}_isValidKey(t){return this.href?"Enter"===t:"Enter"===t||" "===t}onClick(t){if(this.disabled)return t.preventDefault(),t.stopPropagation(),void t.stopImmediatePropagation();const i=t.composedPath();setTimeout((()=>{!t.defaultPrevented&&this._formElement&&i[0]!==this._formElement&&this._formElement.dispatchEvent(new MouseEvent("click",{relatedTarget:this,composed:!0}))}),0)}onKeyUp(t){if(this._isValidKey(t.key)&&this.active){this.active=!1;(this.href&&this._formElement?this._formElement:this).dispatchEvent(new MouseEvent("click",{bubbles:!0,composed:!0,cancelable:!0})),t.preventDefault()}}onKeyDown(t){this._isValidKey(t.key)&&(this.active=!0,t.preventDefault())}_dispatchActive(){this.dispatchEvent(new CustomEvent("active-change",{bubbles:!0,detail:{value:this.active}}))}}const w=new l;var _=t`:host {
  display: inline-block;
  box-sizing: border-box;
  font-size: var(--bbva-badge-notification-font-size, var(--typographyType3XSmall, ${b(d.type3XSmall)}));
  font-weight: var(--bbva-badge-notification-font-weight, var(--fontFacePrimaryMediumFontWeight, ${b(c.medium.fontWeight)}));
  --_default-bg-color: var(--bbva-badge-notification-dark-mode-bg-color, var(--bbva-badge-notification-bg-color,var(--colorsPrimaryCoreLight, ${b(h.primaryCoreLight)})));
  --_default-color: var(--bbva-badge-notification-dark-mode-color, var(--bbva-badge-notification-color, var(--colorsPrimaryCoreLightened, ${b(h.primaryCoreLightened)})));
  --_bg-color-alert: var(--bbva-badge-notification-dark-mode-alert-bg-color, var(--bbva-badge-notification-alert-bg-color,var(--colorsTertiaryType1Dark, ${b(h.tertiaryType1Dark)})));
  --_color-alert: var(--bbva-badge-notification-dark-mode-alert-color, var(--bbva-badge-notification-alert-color,var(--colorsPrimaryCoreLightened, ${b(h.primaryCoreLightened)})));
}

:host([border-1]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: var(--bbva-dark-mode-border-badge-notification-color-1, var(--bbva-border-badge-notification-color-1, none));
}

:host([border-2]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: var(--bbva-dark-mode-border-badge-notification-color-2, var(--bbva-border-badge-notification-color-2, none));
}

:host([border-3]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: var(--bbva-dark-mode-border-badge-notification-color-3, var(--bbva-border-badge-notification-color-3, none));
}

:host([border-4]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: var(--bbva-dark-mode-border-badge-notification-color-4, var(--bbva-border-badge-notification-color-4, none));
}

:host([border-5]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: var(--bbva-dark-mode-border-badge-notification-color-5, var(--bbva-border-badge-notification-color-5, none));
}

:host([border-6]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: var(--bbva-dark-mode-border-badge-notification-color-6, var(--bbva-border-badge-notification-color-6, none));
}

:host([border-7]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: var(--bbva-dark-mode-border-badge-notification-color-7, var(--bbva-border-badge-notification-color-7, none));
}

:host([border-8]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: var(--bbva-dark-mode-border-badge-notification-color-8, var(--bbva-border-badge-notification-color-8, none));
}

:host([border-9]) .badge-notification {
  border-width: var(--bbva-badge-notification-border-width, 0);
  border-style: var(--bbva-badge-notification-border-style, none);
  border-radius: var(--bbva-badge-notification-border-radius, 50%);
  border-color: none;
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

.badge-notification {
  display: inline-flex;
  justify-content: center;
  align-items: center;
  min-width: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
  max-width: calc(((4.875 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
  height: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
  padding: 0 calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
  border-radius: 0.75rem;
  background-color: var(--_default-bg-color);
  color: var(--_default-color);
  z-index: 1;
}

:host([position=right]) {
  position: relative;
}
:host([position=right]) .badge-notification {
  position: absolute;
  right: -0.8125rem;
  top: -0.625rem;
}
:host([position=right]) .badge-notification.maximum {
  right: -1.75rem;
  width: calc(((4.875 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
}
:host([position=right]) ::slotted(*) {
  -webkit-mask: url('data:image/svg+xml;utf8,<svg xmlns="http://www.w3.org/2000/svg" viewBox="-100 -13 100 100" >  <circle cx="0" cy="0" r="50"  fill="black" /></svg>') no-repeat 0 0%, linear-gradient(#fff, #fff);
  -webkit-mask-composite: xor;
  mask: url('data:image/svg+xml;utf8,<svg xmlns="http://www.w3.org/2000/svg" viewBox="-100 -13 100 100" >  <circle cx="0" cy="0" r="50"  fill="black" /></svg>') no-repeat 0 0%, linear-gradient(#fff, #fff);
  mask-composite: exclude;
}

:host([position=left]) {
  position: relative;
  margin-left: var(--_margin-left, calc(((1.625 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem));
}
:host([position=left]) .badge-notification {
  position: absolute;
  left: -0.8125rem;
  top: -0.625rem;
}
:host([position=left]) .badge-notification.maximum {
  left: -1.75rem;
  width: calc(((4.875 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
  --_margin-left: 28px;
}
:host :host([position=left]) .badge-notification.maximum {
  margin-right: gridSpacer8(13px);
}
:host([position=left]) ::slotted(*) {
  -webkit-mask: url('data:image/svg+xml;utf8,<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 -13 100 100" >  <circle cx="0" cy="0" r="50"  fill="black" /></svg>') no-repeat 0 0%, linear-gradient(#fff, #fff);
  -webkit-mask-composite: xor;
  mask: url('data:image/svg+xml;utf8,<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 -13 100 100" >  <circle cx="0" cy="0" r="50"  fill="black" /></svg>') no-repeat 0 0%, linear-gradient(#fff, #fff);
  mask-composite: exclude;
}

:host([variant=alert]) .badge-notification {
  background-color: var(--_bg-color-alert);
  color: var(--_color-alert);
}
${w.mediaRules()}`;const S=new l;var C=t`[ambient^=light] {
  --bbva-badge-notification-dark-bg-color: initial;
  --bbva-badge-notification-dark-color: initial;
  --bbva-badge-notification-alert-bg-color: initial;
  --bbva-badge-notification-alert-color: initial;
  --bbva-badge-notification-border-width: 1px;
  --bbva-badge-notification-border-style: solid;
  --bbva-badge-notification-border-radius: 24px;
  --bbva-border-light-badge-notification-color-1: var(--colorsPrimaryCoreLightened, ${b(h.primaryCoreLightened)});
  --bbva-border-light-badge-notification-color-2: var(--colorsSecondary100, ${b(h.secondary100)});
}
${S.mediaRules()}`;const E=new l;var L=t`[ambient^=dark] {
  --bbva-badge-notification-dark-bg-color: var(--colorsPrimarySubduedLight, ${b(h.primarySubduedLight)});
  --bbva-badge-notification-dark-color: var(--colorsSecondary600, ${b(h.secondary600)});
  --bbva-badge-notification-alert-bg-color: var(--colorsPrimarySubduedLight, ${b(h.primarySubduedLight)});
  --bbva-badge-notification-alert-color: var(--colorsSecondary600, ${b(h.secondary600)});
  --bbva-badge-notification-border-width: 1px;
  --bbva-badge-notification-border-style: solid;
  --bbva-badge-notification-border-radius: 24px;
  --bbva-border-badge-notification-color-1: var(--colorsPrimaryCore, ${b(h.primaryCore)});
  --bbva-border-badge-notification-color-2: var(--colorsPrimaryCoreDark, ${b(h.primaryCoreDark)});
  --bbva-border-badge-notification-color-3: var(--colorsPrimaryCoreLight, ${b(h.primaryCoreLight)});
  --bbva-border-badge-notification-color-4: var(--colorsPrimaryMedium, ${b(h.primaryMedium)});
  --bbva-border-badge-notification-color-5: var(--colorsPrimaryCoreDarkened, ${b(h.primaryCoreDarkened)});
  --bbva-border-badge-notification-color-6: var(--colorsTertiaryType4Dark, ${b(h.tertiaryType4Dark)});
  --bbva-border-badge-notification-color-7: var(--colorsTertiaryType6Dark, ${b(h.tertiaryType6Dark)});
}
${E.mediaRules()}`;const A={dark:t`
    ${L}
  `,light:t`
    ${C}
  `};class P extends(v(e)){static get is(){return"bbva-badge-notification"}static get properties(){return{accessibilityText:{type:String,attribute:"accessibility-text"},text:{type:Number},variant:{type:String,reflect:!0},position:{type:String,reflect:!0}}}static get styles(){return[_,A.light,A.dark,a("bbva-badge-notification-shared-styles")]}get truncate(){return this.text>999?"+99":this.text}render(){return n`
      <span
        class="badge-notification ${f({maximum:this.text>99})}"
        aria-label=${s(this.accessibilityText)}
        >${this.truncate}</span
      >
      <slot></slot>
    `}}m("colors.primarySubduedLight"),m("colors.cool100"),m("colors.tertiaryType1Light"),m("colors.cool100"),m("colors.cool100"),m("colors.cool90"),m("colors.cool80"),m("colors.cool70"),m("colors.cool60"),m("colors.cool50"),m("colors.tertiaryType6Darkened"),m("colors.tertiaryType4Darkened");const T=new l;var D=t`:host {
  cursor: pointer;
  display: flex;
  box-sizing: border-box;
  flex-direction: column;
  align-items: center;
  text-align: center;
  max-width: var(--bbva-button-action-max-width, 4.125rem);
  font-size: var(--typographyType3XSmall, ${b(d.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${b(p.type3XSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${b(c.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${b(c.medium.fontStyle)});
  --_button-action-color: var(--bbva-button-axtion-dark-mode-color, var(--bbva-button-action-color, var(--colorsPrimaryMedium, ${b(h.primaryMedium)})));
  --_button-action-active-color: var(--bbva-button-action-active-dark-mode-color, var(--bbva-button-action-active-color, var(--colorsPrimaryCoreDark, ${b(h.primaryCoreDark)})));
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

:host(:not([href])[active]:not([aria-disabled=true])) {
  background-color: transparent;
  color: var(--_button-action-active-color);
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

label {
  cursor: pointer;
}

[data-tag-name=bbva-core-icon],
[data-tag-name=bbva-core-image] {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-badge-notification] {
  --_margin-left: 0;
}

@supports (-webkit-line-clamp: 3) {
  label {
    overflow: hidden;
    text-overflow: ellipsis;
    display: -webkit-box;
    -webkit-line-clamp: 3;
    -webkit-box-orient: vertical;
  }
}
${T.mediaRules()}`;const z=new l;var V=t`[ambient^=light] {
  --bbva-button-action-color: initial;
  --bbva-button-action-active-color: initial;
}
${z.mediaRules()}`;const F=new l;var I=t`[ambient^=dark] {
  --bbva-button-action-color: var(--colorsPrimaryCoreLightened, ${b(h.primaryCoreLightened)});
  --bbva-button-action-active-color: var(--colorsPrimarySubduedLight, ${b(h.primarySubduedLight)});
}
${F.mediaRules()}`;const K={dark:t`
    ${I}
    ${A.dark}
  `,light:t`
    ${V}
    ${A.light}
  `};class M extends(v($)){static get is(){return"bbva-button-action"}static get scopedElements(){return{"bbva-core-icon":u,"bbva-core-image":y,"bbva-badge-notification":P}}static get properties(){return{icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},imageAltText:{type:String,attribute:"image-alt-text"},label:{type:String},notifications:{type:Number},notificationsVariant:{type:String,attribute:"notifications-variant"},notificationsPosition:{type:String,attribute:"notifications-position"},notificationsAccesibilityText:{type:String}}}constructor(){super(),this.iconSize=24,this.icon="",this.image="",this.imageAltText="",this.notificationsPosition="right"}static get styles(){return[super.styles,D,a("bbva-button-action-shared-styles"),k(),K.light,K.dark]}get _imageWidth(){return 2*this.iconSize}get getIcon(){return n`
      ${this.icon?n` <bbva-core-icon .icon="${this.icon}" .size="${this.iconSize}"> </bbva-core-icon> `:n`
            <bbva-core-image
              .src="${this.image}"
              .alt="${this.imageAltText}"
              sizing="contain"
              .width="${this._imageWidth}"
              .height="${this.iconSize}"
              position="center"
            ></bbva-core-image>
          `}
    `}render(){return n`
      ${this.notifications?n`
            <bbva-badge-notification
              ambient="light"
              .accessibilityText="${this.notificationsAccesibilityText}"
              .text="${this.notifications}"
              .position="${this.notificationsPosition}"
              .variant="${this.notificationsVariant}"
              >${this.getIcon}
            </bbva-badge-notification>
          `:n` ${this.getIcon} `}
      <label> ${this.label} </label>
      <slot></slot>
      ${this._action}
    `}}customElements.define(M.is,M);
