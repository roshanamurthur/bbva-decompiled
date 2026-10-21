import{z as a,a8 as t,ar as e,a9 as r,aa as o,b1 as i,aS as l,a as n,aJ as s,L as p,ak as d,h as c,i as g,av as b,ag as v,aw as u,j as m,f as x,g as h}from"./952f98a9.js";const k=new e;var y=a`:host {
  --_bg-color: var(--bbva-data-visualization-tooltip-dark-mode-bg-color, var(--bbva-data-visualization-tooltip-bg-color, var(--colorsSecondary200, ${t(r.secondary200)})));
  --_left-position: var(--bbva-data-visualization-tooltip-left-position, 50%);
  --_content-color: var(--bbva-data-visualization-tooltip-dark-mode-content-color, var(--bbva-data-visualization-tooltip-content-color, var(--colorsSecondary600, ${t(r.secondary600)})));
  --_list-simple-color: var(--bbva-data-visualization-tooltip-dark-mode-list-simple-color, var(--bbva-data-visualization-tooltip-list-simple-color, var(--colorsSecondary600, ${t(r.secondary600)})));
  --_bar-legend-color: var(--colorsPrimaryVariant, ${t(r.primaryVariant)});
  --_font-weight: var(--bbva-data-visualization-tooltip-dark-mode-font-weight, 500);
  --_skeleton-quote-color: var(--bbva-data-visualization-tooltip-dark-mode-skeleton-quote-color, var(--bbva-data-visualization-tooltip-skeleton-quote-color, var(--colorsPrimaryCoreLightened, ${t(r.primaryCoreLightened)})));
  --_skeleton-quote-bg: var(--bbva-data-visualization-tooltip-dark-mode-skeleton-quote-bg, var(--bbva-data-visualization-tooltip-skeleton-quote-bg, var(--colorsSecondary200, ${t(r.secondary200)})));
  --_skeleton-animated-layer-bg: var(--bbva-data-visualization-tooltip-dark-mode-skeleton-animated-layer-bg, var(--bbva-data-visualization-tooltip-skeleton-animated-layer-bg, var(--colorsSecondary200, ${t(r.secondary200)})));
  display: block;
  box-sizing: border-box;
  background-color: var(--_bg-color);
  position: relative;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(o.spacer)}))) / 16) * 1rem) 0;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(o.spacer)}))) / 16) * 1rem);
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.arrow-wrapper {
  position: absolute;
  top: -0.5rem;
  height: 0.5rem;
  width: 100%;
  left: 0;
  right: 0;
}
.arrow-wrapper .arrow {
  display: block;
  width: 1.25rem;
  height: 0.5rem;
  position: absolute;
  clip-path: polygon(50% 0%, 0% 100%, 100% 100%);
  background-color: var(--_bg-color);
  top: 0;
  left: calc(var(--_left-position) - 10px);
}

.content-wrapper {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(o.spacer)}))) / 16) * 1em) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(o.spacer)}))) / 16) * 1em);
  position: relative;
}
.content-wrapper .label-content {
  display: flex;
  flex-direction: column;
  overflow: hidden;
}
.content-wrapper .label-content.no-description {
  flex: 1 1 0%;
}
.content-wrapper .label-wrapper {
  display: flex;
  justify-content: space-between;
  flex: 1;
  overflow: hidden;
}
.content-wrapper .label {
  padding-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(o.spacer)}))) / 16) * 1rem);
  overflow: hidden;
}
.content-wrapper .amount {
  display: block;
}
.content-wrapper .description {
  overflow: hidden;
  margin-left: auto;
}

.bar-legend {
  display: flex;
  align-items: center;
  flex: none;
  height: 1.5rem;
  width: 1rem;
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(o.spacer)}))) / 16) * 1rem);
}
.bar-legend span {
  width: calc(1rem - 5px);
  height: 0.625rem;
  background-color: var(--_bar-legend-color);
  transform-origin: left bottom;
  transform: skewX(-26deg);
}

:host([arrow-positon=left]) .arrow-wrapper .arrow {
  clip-path: polygon(0% 0%, 0% 100%, 50% 100%);
  left: 0;
}

:host([arrow-positon=right]) .arrow-wrapper .arrow {
  clip-path: polygon(100% 0%, 50% 100%, 100% 100%);
  right: 0;
  left: auto;
}

:host([loading]) {
  position: relative;
  pointer-events: none;
  background-repeat: no-repeat;
  opacity: 1;
  height: 16.25rem;
  background-image: linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_skeleton-quote-color) 50%, transparent 50%), linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_skeleton-quote-color) 50%, transparent 50%), linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_skeleton-quote-color) 50%, transparent 50%), linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_skeleton-quote-color) 50%, transparent 50%), linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_skeleton-quote-color) 50%, transparent 50%);
  background-color: var(--_skeleton-quote-bg);
  background-size: 16px 14px, calc((47% * 2) + (14px/ 2)) 14px, calc((20% * 2) + (14px/ 2)) 14px, 16px 14px, calc((47% * 2) + (14px/ 2)) 14px, calc((20% * 2) + (14px/ 2)) 14px, 16px 14px, calc((47% * 2) + ( 14px/ 2))  14px, calc((20% * 2) + (14px/ 2)) 14px, 16px 14px, calc((47% * 2) + (14px/ 2)) 14px, calc((20% * 2) + (14px/ 2)) 14px, 16px 14px, calc((47% * 2) + (14px/ 2)) 14px, calc((20% * 2) + (14px/ 2)) 14px, calc((30% * 2) + (14px/ 2)) 14px, calc((35% * 2) + (14px/ 2)) 14px, calc((30% * 2) + ( 14px/ 2))  14px, calc((35% * 2) + (14px/ 2)) 14px, calc((30% * 2) + ( 14px/ 2))  14px, calc((35% * 2) + (14px/ 2)) 14px, calc((30% * 2) + ( 14px/ 2))  14px, calc((35% * 2) + (14px/ 2)) 14px, calc((30% * 2) + ( 14px/ 2))  14px, calc((35% * 2) + (14px/ 2)) 14px;
  background-position: 16px 14px, 40px 14px, calc(100%  + -16px) 14px, 16px 38px, 40px 38px, calc(100%  + -16px) 38px, 16px 62px, 40px 62px, calc(100%  + -16px) 62px, 16px 86px, 40px 86px, calc(100%  + -16px) 86px, 16px 110px, 40px 110px, calc(100%  + -16px) 110px, 16px 136px, calc(100%  + -16px) 136px, 16px 160px, calc(100%  + -16px) 160px, 16px 184px, calc(100%  + -16px) 184px, 16px 208px, calc(100%  + -16px) 208px, 16px 232px, calc(100%  + -16px) 232px;
}

.skeleton-parent {
  position: absolute;
  overflow-x: hidden;
  right: 1%;
  left: 1%;
}

.skeleton-child {
  overflow: hidden;
  contain: strict;
  left: 0;
  top: 0;
  right: 0;
  bottom: 0;
  height: 15.625rem;
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
${k.mediaRules()}`,w=a`[ambient^=dark] {
  --bbva-data-visualization-tooltip-bg-color: var(--colorsPrimaryCoreDark, ${t(r.primaryCoreDark)});
  --bbva-data-visualization-tooltip-skeleton-quote-color: var(--colorsPrimaryCoreDarkened, ${t(r.primaryCoreDarkened)});
  --bbva-data-visualization-tooltip-skeleton-quote-bg: var(--colorsPrimaryCoreDark, ${t(r.primaryCoreDark)});
  --bbva-data-visualization-tooltip-skeleton-animated-layer-bg: var(--colorsPrimaryCoreDark, ${t(r.primaryCoreDark)});
}
`,$=a`[ambient^=light] {
  --bbva-data-visualization-tooltip-bg-color: initial;
  --bbva-data-visualization-tooltip-skeleton-quote-color: initial;
  --bbva-data-visualization-tooltip-skeleton-quote-bg: initial;
  --bbva-data-visualization-tooltip-skeleton-animated-layer-bg: initial;
}
`;const _={dark:a`
    ${i.dark}
    ${w}
  `,light:a`
    ${i.dark}
    ${$}
  `};class f extends(l(n(s(p)))){static get is(){return"bbva-data-visualization-tooltip"}static get scopedElements(){const a=[v,u];return f.scopedElementsFromClasses(a)}static get properties(){return{listLegendItems:{type:Array,attribute:"list-legend-items"},listSimpleItems:{type:Array,attribute:"list-simple-items"},arrowPosition:{type:String,attribute:"arrow-position",reflect:!0},arrowPositionValue:{type:Number,attribute:"arrow-position-value",reflect:!0},listLegendSize:{type:Number,attribute:"list-legend-size"},listSimpleSize:{type:Number,attribute:"list-simple-size"},loading:{type:Boolean,reflect:!0}}}constructor(){super(),this.listLegendItems=[],this.listSimpleItems=[],this.arrowPosition="",this.listLegendSize=5,this.listSimpleSize=5,this.loading=!1,this.disabledTabindex=!0}static get styles(){return[super.styles,y,_.dark,_.light,d("bbva-data-visualization-tooltip-shared-styles")]}static _text(a,t,e,r,o=!1){return c`
      <bbva-text
        class="${a}"
        ?ellipsis="${e}"
        lines="1"
        unset
        size="S"
        alignment="${t}"
        text="${g(r)}"
        font-weight="${o?500:""}"
      ></bbva-text>
    `}static _amount(a,t){const{decimalsHidden:e,amount:r,amountSize:o,localCurrency:i,currencyCode:l,language:n}=t;return c`
      <bbva-amount
        disabled-tabindex
        ?decimals-hidden="${g(e)}"
        class="${"legend"===a?"amount":""}"
        .variant="${g(o)||"legend"===g(a)?"S":"M"}"
        amount="${g(r)}"
        .localCurrency="${g(i)}"
        .currencyCode="${g(l)}"
        .language="${g(n)}"
      >
      </bbva-amount>
    `}static _listLegend(a){return c`
      <div
        class="content-wrapper"
        data-id="list-legend"
        aria-disabled="${g(this.disabled?"true":void 0)}"
        tabindex="${g(this.disabled?void 0:"0")}"
      >
        <div class="label-wrapper">
          <span class="${b({"bar-legend":!0})}">
            <span
              style=${g(a.barLegendColor&&`background-color:${a.barLegendColor}`)}
            ></span>
          </span>
          <div class="label-content ${!a.description&&"no-description"}">
            ${this._text("label","left",a.labelEllipsis,a.label,a.mediumLabel)}
          </div>
          ${a.description?this._text("description","right",a.descriptionEllipsis,a.description):this._amount("legend",a)}
        </div>
      </div>
    `}static _listSimple(a){return c`
      <div class="content-wrapper" data-id="list-simple">
        <div class="label-wrapper">
          <div class="label-content ${!a.description&&"no-description"}">
            ${this._text("label","left",a.labelEllipsis,a.label,a.mediumLabel)}
          </div>
          ${a.description?this._text("description","right",a.descriptionEllipsis,a.description):this._amount("simple",a)}
        </div>
      </div>
    `}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.disabledTabindex=!0}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.disabledTabindex=!1}updated(a){super.updated&&super.updated(a),this.arrowPositionValue>0&&this.arrowPositionValue<3?this.setAttribute("arrow-positon","left"):this.arrowPositionValue>97&&this.arrowPositionValue<=100&&this.setAttribute("arrow-positon","right"),this.arrowPositionValue&&this._arrowSelector.setAttribute("style",`left: ${this._arrowPositionStyle(this._arrowWidth)}`)}get filteredListLegend(){return this.listLegendItems.slice(0,this.listLegendSize)}get filteredListSimple(){return this.listSimpleItems.slice(0,this.listSimpleSize)}get _arrowSelector(){return this.shadowRoot.querySelector(".arrow")}get _arrowWidth(){return this._arrowSelector.offsetWidth}_arrowPositionStyle(a){return this.arrowPositionValue>=3&&this.arrowPositionValue<=97&&`calc((${this.arrowPositionValue} * 1%) - ((${a} / 2) * 1px)`||""}render(){return c`
      <div class="arrow-wrapper">
        <span class="arrow"></span>
      </div>
      ${this.loading?c`
            <div class="skeleton-parent">
              <div class="skeleton-child"></div>
            </div>
          `:c` <div>
            ${this.listLegendItems.length?c`
                  ${this.filteredListLegend.map((a=>c` ${f._listLegend(a)} `))}
                `:""}
            ${this.listSimpleItems.length?c`
                  ${this.filteredListSimple.map((a=>c` ${f._listSimple(a)} `))}
                `:""}
          </div>`}
    `}}var z={...m,...x,bbvaDataVisualizationTooltip:`\n  --bbva-data-visualization-tooltip-dark-mode-font-weight: 100;\n  --bbva-data-visualization-tooltip-dark-mode-content-color: ${h("colors.secondary200")};\n  --bbva-data-visualization-tooltip-dark-mode-list-simple-color: ${h("colors.primaryCoreLightened")};\n  --bbva-data-visualization-tooltip-dark-mode-bg-color: ${h("colors.cool70")};\n  --bbva-data-visualization-tooltip-dark-mode-skeleton-quote-color: ${h("colors.cool50")};  \n  --bbva-data-visualization-tooltip-dark-mode-skeleton-quote-bg:${h("colors.cool70")};  \n  --bbva-data-visualization-tooltip-dark-mode-skeleton-animated-layer-bg:${h("colors.cool70")}; \n  `};export{f as B,z as b};
