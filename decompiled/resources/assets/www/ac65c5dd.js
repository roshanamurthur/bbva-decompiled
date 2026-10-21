import{z as t,ar as e,a8 as i,a9 as a,b0 as n,au as s,bd as r,ab as o,aa as l,ap as c,as as d,at as p,aJ as u,a as m,an as b,L as h,bx as v,ak as g,h as f,V as y,av as k,i as $,aw as x,b6 as S,S as _,ag as C,af as P,cl as w,bv as T,aV as I,aO as A,aS as M,aD as L,ah as D,ai as E,b1 as q,bH as V,bF as z,dA as B,dB as F,b4 as N,b5 as j,bI as R,cD as O,bU as H,cM as Y}from"./952f98a9.js";import{br as G,ao as W,aL as Z,a$ as U}from"./7f3d7ca9.js";import{B as J}from"./c0bd2b53.js";import"./111ad2c6.js";import{O as X}from"./f891897b.js";import"./de3f0801.js";import"./90ffd92f.js";import"./e9f2144a.js";import"./216055dc.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./77df3611.js";import"./be12d7a2.js";import"./72e6e777.js";customElements.define(J.is,J);var K=t`[ambient^=light] {
  --bbva-list-simple-label-color: initial;
  --bbva-list-simple-mask-color: initial;
  --bbva-list-simple-description-color: initial;
  --bbva-list-simple-icon-color: initial;
  --bbva-list-simple-active-bg-color: initial;
  --bbva-list-simple-active-link-color: initial;
  --bbva-list-simple-link-color: initial;
  --bbva-list-simple-link-active-color: initial;
  --bbva-list-simple-skeleton-color: initial;
  --bbva-list-simple-skeleton-bg: initial;
  --bbva-list-simple-stacked-label-color: initial;
}
${(new e).mediaRules()}`;const Q=new e;var tt=t`[ambient^=dark] {
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${i(a.primaryCoreLightened)});
  --bbva-list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${i(a.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${i(a.primaryCoreLightened)});
  --bbva-list-simple-icon-color: var(--colorsPrimaryCoreLightened, ${i(a.primaryCoreLightened)});
  --bbva-list-simple-active-bg-color: token("foundations.colors.primaryCoreDark");
  --bbva-list-simple-active-link-color: var(--colorsPrimarySubduedLight, ${i(a.primarySubduedLight)});
  --bbva-list-simple-link-color: var(--colorsPrimaryCoreLightened, ${i(a.primaryCoreLightened)});
  --bbva-list-simple-link-active-color: var(--colorsPrimarySubduedLight, ${i(a.primarySubduedLight)});
  --bbva-list-simple-skeleton-color: var(--colorsPrimaryMedium, ${i(a.primaryMedium)});
  --bbva-list-simple-stacked-label-color: var(--colorsPrimaryCoreLightened, ${i(a.primaryCoreLightened)});
}
${Q.mediaRules()}`;const et={dark:t`
    ${n.dark}
    ${s.dark}
    ${r.dark}
    ${tt}
  `,light:t`
    ${n.light}
    ${s.light}
    ${r.light}
    ${K}
  `},it=new e;var at=t`:host {
  --_list-simple-text-color: var(--bbva-list-simple-dark-mode-text-color,var(--bbva-list-simple-text-color, var(--colorsSecondary600, ${i(a.secondary600)})));
  --_list-simple-mask-color: var(--bbva-list-simple-dark-mode-mask-color,var(--bbva-list-simple-mask-color, var(--colorsSecondary600, ${i(a.secondary600)})));
  --_list-simple-label-color: var(--bbva-list-simple-dark-mode-label-color,var(--bbva-list-simple-label-color, var(--colorsSecondary600, ${i(a.secondary600)})));
  --_list-simple-description-color: var(--bbva-list-simple-dark-mode-description-color,var(--bbva-list-simple-description-color, var(--colorsSecondary600, ${i(a.secondary600)})));
  --_list-simple-active-bg-color: var(--bbva-list-simple-dark-mode-active-bg-color,var(--bbva-list-simple-active-bg-color, var(--colorsSecondary100, ${i(a.secondary100)})));
  --_list-simple-stacked-label-color: var(--bbva-list-simple-dark-mode-stacked-label-color,var(--bbva-list-simple-stacked-label-color, var(--colorsSecondary500, ${i(a.secondary500)})));
  --_list-simple-link-color: var(--bbva-list-simple-dark-mode-link-color,var(--bbva-list-simple-link-color, var(--colorsPrimaryMedium, ${i(a.primaryMedium)})));
  --_list-simple-link-active-color: var(--bbva-list-simple-dark-mode-link-active-color,var(--bbva-list-simple-link-active-color, var(--colorsPrimaryCoreDark, ${i(a.primaryCoreDark)})));
  --_list-simple-icon-color: var(--bbva-list-simple-dark-mode-icon-color,var(--bbva-list-simple-icon-color, var(--colorsPrimaryMedium, ${i(a.primaryMedium)})));
  --_list-simple-icon-active-color: var(--bbva-list-simple-dark-mode-icon-active-color,var(--bbva-list-simple-icon-active-color, var(--colorsPrimaryCoreDark, ${i(a.primaryCoreDark)})));
  --_list-simple-skeleton-quote-color: var(--bbva-list-simple-dark-mode-skeleton-color,var(--bbva-list-simple-skeleton-color, var(--colorsSecondary200, ${i(a.secondary200)})));
  --_list-simple-skeleton-quote-bg: var(--bbva-list-simple-dark-mode-skeleton-bg,var(--bbva-list-simple-skeleton-bg, transparent));
  display: block;
  box-sizing: border-box;
  position: relative;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1rem);
  min-height: var(--bbva-list-simple-min-height, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1rem));
  color: var(--_list-simple-text-color);
  user-select: none;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

.ellipsis {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

.wrapper-description,
.wrapper-description [data-tag-name=bbva-text] {
  text-align: right;
}

dl,
dd {
  margin: 0;
}

dl {
  display: flex;
  justify-content: space-between;
}

dt,
dd {
  display: flex;
  overflow: hidden;
}

dt {
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-link] {
  text-align: left;
  color: var(--_list-simple-link-color);
}
[data-tag-name=bbva-link]:active {
  --_list-simple-link-color: var(--_list-simple-link-active-color);
}

.action-icons {
  display: flex;
}

button {
  height: 1.5rem;
  width: 1.5rem;
  border: none;
  padding: 0;
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1rem);
  background-color: transparent;
  color: var(--_list-simple-icon-color);
}
button:active {
  --_list-simple-icon-color: var(--_list-simple-icon-active-color);
}

.wrapper-mask {
  color: var(--_list-simple-mask-color);
}

.label {
  color: var(--_list-simple-label-color);
}

.description {
  color: var(--_list-simple-description-color);
}

.wrapper-amount {
  overflow: initial;
}

:host([label-medium]) [data-tag-name=bbva-text].label,
:host([description-medium]) [data-tag-name=bbva-text].description,
:host([description-medium]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${i(o.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${i(o.medium.fontStyle)});
}

:host([description-italic]) [data-tag-name=bbva-text].description,
:host([description-italic]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${i(o.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${i(o.bookItalic.fontStyle)});
}

:host([description-medium][description-italic]) [data-tag-name=bbva-text].description,
:host([description-medium][description-italic]) [data-tag-name=bbva-amount],
:host([description-date]) [data-tag-name=bbva-text].description {
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${i(o.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${i(o.mediumItalic.fontStyle)});
}

:host([disabled]) [data-tag-name=bbva-link][disabled] {
  opacity: 1;
}

.skeleton {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  pointer-events: none;
  transition: opacity 0.4s ease-in-out;
  background-repeat: no-repeat;
  opacity: 0;
  background-image: linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%);
  background-color: var(--_list-simple-skeleton-quote-bg);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 24px 12px, 305% 12px;
}
:host([variant=stacked]) .skeleton {
  background-image: linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%);
  background-color: var(--_list-simple-skeleton-quote-bg);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 24px 12px, 24px 36px;
}
:host([variant=stacked-center]) .skeleton {
  background-image: linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%);
  background-color: var(--_list-simple-skeleton-quote-bg);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 90% 12px, 160% 36px;
}

:host([variant=stacked]) .wrapper {
  display: flex;
  align-items: center;
  justify-content: space-between;
}
:host([variant=stacked]) dl {
  flex-direction: column;
}
:host([variant=stacked]) .wrapper-description,
:host([variant=stacked]) .wrapper-description [data-tag-name=bbva-text] {
  text-align: left;
}

[data-tag-name=bbva-link]:not([href])[active]:not([disabled]) {
  background-color: transparent;
}

:host([action-link]:active),
:host([description-link]:active),
:host([label-link]:active) {
  background-color: var(--_list-simple-active-bg-color);
}

:host([hide-padding-top]) {
  padding-top: 0;
}

:host([hide-padding-bottom]) {
  padding-bottom: 0;
}

:host([variant=stacked-center]) .wrapper {
  display: flex;
  align-items: center;
  justify-content: center;
}
:host([variant=stacked-center]) .wrapper [data-tag-name="bbva-link,"] [data-tag-name=bbva-text],
:host([variant=stacked-center]) .wrapper-description {
  text-align: center;
}
:host([variant=stacked-center]) dl {
  flex-direction: column;
  margin: auto;
}
:host([variant=stacked-center]) dt,
:host([variant=stacked-center]) dd {
  padding: 0;
  margin: auto;
}
:host([variant=stacked-center]) .action-icons {
  position: absolute;
  right: 1rem;
}

:host([loading]) {
  pointer-events: none;
}
:host([loading]) * {
  opacity: 0;
}
:host([loading]) .skeleton {
  opacity: 1;
}

:host([variant^=stacked]) .label {
  color: var(--_list-simple-stacked-label-color);
}

:host([variant=stacked-center][action-icon]) dl,
:host([variant=stacked-center][action-secondary-icon]) dl {
  padding: 0 calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1rem);
}

:host([variant=stacked-center][action-icon][action-secondary-icon]) dl {
  padding: 0 calc(((8 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1rem);
}
${it.mediaRules()}`;class nt extends(c(d(p(u(m(b(h))))))){static get is(){return"bbva-list-simple"}static get scopedElements(){const t=[x,S,_,C,P];return nt.scopedElementsFromClasses(t)}static get properties(){return{label:{type:String},labelLink:{type:Boolean,attribute:"label-link"},labelEllipsis:{type:Boolean,attribute:"label-ellipsis"},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},description:{type:String},descriptionLink:{type:Boolean,attribute:"description-link"},descriptionMedium:{type:Boolean,attribute:"description-medium",reflect:!0},descriptionDate:{type:Boolean,attribute:"description-date",reflect:!0},descriptionItalic:{type:Boolean,attribute:"description-italic"},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},actionIcon:{type:String,attribute:"action-icon",reflect:!0},actionSecondaryIcon:{type:String,attribute:"action-secondary-icon",reflect:!0},actionAccessibilityText:{type:String,attribute:"action-accessibility-text"},actionSecondaryAccessibilityText:{type:String,attribute:"action-secondary-accessibility-text"},actionLink:{type:String,attribute:"action-link"},actionLinkEllipsis:{type:Boolean,attribute:"action-link-ellipsis"},status:{type:String},color:{type:String},statusAccessibilityText:{type:String,attribute:"status-accessibility-text"},mask:{type:String},loading:{type:Boolean,reflect:!0},disableLink:{type:Boolean},variant:{type:String,reflect:!0},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},maskChars:{type:String,attribute:"mask-chars"},visibleChars:{type:Number,attribute:"visible-chars"},labelAccessibilityText:{type:String,attribute:"label-accessibility-text"},descriptionAccessibilityText:{type:String,attribute:"description-accessibility-text"},rolelink:{type:String,attribute:"role-link"},arialiveLink:{type:String,attribute:"aria-live-link"},labelTagText:{type:String,attribute:"label-tag-text"},descriptionTagText:{type:String,attribute:"description-tag-text"},labelRoleText:{type:String,attribute:"label-role-text"},descriptionRoleText:{type:String,attribute:"description-role-text"},labelAriaLiveText:{type:String,attribute:"label-aria-live-text"},descriptionAriaLiveText:{type:String,attribute:"description-aria-live-text"}}}constructor(){super(),this.stackedCenter=!1,this.labelMedium=!1,this.labelLink=!1,this.descriptionLink=!1,this.descriptionMedium=!1,this.descriptionDate=!1,this.descriptionItalic=!1,this.labelEllipsis=!1,this.descriptionEllipsis=!1,this.actionLinkEllipsis=!1,this.loading=!1,this.disableLink=!1,this.actionLink="",this.description="",this.status="",this.color="",this.variant="",this.hidePaddingTop=!1,this.hidePaddingBottom=!1,this.decimalsHidden=!1,this.statusAccessibilityText="bbva-list-simple-status-accessibility-text",this.actionAccessibilityText="bbva-list-simple-action-accessibility-text",this.actionSecondaryAccessibilityText="bbva-list-simple-secondary-action-accessibility-text",this.labelAccessibilityText="bbva-list-simple-label-accessibility-text",this.descriptionAccessibilityText="bbva-list-simple-description-accessibility-text",this.maskChars="••••",this.visibleChars=0}static get styles(){return[super.styles,at,et.light,et.dark,v("button:focus"),g("bbva-list-simple-shared-styles")]}get _isValidAmount(){return this.amount||0===this.amount}get _amount(){return f`
      <bbva-amount
        ?decimals-hidden="${this.decimalsHidden}"
        variant="m"
        .amount="${this.amount}"
        .localCurrency="${this.localCurrency}"
        .currencyCode="${this.currencyCode}"
        .language="${this.language}"
        ?symbol-right="${this.symbolRight}"
      >
      </bbva-amount>
    `}get _icon(){return f`
      <button @click="${()=>this._iconClick("icon")}">
        <span class="sr-only">${this.t(this.actionAccessibilityText)}</span>
        <bbva-core-icon icon="${this.actionIcon}" size="24" aria-hidden="true"></bbva-core-icon>
      </button>
    `}get _secondaryIcon(){return f`
      <button @click="${()=>this._iconClick("secondary-icon")}">
        <span class="sr-only">${this.t(this.actionSecondaryAccessibilityText)}</span>
        <bbva-core-icon
          icon="${this.actionSecondaryIcon}"
          size="24"
          aria-hidden="true"
        ></bbva-core-icon>
      </button>
    `}get _actionIcons(){return f`
      <div class="action-icons">
        ${this.actionIcon?this._icon:""} ${this.actionSecondaryIcon?this._secondaryIcon:""}
      </div>
    `}get _badgeVariability(){const t="nochange"===this.status?"no-change":this.status;return f`
      <span class="sr-only">${this.t(this.statusAccessibilityText)}</span>
      <bbva-badge-variability .status=${t} .color=${this.color}></bbva-badge-variability>
    `}get _mask(){const t=y(this.mask,this.maskChars,!0,this.visibleChars);return f`
      <div>
        <span class="mask">${this.maskChars}</span>
        <span class="number">${t.substr(this.maskChars.length)}</span>
      </div>
    `}get _actions(){let t=null;return this.actionIcon||this.actionSecondaryIcon?t=this._actionIcons:this.actionLink&&(t=this._tplLink("actionLink")),t}get _definitionDescriptionTpl(){let t=null,e="";return this.description?(t=this._tplText("description"),e="description"):this.mask?(t=this._mask,e="mask"):this._isValidAmount&&(t=this._amount,e="amount"),f`
      <dd class="wrapper-${e}">
        ${this.status?this._badgeVariability:""} ${t}
      </dd>
    `}_tplLink(t){return f`
      <bbva-link
        class=${k({ellipsis:this[`${t}Ellipsis`]})}
        ?disabled=${this.disabled||this.disableLink}
        @click="${()=>this._linkClick(t)}"
      >
        <span role=${$(this.roleLink)} aria-live=${$(this.arialiveLink)}>
          ${this[t]}
        </span>
      </bbva-link>
    `}_tplNoLink(t){const e=`${t}AccessibilityText`,i=`${t}TagText`,a=`${t}RoleText`,n=`${t}AriaLiveText`;return f`
      <bbva-text
        aria-label="${this.t(this[e])}"
        role=${$(this[a])}
        aria-live=${$(this[n])}
        class="${t}"
        unset
        size="S"
        text="${this[t]}"
        tag=${$(this[i])}
      >
      </bbva-text>
    `}_tplText(t){return f` ${this[`${t}Link`]?this._tplLink(t):this._tplNoLink(t)} `}_iconClick(t){this.dispatchEvent(new CustomEvent(`list-simple-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}_linkClick(t){const e=t.replace(/[A-Z]/g,(t=>`-${t.toLowerCase()}`));this.dispatchEvent(new CustomEvent(`list-simple-link-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}renderDefault(){return f`
      <dl>
        <dt>${this._tplText("label")} ${this.actionIcon?this._actionIcons:""}</dt>
        ${this._definitionDescriptionTpl}
      </dl>
    `}renderStacked(){return f`
      <div class="wrapper">
        ${this.description||this._isValidAmount||this.mask?f`
              <dl>
                <dt>${this._tplText("label")}</dt>
                ${this._definitionDescriptionTpl}
              </dl>
            `:this._tplText("label")}
        ${this._actions}
      </div>
    `}render(){let t=null;const e=["stacked","stacked-center"].includes(this.variant);return t=this.label?this.description||this._isValidAmount||this.mask||e?e?this.renderStacked():this.renderDefault():this._tplText("label"):f` <div class="wrapper-description">${this._tplText("description")}</div> `,f`
      ${t}
      <div class="skeleton"></div>
    `}}customElements.define(nt.is,nt);var st=t`:host {
  --_gradient-color: var(--bbva-core-spinner-gradient-color, #2DCCCD); /* foundations primaryVariant */
  --_bg-color: var(--bbva-core-spinner-bg-color, #004481); /* foundations primaryCore */
  --_outline-color: var(--bbva-core-spinner-outline-color, #f2f2f2);
  --_bright-fill: var(--bbva-core-spinner-bright-fill, #fff);
  --_bright-mask-path-fill: var(--bbva-core-spinner-bright-mask-path-fill, #4afcfd);
  --_animation-duration: var(--bbva-core-spinner-animation-duration, 1.6s);

  box-sizing: border-box;
  pointer-events: none;
  display: flex;
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

figure {
  margin: var(--bbva-spinner-center, auto);
  width: var(--bbva-spinner-size, 3rem);
  height: var(--bbva-spinner-size, 3rem);
  position: relative;
}

svg {
  display: block;
}

/* Rotating wrapper */
.wrap {
  transform-origin: 12.5rem 12.5rem;
}

/* Background ellipse */
.bg {
  fill: var(--_bg-color);
}

/* Outline */
.outline {
  fill: none;
  opacity: .16;
  stroke: var(--_outline-color);
  stroke-width: 2px;
  transform: translate(.21875rem, .21875rem);
}

/* Gradient */
.gradient-path {
  opacity: 1;
  fill-opacity: .6;
  stroke-opacity: 1;
  transform: scale(1, .7);
}

.gr-stop-color {
  stop-color: var(--_gradient-color);
}

.gr-stop-bg-color {
  stop-color: var(--_bg-color);
}

/* White bright */
.bright {
  fill: var(--_bright-fill);
  stroke: none;
  mix-blend-mode: normal;
  transform: translate(12.5rem, 12.5rem) rotate(180deg);
}

.bright-mask {
  mask-type: luminance;
}

.bright-mask-path {
  fill: var(--_bright-mask-path-fill);
  stroke-linecap: square;
  stroke: none;
  transform: translate(-10.40625rem, 6.53125rem);
  mix-blend-mode: normal;
}

/* Outline shine */
.shine {
  fill: none;
  opacity: .8;
  stroke-width: 2px;
  transform: translate(.21875rem, .21875rem);
}

.shine-stop-color {
  stop-color: var(--_gradient-color);
}

/* Animations */
.anim {
  animation-duration: var(--_animation-duration);
  animation-timing-function: linear;
  animation-iteration-count: infinite;
  animation-fill-mode: both;
}

:host([paused]) .anim {
  animation-play-state: paused;
}

.rotation-anim {
  animation-name: rotation;
}

.gradient-anim {
  animation-name: gradientPulse;
}

.gradient-path-anim {
  animation-name: gradientDisplacement, gradientFillOpacity;
}

.gradient-path-offset-anim {
  animation-name: gradientFillOffset;
}

.bright-anim {
  animation-name: brightOpacity;
}

@keyframes rotation {
  0% {
    transform: rotate(0deg);
    animation-timing-function: cubic-bezier(0.75124, 0.00386, 0.25186, 1.00696);
  }
  100% {
    transform: rotate(359.99457deg);
  }
}

@keyframes gradientPulse {
  0% {
    transform: scale(1, .7);
    animation-timing-function: cubic-bezier(0.68442, 0, 0.58, 1);
  }
  50% {
    transform: scale(1.4, .8);
    animation-timing-function: cubic-bezier(0.42, 0, 0.30322, 1);
  }
  100% {
    transform: scale(1, .7);
    animation-timing-function: cubic-bezier(0.68442, 0, 0.58, 1);
  }
}

@keyframes gradientDisplacement {
  0% {
    transform: translate(0, 0);
    animation-timing-function: cubic-bezier(0.42, 0, 0.25, 1);
  }
  50% {
    transform: translate(-3.75rem, 0);
    animation-timing-function: cubic-bezier(0.74752, 0, 0.58, 1);
  }
  100% {
    transform: translate(0, 0);
  }
}

@keyframes gradientFillOpacity {
  0% {
    fill-opacity: .6;
    animation-timing-function: cubic-bezier(0.42, 0, 0.58, 1);
  }
  50% {
    fill-opacity: .8;
    animation-timing-function: cubic-bezier(0.42, 0, 0.58, 1);
  }
  100% {
    fill-opacity: .6;
  }
}

@keyframes gradientFillOffset {
  0% {
    offset: .143991;
    animation-timing-function: steps(1);
  }
  50% {
    offset: .133991;
    animation-timing-function: steps(1);
  }
  100% {
    offset: .153991;
    animation-timing-function: steps(1);
  }
}

@keyframes brightOpacity {
  0% {
    opacity: .2;
    animation-timing-function: cubic-bezier(0.87624, 0, 0.62376, 1);
  }
  50% {
    opacity: .9;
    animation-timing-function: cubic-bezier(0.37376, 0, 0.12499, 1);
  }
  100% {
    opacity: .2;
    animation-timing-function: cubic-bezier(0.62005, 0, 0.38614, 1);
  }
}
`;const rt=!!window.MSInputMethodContext&&!!document.documentMode;class ot extends h{static get is(){return"bbva-core-spinner"}static get properties(){return{size:{type:Number},paused:{type:Boolean,reflect:!0},withMask:{type:Boolean,attribute:"with-mask",reflect:!0}}}constructor(){super(),this.paused=!1,this.withMask=!1,this._uniqueId=w(),this._isMsIE11=rt}get _computeClipPath(){return this.withMask?`url(#masked-clip-path_${this._uniqueId})`:""}get _computeSize(){return"number"==typeof this.size?`width: ${this.size}px; height: ${this.size}px;`:""}static get styles(){return[st,g("bbva-spinner-new-shared-styles")]}render(){return f`
      <figure class="${this._isMsIE11?"anim rotation-anim":""}" style="${this._computeSize}">
        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 400 400" id="${this._uniqueId}">
          ${this._svgDefs} ${this._svgNodes}
        </svg>
      </figure>
    `}get _svgDefs(){return T`
      <defs>
        ${this._svgMaskedDefs}
        ${this._svgGradientDefs}
        ${this._svgBrightDefs}
        ${this._svgShineDefs}
      </defs>
    `}get _svgNodes(){return T`
      <g class="anim wrap rotation-anim" clip-path="${this._computeClipPath}">
        ${this._svgBgNodes}
        ${this._svgOutlineNodes}
        ${this._svgGradientNodes}
        ${this._svgBrightNodes}
        ${this._svgShineNodes}
      </g>
    `}get _svgMaskedDefs(){return T`
      <clipPath id="masked-clip-path_${this._uniqueId}">
        <path
          d="M400,0L0,0L0,400L400,400ZM45.9596,200C45.9596,115.061,115.061,45.9596,200,45.9596C284.939,45.9596,354.04,115.061,354.04,200C354.04,284.939,284.939,354.04,200,354.04C115.061,354.04,45.9596,284.939,45.9596,200Z"
          fill-rule="evenodd"
        />
      </clipPath>
    `}get _svgBgNodes(){return T`
      <ellipse class="bg" rx="197.5" ry="197.5" cx="200" cy="200" />
    `}get _svgOutlineNodes(){return T`
      <path class="outline"
        d="M196.5,0C87.9723,0,0,87.9723,0,196.5C0,305.028,87.9723,393,196.5,393C305.028,393,393,305.028,393,196.5C393,87.9723,305.028,0,196.5,0Z"
      />
    `}get _svgGradientNodes(){return T`
      <g clip-path="url(#gradient-clip_${this._uniqueId})">
        <g class="anim gradient-anim">
          <path class="gradient-path anim gradient-path-anim"
            d="M400,0L400,400L0,400L0,0Z"
            fill="url(#gradient-path-fill_${this._uniqueId})"
            filter="url(#gradient-path-filter_${this._uniqueId})"
            fill-rule="nonzero"
          />
        </g>
      </g>
    `}get _svgGradientDefs(){return T`
      <clipPath id="gradient-clip_${this._uniqueId}">
        <ellipse rx="197.5" ry="197.5" cx="200" cy="200" fill="none" />
      </clipPath>

      <radialGradient id="gradient-path-fill_${this._uniqueId}"
        cx="199"
        cy="92"
        r="271.854"
        fx="197.801"
        fy="-27.9043"
        gradientUnits="userSpaceOnUse"
      >
        <stop class="gr-stop-color anim gradient-path-offset-anim" offset="0.143991" />
        <stop class="gr-stop-bg-color" offset="1" stop-opacity="0" />
      </radialGradient>

      <filter id="gradient-path-filter_${this._uniqueId}" color-interpolation-filters="sRGB">
        <feComponentTransfer>
          <feFuncR type="linear" slope="1.2" />
          <feFuncG type="linear" slope="1.2" />
          <feFuncB type="linear" slope="1.2" />
        </feComponentTransfer>
      </filter>
    `}get _svgBrightNodes(){return this._isMsIE11?"":T`
      <ellipse class="bright"
        rx="197.5"
        ry="197.5"
        fill-rule="evenodd"
        mask="url(#bright-mask_${this._uniqueId})"
      />
    `}get _svgBrightDefs(){return T`
      <mask id="bright-mask_${this._uniqueId}" class="bright-mask">
        <path
          class="bright-mask-path anim bright-anim"
          filter="url(#bright-mask-filter_${this._uniqueId})"
          d="M-0.66667,0C-0.66667,0,41,68,167,68C290.5,68,334,0,334,0C334,0,281.425,113,166.925,113C50.4255,113,-0.66667,0,-0.66667,0Z"
        />
      </mask>

      <filter id="bright-mask-filter_${this._uniqueId}">
        <feGaussianBlur stdDeviation="20" />
      </filter>
    `}get _svgShineNodes(){return T`
      <path class="shine"
        d="M196.5,0C87.9723,0,0,87.9723,0,196.5C0,305.028,87.9723,393,196.5,393C305.028,393,393,305.028,393,196.5C393,87.9723,305.028,0,196.5,0Z"
        stroke="url(#shine-stroke_${this._uniqueId})"
      />
    `}get _svgShineDefs(){return T`
      <radialGradient id="shine-stroke_${this._uniqueId}"
        cx="196.5"
        cy="0"
        r="100"
        fx="196.5"
        fy="0"
        gradientUnits="userSpaceOnUse"
      >
        <stop class="shine-stop-color" offset="0"/>
        <stop class="shine-stop-color" offset="1" stop-opacity="0" />
      </radialGradient>
    `}}class lt{constructor(t){this.controller=t}t(...t){return this.controller.t(...t)}_nextStep(t){null==t||t.target.dispatchEvent(new CustomEvent("complete",{bubbles:!0,composed:!0,cancelable:!0}))}}class ct extends lt{render(){const{cardData:t,localCurrency:e,currencyCode:i,visibleChars:a,cardImage:n,language:s}=this.controller;return this._existImg(t.cardImage),f`
        <bbva-expandable-step
        id="step-prefilled"
        header="${this.t("bbva-multistep-finance-transaction-multipurchase-card-header")}"
        prefilled=""
        view-label=""
        hide-padding-left
        hide-padding-right
        hide-padding-top
        hide-padding-bottom>
        <div slot="summary">
            <bbva-list-card
                amount="${t.amount}"
                accessibility-text="${t.cardName}"
                card-title="${t.cardName}"
                content-text="${this.t("bbva-multistep-finance-transaction-card-amount-description")}"
                num-product="${t.cardNumber}"
                card-image="${n}"
                ambient="dark"
                hide-top-padding
                visible-chars="${a}"
                local-currency="${e}"
                currency-code="${i}"
                language="${s}">
          </bbva-list-card>
        </div>
    </bbva-expandable-step>`}_existImg(t){t&&fetch(t).then((e=>{this.controller.cardImage=e.ok?t:this.controller.defaultImage}))}}const{moment:dt}=window;function pt(t,e="DD MMMM YYYY"){var i,a;return null===(i=dt(t))||void 0===i||null===(a=i.format(e))||void 0===a?void 0:a.replace(".","")}function ut(t,e,i,a){const n={style:"currency",currency:e,...t%1!=0||a?{minimumFractionDigits:2}:{minimumFractionDigits:0,maximumFractionDigits:0}};return new Intl.NumberFormat(i,n).format(t??0)}class mt extends lt{handleEvent(t){var e,i,a;const{tagName:n}=t.target.dataset,s="bbva-button-default"===n?"click-button":t.type,r={"bbva-list-option-input-change":()=>{this.managePurchaseSelection(t)},click:()=>{this.controller.shouldLoadMoreTransactions=!0,this.controller.dispatchLoadMoreTransactionLinkClick()},"expandable-step-edit-step":()=>{this.controller.shouldLoadMoreTransactions=!1,this.controller._isPaginating=!1,this.controller.loadPaginationError=!1},"click-button":()=>{this.controller.dispatchSelectedPurchases(),0===this.controller.stepCompleted&&(this.controller.stepCompleted=1),this._nextStep(t)},"notification-message-link-click":()=>{this.controller.errorPaginationConfig.allowRetry&&(this.controller._isPaginating=!0,this.controller.loadPaginationError=!1),this.controller.dispatchPaginationErrorLinkClick()}};null==r||null===(e=r[s])||void 0===e||null===(i=e.bind)||void 0===i||null===(a=i.call(e,this))||void 0===a||a()}_invalidPurchaseInfo(t){t?this.controller.dispatchInvalidAvailableAmount():this.controller.dispatchInvalidNumberPurchases()}managePurchaseSelection(t){const e=null==t?void 0:t.detail,i=this.controller.selectedTransactions.length,a=this.controller.transactions.find((t=>(null==t?void 0:t.id)===(null==e?void 0:e.value)));if(null!=e&&e.checked){var n,s;const t=function(t,e,i=2){const a=Math.pow(10,i);return(t.toFixed(i)*a+e.toFixed(i)*a)/a}(this.controller.totalAmount,null==a||null===(n=a.localAmount)||void 0===n?void 0:n.amount),e=this.controller.selectedTransactions.length<this.controller.maxSelectedPurchases,i=t<=(null===(s=this.controller.cardData)||void 0===s?void 0:s.amount);e&&i?(this.controller.dispatchSelectedPurchase(),this.controller.selectedTransactions.push(a),this.controller.totalAmount=t):(this._invalidPurchaseInfo(e),setTimeout((()=>{this.controller.shadowRoot.querySelector(`#movement-${a.id}`).checked=!1}),.1))}else{var r;this.controller.selectedTransactions=this.controller.selectedTransactions.filter((t=>(null==t?void 0:t.id)!==(null==e?void 0:e.value))),this.controller.totalAmount=function(t,e,i=2){const a=Math.pow(10,i);return(t.toFixed(i)*a-e.toFixed(i)*a)/a}(this.controller.totalAmount,null==a||null===(r=a.localAmount)||void 0===r?void 0:r.amount)}this.controller.enableSelectPurchasesContinue=this.controller.selectedTransactions.length>0,i!==this.controller.selectedTransactions.length&&(this.controller.stepCompleted=0,this.controller.resetTermsAndConditions(),this.controller.resetMonthsToDefer())}render(){return f`
    <bbva-expandable-step
      hide-padding-left
      hide-padding-right
      hide-padding-top
      id="step-1"
      class="animation first-step"
      @expandable-step-edit-step=${this}
      header="${this.t("bbva-multistep-finance-transaction-multipurchase-select-purchases-header")}"
      edit-label="${this.t("bbva-multistep-finance-transaction-multipurchase-edit-label")}">
      <div class="content">
        ${this._renderStepSelectPurchasesContent}
      </div>
      <div slot="summary" class="summary">
        ${this._renderStepSelectPurchasesSummary}
      </div>
    </bbva-expandable-step>
  `}_shouldShowMoreTransactionLink(){return this.controller.transactions.length>this.controller.firstSightPurchases&&!this.controller.shouldLoadMoreTransactions}get _renderStepSelectPurchasesContent(){const t=this._shouldShowMoreTransactionLink(),{_isPaginating:e,shouldLoadMoreTransactions:i}=this.controller;return this.controller.shouldShowPaginationLoader=e&&i,f`
      <bbva-text class="description-text" tag="span" text="${this.t("bbva-multistep-finance-transaction-multipurchase-select-purchases-description",this._amountSelectPurchaseDescriptionInterpolation)}" size="S"></bbva-text>
      <bbva-header-category
          class="description-subtitle"
          has-help option-icon="bbva:next"
          link-accessibility-text="${this.t("bbva-multistep-finance-transaction-multipurchase-available-purchases-header")}"
          text="${this.t("bbva-multistep-finance-transaction-multipurchase-available-purchases-header")}"></bbva-header-category>
      <bbva-notification-message class="description-message" message="${this.t("bbva-multistep-finance-transaction-multipurchase-select-purchases-info-message")}"></bbva-notification-message>
      <div>
        ${this._renderTransactions}
      </div>
      <bbva-core-spinner ?hidden=${!this.controller.shouldShowPaginationLoader} with-mask=""></bbva-core-spinner>
      <div ?hidden=${!t} @click=${this} class="more-transactions-link"><bbva-link
          aria-label="${this.t("bbva-multistep-finance-transaction-multipurchase-select-purchases-show-more")}"
          @click=${this}>${this.t("bbva-multistep-finance-transaction-multipurchase-select-purchases-show-more")}</bbva-link>
      </div>
      ${this._renderPagination}
      ${this._renderPanel}
    `}get _renderStepSelectPurchasesSummary(){const{totalAmount:t,currencyCode:e,localCurrency:i,language:a}=this.controller;return f`
      <bbva-text ambient="dark" tag="span" text="${this.t("bbva-multistep-finance-transaction-multipurchase-select-purchases-total-amount-summary-label")}" size="S"></bbva-text>
      <bbva-amount variant="4xl" ambient="dark" amount="${t}" currency-code="${e}" local-currency="${i}" language="${a}"></bbva-amount>
    `}_renderTransactionHeader(t){const e=null==t?void 0:t.operationDate;return f`
      <bbva-header-category
        class="date"
        variant="date"
        link-accessibility-text="${pt(e)}"
        text="${pt(e)}"
      ></bbva-header-category>
    `}_renderTransaction(t){var e,i,a,n;const s=this.controller.selectedTransactions.find((e=>(null==e?void 0:e.id)===t.id));return f`
      <bbva-list-option
        id="movement-${t.id}"
        ?checked=${s}
        @bbva-list-option-input-change=${this}
        value="${t.id}"
        title-amount="${null===(e=t.localAmount)||void 0===e?void 0:e.amount}"
        content-title="${t.concept}"
        language="${null===(i=this.controller)||void 0===i?void 0:i.language}"
        currency-code="${null===(a=this.controller)||void 0===a?void 0:a.currencyCode}"
        local-currency="${null===(n=this.controller)||void 0===n?void 0:n.localCurrency}">
      </bbva-list-option>
    `}get _renderTransactions(){const t=this._shouldShowMoreTransactionLink()?this.controller.transactions.slice(0,this.controller.firstSightPurchases):this.controller.transactions;let e=-1;const i=t.reduce(((i,a,n)=>{var s;const r=(o=null==a?void 0:a.operationDate,l=(null==t||null===(s=t[n-1])||void 0===s?void 0:s.operationDate)||"",dt(o).isSame(dt(l),"day"));var o,l;const c=[...i];return r||(e+=1,null!=i&&i[e]||(c[e]={renderItems:[]}),c[e].renderItems.push(this._renderTransactionHeader(a))),c[e].renderItems.push(this._renderTransaction(a)),c}),[]);return[null==i?void 0:i.reduce(((t,e)=>(t.push(f`
          <div class="description-item-list">
            ${null==e?void 0:e.renderItems}
          </div>
        `),t)),[])]}get _renderPagination(){const{_isPaginating:t,loadPaginationError:e,errorPaginationConfig:i,shouldLoadMoreTransactions:a}=this.controller;return f`<bbva-notification-message
                  id="errorInfo"
                  class="description-message"
                  variant="error"
                  ?hidden=${!(e&&a&&!(t&&a))}
                  link-title="${this.t(null==i?void 0:i.link)}" 
                  message="${this.t(null==i?void 0:i.message)}"
                  @notification-message-link-click=${this}>
                </bbva-notification-message>`}get _amountSelectPurchaseDescriptionInterpolation(){const{minimumAmountOfPurchase:t,localCurrency:e,language:i}=this.controller;return{amount:ut(null==t?void 0:t.amount,(null==t?void 0:t.currency)??e,i)}}get _renderPanel(){const{totalAmount:t,currencyCode:e,localCurrency:i,language:a}=this.controller;return f`
      <bbva-panel-button-fixed 
        id="panel-step-1"
        show
        sticky
        label="${this.t("bbva-multistep-finance-transaction-multipurchase-select-purchases-total-amount-summary-label")}" 
        amount="${t}" 
        currency-code="${e}"
        local-currency="${i}"
        language="${a}">
      </bbva-panel-button-fixed>
      <div id="panel-button-1" class="panel-button">
        <bbva-button-default
          variant="primary" 
          ?disabled=${!this.controller.enableSelectPurchasesContinue}
          @click=${this} >${this.t("bbva-multistep-finance-transaction-multipurchase-select-purchases-total-amount-summary-button")}</bbva-button-default>
      </div>
    `}}class bt extends lt{render(){var t,e,i,a,n,s,r,o,l,c,d,p,u,m,b,h,v,g,y;return f`
      <bbva-expandable-step
        hide-padding-left
        hide-padding-right
        ?hidden=${this.controller.stepCompleted<1}
        id="step-2"
        class="animation second-step"
        header="${this.t("bbva-multistep-finance-transaction-multipurchase-select-frequency-header")}"
        edit-label="${this.t("bbva-multistep-finance-transaction-multipurchase-edit-label")}">
        <div class="content">
          <div class="radio-item-list">
            <bbva-text class="radio-item-list-title" tag="span" text="${this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-description-text")}" size="S"></bbva-text>
            ${this._renderMonthsOptions()}
          </div>
          <div class="description">
            <bbva-header-category
                class="description-subtitle"
                link-accessibility-text="${this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-detail-title")}"
                text="${this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-detail-title")}"></bbva-header-category>
            ${this._renderAdditionalTaxesInfo}
            <bbva-notification-help
              accessibility-label-icon="Info"
              class="info description-help-info"
              icon=${null===(t=this.controller)||void 0===t?void 0:t.iconInfo}
              text="${this.t(this._getHelpText())}"
            ></bbva-notification-help>
          </div>
          <bbva-panel-button-fixed 
            show
            sticky
            label="${null!==(e=this.controller)&&void 0!==e&&null!==(i=e.deferSelected)&&void 0!==i&&i.number?this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-installment-amount-selected-description",this.textInfo):this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-installment-amount-description")}" 
            amount=${null===(a=this.controller)||void 0===a||null===(n=a.deferSelected)||void 0===n?void 0:n.installmentAmount} 
            currency-code="${null===(s=this.controller)||void 0===s?void 0:s.currencyCode}"
            local-currency="${null===(r=this.controller)||void 0===r?void 0:r.localCurrency}"
            language="${null===(o=this.controller)||void 0===o?void 0:o.language}">
            <div slot="footer" class="panel-button-amounts">
              ${this._renderListItem({labelText:this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-total-amount-description"),valueClass:"light-value",value:ut(null===(l=this.controller)||void 0===l||null===(c=l.deferSelected)||void 0===c?void 0:c.totalAmount,null===(d=this.controller)||void 0===d?void 0:d.localCurrency,this.controller.language,!0),requireHelp:!1})}
              <p ?hidden="${!(null!==(p=this.controller)&&void 0!==p&&null!==(u=p.deferSelected)&&void 0!==u&&u.number)}">${this.t(this._getSummaryFooterIVAinfoText())}</p>
            </div>
          </bbva-panel-button-fixed>
          <div class="panel-button">
            <bbva-button-default
              name="continue-button"
              text="${this.t("bbva-multistep-finance-transaction-multipurchase-select-purchases-total-amount-summary-button")}"
              ?disabled=${!(null!==(m=this.controller)&&void 0!==m&&m.enableSelectMonthsToDeferContinue)}
              @click=${this} >
            </bbva-button-default>
            <bbva-link
                aria-label="${this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-request-to-call-text")}"
                text="${this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-request-to-call-text")}">
            </bbva-link>
          </div>
        </div>
        <div slot="summary" class="summary">
          <bbva-text ambient="dark" tag="span" text="${this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-installment-amount-description")}" size="S"></bbva-text>
          <bbva-amount class="summary-amount" variant="4xl" ambient="dark" amount="${null===(b=this.controller)||void 0===b||null===(h=b.deferSelected)||void 0===h?void 0:h.installmentAmount}" currency-code="${null===(v=this.controller)||void 0===v?void 0:v.currencyCode}" local-currency="${null===(g=this.controller)||void 0===g?void 0:g.localCurrency}" language="${null===(y=this.controller)||void 0===y?void 0:y.language}"></bbva-amount>
          ${this._renderAdditionalTaxesInfoCollapsed}
        </div>
      </bbva-expandable-step>
    `}handleEvent(t){var e,i,a;const n="bbva-button-default"===(null==t||null===(e=t.target)||void 0===e||null===(i=e.dataset)||void 0===i?void 0:i.tagName)?"click-button":null==t?void 0:t.type,s={"bbva-list-option-input-change":()=>this.controller.manageMonthsSelection(null==t?void 0:t.detail),"click-button":()=>{this.controller.onContinueMonthsSelection(t),this.controller.stepCompleted=2,this._nextStep(t)}};return null==s||null===(a=s[n])||void 0===a?void 0:a.call(s)}get textInfo(){var t,e,i,a,n,s,r,o,l,c;const d=null===(t=this.controller)||void 0===t||null===(e=t.deferSelected)||void 0===e?void 0:e.preferentialPercentage,p=null===(i=this.controller)||void 0===i||null===(a=i.deferSelected)||void 0===a?void 0:a.regularPercentage;return{catPercentage:null===(n=this.controller)||void 0===n||null===(s=n.deferSelected)||void 0===s?void 0:s.catPercentage,deferFeedWithIvaPercentage:null===(r=this.controller)||void 0===r||null===(o=r.deferSelected)||void 0===o?void 0:o.deferFeedWithIvaPercentage,preferentialPercentage:d,preferentialPercentageParsed:`<span class='highlight'>${d}%</span>`,regularPercentage:p,regularPercentageParsed:`<span class='highlight'>${p}%</span>`,number:null===(l=this.controller)||void 0===l||null===(c=l.deferSelected)||void 0===c?void 0:c.number}}_renderMonthsOptions(){var t,e;return null===(t=this.controller)||void 0===t||null===(e=t.deferMovements)||void 0===e?void 0:e.map((t=>{var e,i,a;return f`
      <bbva-list-option
        type-radio-button
        disabled-tabindex
        ?checked="${t.checked}"
        name="months"
        @bbva-list-option-input-change=${this}
        value=${t.number}
        content-title="${t.number} mensualidades"
        description="${this.t("bbva-multistep-finance-transaction-multipurchase-months-list-options-option-label")}"
        language="${null===(e=this.controller)||void 0===e?void 0:e.language}"
        currency-code="${null===(i=this.controller)||void 0===i?void 0:i.currencyCode}"
        title-amount="${null==t?void 0:t.installmentAmount}"
        local-currency="${null===(a=this.controller)||void 0===a?void 0:a.localCurrency}"
        secondary-amount=${t.totalAmount}>
      </bbva-list-option>`}))}get _renderAdditionalTaxesInfo(){var t,e;if(null!==(t=this.controller)&&void 0!==t&&null!==(e=t.deferSelected)&&void 0!==e&&e.number){var i,a,n,s,r;const t=null!==(i=this.controller)&&void 0!==i&&null!==(a=i.deferSelected)&&void 0!==a&&a.withoutInterest?this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-additional-info-without-taxes-info-box-text"):this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-additional-info-with-taxes-info-box-text",this.textInfo);return f`
        ${this._renderListItem({id:"start-date-help",labelText:this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-additional-info-taxes-info-start-date-label"),valueClass:"italic-value",value:pt(null===(n=this.controller)||void 0===n||null===(s=n.deferSelected)||void 0===s?void 0:s.firstInstallmentDate,"DD MMM YYYY")})}
        ${this._renderTaxesAmountsInfo()}
        <bbva-notification-message class="description-message" message="${this.t(t)}"></bbva-notification-message>
        ${this._renderListItem({id:"cat-commision-help",labelText:this._boldPercentageValue(this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-additional-info-taxes-info-CAT-commision-percentage",this.textInfo),null===(r=this.textInfo)||void 0===r?void 0:r.catPercentage)})}
        `}return I}_renderTaxesAmountsInfo(){var t,e,i,a,n,s,r,o,l,c;return null!==(t=this.controller)&&void 0!==t&&null!==(e=t.deferSelected)&&void 0!==e&&e.withoutInterest?f`
      ${this._renderListItem({id:"commision-percentage-help",labelText:this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-additional-info-without-taxes-info-defer-commision-percentage",this.textInfo),value:ut(null===(i=this.controller)||void 0===i||null===(a=i.deferSelected)||void 0===a?void 0:a.deferFeedWithIvaAmount,null===(n=this.controller)||void 0===n?void 0:n.localCurrency,this.controller.language)})}
    `:f`
      ${this._renderListItem({id:"anual-commision-help",labelText:this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-additional-info-with-taxes-info-anual-commision"),value:`${null===(s=this.controller)||void 0===s||null===(r=s.deferSelected)||void 0===r?void 0:r.deferAnualFeedPercentage}%`})}
      ${this._renderListItem({labelText:this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-additional-info-with-taxes-info-defer-commision-percentage"),valueClass:"light-value",value:ut(null===(o=this.controller)||void 0===o||null===(l=o.deferSelected)||void 0===l?void 0:l.interestAmount,null===(c=this.controller)||void 0===c?void 0:c.localCurrency,this.controller.language),requireHelp:!1})}
    `}_renderListItem({id:t,labelText:e,valueClass:i,value:a,requireHelp:n=!0}){return f`
      <div class="list-item">
        <div class="list-item-description">
        ${A(e)}
          ${n?this._renderHelpIconButton(t):""}
        </div>
        <div class="list-item-value ${i}">${a}</div>
      </div>
    `}_boldPercentageValue(t,e){return t.replace(new RegExp(`${e}%`,"g"),`<b>${e}%</b>`)}_renderHelpIconButton(t){var e;return f`
      <button 
        id="${t}"
        @click="${()=>this._iconClicked(t)}"
        class="list-item-button">
        <bbva-core-icon
          icon="${null===(e=this.controller)||void 0===e?void 0:e.iconHelp}"
          size="24"
          aria-hidden="true"
        ></bbva-core-icon>
      </button>
    `}_iconClicked(t){this.controller._dispatchCustomEvent("finance-transaction-multipurchase-months-selection-step-help-icon-pressed",t)}get _renderAdditionalTaxesInfoCollapsed(){var t,e,i,a,n,s,r,o,l,c,d,p,u,m,b,h,v,g,y,k,$,x,S,_,C,P,w,T,A,M,L,D,E,q,V,z;return null!==(t=this.controller)&&void 0!==t&&null!==(e=t.deferSelected)&&void 0!==e&&e.number?null!==(i=this.controller)&&void 0!==i&&null!==(a=i.deferSelected)&&void 0!==a&&a.withoutInterest?f`
          <bbva-divider size="small"></bbva-divider>
          <bbva-list-simple ambient="dark" label="${this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-resume-info-without-taxes-info-number-of-months-label")}" description="${null===(n=this.controller)||void 0===n||null===(s=n.deferSelected)||void 0===s?void 0:s.number} meses"></bbva-list-simple>
          <bbva-list-simple ambient="dark" label="${this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-resume-info-without-taxes-info-start-date-label")}" description="${pt(null===(r=this.controller)||void 0===r||null===(o=r.deferSelected)||void 0===o?void 0:o.firstInstallmentDate,"DD MMM YYYY")}"></bbva-list-simple>
          <bbva-divider size="small"></bbva-divider>
          <bbva-list-simple ambient="dark" label="${this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-resume-info-without-taxes-info-defer-commision-label",{number:null===(l=this.controller)||void 0===l||null===(c=l.deferSelected)||void 0===c?void 0:c.number})}" language="${null===(d=this.controller)||void 0===d?void 0:d.language}" currency-code="${null===(p=this.controller)||void 0===p?void 0:p.currencyCode}" local-currency="${null===(u=this.controller)||void 0===u?void 0:u.localCurrency}" amount="${null===(m=this.controller)||void 0===m||null===(b=m.deferSelected)||void 0===b?void 0:b.deferFeedWithIvaAmount}"></bbva-list-simple>
          <bbva-list-simple ambient="dark" description-medium="" label="${this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-resume-info-without-taxes-info-total-amount")}" language="${null===(h=this.controller)||void 0===h?void 0:h.language}" currency-code="${null===(v=this.controller)||void 0===v?void 0:v.currencyCode}" local-currency="${null===(g=this.controller)||void 0===g?void 0:g.localCurrency}" amount="${null===(y=this.controller)||void 0===y||null===(k=y.deferSelected)||void 0===k?void 0:k.totalAmount}"></bbva-list-simple>
        `:f`
          <bbva-divider size="small"></bbva-divider>
          <bbva-list-simple ambient="dark" label="${this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-resume-info-without-taxes-info-number-of-months-label")}" description="${null===($=this.controller)||void 0===$||null===(x=$.deferSelected)||void 0===x?void 0:x.number} meses"></bbva-list-simple>
          <bbva-list-simple ambient="dark" label="${this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-resume-info-without-taxes-info-start-date-label")}" description="${pt(null===(S=this.controller)||void 0===S||null===(_=S.deferSelected)||void 0===_?void 0:_.firstInstallmentDate,"DD MMM YYYY")}"></bbva-list-simple>
          <bbva-divider size="small"></bbva-divider>
          <bbva-list-simple ambient="dark" description-medium="" label="${this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-resume-info-without-taxes-info-anual-taxes-label")}" description="${null===(C=this.controller)||void 0===C||null===(P=C.deferSelected)||void 0===P?void 0:P.deferAnualFeedPercentage} %"></bbva-list-simple>
          <bbva-list-simple ambient="dark" label="${this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-resume-info-without-taxes-info-total-taxes-label")}" language="${null===(w=this.controller)||void 0===w?void 0:w.language}" currency-code="${null===(T=this.controller)||void 0===T?void 0:T.currencyCode}" local-currency="${null===(A=this.controller)||void 0===A?void 0:A.localCurrency}" amount="${null===(M=this.controller)||void 0===M||null===(L=M.deferSelected)||void 0===L?void 0:L.interestAmount}"></bbva-list-simple>
          <bbva-list-simple ambient="dark" description-medium="" label="${this.t("bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-resume-info-without-taxes-info-total-amount")}" language="${null===(D=this.controller)||void 0===D?void 0:D.language}" currency-code="${null===(E=this.controller)||void 0===E?void 0:E.currencyCode}" local-currency="${null===(q=this.controller)||void 0===q?void 0:q.localCurrency}" amount="${null===(V=this.controller)||void 0===V||null===(z=V.deferSelected)||void 0===z?void 0:z.totalAmount}"></bbva-list-simple>
        `:I}_getSummaryFooterIVAinfoText(){var t,e;return null!==(t=this.controller)&&void 0!==t&&null!==(e=t.deferSelected)&&void 0!==e&&e.withoutInterest?"bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-summary-commision-info-label":"bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-summary-taxes-info-label"}_getHelpText(){var t,e;return null!==(t=this.controller)&&void 0!==t&&null!==(e=t.deferSelected)&&void 0!==e&&e.number?"bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-detail-help-selected-subtitle":"bbva-multistep-finance-transaction-multipurchase-select-month-to-defer-detail-help-no-selected-subtitle"}}class ht extends lt{render(){var t,e,i;return f`
      <bbva-expandable-step
        id="step-3"
        hide-padding-left
        hide-padding-right
        hide-padding-top
        ?hidden=${this.controller.stepCompleted<2}
        class="third-step animation"
        header="${this.t("bbva-multistep-finance-transaction-multipurchase-select-terms-and-conditions-header")}"
        edit-label= "${this.t("bbva-multistep-finance-transaction-multipurchase-select-terms-and-conditions-edit-button-label")}" >
        <div class="link-modal">
          <bbva-link id="modalLink" @click=${this}
          text="${this.t("bbva-multistep-finance-transaction-multipurchase-select-terms-and-conditions-modal-link-text")}"
          ></bbva-link>
        </div>
        <div class="content">
          <bbva-form-checkbox
          ?checked="${null===(t=this.controller)||void 0===t?void 0:t.enableTermsAndConditionsContinue}"
          required
            @input=${this}
            label="${this.t("bbva-multistep-finance-transaction-multipurchase-select-terms-and-conditions-checkbox-label")}"
            optionalLabel="" >
          </bbva-form-checkbox>
          <div class="panel-button">
              <bbva-button-default 
                text="${this.t("bbva-multistep-finance-transaction-multipurchase-select-purchases-total-amount-summary-button")}"
                ?disabled="${!(null!==(e=this.controller)&&void 0!==e&&e.enableTermsAndConditionsContinue)}"
                @click=${this} >
              </bbva-button-default>
          </div>
        </div>
        <div slot="summary" class="summary">
            <bbva-notification-help
            ambient="dark"
            accessibility-label-icon="Info"
            class="info description-help-info"
            icon=${null===(i=this.controller)||void 0===i?void 0:i.iconCheck}
            text = "${this.t("bbva-multistep-finance-transaction-multipurchase-select-terms-and-conditions-help-label")}"
          ></bbva-notification-help>
        </div>
    </bbva-expandable-step>
  `}handleEvent(t){switch(t.type){case"input":this.controller.manageTermsAndConditions();break;case"click":"modalLink"!==t.target.id?(this.controller.onContinueTermsAndConditions(),this._nextStep(t)):this.controller.onClickLinkModal()}}}var vt=t`:host {
  display: block;
  box-sizing: border-box;
  min-height: 100%;
  --bbva-expandable-step-default-content-max-height: none;
  --bbva-z-index-notifications: 0;
  background-color: var(--colorsPrimaryCoreLightened, ${i(a.primaryCoreLightened)});
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-panel-button-fixed]#panel-step-1 {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-expandable-step] {
  height: auto;
}

[data-tag-name=bbva-expandable-step]#step-1 .panel-button {
  display: flex;
  justify-content: center;
}

[data-tag-name=bbva-expandable-step]#step-2 p {
  padding: 0;
  margin: 0;
}
[data-tag-name=bbva-expandable-step]#step-2 .panel-button-amounts, [data-tag-name=bbva-expandable-step]#step-2 .panel-button {
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em);
}
[data-tag-name=bbva-expandable-step]#step-2 .panel-button {
  gap: 1rem;
}
[data-tag-name=bbva-expandable-step]#step-2 [data-tag-name=bbva-panel-button-fixed]:not([shadowed]) {
  padding-bottom: 0.5rem;
}
[data-tag-name=bbva-expandable-step]#step-2 .description-subtitle {
  margin-top: 1.5rem;
  padding-bottom: 0.5rem;
  padding-left: 0rem;
  --gridSpacerVariant: 0;
}
[data-tag-name=bbva-expandable-step]#step-2 .description-help-info {
  padding-left: 0rem;
}
[data-tag-name=bbva-expandable-step]#step-2 .radio-item-list-title {
  padding: calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em) calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em) calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em);
}
[data-tag-name=bbva-expandable-step]#step-2 .radio-item-list [data-tag-name=bbva-header-category] {
  padding-left: 0;
}
[data-tag-name=bbva-expandable-step]#step-2 .radio-item-list [data-tag-name=bbva-list-option] {
  padding-left: 0;
  padding-right: 0;
  padding-bottom: 1rem;
}
[data-tag-name=bbva-expandable-step]#step-2 .radio-item-list [data-tag-name=bbva-list-option]:not(:last-of-type) {
  border-bottom: 1px solid #D3D3D3;
}
[data-tag-name=bbva-expandable-step]#step-2 .description-message {
  margin: 1rem 0rem;
}
[data-tag-name=bbva-expandable-step]#step-2 .list-item {
  display: flex;
  justify-content: space-between;
  flex-wrap: nowrap;
  gap: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em);
  padding: 0.5rem 0rem;
}
[data-tag-name=bbva-expandable-step]#step-2 .list-item-description {
  font-size: 0.9375rem;
  font-weight: 400;
  line-height: 1.3rem;
}
[data-tag-name=bbva-expandable-step]#step-2 .list-item-button {
  all: unset;
  color: var(--colorsPrimaryMedium, #1973B8);
  padding: 0rem 0.5rem;
  margin-right: -10px;
}
[data-tag-name=bbva-expandable-step]#step-2 .list-item-value {
  white-space: nowrap;
  font-weight: 500;
}
[data-tag-name=bbva-expandable-step]#step-2 .list-item .italic-value {
  font-style: italic;
}
[data-tag-name=bbva-expandable-step]#step-2 .list-item .light-value {
  font-weight: 400;
}

[data-tag-name=bbva-expandable-step]#step-3 [data-tag-name=bbva-form-checkbox] {
  padding: 0rem 1rem 1rem;
}
[data-tag-name=bbva-expandable-step]#step-3 .panel-button {
  display: flex;
  justify-content: center;
  padding-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-header-main] {
  padding-top: 0;
}

[data-tag-name=bbva-expandable-multistep] {
  overflow: auto;
  height: calc(100vh - 44px - env(safe-area-inset-top));
}

[data-tag-name=bbva-list-card] {
  --colorsPrimarySubdued: #fff;
}

.first-step .date {
  margin-bottom: 0.5rem;
}
.first-step .description-text {
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em);
}
.first-step .description-subtitle {
  margin-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em);
  padding-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em);
}
.first-step .description-message {
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em);
}
.first-step .description-item-list {
  padding-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em);
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em);
}
.first-step .description-item-list:not(:last-of-type) {
  border-bottom: 1px solid #D3D3D3;
}
.first-step .description-item-list [data-tag-name=bbva-header-category] {
  padding-left: 0;
}
.first-step .description-item-list [data-tag-name=bbva-list-option] {
  padding-left: 0;
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em);
}
.first-step .description-item-list [data-tag-name=bbva-list-option]:not(:last-of-type) {
  border-bottom: 1px solid #D3D3D3;
}
.first-step .summary {
  padding: calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em);
}

.second-step .radio-item-list,
.second-step .description {
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em);
}
.second-step .summary [data-tag-name=bbva-text] {
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em);
}
.second-step .summary [data-tag-name=bbva-list-simple] {
  margin: 1rem 0rem;
  padding: 0.5rem 1rem;
}
.second-step .summary .summary-amount {
  margin: 0.25rem 1rem 1rem 1rem;
}

.more-transactions-link {
  text-align: center;
}

.third-step {
  max-height: calc(((38.75 * var(--gridSpacerVariant, var(--gridSpacer, ${i(l.spacer)}))) / 16) * 1em);
}

.summary-button {
  margin-top: 0px;
  --bbva-button-default-bg-color: var(----statusColorsFinance, #028484);
}

[data-tag-name=bbva-core-spinner] {
  padding: 1.5rem;
}

[data-tag-name=bbva-panel-button-fixed][shadowed] {
  padding-bottom: 1.5rem;
}

.link-modal {
  padding-left: 1rem;
  padding-right: 0.5rem;
}
`;class gt extends(b(m(M(h)))){static get is(){return"bbva-multistep-finance-transaction-multipurchase"}static get properties(){return{cardData:{type:Object},minimumAmountOfPurchase:{type:Object},transactions:{type:Array},hasPagination:{type:Boolean},_isPaginating:{type:Boolean},loadPaginationError:{type:Boolean},errorPaginationConfig:{type:Object},totalAmount:{type:Number},maxSelectedPurchases:{type:Number},selectedTransactions:{type:Array},visibleChars:{type:Number,attribute:"visible-chars"},firstSightPurchases:{type:Number},shouldLoadMoreTransactions:{type:Boolean},defaultImage:{type:String},cardImage:{type:String},enableSelectPurchasesContinue:{type:Boolean},enableSelectMonthsToDeferContinue:{type:Boolean},enableTermsAndConditionsContinue:{type:Boolean},deferMovements:{type:Array,reflect:!0},deferSelected:{type:Object},iconHelp:{type:String,attribute:"icon-help"},iconInfo:{type:String,attribute:"icon-info"},iconCheck:{type:String,attribute:"icon-check"},_allStepsCollapsed:{type:String},stepCompleted:{type:Number},shouldShowPaginationLoader:{type:Boolean}}}static get scopedElements(){const t=[ot,B,F,N,W,C,j,R,O,J,nt,S,Z,x,H,U,P,Y];return gt.scopedElementsFromClasses(t)}constructor(){super(),this.stepCompleted=0,this.defaultImage="./images/cards/cardFrontDefault.png",this.cardImage=this.defaultImage,this.enableSelectPurchasesContinue=!1,this.enableSelectMonthsToDeferContinue=!1,this.enableTermsAndConditionsContinue=!1,this.visibleChars=4,this.cardData={},this.language="es-MX",this.transactions=[],this.hasPagination=!1,this._isPaginating=!1,this.loadPaginationError=!1,this.totalAmount=0,this.selectedTransactions=[],this.firstSightPurchases=7,this.shouldLoadMoreTransactions=!1,this.shouldShowPaginationLoader=!1,this._allStepsCollapsed=!1,this.maxSelectedPurchases=10,this.deferMovements=[],this.errorPaginationConfig={message:"bbva-multistep-finance-transaction-multipurchase-pagination-error",link:"bbva-multistep-finance-transaction-multipurchase-pagination-error-retry",allowRetry:!0},this.deferSelected={number:0,installmentAmount:0,totalAmount:0,checked:!1},this.iconHelp=L(),this.iconInfo=D(),this.iconCheck=E(),this.cardStep=new ct(this),this.selectPurchasesStep=new mt(this),this.monthsToDeferStep=new bt(this),this.termsAndConditionsStep=new ht(this)}static get styles(){return[vt,s.dark,q.dark,G.dark,et.dark,V.dark,g("bbva-multistep-finance-transaction-multipurchase-shared-styles")]}reset(){this.cardData={},this.minimumAmountOfPurchase={},this.totalAmount=0,this.selectedTransactions=[],this.transactions=[],this.hasPagination=!1,this._isPaginating=!1,this.loadPaginationError=!1,this.cardImage=this.defaultImage,this.enableSelectPurchasesContinue=!1,this.enableSelectMonthsToDeferContinue=!1,this.enableTermsAndConditionsContinue=!1,this.shouldLoadMoreTransactions=!1,this.shouldShowPaginationLoader=!1,this._allStepsCollapsed=!1,this.deferMovements=[],this.deferSelected={number:0,installmentAmount:0,totalAmount:0,checked:!1},this.stepCompleted=0,this.errorPaginationConfig={message:"bbva-multistep-finance-transaction-multipurchase-pagination-error",link:"bbva-multistep-finance-transaction-multipurchase-pagination-error-retry",allowRetry:!0},this._resetMultiStep()}_resetMultiStep(){const t=this.shadowRoot.querySelector("bbva-expandable-multistep"),e=this.shadowRoot.querySelectorAll(".animation");e.forEach(((t,i)=>{e[i].completed=!1,e[i].disabled=!0,e[i].active=!1}));const i=this.shadowRoot.querySelector("#step-1");i.disabled=!1,i.active=!0,t.stepsToReset=[0,1,2],t._scrollToTop(.5,0,0)}resetTermsAndConditions(){const t=this.shadowRoot.querySelector("#step-3");t.completed&&(t.completed=!1,t.disabled=!0,t.active=!1),this.enableTermsAndConditionsContinue=!1}resetMonthsToDefer(){const t=this.shadowRoot.querySelector("#step-2");t.completed&&(t.completed=!1,t.disabled=!0,t.active=!1),this.deferMovements=[],this.deferSelected={number:0,installmentAmount:0,totalAmount:0,checked:!1},this.enableSelectMonthsToDeferContinue=!1,this._dispatchCustomEvent("bbva-multistep-finance-transaction-multipurchase-reset-transaction-purchase-selected",{})}dispatchSelectedPurchases(){this._dispatchCustomEvent("bbva-multistep-finance-transaction-multipurchase-selected-purchases",{selectedTransactions:this.selectedTransactions,totalAmount:this.totalAmount})}dispatchSelectedPurchase(){this._dispatchCustomEvent("bbva-multistep-finance-transaction-multipurchase-selected-purchase",{item:"bbva-list-option-input-change"})}dispatchInvalidNumberPurchases(){this._dispatchCustomEvent("bbva-multistep-finance-transaction-multipurchase-purchase-selection-invalid-number-purchases")}dispatchInvalidAvailableAmount(){this._dispatchCustomEvent("bbva-multistep-finance-transaction-multipurchase-purchase-selection-invalid-available-amount")}dispatchPaginationErrorLinkClick(){this._dispatchCustomEvent("bbva-multistep-finance-transaction-multipurchase-pagination-error-click")}dispatchLoadMoreTransactionLinkClick(){this._dispatchCustomEvent("bbva-multistep-finance-transaction-multipurchase-show-more-transactions-click",{item:"show-more-transactions-click"})}manageMonthsSelection(t){this.deferMovements=this.deferMovements.map((e=>{const i={...e};return i.number.toString()===t.value?(i.checked=!0,this.deferSelected=i):i.checked=!1,i})),this.stepCompleted=1,this.enableSelectMonthsToDeferContinue=!0,this._dispatchCustomEvent("bbva-multistep-finance-transaction-multipurchase-set-defer-months-selected",this.deferSelected.number),this.resetTermsAndConditions()}onContinueMonthsSelection(){this._dispatchCustomEvent("bbva-multistep-finance-transaction-multipurchase-continue-months-selected",this.deferSelected.number)}manageTermsAndConditions(){this.enableTermsAndConditionsContinue=!this.enableTermsAndConditionsContinue}onContinueTermsAndConditions(){this._dispatchCustomEvent("bbva-multistep-finance-transaction-multipurchase-continue-terms-and-conditions")}onClickLinkModal(){this._dispatchCustomEvent("bbva-multistep-finance-transaction-multipurchase-show-modal")}get _renderStepSelectedCard(){return this.cardStep.render()}get _renderStepSelectPurchases(){return this.selectPurchasesStep.render()}get _renderStepMonthsToDefer(){return this.monthsToDeferStep.render()}get _renderStepSelectTermsAndConditions(){return this.termsAndConditionsStep.render()}render(){return f`
      <bbva-header-main
        variant="modal"
        text="${this.t("bbva-multistep-finance-transaction-multipurchase-header-text")}" 
        icon-right-primary=${z()}
        accessibility-text-icon-right-primary="bb">
      </bbva-header-main>
      <bbva-expandable-multistep has-animation @scroll="${this._managePagination}"
        @expandable-multistep-all-complete=${t=>{this._allStepsCollapsed=t.detail}}>
        ${this._renderStepSelectedCard}
        ${this._renderStepSelectPurchases}
        ${this._renderStepMonthsToDefer}
        ${this._renderStepSelectTermsAndConditions}
        <bbva-panel-button-fixed
          id="finance-transaction-multipurchase-summary-button"
          ?hidden="${!this._allStepsCollapsed}"
          show
          sticky
          button-text="${this.t("bbva-multistep-finance-transaction-multipurchase-operative-summary-button-label")}"
          @panel-button-fixed-item-click=${()=>this._dispatchCustomEvent("bbva-multistep-finance-transaction-multipurchase-request-financing-multipurchase")}
          class="summary-button">
        </bbva-panel-button-fixed>
      </bbva-expandable-multistep>
    `}_managePagination(){if(this.hasPagination&&this.shouldLoadMoreTransactions){const t=this.shadowRoot.querySelector("#step-prefilled").offsetHeight+this.shadowRoot.querySelector("#step-1").offsetHeight-this.shadowRoot.querySelector("#panel-step-1").offsetHeight-this.shadowRoot.querySelector("#panel-button-1").offsetHeight,e=this.shadowRoot.querySelector("bbva-expandable-multistep");!((null==e?void 0:e.scrollTop)+(null==e?void 0:e.offsetHeight)>t)||this._isPaginating||this.loadPaginationError||(this._dispatchCustomEvent("bbva-multistep-finance-transaction-multipurchase-purchase-load-more-transactions"),this._isPaginating=!0)}}addTransactions(t){null!=t&&t.length&&(this.transactions=[...this.transactions,...t]),this.loadPaginationError=!1,this._isPaginating=!1,this.shouldShowPaginationLoader=!1}showPaginationError(t){this.errorPaginationConfig=t||this.errorPaginationConfig,this.loadPaginationError=!0,this._isPaginating=!1,this.shouldShowPaginationLoader=!1}managePagination(t){var e,i;this.hasPagination=!(null==t||null===(e=t.value)||void 0===e||null===(i=e.links)||void 0===i||!i.next)}_dispatchCustomEvent(t,e,i=!0,a=!0){this.dispatchEvent(new CustomEvent(t,{bubbles:i,composed:a,detail:e,cancelable:!0}))}}customElements.define(gt.is,gt),customElements.define(X.is,X);
