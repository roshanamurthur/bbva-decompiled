import{z as e,a8 as t,ac as i,a9 as a,a as r,ap as s,an as n,L as o,ag as l,F as c,b$ as d,ak as h,bx as p,b1 as b,h as g,i as m,c0 as v,f as u,g as y,o as _,l as f,e as k,b3 as x,cI as $,ad as S,ab as C,aa as T,b0 as D,aJ as E,bj as w,b6 as L,dt as I,av as P,b5 as B,cD as A,cH as V,dQ as N,ay as H,bU as M,dR as q,di as z,aN as F}from"./952f98a9.js";import{a7 as R,bu as O}from"./7f3d7ca9.js";import{B as j}from"./980a7fb4.js";import{b as U,B as Y}from"./0eabd6c4.js";import"./3e14f6f9.js";import"./216055dc.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./19ae9b6c.js";var K=e`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${t(a.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${t(a.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${t(a.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${t(a.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${t(a.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${t(a.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${t(a.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${t(a.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${t(a.primarySubduedLight)}));
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
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${t(i.typeMedium)}));
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
`;class W extends(r(s(n(o)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":l,"bbva-icon":c,"bbva-badge-notification":d}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const e={1:"half-space",2:"full-space"},t=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(t,i);return a in e?e[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[K,h("bbva-header-main-shared-styles"),p("button:focus"),b.dark]}static toCamelCase(e){return(e.charAt(0).toUpperCase()+e.slice(1)).replace(/([-_][a-z])/gi,(e=>e.toUpperCase().replace("-","").replace("_","")))}_icon(e){return g`<bbva-icon icon="${m(this[e])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(e){return g`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(e)}
    </bbva-badge-notification>`}_tplButton(e,t,i,a){const r=W.toCamelCase(e),s=`icon${r}`,n=`accessibilityTextIcon${r}`;return g`<button
      class="${t}"
      id="btn-${e}"
      aria-label="${m(this.t(this[n]))}"
      aria-expanded=${m(a)}
      ?hidden="${!this[s]}"
      @click="${()=>this._headerIconClick(e)}"
    >
      ${"left-primary"===e&&this.notificationText?this._badgeNotification(s):this._icon(s)}
      ${this.showTextIcon?this._textIcon(i):""}
    </button>`}_textIcon(e){return g` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${m(this.t(e))}"
    >
    </bbva-text>`}_tplHeading(e){return g`
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
    `}render(){const{_availableHeadingSpace:e,_hasImage:t,text:i,image:a,_hasMicroillustration:r}=this;return g`
      <header class="header-main">
        <div class="header-icons ${e} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${t}"
          id="heading"
          aria-label=${(r||a)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(i)}
          tabindex="-1"
        >
          ${i&&" "!==i&&this._tplHeading(i)||""}
          <img src="${m(a)}" alt="" ?hidden="${!a}" id="image" aria-hidden="true" />

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
    `}_headerIconClick(e){this.dispatchEvent(new CustomEvent(`header-main-icon-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}}y("colors.primaryCoreLightened"),y("colors.cool80"),y("colors.cool70"),y("colors.primaryCoreLightened"),y("colors.cool100"),y("colors.tertiaryType6Darkened"),y("colors.tertiaryType4Darkened"),y("colors.secondary300"),y("colors.primaryCoreLightened"),y("colors.primaryCoreLightened"),y("colors.cool20"),y("colors.cool20"),y("colors.tertiaryType6Light"),y("colors.tertiaryType6Light"),y("colors.tertiaryType1Light"),y("colors.cool20"),y("colors.cool50"),y("colors.cool90");var X=e`:host {
  display: block;
  box-sizing: border-box;
  --_progress-vertical-step-skeleton-quote-color: var(--bbva-progress-vertical-step-dark-mode-skeleton-color, var(--bbva-progress-vertical-step-skeleton-color, var(--colorsSecondary200, ${t(a.secondary200)})));
  --_progress-vertical-step-skeleton-quote-bg: var(--bbva-progress-vertical-step-dark-mode-skeleton-bg, var(--bbva-progress-vertical-step-skeleton-bg, var(--colorsPrimaryCoreLightened, ${t(a.primaryCoreLightened)})));
  --_progress-vertical-step-skeleton-animated-layer-bg: var(--bbva-progress-vertical-step-dark-mode-skeleton-animated-layer-bg, var(--bbva-progress-vertical-step-skeleton-animated-layer-bg, var(--colorsPrimaryCoreLightened, ${t(a.primaryCoreLightened)})));
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

.skeleton {
  position: relative;
  margin-top: 2rem;
  overflow: hidden;
  height: 4.375rem;
  pointer-events: none;
  background-repeat: no-repeat;
  opacity: 1;
  background-image: radial-gradient(1rem 100%, var(--_progress-vertical-step-skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--_progress-vertical-step-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_progress-vertical-step-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_progress-vertical-step-skeleton-quote-color) 50%);
  background-color: var(--_progress-vertical-step-skeleton-quote-bg);
  background-size: 16px 16px, calc((50% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px, calc((10% * 2) + (16px/ 2)) 16px;
  background-position: 16px 4px, 48px 4px, 48px 26px, 48px 48px;
}

.skeleton::before {
  content: "";
  position: absolute;
  top: 0;
  left: -100%;
  width: 100%;
  height: 100%;
  background: linear-gradient(to left, transparent, rgba(255, 255, 255, 0.8), transparent);
  animation: skeleton-loading 1.5s infinite;
}

@keyframes skeleton-loading {
  0% {
    transform: translateX(-100%);
  }
  100% {
    transform: translateX(100%);
  }
}
`;class J extends(R(x(n(o)))){static get is(){return"skeleton-tdc"}static get scopedElements(){const e=[...J.configurationScopedElements()];return J.scopedElementsFromClasses(e)}static get properties(){return{load:{type:Number}}}constructor(){super(),this.load=1}static get styles(){return[X]}render(){const e=[];for(let t=0;t<this.load;t+=1)e.push(g`<div class='skeleton'></div>`);return g`
        ${e}
    `}}customElements.define(J.is,J);var Q=e`:host {
  display: block;
  box-sizing: border-box;
  color: var(--colorsCool100);
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-text] {
  margin-top: 1.5rem;
  margin-left: 1rem;
}

[data-tag-name=bbva-progress-vertical-step] {
  color: var(--colorsCool100);
  text-align: left;
}

[data-tag-name=skeleton-tdc] {
  margin-top: 5rem;
  color: var(--colorsCool100);
  text-align: left;
}
`;class G extends(R(x(n(o)))){static get is(){return"tracking-tdc"}static get scopedElements(){const e=[W,Y,J,l,...G.configurationScopedElements()];return G.scopedElementsFromClasses(e)}static get properties(){return{steps:{type:Array},loading:{type:Boolean},cardNumber:{type:String},_titleHeader:{type:String}}}constructor(){super(),this.steps=[],this.cardNumber="",this.loading=!1,this._textDescription="",this._titleHeader=this.t("bbva-feature-card-tracking-header-title")}static get styles(){return[Q]}_fireEvent(e="",t={}){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}_bbvaHeader(){return g`
      <bbva-header-main
        icon-left-primary="${$()}"
        accessibility-text-icon-left-primary="Return"
        text="${this._titleHeader}"
        @header-main-icon-left-primary-click="${()=>{this._fireEvent("goBack")}}">  
      </bbva-header-main>
    `}_bbvaProgressStep(){return g`
      <bbva-progress-vertical-step
        id="progress"
        .steps="${this.steps}"
        @progress-vertical-step-link-click="${e=>{this._fireEvent("progress-step-event",e)}}">
      </bbva-progress-vertical-step>
    `}_bbvaSkeleton(){return g`
      <skeleton-tdc
        id="skeleton"
        load=4>
      </skeleton-tdc>
    `}_bbvaText(e){return g`
      <bbva-text
        text="${e}"
        size="S"
      > 
      </bbva-text>
    `}_getDescription(){return`${this.t("bbva-feature-card-tracking-description-delivery")+this.cardNumber}.`}render(){return g`
      <div slot="slot-content" class="step">
        ${this._bbvaHeader()}
        ${this.loading?g`
          ${this._bbvaSkeleton()}
        `:g`
          ${this._bbvaText(this._getDescription())}
          ${this._bbvaProgressStep()}  
        `}
      </div>
    `}}customElements.define(G.is,G);var Z=e`
:host {
  display: flex;
  flex-direction: column;
  box-sizing: border-box;
  text-align: center;
  position: relative;
  --_panel-info-title-color: var(--bbva-panel-info-title-dark-mode-color, var(--bbva-panel-info-title-color, var(--colorsSecondary600, ${t(a.secondary600)})));
  --_panel-info-text-color: var(--bbva-panel-info-text-dark-mode-color, var(--bbva-panel-info-text-color, var(--colorsSecondary600, ${t(a.secondary600)})));
  --bbva-text-highlight-color: var(--bbva-panel-info-text-highlight-dark-mode-color, var(--bbva-panel-info-text-highlight-color, var(--colorsSecondary600, ${t(a.secondary600)})));
  --_skeleton-quote-color: var(--bbva-panel-info-skeleton-dark-mode-color, var(--bbva-panel-info-skeleton-color, var(--colorsSecondary200, ${t(a.secondary200)})));
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

.image {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(T.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(T.spacer)}))) / 16) * 1em) auto;
}
.image img {
  width: var(--bbva-panel-info-image-width, 100%);
  height: var(--bbva-panel-info-image-height, auto);
  object-fit: cover;
  margin: 0 auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(T.spacer)}))) / 16) * 1rem);
}
.image span {
  display: block;
  width: var(--bbva-panel-info-microillustration-width, 5rem);
  height: var(--bbva-panel-info-microillustration-height, auto);
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(T.spacer)}))) / 16) * 1rem) auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(T.spacer)}))) / 16) * 1rem);
}
.image span.empty-state {
  width: 9rem;
}

