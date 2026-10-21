import"./aef26f22.js";import{z as e,a8 as t,ac as a,ad as i,ab as r,ar as n,aa as s,be as o,a9 as c,a as l,aS as d,aw as h,bx as p,ak as m,h as u,L as b,i as g,g as v,ap as y,an as f,ag as $,F as x,b$ as k,b1 as S,c0 as _,f as A,aD as C,cH as w,dA as T,cD as M,bU as I,bI as E,dB as P,b5 as B,au as R,aN as j,bF as L}from"./952f98a9.js";import{B as z,b as D}from"./cc301dbe.js";import{B as O}from"./d98ebd88.js";import{ao as N,aL as F,bE as V,br as H}from"./7f3d7ca9.js";import"./111ad2c6.js";import"./216055dc.js";import"./17741512.js";import"./5aa1c2be.js";import"./e4099866.js";import"./32b24593.js";import"./ca1bc295.js";import"./c0a2f832.js";import"./cae0f1de.js";const q=new n;var X=e`:host {
  display: flex;
  align-items: center;
  justify-content: center;
  height: 3.5rem;
  width: calc(50% - calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 16) * 1rem));
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 15) * 1em);
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 16) * 1rem);
  border: none;
  border-radius: var(--borderRadiusSmall, ${t(o.small)});
  text-overflow: ellipsis;
  overflow: hidden;
  white-space: nowrap;
  cursor: pointer;
  user-select: none;
  box-sizing: border-box;
  font-size: var(--typographyTypeSmall, ${t(a.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${t(i.typeSmall)});
  background-color: var(--bbva-form-preset-amount-item-bg-color, var(--colorsSecondary100, ${t(c.secondary100)}));
  --bbva-amount-color: var(--bbva-form-preset-amount-item-color, var(--colorsPrimaryMedium, ${t(c.primaryMedium)}));
  --_preset-amount-item-color-checked: var(--bbva-form-preset-amount-item-color-checked, var(--colorsPrimaryCoreLightened, ${t(c.primaryCoreLightened)}));
  --_preset-amount-item-bg-color-checked: var(--bbva-form-preset-amount-item-bg-color-checked, var(--colorsPrimaryCore, ${t(c.primaryCore)}));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*::before,
*::after {
  box-sizing: inherit;
}

:host([aria-checked=true]) {
  background-color: var(--_preset-amount-item-bg-color-checked);
}
:host([aria-checked=true]) [data-tag-name=bbva-amount] {
  color: var(--_preset-amount-item-color-checked);
}

:host([disabled]) {
  opacity: 0.4;
  cursor: default;
  pointer-events: none;
}

.amount {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${t(r.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${t(r.medium.fontStyle)});
}
${q.mediaRules()}`;var U=e`[ambient^=light] {
  --bbva-form-preset-amount-item-bg-color: initial;
  --bbva-form-preset-amount-item-color: initial;
  --bbva-form-preset-amount-item-color-checked: initial;
  --bbva-form-preset-amount-item-bg-color-checked: initial;
}
${(new n).mediaRules()}`;const K=new n;const W={dark:e`
    ${e`[ambient^=dark] {
  --bbva-form-preset-amount-item-bg-color: var(--colorsPrimaryCoreDark, ${t(c.primaryCoreDark)});
  --bbva-form-preset-amount-item-color: var(--colorsPrimarySubdued, ${t(c.primarySubdued)});
  --bbva-form-preset-amount-item-color-checked: var(--colorsPrimaryCore, ${t(c.primaryCore)});
  --bbva-form-preset-amount-item-bg-color-checked: var(--colorsPrimaryCoreLightened, ${t(c.primaryCoreLightened)});
}
${K.mediaRules()}`}
  `,light:e`
    ${U}
  `};class Y extends(l(d(O))){static get is(){return"bbva-form-preset-amount-item"}static get scopedElements(){return{"bbva-amount":h}}static get styles(){return[super.styles,X,W.dark,W.light,p(),m("bbva-form-preset-amount-item-shared-styles")]}get _buttonContent(){return u`
      <bbva-amount
        decimals-hidden
        class="amount"
        .localCurrency="${this.localCurrency}"
        amount="${this.amount}"
        .currencyCode="${this.currencyCode}"
        .language="${this.language}"
        variant="m"
      >
      </bbva-amount>
    `}render(){return u` ${this._radio} ${this._buttonContent} `}}const Z=new n;var G=e`:host {
  display: flex;
  justify-content: space-between;
  flex-wrap: wrap;
  box-sizing: border-box;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 16) * 1rem);
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
${Z.mediaRules()}`;const J={dark:e`
    ${W.dark}
  `,light:e`
    ${W.light}
  `};class Q extends(l(d(b))){static get is(){return"bbva-form-preset-amount"}static get scopedElements(){return{"bbva-form-preset-amount-item":Y}}static get properties(){return{name:{type:String,reflect:!0},items:{type:Array},selected:{type:Number,reflect:!0}}}constructor(){super(),this.items=[],this._items=[],this.name=`form-preset-amount-${((e=10)=>`${Math.random().toString(36).substr(2,e)}`)()}`}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","radiogroup")}_selected(e){const t=this._items.indexOf(e.target);this.selected=t,this.dispatchEvent(new CustomEvent("form-preset-amount-item-change",{detail:(e.target||{}).amount,bubbles:!0,composed:!0}))}updated(e){if(super.updated&&super.updated(e),e.has("items")){const e=this.getScopedTagName("bbva-form-preset-amount-item");this._items=[...this.shadowRoot.querySelectorAll(e)]}(e.has("selected")||e.has("items"))&&Number.isFinite(this.selected)&&this.selected>-1&&this.items.length&&(this._items[this.selected].checked=!0)}static get styles(){return[G,J.dark,J.light,m("bbva-form-preset-amount-shared-styles")]}render(){return u`
      ${this.items.map((e=>u`
          <bbva-form-preset-amount-item
            .amount="${e.amount}"
            .name="${this.name}"
            .localCurrency="${this.localCurrency}"
            .currencyCode="${this.currencyCode}"
            .language="${this.language}"
            .value="${g(e.value)}"
            ?disabled="${e.disabled}"
            ?checked="${e.checked}"
            @change="${e=>this._selected(e)}"
          ></bbva-form-preset-amount-item>
        `))}
    `}}const ee=new n;var te=e`[divider] {
  box-sizing: border-box;
}
[divider]::after {
  content: "";
  position: absolute;
  left: 0;
  right: 0;
  top: 100%;
}

hr[divider],
[divider]::after {
  margin: 0;
  border: none;
  display: block;
  height: 1px;
  background-color: var(--bbva-divider-dark-mode-color, var(--bbva-divider-color, var(--colorsSecondary300, ${t(c.secondary300)})));
  opacity: var(--bbva-divider-opacity, 1);
}

hr[divider]::after {
  display: none;
}

hr[divider=fit],
[divider=fit]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 16) * 1rem);
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 16) * 1rem);
}

