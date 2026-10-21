import{z as t,a8 as a,ar as e,a9 as r,aa as i,a as o,L as l,ak as n,h as s,g as c,au as d,cO as b,b0 as g,ab as v,aI as u,ac as m,ad as h,aS as p,aJ as y,an as k,aw as $,F as f,b6 as x,ag as S,cP as C,cQ as _,bL as w,av as P,i as L,j as z,f as A,o as B}from"./952f98a9.js";import{b as V,B as I}from"./85e2fa69.js";import"./523f7d21.js";const M=new e;var T=t`[divider] {
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
  background-color: var(--bbva-divider-dark-mode-color, var(--bbva-divider-color, var(--colorsSecondary300, ${a(r.secondary300)})));
  opacity: var(--bbva-divider-opacity, 1);
}

hr[divider]::after {
  display: none;
}

hr[divider=fit],
[divider=fit]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}

hr[divider=indented],
[divider=indented]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}

hr[divider=small],
[divider=small]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}

hr[divider~=center][divider~=small],
[divider~=center][divider~=small]::after {
  margin-right: auto;
  margin-left: auto;
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}

hr[divider=bold] {
  margin-bottom: 0;
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}

[divider=bold] {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}
[divider=bold]::after {
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}
${M.mediaRules()}`;const D=new e;var E=t`[ambient^=light] {
  --bbva-divider-color: var(--colorsSecondary300, ${a(r.secondary300)});
}
${D.mediaRules()}`;const H=new e;var W=t`[ambient^=dark] {
  --bbva-divider-color: var(--colorsSecondary300, ${a(r.secondary300)});
}
${H.mediaRules()}`;const F={dark:t`
    ${W}
  `,light:t`
    ${E}
  `};class N extends(o(l)){static get is(){return"bbva-divider"}static get properties(){return{size:{type:String}}}constructor(){super(),this.size="full"}firstUpdated(){this.setAttribute("aria-hidden",!0)}static get styles(){return[T,F.light,F.dark,n("bbva-divider-shared-styles")]}render(){return s` <hr divider="${this.size}" /> `}}var j={bbvaDivider:`\n  --bbva-divider-dark-mode-color: ${c("colors.cool40")};\n  `};const q=new e;var R=t`[ambient^=light] {
  --bbva-list-budget-title-color: initial;
  --bbva-list-budget-text-color: initial;
  --bbva-list-budget-action-icon-color: initial;
  --bbva-list-budget-active-action-icon-color: initial;
  --bbva-list-budget-link-color: initial;
  --bbva-list-budget-active-link-color: initial;
  --bbva-list-budget-active-bg-color: initial;
  --bbva-list-budget-skeleton-color: initial;
  --bbva-list-budget-skeleton-animated-layer-bg: initial;
  --bbva-list-budget-bar-mark-middle-color: initial;
  --bbva-list-budget-bar-mark-color: initial;
}
${q.mediaRules()}`;const X=new e;var O=t`[ambient^=dark] {
  --bbva-list-budget-title-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-list-budget-text-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-list-budget-action-icon-color: var(--colorsPrimarySubdued, ${a(r.primarySubdued)});
  --bbva-list-budget-active-action-icon-color: var(--colorsPrimaryMediumLight, ${a(r.primaryMediumLight)});
  --bbva-list-budget-link-color: var(--colorsPrimarySubdued, ${a(r.primarySubdued)});
  --bbva-list-budget-active-link-color: var(--colorsPrimaryMediumLight, ${a(r.primaryMediumLight)});
  --bbva-list-budget-active-bg-color: var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)});
  --bbva-list-budget-skeleton-color: var(--colorsPrimaryCoreDark, ${a(r.primaryCoreDark)});
  --bbva-list-budget-skeleton-bg: transparent;
  --bbva-list-budget-skeleton-animated-layer-bg: var(--colorsPrimaryCoreDarkened, ${a(r.primaryCoreDarkened)});
  --bbva-list-budget-bar-mark-middle-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
  --bbva-list-budget-bar-mark-color: var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)});
}
${X.mediaRules()}`;const J={dark:t`
    ${d.dark}
    ${b.dark}
    ${g.dark}
    ${V.dark}
    ${F.dark}
    ${O}
  `,light:t`
    ${d.light}
    ${b.light}
    ${g.light}
    ${V.light}
    ${F.light}
    ${R}
  `},Q=new e;var U=t`:host {
  --_budget-color: var(--bbva-list-budget-dark-mode-color, var(--bbva-list-budget-color, var(--colorsPrimaryVariant, ${a(r.primaryVariant)})));
  --_text-color: var(--bbva-list-budget-text-dark-mode-color, var(--bbva-list-budget-text-color, var(--colorsSecondary600, ${a(r.secondary600)})));
  --_font-weight-medium: var(--bbva-list-font-weight-medium, var(--fontFacePrimaryMediumFontWeight, ${a(v.medium.fontWeight)}));
  --_action-icon-color: var(--bbva-list-budget-action-icon-dark-mode-color, var(--bbva-list-budget-action-icon-color, var(--colorsPrimaryMedium, ${a(r.primaryMedium)})));
  --_active-bg-color: var(--bbva-list-budget-active-bg-dark-mode-color, var(--bbva-list-budget-active-bg-color, var(--colorsSecondary100, ${a(r.secondary100)})));
  --skeleton-quote-color: var(--bbva-list-budget-skeleton-dark-mode-color, var(--bbva-list-budget-skeleton-color, var(--colorsSecondary200, ${a(r.secondary200)})));
  --skeleton-quote-bg: var(--bbva-list-budget-skeleton-bg-dark-mode-color, var(--bbva-list-budget-skeleton-bg, transparent));
  --_skeleton-animated-layer-bg: var(--bbva-list-budget-dark-mode-skeleton-animated-layer-bg, var(--bbva-list-budget-skeleton-animated-layer-bg, var(--ambientsLight, ${a(u.light)})));
  --_active-action-icon-color: var(--bbva-list-budget-active-action-icon-dark-mode-color, var(--bbva-list-budget-active-action-icon-color, var(--colorsPrimaryCore, ${a(r.primaryCore)})));
  --_link-color: var(--bbva-list-budget-link-dark-mode-color, var(--bbva-list-budget-link-color, var(--colorsPrimaryMedium, ${a(r.primaryMedium)})));
  --_active-link-color: var(--bbva-list-budget-link-active-dark-mode-color, var(--bbva-list-budget-active-link-color, var(--colorsPrimaryCore, ${a(r.primaryCore)})));
  --_list-budget-bar-mark-middle-color: var(--bbva-list-budget-dark-mode-bar-mark-middle-color, var(--bbva-list-budget-bar-mark-middle-color, var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)})));
  --_list-budget-bar-mark-color: var(--bbva-list-budget-dark-mode-bar-mark-color, var(--bbva-list-budget-bar-mark-color, var(--colorsPrimaryCoreLightened, ${a(r.primaryCoreLightened)})));
  min-height: 5rem;
  display: flex;
  flex-direction: column;
  box-sizing: border-box;
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

.container {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1em);
}

.header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin-bottom: calc(var(--bbva-global-spacer, 0.5rem) * 1);
}

.heading {
  display: flex;
  justify-content: space-between;
  align-items: center;
  overflow: hidden;
}

.icon {
  flex: none;
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
  align-self: flex-start;
  fill: var(--bbva-list-budget-icon-color, var(--_budget-color));
}
.icon.category {
  fill: var(--bbva-list-budget-category-icon-color, var(--_budget-color));
}

.action-icon {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
  padding: 0;
  border: none;
  cursor: pointer;
  background: none;
  fill: var(--_action-icon-color);
}
.action-icon:active {
  fill: var(--_active-action-icon-color);
}

.header-title {
  display: flex;
  align-items: center;
  overflow: hidden;
  padding-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1em);
}
.header-title .header-text {
  margin: 0;
  padding: 0;
  border: none;
  overflow: hidden;
  background: none;
  color: var(--bbva-list-budget-title-color, var(--_text-color));
  font-weight: var(--bbva-list-budget-header-weight, var(--_font-weight-medium));
}
.header-title .header-text.link {
  color: var(--_link-color);
  font-family: inherit;
  cursor: pointer;
}
.header-title.title-book .header-text {
  font-weight: var(--bbva-list-budget-header-action-icon-weight, var(--fontFacePrimaryBookFontWeight, ${a(v.book.fontWeight)}));
}

:host([actionable]:active),
:host([actionable][active]) {
  background-color: var(--_active-bg-color);
}
:host([actionable]:active) .header-text.link,
:host([actionable][active]) .header-text.link {
  color: var(--_active-link-color);
}

.total-amount {
  font-weight: var(--bbva-list-budget-total-amount-weight, var(--fontFacePrimaryRegular, ${a(v.regular)}));
  align-self: flex-start;
}

.progress-bar {
  display: flex;
  justify-content: center;
}

[data-tag-name=bbva-data-visualization-bar] {
  width: calc(100% - 4px);
  --bbva-data-visualization-bar-mark-middle-color: var(--_list-budget-bar-mark-middle-color);
  --bbva-data-visualization-bar-mark-color: var(--_list-budget-bar-mark-color);
}

.current-amount {
  display: flex;
  align-content: center;
  margin-top: calc(var(--bbva-global-spacer, 0.5rem) * 1);
  font-size: var(--bbva-list-budget-size, var(--typographyTypeSmall, ${a(m.typeSmall)}));
  line-height: var(--lineHeightTypeSmall, ${a(h.typeSmall)});
}

.amount-label {
  display: flex;
  flex-grow: 1;
  flex-shrink: 0;
  align-items: center;
  color: var(--_text-color);
  font-weight: var(--bbva-list-budget-amount-label-weight, var(--fontFacePrimaryBookFontWeight, ${a(v.book.fontWeight)}));
  padding-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}

.amount {
  display: flex;
  min-width: min-content;
  min-width: -webkit-min-content;
  font-weight: var(--bbva-list-budget-amount-weight, var(--_font-weight-medium));
}

:host(:not([divider-size])) [data-tag-name=bbva-divider] {
  display: none;
}

:host([loading]) {
  overflow: hidden;
  pointer-events: none;
  background-repeat: no-repeat;
  opacity: 1;
  height: 7rem;
  background-image: linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, var(--skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: calc((40% * 2) + (16px/ 2)) 16px, calc((29% * 2) + (16px/ 2)) 16px, calc((87% * 2) + (16px/ 2)) 16px, calc((20% * 2) + (16px/ 2)) 16px;
  background-position: 16px 16px, calc(100% - 16px) 16px, 16px 48px, 16px 80px;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  inset: 0 0.00625rem;
  background: var(--_skeleton-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
}

@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    transform: translateX(0%) scaleX(2);
    opacity: 0;
  }
}
${Q.mediaRules()}`;class G extends(o(p(y(k(l))))){static get is(){return"bbva-list-budget"}static get scopedElements(){return{"bbva-amount":$,"bbva-icon":f,"bbva-link":x,"bbva-data-visualization-bar":I,"bbva-text":S,"bbva-divider":N}}static get properties(){return{totalAmount:{type:Number,attribute:"total-amount"},markValue:{type:Number,attribute:"mark-value"},budgetTitle:{type:String,attribute:"budget-title"},actionable:{type:Boolean,reflect:!0},headerIcon:{type:String,attribute:"header-icon"},headerIconColor:{type:String,attribute:"header-icon-color"},progressBarColor:{type:String,attribute:"progress-bar-color"},actionIcon:{type:String,attribute:"action-icon"},actionIconAccessibilityText:{type:String,attribute:"action-icon-accessibility-text"},iconSize:{type:Number,attribute:"icon-size"},amountLabel:{type:String,attribute:"amount-label"},infoAmount:{type:Number,attribute:"info-amount"},infoAmountCurrencyCode:{type:String,attribute:"info-amount-currency-code"},infoAmountDecimalsHidden:{type:Boolean,attribute:"info-amount-decimals-hidden"},customPercentage:{type:Number,attribute:"custom-percentage"},showInfo:{type:Boolean,attribute:"show-info"},alignWithProgress:{type:Boolean,attribute:"align-with-progress"},progressBarAccessibilityText:{type:String,attribute:"progress-bar-accessibility-text"},headingLevel:{type:String},loading:{type:Boolean,reflect:!0},titleBook:{type:Boolean,attribute:"title-book",reflect:!0},titleEllipsis:{type:Boolean,attribute:"title-ellipsis",reflect:!0},category:{type:String,reflect:!0},amount:{type:Number},currencyCode:{type:String,attribute:"currency-code"},localCurrency:{type:String,attribute:"local-currency"},language:{type:String},linkHref:{type:String,attribute:"link-href"},dividerSize:{type:String,attribute:"divider-size"}}}constructor(){super(),this.amount=0,this.iconSize=24,this.totalAmount=100,this.headingLevel="h3",this.amountLabel="bbva-list-budget-amount-label",this.actionIcon="",this.actionIconAccessibilityText="bbva-list-budget-action-icon-accessibility",this.loading=!1,this.titleBook=!1,this.titleEllipsis=!1,this.category="",this.progressBarColor="",this.markValue=0,this.budgetTitle="",this.actionable=!1,this.headerIcon="",this.headerIconColor="",this.showInfo=!1,this.alignWithProgress=!1,this.progressBarAccessibilityText="progress-bar-accessibility-text",this.infoAmountCurrencyCode="",this.infoAmountDecimalsHidden=!1,this._defaultProgressBarColor=r.primaryVariant,this.dividerSize=""}static get styles(){return[super.styles,U,J.dark,J.light,n("bbva-list-budget-shared-styles")]}get _hasCustomPercentage(){return this.customPercentage>=0}get _percentage(){const t=this._hasCustomPercentage?this.customPercentage:Math.floor(100*this.amount/this.totalAmount);return this.alignWithProgress?t:0}get _icon(){var t,a;return this.headerIcon||(null===(t=C[this.category])||void 0===t?void 0:t.icon)&&_[null===(a=C[this.category])||void 0===a?void 0:a.icon]()}get _text(){var t;return this.budgetTitle||(null===(t=C[this.category])||void 0===t?void 0:t.locale)}_iconColor(){let e=null;if(this.headerIconColor&&!this.category)e=`fill: ${this.headerIconColor}`;else{var r,i,o;const l=`--bbva-list-budget-category-${this.category}-icon-color`;w(t`
        * {
          ${a(l)}: ${a(null===(r=C[this.category])||void 0===r?void 0:r.color)};
        }

        [ambient^='dark'] * {
          ${a(l)}: ${a(null===(i=C[this.category])||void 0===i?void 0:i.colorContrast)};
        }
      `),e=`fill: ${null===(o=C[this.category])||void 0===o?void 0:o.color}`}return e}get _mainIcon(){return s`
      <bbva-icon
        aria-hidden="true"
        data-tag-name="bbva-icon"
        style="${this._iconColor()}"
        class="icon ${P({category:this.category})}"
        .icon="${this._icon}"
        size="24"
      ></bbva-icon>
    `}static _textHeader({type:t,ellipsis:a,tag:e,text:r,role:i,tabindex:o}){return s`
      <bbva-text
        data-tag-name="bbva-text"
        role="${L(i)}"
        tabindex="${L(o)}"
        unset
        ?ellipsis="${a}"
        class="${t}"
        .tag="${e}"
        size="M"
        .text="${r}"
      >
      </bbva-text>
    `}get _heading(){return s`
      ${this.headerIcon||this.category?this._mainIcon:""}
      <div class="header-title ${P({"title-book":this.titleBook})}">
        ${this.actionable?s`
              ${G._textHeader({role:"button",tabindex:"0",type:"header-text link",ellipsis:this.titleEllipsis,tag:this.headingLevel,text:this.t(this._text)})}
            `:s`
              ${G._textHeader({type:"header-text",ellipsis:this.titleEllipsis,tag:this.headingLevel,text:this.t(this._text)})}
            `}
        ${this.actionIcon?s`
              <bbva-link
                class="action-icon"
                .icon="${this.actionIcon}"
                icon-size="${this.iconSize}"
                data-tag-name="bbva-link"
                aria-label="${this.t(this.actionIconAccessibilityText)}"
                @click="${this._actionClick}"
                href="${L(this.linkHref)}"
              >
              </bbva-link>
            `:""}
      </div>
    `}get _infoAmount(){return"number"==typeof this.infoAmount?this.infoAmount:this.totalAmount-this.amount}get _info(){return this.showInfo?s`
          <div class="current-amount" style="max-width: ${this._percentage}%">
            <div class="amount-label">${this.t(this.amountLabel)}:</div>
            <bbva-amount
              disabled-tabindex
              class="amount"
              data-tag-name="bbva-amount"
              variant="m"
              .language="${this.language}"
              .localCurrency="${this.localCurrency}"
              .amount="${this._infoAmount}"
              .currencyCode="${this.infoAmountCurrencyCode||this.currencyCode}"
              ?decimals-hidden="${this.infoAmountDecimalsHidden}"
            >
            </bbva-amount>
          </div>
        `:s``}get _progressBarColor(){return this.progressBarColor?this.progressBarColor:this.category?null===(t=C[this.category])||void 0===t?void 0:t.color:this._defaultProgressBarColor;var t}render(){return this.loading?s`<div class="skeleton"></div>`:s`
          <div
            class="container ${P({category:this.category})}"
            @click="${t=>this._goLink(t)}"
            @keydown=${t=>13===t.keyCode&&this._goLink(t)}
          >
            <slot></slot>

            <div class="header">
              <div class="heading">${this._heading}</div>
              <bbva-amount
                data-tag-name="bbva-amount"
                variant="xl"
                class="total-amount"
                .language="${this.language}"
                .localCurrency="${this.localCurrency}"
                .amount="${this.totalAmount}"
                .currencyCode="${this.currencyCode}"
              >
              </bbva-amount>
            </div>

            <div class="progress-bar" tabindex="0">
              <bbva-data-visualization-bar
                .accessibilityText="${this.progressBarAccessibilityText}"
                .markValue="${this.markValue}"
                .maxValue="${this._hasCustomPercentage?100:this.totalAmount}"
                .currentValue="${this._hasCustomPercentage?this.customPercentage:this.amount}"
                fill-color="${L(this._progressBarColor)}"
              >
              </bbva-data-visualization-bar>
            </div>

            ${this._info}
          </div>
          <bbva-divider size="${this.dividerSize}"></bbva-divider>
        `}_goLink(t){this.actionable&&"BBVA-ICON"!==t.target.tagName&&this.dispatchEvent(new CustomEvent("list-budget-link-click",{bubbles:!0,composed:!0,detail:{amount:this.amount,totalAmount:this.totalAmount}}))}_actionClick(){this.dispatchEvent(new CustomEvent("list-budget-icon-click",{detail:!0,bubbles:!0,composed:!0}))}}var K={...z,...A,...B,...j,bbvaListBudget:`\n        --bbva-list-budget-dark-mode-color: ${c("colors.secondary300")};\n        --bbva-list-budget-text-dark-mode-color: ${c("colors.primaryCoreLightened")};\n        --bbva-list-budget-action-icon-dark-mode-color: ${c("colors.primarySubdued")};\n        --bbva-list-budget-active-bg-dark-mode-color: ${c("colors.cool60")};\n        --bbva-list-budget-skeleton-dark-mode-color: ${c("colors.cool50")};\n        --bbva-list-budget-skeleton-bg-dark-mode-color: transparent;\n        --bbva-list-budget-active-action-icon-dark-mode-color: ${c("colors.primaryMediumLight")};\n        --bbva-list-budget-link-color: ${c("colors.primarySubdued")};\n        --bbva-list-budget-active-link-color: ${c("colors.primaryMediumLight")};\n        --bbva-list-budget-dark-mode-skeleton-animated-layer-bg: ${c("colors.cool90")};\n        --bbva-list-budget-dark-mode-bar-mark-color: ${c("colors.cool100")};\n        --bbva-list-budget-dark-mode-bar-mark-middle-color: ${c("colors.cool100")};\n    `};export{G as B,K as a,J as b};