.content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(T.spacer)}))) / 16) * 1em) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(T.spacer)}))) / 16) * 1em);
}
.content ::slotted(*) {
  margin: 0;
  line-height: var(--lineHeightTypeSmall, ${t(S.typeSmall)});
}

:host([hide-padding-bottom]) .content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(T.spacer)}))) / 16) * 1em) 0;
}

.title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(T.spacer)}))) / 16) * 1rem);
  color: var(--_panel-info-title-color);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${t(C.medium.fontWeight)});
  line-height: var(--lineHeightTypeLarge, ${t(S.typeLarge)});
}
.title.not-text {
  margin-bottom: 0;
}

.description {
  margin: 0 auto;
  color: var(--_panel-info-text-color);
}

[data-tag-name=bbva-link] {
  display: inline-block;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(T.spacer)}))) / 16) * 1rem);
}
[data-tag-name=bbva-link][disabled] {
  opacity: 1;
}

:host([loading]):before {
  background-image: linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg, transparent);
  background-size: 144px 144px, calc((44% * 2) + (16px/ 2)) 16px, calc((75% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px;
  background-position: 50% 8px, 283% 168px, -20% 200px, 92% 232px;
}

:host([loading][image]):before {
  margin-top: 0;
  min-height: 17.5rem;
  background-image: linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg, transparent);
  background-size: 100% 152px, calc((44% * 2) + (16px/ 2)) 16px, calc((75% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px;
  background-position: 50% 0px, 283% 172px, -20% 204px, 92% 236px;
}

:host([loading]):before {
  content: "";
  position: absolute;
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(T.spacer)}))) / 16) * 1rem);
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  min-height: 18.5rem;
  display: inline-block;
  pointer-events: none;
  background-repeat: no-repeat;
  font-size: 1em;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