hr[divider=indented],
[divider=indented]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 16) * 1rem);
}

hr[divider=small],
[divider=small]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 16) * 1rem);
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 16) * 1rem);
}

hr[divider~=center][divider~=small],
[divider~=center][divider~=small]::after {
  margin-right: auto;
  margin-left: auto;
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 16) * 1rem);
}

hr[divider=bold] {
  margin-bottom: 0;
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 16) * 1rem);
}

[divider=bold] {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 16) * 1rem);
}
[divider=bold]::after {
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 16) * 1rem);
}
${ee.mediaRules()}`;const ae=new n;var ie=e`[ambient^=light] {
  --bbva-divider-color: var(--colorsSecondary300, ${t(c.secondary300)});
}
${ae.mediaRules()}`;const re=new n;const ne={dark:e`
    ${e`[ambient^=dark] {
  --bbva-divider-color: var(--colorsSecondary300, ${t(c.secondary300)});
}
${re.mediaRules()}`}
  `,light:e`
    ${ie}
  `};class se extends(l(b)){static get is(){return"bbva-divider"}static get properties(){return{size:{type:String}}}constructor(){super(),this.size="full"}firstUpdated(){this.setAttribute("aria-hidden",!0)}static get styles(){return[te,ne.light,ne.dark,m("bbva-divider-shared-styles")]}render(){return u` <hr divider="${this.size}" /> `}}v("colors.cool40");var oe=e`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${t(c.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${t(c.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${t(c.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${t(c.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${t(c.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${t(c.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${t(c.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${t(c.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${t(c.primarySubduedLight)}));
}
@supports (padding-top: env(safe-area-inset-top)) {
  :host {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
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

:host([position=fixed]) {
  --bbva-header-main-position: fixed;
  width: 100%;
  left: 0;
  right: 0;
}

.header-main {
  display: flex;
  justify-content: space-between;
  align-items: center;
  position: relative;
  padding-top: var(--bbva-header-main-padding-top, 0);
  margin: 0 auto;
  min-height: var(--bbva-header-main-min-height, 3rem);
  max-width: var(--bbva-header-main-max-width, 100%);
}
.header-main .icon {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  border: none;
  background: none;
  width: var(--bbva-header-main-width, 3rem);
  min-height: var(--bbva-header-main-min-height, 3rem);
  padding: 0;
  color: inherit;
  margin: 0;
  cursor: pointer;
}
.header-main .header-icons {
  display: flex;
  flex: none;
}
.header-main .header-icons.half-space {
  min-width: 2.875rem;
}
.header-main .header-icons.full-space {
  min-width: 5.75rem;
}
.header-main .header-icons.right-group .icon.primary, .header-main .header-icons.right-group .icon.secondary {
  margin-left: auto;
}
.header-main .header-icons.right-group .icon.primary:active [data-tag-name=bbva-icon], .header-main .header-icons.right-group .icon.secondary:active [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_header-main-active-icon-color);
}
.header-main .header-icons.left-group .icon.primary:active [data-tag-name=bbva-icon], .header-main .header-icons.left-group .icon.secondary:active [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_header-main-active-icon-color);
}
.header-main .header-icons .text-icon {
  width: 100%;
  padding-top: 0.125rem;
}
.header-main .heading-wrapper {
  display: flex;
  justify-content: center;
  align-items: center;
  top: var(--bbva-header-main-text-top, var(--bbva-header-main-padding-top, 0));
  left: 0;
  width: 100%;
  height: var(--bbva-header-main-min-height, 3rem);
  margin: 0;
  overflow: hidden;
  text-align: center;
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${t(a.typeMedium)}));
  line-height: var(--bbva-header-main-text-line-height, 3rem);
  font-weight: 400;
  min-width: 0;
}
.header-main .heading-wrapper.image {
  display: flex;
  justify-content: center;
  align-items: center;
}
.header-main .heading-wrapper.image #image {
  max-height: -webkit-fill-available;
}
.header-main .heading-wrapper .microillustration {
  width: 3rem;
  height: 3rem;
}
.header-main .heading-wrapper .text-wrapper {
  padding: 0 0.3125rem;
  min-width: 0;
}
.header-main .heading-wrapper svg {
  max-height: 100%;
  padding: 0.3125rem;
}

:host([variant*=modal]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-modal, var(--_bg-color-modal));
}

:host([variant*=modal-three-level]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-modal-three-level, var(--_bg-color-modal-three-level));
  color: var(--_color-modal-three-level);
}
:host([variant*=modal-three-level]) .header-main .heading-wrapper .text-wrapper {
  color: var(--_color-modal-three-level);
}
:host([variant*=modal-three-level]) .header-main .header-icons .text-icon {
  color: var(--_color-modal-three-level);
}

:host([variant*=process]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-process, var(--_bg-color-process));
}

:host([variant*=sign]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-sign, var(--_bg-color-sign));
}

:host([variant*=transparent]) {
  background-color: var(--_bg-color-transparent);
}

:host([show-text-icon]) .header-main {
  min-height: var(--bbva-header-main-min-height, 3.5rem);
}
:host([show-text-icon]) .header-main .icon {
  min-height: var(--bbva-header-main-min-height, 3.5rem);
}
:host([show-text-icon]) .header-main .heading-wrapper {
  height: var(--bbva-header-main-min-height, 3.5rem);
}

@supports (padding-top: env(safe-area-inset-top)) {
  :host([variant*=notch-top]) {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}
`;class ce extends(l(y(f(b)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":$,"bbva-icon":x,"bbva-badge-notification":k}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const e={1:"half-space",2:"full-space"},t=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,a=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,i=Math.max(t,a);return i in e?e[i]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[oe,m("bbva-header-main-shared-styles"),p("button:focus"),S.dark]}static toCamelCase(e){return(e.charAt(0).toUpperCase()+e.slice(1)).replace(/([-_][a-z])/gi,(e=>e.toUpperCase().replace("-","").replace("_","")))}_icon(e){return u`<bbva-icon icon="${g(this[e])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(e){return u`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(e)}
    </bbva-badge-notification>`}_tplButton(e,t,a,i){const r=ce.toCamelCase(e),n=`icon${r}`,s=`accessibilityTextIcon${r}`;return u`<button
      class="${t}"
      id="btn-${e}"
      aria-label="${g(this.t(this[s]))}"
      aria-expanded=${g(i)}
      ?hidden="${!this[n]}"
      @click="${()=>this._headerIconClick(e)}"
    >
      ${"left-primary"===e&&this.notificationText?this._badgeNotification(n):this._icon(n)}
      ${this.showTextIcon?this._textIcon(a):""}
    </button>`}_textIcon(e){return u` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${g(this.t(e))}"
    >
    </bbva-text>`}_tplHeading(e){return u`
      <bbva-text
        unset
        ambient="dark"
        ellipsis
        class="text-wrapper"
        id="text"
        tag="span"
        alignment="center"
        .text="${this.t(e)}"
      >
      </bbva-text>
    `}render(){const{_availableHeadingSpace:e,_hasImage:t,text:a,image:i,_hasMicroillustration:r}=this;return u`
      <header class="header-main">
        <div class="header-icons ${e} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${t}"
          id="heading"
          aria-label=${(r||i)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(a)}
          tabindex="-1"
        >
          ${a&&" "!==a&&this._tplHeading(a)||""}
          <img src="${g(i)}" alt="" ?hidden="${!i}" id="image" aria-hidden="true" />

          <span
            class="${r}"
            ?hidden="${!r}"
            aria-hidden="true"
          >
            ${this.microillustration}
          </span>
        </h1>

        <div class="header-icons ${e} right-group" data-id="iconsRight">
          ${this._tplButton("right-secondary","icon secondary",this.textIconRightSecondary?this.textIconRightSecondary:this.accessibilityTextIconRightSecondary)}
          ${this._tplButton("right-primary","icon primary",this.textIconRightPrimary?this.textIconRightPrimary:this.accessibilityTextIconRightPrimary,this.iconRightPrimaryExpanded)}
        </div>
      </header>
    `}_headerIconClick(e){this.dispatchEvent(new CustomEvent(`header-main-icon-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}}v("colors.primaryCoreLightened"),v("colors.cool80"),v("colors.cool70"),v("colors.primaryCoreLightened"),v("colors.cool100"),v("colors.tertiaryType6Darkened"),v("colors.tertiaryType4Darkened"),v("colors.secondary300");var le=e`
:host {
  display: block;
  box-sizing: border-box;
  --bbva-help-modal-content-color: var(--colorsSecondary600, ${t(c.secondary600)});
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class de extends(l(f(b))){static get is(){return"bbva-modal-parking-recharge"}static get styles(){return[le,m("bbva-modal-parking-recharge-shared-styles")]}static get scopedElements(){const e=[w,$,N,se];return de.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean},data:{type:Object},currencyCode:{type:String,attribute:"currency-code"},localCurrency:{type:String,attribute:"local-currency"},language:{type:String}}}constructor(){super(),this.visible=!1,this.currencyCode="",this.localCurrency="",this.language="",this.data={headerType:"",showTextIcon:!1,headerText:"",titleText:"",buttonText:""}}_clickCard({target:e}){this.dispatchEvent(new CustomEvent("select-account",{bubbles:!0,composed:!0,detail:e}))}render(){return u`
      <bbva-help-modal
        id=${this.data.id}
        ?visible=${this.visible}
        ?show-text-icon="${this.data.showTextIcon}"
        header-type="${this.data.headerType}"
        title-icon="${this.data.showTextIcon?C():""}"
        header-text="${this.t(this.data.headerText)}"
        title-text="${this.t(this.data.titleText)}"
        button-text="${this.t(this.data.buttonText)}"
        full-height
        fixed-footer
        hide-content-padding-top
      >
      <div slot="slot-content">
        ${this.data.contentText?this.data.contentText.map((e=>u`
            <bbva-text
              text="${this.t(e.text)}"
              size="${e.size}"
              alignment="center"
              ambient-color="secondary500">
            </bbva-text>
          `)):""}
          ${this.data.contentCard?this.data.contentCard.map(((e,t)=>{const a=!(e.amount>=this.data.selectedAmount)||e.noLink;return u`
            <bbva-list-card
              id="${`selectAccountCardModal${t}`}"
              ?no-link=${a}
              currency-code="${this.currencyCode}"
              local-currency="${this.localCurrency}"
              language="${this.language}"
              amount="${e.amount}"
              card-title="${e.cardTitle}"
              content-text="${e.contentText}"
              num-product="${e.numProduct}"
              @list-card-item-click="${this._clickCard}">
            </bbva-list-card>
            ${e.divider?u`
            <bbva-divider size="${e.divider.size}"></bbva-divider>
          `:""}
        `})):""}
      </div>
    </bbva-help-modal>
    `}}var he=e`
:host {
  display: block;
  box-sizing: border-box;
  position: absolute;
  inset: 0;
  --bbva-expandable-step-content-max-height: none;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.parkingAccountStep {
  --bbva-expandable-step-completed-content-max-height: none;
}

.recharge-list-accounts {
  padding-left: 1em;
}

.step-amount-button-container {
  padding-top: 1.5em;
  display: flex;
  justify-content: center;
}

.step-select-account {
  text-align: center;
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 16) * 1rem);
}

.keep-selection-link-button {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) / 16) * 1rem);
}
`;class pe extends(l(f(b))){static get is(){return"bbva-multistep-parking-recharge"}static get scopedElements(){return{"bbva-list-contact":z,"bbva-expandable-multistep":T,"bbva-text":$,"bbva-form-preset-amount":Q,"bbva-notification-message":M,"bbva-button-default":I,"bbva-list-card":N,"bbva-notification-help":E,"bbva-panel-button-fixed":F,"bbva-expandable-step":P,"bbva-aggregation-card-list":V,"bbva-header-category":B,"bbva-divider":se,"bbva-header-main":ce,"bbva-modal-parking-recharge":de,"bbva-amount":h}}static get properties(){return{stepDisabledTarget:{type:String},listAccounts:{type:Array},accountDetail:{type:Object},parkingCommission:{type:Number},maxStep:{type:Number},items:{type:Array},isActiveAmountButton:{type:Boolean},isActiveOneAccountButton:{type:Boolean},maximumAmount:{type:Number},selectedAmount:{type:Number},selectedAccount:{type:Object},currencyCode:{type:String},localCurrency:{type:String},language:{type:String},showModalMoreInformation:{type:Boolean},showModalAllAccounts:{type:Boolean},selected:{type:Number},image:{type:String},defaultButtonClass:{type:String},accountBalance:{type:Number},_hideItems:{type:Boolean}}}constructor(){super(),this._stepSelector='[data-tag-name="bbva-expandable-step"]',this.stepDisabledTarget=".action",this.listAccounts=[],this.accountDetail={},this.parkingCommission=12,this.maxStep=2,this.items=[],this.isActiveAmountButton=!1,this.isActiveOneAccountButton=!1,this.maximumAmount=2e3,this.showAlertMessage=!1,this.selectedAmount=100,this.selectedAccount={},this.currencyCode="MXN",this.localCurrency="MXN",this.language="es-MX",this.showModalMoreInformation=!1,this.showModalAllAccounts=!1,this._hideItems=!1,this.image="",this.defaultButtonClass="action",this.maxAmount=""}static get styles(){return[he,m("bbva-multistep-parking-recharge-shared-styles"),D.dark,S.dark,H.dark,H.dark,R.dark]}updated(e){!0===e.has("_hideItems")&&(this._hideElement("_notificationMessage",!0),this._hideElement("_formPresetAmount",!0))}get _multistep(){return this.shadowRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]')}get _steps(){return Array.from(this._multistep.querySelectorAll('[data-tag-name="bbva-expandable-step"]'))}get _notificationMessage(){return this.shadowRoot.querySelector('[data-tag-name="bbva-notification-message"]')}get _formPresetAmount(){return this.shadowRoot.querySelector('[data-tag-name="bbva-form-preset-amount"]')}get _oneAccountButton(){return this.shadowRoot.querySelector("#selectOneAccountButton")}get parkingAccountStep(){const e=this.summaryParkingAccountStep;return this._renderExpandableStep("parkingAccountStep","parkingAccountStep","bbva-parking-city-multistep-recharge-account-detail","",e,"","",!0)}get summaryParkingAccountStep(){return u`
    <bbva-list-contact
      ambient="dark"
      disabled-tabindex=""
      content-title="${this.accountDetail.title}"
      no-link
      currency-code="${this.currencyCode}"
      local-currency="${this.localCurrency}"
      language="${this.language}"
      amount="${this.accountBalance}"
      .descriptions= ${this.accountDetail.descriptions}
      image="${this.image}"
      action-icon-primary=""
      action-icon-secondary="">
    </bbva-list-contact>
    `}get parkingRechargeStep(){this.items=this.items.map((e=>{const t=this.accountBalance+Number(e.amount),a=e;return this.showAlertMessage=t>this.maximumAmount,a.disabled=t>this.maximumAmount,a}));const e=this.contentParkingRechargeStep,t=this._renderAmount(this.selectedAmount,"4xl","dark");return this._renderExpandableStep("parkingRechargeStep","","bbva-parking-city-multistep-recharge-import-recharge",e,t,"bbva-parking-city-multistep-recharge-change",1)}get contentParkingRechargeStep(){return u`
    ${this._renderText("bbva-parking-city-multistep-recharge-import-recharge-message","XS")}

    <bbva-form-preset-amount
    name="radios1"
    currency-code="${this.currencyCode}"
    local-currency="${this.localCurrency}"
    language="${this.language}"
    .items = "${this.items}"
    selected=${this.selected}
    @form-preset-amount-item-change="${this.itemChange}"
    ></bbva-form-preset-amount>

    ${this._renderNotificationHelp(!this.showAlertMessage,this.t("bbva-parking-city-multistep-recharge-alert-message",{maxAmount:this.maxAmount}))}
    ${this._renderNotificationMessage(!1,this.t("bbva-parking-city-multistep-recharge-commission-message",{parkingCommission:this.parkingCommission}),"default","bbva-parking-city-multistep-recharge-commission","bbva-parking-city-multistep-recharge-more-info")}

    <div class="step-amount-button-container">
    ${this._renderButtonDefault(!this.isActiveAmountButton,"","bbva-parking-city-multistep-recharge-continue","parkingRechargeButton")}
    </div>
    `}get selectAccountStep(){const{amount:e,cardTitle:t,contentText:a,numProduct:i}=this.selectedAccount,r=Object.keys(this.selectedAccount).length>0&&!(this.listAccounts.length<2)?this.contentKeepSelectionStep:this.contentSelectAccountStep,n=this._renderListCard("selectAccountSummary",!0,e,t,a,i,"dark"),s=this.listAccounts.length<2?"":"bbva-parking-city-multistep-recharge-change";return this._renderExpandableStep("selectAccountStep","","bbva-parking-city-multistep-recharge-method-payment",r,n,s,2)}get contentKeepSelectionStep(){return u`
    ${this._renderListCard("keepSelectionCard",!0,this.selectedAccount.amount,this.selectedAccount.cardTitle,this.selectedAccount.contentText,this.selectedAccount.numProduct)}
    <div class="step-select-account">
      <bbva-button-default
      @click="${this._changeSelection}"
      text="${this.t("bbva-parking-city-multistep-recharge-change-selection")}"
      ></bbva-button-default>
      ${this._renderButtonDefault(!1,"keep-selection-link-button","bbva-parking-city-multistep-recharge-keep-selection","keepSelectionLinkButton","link")}
    </div>
    `}get contentSelectAccountStep(){const e=this.listAccounts.length,t=e>3,a=t?this.listAccounts.slice(0,3):this.listAccounts;this.selectedAccount=1===e?this.listAccounts[0]:this.selectedAccount;const i=this.listAccounts.filter((e=>e.amount<this.selectedAmount));return this.isActiveOneAccountButton=0===e||!(a[0].amount>=this.selectedAmount),u`
    <div class="recharge-list-accounts">
    ${this._renderText("bbva-parking-city-multistep-recharge-method-payment-message","XS")}
    </div>

    <bbva-header-category
      variant="default"
      option-link="${t?this.t("bbva-parking-city-multistep-recharge-see-all"):""}"
      text="${this.t("bbva-parking-city-multistep-recharge-method-payment-accounts")}"
      @header-category-link-click="${this._clickSeeMore}"
    ></bbva-header-category>

    ${this._renderNotificationMessage(!(i.length===e),this.t("bbva-parking-city-multistep-recharge-notification-message"),"error")}


    ${a.map(((e,t)=>{var a;const i=!(e.amount>=this.selectedAmount)||e.noLink,r=`selectAccountCard${t}`;return u`
      ${this._renderListCard(r,i,e.amount,e.cardTitle,e.contentText,e.numProduct)}
      ${this._renderNotificationHelp(e.amount>=this.selectedAmount,"bbva-parking-city-multistep-recharge-insufficient-balance-account")}
      ${e.divider&&t<2?u`
            <bbva-divider size="${null==e||null===(a=e.divider)||void 0===a?void 0:a.size}"></bbva-divider>
          `:""}
      `}))}

    ${e<2?u`
    <div class="step-amount-button-container">
      ${this._renderButtonDefault(this.isActiveOneAccountButton,"","bbva-parking-city-multistep-recharge-continue","selectOneAccountButton")}
    </div>
    `:null}
    `}_renderText(e,t,a="light",i="left",r="secondary600"){return u`
    <bbva-text
      text="${this.t(e)}"
      size="${t}"
      ambient=${a}
      alignment="${i}"
      ambient-color="${r}">
    </bbva-text>
    `}_renderAmount(e,t,a){return u`
    <bbva-amount
      variant="${t}"
      amount="${e}"
      currency-code="${this.currencyCode}"
      local-currency="${this.localCurrency}"
      language="${this.language}"
      ambient="${a}">
    </bbva-amount>
    `}_renderListCard(e,t,a,i,r,n,s="light"){return u`
    <bbva-list-card
       id="${e}"
       ambient=${s}
       ?no-link=${t}
       currency-code="${this.currencyCode}"
       local-currency="${this.localCurrency}"
       language="${this.language}"
       amount="${a}"
       card-title="${i}"
       content-text="${r}"
       num-product="${n}"
       @list-card-item-click="${this._stepCompletedHandler}}">
    </bbva-list-card>
    `}_renderNotificationHelp(e,t){return u`
    <bbva-notification-help
      ?hidden="${e}"
      accessibility-label-icon="Alert"
      class="alert"
      icon=${j()}
      text="${this.t(t)}"
    ></bbva-notification-help>
    `}_renderNotificationMessage(e,t,a,i="",r=""){return u`
    <bbva-notification-message
      ?hidden=${e}
      variant="${a}"
      message="${t}"
      message-title="${this.t(i)}"
      link-title="${this.t(r)}"
      @notification-message-link-click=${this._linkClick}
    ></bbva-notification-message>
    `}_renderButtonDefault(e,t,a,i,r=""){return u`
    <bbva-button-default
    class="${this.defaultButtonClass} ${t}"
    id="${i}"
    ?disabled="${e}"
    @click="${this._stepCompletedHandler}}"
    text="${this.t(a)}"
    variant="${r}"
    ></bbva-button-default>
    `}_renderModalParking(e,t){return u`
      <bbva-modal-parking-recharge
        ?visible="${e}"
        .data=${t}
        currency-code="${this.currencyCode}"
        local-currency="${this.localCurrency}"
        language="${this.language}"
        @help-modal-close="${this._closeHelpModal}"
        @select-account="${this._selectModalAccount}"
      >
      </bbva-modal-parking-recharge>
    `}_selectModalAccount({detail:e}){this._steps.find((e=>"selectAccountStep"===e.id)).completed=!0,this._stepCompletedHandler({target:e})}_renderExpandableStep(e,t,a,i,r,n,s,o=!1){const c=o?"":`${s} de ${this.maxStep}`;return u`
      <bbva-expandable-step
        id="${e}"
        class="${t}"
        ?prefilled="${o}"
        ?view-label="${o}"
        header="${this.t(a)}"
        disabled-target="${this.stepDisabledTarget}"
        edit-label="${o?"":n}"
        current-step-label = "${c}"
        hide-padding-top
        ?hide-padding-right="${o}"
        ?hide-padding-left="${o}"

        ?disable-on-previous-step-edit='${o?this.disabledSimulatorStep:""}'
        @expandable-step-complete-change="${this._onEditStep}"
        @expandable-step-edit-step="${this._onStepEditStep}"
      >
        <div class="expandable-step-content">
          ${i}
        </div>
        <div class="expandable-step-summary" slot="summary">
          ${r}
        </div>
      </bbva-expandable-step>
    `}get _renderModalMoreInformation(){return this._renderModalParking(this.showModalMoreInformation,{id:"modal-more-information",headerType:"modal-three-level",showTextIcon:!0,headerText:"bbva-parking-city-multistep-recharge-modal-header-text",titleText:"bbva-parking-city-multistep-recharge-modal-title-text",buttonText:"bbva-parking-city-multistep-recharge-modal-button-text",contentText:[{text:"bbva-parking-city-multistep-recharge-modal-more-info-paragraph-1",size:"s"}]})}get _renderModalAllAccounts(){const e={id:"modal-all-accounts",headerType:"modal-three-level",showTextIcon:!1,headerText:"bbva-parking-city-multistep-recharge-modal-all-accounts-header-text",titleText:"",buttonText:"bbva-parking-city-multistep-recharge-modal-all-accounts-button-text",contentCard:this.listAccounts,selectedAmount:this.selectedAmount};return this._renderModalParking(this.showModalAllAccounts,e)}_hideElement(e,t){this[e].hidden=t,t?this[e].setAttribute("tabindex","-1"):this[e].removeAttribute("tabindex")}_onEditStep(){if(0===Object.keys(this.selectedAccount).length){const e=this._steps.find((e=>"selectAccountStep"===e.id));e.completed=!1,e.removeAttribute("completed"),e.disabled=!0,e.active=!1}this._hideElement("_notificationMessage",!1),this._hideElement("_formPresetAmount",!1),this._hideItems=!1}_onStepEditStep({target:e}){const{id:t}=e;this._fireEvent("bbva-multistep-edit-step",{id:t})}_changeSelection(){this._fireEvent("account-step-process"),this.selectedAccount={}}_closeHelpModal(){this.showModalMoreInformation=!1,this.showModalAllAccounts=!1}_clickSeeMore(){this.showModalAllAccounts=!0}_headerRightPrimaryClick(){this._fireEvent("header-right-primary-click")}_validatesAccountAmount(){Object.keys(this.selectedAccount).length>0&&this.selectedAccount.amount<this.selectedAmount?(this._fireEvent("account-step-process"),this.selectedAccount={},this._steps.find((e=>"selectAccountStep"===e.id)).completed=!1):0===Object.keys(this.selectedAccount).length?(this._fireEvent("account-step-process"),this._steps.find((e=>"selectAccountStep"===e.id)).completed=!1):1!==Object.keys(this.listAccounts).length||this._steps[2].completed||this._fireEvent("account-step-process")}_stepCompletedHandler({target:e}){const{id:t,numProduct:a}=e;e.dispatchEvent(new CustomEvent("complete",{bubbles:!0,composed:!0})),"selectAccountSummary"!==t&&"keepSelectionCard"!==t&&void 0!==a?(this.showModalAllAccounts=!1,this.clickOnSelectedAccount(a)):"parkingRechargeButton"===t?(this._hideItems=!0,this._fireEvent("bbva-multistep-parking-recharge-continue-amount-btn",{id:t}),this._validatesAccountAmount()):"selectOneAccountButton"===t&&this._fireEvent("send-selected-account",this.selectedAccount)}_fireEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}_linkClick(){this.showModalMoreInformation=!0,this._fireEvent("show-modal-more-information",!0)}itemChange(e){this.selectedAmount=e.detail,this.isActiveAmountButton=!0}clickOnSelectedAccount(e){this.selectedAccount=this.listAccounts.find((t=>t.numProduct===e)),this._fireEvent("send-selected-account",this.selectedAccount)}resetMultistep(){const e=[];this._steps.length&&(this._steps.forEach(((t,a)=>{const i=t.id,r=this._steps.find((e=>e.id===i));r.completed=!1,0===a?r.completed=!0:1===a?(r.disabled=!1,r.active=!0,this.isActiveAmountButton=!1,this._formPresetAmount.selected=void 0):(r.active=!1,r.disabled=!0,this.isActiveOneAccountButton=!(this.listAccounts[0].amount>=this.selectedAmount),this.listAccounts.length<2?this._oneAccountButton.disabled=!(this.listAccounts[0].amount>=this.selectedAmount):this.selectedAccount={}),e.push(a)})),this._multistep.stepsToReset=e,this._multistep._scrollToTop(.5,0,0),this._resetProperties())}_resetProperties(){this.parkingCommission=12,this.items=[],this.showAlertMessage=!1,this.selectedAmount=100,this.showModalMoreInformation=!1,this.showModalAllAccounts=!1,this._hideItems=!1}render(){return u`
    <bbva-header-main
      id="parkingRechargeHeader"
      accessibility-text-icon-right-primary='Close'
      text=${this.t("bbva-parking-city-multistep-recharge-title")}
      icon-right-primary=${L()}
      variant='modal'
      @header-main-icon-right-primary-click=${this._headerRightPrimaryClick}
    ></bbva-header-main>
    <bbva-expandable-multistep
      has-animation
      id="parkingRechargeMultistep"
      class="scrollable"
      step-selector="${this._stepSelector}"
      >
      ${this.parkingAccountStep}
      ${this.parkingRechargeStep}
      ${this.selectAccountStep}
    </bbva-expandable-multistep>
    ${this._renderModalMoreInformation}
    ${this._renderModalAllAccounts}
    `}}customElements.define(pe.is,pe);class me extends b{static get is(){return"bbva-analytic-manager-parking-recharge"}static get properties(){return{appStartedFlag:{type:Boolean},_appOtpFlag:{type:Boolean},persistentData:{type:Object},commission:{type:String}}}constructor(){super(),this.appStartedFlag=!1,this._appOtpFlag=!1,this.persistentData={},this.commission=""}firePageVist(){this._dispatchEvent("analytics-app-page-visit")}fireAppStarted(e){if(void 0!==e){const t={string:()=>({amount:e}),boolean:()=>{},object:()=>{}};if(Object.assign(this.persistentData,t[typeof e]()),!this.appStartedFlag){const t={string:()=>({detail:"importe"}),boolean:()=>({detail:"mas informacion"}),object:()=>({detail:"continuar"})};Object.assign(this.persistentData,t[typeof e]()),this._dispatchEvent("analytics-app-started",this.persistentData),this.appStartedFlag=!0}}}fireAppStepTwo(){this._dispatchEvent("analytics-app-step-2",{...this.persistentData,serviceCharge:this.commission})}fireAppStepThree(e){e&&"boolean"==typeof e&&(this._dispatchEvent("analytics-app-step-3",{...this.persistentData,serviceCharge:this.commission}),this._appOtpFlag=!0)}changedStepSelection(e){e&&"object"==typeof e&&"parkingRechargeStep"===(null==e?void 0:e.id)&&(this.appStartedFlag=!1,this.firePageVist())}fireAppStepFour(){this._appOtpFlag&&(this._dispatchEvent("analytics-app-step-4",{...this.persistentData,serviceCharge:this.commission}),this._appOtpFlag=!1)}parseProductName(e={}){const t=null==e?void 0:e.productName;Object.assign(this.persistentData,{productName:t.toLowerCase()})}fireAppCompleted(e={}){const t=null==e?void 0:e.commission;Object.assign(this.persistentData,{operationNumber:((e,t=9)=>{var a,i;return null==e||null===(a=e.topInfo)||void 0===a||null===(i=a[t])||void 0===i?void 0:i.value})(e),serviceCharge:t}),this._dispatchEvent("analytics-app-completed",this.persistentData)}resetAnalytics(){this.appStartedFlag=!1,this._appOtpFlag=!1,this.persistentData={}}_dispatchEvent(e,t){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}customElements.define(me.is,me);