@keyframes pulse {
  0% {
    filter: opacity(100%);
  }
  50% {
    filter: opacity(60%);
  }
  100% {
    filter: opacity(100%);
  }
}
`,ee=e`
[ambient^=light] {
  --bbva-panel-info-title-color: initial;
  --bbva-panel-info-text-color: initial;
  --bbva-panel-info-text-highlight-color: initial;
  --bbva-panel-info-skeleton-color: initial;
}
`,te=e`
[ambient^=dark] {
  --bbva-panel-info-title-color: var(--colorsPrimaryCoreLightened, ${t(a.primaryCoreLightened)});
  --bbva-panel-info-text-color: var(--colorsPrimaryCoreLightened, ${t(a.primaryCoreLightened)});
  --bbva-panel-info-text-highlight-color: var(--colorsPrimaryCoreLightened, ${t(a.primaryCoreLightened)});
  --bbva-panel-info-skeleton-color: var(--colorsPrimaryMedium, ${t(a.primaryMedium)});
}
`;const ie={light:e`
    ${D.light}
    ${ee}
  `,dark:e`
    ${D.dark}
    ${te}
  `};class ae extends(E(r(s(n(o))))){static get is(){return"bbva-panel-info"}static get scopedElements(){return{"bbva-core-heading":w,"bbva-link":L,"bbva-text":l}}static get properties(){return{image:{type:String},imageAltText:{type:String,attribute:"image-alt-text"},microillustration:{type:Object},heading:{type:String},headingLines:{type:Number,attribute:"heading-lines"},text:{type:String},textLines:{type:Number,attribute:"text-lines"},linkText:{type:String,attribute:"link-text"},loading:{type:Boolean,reflect:!0},headingLevelTitle:{type:String,attribute:"heading-level-title",reflect:!0},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom",reflect:!0},isNested:{type:Boolean,attribute:"is-nested"}}}constructor(){super(),this.imageAltText="",this.microillustration=I,this.text="",this.loading=!1,this.headingLevelTitle="h2",this.hidePaddingBottom=!1,this.isNested=!1,this.heading="",this.linkText=""}static get styles(){return[Z,super.styles,h("bbva-panel-info-shared-styles"),ie.light,ie.dark]}get _contentImage(){return this.image?g` <img id="image" src="${this.image}" alt="${this.imageAltText}" /> `:g`
      <span
        class="${P({"empty-state":this._isEmptyState&&!this.isNested})}"
        aria-hidden="true"
        >${this.microillustration}</span
      >
    `}get _isEmptyState(){return this.microillustration===I}render(){return g`
      <div class="image">${this._contentImage}</div>
      <div class="content">
        ${this.heading&&g`
          <bbva-text
            tabindex="0"
            class="title ${P({"not-text":!this.text})}"
            text=${this.t(this.heading)}
            size="L"
            alignment="center"
            tag="${m(this.headingLevelTitle)}"
            ?ellipsis="${!!this.headingLines}"
            .lines="${this.headingLines}"
            inherit
          ></bbva-text>
        `}
        ${this.t(this.text)&&g`
          <bbva-text
            tabindex="0"
            class="description"
            text=${this.t(this.text)}
            size="S"
            alignment="center"
            ?ellipsis="${!!this.textLines}"
            .lines="${this.textLines}"
            inherit
          ></bbva-text>
        `}
        ${g` <slot></slot> `}
        ${this.linkText&&g`
          <bbva-link
            ?disabled=${this.disabled}
            @click="${this._buttonClickHandler}"
            .text="${this.t(this.linkText)}"
          ></bbva-link>
        `}
      </div>
    `}_buttonClickHandler(){this.disabled||this.dispatchEvent(new CustomEvent("panel-info-link-click",{detail:!0,bubbles:!0,composed:!0}))}}y("colors.primaryCoreLightened"),y("colors.primaryCoreLightened"),y("colors.primaryCoreLightened"),y("colors.cool50");var re=e`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-panel-info] {
  margin-top: 1rem;
}

[data-tag-name=bbva-text].informacion, .link_volver {
  text-align: center;
  margin-left: 1rem;
  margin-right: 1rem;
}

[data-tag-name=bbva-header-category] {
  margin-bottom: -1.5rem;
}

[data-tag-name=bbva-button-default] {
  margin-top: 9rem;
  --bbva-button-action-color: var(--colorsPrimaryCoreLightened);
  background-color: var(--statusColorsPending);
}

[data-tag-name=bbva-text] {
  margin-top: -1rem;
  margin-left: 1rem;
  margin-right: 1rem;
}

[data-tag-name=bbva-notification-message] {
  margin-left: 1rem;
  margin-right: 1rem;
}

[data-tag-name=bbva-help-modal].modal-information-tracking {
  --bbva-help-modal-dark-mode-title-icon-color-info: ${t(a.primaryCoreDarkened)};
  --bbva-help-modal-title-icon-margin-bottom: 0;
}
`;class se extends(R(x(n(o)))){static get is(){return"detail-tdc"}static get scopedElements(){const e=[W,ae,B,A,l,V,...se.configurationScopedElements()];return se.scopedElementsFromClasses(e)}static get properties(){return{phoneNumberBbvaLine:{type:String},isDetailPending:{type:Boolean},titlepending:{type:String},titleComplete:{type:String},titleReceive:{type:String},titlereceiverType:{type:String},_isAdressComplete:{type:Boolean},_titleHeader:{type:String},showModalInformationTracking:{type:Boolean},iOSFixedHeader:{type:Boolean}}}constructor(){super(),this.iOSFixedHeader=!1,this.isDetailPending=!1,this.showModalInformationTracking=!1,this.titlepending="",this.titleComplete="",this.titleReceive="",this.titlereceiverType="",this._isAdressComplete=!1,this._titleHeader=this.t("bbva-feature-card-tracking-detail-header-title")}static get styles(){return[re]}updated(e){e.has("_isAdressComplete")&&this._isAdressComplete&&""===this.titleComplete&&this._fireEvent("detail-showFullAddress",!0)}_bbvaPanelInfoTemplate(){return g`
      <bbva-panel-info
        .microillustration=${this.isDetailPending?N:H}
        heading="${this.isDetailPending?this.t("bbva-feature-card-tracking-panel-header-pending"):this.t("bbva-feature-card-tracking-detail-header-delivered")}">
      </bbva-panel-info>`}_goTracking(){this._isAdressComplete=!1,this._fireEvent("click-header-return")}_fireEvent(e="",t={}){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}_bbvaHeader(){return g`
      <bbva-header-main
        icon-left-primary="${$()}"
        text="${this._titleHeader}"
        @header-main-icon-left-primary-click="${()=>{this._goTracking()}}">
      </bbva-header-main>
    `}_bbvaText(e,t=""){return g`
      <bbva-text
        class="${t}"
        text="${e}"
        size="S">
      </bbva-text>
    `}_bbvaHeaderCategory(e,t="",i=!1){return g`
        <bbva-header-category
          option-link="${t}"
          link-accessibility-text="${t}"
          text="${e}"
          .hasHelp=${i}
          @header-category-link-click=${()=>{this._isAdressComplete=!this._isAdressComplete}}
          @header-category-help-click="${()=>{this.showModalInformationTracking=!0}}"
          >
        </bbva-header-category>
    `}get _showModalInformationTracking(){return g`
     <bbva-help-modal
      class="modal-information-tracking"
      modal-type="info"
      .iOSFixedHeader=${this.iOSFixedHeader}
      full-height
      fixed-footer
      ?visible=${this.showModalInformationTracking}
      header-text="${this.t("bbva-feature-card-tracking-category-header-pending")}"
      title-icon="bbva:help"
      body-text="${this.t("bbva-feature-card-tracking-detail-modal-body-message")}"
      button-text="${this.t("bbva-feature-card-tracking-detail-accept-button")}"
      @help-modal-footer-button-click=${this._closeModalInfo}
      @help-modal-header-right-primary-click=${this._closeModalInfo}
      ></bbva-help-modal>
    `}_closeModalInfo(){this.showModalInformationTracking=!1}_bbvaNotificationMessage(){return g`
        <bbva-notification-message
          message-title="${this.t("bbva-feature-card-tracking-detail-notification-title")}"
          message="${this.t("bbva-feature-card-tracking-detail-notification-message")}"
          link-title="${this.t("bbva-feature-card-tracking-call-line-bbva")}" 
          @notification-message-link-click="${()=>{this._fireEvent("call-bbva-line",{value:this.phoneNumberBbvaLine})}}">
        </bbva-notification-message>
    `}_setUpContentTitle(e){return{delivered:this.t("bbva-feature-card-tracking-category-header-delivered"),pending:this.t("bbva-feature-card-tracking-category-header-pending"),show:this.t("bbva-feature-card-tracking-detail-show-address"),hide:this.t("bbva-feature-card-tracking-detail-hide-address")}[e]||""}_makeContributionTemplate(){return g`
        <div slot="slot-content">
          ${this._bbvaPanelInfoTemplate()}
          ${this._isAdressComplete&&""!==this.titleComplete?g`
              ${this._bbvaHeaderCategory(this._setUpContentTitle("pending"),this._setUpContentTitle("hide"),!0)}
              ${this._bbvaText(this.titleComplete)}
            `:g`
              ${this._bbvaHeaderCategory(this._setUpContentTitle("pending"),this._setUpContentTitle("show"),!0)}
              ${this._bbvaText(this.titlepending)}
            `}
          ${this.isDetailPending?g``:g`
              ${this._bbvaHeaderCategory(this._setUpContentTitle("delivered"))}
              ${this._bbvaText(this.titleReceive,"receive")}
              ${this._bbvaText(this.titlereceiverType,"receive")}
            `}  
          ${this._bbvaNotificationMessage()}
        </div>
    `}render(){return g`
      ${this._showModalInformationTracking}
      <div>
       ${this._bbvaHeader()}
       ${this._makeContributionTemplate()}
      </div>
       
    `}}customElements.define(se.is,se);var ne=e`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-text].informacion {
  text-align: center;
  margin-left: 1rem;
  margin-right: 1rem;
}

[data-tag-name=bbva-button-default] {
  margin-top: 14rem;
}

[data-tag-name=bbva-link] {
  margin-top: 1rem;
}
`;class oe extends(R(x(n(o)))){static get is(){return"error-sending"}static get scopedElements(){const e=[W,ae,l,M,L,...oe.configurationScopedElements()];return oe.scopedElementsFromClasses(e)}static get properties(){return{phoneNumberBbvaLine:{type:String},_titlePanelInfo:{type:String},_titleHeader:{type:String},_titleText:{type:String},_titleLink:{type:String}}}constructor(){super(),this.phoneNumberBbvaLine="",this._titlePanelInfo=this.t("bbva-feature-card-tracking-panel-header-stop"),this._titleHeader=this.t("bbva-feature-card-tracking-detail-header-title"),this._titleText=this.t("bbva-feature-card-tracking-error-detail-info"),this._titleLink=this.t("bbva-feature-card-tracking-error-link-message")}static get styles(){return[ne]}_callBBVALine(){this._fireEvent("call-bbva-line",{value:this.phoneNumberBbvaLine})}_fireEvent(e="",t={}){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}_bbvaHeader(){return g`
      <bbva-header-main
        icon-left-primary="${$()}"
        text="${this._titleHeader}"
        @header-main-icon-left-primary-click="${()=>{this._fireEvent("goTracking")}}">  
      </bbva-header-main>
    `}_bbvaText(){return g`
      <bbva-text
        class="informacion"
        text="${this._titleText}"
        size="M">
      </bbva-text>
    `}_bbvaFooter(){return g`
      <div>
          <bbva-button-default
            ambient="dark" 
            text="${this.t("bbva-feature-card-tracking-call-line-bbva")}"
            @click="${()=>{this._callBBVALine()}}"
          >
        </bbva-button-default>
      </div>
      <div>
        <bbva-link
          variant="message" 
          text="${this._titleLink}" 
          @click="${()=>{this._fireEvent("goTracking")}}"></bbva-link>
      </div>
    `}_bbvaPanelInfo(){return g`
      <bbva-panel-info
        .microillustration=${q}
        heading="${this._titlePanelInfo}">
      </bbva-panel-info>
    `}_makeTemplateScreen(){return g`
        ${this._bbvaPanelInfo()}
        ${this._bbvaText()}
        ${this._bbvaFooter()}
    `}render(){return g`
      <div>
       ${this._bbvaHeader()}
       ${this._makeTemplateScreen()}
      </div>
    `}}customElements.define(oe.is,oe);var le=e`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: rem(0) ;
}
`;class ce extends(R(x(n(o)))){static get is(){return"bbva-feature-card-tracking"}static get properties(){return{cardId:{type:String},customerId:{type:String},cardNumber:{type:String},cardName:{type:String},requiredOTPCustomer:{type:Boolean},versionCards:{type:String},versionCustomersAddresses:{type:String},loading:{type:Boolean},phoneNumberBbvaLine:{type:String},_steep:{type:Array},_isTrackingVisible:{type:Boolean},_isCustomerAddressVisible:{type:Boolean},_titlepending:{type:String},_titleComplete:{type:String},_cardsDm:{type:Object},_customerDm:{type:Object},_isDetailPending:{type:Boolean},_loadComponentes:{type:Boolean},_isErrorServiceCards:{type:Boolean},_isErrorServiceCustomer:{type:Boolean},_attemptCounter:{type:Number},_receiver:{type:String},_receiverType:{type:String},_isErrorSending:{type:Boolean},_keysForTemplate:{type:Array},_keysForDate:{type:Array},iOSFixedHeader:{type:Boolean}}}static get scopedElements(){const e=[W,z,O,j,G,se,V,oe,...ce.configurationScopedElements()];return ce.scopedElementsFromClasses(e)}constructor(){super(),this._isDetailPending=!1,this._loadComponentes=!1,this._isErrorServiceCards=!1,this._isErrorServiceCustomer=!1,this._cardsDm=null,this._customerDm=null,this.versionCards="",this.versionCustomersAddresses="",this.loading=!1,this._steep=[],this.cardId=null,this.requiredOTPCustomer=!1,this.customerId=null,this._isTrackingVisible=!1,this._isCustomerAddressVisible=!1,this._titlepending="",this._titleComplete="",this._attemptCounter=0,this.cardName="",this.cardNumber="",this._receiver="",this._receiverType="",this._isErrorSending=!1,this.phoneNumberBbvaLine="",this.iOSFixedHeader=!1,this._keysForTemplate=["_days_","_nameCard_","_numberCard_","_deliveryDate_"],this._keysForDate=["[_year_]","[_month_]","[_day_]"]}static get styles(){return[le,h("bbva-feature-card-tracking-shared-styles")]}updated(e){e.has("_loadComponentes")&&this._loadComponentes&&this.cardId&&this._starTrakingTdc(),e.has("_steep")&&this._steep&&this.loading&&this._steep.length>0&&this.loading&&(this.loading=!1)}_starTrakingTdc(){this._loadComponentes=!1,this._setUpDataProviders(),this.getCardDetailDeliveries()}_setUpDataProviders(){this._cardsDm=this.shadowRoot.querySelector("#bbvaDataProviderCards"),this._customerDm=this.shadowRoot.querySelector("#customersDm")}_setFourStatusTemplate(){return[{id:1,title:this.t("bbva-feature-card-tracking-template-title-request"),status:"request-card",value:"glomo-cc-tracking-request-received",description:this.t("bbva-feature-card-tracking-template-description-request"),statusDate:"",subtitle:this.t("bbva-feature-card-tracking-template-subtitle-request"),badgeStatus:""},{id:2,title:this.t("bbva-feature-card-tracking-template-title-made"),status:"made-card",value:"glomo-cc-tracking-delivery-customizing-card",description:this.t("bbva-feature-card-tracking-template-description-made"),statusDate:"",subtitle:this.t("bbva-feature-card-tracking-template-subtitle-made"),badgeStatus:""},{id:3,status:"delivery-card",title:this.t("bbva-feature-card-tracking-template-title-delivery-card"),value:"glomo-cc-tracking-delivery-card-in-progress",description:this.t("bbva-feature-card-tracking-template-title-delivery"),statusDate:"",subtitle:this.t("bbva-feature-card-tracking-template-subtitle-delivery"),badgeStatus:""},{id:4,title:this.t("bbva-feature-card-tracking-template-title-sending"),status:"sending-card",value:"glomo-cc-tracking-card-delivered",description:this.t("bbva-feature-card-tracking-template-description-sending"),statusDate:"",subtitle:this.t("bbva-feature-card-tracking-template-subtitle-sending"),badgeStatus:"",linkText:this.t("bbva-feature-card-tracking-template-link-text-sending")}]}_setDeliveryExpiredStatusTemplate(){return[{id:1,value:"glomo-cc-tracking-request-received-error",description:this.t("bbva-feature-card-tracking-expired-template-description-request"),status:"completed request-card",subtitle:this.t("bbva-feature-card-tracking-template-subtitle-request"),title:this.t("bbva-feature-card-tracking-template-title-request"),badgeStatus:"success"},{id:2,value:"glomo-cc-tracking-delivery-customizing-card-error",description:this.t("bbva-feature-card-tracking-expired-template-description-made"),status:"completed made-card",statusDate:"",badgeStatus:"success",subtitle:this.t("bbva-feature-card-tracking-template-subtitle-made"),title:this.t("bbva-feature-card-tracking-template-title-made")},{id:3,value:"glomo-cc-tracking-delivery-card-in-progress-error",description:"",status:"error delivery-card",title:this.t("bbva-feature-card-tracking-template-title-delivery-card"),statusDate:"",badgeStatus:"error",subtitle:this.t("bbva-feature-card-tracking-expired-template-subtitle-delivery"),notificationIcon:F(),notificationType:"alert",notificationText:this.t("bbva-feature-card-tracking-expired-template-notification-delivery"),linkText:this.t("bbva-feature-card-tracking-template-link-text-sending")},{id:4,title:this.t("bbva-feature-card-tracking-template-title-sending"),status:"sending-card",value:"glomo-cc-tracking-card-delivered",description:"",statusDate:"",subtitle:this.t("bbva-feature-card-tracking-template-subtitle-pending"),badgeStatus:"neutral",linkText:this.t("bbva-feature-card-tracking-template-link-text-sending")}]}closeModalOTP(){this._isTrackingVisible&&this._showTracking(),this._isTrackingVisible||this._isCustomerAddressVisible||(this._isCustomerAddressVisible=!0)}closeModalTimerSuccess(){this._isTrackingVisible&&this.getCardDetailDeliveries(),this._isTrackingVisible||this._isCustomerAddressVisible||(this._isCustomerAddressVisible=!0)}getCardDetailDeliveries(){this._cardsDm.getCardDeliveries(this.cardId,{unmasked:!0,expand:"tracking"})}getCustomerAddress(e=!1){if(this.customerId){const t={};e&&(this._isCustomerAddressVisible=!1,t.unmasked=!0,t.expand=!0),this._customerDm.getCustomerAddresses(t)}}_setStatusList(e){const t=this._setFourStatusTemplate(),i=this._replaceStatusDatesInTemplate(e,t);return this._replaceTemplateKeyValues(e,i)}_handleDeliveriesTrackingResponse(e){let t=[];return 5===e.length?(t=this._handleDeliveryExpiredStatus(e),this._fireEvent("analytics-fire-fingerprint-tracking-tdc","card-tracking-error")):(t=this._setStatusList(e),this._fireEvent("analytics-fire-fingerprint-tracking-tdc","card-tracking-completed")),t}_handleDeliveryExpiredStatus(e){this._isDetailPending=!0,this._isErrorSending=!1;const t=e.slice(0,4),i=this._setDeliveryExpiredStatusTemplate();return i.forEach(((e,i)=>{i<3&&(e.date=this._newDate(t[i].statusDate))})),i.splice(t.length),this._replaceDeliveryExpiredStatusTemplateKeyValues(e,i)}_replaceDeliveryExpiredStatusTemplateKeyValues(e,t){const i=this._keysForTemplate,a=this._setCardAndDateValues(e);return this._replaceKeysForValuesOnTemplate(a,i,t).map((e=>({title:e.title,value:e.value,date:e.date,content:e.description,subtitle:e.subtitle,badgeStatus:e.badgeStatus,status:e.status,linkText:e.linkText,notificationIcon:e.notificationIcon,notificationType:e.notificationType,notificationText:e.notificationText})))}_replaceStatusDatesInTemplate(e,t){return t.forEach(((t,i)=>{const a=t;e[i]?(a.statusDate=e[i].statusDate||"",a.date=this._formatDate(e[i].statusDate,"MMMM DD, YYYY"),a.status=`completed ${a.status}`,a.badgeStatus=3===e.length&&2===i?"pending":"success",a.subtitle=4===e.length&&2===i?this.t("bbva-feature-card-tracking-template-subtitle-made-option"):a.subtitle):(this._isDetailPending=!0,a.status=`default ${a.status}`,a.description="",a.subtitle=1===e.length&&1===i?this.t("bbva-feature-card-tracking-template-subtitle-in-process"):this.t("bbva-feature-card-tracking-template-subtitle-pending"),a.badgeStatus=1===i?"pending":"neutral")})),t}_replaceTemplateKeyValues(e,t){const i=this._keysForTemplate,a=this._setCardAndDateValues(e);if(a.length!==i.length)return this.loading=!0,[];const r=this._replaceKeysForValuesOnTemplate(a,i,t);return this._mapFinalStatusList(r)}_setCardAndDateValues(e){const t=[];return e.length&&e[0]&&e[0].statusDate&&(t.push(7),t.push(this.cardName),t.push(this.cardNumber.slice(-4)),t.push(e[0].statusDate?this._getDeadlineForCardDelivery(e[0].statusDate):this.t("bbva-feature-card-tracking-template-date-established"))),t}_getDeadlineForCardDelivery(e){let t=this.t("bbva-feature-card-tracking-template-date-established");return""===e||Number.isNaN(new Date(e))||(t=this._getNewDateWithAddDays(e)),t}_getNewDateWithAddDays(e){const t=this._newDate(e);let i=new Date(t.setDate(t.getDate()+9));const a=i.getDay();0!==a&&6!==a||(i=new Date(t.setDate(t.getDate()+2)));const r=this._formatDate(i,"YYYY-MMMM-DD","es").split("-");let s=this.t("bbva-feature-card-tracking-estimated-date");return this._keysForDate.forEach(((e,t)=>{s=s.replace(e,r[t])})),s}_newDate(e,t="YYYY-MM-DD"){return new Date(this._formatDate(e,t))}_formatDate(e,t,i="en"){return moment(e).locale(i).format(t)}_replaceKeysForValuesOnTemplate(e,t,i){return i.forEach((i=>{const a=i;t.forEach(((t,i)=>{a.description.includes(`[${t}]`)&&(a.description=a.description.split(`[${t}]`).join(e[i]))}))})),i}_mapFinalStatusList(e){return e.map((e=>({title:e.title,value:e.value,date:e.date,content:e.description,subtitle:e.subtitle,badgeStatus:e.badgeStatus,status:e.status,linkText:e.linkText})))}_progressStepClick({detail:e}){const{value:t}=e;"glomo-cc-tracking-card-delivered"===t&&(this._isTrackingVisible=!1,this.requiredOTPCustomer=!0,this._isCustomerAddressVisible=!0),"glomo-cc-tracking-delivery-card-in-progress-error"===t&&(this._isErrorSending=!0)}_showTracking(){this._isErrorSending&&this._steep.length>0&&this._fireEvent("analytics-fire-fingerprint-tracking-tdc","card-tracking-error"),!this._isErrorSending&&this._steep.length>0&&this._fireEvent("analytics-fire-fingerprint-tracking-tdc","card-tracking-completed"),this._isTrackingVisible=!0,this.requiredOTPCustomer=!1,this._isCustomerAddressVisible=!1,this._isErrorSending=!1}_goBack(){this.loading=!0,this._steep=[],this._fireEvent("go-back-credit-card")}_setInfoReceivedCardDebit(e){var t,i,a,r,s,n,o;e&&null!=e&&null!==(t=e.receiver)&&void 0!==t&&t.fullName&&(this._receiver=this._capitalize(null==e||null===(i=e.receiver)||void 0===i?void 0:i.fullName),null!=e&&null!==(a=e.receiver)&&void 0!==a&&a.receiverType&&null!=e&&null!==(r=e.receiver)&&void 0!==r&&null!==(s=r.receiverType)&&void 0!==s&&s.description&&(this._receiverType=this._capitalize(null===(n=e.receiver)||void 0===n||null===(o=n.receiverType)||void 0===o?void 0:o.description)))}_capitalize(e){let t=e.toLowerCase();return t=t.replace(/\b\w/g,(e=>e.toUpperCase())),t}reset(){this._isCustomerAddressVisible=!1,this._titleComplete="",this._isDetailPending=!1,this._isErrorSending=!1,this._loadComponentes=!0,this._isErrorServiceCards=!1,this._isErrorServiceCustomer=!1,this._attemptCounter=0,this._steep=[],this.loading=!0,this._receiver="",this._receiverType=""}setDataPrefix(e){const{id:t,product:i,number:a}=e;this.cardId=t,this.cardName=i.name,this.cardNumber=a}_fireEvent(e="",t={}){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}_replaceChars(e,t="*"){return e.replaceAll(t,"")}_handleSuccessDeliveries({detail:e}){this._isTrackingVisible=!0;const t=e||[];if(t.length){const e=t[0],{tracking:i}=e,{deliveryStatus:a}=i;if(a.length>0){this._setInfoReceivedCardDebit(e);const t=this._handleDeliveriesTrackingResponse(a);t.length>0&&(this._isErrorServiceCards=!1,this._steep=t,this.getCustomerAddress())}}}_handleErrorDeliveries(e){"invalidCredentials"===e.detail.messages[0].code?this._fireEvent("signature-invalid-dm",{errorType:"signature-invalid",mandatorySignType:void 0,otpId:"creditCardTrackingErrorHandler"}):(this._isTrackingVisible=!0,this._isErrorServiceCards=!0)}_handleSuccessAddressCustomer({detail:e}){this._isErrorServiceCustomer=!1;const t=e[0],i=this._replaceChars(t.location.state.name),a=t.location.state.id,r=this._replaceChars(t.location.country.name),s=this._replaceChars(t.location.zipCode),n=this._replaceChars(t.location.addressName);this._titlepending=`${a}, ${r}`,""!==n&&(this._titleComplete=`${n} ${i} ${r}, ${s}`,this._isCustomerAddressVisible=!0)}_handleErrorAddressCustomer(){this._isCustomerAddressVisible||this._isTrackingVisible?this._isErrorServiceCustomer=!0:this._isCustomerAddressVisible=!0}_fireCallBackService(){this._attemptCounter+=1,this._isErrorServiceCards&&this.getCardDetailDeliveries(),this._isErrorServiceCustomer&&this.getCustomerAddress()}_retryToBack(){this._attemptCounter=0,this._isErrorServiceCards&&this._goBack(),this._isErrorServiceCustomer&&this._showTracking()}_bbvaHelpModalFooterClick(){this._attemptCounter>2?this._retryToBack():this._fireCallBackService()}_bbvaHelpModalLinkClick(){this._attemptCounter<3&&this._retryToBack()}_makeTemplateBbvaHelpModal(){return g`
      <bbva-help-modal
        modal-type="warning"
        visible
        .closeModalElements="${[]}"
        title-icon="${F()}"
        title-text="${this.t("bbva-feature-card-tracking-modal-button-cancel")}"
        body-text="${this.t("bbva-feature-card-tracking-modal-button-text")}"
        button-text="${this._attemptCounter>2?this.t("bbva-feature-card-tracking-modal-link-cancel"):this.t("bbva-feature-card-tracking-modal-button-retry")}"
        @help-modal-footer-button-click="${()=>{this._bbvaHelpModalFooterClick()}}"
        link-text="${this._attemptCounter>2?"":this.t("bbva-feature-card-tracking-modal-link-cancel")}"
        @help-modal-footer-link-click="${()=>{this._bbvaHelpModalLinkClick()}}">
      </bbva-help-modal>
  `}_getDataProviderCustomers(){return g`
      <bbva-dataprovider-customers
        id="customersDm"
        host="${this.host}"
        ?native="${this.native}"
        version="${this.versionCustomersAddresses}"
        .customerId="${this.customerId}"
        .requiredToken="${this.requiredToken}"
        ?requiredOTP="${this.requiredOTPCustomer}"
        @set-customer-addresses="${this._handleSuccessAddressCustomer}"
        @error-on-get-customer-addresses="${this._handleErrorAddressCustomer}"
        @api-dm-error=${this._handleErrorAddressCustomer}>
      </bbva-dataprovider-customers>`}_getDataProviderCardsDM(){return g`
      <bbva-dataprovider-cards
        id="bbvaDataProviderCards"
        .host="${this.host}"
        .version="${this.versionCards}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        ?requiredOTP="${!0}"
        @card-deliveries-api-dm-fetch=${this._handleSuccessDeliveries}
        @card-deliveries-api-dm-fetch-error=${this._handleErrorDeliveries}
        @api-dm-error=${this._handleErrorDeliveries}>
      </bbva-dataprovider-cards>
    `}render(){return g`
      ${this._getDataProviderCardsDM()}
      ${this._getDataProviderCustomers()}
      ${this._isErrorServiceCards||this._isErrorServiceCustomer&&this._isCustomerAddressVisible?g`
          ${this._makeTemplateBbvaHelpModal()}
        `:g`
          <bbva-transition-container id="tracking-tdc" ?visible=${this._isTrackingVisible}>
            <div slot="slot-content">
              <tracking-tdc
                id="pageTrackingTDC"
                ?loading="${this.loading}"
                .steps="${this._steep}"
                ?native="${this.native}"
                .cardNumber=${this.cardNumber.slice(-4)}
                @progress-step-event="${({detail:e})=>{this._progressStepClick(e)}}"
                @goBack="${()=>{this._goBack()}}"
              ></tracking-tdc>
            </div>
          </bbva-transition-container>
          <bbva-transition-container  id="more-detail" ?visible=${this._isCustomerAddressVisible}>
            <div slot="slot-content">
              <detail-tdc
                ?isDetailPending="${this._isDetailPending}"
                .titlepending="${this._titlepending}"
                .titleComplete="${this._titleComplete}"
                .titleReceive="${this._receiver}"
                .titlereceiverType="${this._receiverType}"
                .phoneNumberBbvaLine=${this.phoneNumberBbvaLine}
                .iOSFixedHeader=${this.iOSFixedHeader}
                @detail-showFullAddress="${e=>{this.getCustomerAddress(e.detail)}}"
                @click-header-return="${()=>{this._showTracking()}}"
                ></detail-tdc>
            </div>
          </bbva-transition-container>
          <bbva-transition-container  id="error-detail" ?visible=${this._isErrorSending}>
            <div slot="slot-content">
              <error-sending
                id="PageErrorSending"
                .phoneNumberBbvaLine="${this.phoneNumberBbvaLine}"
                @goTracking="${()=>{this._showTracking()}}"
                ></error-sending>
            </div>
          </bbva-transition-container>
        `}
    `}}class de extends ce{static get is(){return"bbva-feature-card-tracking-mx"}static get properties(){return{}}}customElements.define(de.is,de);
